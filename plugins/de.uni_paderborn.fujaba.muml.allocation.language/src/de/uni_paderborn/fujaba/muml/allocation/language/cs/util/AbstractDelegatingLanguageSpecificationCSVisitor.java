/**
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: de.uni_paderborn.fujaba.muml.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	de.uni_paderborn.fujaba.muml.allocation.language.cs.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractDelegatingLanguageSpecificationCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingLanguageSpecificationCSVisitor<R, C, D extends LanguageSpecificationCSVisitor<R>>
	extends org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.util.AbstractDelegatingCompleteOCLCSVisitor<R, C, D>
	implements LanguageSpecificationCSVisitor<R>
{
	protected AbstractDelegatingLanguageSpecificationCSVisitor(@NonNull D delegate, @NonNull C context) {
		super(delegate, context);
	}

	@Override
	public @Nullable R visiting(@NonNull org.eclipse.ocl.examples.xtext.base.basecs.util.VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public @Nullable R visitComponentResourceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS object) {
		return delegate.visitComponentResourceTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS object) {
		return delegate.visitConstraintCS(object);
	}

	@Override
	public @Nullable R visitEvaluatableElementCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS object) {
		return delegate.visitEvaluatableElementCS(object);
	}

	@Override
	public @Nullable R visitInstanceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS object) {
		return delegate.visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitLocationConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS object) {
		return delegate.visitLocationConstraintCS(object);
	}

	@Override
	public @Nullable R visitLocationTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS object) {
		return delegate.visitLocationTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitMeasureFunctionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS object) {
		return delegate.visitMeasureFunctionCS(object);
	}

	@Override
	public @Nullable R visitQoSDimensionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS object) {
		return delegate.visitQoSDimensionCS(object);
	}

	@Override
	public @Nullable R visitRequiredHardwareResourceInstanceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS object) {
		return delegate.visitRequiredHardwareResourceInstanceConstraintCS(object);
	}

	@Override
	public @Nullable R visitResourceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS object) {
		return delegate.visitResourceConstraintCS(object);
	}

	@Override
	public @Nullable R visitServiceCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS object) {
		return delegate.visitServiceCS(object);
	}

	@Override
	public @Nullable R visitSpecificationCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS object) {
		return delegate.visitSpecificationCS(object);
	}

	@Override
	public @Nullable R visitTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS object) {
		return delegate.visitTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitValueTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS object) {
		return delegate.visitValueTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitWeightingComponentResourceTupleElementCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS object) {
		return delegate.visitWeightingComponentResourceTupleElementCS(object);
	}
}
