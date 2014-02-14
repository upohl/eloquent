/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the measure function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.MeasureFunction#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getMeasureFunction()
 * @model
 * @generated
 */
public interface MeasureFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of services which are used as summands in the measure function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getMeasureFunction_Services()
	 * @model
	 * @generated
	 */
	EList<Service> getServices();

} // MeasureFunction
