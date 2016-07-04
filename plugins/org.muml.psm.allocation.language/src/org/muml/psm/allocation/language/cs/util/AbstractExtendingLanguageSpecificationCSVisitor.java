/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.muml.psm.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.muml.psm.allocation.language.cs.util;

import org.eclipse.jdt.annotation.NonNull;
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.ConstraintCS;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.LocationConstraintCS;
import org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.MeasureFunctionCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.cs.ServiceCS;
import org.muml.psm.allocation.language.cs.SpecificationCS;
import org.muml.psm.allocation.language.cs.TupleDescriptorCS;
import org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS;

/**
 * An AbstractExtendingLanguageSpecificationCSVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingLanguageSpecificationCSVisitor<R, C>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractExtendingCompleteOCLCSVisitor<R, C>
	implements LanguageSpecificationCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingLanguageSpecificationCSVisitor(C context) {
		super(context);
	}	

	@Override
	public R visitComponentResourceTupleDescriptorCS(@NonNull ComponentResourceTupleDescriptorCS object) {
		return visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public R visitConstraintCS(@NonNull ConstraintCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitEvaluatableElementCS(@NonNull EvaluatableElementCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitInstanceTupleDescriptorCS(@NonNull InstanceTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}

	@Override
	public R visitLocationConstraintCS(@NonNull LocationConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitLocationTupleDescriptorCS(@NonNull LocationTupleDescriptorCS object) {
		return visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public R visitMeasureFunctionCS(@NonNull MeasureFunctionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitQoSDimensionCS(@NonNull QoSDimensionCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitRequiredHardwareResourceInstanceConstraintCS(@NonNull RequiredHardwareResourceInstanceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitResourceConstraintCS(@NonNull ResourceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitServiceCS(@NonNull ServiceCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitSpecificationCS(@NonNull SpecificationCS object) {
		return visitCompleteOCLDocumentCS(object);
	}

	@Override
	public R visitTupleDescriptorCS(@NonNull TupleDescriptorCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitValueTupleDescriptorCS(@NonNull ValueTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}

	@Override
	public R visitWeightingComponentResourceTupleElementCS(@NonNull WeightingComponentResourceTupleElementCS object) {
		return visitModelElementCS(object);
	}
}
