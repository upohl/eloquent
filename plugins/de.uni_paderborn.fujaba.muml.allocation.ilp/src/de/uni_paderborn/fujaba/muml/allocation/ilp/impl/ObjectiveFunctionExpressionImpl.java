/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.impl;

import de.uni_paderborn.fujaba.muml.allocation.ilp.IlpPackage;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveFunctionExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveGoal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.ilp.impl.ObjectiveFunctionExpressionImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveFunctionExpressionImpl extends ExpressionImpl implements ObjectiveFunctionExpression {
	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectiveGoal GOAL_EDEFAULT = ObjectiveGoal.MAX;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected ObjectiveGoal goal = GOAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveFunctionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveGoal getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(ObjectiveGoal newGoal) {
		ObjectiveGoal oldGoal = goal;
		goal = newGoal == null ? GOAL_EDEFAULT : newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__GOAL:
				return getGoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__GOAL:
				setGoal((ObjectiveGoal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__GOAL:
				return goal != GOAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (goal: ");
		result.append(goal);
		result.append(')');
		return result.toString();
	}

} //ObjectiveFunctionExpressionImpl
