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
	public R visitComponentResourceTupleDescriptorCS(org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS object) {
		return visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public R visitConstraintCS(org.muml.psm.allocation.language.cs.ConstraintCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.EvaluatableElementCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitInstanceTupleDescriptorCS(org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}

	@Override
	public R visitLocationConstraintCS(org.muml.psm.allocation.language.cs.LocationConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitLocationTupleDescriptorCS(org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS object) {
		return visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public R visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.MeasureFunctionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitQoSDimensionCS(org.muml.psm.allocation.language.cs.QoSDimensionCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitResourceConstraintCS(org.muml.psm.allocation.language.cs.ResourceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitServiceCS(org.muml.psm.allocation.language.cs.ServiceCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitSpecificationCS(org.muml.psm.allocation.language.cs.SpecificationCS object) {
		return visitCompleteOCLDocumentCS(object);
	}

	@Override
	public R visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.TupleDescriptorCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitValueTupleDescriptorCS(org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}

	@Override
	public R visitWeightingComponentResourceTupleElementCS(org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS object) {
		return visitModelElementCS(object);
	}
}
