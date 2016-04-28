/**
 */
package org.muml.psm.allocation.ilp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.mumlcore.expressions.Expression;
import org.muml.psm.allocation.ilp.IlpPackage;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.ObjectiveGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.ilp.impl.ObjectiveFunctionExpressionImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.muml.psm.allocation.ilp.impl.ObjectiveFunctionExpressionImpl#getObjectiveFunction <em>Objective Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveFunctionExpressionImpl extends MinimalEObjectImpl.Container implements ObjectiveFunctionExpression {
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
	 * The cached value of the '{@link #getObjectiveFunction() <em>Objective Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveFunction()
	 * @generated
	 * @ordered
	 */
	protected Expression objectiveFunction;

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
	public Expression getObjectiveFunction() {
		return objectiveFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectiveFunction(Expression newObjectiveFunction, NotificationChain msgs) {
		Expression oldObjectiveFunction = objectiveFunction;
		objectiveFunction = newObjectiveFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION, oldObjectiveFunction, newObjectiveFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectiveFunction(Expression newObjectiveFunction) {
		if (newObjectiveFunction != objectiveFunction) {
			NotificationChain msgs = null;
			if (objectiveFunction != null)
				msgs = ((InternalEObject)objectiveFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION, null, msgs);
			if (newObjectiveFunction != null)
				msgs = ((InternalEObject)newObjectiveFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION, null, msgs);
			msgs = basicSetObjectiveFunction(newObjectiveFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION, newObjectiveFunction, newObjectiveFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION:
				return basicSetObjectiveFunction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION:
				return getObjectiveFunction();
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
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION:
				setObjectiveFunction((Expression)newValue);
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
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION:
				setObjectiveFunction((Expression)null);
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
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION:
				return objectiveFunction != null;
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
