package de.uni_paderborn.fujaba.muml.allocation.language.resource;

import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2Pivot;
import de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.resource.ASResource;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;

@SuppressWarnings("all")
public class SpecificationCSResource extends EssentialOCLCSResource {
  private final static EClass contextClass = OclcontextPackage.Literals.OCL_CONTEXT;
  
  @NonNull
  public CS2Pivot createCS2Pivot(@NonNull final Map<? extends Resource, ? extends ASResource> cs2asResourceMap, @NonNull final MetaModelManager metaModelManager) {
    return new SpecificationCS2Pivot(cs2asResourceMap, metaModelManager, SpecificationCSResource.contextClass);
  }
  
  @NonNull
  public MetaModelManager createMetaModelManager() {
    MetaModelManager _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = super.createMetaModelManager();
      TypesUtil.getType(metaModelManager, SpecificationCSResource.contextClass);
      _xblockexpression = metaModelManager;
    }
    return _xblockexpression;
  }
}
