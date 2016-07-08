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
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSPostOrderVisitor;
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
 * An AbstractCsPostOrderVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractCsPostOrderVisitor
	extends CompleteOCLCSPostOrderVisitor
	implements LanguageSpecificationCSVisitor<Continuation<?>>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractCsPostOrderVisitor(@NonNull CS2ASConversion context) {
		super(context);
	}

	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(@NonNull ComponentResourceTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitConstraintCS(@NonNull ConstraintCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitEvaluatableElementCS(@NonNull EvaluatableElementCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(@NonNull InstanceTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(@NonNull LocationConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(@NonNull LocationTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(@NonNull MeasureFunctionCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(@NonNull QoSDimensionCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(@NonNull RequiredHardwareResourceInstanceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(@NonNull ResourceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitServiceCS(@NonNull ServiceCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitSpecificationCS(@NonNull SpecificationCS csElement) {
		return visitCompleteOCLDocumentCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(@NonNull TupleDescriptorCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(@NonNull ValueTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitWeightingComponentResourceTupleElementCS(@NonNull WeightingComponentResourceTupleElementCS csElement) {
		return visitModelElementCS(csElement);
	}
}
