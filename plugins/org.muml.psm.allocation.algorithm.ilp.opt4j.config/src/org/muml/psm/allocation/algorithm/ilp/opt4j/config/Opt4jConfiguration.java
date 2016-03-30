/**
 */
package org.muml.psm.allocation.algorithm.ilp.opt4j.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt4j Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getPopulationSize <em>Population Size</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getGenerations <em>Generations</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getParents <em>Parents</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getOffspring <em>Offspring</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#isNoDominatedSolutions <em>No Dominated Solutions</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage#getOpt4jConfiguration()
 * @model
 * @generated
 */
public interface Opt4jConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Population Size</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the EA population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population Size</em>' attribute.
	 * @see #setPopulationSize(int)
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage#getOpt4jConfiguration_PopulationSize()
	 * @model default="500" required="true"
	 * @generated
	 */
	int getPopulationSize();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getPopulationSize <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Size</em>' attribute.
	 * @see #getPopulationSize()
	 * @generated
	 */
	void setPopulationSize(int value);

	/**
	 * Returns the value of the '<em><b>Generations</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of generations (a.k.a. number of iterations).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generations</em>' attribute.
	 * @see #setGenerations(int)
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage#getOpt4jConfiguration_Generations()
	 * @model default="100" required="true"
	 * @generated
	 */
	int getGenerations();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getGenerations <em>Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generations</em>' attribute.
	 * @see #getGenerations()
	 * @generated
	 */
	void setGenerations(int value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of parents that are used for mating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parents</em>' attribute.
	 * @see #setParents(int)
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage#getOpt4jConfiguration_Parents()
	 * @model default="50" required="true"
	 * @generated
	 */
	int getParents();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getParents <em>Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parents</em>' attribute.
	 * @see #getParents()
	 * @generated
	 */
	void setParents(int value);

	/**
	 * Returns the value of the '<em><b>Offspring</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of new individuals per generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offspring</em>' attribute.
	 * @see #setOffspring(int)
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage#getOpt4jConfiguration_Offspring()
	 * @model default="20" required="true"
	 * @generated
	 */
	int getOffspring();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#getOffspring <em>Offspring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offspring</em>' attribute.
	 * @see #getOffspring()
	 * @generated
	 */
	void setOffspring(int value);

	/**
	 * Returns the value of the '<em><b>No Dominated Solutions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No solution is (weakly) dominated by another solution.
	 * That is, each solution is optimal. Note: the objective function, which
	 * is defined in the allocation problem, is ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Dominated Solutions</em>' attribute.
	 * @see #setNoDominatedSolutions(boolean)
	 * @see org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigPackage#getOpt4jConfiguration_NoDominatedSolutions()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNoDominatedSolutions();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration#isNoDominatedSolutions <em>No Dominated Solutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Dominated Solutions</em>' attribute.
	 * @see #isNoDominatedSolutions()
	 * @generated
	 */
	void setNoDominatedSolutions(boolean value);

} // Opt4jConfiguration
