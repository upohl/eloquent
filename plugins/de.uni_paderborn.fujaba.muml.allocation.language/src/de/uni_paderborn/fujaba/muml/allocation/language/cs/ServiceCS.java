/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.examples.xtext.base.basecs.NamedElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service CS</b></em>'.
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getServiceCS()
 * @model
 * @generated
 */
public interface ServiceCS extends NamedElementCS {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This containment contains all quality of service dimensions which
	 * belong to this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getServiceCS_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoSDimensionCS> getDimensions();

} // ServiceCS
