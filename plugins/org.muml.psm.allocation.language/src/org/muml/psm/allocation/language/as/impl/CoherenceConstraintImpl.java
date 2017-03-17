/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.CoherenceConstraint;
import org.muml.psm.allocation.language.as.CoherenceConstraintType;
import org.muml.psm.allocation.language.as.TupleDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coherence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.CoherenceConstraintImpl#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.CoherenceConstraintImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoherenceConstraintImpl extends ConstraintImpl implements CoherenceConstraint {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CoherenceConstraintType TYPE_EDEFAULT = CoherenceConstraintType.COLLOCATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CoherenceConstraintType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoherenceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.COHERENCE_CONSTRAINT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR, oldTupleDescriptor, newTupleDescriptor);
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
				msgs = ((InternalEObject)tupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR, null, msgs);
			if (newTupleDescriptor != null)
				msgs = ((InternalEObject)newTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetTupleDescriptor(newTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR, newTupleDescriptor, newTupleDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoherenceConstraintType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CoherenceConstraintType newType) {
		CoherenceConstraintType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.COHERENCE_CONSTRAINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR:
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
			case AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR:
				return getTupleDescriptor();
			case AsPackage.COHERENCE_CONSTRAINT__TYPE:
				return getType();
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
			case AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR:
				setTupleDescriptor((TupleDescriptor)newValue);
				return;
			case AsPackage.COHERENCE_CONSTRAINT__TYPE:
				setType((CoherenceConstraintType)newValue);
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
			case AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR:
				setTupleDescriptor((TupleDescriptor)null);
				return;
			case AsPackage.COHERENCE_CONSTRAINT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AsPackage.COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR:
				return tupleDescriptor != null;
			case AsPackage.COHERENCE_CONSTRAINT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}


} //CoherenceConstraintImpl
