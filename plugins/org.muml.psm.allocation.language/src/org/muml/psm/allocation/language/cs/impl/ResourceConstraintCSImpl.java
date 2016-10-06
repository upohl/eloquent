/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;

import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceConstraintCSImpl extends ConstraintCSImpl implements ResourceConstraintCS {
	/**
	 * The cached value of the '{@link #getTupleDescriptor() <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptor()
	 * @generated
	 * @ordered
	 */
	protected BoundWeightTupleDescriptorCS tupleDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceConstraintCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.RESOURCE_CONSTRAINT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundWeightTupleDescriptorCS getTupleDescriptor() {
		return tupleDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleDescriptor(BoundWeightTupleDescriptorCS newTupleDescriptor, NotificationChain msgs) {
		BoundWeightTupleDescriptorCS oldTupleDescriptor = tupleDescriptor;
		tupleDescriptor = newTupleDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR, oldTupleDescriptor, newTupleDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleDescriptor(BoundWeightTupleDescriptorCS newTupleDescriptor) {
		if (newTupleDescriptor != tupleDescriptor) {
			NotificationChain msgs = null;
			if (tupleDescriptor != null)
				msgs = ((InternalEObject)tupleDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR, null, msgs);
			if (newTupleDescriptor != null)
				msgs = ((InternalEObject)newTupleDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR, null, msgs);
			msgs = basicSetTupleDescriptor(newTupleDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR, newTupleDescriptor, newTupleDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR:
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR:
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR:
				setTupleDescriptor((BoundWeightTupleDescriptorCS)newValue);
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR:
				setTupleDescriptor((BoundWeightTupleDescriptorCS)null);
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR:
				return tupleDescriptor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitResourceConstraintCS(this);
	}

} //ResourceConstraintCSImpl
