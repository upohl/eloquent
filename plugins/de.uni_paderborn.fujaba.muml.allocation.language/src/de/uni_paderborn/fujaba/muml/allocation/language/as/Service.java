/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.examples.pivot.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a service. A service represents a particular function
 * of the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Service#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.as.QoSDimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This containment contains all quality of service dimensions which
	 * belong to this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getService_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoSDimension> getDimensions();

} // Service
