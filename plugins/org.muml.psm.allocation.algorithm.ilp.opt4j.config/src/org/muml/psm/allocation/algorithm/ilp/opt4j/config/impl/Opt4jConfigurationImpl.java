/**
 */
package org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage;
import org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt4j Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl#getPopulationSize <em>Population Size</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl#getGenerations <em>Generations</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl#getOffspring <em>Offspring</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.impl.Opt4jConfigurationImpl#isNoDominatedSolutions <em>No Dominated Solutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Opt4jConfigurationImpl extends MinimalEObjectImpl.Container implements Opt4jConfiguration {
	/**
	 * The default value of the '{@link #getPopulationSize() <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_SIZE_EDEFAULT = 500;

	/**
	 * The cached value of the '{@link #getPopulationSize() <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSize()
	 * @generated
	 * @ordered
	 */
	protected int populationSize = POPULATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerations() <em>Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerations()
	 * @generated
	 * @ordered
	 */
	protected static final int GENERATIONS_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getGenerations() <em>Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerations()
	 * @generated
	 * @ordered
	 */
	protected int generations = GENERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParents() <em>Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected static final int PARENTS_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected int parents = PARENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffspring() <em>Offspring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffspring()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSPRING_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getOffspring() <em>Offspring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffspring()
	 * @generated
	 * @ordered
	 */
	protected int offspring = OFFSPRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoDominatedSolutions() <em>No Dominated Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDominatedSolutions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DOMINATED_SOLUTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoDominatedSolutions() <em>No Dominated Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDominatedSolutions()
	 * @generated
	 * @ordered
	 */
	protected boolean noDominatedSolutions = NO_DOMINATED_SOLUTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Opt4jConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.OPT4J_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulationSize() {
		return populationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationSize(int newPopulationSize) {
		int oldPopulationSize = populationSize;
		populationSize = newPopulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.OPT4J_CONFIGURATION__POPULATION_SIZE, oldPopulationSize, populationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGenerations() {
		return generations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerations(int newGenerations) {
		int oldGenerations = generations;
		generations = newGenerations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.OPT4J_CONFIGURATION__GENERATIONS, oldGenerations, generations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParents() {
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParents(int newParents) {
		int oldParents = parents;
		parents = newParents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.OPT4J_CONFIGURATION__PARENTS, oldParents, parents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffspring() {
		return offspring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffspring(int newOffspring) {
		int oldOffspring = offspring;
		offspring = newOffspring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.OPT4J_CONFIGURATION__OFFSPRING, oldOffspring, offspring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoDominatedSolutions() {
		return noDominatedSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDominatedSolutions(boolean newNoDominatedSolutions) {
		boolean oldNoDominatedSolutions = noDominatedSolutions;
		noDominatedSolutions = newNoDominatedSolutions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS, oldNoDominatedSolutions, noDominatedSolutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.OPT4J_CONFIGURATION__POPULATION_SIZE:
				return getPopulationSize();
			case ConfigPackage.OPT4J_CONFIGURATION__GENERATIONS:
				return getGenerations();
			case ConfigPackage.OPT4J_CONFIGURATION__PARENTS:
				return getParents();
			case ConfigPackage.OPT4J_CONFIGURATION__OFFSPRING:
				return getOffspring();
			case ConfigPackage.OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS:
				return isNoDominatedSolutions();
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
			case ConfigPackage.OPT4J_CONFIGURATION__POPULATION_SIZE:
				setPopulationSize((Integer)newValue);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__GENERATIONS:
				setGenerations((Integer)newValue);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__PARENTS:
				setParents((Integer)newValue);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__OFFSPRING:
				setOffspring((Integer)newValue);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS:
				setNoDominatedSolutions((Boolean)newValue);
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
			case ConfigPackage.OPT4J_CONFIGURATION__POPULATION_SIZE:
				setPopulationSize(POPULATION_SIZE_EDEFAULT);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__GENERATIONS:
				setGenerations(GENERATIONS_EDEFAULT);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__PARENTS:
				setParents(PARENTS_EDEFAULT);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__OFFSPRING:
				setOffspring(OFFSPRING_EDEFAULT);
				return;
			case ConfigPackage.OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS:
				setNoDominatedSolutions(NO_DOMINATED_SOLUTIONS_EDEFAULT);
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
			case ConfigPackage.OPT4J_CONFIGURATION__POPULATION_SIZE:
				return populationSize != POPULATION_SIZE_EDEFAULT;
			case ConfigPackage.OPT4J_CONFIGURATION__GENERATIONS:
				return generations != GENERATIONS_EDEFAULT;
			case ConfigPackage.OPT4J_CONFIGURATION__PARENTS:
				return parents != PARENTS_EDEFAULT;
			case ConfigPackage.OPT4J_CONFIGURATION__OFFSPRING:
				return offspring != OFFSPRING_EDEFAULT;
			case ConfigPackage.OPT4J_CONFIGURATION__NO_DOMINATED_SOLUTIONS:
				return noDominatedSolutions != NO_DOMINATED_SOLUTIONS_EDEFAULT;
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
		result.append(" (populationSize: ");
		result.append(populationSize);
		result.append(", generations: ");
		result.append(generations);
		result.append(", parents: ");
		result.append(parents);
		result.append(", offspring: ");
		result.append(offspring);
		result.append(", noDominatedSolutions: ");
		result.append(noDominatedSolutions);
		result.append(')');
		return result.toString();
	}

} //Opt4jConfigurationImpl
