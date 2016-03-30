/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Hardware Resource Instance Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a "required hardware resource instance" constraint
 * which can be used to limit the number of potential hardware resource
 * instances for a specific component instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getRequiredHardwareResourceInstanceConstraint()
 * @model
 * @generated
 */
public interface RequiredHardwareResourceInstanceConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptors</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.as.AsPackage#getRequiredHardwareResourceInstanceConstraint_TupleDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentResourceTupleDescriptor> getTupleDescriptors();

} // RequiredHardwareResourceInstanceConstraint
