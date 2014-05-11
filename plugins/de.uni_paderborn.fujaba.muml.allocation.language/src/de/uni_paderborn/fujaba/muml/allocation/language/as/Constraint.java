/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.as;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Constraint#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the OCL expression which is associated with this constraint.
	 * Instead of a plain EString a parsed OCL expression should be used
	 * in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionInOCL)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.as.AsPackage#getConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionInOCL getExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.as.Constraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionInOCL value);

} // Constraint
