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
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSPreOrderVisitor;

/**
 * An AbstractLanguageSpecificationCSPreOrderVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractLanguageSpecificationCSPreOrderVisitor
	extends CompleteOCLCSPreOrderVisitor
	implements LanguageSpecificationCSVisitor<Continuation<?>>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractLanguageSpecificationCSPreOrderVisitor(@NonNull CS2ASConversion context) {
		super(context);
	}

	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ConstraintCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitEvaluatableElementCS(@NonNull org.muml.psm.allocation.language.cs.EvaluatableElementCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(@NonNull org.muml.psm.allocation.language.cs.LocationConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(@NonNull org.muml.psm.allocation.language.cs.MeasureFunctionCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(@NonNull org.muml.psm.allocation.language.cs.QoSDimensionCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ResourceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitServiceCS(@NonNull org.muml.psm.allocation.language.cs.ServiceCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitSpecificationCS(@NonNull org.muml.psm.allocation.language.cs.SpecificationCS csElement) {
		return visitCompleteOCLDocumentCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.TupleDescriptorCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitWeightingComponentResourceTupleElementCS(@NonNull org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS csElement) {
		return visitModelElementCS(csElement);
	}
}
