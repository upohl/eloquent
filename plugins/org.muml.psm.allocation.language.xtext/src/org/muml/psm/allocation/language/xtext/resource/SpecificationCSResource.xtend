package org.muml.psm.allocation.language.xtext.resource

import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.internal.core.JavaProject
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.resource.ASResource
import org.eclipse.ocl.xtext.base.cs2as.CS2AS
import org.eclipse.ocl.xtext.base.scoping.AbstractJavaClassScope
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource
import org.eclipse.ocl.xtext.oclstdlib.scoping.JavaClassScope
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2Pivot
import org.osgi.framework.Bundle

class SpecificationCSResource extends CompleteOCLCSResource {
		
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
					classLoader = new BundleClassLoader(bundle, this.class.classLoader)
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

}