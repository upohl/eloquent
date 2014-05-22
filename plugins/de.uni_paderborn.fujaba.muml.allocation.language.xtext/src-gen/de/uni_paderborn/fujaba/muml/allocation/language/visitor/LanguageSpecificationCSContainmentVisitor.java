package de.uni_paderborn.fujaba.muml.allocation.language.visitor;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;

// generated code: do NOT edit (file is overwritten on regeneration)

public class LanguageSpecificationCSContainmentVisitor extends de.uni_paderborn.fujaba.muml.allocation.language.cs.util.AbstractLanguageSpecificationCSContainmentVisitor {
	public LanguageSpecificationCSContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}
	
	@Override
	public @Nullable Continuation<?> visitSpecificationCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.Specification pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.Specification.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.SPECIFICATION, csElement);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS it : csElement.getServices()) {
			pivotElement.getServices().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.Service.class, it)
			);
		}
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS it : csElement.getConstraints()) {
			pivotElement.getConstraints().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.Constraint.class, it)
			);
		}
		pivotElement.setMeasure(
			PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.MeasureFunction.class, csElement.getMeasure())
		);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitServiceCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.Service pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.Service.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.SERVICE, csElement);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS it : csElement.getDimensions()) {
			pivotElement.getDimensions().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.QoSDimension.class, it)
			);
		}
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitQoSDimensionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.QoSDimension pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.QoSDimension.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.QO_SDIMENSION, csElement);
		pivotElement.setMetric(
			PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.ExpressionInOCL.class, csElement.getMetric())
		);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor.class, it)
			);
		}
		pivotElement.setValue(
			PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.ValueTupleDescriptor.class, csElement.getValue())
		);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.Constraint pivotElement = PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.Constraint.class, csElement);
		pivotElement.setExpression(
			PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.ExpressionInOCL.class, csElement.getExpression())
		);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitLocationConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.LocationConstraint pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.LocationConstraint.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.LOCATION_CONSTRAINT, csElement);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.LocationTupleDescriptor.class, it)
			);
		}
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitResourceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.ResourceConstraint pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.ResourceConstraint.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.RESOURCE_CONSTRAINT, csElement);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor.class, it)
			);
		}
		pivotElement.setLhs(
			PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.ValueTupleDescriptor.class, csElement.getLhs())
		);
		pivotElement.setRhs(
			PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.ValueTupleDescriptor.class, csElement.getRhs())
		);
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitRequiredHardwareResourceInstanceConstraintCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.RequiredHardwareResourceInstanceConstraint pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.RequiredHardwareResourceInstanceConstraint.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT, csElement);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS it : csElement.getTupleDescriptors()) {
			pivotElement.getTupleDescriptors().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor.class, it)
			);
		}
		return visitConstraintCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.TupleDescriptor pivotElement = PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.TupleDescriptor.class, csElement);
		return null;
	}
	
	@Override
	public @Nullable Continuation<?> visitInstanceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.InstanceTupleDescriptor pivotElement = PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.InstanceTupleDescriptor.class, csElement);
		return visitTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitLocationTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.LocationTupleDescriptor pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.LocationTupleDescriptor.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.LOCATION_TUPLE_DESCRIPTOR, csElement);
		return visitInstanceTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitComponentResourceTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR, csElement);
		return visitInstanceTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitValueTupleDescriptorCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.ValueTupleDescriptor pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.ValueTupleDescriptor.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.VALUE_TUPLE_DESCRIPTOR, csElement);
		return visitTupleDescriptorCS(csElement);
	}
	
	@Override
	public @Nullable Continuation<?> visitMeasureFunctionCS(@NonNull de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS csElement) {
		de.uni_paderborn.fujaba.muml.allocation.language.as.MeasureFunction pivotElement = context.refreshModelElement(de.uni_paderborn.fujaba.muml.allocation.language.as.MeasureFunction.class, de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage.Literals.MEASURE_FUNCTION, csElement);
		for (de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS it : csElement.getServices()) {
			pivotElement.getServices().add(
				PivotUtil.getPivot(de.uni_paderborn.fujaba.muml.allocation.language.as.Service.class, it)
			);
		}
		return null;
	}
	
}
