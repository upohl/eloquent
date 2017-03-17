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
 * An AbstractDelegatingLanguageSpecificationCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingLanguageSpecificationCSVisitor<R, C, @NonNull D extends LanguageSpecificationCSVisitor<R>>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractDelegatingCompleteOCLCSVisitor<R, C, D>
	implements LanguageSpecificationCSVisitor<R>
{
	protected AbstractDelegatingLanguageSpecificationCSVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visiting(org.eclipse.ocl.xtext.basecs.util.@NonNull VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitBoundCS(org.muml.psm.allocation.language.cs.@NonNull BoundCS object) {
		return delegate.visitBoundCS(object);
	}

	@Override
	public R visitBoundWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull BoundWeightTupleDescriptorCS object) {
		return delegate.visitBoundWeightTupleDescriptorCS(object);
	}

	@Override
	public R visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS object) {
		return delegate.visitConstraintCS(object);
	}

	@Override
	public R visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.@NonNull EvaluatableElementCS object) {
		return delegate.visitEvaluatableElementCS(object);
	}

	@Override
	public R visitJavaImplementationProviderCS(org.muml.psm.allocation.language.cs.@NonNull JavaImplementationProviderCS object) {
		return delegate.visitJavaImplementationProviderCS(object);
	}

	@Override
	public R visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS object) {
		return delegate.visitLocationConstraintCS(object);
	}

	@Override
	public R visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS object) {
		return delegate.visitMeasureFunctionCS(object);
	}

	@Override
	public R visitOCLContextCS(org.muml.psm.allocation.language.cs.@NonNull OCLContextCS object) {
		return delegate.visitOCLContextCS(object);
	}

	@Override
	public R visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS object) {
		return delegate.visitQoSDimensionCS(object);
	}

	@Override
	public R visitRelationCS(org.muml.psm.allocation.language.cs.@NonNull RelationCS object) {
		return delegate.visitRelationCS(object);
	}

	@Override
	public R visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull RequiredHardwareResourceInstanceConstraintCS object) {
		return delegate.visitRequiredHardwareResourceInstanceConstraintCS(object);
	}

	@Override
	public R visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS object) {
		return delegate.visitResourceConstraintCS(object);
	}

	@Override
	public R visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS object) {
		return delegate.visitServiceCS(object);
	}

	@Override
	public R visitSpecificationCS(org.muml.psm.allocation.language.cs.@NonNull SpecificationCS object) {
		return delegate.visitSpecificationCS(object);
	}

	@Override
	public R visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS object) {
		return delegate.visitTupleDescriptorCS(object);
	}

	@Override
	public R visitTypedNamedPartCS(org.muml.psm.allocation.language.cs.@NonNull TypedNamedPartCS object) {
		return delegate.visitTypedNamedPartCS(object);
	}

	@Override
	public R visitTypedPairCS(org.muml.psm.allocation.language.cs.@NonNull TypedPairCS object) {
		return delegate.visitTypedPairCS(object);
	}

	@Override
	public R visitWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull WeightTupleDescriptorCS object) {
		return delegate.visitWeightTupleDescriptorCS(object);
	}
}
