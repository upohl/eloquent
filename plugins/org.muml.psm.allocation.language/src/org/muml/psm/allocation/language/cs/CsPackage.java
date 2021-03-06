/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package describes the abstract syntax of the
 * allocation specification language.
 * <!-- end-model-doc -->
 * @see org.muml.psm.allocation.language.cs.CsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/allocation/language/cs/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsPackage eINSTANCE = org.muml.psm.allocation.language.cs.impl.CsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl <em>Specification CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getSpecificationCS()
	 * @generated
	 */
	int SPECIFICATION_CS = 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__CSI = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__PARENT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__PIVOT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__ORIGINAL_XMI_ID = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_ANNOTATIONS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__NAME = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_IMPORTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORTS;

	/**
	 * The feature id for the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_CONTEXTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_PACKAGES = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__RELATIONS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__SERVICES = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__CONSTRAINTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__MEASURE = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__GOAL = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name Provider Implementation Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__NAME_PROVIDER = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Storage Provider Implementation Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Storage Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__STORAGE_PROVIDER = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ocl Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OCL_CONTEXT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Specification CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS_FEATURE_COUNT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.EvaluableElementCSImpl <em>Evaluable Element CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.EvaluableElementCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getEvaluableElementCS()
	 * @generated
	 */
	int EVALUABLE_ELEMENT_CS = 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS__EXPRESSION = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluable Element CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.RelationCSImpl <em>Relation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.RelationCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getRelationCS()
	 * @generated
	 */
	int RELATION_CS = 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__PARENT = BaseCSPackage.NAMED_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__OWNED_ANNOTATIONS = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__NAME = BaseCSPackage.NAMED_ELEMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__EXPRESSION = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__TUPLE_DESCRIPTOR = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__LOWER_BOUND = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS__UPPER_BOUND = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CS_FEATURE_COUNT = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.BoundCSImpl <em>Bound CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.BoundCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getBoundCS()
	 * @generated
	 */
	int BOUND_CS = 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS__CSI = EVALUABLE_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS__PARENT = EVALUABLE_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS__PIVOT = EVALUABLE_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS__ORIGINAL_XMI_ID = EVALUABLE_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS__OWNED_ANNOTATIONS = EVALUABLE_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS__EXPRESSION = EVALUABLE_ELEMENT_CS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Bound CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CS_FEATURE_COUNT = EVALUABLE_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.ConstraintCSImpl <em>Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.ConstraintCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getConstraintCS()
	 * @generated
	 */
	int CONSTRAINT_CS = 4;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__PARENT = BaseCSPackage.NAMED_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__OWNED_ANNOTATIONS = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__NAME = BaseCSPackage.NAMED_ELEMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__EXPRESSION = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS_FEATURE_COUNT = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.CoherenceConstraintCSImpl <em>Coherence Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.CoherenceConstraintCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getCoherenceConstraintCS()
	 * @generated
	 */
	int COHERENCE_CONSTRAINT_CS = 5;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__PARENT = CONSTRAINT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__OWNED_ANNOTATIONS = CONSTRAINT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__NAME = CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__EXPRESSION = CONSTRAINT_CS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS__TYPE = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coherence Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl <em>Resource Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getResourceConstraintCS()
	 * @generated
	 */
	int RESOURCE_CONSTRAINT_CS = 6;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__PARENT = CONSTRAINT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__OWNED_ANNOTATIONS = CONSTRAINT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__NAME = CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__EXPRESSION = CONSTRAINT_CS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.LocationConstraintCSImpl <em>Location Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.LocationConstraintCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getLocationConstraintCS()
	 * @generated
	 */
	int LOCATION_CONSTRAINT_CS = 7;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__PARENT = CONSTRAINT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__OWNED_ANNOTATIONS = CONSTRAINT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__NAME = CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__EXPRESSION = CONSTRAINT_CS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintCSImpl <em>Implication Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.ImplicationConstraintCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getImplicationConstraintCS()
	 * @generated
	 */
	int IMPLICATION_CONSTRAINT_CS = 8;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__PARENT = CONSTRAINT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__OWNED_ANNOTATIONS = CONSTRAINT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__NAME = CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__EXPRESSION = CONSTRAINT_CS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implication Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.ForbiddenLocationConstraintCSImpl <em>Forbidden Location Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.ForbiddenLocationConstraintCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getForbiddenLocationConstraintCS()
	 * @generated
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS = 9;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__PARENT = CONSTRAINT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__OWNED_ANNOTATIONS = CONSTRAINT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__NAME = CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__EXPRESSION = CONSTRAINT_CS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forbidden Location Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.TupleDescriptorCSImpl <em>Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.TupleDescriptorCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getTupleDescriptorCS()
	 * @generated
	 */
	int TUPLE_DESCRIPTOR_CS = 10;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__TYPED_PAIRS = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__SEQUENCE_PART = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.WeightTupleDescriptorCSImpl <em>Weight Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.WeightTupleDescriptorCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getWeightTupleDescriptorCS()
	 * @generated
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS = 11;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__CSI = TUPLE_DESCRIPTOR_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__PARENT = TUPLE_DESCRIPTOR_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__PIVOT = TUPLE_DESCRIPTOR_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATIONS = TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__TYPED_PAIRS = TUPLE_DESCRIPTOR_CS__TYPED_PAIRS;

	/**
	 * The feature id for the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__SEQUENCE_PART = TUPLE_DESCRIPTOR_CS__SEQUENCE_PART;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS__WEIGHT = TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weight Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.BoundWeightTupleDescriptorCSImpl <em>Bound Weight Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.BoundWeightTupleDescriptorCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getBoundWeightTupleDescriptorCS()
	 * @generated
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS = 12;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__CSI = WEIGHT_TUPLE_DESCRIPTOR_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__PARENT = WEIGHT_TUPLE_DESCRIPTOR_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__PIVOT = WEIGHT_TUPLE_DESCRIPTOR_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = WEIGHT_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATIONS = WEIGHT_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__TYPED_PAIRS = WEIGHT_TUPLE_DESCRIPTOR_CS__TYPED_PAIRS;

	/**
	 * The feature id for the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__SEQUENCE_PART = WEIGHT_TUPLE_DESCRIPTOR_CS__SEQUENCE_PART;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__WEIGHT = WEIGHT_TUPLE_DESCRIPTOR_CS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__BOUND = WEIGHT_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bound Weight Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = WEIGHT_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl <em>Implication Constraint Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getImplicationConstraintTupleDescriptorCS()
	 * @generated
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS = 13;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Premise Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conclusion Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implication Constraint Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.TypedNamedPartCSImpl <em>Typed Named Part CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.TypedNamedPartCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getTypedNamedPartCS()
	 * @generated
	 */
	int TYPED_NAMED_PART_CS = 14;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__CSI = BaseCSPackage.TYPED_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__PARENT = BaseCSPackage.TYPED_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__PIVOT = BaseCSPackage.TYPED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__ORIGINAL_XMI_ID = BaseCSPackage.TYPED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__OWNED_ANNOTATIONS = BaseCSPackage.TYPED_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__NAME = BaseCSPackage.TYPED_ELEMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__IS_OPTIONAL = BaseCSPackage.TYPED_ELEMENT_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__OWNED_TYPE = BaseCSPackage.TYPED_ELEMENT_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS__QUALIFIERS = BaseCSPackage.TYPED_ELEMENT_CS__QUALIFIERS;

	/**
	 * The number of structural features of the '<em>Typed Named Part CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_CS_FEATURE_COUNT = BaseCSPackage.TYPED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.TypedPairCSImpl <em>Typed Pair CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.TypedPairCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getTypedPairCS()
	 * @generated
	 */
	int TYPED_PAIR_CS = 15;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__FIRST = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS__SECOND = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Pair CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.MeasureFunctionCSImpl <em>Measure Function CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.MeasureFunctionCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getMeasureFunctionCS()
	 * @generated
	 */
	int MEASURE_FUNCTION_CS = 16;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__SERVICES = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Function CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.ServiceCSImpl <em>Service CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.ServiceCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getServiceCS()
	 * @generated
	 */
	int SERVICE_CS = 17;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__PARENT = BaseCSPackage.NAMED_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__OWNED_ANNOTATIONS = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__NAME = BaseCSPackage.NAMED_ELEMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__DIMENSIONS = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS_FEATURE_COUNT = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl <em>Qo SDimension CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getQoSDimensionCS()
	 * @generated
	 */
	int QO_SDIMENSION_CS = 18;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__PARENT = BaseCSPackage.NAMED_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__OWNED_ANNOTATIONS = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__NAME = BaseCSPackage.NAMED_ELEMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__EXPRESSION = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__TUPLE_DESCRIPTOR = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qo SDimension CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS_FEATURE_COUNT = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.JavaImplementationProviderCSImpl <em>Java Implementation Provider CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.JavaImplementationProviderCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getJavaImplementationProviderCS()
	 * @generated
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS = 19;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS__IMPLEMENTATION = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Implementation Provider CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.NameProviderCS <em>Name Provider CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.NameProviderCS
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getNameProviderCS()
	 * @generated
	 */
	int NAME_PROVIDER_CS = 20;

	/**
	 * The number of structural features of the '<em>Name Provider CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_CS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.StorageProviderCS <em>Storage Provider CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.StorageProviderCS
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getStorageProviderCS()
	 * @generated
	 */
	int STORAGE_PROVIDER_CS = 21;

	/**
	 * The number of structural features of the '<em>Storage Provider CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PROVIDER_CS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.impl.OCLContextCSImpl <em>OCL Context CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.impl.OCLContextCSImpl
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getOCLContextCS()
	 * @generated
	 */
	int OCL_CONTEXT_CS = 22;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__CSI = BaseCSPackage.TYPED_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__PARENT = BaseCSPackage.TYPED_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__PIVOT = BaseCSPackage.TYPED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__ORIGINAL_XMI_ID = BaseCSPackage.TYPED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__OWNED_ANNOTATIONS = BaseCSPackage.TYPED_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__NAME = BaseCSPackage.TYPED_ELEMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__IS_OPTIONAL = BaseCSPackage.TYPED_ELEMENT_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__OWNED_TYPE = BaseCSPackage.TYPED_ELEMENT_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS__QUALIFIERS = BaseCSPackage.TYPED_ELEMENT_CS__QUALIFIERS;

	/**
	 * The number of structural features of the '<em>OCL Context CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_CS_FEATURE_COUNT = BaseCSPackage.TYPED_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.CoherenceConstraintType <em>Coherence Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.CoherenceConstraintType
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getCoherenceConstraintType()
	 * @generated
	 */
	int COHERENCE_CONSTRAINT_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.cs.Goal <em>Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.cs.Goal
	 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 24;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.SpecificationCS <em>Specification CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS
	 * @generated
	 */
	EClass getSpecificationCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getRelations()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getServices()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getConstraints()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getMeasure()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Measure();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getGoal()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EAttribute getSpecificationCS_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getNameProviderImplementationClass <em>Name Provider Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Provider Implementation Class</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getNameProviderImplementationClass()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_NameProviderImplementationClass();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getNameProvider <em>Name Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Provider</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getNameProvider()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_NameProvider();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProviderImplementationClass <em>Storage Provider Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage Provider Implementation Class</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProviderImplementationClass()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_StorageProviderImplementationClass();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProvider <em>Storage Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage Provider</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getStorageProvider()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_StorageProvider();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.SpecificationCS#getOclContext <em>Ocl Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ocl Context</em>'.
	 * @see org.muml.psm.allocation.language.cs.SpecificationCS#getOclContext()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_OclContext();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.EvaluableElementCS <em>Evaluable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluable Element CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.EvaluableElementCS
	 * @generated
	 */
	EClass getEvaluableElementCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.EvaluableElementCS#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.psm.allocation.language.cs.EvaluableElementCS#getExpression()
	 * @see #getEvaluableElementCS()
	 * @generated
	 */
	EReference getEvaluableElementCS_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.RelationCS <em>Relation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.RelationCS
	 * @generated
	 */
	EClass getRelationCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.RelationCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.RelationCS#getTupleDescriptor()
	 * @see #getRelationCS()
	 * @generated
	 */
	EReference getRelationCS_TupleDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.RelationCS#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.muml.psm.allocation.language.cs.RelationCS#getLowerBound()
	 * @see #getRelationCS()
	 * @generated
	 */
	EReference getRelationCS_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.RelationCS#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.muml.psm.allocation.language.cs.RelationCS#getUpperBound()
	 * @see #getRelationCS()
	 * @generated
	 */
	EReference getRelationCS_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.BoundCS <em>Bound CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.BoundCS
	 * @generated
	 */
	EClass getBoundCS();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.ConstraintCS <em>Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.ConstraintCS
	 * @generated
	 */
	EClass getConstraintCS();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.CoherenceConstraintCS <em>Coherence Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coherence Constraint CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.CoherenceConstraintCS
	 * @generated
	 */
	EClass getCoherenceConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.CoherenceConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.CoherenceConstraintCS#getTupleDescriptor()
	 * @see #getCoherenceConstraintCS()
	 * @generated
	 */
	EReference getCoherenceConstraintCS_TupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.CoherenceConstraintCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.psm.allocation.language.cs.CoherenceConstraintCS#getType()
	 * @see #getCoherenceConstraintCS()
	 * @generated
	 */
	EAttribute getCoherenceConstraintCS_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.ResourceConstraintCS <em>Resource Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Constraint CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.ResourceConstraintCS
	 * @generated
	 */
	EClass getResourceConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.ResourceConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.ResourceConstraintCS#getTupleDescriptor()
	 * @see #getResourceConstraintCS()
	 * @generated
	 */
	EReference getResourceConstraintCS_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.LocationConstraintCS <em>Location Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Constraint CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.LocationConstraintCS
	 * @generated
	 */
	EClass getLocationConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.LocationConstraintCS#getTupleDescriptor()
	 * @see #getLocationConstraintCS()
	 * @generated
	 */
	EReference getLocationConstraintCS_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintCS <em>Implication Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Constraint CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintCS
	 * @generated
	 */
	EClass getImplicationConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintCS#getTupleDescriptor()
	 * @see #getImplicationConstraintCS()
	 * @generated
	 */
	EReference getImplicationConstraintCS_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.ForbiddenLocationConstraintCS <em>Forbidden Location Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forbidden Location Constraint CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.ForbiddenLocationConstraintCS
	 * @generated
	 */
	EClass getForbiddenLocationConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.ForbiddenLocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.ForbiddenLocationConstraintCS#getTupleDescriptor()
	 * @see #getForbiddenLocationConstraintCS()
	 * @generated
	 */
	EReference getForbiddenLocationConstraintCS_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.TupleDescriptorCS <em>Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Descriptor CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.TupleDescriptorCS
	 * @generated
	 */
	EClass getTupleDescriptorCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.cs.TupleDescriptorCS#getTypedPairs <em>Typed Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typed Pairs</em>'.
	 * @see org.muml.psm.allocation.language.cs.TupleDescriptorCS#getTypedPairs()
	 * @see #getTupleDescriptorCS()
	 * @generated
	 */
	EReference getTupleDescriptorCS_TypedPairs();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.TupleDescriptorCS#getSequencePart <em>Sequence Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Part</em>'.
	 * @see org.muml.psm.allocation.language.cs.TupleDescriptorCS#getSequencePart()
	 * @see #getTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getTupleDescriptorCS_SequencePart();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS <em>Weight Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weight Tuple Descriptor CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS
	 * @generated
	 */
	EClass getWeightTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.muml.psm.allocation.language.cs.WeightTupleDescriptorCS#getWeight()
	 * @see #getWeightTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getWeightTupleDescriptorCS_Weight();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS <em>Bound Weight Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Weight Tuple Descriptor CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS
	 * @generated
	 */
	EClass getBoundWeightTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see org.muml.psm.allocation.language.cs.BoundWeightTupleDescriptorCS#getBound()
	 * @see #getBoundWeightTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getBoundWeightTupleDescriptorCS_Bound();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS <em>Implication Constraint Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Constraint Tuple Descriptor CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS
	 * @generated
	 */
	EClass getImplicationConstraintTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremise()
	 * @see #getImplicationConstraintTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getImplicationConstraintTupleDescriptorCS_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremiseTupleDescriptor <em>Premise Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getPremiseTupleDescriptor()
	 * @see #getImplicationConstraintTupleDescriptorCS()
	 * @generated
	 */
	EReference getImplicationConstraintTupleDescriptorCS_PremiseTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusion()
	 * @see #getImplicationConstraintTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getImplicationConstraintTupleDescriptorCS_Conclusion();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusionTupleDescriptor <em>Conclusion Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conclusion Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.ImplicationConstraintTupleDescriptorCS#getConclusionTupleDescriptor()
	 * @see #getImplicationConstraintTupleDescriptorCS()
	 * @generated
	 */
	EReference getImplicationConstraintTupleDescriptorCS_ConclusionTupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.TypedNamedPartCS <em>Typed Named Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Named Part CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.TypedNamedPartCS
	 * @generated
	 */
	EClass getTypedNamedPartCS();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.TypedPairCS <em>Typed Pair CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Pair CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.TypedPairCS
	 * @generated
	 */
	EClass getTypedPairCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.TypedPairCS#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see org.muml.psm.allocation.language.cs.TypedPairCS#getFirst()
	 * @see #getTypedPairCS()
	 * @generated
	 */
	EReference getTypedPairCS_First();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.TypedPairCS#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see org.muml.psm.allocation.language.cs.TypedPairCS#getSecond()
	 * @see #getTypedPairCS()
	 * @generated
	 */
	EReference getTypedPairCS_Second();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.MeasureFunctionCS <em>Measure Function CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Function CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.MeasureFunctionCS
	 * @generated
	 */
	EClass getMeasureFunctionCS();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.psm.allocation.language.cs.MeasureFunctionCS#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.muml.psm.allocation.language.cs.MeasureFunctionCS#getServices()
	 * @see #getMeasureFunctionCS()
	 * @generated
	 */
	EReference getMeasureFunctionCS_Services();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.ServiceCS <em>Service CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.ServiceCS
	 * @generated
	 */
	EClass getServiceCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.cs.ServiceCS#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see org.muml.psm.allocation.language.cs.ServiceCS#getDimensions()
	 * @see #getServiceCS()
	 * @generated
	 */
	EReference getServiceCS_Dimensions();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.QoSDimensionCS <em>Qo SDimension CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDimension CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.QoSDimensionCS
	 * @generated
	 */
	EClass getQoSDimensionCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.cs.QoSDimensionCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.cs.QoSDimensionCS#getTupleDescriptor()
	 * @see #getQoSDimensionCS()
	 * @generated
	 */
	EReference getQoSDimensionCS_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.JavaImplementationProviderCS <em>Java Implementation Provider CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Implementation Provider CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.JavaImplementationProviderCS
	 * @generated
	 */
	EClass getJavaImplementationProviderCS();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.NameProviderCS <em>Name Provider CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Provider CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.NameProviderCS
	 * @generated
	 */
	EClass getNameProviderCS();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.StorageProviderCS <em>Storage Provider CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Provider CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.StorageProviderCS
	 * @generated
	 */
	EClass getStorageProviderCS();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.cs.OCLContextCS <em>OCL Context CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Context CS</em>'.
	 * @see org.muml.psm.allocation.language.cs.OCLContextCS
	 * @generated
	 */
	EClass getOCLContextCS();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.language.cs.CoherenceConstraintType <em>Coherence Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coherence Constraint Type</em>'.
	 * @see org.muml.psm.allocation.language.cs.CoherenceConstraintType
	 * @generated
	 */
	EEnum getCoherenceConstraintType();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.language.cs.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal</em>'.
	 * @see org.muml.psm.allocation.language.cs.Goal
	 * @generated
	 */
	EEnum getGoal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsFactory getCsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl <em>Specification CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.SpecificationCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getSpecificationCS()
		 * @generated
		 */
		EClass SPECIFICATION_CS = eINSTANCE.getSpecificationCS();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__RELATIONS = eINSTANCE.getSpecificationCS_Relations();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__SERVICES = eINSTANCE.getSpecificationCS_Services();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__CONSTRAINTS = eINSTANCE.getSpecificationCS_Constraints();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__MEASURE = eINSTANCE.getSpecificationCS_Measure();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_CS__GOAL = eINSTANCE.getSpecificationCS_Goal();

		/**
		 * The meta object literal for the '<em><b>Name Provider Implementation Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__NAME_PROVIDER_IMPLEMENTATION_CLASS = eINSTANCE.getSpecificationCS_NameProviderImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Name Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__NAME_PROVIDER = eINSTANCE.getSpecificationCS_NameProvider();

		/**
		 * The meta object literal for the '<em><b>Storage Provider Implementation Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__STORAGE_PROVIDER_IMPLEMENTATION_CLASS = eINSTANCE.getSpecificationCS_StorageProviderImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Storage Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__STORAGE_PROVIDER = eINSTANCE.getSpecificationCS_StorageProvider();

		/**
		 * The meta object literal for the '<em><b>Ocl Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_CS__OCL_CONTEXT = eINSTANCE.getSpecificationCS_OclContext();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.EvaluableElementCSImpl <em>Evaluable Element CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.EvaluableElementCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getEvaluableElementCS()
		 * @generated
		 */
		EClass EVALUABLE_ELEMENT_CS = eINSTANCE.getEvaluableElementCS();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUABLE_ELEMENT_CS__EXPRESSION = eINSTANCE.getEvaluableElementCS_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.RelationCSImpl <em>Relation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.RelationCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getRelationCS()
		 * @generated
		 */
		EClass RELATION_CS = eINSTANCE.getRelationCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CS__TUPLE_DESCRIPTOR = eINSTANCE.getRelationCS_TupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CS__LOWER_BOUND = eINSTANCE.getRelationCS_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CS__UPPER_BOUND = eINSTANCE.getRelationCS_UpperBound();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.BoundCSImpl <em>Bound CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.BoundCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getBoundCS()
		 * @generated
		 */
		EClass BOUND_CS = eINSTANCE.getBoundCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.ConstraintCSImpl <em>Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.ConstraintCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getConstraintCS()
		 * @generated
		 */
		EClass CONSTRAINT_CS = eINSTANCE.getConstraintCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.CoherenceConstraintCSImpl <em>Coherence Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.CoherenceConstraintCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getCoherenceConstraintCS()
		 * @generated
		 */
		EClass COHERENCE_CONSTRAINT_CS = eINSTANCE.getCoherenceConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COHERENCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR = eINSTANCE.getCoherenceConstraintCS_TupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COHERENCE_CONSTRAINT_CS__TYPE = eINSTANCE.getCoherenceConstraintCS_Type();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl <em>Resource Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.ResourceConstraintCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getResourceConstraintCS()
		 * @generated
		 */
		EClass RESOURCE_CONSTRAINT_CS = eINSTANCE.getResourceConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTOR = eINSTANCE.getResourceConstraintCS_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.LocationConstraintCSImpl <em>Location Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.LocationConstraintCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getLocationConstraintCS()
		 * @generated
		 */
		EClass LOCATION_CONSTRAINT_CS = eINSTANCE.getLocationConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR = eINSTANCE.getLocationConstraintCS_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintCSImpl <em>Implication Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.ImplicationConstraintCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getImplicationConstraintCS()
		 * @generated
		 */
		EClass IMPLICATION_CONSTRAINT_CS = eINSTANCE.getImplicationConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraintCS_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.ForbiddenLocationConstraintCSImpl <em>Forbidden Location Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.ForbiddenLocationConstraintCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getForbiddenLocationConstraintCS()
		 * @generated
		 */
		EClass FORBIDDEN_LOCATION_CONSTRAINT_CS = eINSTANCE.getForbiddenLocationConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORBIDDEN_LOCATION_CONSTRAINT_CS__TUPLE_DESCRIPTOR = eINSTANCE.getForbiddenLocationConstraintCS_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.TupleDescriptorCSImpl <em>Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.TupleDescriptorCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getTupleDescriptorCS()
		 * @generated
		 */
		EClass TUPLE_DESCRIPTOR_CS = eINSTANCE.getTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Typed Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_DESCRIPTOR_CS__TYPED_PAIRS = eINSTANCE.getTupleDescriptorCS_TypedPairs();

		/**
		 * The meta object literal for the '<em><b>Sequence Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_DESCRIPTOR_CS__SEQUENCE_PART = eINSTANCE.getTupleDescriptorCS_SequencePart();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.WeightTupleDescriptorCSImpl <em>Weight Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.WeightTupleDescriptorCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getWeightTupleDescriptorCS()
		 * @generated
		 */
		EClass WEIGHT_TUPLE_DESCRIPTOR_CS = eINSTANCE.getWeightTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHT_TUPLE_DESCRIPTOR_CS__WEIGHT = eINSTANCE.getWeightTupleDescriptorCS_Weight();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.BoundWeightTupleDescriptorCSImpl <em>Bound Weight Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.BoundWeightTupleDescriptorCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getBoundWeightTupleDescriptorCS()
		 * @generated
		 */
		EClass BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS = eINSTANCE.getBoundWeightTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND_WEIGHT_TUPLE_DESCRIPTOR_CS__BOUND = eINSTANCE.getBoundWeightTupleDescriptorCS_Bound();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl <em>Implication Constraint Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.ImplicationConstraintTupleDescriptorCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getImplicationConstraintTupleDescriptorCS()
		 * @generated
		 */
		EClass IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS = eINSTANCE.getImplicationConstraintTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Premise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE = eINSTANCE.getImplicationConstraintTupleDescriptorCS_Premise();

		/**
		 * The meta object literal for the '<em><b>Premise Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__PREMISE_TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraintTupleDescriptorCS_PremiseTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Conclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION = eINSTANCE.getImplicationConstraintTupleDescriptorCS_Conclusion();

		/**
		 * The meta object literal for the '<em><b>Conclusion Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_CS__CONCLUSION_TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraintTupleDescriptorCS_ConclusionTupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.TypedNamedPartCSImpl <em>Typed Named Part CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.TypedNamedPartCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getTypedNamedPartCS()
		 * @generated
		 */
		EClass TYPED_NAMED_PART_CS = eINSTANCE.getTypedNamedPartCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.TypedPairCSImpl <em>Typed Pair CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.TypedPairCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getTypedPairCS()
		 * @generated
		 */
		EClass TYPED_PAIR_CS = eINSTANCE.getTypedPairCS();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_PAIR_CS__FIRST = eINSTANCE.getTypedPairCS_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_PAIR_CS__SECOND = eINSTANCE.getTypedPairCS_Second();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.MeasureFunctionCSImpl <em>Measure Function CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.MeasureFunctionCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getMeasureFunctionCS()
		 * @generated
		 */
		EClass MEASURE_FUNCTION_CS = eINSTANCE.getMeasureFunctionCS();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_FUNCTION_CS__SERVICES = eINSTANCE.getMeasureFunctionCS_Services();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.ServiceCSImpl <em>Service CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.ServiceCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getServiceCS()
		 * @generated
		 */
		EClass SERVICE_CS = eINSTANCE.getServiceCS();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CS__DIMENSIONS = eINSTANCE.getServiceCS_Dimensions();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl <em>Qo SDimension CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.QoSDimensionCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getQoSDimensionCS()
		 * @generated
		 */
		EClass QO_SDIMENSION_CS = eINSTANCE.getQoSDimensionCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENSION_CS__TUPLE_DESCRIPTOR = eINSTANCE.getQoSDimensionCS_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.JavaImplementationProviderCSImpl <em>Java Implementation Provider CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.JavaImplementationProviderCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getJavaImplementationProviderCS()
		 * @generated
		 */
		EClass JAVA_IMPLEMENTATION_PROVIDER_CS = eINSTANCE.getJavaImplementationProviderCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.NameProviderCS <em>Name Provider CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.NameProviderCS
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getNameProviderCS()
		 * @generated
		 */
		EClass NAME_PROVIDER_CS = eINSTANCE.getNameProviderCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.StorageProviderCS <em>Storage Provider CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.StorageProviderCS
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getStorageProviderCS()
		 * @generated
		 */
		EClass STORAGE_PROVIDER_CS = eINSTANCE.getStorageProviderCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.impl.OCLContextCSImpl <em>OCL Context CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.impl.OCLContextCSImpl
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getOCLContextCS()
		 * @generated
		 */
		EClass OCL_CONTEXT_CS = eINSTANCE.getOCLContextCS();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.CoherenceConstraintType <em>Coherence Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.CoherenceConstraintType
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getCoherenceConstraintType()
		 * @generated
		 */
		EEnum COHERENCE_CONSTRAINT_TYPE = eINSTANCE.getCoherenceConstraintType();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.cs.Goal <em>Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.cs.Goal
		 * @see org.muml.psm.allocation.language.cs.impl.CsPackageImpl#getGoal()
		 * @generated
		 */
		EEnum GOAL = eINSTANCE.getGoal();

	}

} //CsPackage
