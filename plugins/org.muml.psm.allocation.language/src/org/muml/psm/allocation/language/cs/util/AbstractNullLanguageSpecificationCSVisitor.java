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

/**
 * An AbstractNullLanguageSpecificationCSVisitor provides a default implementation for each
 * visitXxx method that returns null.
 *
 * @deprecated Explicit 'Null' functionality is obsolete with Java 8 @Nullable annotations.  
 */
 @Deprecated
public abstract class AbstractNullLanguageSpecificationCSVisitor<@Nullable R, C>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractNullCompleteOCLCSVisitor<R, C> implements LanguageSpecificationCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractNullLanguageSpecificationCSVisitor(C context) {
		super(context);
	}	

	@Override
	public R visitComponentResourceTupleDescriptorCS(org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS object) {
		return null;
	}

	@Override
	public R visitConstraintCS(org.muml.psm.allocation.language.cs.ConstraintCS object) {
		return null;
	}

	@Override
	public R visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.EvaluatableElementCS object) {
		return null;
	}

	@Override
	public R visitInstanceTupleDescriptorCS(org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS object) {
		return null;
	}

	@Override
	public R visitLocationConstraintCS(org.muml.psm.allocation.language.cs.LocationConstraintCS object) {
		return null;
	}

	@Override
	public R visitLocationTupleDescriptorCS(org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS object) {
		return null;
	}

	@Override
	public R visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.MeasureFunctionCS object) {
		return null;
	}

	@Override
	public R visitQoSDimensionCS(org.muml.psm.allocation.language.cs.QoSDimensionCS object) {
		return null;
	}

	@Override
	public R visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS object) {
		return null;
	}

	@Override
	public R visitResourceConstraintCS(org.muml.psm.allocation.language.cs.ResourceConstraintCS object) {
		return null;
	}

	@Override
	public R visitServiceCS(org.muml.psm.allocation.language.cs.ServiceCS object) {
		return null;
	}

	@Override
	public R visitSpecificationCS(org.muml.psm.allocation.language.cs.SpecificationCS object) {
		return null;
	}

	@Override
	public R visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.TupleDescriptorCS object) {
		return null;
	}

	@Override
	public R visitValueTupleDescriptorCS(org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS object) {
		return null;
	}

	@Override
	public R visitWeightingComponentResourceTupleElementCS(org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS object) {
		return null;
	}
}
