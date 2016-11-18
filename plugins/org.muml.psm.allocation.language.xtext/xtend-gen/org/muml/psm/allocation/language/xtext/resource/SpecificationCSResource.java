package org.muml.psm.allocation.language.xtext.resource;

import com.google.common.base.Objects;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.base.scoping.AbstractJavaClassScope;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;
import org.eclipse.ocl.xtext.oclstdlib.scoping.JavaClassScope;
import org.eclipse.ocl.xtext.oclstdlibcs.JavaClassCS;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.muml.psm.allocation.language.oclcontext.OclcontextPackage;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2Pivot;
import org.muml.psm.allocation.language.xtext.resource.BundleClassLoader;
import org.muml.psm.allocation.language.xtext.resource.JavaProjectClassLoader;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class SpecificationCSResource extends CompleteOCLCSResource {
  protected Resource javaClassResource = new ResourceImpl();
  
  private final static EClass contextClass = OclcontextPackage.Literals.OCL_CONTEXT;
  
  /**
   * @NonNull
   */
  @Override
  public CS2AS createCS2AS(final EnvironmentFactoryInternal environmentFactory, final ASResource asResource) {
    SpecificationCS2Pivot _xblockexpression = null;
    {
      TypesUtil.getType(environmentFactory, SpecificationCSResource.contextClass);
      _xblockexpression = new SpecificationCS2Pivot(environmentFactory, this, asResource, SpecificationCSResource.contextClass);
    }
    return _xblockexpression;
  }
  
  @Override
  public CS2AS getCS2AS() {
    CS2AS _xblockexpression = null;
    {
      final CS2AS cs2as = super.getCS2AS();
      final AbstractJavaClassScope classScope = AbstractJavaClassScope.findAdapter(this);
      final URI uri = this.getURI();
      if ((Objects.equal(classScope, null) && (!Objects.equal(uri, null)))) {
        ClassLoader classLoader = null;
        boolean _isPlatformResource = uri.isPlatformResource();
        if (_isPlatformResource) {
          String _segment = uri.segment(1);
          final IJavaProject javaProject = this.getJavaProject(_segment);
          boolean _notEquals = (!Objects.equal(javaProject, null));
          if (_notEquals) {
            Class<? extends SpecificationCSResource> _class = this.getClass();
            ClassLoader _classLoader = _class.getClassLoader();
            JavaProjectClassLoader _javaProjectClassLoader = new JavaProjectClassLoader(javaProject, _classLoader);
            classLoader = _javaProjectClassLoader;
          }
        } else {
          boolean _isPlatformPlugin = uri.isPlatformPlugin();
          if (_isPlatformPlugin) {
            String _segment_1 = uri.segment(1);
            final Bundle bundle = Platform.getBundle(_segment_1);
            boolean _notEquals_1 = (!Objects.equal(bundle, null));
            if (_notEquals_1) {
              BundleClassLoader _bundleClassLoader = new BundleClassLoader(bundle);
              classLoader = _bundleClassLoader;
            }
          }
        }
        boolean _notEquals_2 = (!Objects.equal(classLoader, null));
        if (_notEquals_2) {
          JavaClassScope.getAdapter(this, classLoader);
          PivotMetamodelManager _metamodelManager = cs2as.getMetamodelManager();
          _metamodelManager.addClassLoader(classLoader);
        }
      }
      _xblockexpression = cs2as;
    }
    return _xblockexpression;
  }
  
  protected IJavaProject getJavaProject(final String name) {
    Object _xblockexpression = null;
    {
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      IProject[] _projects = _root.getProjects();
      final Function1<IProject, Boolean> _function = (IProject project) -> {
        String _name = project.getName();
        return Boolean.valueOf(_name.equals(name));
      };
      final IProject project = IterableExtensions.<IProject>findFirst(((Iterable<IProject>)Conversions.doWrapArray(_projects)), _function);
      if (((!Objects.equal(project, null)) && JavaProject.hasJavaNature(project))) {
        return JavaCore.create(project);
      }
      _xblockexpression = null;
    }
    return ((IJavaProject)_xblockexpression);
  }
  
  @Override
  protected void doLinking() {
    EList<EObject> _contents = this.javaClassResource.getContents();
    _contents.clear();
    for (int i = (this.getContents().size() - 1); (i >= 0); i--) {
      {
        EList<EObject> _contents_1 = this.getContents();
        final EObject object = _contents_1.get(i);
        if ((object instanceof JavaClassCS)) {
          EList<EObject> _contents_2 = this.javaClassResource.getContents();
          _contents_2.add(object);
        }
      }
    }
    super.doLinking();
  }
}
