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
	public R visitBoundWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull BoundWeightTupleDescriptorCS object) {
		return visitWeightTupleDescriptorCS(object);
	}

	@Override
	public R visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.@NonNull EvaluatableElementCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull RequiredHardwareResourceInstanceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public R visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public R visitSpecificationCS(org.muml.psm.allocation.language.cs.@NonNull SpecificationCS object) {
		return visitCompleteOCLDocumentCS(object);
	}

	@Override
	public R visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitTypedNamedPartCS(org.muml.psm.allocation.language.cs.@NonNull TypedNamedPartCS object) {
		return visitTypedElementCS(object);
	}

	@Override
	public R visitTypedPairCS(org.muml.psm.allocation.language.cs.@NonNull TypedPairCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull WeightTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}
}
