/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification CS</b></em>'.
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
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getServices <em>Services</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getNameProviderImplementationClass <em>Name Provider Implementation Class</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getNameProvider <em>Name Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProviderImplementationClass <em>Storage Provider Implementation Class</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProvider <em>Storage Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.SpecificationCS#getOclContext <em>Ocl Context</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS()
 * @model
 * @generated
 */
public interface SpecificationCS extends CompleteOCLDocumentCS {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.cs.RelationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of relations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationCS> getRelations();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.cs.ServiceCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceCS> getServices();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.cs.ConstraintCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintCS> getConstraints();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the specification of the measure function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureFunctionCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_Measure()
	 * @model containment="true"
	 * @generated
	 */
	MeasureFunctionCS getMeasure();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureFunctionCS value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.psm.allocation.language.cs.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the optimization goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see org.muml.psm.allocation.language.cs.Goal
	 * @see #setGoal(Goal)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_Goal()
	 * @model
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see org.muml.psm.allocation.language.cs.Goal
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Name Provider Implementation Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a JavaImplementationProviderCS. This containment won't be
	 * part of the AS meta model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Provider Implementation Class</em>' containment reference.
	 * @see #setNameProviderImplementationClass(JavaImplementationProviderCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_NameProviderImplementationClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaImplementationProviderCS getNameProviderImplementationClass();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getNameProviderImplementationClass <em>Name Provider Implementation Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Provider Implementation Class</em>' containment reference.
	 * @see #getNameProviderImplementationClass()
	 * @generated
	 */
	void setNameProviderImplementationClass(JavaImplementationProviderCS value);

	/**
	 * Returns the value of the '<em><b>Name Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is not used in the CS model. It is only needed in order to
	 * automatically create a corresponding reference in the AS meta model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Provider</em>' reference.
	 * @see #setNameProvider(NameProviderCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_NameProvider()
	 * @model
	 * @generated
	 */
	NameProviderCS getNameProvider();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getNameProvider <em>Name Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Provider</em>' reference.
	 * @see #getNameProvider()
	 * @generated
	 */
	void setNameProvider(NameProviderCS value);

	/**
	 * Returns the value of the '<em><b>Storage Provider Implementation Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a JavaImplementationProviderCS. This containment won't be
	 * part of the AS meta model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Provider Implementation Class</em>' containment reference.
	 * @see #setStorageProviderImplementationClass(JavaImplementationProviderCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_StorageProviderImplementationClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaImplementationProviderCS getStorageProviderImplementationClass();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProviderImplementationClass <em>Storage Provider Implementation Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Provider Implementation Class</em>' containment reference.
	 * @see #getStorageProviderImplementationClass()
	 * @generated
	 */
	void setStorageProviderImplementationClass(JavaImplementationProviderCS value);

	/**
	 * Returns the value of the '<em><b>Storage Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is not used in the CS model. It is only needed in order to
	 * automatically create a corresponding reference in the AS meta model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Provider</em>' reference.
	 * @see #setStorageProvider(StorageProviderCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_StorageProvider()
	 * @model
	 * @generated
	 */
	StorageProviderCS getStorageProvider();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProvider <em>Storage Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Provider</em>' reference.
	 * @see #getStorageProvider()
	 * @generated
	 */
	void setStorageProvider(StorageProviderCS value);

	/**
	 * Returns the value of the '<em><b>Ocl Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains/Refers to the OCLContextCS/OCLContext element (for the
	 * details see OCLContextCS/OCLContext).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ocl Context</em>' containment reference.
	 * @see #setOclContext(OCLContextCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getSpecificationCS_OclContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OCLContextCS getOclContext();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getOclContext <em>Ocl Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Context</em>' containment reference.
	 * @see #getOclContext()
	 * @generated
	 */
	void setOclContext(OCLContextCS value);

} // SpecificationCS
