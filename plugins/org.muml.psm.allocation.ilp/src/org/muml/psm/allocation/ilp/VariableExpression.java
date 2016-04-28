/**
 */
package org.muml.psm.allocation.ilp;

import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class references a variable, which is used in a ConstraintExpression or
 * ObjectiveFunctionExpression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.ilp.VariableExpression#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.ilp.IlpPackage#getVariableExpression()
 * @model
 * @generated
 */
public interface VariableExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variable to which this VariableExpression references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getVariableExpression_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.ilp.VariableExpression#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableExpression
