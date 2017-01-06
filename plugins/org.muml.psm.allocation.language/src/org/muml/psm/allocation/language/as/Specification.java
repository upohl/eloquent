/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.pivot.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the complete allocation specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getServices <em>Services</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getNameProvider <em>Name Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getStorageProvider <em>Storage Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.Specification#getOclContext <em>Ocl Context</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends Model {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.as.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.as.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the specification of the measure function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureFunction)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_Measure()
	 * @model containment="true"
	 * @generated
	 */
	MeasureFunction getMeasure();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.Specification#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureFunction value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.psm.allocation.language.as.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the optimization goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see org.muml.psm.allocation.language.as.Goal
	 * @see #setGoal(Goal)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_Goal()
	 * @model
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.Specification#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see org.muml.psm.allocation.language.as.Goal
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Name Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is not used in the CS model. It is only needed in order to
	 * automatically create a corresponding reference in the AS meta model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Provider</em>' reference.
	 * @see #setNameProvider(NameProvider)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_NameProvider()
	 * @model
	 * @generated
	 */
	NameProvider getNameProvider();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.Specification#getNameProvider <em>Name Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Provider</em>' reference.
	 * @see #getNameProvider()
	 * @generated
	 */
	void setNameProvider(NameProvider value);

	/**
	 * Returns the value of the '<em><b>Storage Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is not used in the CS model. It is only needed in order to
	 * automatically create a corresponding reference in the AS meta model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Provider</em>' reference.
	 * @see #setStorageProvider(StorageProvider)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_StorageProvider()
	 * @model
	 * @generated
	 */
	StorageProvider getStorageProvider();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.Specification#getStorageProvider <em>Storage Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Provider</em>' reference.
	 * @see #getStorageProvider()
	 * @generated
	 */
	void setStorageProvider(StorageProvider value);

	/**
	 * Returns the value of the '<em><b>Ocl Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains/Refers to the OCLContextCS/OCLContext element (for the
	 * details see OCLContextCS/OCLContext).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ocl Context</em>' containment reference.
	 * @see #setOclContext(OCLContext)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getSpecification_OclContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OCLContext getOclContext();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.Specification#getOclContext <em>Ocl Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Context</em>' containment reference.
	 * @see #getOclContext()
	 * @generated
	 */
	void setOclContext(OCLContext value);

} // Specification
