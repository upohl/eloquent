package org.muml.psm.allocation.language.xtext.cs2as

import org.eclipse.emf.ecore.EClass
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.pivot.ExpressionInOCL
import org.eclipse.ocl.pivot.Type
import org.eclipse.ocl.pivot.utilities.PivotConstants
import org.eclipse.ocl.xtext.base.cs2as.CS2AS
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer
import org.muml.psm.allocation.language.^as.EvaluatableElement
import org.muml.psm.allocation.language.xtext.typing.TypesUtil

class SpecificationCS2PivotConversion extends CS2ASConversion {
	private EClass contextClass
	
	new(CS2AS converter, IDiagnosticConsumer diagnosticsConsumer,
		EClass contextClass) {
		super(converter, diagnosticsConsumer)
		this.contextClass = contextClass
	}
			
	override public void refreshContextVariable(/*@NonNull*/ ExpressionInOCL pivotSpecification) {
		if (pivotSpecification.eContainer instanceof EvaluatableElement) {
			// set the context variable
			val Type contextType = TypesUtil.getType(environmentFactory, contextClass)
			setContextVariable(pivotSpecification, PivotConstants.SELF_NAME, contextType, null)
		} else {
			super.refreshContextVariable(pivotSpecification)
		}
	}
}