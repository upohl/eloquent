package de.uni_paderborn.fujaba.muml.allocation.language.resource

import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2Pivot
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager
import org.eclipse.ocl.examples.pivot.resource.ASResource
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource
import de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage

class SpecificationCSResource extends EssentialOCLCSResource {
	
	private static final EClass contextClass = OclcontextPackage.Literals.OCL_CONTEXT
	
	@NonNull override CS2Pivot createCS2Pivot(@NonNull Map<? extends /*BaseCS*/Resource, ? extends ASResource> cs2asResourceMap,
		@NonNull MetaModelManager metaModelManager) {
		new SpecificationCS2Pivot(cs2asResourceMap, metaModelManager, contextClass)
	}
	
	@NonNull
	override MetaModelManager createMetaModelManager() {
		// hrm should we postpone the context setup? (NO, that's the ideal point)
		val MetaModelManager metaModelManager = super.createMetaModelManager()
		// make our contextClass known to the metaModelManager
		TypesUtil.getType(metaModelManager, contextClass)
		metaModelManager
	}

}