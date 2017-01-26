/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.ocl.xtext.basecs.NamedElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a relation. A relation is used to relate source objects
 * to at least lowerBound many and at most upperBound many target objects.
 * 
 * XXX: in some sense RelationCS is also a constraint - should we inherit from
 * ConstraintCS?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.RelationCS#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.RelationCS#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.RelationCS#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getRelationCS()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='exactlyOnePair'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot exactlyOnePair='self.tupleDescriptor.typedPairs->size() = 1'"
 * @generated
 */
public interface RelationCS extends NamedElementCS, EvaluatableElementCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A tuple descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(TupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getRelationCS_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleDescriptorCS getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.RelationCS#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(TupleDescriptorCS value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A lower bound (see documentation of the RelationCS class).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(BoundCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getRelationCS_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoundCS getLowerBound();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.RelationCS#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(BoundCS value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An upper bound (see documentation of the RelationCS class).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(BoundCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getRelationCS_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoundCS getUpperBound();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.RelationCS#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(BoundCS value);

} // RelationCS
