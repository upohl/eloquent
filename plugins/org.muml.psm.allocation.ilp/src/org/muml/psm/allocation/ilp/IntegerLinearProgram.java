/**
 */
package org.muml.psm.allocation.ilp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Linear Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an Integer Linear Program. It contains all variables,
 * linear constraints and a linear optimization function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getObjectiveFunction <em>Objective Function</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.ilp.IlpPackage#getIntegerLinearProgram()
 * @model
 * @generated
 */
public interface IntegerLinearProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.ilp.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variables that are used in this Integer Linear Program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getIntegerLinearProgram_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.ilp.ConstraintExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraints expressions for this Integer Linear Program
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getIntegerLinearProgram_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintExpression> getConstraints();

	/**
	 * Returns the value of the '<em><b>Objective Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The objective funtion to which is to be minimized or maximized of this Integer Linear Program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective Function</em>' containment reference.
	 * @see #setObjectiveFunction(ObjectiveFunctionExpression)
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getIntegerLinearProgram_ObjectiveFunction()
	 * @model containment="true"
	 * @generated
	 */
	ObjectiveFunctionExpression getObjectiveFunction();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getObjectiveFunction <em>Objective Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Function</em>' containment reference.
	 * @see #getObjectiveFunction()
	 * @generated
	 */
	void setObjectiveFunction(ObjectiveFunctionExpression value);

} // IntegerLinearProgram
