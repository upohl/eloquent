/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.allocation.language.cs.CsPackage
 * @generated
 */
public interface CsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsFactory eINSTANCE = org.muml.psm.allocation.language.cs.impl.CsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification CS</em>'.
	 * @generated
	 */
	SpecificationCS createSpecificationCS();

	/**
	 * Returns a new object of class '<em>Service CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service CS</em>'.
	 * @generated
	 */
	ServiceCS createServiceCS();

	/**
	 * Returns a new object of class '<em>Qo SDimension CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SDimension CS</em>'.
	 * @generated
	 */
	QoSDimensionCS createQoSDimensionCS();

	/**
	 * Returns a new object of class '<em>Location Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Constraint CS</em>'.
	 * @generated
	 */
	LocationConstraintCS createLocationConstraintCS();

	/**
	 * Returns a new object of class '<em>Resource Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Constraint CS</em>'.
	 * @generated
	 */
	ResourceConstraintCS createResourceConstraintCS();

	/**
	 * Returns a new object of class '<em>Required Hardware Resource Instance Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Hardware Resource Instance Constraint CS</em>'.
	 * @generated
	 */
	RequiredHardwareResourceInstanceConstraintCS createRequiredHardwareResourceInstanceConstraintCS();

	/**
	 * Returns a new object of class '<em>Location Tuple Descriptor CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Tuple Descriptor CS</em>'.
	 * @generated
	 */
	LocationTupleDescriptorCS createLocationTupleDescriptorCS();

	/**
	 * Returns a new object of class '<em>Component Resource Tuple Descriptor CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Resource Tuple Descriptor CS</em>'.
	 * @generated
	 */
	ComponentResourceTupleDescriptorCS createComponentResourceTupleDescriptorCS();

	/**
	 * Returns a new object of class '<em>Value Tuple Descriptor CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Tuple Descriptor CS</em>'.
	 * @generated
	 */
	ValueTupleDescriptorCS createValueTupleDescriptorCS();

	/**
	 * Returns a new object of class '<em>Measure Function CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Function CS</em>'.
	 * @generated
	 */
	MeasureFunctionCS createMeasureFunctionCS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsPackage getCsPackage();

} //CsFactory
