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
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSContainmentVisitor;

/**
 * An AbstractCsContainmentVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractCsContainmentVisitor
	extends CompleteOCLCSContainmentVisitor
	implements LanguageSpecificationCSVisitor<Continuation<?>>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractCsContainmentVisitor(@NonNull CS2ASConversion context) {
		super(context);
	}

	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull ComponentResourceTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.@NonNull EvaluatableElementCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull InstanceTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull LocationTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull RequiredHardwareResourceInstanceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitSpecificationCS(org.muml.psm.allocation.language.cs.@NonNull SpecificationCS csElement) {
		return visitCompleteOCLDocumentCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull ValueTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitWeightingComponentResourceTupleElementCS(org.muml.psm.allocation.language.cs.@NonNull WeightingComponentResourceTupleElementCS csElement) {
		return visitModelElementCS(csElement);
	}
}
