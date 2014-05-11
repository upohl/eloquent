/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.as.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.as.ComponentResourceTupleDescriptor;
import de.uni_paderborn.fujaba.muml.allocation.language.as.ResourceConstraint;
import de.uni_paderborn.fujaba.muml.allocation.language.as.ValueTupleDescriptor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.impl.ResourceConstraintImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.impl.ResourceConstraintImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.impl.ResourceConstraintImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceConstraintImpl extends ConstraintImpl implements ResourceConstraint {
	/**
	 * The cached value of the '{@link #getTupleDescriptors() <em>Tuple Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentResourceTupleDescriptor> tupleDescriptors;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptor lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptor rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.RESOURCE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentResourceTupleDescriptor> getTupleDescriptors() {
		if (tupleDescriptors == null) {
			tupleDescriptors = new EObjectContainmentEList<ComponentResourceTupleDescriptor>(ComponentResourceTupleDescriptor.class, this, AsPackage.RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS);
		}
		return tupleDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptor getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(ValueTupleDescriptor newLhs, NotificationChain msgs) {
		ValueTupleDescriptor oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.RESOURCE_CONSTRAINT__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(ValueTupleDescriptor newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.RESOURCE_CONSTRAINT__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.RESOURCE_CONSTRAINT__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.RESOURCE_CONSTRAINT__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptor getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(ValueTupleDescriptor newRhs, NotificationChain msgs) {
		ValueTupleDescriptor oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.RESOURCE_CONSTRAINT__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(ValueTupleDescriptor newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.RESOURCE_CONSTRAINT__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.RESOURCE_CONSTRAINT__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.RESOURCE_CONSTRAINT__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case AsPackage.RESOURCE_CONSTRAINT__LHS:
				return basicSetLhs(null, msgs);
			case AsPackage.RESOURCE_CONSTRAINT__RHS:
				return basicSetRhs(null, msgs);
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
			case AsPackage.RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case AsPackage.RESOURCE_CONSTRAINT__LHS:
				return getLhs();
			case AsPackage.RESOURCE_CONSTRAINT__RHS:
				return getRhs();
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
			case AsPackage.RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptor>)newValue);
				return;
			case AsPackage.RESOURCE_CONSTRAINT__LHS:
				setLhs((ValueTupleDescriptor)newValue);
				return;
			case AsPackage.RESOURCE_CONSTRAINT__RHS:
				setRhs((ValueTupleDescriptor)newValue);
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
			case AsPackage.RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case AsPackage.RESOURCE_CONSTRAINT__LHS:
				setLhs((ValueTupleDescriptor)null);
				return;
			case AsPackage.RESOURCE_CONSTRAINT__RHS:
				setRhs((ValueTupleDescriptor)null);
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
			case AsPackage.RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case AsPackage.RESOURCE_CONSTRAINT__LHS:
				return lhs != null;
			case AsPackage.RESOURCE_CONSTRAINT__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}


} //ResourceConstraintImpl
