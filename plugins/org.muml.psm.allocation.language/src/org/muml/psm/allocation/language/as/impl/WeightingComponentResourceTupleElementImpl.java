/**
 */
package org.muml.psm.allocation.language.as.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.internal.ElementImpl;
import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor;
import org.muml.psm.allocation.language.as.ValueTupleDescriptor;
import org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weighting Component Resource Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.WeightingComponentResourceTupleElementImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.WeightingComponentResourceTupleElementImpl#getWeighting <em>Weighting</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WeightingComponentResourceTupleElementImpl extends ElementImpl implements WeightingComponentResourceTupleElement {
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
	 * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighting()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptor weighting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightingComponentResourceTupleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentResourceTupleDescriptor> getTupleDescriptors() {
		if (tupleDescriptors == null) {
			tupleDescriptors = new EObjectContainmentEList<ComponentResourceTupleDescriptor>(ComponentResourceTupleDescriptor.class, this, AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS);
		}
		return tupleDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptor getWeighting() {
		return weighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeighting(ValueTupleDescriptor newWeighting, NotificationChain msgs) {
		ValueTupleDescriptor oldWeighting = weighting;
		weighting = newWeighting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING, oldWeighting, newWeighting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighting(ValueTupleDescriptor newWeighting) {
		if (newWeighting != weighting) {
			NotificationChain msgs = null;
			if (weighting != null)
				msgs = ((InternalEObject)weighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING, null, msgs);
			if (newWeighting != null)
				msgs = ((InternalEObject)newWeighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING, null, msgs);
			msgs = basicSetWeighting(newWeighting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING, newWeighting, newWeighting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING:
				return basicSetWeighting(null, msgs);
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
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING:
				return getWeighting();
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
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptor>)newValue);
				return;
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING:
				setWeighting((ValueTupleDescriptor)newValue);
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
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING:
				setWeighting((ValueTupleDescriptor)null);
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
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case AsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING:
				return weighting != null;
		}
		return super.eIsSet(featureID);
	}


} //WeightingComponentResourceTupleElementImpl
