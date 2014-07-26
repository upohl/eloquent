/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.as;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a "resource" constraint, which can be used
 * to specify resource limits (like the maximum amount of available memory)
 * for a hardware resource instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.ResourceConstraint#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getResourceConstraint()
 * @model
 * @generated
 */
public interface ResourceConstraint extends Constraint, WeightingComponentResourceTupleElement {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the right-hand side of the inequality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ValueTupleDescriptor)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getResourceConstraint_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptor getRhs();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.as.ResourceConstraint#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ValueTupleDescriptor value);

} // ResourceConstraint
