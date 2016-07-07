/**
 */
package org.muml.psm.allocation.language.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS;
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceConstraintCSImpl extends ConstraintCSImpl implements ResourceConstraintCS {
	/**
	 * The cached value of the '{@link #getTupleDescriptors() <em>Tuple Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentResourceTupleDescriptorCS> tupleDescriptors;

	/**
	 * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeighting()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptorCS weighting;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected ValueTupleDescriptorCS rhs;

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
	public EList<ComponentResourceTupleDescriptorCS> getTupleDescriptors() {
		if (tupleDescriptors == null) {
			tupleDescriptors = new EObjectContainmentEList<ComponentResourceTupleDescriptorCS>(ComponentResourceTupleDescriptorCS.class, this, CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS);
		}
		return tupleDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptorCS getWeighting() {
		return weighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeighting(ValueTupleDescriptorCS newWeighting, NotificationChain msgs) {
		ValueTupleDescriptorCS oldWeighting = weighting;
		weighting = newWeighting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING, oldWeighting, newWeighting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighting(ValueTupleDescriptorCS newWeighting) {
		if (newWeighting != weighting) {
			NotificationChain msgs = null;
			if (weighting != null)
				msgs = ((InternalEObject)weighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING, null, msgs);
			if (newWeighting != null)
				msgs = ((InternalEObject)newWeighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING, null, msgs);
			msgs = basicSetWeighting(newWeighting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING, newWeighting, newWeighting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTupleDescriptorCS getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(ValueTupleDescriptorCS newRhs, NotificationChain msgs) {
		ValueTupleDescriptorCS oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.RESOURCE_CONSTRAINT_CS__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(ValueTupleDescriptorCS newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.RESOURCE_CONSTRAINT_CS__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.RESOURCE_CONSTRAINT_CS__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RESOURCE_CONSTRAINT_CS__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS:
				return ((InternalEList<?>)getTupleDescriptors()).basicRemove(otherEnd, msgs);
			case CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING:
				return basicSetWeighting(null, msgs);
			case CsPackage.RESOURCE_CONSTRAINT_CS__RHS:
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS:
				return getTupleDescriptors();
			case CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING:
				return getWeighting();
			case CsPackage.RESOURCE_CONSTRAINT_CS__RHS:
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				getTupleDescriptors().addAll((Collection<? extends ComponentResourceTupleDescriptorCS>)newValue);
				return;
			case CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING:
				setWeighting((ValueTupleDescriptorCS)newValue);
				return;
			case CsPackage.RESOURCE_CONSTRAINT_CS__RHS:
				setRhs((ValueTupleDescriptorCS)newValue);
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS:
				getTupleDescriptors().clear();
				return;
			case CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING:
				setWeighting((ValueTupleDescriptorCS)null);
				return;
			case CsPackage.RESOURCE_CONSTRAINT_CS__RHS:
				setRhs((ValueTupleDescriptorCS)null);
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
			case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS:
				return tupleDescriptors != null && !tupleDescriptors.isEmpty();
			case CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING:
				return weighting != null;
			case CsPackage.RESOURCE_CONSTRAINT_CS__RHS:
				return rhs != null;
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
		if (baseClass == WeightingComponentResourceTupleElementCS.class) {
			switch (derivedFeatureID) {
				case CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS: return CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS;
				case CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING: return CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING;
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
		if (baseClass == WeightingComponentResourceTupleElementCS.class) {
			switch (baseFeatureID) {
				case CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS: return CsPackage.RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS;
				case CsPackage.WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING: return CsPackage.RESOURCE_CONSTRAINT_CS__WEIGHTING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitResourceConstraintCS(this);
	}

} //ResourceConstraintCSImpl
