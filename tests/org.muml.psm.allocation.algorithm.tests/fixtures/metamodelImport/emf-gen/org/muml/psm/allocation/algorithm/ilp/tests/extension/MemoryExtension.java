/**
 */
package org.muml.psm.allocation.algorithm.ilp.tests.extension;

import org.muml.core.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension#getAmountNeeded <em>Amount Needed</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.ExtensionPackage#getMemoryExtension()
 * @model
 * @generated
 */
public interface MemoryExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>Amount Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Needed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Needed</em>' attribute.
	 * @see #setAmountNeeded(int)
	 * @see org.muml.psm.allocation.algorithm.ilp.tests.extension.ExtensionPackage#getMemoryExtension_AmountNeeded()
	 * @model required="true"
	 * @generated
	 */
	int getAmountNeeded();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension#getAmountNeeded <em>Amount Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Needed</em>' attribute.
	 * @see #getAmountNeeded()
	 * @generated
	 */
	void setAmountNeeded(int value);

} // MemoryExtension
