/**
 */
package org.muml.psm.allocation.language.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.eclipse.ocl.xtext.completeoclcs.impl.CompleteOCLDocumentCSImpl;

import org.muml.core.CorePackage;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;

import org.muml.psm.allocation.language.cs.ConstraintCS;
import org.muml.psm.allocation.language.cs.CsPackage;
import org.muml.psm.allocation.language.cs.Goal;
import org.muml.psm.allocation.language.cs.JavaImplementationProviderCS;
import org.muml.psm.allocation.language.cs.MeasureFunctionCS;
import org.muml.psm.allocation.language.cs.NameProviderCS;
import org.muml.psm.allocation.language.cs.ServiceCS;
import org.muml.psm.allocation.language.cs.SpecificationCS;
import org.muml.psm.allocation.language.cs.StorageProviderCS;

import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getNameProviderImplementationClass <em>Name Provider Implementation Class</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getNameProvider <em>Name Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getStorageProviderImplementationClass <em>Storage Provider Implementation Class</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl#getStorageProvider <em>Storage Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationCSImpl extends CompleteOCLDocumentCSImpl implements SpecificationCS {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCS> services;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintCS> constraints;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected MeasureFunctionCS measure;

	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Goal GOAL_EDEFAULT = Goal.MAX;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal = GOAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameProviderImplementationClass() <em>Name Provider Implementation Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameProviderImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected JavaImplementationProviderCS nameProviderImplementationClass;

	/**
	 * The cached value of the '{@link #getNameProvider() <em>Name Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameProvider()
	 * @generated
	 * @ordered
	 */
	protected NameProviderCS nameProvider;

	/**
	 * The cached value of the '{@link #getStorageProviderImplementationClass() <em>Storage Provider Implementation Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageProviderImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected JavaImplementationProviderCS storageProviderImplementationClass;

	/**
	 * The cached value of the '{@link #getStorageProvider() <em>Storage Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageProvider()
	 * @generated
	 * @ordered
	 */
	protected StorageProviderCS storageProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SPECIFICATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList<Extension>(Extension.class, this, CsPackage.SPECIFICATION_CS__EXTENSIONS, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceCS> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<ServiceCS>(ServiceCS.class, this, CsPackage.SPECIFICATION_CS__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintCS> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ConstraintCS>(ConstraintCS.class, this, CsPackage.SPECIFICATION_CS__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureFunctionCS getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureFunctionCS newMeasure, NotificationChain msgs) {
		MeasureFunctionCS oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__MEASURE, oldMeasure, newMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureFunctionCS newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		Goal oldGoal = goal;
		goal = newGoal == null ? GOAL_EDEFAULT : newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaImplementationProviderCS getNameProviderImplementationClass() {
		return nameProviderImplementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameProviderImplementationClass(JavaImplementationProviderCS newNameProviderImplementationClass, NotificationChain msgs) {
		JavaImplementationProviderCS oldNameProviderImplementationClass = nameProviderImplementationClass;
		nameProviderImplementationClass = newNameProviderImplementationClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS, oldNameProviderImplementationClass, newNameProviderImplementationClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameProviderImplementationClass(JavaImplementationProviderCS newNameProviderImplementationClass) {
		if (newNameProviderImplementationClass != nameProviderImplementationClass) {
			NotificationChain msgs = null;
			if (nameProviderImplementationClass != null)
				msgs = ((InternalEObject)nameProviderImplementationClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS, null, msgs);
			if (newNameProviderImplementationClass != null)
				msgs = ((InternalEObject)newNameProviderImplementationClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS, null, msgs);
			msgs = basicSetNameProviderImplementationClass(newNameProviderImplementationClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS, newNameProviderImplementationClass, newNameProviderImplementationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameProviderCS getNameProvider() {
		if (nameProvider != null && ((EObject)nameProvider).eIsProxy()) {
			InternalEObject oldNameProvider = (InternalEObject)nameProvider;
			nameProvider = (NameProviderCS)eResolveProxy(oldNameProvider);
			if (nameProvider != oldNameProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SPECIFICATION_CS__NAME_PROVIDER, oldNameProvider, nameProvider));
			}
		}
		return nameProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameProviderCS basicGetNameProvider() {
		return nameProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameProvider(NameProviderCS newNameProvider) {
		NameProviderCS oldNameProvider = nameProvider;
		nameProvider = newNameProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__NAME_PROVIDER, oldNameProvider, nameProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaImplementationProviderCS getStorageProviderImplementationClass() {
		return storageProviderImplementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageProviderImplementationClass(JavaImplementationProviderCS newStorageProviderImplementationClass, NotificationChain msgs) {
		JavaImplementationProviderCS oldStorageProviderImplementationClass = storageProviderImplementationClass;
		storageProviderImplementationClass = newStorageProviderImplementationClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS, oldStorageProviderImplementationClass, newStorageProviderImplementationClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageProviderImplementationClass(JavaImplementationProviderCS newStorageProviderImplementationClass) {
		if (newStorageProviderImplementationClass != storageProviderImplementationClass) {
			NotificationChain msgs = null;
			if (storageProviderImplementationClass != null)
				msgs = ((InternalEObject)storageProviderImplementationClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS, null, msgs);
			if (newStorageProviderImplementationClass != null)
				msgs = ((InternalEObject)newStorageProviderImplementationClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS, null, msgs);
			msgs = basicSetStorageProviderImplementationClass(newStorageProviderImplementationClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS, newStorageProviderImplementationClass, newStorageProviderImplementationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageProviderCS getStorageProvider() {
		if (storageProvider != null && ((EObject)storageProvider).eIsProxy()) {
			InternalEObject oldStorageProvider = (InternalEObject)storageProvider;
			storageProvider = (StorageProviderCS)eResolveProxy(oldStorageProvider);
			if (storageProvider != oldStorageProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER, oldStorageProvider, storageProvider));
			}
		}
		return storageProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageProviderCS basicGetStorageProvider() {
		return storageProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageProvider(StorageProviderCS newStorageProvider) {
		StorageProviderCS oldStorageProvider = storageProvider;
		storageProvider = newStorageProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER, oldStorageProvider, storageProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(final EClass type) {
		EList<Extension> extensions = this.getExtensions();
						for (Extension extension : extensions) {
							if (type.isInstance(extension)) {
								return extension;
							}
						}
						return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.SPECIFICATION_CS__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.SPECIFICATION_CS__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case CsPackage.SPECIFICATION_CS__MEASURE:
				return basicSetMeasure(null, msgs);
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS:
				return basicSetNameProviderImplementationClass(null, msgs);
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS:
				return basicSetStorageProviderImplementationClass(null, msgs);
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
			case CsPackage.SPECIFICATION_CS__EXTENSIONS:
				return getExtensions();
			case CsPackage.SPECIFICATION_CS__SERVICES:
				return getServices();
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				return getConstraints();
			case CsPackage.SPECIFICATION_CS__MEASURE:
				return getMeasure();
			case CsPackage.SPECIFICATION_CS__GOAL:
				return getGoal();
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS:
				return getNameProviderImplementationClass();
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER:
				if (resolve) return getNameProvider();
				return basicGetNameProvider();
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS:
				return getStorageProviderImplementationClass();
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER:
				if (resolve) return getStorageProvider();
				return basicGetStorageProvider();
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
			case CsPackage.SPECIFICATION_CS__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServiceCS>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintCS>)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__MEASURE:
				setMeasure((MeasureFunctionCS)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__GOAL:
				setGoal((Goal)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS:
				setNameProviderImplementationClass((JavaImplementationProviderCS)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER:
				setNameProvider((NameProviderCS)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS:
				setStorageProviderImplementationClass((JavaImplementationProviderCS)newValue);
				return;
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER:
				setStorageProvider((StorageProviderCS)newValue);
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
			case CsPackage.SPECIFICATION_CS__EXTENSIONS:
				getExtensions().clear();
				return;
			case CsPackage.SPECIFICATION_CS__SERVICES:
				getServices().clear();
				return;
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CsPackage.SPECIFICATION_CS__MEASURE:
				setMeasure((MeasureFunctionCS)null);
				return;
			case CsPackage.SPECIFICATION_CS__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS:
				setNameProviderImplementationClass((JavaImplementationProviderCS)null);
				return;
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER:
				setNameProvider((NameProviderCS)null);
				return;
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS:
				setStorageProviderImplementationClass((JavaImplementationProviderCS)null);
				return;
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER:
				setStorageProvider((StorageProviderCS)null);
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
			case CsPackage.SPECIFICATION_CS__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case CsPackage.SPECIFICATION_CS__SERVICES:
				return services != null && !services.isEmpty();
			case CsPackage.SPECIFICATION_CS__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CsPackage.SPECIFICATION_CS__MEASURE:
				return measure != null;
			case CsPackage.SPECIFICATION_CS__GOAL:
				return goal != GOAL_EDEFAULT;
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS:
				return nameProviderImplementationClass != null;
			case CsPackage.SPECIFICATION_CS__NAME_PROVIDER:
				return nameProvider != null;
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS:
				return storageProviderImplementationClass != null;
			case CsPackage.SPECIFICATION_CS__STORAGE_PROVIDER:
				return storageProvider != null;
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
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.SPECIFICATION_CS__EXTENSIONS: return CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;
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
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS: return CsPackage.SPECIFICATION_CS__EXTENSIONS;
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
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((LanguageSpecificationCSVisitor<?>)visitor).visitSpecificationCS(this);
	}

} //SpecificationCSImpl
