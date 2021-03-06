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

import org.eclipse.ocl.pivot.internal.ModelImpl;

import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.Constraint;
import org.muml.psm.allocation.language.as.Goal;
import org.muml.psm.allocation.language.as.MeasureFunction;
import org.muml.psm.allocation.language.as.NameProvider;
import org.muml.psm.allocation.language.as.OCLContext;
import org.muml.psm.allocation.language.as.Relation;
import org.muml.psm.allocation.language.as.Service;
import org.muml.psm.allocation.language.as.Specification;
import org.muml.psm.allocation.language.as.StorageProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getNameProvider <em>Name Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getStorageProvider <em>Storage Provider</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl#getOclContext <em>Ocl Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends ModelImpl implements Specification {
	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected MeasureFunction measure;

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
	 * The cached value of the '{@link #getNameProvider() <em>Name Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameProvider()
	 * @generated
	 * @ordered
	 */
	protected NameProvider nameProvider;

	/**
	 * The cached value of the '{@link #getStorageProvider() <em>Storage Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageProvider()
	 * @generated
	 * @ordered
	 */
	protected StorageProvider storageProvider;

	/**
	 * The cached value of the '{@link #getOclContext() <em>Ocl Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclContext()
	 * @generated
	 * @ordered
	 */
	protected OCLContext oclContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, AsPackage.SPECIFICATION__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, AsPackage.SPECIFICATION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, AsPackage.SPECIFICATION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureFunction getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureFunction newMeasure, NotificationChain msgs) {
		MeasureFunction oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__MEASURE, oldMeasure, newMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureFunction newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.SPECIFICATION__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.SPECIFICATION__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__MEASURE, newMeasure, newMeasure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameProvider getNameProvider() {
		if (nameProvider != null && nameProvider.eIsProxy()) {
			InternalEObject oldNameProvider = (InternalEObject)nameProvider;
			nameProvider = (NameProvider)eResolveProxy(oldNameProvider);
			if (nameProvider != oldNameProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsPackage.SPECIFICATION__NAME_PROVIDER, oldNameProvider, nameProvider));
			}
		}
		return nameProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameProvider basicGetNameProvider() {
		return nameProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameProvider(NameProvider newNameProvider) {
		NameProvider oldNameProvider = nameProvider;
		nameProvider = newNameProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__NAME_PROVIDER, oldNameProvider, nameProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageProvider getStorageProvider() {
		if (storageProvider != null && storageProvider.eIsProxy()) {
			InternalEObject oldStorageProvider = (InternalEObject)storageProvider;
			storageProvider = (StorageProvider)eResolveProxy(oldStorageProvider);
			if (storageProvider != oldStorageProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsPackage.SPECIFICATION__STORAGE_PROVIDER, oldStorageProvider, storageProvider));
			}
		}
		return storageProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageProvider basicGetStorageProvider() {
		return storageProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageProvider(StorageProvider newStorageProvider) {
		StorageProvider oldStorageProvider = storageProvider;
		storageProvider = newStorageProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__STORAGE_PROVIDER, oldStorageProvider, storageProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLContext getOclContext() {
		return oclContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOclContext(OCLContext newOclContext, NotificationChain msgs) {
		OCLContext oldOclContext = oclContext;
		oclContext = newOclContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__OCL_CONTEXT, oldOclContext, newOclContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclContext(OCLContext newOclContext) {
		if (newOclContext != oclContext) {
			NotificationChain msgs = null;
			if (oclContext != null)
				msgs = ((InternalEObject)oclContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsPackage.SPECIFICATION__OCL_CONTEXT, null, msgs);
			if (newOclContext != null)
				msgs = ((InternalEObject)newOclContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsPackage.SPECIFICATION__OCL_CONTEXT, null, msgs);
			msgs = basicSetOclContext(newOclContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.SPECIFICATION__OCL_CONTEXT, newOclContext, newOclContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsPackage.SPECIFICATION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case AsPackage.SPECIFICATION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case AsPackage.SPECIFICATION__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case AsPackage.SPECIFICATION__MEASURE:
				return basicSetMeasure(null, msgs);
			case AsPackage.SPECIFICATION__OCL_CONTEXT:
				return basicSetOclContext(null, msgs);
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
			case AsPackage.SPECIFICATION__RELATIONS:
				return getRelations();
			case AsPackage.SPECIFICATION__SERVICES:
				return getServices();
			case AsPackage.SPECIFICATION__CONSTRAINTS:
				return getConstraints();
			case AsPackage.SPECIFICATION__MEASURE:
				return getMeasure();
			case AsPackage.SPECIFICATION__GOAL:
				return getGoal();
			case AsPackage.SPECIFICATION__NAME_PROVIDER:
				if (resolve) return getNameProvider();
				return basicGetNameProvider();
			case AsPackage.SPECIFICATION__STORAGE_PROVIDER:
				if (resolve) return getStorageProvider();
				return basicGetStorageProvider();
			case AsPackage.SPECIFICATION__OCL_CONTEXT:
				return getOclContext();
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
			case AsPackage.SPECIFICATION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case AsPackage.SPECIFICATION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case AsPackage.SPECIFICATION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case AsPackage.SPECIFICATION__MEASURE:
				setMeasure((MeasureFunction)newValue);
				return;
			case AsPackage.SPECIFICATION__GOAL:
				setGoal((Goal)newValue);
				return;
			case AsPackage.SPECIFICATION__NAME_PROVIDER:
				setNameProvider((NameProvider)newValue);
				return;
			case AsPackage.SPECIFICATION__STORAGE_PROVIDER:
				setStorageProvider((StorageProvider)newValue);
				return;
			case AsPackage.SPECIFICATION__OCL_CONTEXT:
				setOclContext((OCLContext)newValue);
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
			case AsPackage.SPECIFICATION__RELATIONS:
				getRelations().clear();
				return;
			case AsPackage.SPECIFICATION__SERVICES:
				getServices().clear();
				return;
			case AsPackage.SPECIFICATION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case AsPackage.SPECIFICATION__MEASURE:
				setMeasure((MeasureFunction)null);
				return;
			case AsPackage.SPECIFICATION__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case AsPackage.SPECIFICATION__NAME_PROVIDER:
				setNameProvider((NameProvider)null);
				return;
			case AsPackage.SPECIFICATION__STORAGE_PROVIDER:
				setStorageProvider((StorageProvider)null);
				return;
			case AsPackage.SPECIFICATION__OCL_CONTEXT:
				setOclContext((OCLContext)null);
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
			case AsPackage.SPECIFICATION__RELATIONS:
				return relations != null && !relations.isEmpty();
			case AsPackage.SPECIFICATION__SERVICES:
				return services != null && !services.isEmpty();
			case AsPackage.SPECIFICATION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case AsPackage.SPECIFICATION__MEASURE:
				return measure != null;
			case AsPackage.SPECIFICATION__GOAL:
				return goal != GOAL_EDEFAULT;
			case AsPackage.SPECIFICATION__NAME_PROVIDER:
				return nameProvider != null;
			case AsPackage.SPECIFICATION__STORAGE_PROVIDER:
				return storageProvider != null;
			case AsPackage.SPECIFICATION__OCL_CONTEXT:
				return oclContext != null;
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
		result.append(" (goal: ");
		result.append(goal);
		result.append(')');
		return result.toString();
	}


} //SpecificationImpl
