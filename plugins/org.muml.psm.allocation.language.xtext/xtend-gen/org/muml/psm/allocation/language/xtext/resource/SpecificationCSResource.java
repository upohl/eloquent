package org.muml.psm.allocation.language.xtext.resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;
import org.muml.psm.allocation.language.oclcontext.OclcontextPackage;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2Pivot;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;

@SuppressWarnings("all")
public class SpecificationCSResource extends CompleteOCLCSResource {
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
}
