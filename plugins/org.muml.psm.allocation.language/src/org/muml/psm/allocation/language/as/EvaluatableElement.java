/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluatable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an abstract, evaluatable domain element, that is an
 * element for which an OCL expression can be specified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.EvaluatableElement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getEvaluatableElement()
 * @model abstract="true"
 * @generated
 */
public interface EvaluatableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the concrete syntax of an OCL expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionInOCL)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getEvaluatableElement_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionInOCL getExpression();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.EvaluatableElement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionInOCL value);

} // EvaluatableElement
