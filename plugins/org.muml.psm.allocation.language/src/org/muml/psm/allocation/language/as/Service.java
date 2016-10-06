/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.pivot.NamedElement;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.Service#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.as.QoSDimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This containment contains all quality of service dimensions which
	 * belong to this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.as.AsPackage#getService_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoSDimension> getDimensions();

} // Service
