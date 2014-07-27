/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.ocl.examples.xtext.base.basecs.BaseCSPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.CompleteOCLCSPackage;

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
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.fujaba.de/muml/allocation/language/0.1.0/cs";

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
	CsPackage eINSTANCE = de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl <em>Specification CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getSpecificationCS()
	 * @generated
	 */
	int SPECIFICATION_CS = 0;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__LOGICAL_PARENT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__PIVOT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_ANNOTATION = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__ORIGINAL_XMI_ID = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__CSI = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__NAME = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_IMPORT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_LIBRARY = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__PACKAGES = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__CONTEXTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Owned Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__OWNED_INCLUDE = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__ANNOTATION = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__EXTENSION = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__SERVICES = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__CONSTRAINTS = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__MEASURE = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS__GOAL = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Specification CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_CS_FEATURE_COUNT = CompleteOCLCSPackage.COMPLETE_OCL_DOCUMENT_CS_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.EvaluatableElementCSImpl <em>Evaluatable Element CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.EvaluatableElementCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getEvaluatableElementCS()
	 * @generated
	 */
	int EVALUATABLE_ELEMENT_CS = 1;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS__LOGICAL_PARENT = BaseCSPackage.MODEL_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS__OWNED_ANNOTATION = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS__EXPRESSION = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluatable Element CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.WeightingComponentResourceTupleElementCSImpl <em>Weighting Component Resource Tuple Element CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.WeightingComponentResourceTupleElementCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getWeightingComponentResourceTupleElementCS()
	 * @generated
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS = 2;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__LOGICAL_PARENT = BaseCSPackage.MODEL_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__OWNED_ANNOTATION = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weighting Component Resource Tuple Element CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ServiceCSImpl <em>Service CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ServiceCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getServiceCS()
	 * @generated
	 */
	int SERVICE_CS = 3;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__LOGICAL_PARENT = BaseCSPackage.NAMED_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__OWNED_ANNOTATION = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl <em>Qo SDimension CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getQoSDimensionCS()
	 * @generated
	 */
	int QO_SDIMENSION_CS = 4;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__LOGICAL_PARENT = BaseCSPackage.NAMED_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__OWNED_ANNOTATION = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

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
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__TUPLE_DESCRIPTORS = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS__WEIGHTING = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Qo SDimension CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_CS_FEATURE_COUNT = BaseCSPackage.NAMED_ELEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ConstraintCSImpl <em>Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ConstraintCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getConstraintCS()
	 * @generated
	 */
	int CONSTRAINT_CS = 5;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__LOGICAL_PARENT = BaseCSPackage.NAMED_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__PIVOT = BaseCSPackage.NAMED_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__OWNED_ANNOTATION = BaseCSPackage.NAMED_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__ORIGINAL_XMI_ID = BaseCSPackage.NAMED_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_CS__CSI = BaseCSPackage.NAMED_ELEMENT_CS__CSI;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationConstraintCSImpl <em>Location Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationConstraintCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getLocationConstraintCS()
	 * @generated
	 */
	int LOCATION_CONSTRAINT_CS = 6;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__LOGICAL_PARENT = CONSTRAINT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__OWNED_ANNOTATION = CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS__TYPE = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ResourceConstraintCSImpl <em>Resource Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ResourceConstraintCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getResourceConstraintCS()
	 * @generated
	 */
	int RESOURCE_CONSTRAINT_CS = 7;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__LOGICAL_PARENT = CONSTRAINT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__OWNED_ANNOTATION = CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

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
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__WEIGHTING = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS__RHS = CONSTRAINT_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.RequiredHardwareResourceInstanceConstraintCSImpl <em>Required Hardware Resource Instance Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.RequiredHardwareResourceInstanceConstraintCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getRequiredHardwareResourceInstanceConstraintCS()
	 * @generated
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS = 8;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__LOGICAL_PARENT = CONSTRAINT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__PIVOT = CONSTRAINT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__OWNED_ANNOTATION = CONSTRAINT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__ORIGINAL_XMI_ID = CONSTRAINT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__CSI = CONSTRAINT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__NAME = CONSTRAINT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__EXPRESSION = CONSTRAINT_CS__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS = CONSTRAINT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Hardware Resource Instance Constraint CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS_FEATURE_COUNT = CONSTRAINT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.TupleDescriptorCSImpl <em>Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.TupleDescriptorCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getTupleDescriptorCS()
	 * @generated
	 */
	int TUPLE_DESCRIPTOR_CS = 9;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT = BaseCSPackage.MODEL_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The number of structural features of the '<em>Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.InstanceTupleDescriptorCSImpl <em>Instance Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.InstanceTupleDescriptorCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getInstanceTupleDescriptorCS()
	 * @generated
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS = 10;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT = TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS__PIVOT = TUPLE_DESCRIPTOR_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION = TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS__CSI = TUPLE_DESCRIPTOR_CS__CSI;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS__INSTANCE = TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationTupleDescriptorCSImpl <em>Location Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationTupleDescriptorCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getLocationTupleDescriptorCS()
	 * @generated
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS = 11;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT = INSTANCE_TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__PIVOT = INSTANCE_TUPLE_DESCRIPTOR_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION = INSTANCE_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = INSTANCE_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__CSI = INSTANCE_TUPLE_DESCRIPTOR_CS__CSI;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__INSTANCE = INSTANCE_TUPLE_DESCRIPTOR_CS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Second Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE = INSTANCE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = INSTANCE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ComponentResourceTupleDescriptorCSImpl <em>Component Resource Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ComponentResourceTupleDescriptorCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getComponentResourceTupleDescriptorCS()
	 * @generated
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS = 12;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT = INSTANCE_TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__PIVOT = INSTANCE_TUPLE_DESCRIPTOR_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION = INSTANCE_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = INSTANCE_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__CSI = INSTANCE_TUPLE_DESCRIPTOR_CS__CSI;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__INSTANCE = INSTANCE_TUPLE_DESCRIPTOR_CS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Hwresinstance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE = INSTANCE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Resource Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = INSTANCE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ValueTupleDescriptorCSImpl <em>Value Tuple Descriptor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ValueTupleDescriptorCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getValueTupleDescriptorCS()
	 * @generated
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS = 13;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT = TUPLE_DESCRIPTOR_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS__PIVOT = TUPLE_DESCRIPTOR_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION = TUPLE_DESCRIPTOR_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID = TUPLE_DESCRIPTOR_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS__CSI = TUPLE_DESCRIPTOR_CS__CSI;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS__VALUE = TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Tuple Descriptor CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_CS_FEATURE_COUNT = TUPLE_DESCRIPTOR_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.MeasureFunctionCSImpl <em>Measure Function CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.MeasureFunctionCSImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getMeasureFunctionCS()
	 * @generated
	 */
	int MEASURE_FUNCTION_CS = 14;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__LOGICAL_PARENT = BaseCSPackage.MODEL_ELEMENT_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__OWNED_ANNOTATION = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getLocationConstraintTypes()
	 * @generated
	 */
	int LOCATION_CONSTRAINT_TYPES = 15;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal <em>Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 16;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS <em>Specification CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS
	 * @generated
	 */
	EClass getSpecificationCS();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getServices()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getConstraints()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getMeasure()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EReference getSpecificationCS_Measure();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS#getGoal()
	 * @see #getSpecificationCS()
	 * @generated
	 */
	EAttribute getSpecificationCS_Goal();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS <em>Evaluatable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluatable Element CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS
	 * @generated
	 */
	EClass getEvaluatableElementCS();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS#getExpression()
	 * @see #getEvaluatableElementCS()
	 * @generated
	 */
	EReference getEvaluatableElementCS_Expression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS <em>Weighting Component Resource Tuple Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighting Component Resource Tuple Element CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS
	 * @generated
	 */
	EClass getWeightingComponentResourceTupleElementCS();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS#getTupleDescriptors()
	 * @see #getWeightingComponentResourceTupleElementCS()
	 * @generated
	 */
	EReference getWeightingComponentResourceTupleElementCS_TupleDescriptors();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS#getWeighting <em>Weighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weighting</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS#getWeighting()
	 * @see #getWeightingComponentResourceTupleElementCS()
	 * @generated
	 */
	EReference getWeightingComponentResourceTupleElementCS_Weighting();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS <em>Service CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS
	 * @generated
	 */
	EClass getServiceCS();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ServiceCS#getDimensions()
	 * @see #getServiceCS()
	 * @generated
	 */
	EReference getServiceCS_Dimensions();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS <em>Qo SDimension CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDimension CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS
	 * @generated
	 */
	EClass getQoSDimensionCS();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS <em>Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS
	 * @generated
	 */
	EClass getConstraintCS();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS <em>Location Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Constraint CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS
	 * @generated
	 */
	EClass getLocationConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getTupleDescriptor()
	 * @see #getLocationConstraintCS()
	 * @generated
	 */
	EReference getLocationConstraintCS_TupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS#getType()
	 * @see #getLocationConstraintCS()
	 * @generated
	 */
	EAttribute getLocationConstraintCS_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS <em>Resource Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Constraint CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS
	 * @generated
	 */
	EClass getResourceConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS#getRhs()
	 * @see #getResourceConstraintCS()
	 * @generated
	 */
	EReference getResourceConstraintCS_Rhs();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS <em>Required Hardware Resource Instance Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Hardware Resource Instance Constraint CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS
	 * @generated
	 */
	EClass getRequiredHardwareResourceInstanceConstraintCS();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS#getTupleDescriptors()
	 * @see #getRequiredHardwareResourceInstanceConstraintCS()
	 * @generated
	 */
	EReference getRequiredHardwareResourceInstanceConstraintCS_TupleDescriptors();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS <em>Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Descriptor CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.TupleDescriptorCS
	 * @generated
	 */
	EClass getTupleDescriptorCS();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS <em>Instance Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Tuple Descriptor CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS
	 * @generated
	 */
	EClass getInstanceTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.InstanceTupleDescriptorCS#getInstance()
	 * @see #getInstanceTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getInstanceTupleDescriptorCS_Instance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS <em>Location Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Tuple Descriptor CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS
	 * @generated
	 */
	EClass getLocationTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS#getSecondInstance <em>Second Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS#getSecondInstance()
	 * @see #getLocationTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getLocationTupleDescriptorCS_SecondInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS <em>Component Resource Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Resource Tuple Descriptor CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS
	 * @generated
	 */
	EClass getComponentResourceTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS#getHwresinstance <em>Hwresinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwresinstance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS#getHwresinstance()
	 * @see #getComponentResourceTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getComponentResourceTupleDescriptorCS_Hwresinstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS <em>Value Tuple Descriptor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Tuple Descriptor CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS
	 * @generated
	 */
	EClass getValueTupleDescriptorCS();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS#getValue()
	 * @see #getValueTupleDescriptorCS()
	 * @generated
	 */
	EAttribute getValueTupleDescriptorCS_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS <em>Measure Function CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Function CS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS
	 * @generated
	 */
	EClass getMeasureFunctionCS();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.MeasureFunctionCS#getServices()
	 * @see #getMeasureFunctionCS()
	 * @generated
	 */
	EReference getMeasureFunctionCS_Services();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes <em>Location Constraint Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Constraint Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes
	 * @generated
	 */
	EEnum getLocationConstraintTypes();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl <em>Specification CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.SpecificationCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getSpecificationCS()
		 * @generated
		 */
		EClass SPECIFICATION_CS = eINSTANCE.getSpecificationCS();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.EvaluatableElementCSImpl <em>Evaluatable Element CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.EvaluatableElementCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getEvaluatableElementCS()
		 * @generated
		 */
		EClass EVALUATABLE_ELEMENT_CS = eINSTANCE.getEvaluatableElementCS();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATABLE_ELEMENT_CS__EXPRESSION = eINSTANCE.getEvaluatableElementCS_Expression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.WeightingComponentResourceTupleElementCSImpl <em>Weighting Component Resource Tuple Element CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.WeightingComponentResourceTupleElementCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getWeightingComponentResourceTupleElementCS()
		 * @generated
		 */
		EClass WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS = eINSTANCE.getWeightingComponentResourceTupleElementCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__TUPLE_DESCRIPTORS = eINSTANCE.getWeightingComponentResourceTupleElementCS_TupleDescriptors();

		/**
		 * The meta object literal for the '<em><b>Weighting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_CS__WEIGHTING = eINSTANCE.getWeightingComponentResourceTupleElementCS_Weighting();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ServiceCSImpl <em>Service CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ServiceCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getServiceCS()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl <em>Qo SDimension CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.QoSDimensionCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getQoSDimensionCS()
		 * @generated
		 */
		EClass QO_SDIMENSION_CS = eINSTANCE.getQoSDimensionCS();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ConstraintCSImpl <em>Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ConstraintCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getConstraintCS()
		 * @generated
		 */
		EClass CONSTRAINT_CS = eINSTANCE.getConstraintCS();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationConstraintCSImpl <em>Location Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationConstraintCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getLocationConstraintCS()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_CONSTRAINT_CS__TYPE = eINSTANCE.getLocationConstraintCS_Type();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ResourceConstraintCSImpl <em>Resource Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ResourceConstraintCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getResourceConstraintCS()
		 * @generated
		 */
		EClass RESOURCE_CONSTRAINT_CS = eINSTANCE.getResourceConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT_CS__RHS = eINSTANCE.getResourceConstraintCS_Rhs();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.RequiredHardwareResourceInstanceConstraintCSImpl <em>Required Hardware Resource Instance Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.RequiredHardwareResourceInstanceConstraintCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getRequiredHardwareResourceInstanceConstraintCS()
		 * @generated
		 */
		EClass REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS = eINSTANCE.getRequiredHardwareResourceInstanceConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_CS__TUPLE_DESCRIPTORS = eINSTANCE.getRequiredHardwareResourceInstanceConstraintCS_TupleDescriptors();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.TupleDescriptorCSImpl <em>Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.TupleDescriptorCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getTupleDescriptorCS()
		 * @generated
		 */
		EClass TUPLE_DESCRIPTOR_CS = eINSTANCE.getTupleDescriptorCS();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.InstanceTupleDescriptorCSImpl <em>Instance Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.InstanceTupleDescriptorCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getInstanceTupleDescriptorCS()
		 * @generated
		 */
		EClass INSTANCE_TUPLE_DESCRIPTOR_CS = eINSTANCE.getInstanceTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TUPLE_DESCRIPTOR_CS__INSTANCE = eINSTANCE.getInstanceTupleDescriptorCS_Instance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationTupleDescriptorCSImpl <em>Location Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.LocationTupleDescriptorCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getLocationTupleDescriptorCS()
		 * @generated
		 */
		EClass LOCATION_TUPLE_DESCRIPTOR_CS = eINSTANCE.getLocationTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Second Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TUPLE_DESCRIPTOR_CS__SECOND_INSTANCE = eINSTANCE.getLocationTupleDescriptorCS_SecondInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ComponentResourceTupleDescriptorCSImpl <em>Component Resource Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ComponentResourceTupleDescriptorCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getComponentResourceTupleDescriptorCS()
		 * @generated
		 */
		EClass COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS = eINSTANCE.getComponentResourceTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Hwresinstance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_CS__HWRESINSTANCE = eINSTANCE.getComponentResourceTupleDescriptorCS_Hwresinstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ValueTupleDescriptorCSImpl <em>Value Tuple Descriptor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.ValueTupleDescriptorCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getValueTupleDescriptorCS()
		 * @generated
		 */
		EClass VALUE_TUPLE_DESCRIPTOR_CS = eINSTANCE.getValueTupleDescriptorCS();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TUPLE_DESCRIPTOR_CS__VALUE = eINSTANCE.getValueTupleDescriptorCS_Value();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.MeasureFunctionCSImpl <em>Measure Function CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.MeasureFunctionCSImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getMeasureFunctionCS()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintTypes
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getLocationConstraintTypes()
		 * @generated
		 */
		EEnum LOCATION_CONSTRAINT_TYPES = eINSTANCE.getLocationConstraintTypes();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal <em>Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.Goal
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.impl.CsPackageImpl#getGoal()
		 * @generated
		 */
		EEnum GOAL = eINSTANCE.getGoal();

	}

} //CsPackage
