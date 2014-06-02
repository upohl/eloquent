package de.uni_paderborn.fujaba.muml.allocation.language.resource

import de.uni_paderborn.fujaba.muml.allocation.language.context.ContextPackage
import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2Pivot
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.domain.elements.DomainType
import org.eclipse.ocl.examples.pivot.Type
import org.eclipse.ocl.examples.pivot.context.ClassContext
import org.eclipse.ocl.examples.pivot.context.ParserContext
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager
import org.eclipse.ocl.examples.pivot.manager.PivotIdResolver
import org.eclipse.ocl.examples.pivot.resource.ASResource
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource

class SpecificationCSResource extends EssentialOCLCSResource {
	
	private static final EClass contextClass = ContextPackage.Literals.OCL_CONTEXT
	
	@NonNull override CS2Pivot createCS2Pivot(@NonNull Map<? extends /*BaseCS*/Resource, ? extends ASResource> cs2asResourceMap,
		@NonNull MetaModelManager metaModelManager) {
		// SpecificationCS2Pivot provides our own visitors
		new SpecificationCS2Pivot(cs2asResourceMap, metaModelManager)
	}
	
	@NonNull
	override MetaModelManager createMetaModelManager() {
		// hrm should we postpone the context setup?
		val MetaModelManager metaModelManager = super.createMetaModelManager()
		val PivotIdResolver idResolver = metaModelManager.getIdResolver()
		val DomainType staticType = idResolver.getType(contextClass)
		val Type contextType = metaModelManager.getType(staticType)
		val ParserContext parserContext = new ClassContext(metaModelManager, null, contextType)
		setParserContext(parserContext)
		metaModelManager
	}

}