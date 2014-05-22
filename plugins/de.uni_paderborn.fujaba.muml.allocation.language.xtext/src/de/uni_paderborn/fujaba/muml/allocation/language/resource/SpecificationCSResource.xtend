package de.uni_paderborn.fujaba.muml.allocation.language.resource

import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2Pivot
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager
import org.eclipse.ocl.examples.pivot.resource.ASResource
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource

class SpecificationCSResource extends EssentialOCLCSResource {
	
	@NonNull override CS2Pivot createCS2Pivot(@NonNull Map<? extends /*BaseCS*/Resource, ? extends ASResource> cs2asResourceMap,
		@NonNull MetaModelManager metaModelManager) {
		// SpecificationCS2Pivot provides our own visitors
		new SpecificationCS2Pivot(cs2asResourceMap, metaModelManager)
	}

}