/**
 */
package org.muml.psm.allocation.ilp;

import org.eclipse.emf.ecore.EObject;

import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an Integer Linear Program's objective function.
 * The Integer Linear Program will be maximzed or minimized to this function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getObjectiveFunction <em>Objective Function</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.ilp.IlpPackage#getObjectiveFunctionExpression()
 * @model
 * @generated
 */
public interface ObjectiveFunctionExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * The default value is <code>"MAX"</code>.
	 * The literals are from the enumeration {@link org.muml.psm.allocation.ilp.ObjectiveGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the objective function shall be minimized or maximized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see org.muml.psm.allocation.ilp.ObjectiveGoal
	 * @see #setGoal(ObjectiveGoal)
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getObjectiveFunctionExpression_Goal()
	 * @model default="MAX" required="true"
	 * @generated
	 */
	ObjectiveGoal getGoal();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see org.muml.psm.allocation.ilp.ObjectiveGoal
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(ObjectiveGoal value);

	/**
	 * Returns the value of the '<em><b>Objective Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Function</em>' containment reference.
	 * @see #setObjectiveFunction(Expression)
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getObjectiveFunctionExpression_ObjectiveFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getObjectiveFunction();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getObjectiveFunction <em>Objective Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Function</em>' containment reference.
	 * @see #getObjectiveFunction()
	 * @generated
	 */
	void setObjectiveFunction(Expression value);

} // ObjectiveFunctionExpression
