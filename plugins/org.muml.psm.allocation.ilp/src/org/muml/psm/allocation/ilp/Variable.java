/**
 */
package org.muml.psm.allocation.ilp;

import org.muml.mumlcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a variable, which is used in an Integer Linear Program.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.ilp.Variable#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.ilp.IlpPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.psm.allocation.ilp.ILPDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the data type of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.muml.psm.allocation.ilp.ILPDataType
	 * @see #setDataType(ILPDataType)
	 * @see org.muml.psm.allocation.ilp.IlpPackage#getVariable_DataType()
	 * @model required="true"
	 * @generated
	 */
	ILPDataType getDataType();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.ilp.Variable#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.muml.psm.allocation.ilp.ILPDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ILPDataType value);

} // Variable
