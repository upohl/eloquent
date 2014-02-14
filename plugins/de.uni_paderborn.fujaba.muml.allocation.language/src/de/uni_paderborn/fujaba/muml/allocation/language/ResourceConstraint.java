/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a "resource" constraint which can be used
 * to specify resource limits (like the maximum amount of available memory)
 * for a hardware resource instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getLhs <em>Lhs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getResourceConstraint()
 * @model
 * @generated
 */
public interface ResourceConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getResourceConstraint_TupleDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentResourceTupleDescriptor> getTupleDescriptors();

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the left-hand side of the inequality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(ValueTupleDescriptor)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getResourceConstraint_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptor getLhs();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(ValueTupleDescriptor value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the right-hand side of the inequality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ValueTupleDescriptor)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getResourceConstraint_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptor getRhs();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ValueTupleDescriptor value);

} // ResourceConstraint
