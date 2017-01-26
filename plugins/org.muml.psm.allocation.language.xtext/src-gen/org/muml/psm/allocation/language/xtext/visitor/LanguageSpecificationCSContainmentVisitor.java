package org.muml.psm.allocation.language.xtext.visitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;

// generated code: do NOT edit (file is overwritten on regeneration)

public class LanguageSpecificationCSContainmentVisitor extends org.muml.psm.allocation.language.cs.util.AbstractCsContainmentVisitor {
	public LanguageSpecificationCSContainmentVisitor(CS2ASConversion context) {
		super(context);
	}
	
	@Override
	public @Nullable Continuation<?> visitSpecificationCS(org.muml.psm.allocation.language.cs.@NonNull SpecificationCS csElement) {
		org.muml.psm.allocation.language.as.Specification pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Specification.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.Specification.class, org.muml.psm.allocation.language.as.AsPackage.Literals.SPECIFICATION, csElement);
		}
		for (org.muml.psm.allocation.language.cs.RelationCS it : csElement.getRelations()) {
			pivotElement.getRelations().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.Relation.class, it)
			);
		}
		for (org.muml.psm.allocation.language.cs.ServiceCS it : csElement.getServices()) {
			pivotElement.getServices().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.Service.class, it)
			);
		}
		for (org.muml.psm.allocation.language.cs.ConstraintCS it : csElement.getConstraints()) {
			pivotElement.getConstraints().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.Constraint.class, it)
			);
		}
		pivotElement.setMeasure(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.MeasureFunction.class, csElement.getMeasure())
		);
		pivotElement.setGoal(
			org.muml.psm.allocation.language.as.Goal.get(csElement.getGoal().getValue())
		);
		pivotElement.setOclContext(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.OCLContext.class, csElement.getOclContext())
		);
		return visitCompleteOCLDocumentCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitEvaluatableElementCS(org.muml.psm.allocation.language.cs.@NonNull EvaluatableElementCS csElement) {
		org.muml.psm.allocation.language.as.EvaluatableElement pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.EvaluatableElement.class, csElement);
		pivotElement.setExpression(
			PivotUtil.getPivot(org.eclipse.ocl.pivot.ExpressionInOCL.class, csElement.getExpression())
		);
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitRelationCS(org.muml.psm.allocation.language.cs.@NonNull RelationCS csElement) {
		org.muml.psm.allocation.language.as.Relation pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Relation.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.Relation.class, org.muml.psm.allocation.language.as.AsPackage.Literals.RELATION, csElement);
		}
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.TupleDescriptor.class, csElement.getTupleDescriptor())
		);
		pivotElement.setLowerBound(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.Bound.class, csElement.getLowerBound())
		);
		pivotElement.setUpperBound(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.Bound.class, csElement.getUpperBound())
		);
		visitEvaluatableElementCS(csElement);
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitBoundCS(org.muml.psm.allocation.language.cs.@NonNull BoundCS csElement) {
		org.muml.psm.allocation.language.as.Bound pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Bound.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.Bound.class, org.muml.psm.allocation.language.as.AsPackage.Literals.BOUND, csElement);
		}
		return visitEvaluatableElementCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS csElement) {
		org.muml.psm.allocation.language.as.Constraint pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Constraint.class, csElement);
		visitEvaluatableElementCS(csElement);
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS csElement) {
		org.muml.psm.allocation.language.as.LocationConstraint pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.LocationConstraint.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.LocationConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.LOCATION_CONSTRAINT, csElement);
		}
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.TupleDescriptor.class, csElement.getTupleDescriptor())
		);
		pivotElement.setType(
			org.muml.psm.allocation.language.as.LocationConstraintTypes.get(csElement.getType().getValue())
		);
		return visitConstraintCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS csElement) {
		org.muml.psm.allocation.language.as.ResourceConstraint pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.ResourceConstraint.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.ResourceConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.RESOURCE_CONSTRAINT, csElement);
		}
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor.class, csElement.getTupleDescriptor())
		);
		return visitConstraintCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull RequiredHardwareResourceInstanceConstraintCS csElement) {
		org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT, csElement);
		}
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.TupleDescriptor.class, csElement.getTupleDescriptor())
		);
		return visitConstraintCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.TupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.TupleDescriptor.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.TupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.TUPLE_DESCRIPTOR, csElement);
		}
		for (org.muml.psm.allocation.language.cs.TypedPairCS it : csElement.getTypedPairs()) {
			pivotElement.getTypedPairs().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.TypedPair.class, it)
			);
		}
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull WeightTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.WeightTupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.WeightTupleDescriptor.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.WeightTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.WEIGHT_TUPLE_DESCRIPTOR, csElement);
		}
		pivotElement.setWeight(
			csElement.getWeight()
		);
		return visitTupleDescriptorCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitBoundWeightTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull BoundWeightTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.BOUND_WEIGHT_TUPLE_DESCRIPTOR, csElement);
		}
		pivotElement.setBound(
			csElement.getBound()
		);
		return visitWeightTupleDescriptorCS(csElement);
	}
	@Override
	public @Nullable Continuation<?> visitTypedNamedPartCS(org.muml.psm.allocation.language.cs.@NonNull TypedNamedPartCS csElement) {
		org.muml.psm.allocation.language.as.TypedNamedPart pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.TypedNamedPart.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.TypedNamedPart.class, org.muml.psm.allocation.language.as.AsPackage.Literals.TYPED_NAMED_PART, csElement);
		}
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitTypedPairCS(org.muml.psm.allocation.language.cs.@NonNull TypedPairCS csElement) {
		org.muml.psm.allocation.language.as.TypedPair pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.TypedPair.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.TypedPair.class, org.muml.psm.allocation.language.as.AsPackage.Literals.TYPED_PAIR, csElement);
		}
		pivotElement.setFirst(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.TypedNamedPart.class, csElement.getFirst())
		);
		pivotElement.setSecond(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.TypedNamedPart.class, csElement.getSecond())
		);
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS csElement) {
		org.muml.psm.allocation.language.as.MeasureFunction pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.MeasureFunction.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.MeasureFunction.class, org.muml.psm.allocation.language.as.AsPackage.Literals.MEASURE_FUNCTION, csElement);
		}
		for (org.muml.psm.allocation.language.cs.ServiceCS it : csElement.getServices()) {
			pivotElement.getServices().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.Service.class, it)
			);
		}
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS csElement) {
		org.muml.psm.allocation.language.as.Service pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Service.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.Service.class, org.muml.psm.allocation.language.as.AsPackage.Literals.SERVICE, csElement);
		}
		for (org.muml.psm.allocation.language.cs.QoSDimensionCS it : csElement.getDimensions()) {
			pivotElement.getDimensions().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.QoSDimension.class, it)
			);
		}
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS csElement) {
		org.muml.psm.allocation.language.as.QoSDimension pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.QoSDimension.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.QoSDimension.class, org.muml.psm.allocation.language.as.AsPackage.Literals.QO_SDIMENSION, csElement);
		}
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.WeightTupleDescriptor.class, csElement.getTupleDescriptor())
		);
		visitEvaluatableElementCS(csElement);
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitJavaImplementationProviderCS(org.muml.psm.allocation.language.cs.@NonNull JavaImplementationProviderCS csElement) {
		org.muml.psm.allocation.language.as.JavaImplementationProvider pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.JavaImplementationProvider.class, csElement);
		if (pivotElement == null) {
			pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.JavaImplementationProvider.class, org.muml.psm.allocation.language.as.AsPackage.Literals.JAVA_IMPLEMENTATION_PROVIDER, csElement);
		}
		return null;
	}
	@Override
	public @Nullable Continuation<?> visitOCLContextCS(org.muml.psm.allocation.language.cs.@NonNull OCLContextCS csElement) {
		org.muml.psm.allocation.language.as.OCLContext pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.OCLContext.class, csElement);
		if (pivotElement == null) {
			pivotElement = refreshNamedElement(org.muml.psm.allocation.language.as.OCLContext.class, org.muml.psm.allocation.language.as.AsPackage.Literals.OCL_CONTEXT, csElement);
		}
		return null;
	}
}
