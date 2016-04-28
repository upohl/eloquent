/**
 */
package org.muml.psm.allocation.language.cs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;
import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.NamespaceCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;
import org.eclipse.ocl.xtext.basecs.util.VisitableCS;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;
import org.muml.core.ExtendableElement;
import org.muml.psm.allocation.language.cs.*;
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.ConstraintCS;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.LocationConstraintCS;
import org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.MeasureFunctionCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.cs.ServiceCS;
import org.muml.psm.allocation.language.cs.SpecificationCS;
import org.muml.psm.allocation.language.cs.TupleDescriptorCS;
import org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.language.cs.CsPackage
 * @generated
 */
public class CsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsSwitch<@Nullable Adapter> modelSwitch =
		new CsSwitch<@Nullable Adapter>() {
			@Override
			public Adapter caseSpecificationCS(SpecificationCS object) {
				return createSpecificationCSAdapter();
			}
			@Override
			public Adapter caseEvaluatableElementCS(EvaluatableElementCS object) {
				return createEvaluatableElementCSAdapter();
			}
			@Override
			public Adapter caseWeightingComponentResourceTupleElementCS(WeightingComponentResourceTupleElementCS object) {
				return createWeightingComponentResourceTupleElementCSAdapter();
			}
			@Override
			public Adapter caseServiceCS(ServiceCS object) {
				return createServiceCSAdapter();
			}
			@Override
			public Adapter caseQoSDimensionCS(QoSDimensionCS object) {
				return createQoSDimensionCSAdapter();
			}
			@Override
			public Adapter caseConstraintCS(ConstraintCS object) {
				return createConstraintCSAdapter();
			}
			@Override
			public Adapter caseLocationConstraintCS(LocationConstraintCS object) {
				return createLocationConstraintCSAdapter();
			}
			@Override
			public Adapter caseResourceConstraintCS(ResourceConstraintCS object) {
				return createResourceConstraintCSAdapter();
			}
			@Override
			public Adapter caseRequiredHardwareResourceInstanceConstraintCS(RequiredHardwareResourceInstanceConstraintCS object) {
				return createRequiredHardwareResourceInstanceConstraintCSAdapter();
			}
			@Override
			public Adapter caseTupleDescriptorCS(TupleDescriptorCS object) {
				return createTupleDescriptorCSAdapter();
			}
			@Override
			public Adapter caseInstanceTupleDescriptorCS(InstanceTupleDescriptorCS object) {
				return createInstanceTupleDescriptorCSAdapter();
			}
			@Override
			public Adapter caseLocationTupleDescriptorCS(LocationTupleDescriptorCS object) {
				return createLocationTupleDescriptorCSAdapter();
			}
			@Override
			public Adapter caseComponentResourceTupleDescriptorCS(ComponentResourceTupleDescriptorCS object) {
				return createComponentResourceTupleDescriptorCSAdapter();
			}
			@Override
			public Adapter caseValueTupleDescriptorCS(ValueTupleDescriptorCS object) {
				return createValueTupleDescriptorCSAdapter();
			}
			@Override
			public Adapter caseMeasureFunctionCS(MeasureFunctionCS object) {
				return createMeasureFunctionCSAdapter();
			}
			@Override
			public Adapter caseVisitableCS(VisitableCS object) {
				return createVisitableCSAdapter();
			}
			@Override
			public Adapter caseElementCS(ElementCS object) {
				return createElementCSAdapter();
			}
			@Override
			public Adapter casePivotable(Pivotable object) {
				return createPivotableAdapter();
			}
			@Override
			public Adapter casePivotableElementCS(PivotableElementCS object) {
				return createPivotableElementCSAdapter();
			}
			@Override
			public Adapter caseModelElementCS(ModelElementCS object) {
				return createModelElementCSAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseNamedElementCS(NamedElementCS object) {
				return createNamedElementCSAdapter();
			}
			@Override
			public Adapter caseNamespaceCS(NamespaceCS object) {
				return createNamespaceCSAdapter();
			}
			@Override
			public Adapter caseRootCS(RootCS object) {
				return createRootCSAdapter();
			}
			@Override
			public Adapter caseCompleteOCLDocumentCS(CompleteOCLDocumentCS object) {
				return createCompleteOCLDocumentCSAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.SpecificationCS <em>Specification CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS
	 * @generated
	 */
	public Adapter createSpecificationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.EvaluatableElementCS <em>Evaluatable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.EvaluatableElementCS
	 * @generated
	 */
	public Adapter createEvaluatableElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS <em>Weighting Component Resource Tuple Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS
	 * @generated
	 */
	public Adapter createWeightingComponentResourceTupleElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.ServiceCS <em>Service CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.ServiceCS
	 * @generated
	 */
	public Adapter createServiceCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.QoSDimensionCS <em>Qo SDimension CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.QoSDimensionCS
	 * @generated
	 */
	public Adapter createQoSDimensionCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.ConstraintCS <em>Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.ConstraintCS
	 * @generated
	 */
	public Adapter createConstraintCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.LocationConstraintCS <em>Location Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.LocationConstraintCS
	 * @generated
	 */
	public Adapter createLocationConstraintCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.ResourceConstraintCS <em>Resource Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.ResourceConstraintCS
	 * @generated
	 */
	public Adapter createResourceConstraintCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS <em>Required Hardware Resource Instance Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS
	 * @generated
	 */
	public Adapter createRequiredHardwareResourceInstanceConstraintCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.TupleDescriptorCS <em>Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.TupleDescriptorCS
	 * @generated
	 */
	public Adapter createTupleDescriptorCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS <em>Instance Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS
	 * @generated
	 */
	public Adapter createInstanceTupleDescriptorCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS <em>Location Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS
	 * @generated
	 */
	public Adapter createLocationTupleDescriptorCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS <em>Component Resource Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS
	 * @generated
	 */
	public Adapter createComponentResourceTupleDescriptorCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS <em>Value Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS
	 * @generated
	 */
	public Adapter createValueTupleDescriptorCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.psm.allocation.language.cs.MeasureFunctionCS <em>Measure Function CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.psm.allocation.language.cs.MeasureFunctionCS
	 * @generated
	 */
	public Adapter createMeasureFunctionCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.util.VisitableCS <em>Visitable CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.util.VisitableCS
	 * @generated
	 */
	public Adapter createVisitableCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ElementCS <em>Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ElementCS
	 * @generated
	 */
	public Adapter createElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Pivotable <em>Pivotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.pivot.utilities.Pivotable
	 * @generated
	 */
	public Adapter createPivotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PivotableElementCS <em>Pivotable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.PivotableElementCS
	 * @generated
	 */
	public Adapter createPivotableElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ModelElementCS <em>Model Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ModelElementCS
	 * @generated
	 */
	public Adapter createModelElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.pivot.utilities.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.NamedElementCS <em>Named Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.NamedElementCS
	 * @generated
	 */
	public Adapter createNamedElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.NamespaceCS <em>Namespace CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.NamespaceCS
	 * @generated
	 */
	public Adapter createNamespaceCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.RootCS <em>Root CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.RootCS
	 * @generated
	 */
	public Adapter createRootCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS <em>Complete OCL Document CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS
	 * @generated
	 */
	public Adapter createCompleteOCLDocumentCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CsAdapterFactory
