/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.examples.xtext.base.basecs.NamedElementCS;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getServices <em>Services</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getSpecificationCS()
 * @model
 * @generated
 */
public interface SpecificationCS extends NamedElementCS {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getSpecificationCS_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceCS> getServices();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getSpecificationCS_Constraints()
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
	 * @see #setMeasure(MeasureFunction)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getSpecificationCS_Measure()
	 * @model containment="true"
	 * @generated
	 */
	MeasureFunction getMeasure();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureFunction value);

} // SpecificationCS