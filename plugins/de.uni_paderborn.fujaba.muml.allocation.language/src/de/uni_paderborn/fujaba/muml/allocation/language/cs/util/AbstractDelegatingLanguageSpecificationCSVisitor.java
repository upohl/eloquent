/**
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: de.uni_paderborn.fujaba.muml.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Do not edit it.
 */
package	de.uni_paderborn.fujaba.muml.allocation.language.cs.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractDelegatingLanguageSpecificationCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingLanguageSpecificationCSVisitor<R, C, D extends LanguageSpecificationCSVisitor<R>>
	extends org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.util.AbstractDelegatingEssentialOCLCSVisitor<R, C, D>
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
	public @Nullable R visitMeasureFunction(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunction object) {
		return delegate.visitMeasureFunction(object);
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
	public @Nullable R visitValueTupleDescriptor(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptor object) {
		return delegate.visitValueTupleDescriptor(object);
	}
}
