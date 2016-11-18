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
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSLeft2RightVisitor;

/**
 * An AbstractCsLeft2RightVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractCsLeft2RightVisitor
	extends CompleteOCLCSLeft2RightVisitor
	implements LanguageSpecificationCSVisitor<Element>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractCsLeft2RightVisitor(@NonNull CS2ASConversion context) {
		super(context);
	}

	@Override
	public @Nullable Element visitBoundWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull BoundWeightTupleDescriptorCS csElement) {
		return visitWeightTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Element visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Element visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.@NonNull EvaluatableElementCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Element visitJavaImplementationProviderCS(org.muml.psm.allocation.language.cs.@NonNull JavaImplementationProviderCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Element visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Element visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Element visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Element visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull RequiredHardwareResourceInstanceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Element visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Element visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Element visitSpecificationCS(org.muml.psm.allocation.language.cs.@NonNull SpecificationCS csElement) {
		return visitCompleteOCLDocumentCS(csElement);
	}

	@Override
	public @Nullable Element visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Element visitTypedNamedPartCS(org.muml.psm.allocation.language.cs.@NonNull TypedNamedPartCS csElement) {
		return visitTypedElementCS(csElement);
	}

	@Override
	public @Nullable Element visitTypedPairCS(org.muml.psm.allocation.language.cs.@NonNull TypedPairCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Element visitWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull WeightTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}
}
