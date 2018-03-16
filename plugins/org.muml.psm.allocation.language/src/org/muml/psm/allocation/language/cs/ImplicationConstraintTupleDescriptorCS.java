/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication Constraint Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ImplicationConstraintTupleDescriptorCS is used to describe the following
 * OCL tuple type:
 * 
 * Tuple(
 * 	premise : Tuple(premiseTupleDescriptor),
 * 	conclusion : Tuple(conclusionTupleDescriptor)
 * )
 * 
 * where Tuple(xxxTupleDescriptor) represents the Tuple type that is
 * described by the xxxTupleDescriptor. Moreover, premise and conclusion
 * refer to the IDs that are represented by the premise and conclusion attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremiseTupleDescriptor <em>Premise Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusionTupleDescriptor <em>Conclusion Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintTupleDescriptorCS()
 * @model
 * @generated
 */
public interface ImplicationConstraintTupleDescriptorCS extends ModelElementCS {
	/**
	 * Returns the value of the '<em><b>Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the named part that represents the premise set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise</em>' attribute.
	 * @see #setPremise(String)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintTupleDescriptorCS_Premise()
	 * @model required="true"
	 * @generated
	 */
	String getPremise();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremise <em>Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise</em>' attribute.
	 * @see #getPremise()
	 * @generated
	 */
	void setPremise(String value);

	/**
	 * Returns the value of the '<em><b>Premise Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple descriptor that describes the tuple type of the premise set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Tuple Descriptor</em>' containment reference.
	 * @see #setPremiseTupleDescriptor(TupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintTupleDescriptorCS_PremiseTupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleDescriptorCS getPremiseTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremiseTupleDescriptor <em>Premise Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Tuple Descriptor</em>' containment reference.
	 * @see #getPremiseTupleDescriptor()
	 * @generated
	 */
	void setPremiseTupleDescriptor(TupleDescriptorCS value);

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the named part that represents the conclusion set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conclusion</em>' attribute.
	 * @see #setConclusion(String)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintTupleDescriptorCS_Conclusion()
	 * @model required="true"
	 * @generated
	 */
	String getConclusion();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusion <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' attribute.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(String value);

	/**
	 * Returns the value of the '<em><b>Conclusion Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple descriptor that describes the tuple type of the conclusion set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conclusion Tuple Descriptor</em>' containment reference.
	 * @see #setConclusionTupleDescriptor(TupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getImplicationConstraintTupleDescriptorCS_ConclusionTupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleDescriptorCS getConclusionTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusionTupleDescriptor <em>Conclusion Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion Tuple Descriptor</em>' containment reference.
	 * @see #getConclusionTupleDescriptor()
	 * @generated
	 */
	void setConclusionTupleDescriptor(TupleDescriptorCS value);

} // ImplicationConstraintTupleDescriptorCS
