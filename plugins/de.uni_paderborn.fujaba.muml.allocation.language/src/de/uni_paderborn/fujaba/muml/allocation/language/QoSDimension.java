/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SDimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a quality of service dimension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getQoSDimension()
 * @model
 * @generated
 */
public interface QoSDimension extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the OCL expression which represents the metric of this quality of
	 * service dimension. Instead of a plain EString a parsed OCL expression
	 * should be used in the future.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(String)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getQoSDimension_Metric()
	 * @model required="true"
	 * @generated
	 */
	String getMetric();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(String value);

	/**
	 * Returns the value of the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getQoSDimension_TupleDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentResourceTupleDescriptor> getTupleDescriptors();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueTupleDescriptor)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguagePackage#getQoSDimension_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptor getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueTupleDescriptor value);

} // QoSDimension
