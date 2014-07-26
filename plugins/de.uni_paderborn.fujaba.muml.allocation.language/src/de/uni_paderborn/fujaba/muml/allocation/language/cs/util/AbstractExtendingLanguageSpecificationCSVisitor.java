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
 * An AbstractExtendingLanguageSpecificationCSVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingLanguageSpecificationCSVisitor<R, C>
	extends org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.util.AbstractExtendingCompleteOCLCSVisitor<R, C>
	implements LanguageSpecificationCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingLanguageSpecificationCSVisitor(@NonNull C context) {
		super(context);
	}	

	@Override
	public @Nullable R visitComponentResourceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS object) {
		return visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public @Nullable R visitEvaluatableElementCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public @Nullable R visitInstanceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitLocationConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public @Nullable R visitLocationTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS object) {
		return visitInstanceTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitMeasureFunctionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public @Nullable R visitQoSDimensionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public @Nullable R visitRequiredHardwareResourceInstanceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public @Nullable R visitResourceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS object) {
		return visitConstraintCS(object);
	}

	@Override
	public @Nullable R visitServiceCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS object) {
		return visitNamedElementCS(object);
	}

	@Override
	public @Nullable R visitSpecificationCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS object) {
		return visitCompleteOCLDocumentCS(object);
	}

	@Override
	public @Nullable R visitTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public @Nullable R visitValueTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS object) {
		return visitTupleDescriptorCS(object);
	}

	@Override
	public @Nullable R visitWeightingComponentResourceTupleElementCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS object) {
		return visitModelElementCS(object);
	}
}
