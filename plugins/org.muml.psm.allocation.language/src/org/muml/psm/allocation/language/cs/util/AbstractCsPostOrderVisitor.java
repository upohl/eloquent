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
	protected AbstractCsPostOrderVisitor(CS2ASConversion context) {
		super(context);
	}

	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitConstraintCS(org.muml.psm.allocation.language.cs.ConstraintCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.EvaluatableElementCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(org.muml.psm.allocation.language.cs.LocationConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS csElement) {
		return visitInstanceTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.MeasureFunctionCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(org.muml.psm.allocation.language.cs.QoSDimensionCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(org.muml.psm.allocation.language.cs.ResourceConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitServiceCS(org.muml.psm.allocation.language.cs.ServiceCS csElement) {
		return visitNamedElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitSpecificationCS(org.muml.psm.allocation.language.cs.SpecificationCS csElement) {
		return visitCompleteOCLDocumentCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.TupleDescriptorCS csElement) {
		return visitModelElementCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS csElement) {
		return visitTupleDescriptorCS(csElement);
	}

	@Override
	public @Nullable Continuation<?> visitWeightingComponentResourceTupleElementCS(org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS csElement) {
		return visitModelElementCS(csElement);
	}
}
