/*
* generated by Xtext
*/
package org.muml.psm.allocation.language.xtext.validation;

import java.util.List;

import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.xtext.validation.Check;
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.LocationConstraintCS;
import org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class AllocationSpecificationLanguageJavaValidator extends org.muml.psm.allocation.language.xtext.validation.AbstractAllocationSpecificationLanguageJavaValidator {
	private static final String typeMismatch = "Type mismatch: expected %s but got %s"; 

	@Check
	public void checkLocationConstraintCS(LocationConstraintCS constraintCS) {
		LocationTupleDescriptorCS tupleDescriptor = constraintCS.getTupleDescriptor();
		ContextCS oclExpression = constraintCS.getExpression();
		if (tupleDescriptor == null || oclExpression == null) {
			// in this case a different error is displayed
			return;
		}
		checkTypes(constraintCS);
	}
	
	@Check
	public void checkRequiredHardwareResourceInstanceConstraintCS(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		List<ComponentResourceTupleDescriptorCS> tupleDescriptorList = constraintCS.getTupleDescriptors();
		ContextCS oclExpression = constraintCS.getExpression();
		if (tupleDescriptorList.isEmpty() || oclExpression == null) {
			// in this case a different error is displayed
			return;
		}
		checkTypes(constraintCS);
	}
	
	@Check
	public void checkResourceConstraintCS(ResourceConstraintCS constraintCS) {
		List<ComponentResourceTupleDescriptorCS> tupleDescriptorList = constraintCS.getTupleDescriptors();
		ContextCS oclExpression = constraintCS.getExpression();
		if (tupleDescriptorList.isEmpty() || oclExpression == null
				|| constraintCS.getWeighting() == null || constraintCS.getRhs() == null) {
			// parser/ui will display an error
			return;
		}
		checkTypes(constraintCS);
	}
	
	@Check
	public void checkQoSDimensionCS(QoSDimensionCS qosDimensionCS) {
		List<ComponentResourceTupleDescriptorCS> tupleDescriptorList = qosDimensionCS.getTupleDescriptors();
		ContextCS oclExpression = qosDimensionCS.getExpression();
		if (tupleDescriptorList.isEmpty() || oclExpression == null) {
			return;
		}
		checkTypes(qosDimensionCS);
	}
	
	private void checkTypes(EvaluatableElementCS elementCS) {
		EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(elementCS);
		Type expectedType = TypesUtil.createType(elementCS);
		Type actualType = ((ExpressionInOCL) elementCS.getExpression().getPivot()).getType();
		boolean conformsTo = TypesUtil.conformsTo(envFactory, actualType, expectedType);
		if (!conformsTo) {
			error(String.format(typeMismatch, expectedType, actualType),
					CsPackage.Literals.EVALUATABLE_ELEMENT_CS__EXPRESSION);
		}
	}
}