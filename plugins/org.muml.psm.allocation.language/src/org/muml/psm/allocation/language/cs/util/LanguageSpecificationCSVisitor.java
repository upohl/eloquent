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
 */
public interface LanguageSpecificationCSVisitor<R> extends org.eclipse.ocl.xtext.completeoclcs.util.CompleteOCLCSVisitor<R>
{
	@Nullable R visitComponentResourceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS object);
	@Nullable R visitConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ConstraintCS object);
	@Nullable R visitEvaluatableElementCS(@NonNull org.muml.psm.allocation.language.cs.EvaluatableElementCS object);
	@Nullable R visitInstanceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS object);
	@Nullable R visitLocationConstraintCS(@NonNull org.muml.psm.allocation.language.cs.LocationConstraintCS object);
	@Nullable R visitLocationTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS object);
	@Nullable R visitMeasureFunctionCS(@NonNull org.muml.psm.allocation.language.cs.MeasureFunctionCS object);
	@Nullable R visitQoSDimensionCS(@NonNull org.muml.psm.allocation.language.cs.QoSDimensionCS object);
	@Nullable R visitRequiredHardwareResourceInstanceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS object);
	@Nullable R visitResourceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ResourceConstraintCS object);
	@Nullable R visitServiceCS(@NonNull org.muml.psm.allocation.language.cs.ServiceCS object);
	@Nullable R visitSpecificationCS(@NonNull org.muml.psm.allocation.language.cs.SpecificationCS object);
	@Nullable R visitTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.TupleDescriptorCS object);
	@Nullable R visitValueTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS object);
	@Nullable R visitWeightingComponentResourceTupleElementCS(@NonNull org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS object);
}
