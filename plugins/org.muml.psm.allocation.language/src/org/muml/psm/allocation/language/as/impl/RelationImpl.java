/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.ExpressionInOCL;

import org.eclipse.ocl.pivot.internal.NamedElementImpl;

import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.Bound;
import org.muml.psm.allocation.language.as.EvaluatableElement;
import org.muml.psm.allocation.language.as.Relation;
import org.muml.psm.allocation.language.as.TupleDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.RelationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.RelationImpl#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.RelationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.RelationImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends NamedElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL expression;

	/**
	 * The cached value of the '{@link #getTupleDescriptor() <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptor()
	 * @generated
	 * @ordered
	 */
	protected TupleDescriptor tupleDescriptor;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Bound lowerBound;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Bound upperBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionInOCL newExpression, NotificationChain msgs) {
		ExpressionInOCL oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ExpressionInOCL newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleDescriptor getTupleDescriptor() {
		return tupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleDescriptor(TupleDescriptor newTupleDescriptor, NotificationChain msgs) {
		TupleDescriptor oldTupleDescriptor = tupleDescriptor;
		tupleDescriptor = newTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__TUPLE_DESCRIPTOR, oldTupleDescriptor, newTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleDescriptor(TupleDescriptor newTupleDescriptor) {
		if (newTupleDescriptor != tupleDescriptor) {
			NotificationChain msgs = null;
			if (tupleDescriptor != null)
				msgs = ((InternalEObject)tupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__TUPLE_DESCRIPTOR, null, msgs);
			if (newTupleDescriptor != null)
				msgs = ((InternalEObject)newTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetTupleDescriptor(newTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__TUPLE_DESCRIPTOR, newTupleDescriptor, newTupleDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(Bound newLowerBound, NotificationChain msgs) {
		Bound oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(Bound newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(Bound newUpperBound, NotificationChain msgs) {
		Bound oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Bound newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.RELATION__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.RELATION__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.RELATION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case AsPackage.RELATION__TUPLE_DESCRIPTOR:
				return basicSetTupleDescriptor(null, msgs);
			case AsPackage.RELATION__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
			case AsPackage.RELATION__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case AsPackage.RELATION__EXPRESSION:
				return getExpression();
			case AsPackage.RELATION__TUPLE_DESCRIPTOR:
				return getTupleDescriptor();
			case AsPackage.RELATION__LOWER_BOUND:
				return getLowerBound();
			case AsPackage.RELATION__UPPER_BOUND:
				return getUpperBound();
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
			case AsPackage.RELATION__EXPRESSION:
				setExpression((ExpressionInOCL)newValue);
				return;
			case AsPackage.RELATION__TUPLE_DESCRIPTOR:
				setTupleDescriptor((TupleDescriptor)newValue);
				return;
			case AsPackage.RELATION__LOWER_BOUND:
				setLowerBound((Bound)newValue);
				return;
			case AsPackage.RELATION__UPPER_BOUND:
				setUpperBound((Bound)newValue);
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
			case AsPackage.RELATION__EXPRESSION:
				setExpression((ExpressionInOCL)null);
				return;
			case AsPackage.RELATION__TUPLE_DESCRIPTOR:
				setTupleDescriptor((TupleDescriptor)null);
				return;
			case AsPackage.RELATION__LOWER_BOUND:
				setLowerBound((Bound)null);
				return;
			case AsPackage.RELATION__UPPER_BOUND:
				setUpperBound((Bound)null);
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
			case AsPackage.RELATION__EXPRESSION:
				return expression != null;
			case AsPackage.RELATION__TUPLE_DESCRIPTOR:
				return tupleDescriptor != null;
			case AsPackage.RELATION__LOWER_BOUND:
				return lowerBound != null;
			case AsPackage.RELATION__UPPER_BOUND:
				return upperBound != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EvaluatableElement.class) {
			switch (derivedFeatureID) {
				case AsPackage.RELATION__EXPRESSION: return AsPackage.EVALUATABLE_ELEMENT__EXPRESSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EvaluatableElement.class) {
			switch (baseFeatureID) {
				case AsPackage.EVALUATABLE_ELEMENT__EXPRESSION: return AsPackage.RELATION__EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}


} //RelationImpl
