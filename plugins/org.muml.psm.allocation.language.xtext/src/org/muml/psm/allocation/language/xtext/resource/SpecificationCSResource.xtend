package org.muml.psm.allocation.language.xtext.resource

import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.internal.core.JavaProject
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.resource.ASResource
import org.eclipse.ocl.xtext.base.cs2as.CS2AS
import org.eclipse.ocl.xtext.base.scoping.AbstractJavaClassScope
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource
import org.eclipse.ocl.xtext.oclstdlib.scoping.JavaClassScope
import org.eclipse.ocl.xtext.oclstdlibcs.JavaClassCS
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2Pivot
import org.osgi.framework.Bundle

class SpecificationCSResource extends CompleteOCLCSResource {
	
	protected Resource javaClassResource = new ResourceImpl()
	
	/*@NonNull*/ override CS2AS createCS2AS(/*@NonNull*/ EnvironmentFactoryInternal environmentFactory,
		/*@NonNull*/ ASResource asResource) {
		new SpecificationCS2Pivot(environmentFactory, this, asResource)
	}
	
	public override CS2AS getCS2AS() {
		val CS2AS cs2as = super.getCS2AS()
		val AbstractJavaClassScope classScope = AbstractJavaClassScope.findAdapter(this)
		val URI uri = getURI()
		if (classScope == null && uri != null) {
			var ClassLoader classLoader = null 
			if (uri.isPlatformResource) {
				val IJavaProject javaProject = getJavaProject(uri.segment(1))
				if (javaProject != null) {
					classLoader = new JavaProjectClassLoader(javaProject,
						this.class.classLoader
					)
					//println("javaProject found: " + javaProject.project.name)
				}
			} else if (uri.isPlatformPlugin) {
				val Bundle bundle = Platform.getBundle(uri.segment(1))
				if (bundle != null) {
					classLoader = new BundleClassLoader(bundle)
					//println("bundle found: " + bundle.symbolicName)
				}
			}
			if (classLoader != null) {
				JavaClassScope.getAdapter(this, classLoader)
				cs2as.getMetamodelManager().addClassLoader(classLoader)	
			}
		}
		cs2as
	}
	
	protected def IJavaProject getJavaProject(String name) {
		val IProject project = ResourcesPlugin.workspace.root.projects.findFirst[project |
			project.name.equals(name)
		]
		if (project != null && JavaProject.hasJavaNature(project)) {
			return JavaCore.create(project)
		}
		null
	}
	
	protected override void doLinking() {
		// fixup the resource for all JavaClassCS instances: at the end of the
		// CS2AS conversion all JavaClassCS instances are moved into this
		// resource (via JavaClassScope.installContents). A subsequent CS2AS.update,
		// which calls CS2ASConversion.update, will fail because during the
		// containment visitor run a CCE is thrown (this is expected, because
		// the JavaClassCS belongs to the oclstdlib metamodel, which has a different
		// concrete visitor type (OCLstdlibCSVisitor) (which is, of course, not a
		// a supertype of LanguageSpecificationCSContainmentVisitor)). However,
		// we don't need a visitor run for JavaClassCS instances => move them
		// into a separate resource.
		// Note: the JavaClassCS instances should be contained in a resource,
		// because otherwise a potential validation would fail ("dangling reference").
		javaClassResource.contents.clear
		for (var int i = getContents.size - 1; i >= 0; i--) {
			val EObject object = getContents.get(i)
			if (object instanceof JavaClassCS) {
				// this directly removes the object from this resource
				javaClassResource.contents.add(object)
			}
		}		
		super.doLinking()
	}

}