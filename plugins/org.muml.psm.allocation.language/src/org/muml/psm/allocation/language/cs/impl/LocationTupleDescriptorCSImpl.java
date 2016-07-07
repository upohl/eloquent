/**
 */
package org.muml.psm.allocation.language.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.LocationTupleDescriptorCSImpl#getSecondInstance <em>Second Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationTupleDescriptorCSImpl extends InstanceTupleDescriptorCSImpl implements LocationTupleDescriptorCS {
	/**
	 * The default value of the '{@link #getSecondInstance() <em>Second Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondInstance() <em>Second Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondInstance()
	 * @generated
	 * @ordered
	 */
	protected String secondInstance = SECOND_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTupleDescriptorCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.LOCATION_TUPLE_DESCRIPTOR_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondInstance() {
		return secondInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondInstance(String newSecondInstance) {
		String oldSecondInstance = secondInstance;
		secondInstance = newSecondInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE, oldSecondInstance, secondInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE:
				return getSecondInstance();
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
			case CsPackage.LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE:
				setSecondInstance((String)newValue);
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
			case CsPackage.LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE:
				setSecondInstance(SECOND_INSTANCE_EDEFAULT);
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
			case CsPackage.LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE:
				return SECOND_INSTANCE_EDEFAULT == null ? secondInstance != null : !SECOND_INSTANCE_EDEFAULT.equals(secondInstance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitLocationTupleDescriptorCS(this);
	}

} //LocationTupleDescriptorCSImpl
