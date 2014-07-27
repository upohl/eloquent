/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Root;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Specification#getServices <em>Services</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Specification#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Specification#getMeasure <em>Measure</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Specification#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject, Root {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.as.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getSpecification_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.as.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a set of constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getSpecification_Constraints()
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
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getSpecification_Measure()
	 * @model containment="true"
	 * @generated
	 */
	MeasureFunction getMeasure();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Specification#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureFunction value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.allocation.language.as.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the optimization goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.Goal
	 * @see #setGoal(Goal)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getSpecification_Goal()
	 * @model
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Specification#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.Goal
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

} // Specification
