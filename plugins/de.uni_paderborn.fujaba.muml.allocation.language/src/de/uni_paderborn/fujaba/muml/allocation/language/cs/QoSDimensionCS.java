/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.examples.xtext.base.basecs.NamedElementCS;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ContextCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SDimension CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a quality of service dimension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS#getTupleDescriptors <em>Tuple Descriptors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getQoSDimensionCS()
 * @model
 * @generated
 */
public interface QoSDimensionCS extends NamedElementCS {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the OCL expression, which represents the metric of this quality of
	 * service dimension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference.
	 * @see #setMetric(ContextCS)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getQoSDimensionCS_Metric()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContextCS getMetric();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS#getMetric <em>Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' containment reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ContextCS value);

	/**
	 * Returns the value of the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getQoSDimensionCS_TupleDescriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentResourceTupleDescriptorCS> getTupleDescriptors();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueTupleDescriptorCS)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getQoSDimensionCS_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueTupleDescriptorCS getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueTupleDescriptorCS value);

} // QoSDimensionCS
