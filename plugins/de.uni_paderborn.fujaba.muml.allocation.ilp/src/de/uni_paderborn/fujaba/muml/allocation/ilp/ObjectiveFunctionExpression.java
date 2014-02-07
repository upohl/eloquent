/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp;

import org.storydriven.core.expressions.Expression;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveFunctionExpression#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.ilp.IlpPackage#getObjectiveFunctionExpression()
 * @model
 * @generated
 */
public interface ObjectiveFunctionExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * The default value is <code>"MAX"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the objective function shall be minimized or maximized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveGoal
	 * @see #setGoal(ObjectiveGoal)
	 * @see de.uni_paderborn.fujaba.muml.allocation.ilp.IlpPackage#getObjectiveFunctionExpression_Goal()
	 * @model default="MAX" required="true"
	 * @generated
	 */
	ObjectiveGoal getGoal();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveFunctionExpression#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveGoal
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(ObjectiveGoal value);

} // ObjectiveFunctionExpression
