package de.uni_paderborn.fujaba.muml.allocation.language.cs2as

import de.uni_paderborn.fujaba.muml.allocation.language.^as.EvaluatableElement
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil
import java.util.Collection
import org.eclipse.emf.ecore.EClass
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.pivot.Environment
import org.eclipse.ocl.examples.pivot.ExpressionInOCL
import org.eclipse.ocl.examples.pivot.Type
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer

class SpecificationCS2PivotConversion extends CS2PivotConversion {
	private EClass contextClass
	
	new(CS2Pivot converter, IDiagnosticConsumer diagnosticsConsumer,
		Collection<? extends BaseCSResource> csResources, EClass contextClass) {
		super(converter, diagnosticsConsumer, csResources)
		this.contextClass = contextClass
	}
			
	override public void refreshContextVariable(@NonNull ExpressionInOCL pivotSpecification) {
		if (pivotSpecification.eContainer instanceof EvaluatableElement) {
			// set the context variable
			val Type contextType = TypesUtil.getType(metaModelManager, contextClass)
			setContextVariable(pivotSpecification, Environment.SELF_VARIABLE_NAME, contextType)
		} else {
			super.refreshContextVariable(pivotSpecification)
		}
	}
}