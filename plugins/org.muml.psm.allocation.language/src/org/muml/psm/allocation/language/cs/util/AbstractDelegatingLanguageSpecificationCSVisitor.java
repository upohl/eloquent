/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: de.uni_paderborn.fujaba.muml.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.muml.psm.allocation.language.cs.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractDelegatingLanguageSpecificationCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingLanguageSpecificationCSVisitor<R, C, D extends LanguageSpecificationCSVisitor<R>>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractDelegatingCompleteOCLCSVisitor<R, C, D>
	implements LanguageSpecificationCSVisitor<R>
{
	protected AbstractDelegatingLanguageSpecificationCSVisitor(@NonNull D delegate, @NonNull C context) {
		super(delegate, context);
	}

	@Override
	public @Nullable R visiting(@NonNull org.eclipse.ocl.xtext.basecs.util.VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public @Nullable R visitComponentResourceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS object) {
		return delegate.visitComponentResourceTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ConstraintCS object) {
		return delegate.visitConstraintCS(object);
	}

	@Override
	public @Nullable R visitEvaluatableElementCS(@NonNull org.muml.psm.allocation.language.cs.EvaluatableElementCS object) {
		return delegate.visitEvaluatableElementCS(object);
	}

	@Override
	public @Nullable R visitInstanceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS object) {
		return delegate.visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitLocationConstraintCS(@NonNull org.muml.psm.allocation.language.cs.LocationConstraintCS object) {
		return delegate.visitLocationConstraintCS(object);
	}

	@Override
	public @Nullable R visitLocationTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS object) {
		return delegate.visitLocationTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitMeasureFunctionCS(@NonNull org.muml.psm.allocation.language.cs.MeasureFunctionCS object) {
		return delegate.visitMeasureFunctionCS(object);
	}

	@Override
	public @Nullable R visitQoSDimensionCS(@NonNull org.muml.psm.allocation.language.cs.QoSDimensionCS object) {
		return delegate.visitQoSDimensionCS(object);
	}

	@Override
	public @Nullable R visitRequiredHardwareResourceInstanceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS object) {
		return delegate.visitRequiredHardwareResourceInstanceConstraintCS(object);
	}

	@Override
	public @Nullable R visitResourceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ResourceConstraintCS object) {
		return delegate.visitResourceConstraintCS(object);
	}

	@Override
	public @Nullable R visitServiceCS(@NonNull org.muml.psm.allocation.language.cs.ServiceCS object) {
		return delegate.visitServiceCS(object);
	}

	@Override
	public @Nullable R visitSpecificationCS(@NonNull org.muml.psm.allocation.language.cs.SpecificationCS object) {
		return delegate.visitSpecificationCS(object);
	}

	@Override
	public @Nullable R visitTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.TupleDescriptorCS object) {
		return delegate.visitTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitValueTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS object) {
		return delegate.visitValueTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitWeightingComponentResourceTupleElementCS(@NonNull org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS object) {
		return delegate.visitWeightingComponentResourceTupleElementCS(object);
	}
}
