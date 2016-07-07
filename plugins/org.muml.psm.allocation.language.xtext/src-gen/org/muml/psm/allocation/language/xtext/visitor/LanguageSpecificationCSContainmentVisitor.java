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
	public @Nullable Continuation<?> visitSpecificationCS(@NonNull org.muml.psm.allocation.language.cs.SpecificationCS csElement) {
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
	public @Nullable Continuation<?> visitEvaluatableElementCS(@NonNull org.muml.psm.allocation.language.cs.EvaluatableElementCS csElement) {
		org.muml.psm.allocation.language.as.EvaluatableElement pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.EvaluatableElement.class, csElement);
		pivotElement.setExpression(
			PivotUtil.getPivot(org.eclipse.ocl.pivot.ExpressionInOCL.class, csElement.getExpression())
		);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitWeightingComponentResourceTupleElementCS(@NonNull org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS csElement) {
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
	public @Nullable Continuation<?> visitServiceCS(@NonNull org.muml.psm.allocation.language.cs.ServiceCS csElement) {
		org.muml.psm.allocation.language.as.Service pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.Service.class, org.muml.psm.allocation.language.as.AsPackage.Literals.SERVICE, csElement);
		for (org.muml.psm.allocation.language.cs.QoSDimensionCS it : csElement.getDimensions()) {
			pivotElement.getDimensions().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.QoSDimension.class, it)
			);
		}
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(@NonNull org.muml.psm.allocation.language.cs.QoSDimensionCS csElement) {
		org.muml.psm.allocation.language.as.QoSDimension pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.QoSDimension.class, org.muml.psm.allocation.language.as.AsPackage.Literals.QO_SDIMENSION, csElement);
		visitEvaluatableElementCS(csElement);
		visitWeightingComponentResourceTupleElementCS(csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ConstraintCS csElement) {
		org.muml.psm.allocation.language.as.Constraint pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.Constraint.class, csElement);
		visitEvaluatableElementCS(csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(@NonNull org.muml.psm.allocation.language.cs.LocationConstraintCS csElement) {
		org.muml.psm.allocation.language.as.LocationConstraint pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.LocationConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.LOCATION_CONSTRAINT, csElement);
		pivotElement.setTupleDescriptor(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.LocationTupleDescriptor.class, csElement.getTupleDescriptor())
		);
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.ResourceConstraintCS csElement) {
		org.muml.psm.allocation.language.as.ResourceConstraint pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.ResourceConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.RESOURCE_CONSTRAINT, csElement);
		pivotElement.setRhs(
			PivotUtil.getPivot(org.muml.psm.allocation.language.as.ValueTupleDescriptor.class, csElement.getRhs())
		);
		visitWeightingComponentResourceTupleElementCS(csElement);
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(@NonNull org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS csElement) {
		org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint.class, org.muml.psm.allocation.language.as.AsPackage.Literals.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT, csElement);
		for (org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor.class, it)
			);
		}
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.TupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.TupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.TupleDescriptor.class, csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.InstanceTupleDescriptor pivotElement = PivotUtil.getPivot(org.muml.psm.allocation.language.as.InstanceTupleDescriptor.class, csElement);
		return visitTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.LocationTupleDescriptor pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.LocationTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.LOCATION_TUPLE_DESCRIPTOR, csElement);
		return visitInstanceTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR, csElement);
		return visitInstanceTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(@NonNull org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS csElement) {
		org.muml.psm.allocation.language.as.ValueTupleDescriptor pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.ValueTupleDescriptor.class, org.muml.psm.allocation.language.as.AsPackage.Literals.VALUE_TUPLE_DESCRIPTOR, csElement);
		return visitTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(@NonNull org.muml.psm.allocation.language.cs.MeasureFunctionCS csElement) {
		org.muml.psm.allocation.language.as.MeasureFunction pivotElement = context.refreshModelElement(org.muml.psm.allocation.language.as.MeasureFunction.class, org.muml.psm.allocation.language.as.AsPackage.Literals.MEASURE_FUNCTION, csElement);
		for (org.muml.psm.allocation.language.cs.ServiceCS it : csElement.getServices()) {
			pivotElement.getServices().add(
				PivotUtil.getPivot(org.muml.psm.allocation.language.as.Service.class, it)
			);
		}
		return null;
	}
	
}
