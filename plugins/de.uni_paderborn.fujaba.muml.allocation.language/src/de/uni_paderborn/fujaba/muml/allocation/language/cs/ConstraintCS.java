/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;

import org.eclipse.ocl.examples.xtext.base.basecs.NamedElementCS;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ContextCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getConstraintCS()
 * @model abstract="true"
 * @generated
 */
public interface ConstraintCS extends NamedElementCS {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the OCL expression which is associated with this constraint.
	 * Instead of a plain EString a parsed OCL expression should be used
	 * in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ContextCS)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getConstraintCS_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContextCS getExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ContextCS value);

} // ConstraintCS
