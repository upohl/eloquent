/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StorageProvider is used to store relations between model objects.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getStorageProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StorageProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method can be used to initialize the StorageProvider. This method
	 * is called only once. It is called before any call to the "store" method is
	 * made. The context parameter is the context object that is passed to
	 * the qvto transformation.
	 * <!-- end-model-doc -->
	 * @model contextDataType="org.eclipse.ocl.pivot.Object" contextRequired="true"
	 * @generated
	 */
	void initialize(Object context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Store the relation between the object "source" and the object "target".
	 * This method might return an arbitrary object or null. If it returns an object,
	 * it is passed to a qvto transformation - so it should implement the EObject
	 * interface.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.ocl.pivot.Object" required="true" sourceDataType="org.eclipse.ocl.pivot.Object" sourceRequired="true" targetDataType="org.eclipse.ocl.pivot.Object" targetRequired="true"
	 * @generated
	 */
	Object store(Object source, Object target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Called if no relation could be found that satisfies all constraints. Can
	 * be used to return, for instance, an empty SystemAllocation object or null.
	 * Note: maybe we will remove this method again (for now, we just introduced
	 * it to pass the existing testcases (in particular
	 * algorithmMain/nonexistenAllocation.allocation_specification)).
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.ocl.pivot.Object" required="true"
	 * @generated
	 */
	Object noRelationFound();

} // StorageProvider
