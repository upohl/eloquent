/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.ImplicationConstraint;
import org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintImpl#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicationConstraintImpl extends ConstraintImpl implements ImplicationConstraint {
	/**
	 * The cached value of the '{@link #getTupleDescriptor() <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptor()
	 * @generated
	 * @ordered
	 */
	protected ImplicationConstraintTupleDescriptor tupleDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.IMPLICATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationConstraintTupleDescriptor getTupleDescriptor() {
		return tupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleDescriptor(ImplicationConstraintTupleDescriptor newTupleDescriptor, NotificationChain msgs) {
		ImplicationConstraintTupleDescriptor oldTupleDescriptor = tupleDescriptor;
		tupleDescriptor = newTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR, oldTupleDescriptor, newTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleDescriptor(ImplicationConstraintTupleDescriptor newTupleDescriptor) {
		if (newTupleDescriptor != tupleDescriptor) {
			NotificationChain msgs = null;
			if (tupleDescriptor != null)
				msgs = ((InternalEObject)tupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR, null, msgs);
			if (newTupleDescriptor != null)
				msgs = ((InternalEObject)newTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetTupleDescriptor(newTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR, newTupleDescriptor, newTupleDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR:
				return basicSetTupleDescriptor(null, msgs);
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
			case AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR:
				return getTupleDescriptor();
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
			case AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR:
				setTupleDescriptor((ImplicationConstraintTupleDescriptor)newValue);
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
			case AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR:
				setTupleDescriptor((ImplicationConstraintTupleDescriptor)null);
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
			case AsPackage.IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR:
				return tupleDescriptor != null;
		}
		return super.eIsSet(featureID);
	}


} //ImplicationConstraintImpl
