/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Provider CS</b></em>'.
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
 * @see org.muml.psm.allocation.language.cs.CsPackage#getNameProviderCS()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NameProviderCS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementDataType="org.eclipse.ocl.pivot.Object" elementRequired="true"
	 * @generated
	 */
	String getName(Object element);

} // NameProviderCS
