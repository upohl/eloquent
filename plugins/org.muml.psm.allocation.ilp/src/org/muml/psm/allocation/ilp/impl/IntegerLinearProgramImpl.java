/**
 */
package org.muml.psm.allocation.ilp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IlpPackage;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Linear Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl#getObjectiveFunction <em>Objective Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerLinearProgramImpl extends MinimalEObjectImpl.Container implements IntegerLinearProgram {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintExpression> constraints;

	/**
	 * The cached value of the '{@link #getObjectiveFunction() <em>Objective Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveFunction()
	 * @generated
	 * @ordered
	 */
	protected ObjectiveFunctionExpression objectiveFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLinearProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlpPackage.Literals.INTEGER_LINEAR_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, IlpPackage.INTEGER_LINEAR_PROGRAM__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintExpression> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ConstraintExpression>(ConstraintExpression.class, this, IlpPackage.INTEGER_LINEAR_PROGRAM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveFunctionExpression getObjectiveFunction() {
		return objectiveFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectiveFunction(ObjectiveFunctionExpression newObjectiveFunction, NotificationChain msgs) {
		ObjectiveFunctionExpression oldObjectiveFunction = objectiveFunction;
		objectiveFunction = newObjectiveFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION, oldObjectiveFunction, newObjectiveFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectiveFunction(ObjectiveFunctionExpression newObjectiveFunction) {
		if (newObjectiveFunction != objectiveFunction) {
			NotificationChain msgs = null;
			if (objectiveFunction != null)
				msgs = ((InternalEObject)objectiveFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION, null, msgs);
			if (newObjectiveFunction != null)
				msgs = ((InternalEObject)newObjectiveFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION, null, msgs);
			msgs = basicSetObjectiveFunction(newObjectiveFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION, newObjectiveFunction, newObjectiveFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlpPackage.INTEGER_LINEAR_PROGRAM__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case IlpPackage.INTEGER_LINEAR_PROGRAM__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION:
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
			case IlpPackage.INTEGER_LINEAR_PROGRAM__VARIABLES:
				return getVariables();
			case IlpPackage.INTEGER_LINEAR_PROGRAM__CONSTRAINTS:
				return getConstraints();
			case IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION:
				return getObjectiveFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IlpPackage.INTEGER_LINEAR_PROGRAM__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case IlpPackage.INTEGER_LINEAR_PROGRAM__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintExpression>)newValue);
				return;
			case IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION:
				setObjectiveFunction((ObjectiveFunctionExpression)newValue);
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
			case IlpPackage.INTEGER_LINEAR_PROGRAM__VARIABLES:
				getVariables().clear();
				return;
			case IlpPackage.INTEGER_LINEAR_PROGRAM__CONSTRAINTS:
				getConstraints().clear();
				return;
			case IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION:
				setObjectiveFunction((ObjectiveFunctionExpression)null);
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
			case IlpPackage.INTEGER_LINEAR_PROGRAM__VARIABLES:
				return variables != null && !variables.isEmpty();
			case IlpPackage.INTEGER_LINEAR_PROGRAM__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case IlpPackage.INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION:
				return objectiveFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegerLinearProgramImpl
