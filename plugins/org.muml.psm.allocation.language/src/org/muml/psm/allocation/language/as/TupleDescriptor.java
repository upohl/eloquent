/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.pivot.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TupleDescriptor is used to define an expected tuple type. The tuple
 * type is either described by the typedPairs reference or by the sequencePart
 * attribute. Note that either typedPairs or sequencePart has to be set, but
 * not both.
 * 
 * The typedPairs reference consists of at least one typed pair. A typed
 * pair describes the source-target relationship of two distinct named parts
 * that belong to the same tuple type.
 * 
 * If the sequencePart attribute is set, the to be defined tuple type consists
 * of exactly one named part, whose name is the value of the sequencePart
 * attribute. The type of this named part is Sequence(OclAny).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.TupleDescriptor#getTypedPairs <em>Typed Pairs</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.TupleDescriptor#getSequencePart <em>Sequence Part</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getTupleDescriptor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typedPairsOrSequencePart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typedPairsOrSequencePart='let sequencePart : Boolean = not self.sequencePart.oclIsUndefined() and self.sequencePart &lt;&gt; \'\'\nin\nsequencePart implies self.typedPairs-&gt;isEmpty()\nand\nself.typedPairs-&gt;notEmpty() implies not sequencePart\nand\n(sequencePart or self.typedPairs-&gt;notEmpty())'"
 * @generated
 */
public interface TupleDescriptor extends Element {
	/**
	 * Returns the value of the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.as.TypedPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Pairs</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.as.AsPackage#getTupleDescriptor_TypedPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedPair> getTypedPairs();

	/**
	 * Returns the value of the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Part</em>' attribute.
	 * @see #setSequencePart(String)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getTupleDescriptor_SequencePart()
	 * @model
	 * @generated
	 */
	String getSequencePart();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.TupleDescriptor#getSequencePart <em>Sequence Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Part</em>' attribute.
	 * @see #getSequencePart()
	 * @generated
	 */
	void setSequencePart(String value);

} // TupleDescriptor
