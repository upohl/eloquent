/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.oclcontext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage
 * @generated
 */
public interface OclcontextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OclcontextFactory eINSTANCE = de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.impl.OclcontextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OCL Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Context</em>'.
	 * @generated
	 */
	OCLContext createOCLContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OclcontextPackage getOclcontextPackage();

} //OclcontextFactory
