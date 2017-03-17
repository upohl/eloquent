/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TupleDescriptor is used to define an expected tuple type. It consists
 * of at least one typed pair. A typed pair describes the source-target
 * relationship of two distinct named parts that belong to the same tuple
 * type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.TupleDescriptorCS#getTypedPairs <em>Typed Pairs</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getTupleDescriptorCS()
 * @model
 * @generated
 */
public interface TupleDescriptorCS extends ModelElementCS {
	/**
	 * Returns the value of the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.cs.TypedPairCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Pairs</em>' containment reference list.
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getTupleDescriptorCS_TypedPairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TypedPairCS> getTypedPairs();

} // TupleDescriptorCS
