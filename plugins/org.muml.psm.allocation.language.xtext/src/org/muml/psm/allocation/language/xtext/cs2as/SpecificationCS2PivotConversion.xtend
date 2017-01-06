package org.muml.psm.allocation.language.xtext.cs2as

import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.pivot.ExpressionInOCL
import org.eclipse.ocl.pivot.utilities.PivotConstants
import org.eclipse.ocl.xtext.base.cs2as.CS2AS
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer
import org.muml.psm.allocation.language.^as.Specification

class SpecificationCS2PivotConversion extends CS2ASConversion {
	
	new(CS2AS converter, IDiagnosticConsumer diagnosticsConsumer) {
		super(converter, diagnosticsConsumer)
	}
			
	override public void refreshContextVariable(/*@NonNull*/ ExpressionInOCL pivotSpecification) {
		var Specification specification
		if (pivotSpecification.eContainer != null
			&& pivotSpecification.eContainer.eContainer != null
		) {
			val EObject container = pivotSpecification.eContainer.eContainer
			if (container instanceof Specification) {
				specification = container as Specification
			} else if (container != null
				&& container.eContainer instanceof Specification
			) {
				specification = container.eContainer as Specification
			}
		}
		if (specification != null) {
			// set the context variable
			setContextVariable(pivotSpecification, PivotConstants.SELF_NAME,
				specification.oclContext.type, null
			)
		} else {
			super.refreshContextVariable(pivotSpecification)
		}
	}
}