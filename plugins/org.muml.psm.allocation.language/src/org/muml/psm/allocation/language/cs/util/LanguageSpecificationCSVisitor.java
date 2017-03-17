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
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface LanguageSpecificationCSVisitor<R> extends org.eclipse.ocl.xtext.completeoclcs.util.CompleteOCLCSVisitor<R>
{
	R visitBoundCS(org.muml.psm.allocation.language.cs.@NonNull BoundCS object);
	R visitBoundWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull BoundWeightTupleDescriptorCS object);
	R visitCoherenceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull CoherenceConstraintCS object);
	R visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS object);
	R visitEvaluableElementCS(org.muml.psm.allocation.language.cs.@NonNull EvaluableElementCS object);
	R visitJavaImplementationProviderCS(org.muml.psm.allocation.language.cs.@NonNull JavaImplementationProviderCS object);
	R visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS object);
	R visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS object);
	R visitOCLContextCS(org.muml.psm.allocation.language.cs.@NonNull OCLContextCS object);
	R visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS object);
	R visitRelationCS(org.muml.psm.allocation.language.cs.@NonNull RelationCS object);
	R visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS object);
	R visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS object);
	R visitSpecificationCS(org.muml.psm.allocation.language.cs.@NonNull SpecificationCS object);
	R visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS object);
	R visitTypedNamedPartCS(org.muml.psm.allocation.language.cs.@NonNull TypedNamedPartCS object);
	R visitTypedPairCS(org.muml.psm.allocation.language.cs.@NonNull TypedPairCS object);
	R visitWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull WeightTupleDescriptorCS object);
}
