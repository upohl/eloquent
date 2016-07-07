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
		org.muml.psm.allocation.language.as.Specification pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.Specification.class, org.muml.psm.allocation.language.as.AsPackage.Literals.SPECIFICATION, csElement);
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
	public @Nullable Continuation<?> visitWeightingComponentResourceTupleElementCS(org.muml.psm.allocation.language.cs.@NonNull WeightingComponentResourceTupleElementCS csElement) {
		org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement.class, csElement);
		for (org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor.class, it)
			);
		}
		pivotElement.setWeighting(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.ValueTupleDescriptor.class, csElement.getWeighting())
		);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitServiceCS(org.muml.psm.allocation.language.cs.@NonNull ServiceCS csElement) {
		org.muml.psm.allocation.language.as.Service pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.Service.class, org.muml.psm.allocation.language.as.AsPackage.Literals.SERVICE, csElement);
		for (org.muml.psm.allocation.language.cs.QoSDimensionCS it : csElement.getDimensions()) {
			pivotElement.getDimensions().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.QoSDimension.class, it)
			);
		}
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(org.muml.psm.allocation.language.cs.@NonNull QoSDimensionCS csElement) {
		org.muml.psm.allocation.language.as.QoSDimension pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.QoSDimension.class, org.muml.psm.allocation.language.as.AsPackage.Literals.QO_SDIMENSION, csElement);
		visitEvaluatableElementCS(csElement);
		visitWeightingComponentResourceTupleElementCS(csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ConstraintCS csElement) {
		org.muml.psm.allocation.language.as.Constraint pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Constraint.class, csElement);
		visitEvaluatableElementCS(csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(org.muml.psm.allocation.language.cs.@NonNull LocationConstraintCS csElement) {
		org.muml.psm.allocation.language.as.LocationConstraint pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.LocationConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.LOCATION_CONSTRAINT, csElement);
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.LocationTupleDescriptor.class, csElement.getTupleDescriptor())
		);
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull ResourceConstraintCS csElement) {
		org.muml.psm.allocation.language.as.ResourceConstraint pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.ResourceConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.RESOURCE_CONSTRAINT, csElement);
		pivotElement.setRhs(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.ValueTupleDescriptor.class, csElement.getRhs())
		);
		visitWeightingComponentResourceTupleElementCS(csElement);
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(org.muml.psm.allocation.language.cs.@NonNull RequiredHardwareResourceInstanceConstraintCS csElement) {
		org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT, csElement);
		for (org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor.class, it)
			);
		}
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull TupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.TupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.TupleDescriptor.class, csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull InstanceTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.InstanceTupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.InstanceTupleDescriptor.class, csElement);
		return visitTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull LocationTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.LocationTupleDescriptor pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.LocationTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.LOCATION_TUPLE_DESCRIPTOR, csElement);
		return visitInstanceTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull ComponentResourceTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR, csElement);
		return visitInstanceTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(org.muml.psm.allocation.language.cs.@NonNull ValueTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.ValueTupleDescriptor pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.ValueTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.VALUE_TUPLE_DESCRIPTOR, csElement);
		return visitTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(org.muml.psm.allocation.language.cs.@NonNull MeasureFunctionCS csElement) {
		org.muml.psm.allocation.language.as.MeasureFunction pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.MeasureFunction.class, org.muml.psm.allocation.language.as.AsPackage.Literals.MEASURE_FUNCTION, csElement);
		for (org.muml.psm.allocation.language.cs.ServiceCS it : csElement.getServices()) {
			pivotElement.getServices().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.Service.class, it)
			);
		}
		return null;
	}
	
}
