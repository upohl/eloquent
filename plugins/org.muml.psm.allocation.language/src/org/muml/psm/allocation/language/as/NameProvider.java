/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A NameProvider is used to compute a (unique) name for a given model element.
 * That is, there exists a bijection between the set of names returned by a NameProvider
 * instance and the set of objects that were passed to this NameProvider instance's
 * getName method.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getNameProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NameProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementDataType="org.eclipse.ocl.pivot.Object" elementRequired="true"
	 * @generated
	 */
	String getName(Object element);

} // NameProvider
