/**
 */
package org.muml.psm.allocation.language.as;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.pivot.PivotPackage;

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
 * @see org.muml.psm.allocation.language.as.AsFactory
 * @model kind="package"
 * @generated
 */
public interface AsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "as";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/allocation/language/as/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "as";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsPackage eINSTANCE = org.muml.psm.allocation.language.as.impl.AsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.SpecificationImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ANNOTATING_COMMENTS = PivotPackage.MODEL__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_ANNOTATIONS = PivotPackage.MODEL__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_COMMENTS = PivotPackage.MODEL__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_EXTENSIONS = PivotPackage.MODEL__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = PivotPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_CONSTRAINTS = PivotPackage.MODEL__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>External URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EXTERNAL_URI = PivotPackage.MODEL__EXTERNAL_URI;

	/**
	 * The feature id for the '<em><b>Owned Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_IMPORTS = PivotPackage.MODEL__OWNED_IMPORTS;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_PACKAGES = PivotPackage.MODEL__OWNED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SERVICES = PivotPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONSTRAINTS = PivotPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MEASURE = PivotPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__GOAL = PivotPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = PivotPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.EvaluatableElementImpl <em>Evaluatable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.EvaluatableElementImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getEvaluatableElement()
	 * @generated
	 */
	int EVALUATABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT__EXPRESSION = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluatable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATABLE_ELEMENT_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.WeightingComponentResourceTupleElementImpl <em>Weighting Component Resource Tuple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.WeightingComponentResourceTupleElementImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getWeightingComponentResourceTupleElement()
	 * @generated
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weighting Component Resource Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ServiceImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANNOTATING_COMMENTS = PivotPackage.NAMED_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OWNED_ANNOTATIONS = PivotPackage.NAMED_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OWNED_COMMENTS = PivotPackage.NAMED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OWNED_EXTENSIONS = PivotPackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = PivotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DIMENSIONS = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.QoSDimensionImpl <em>Qo SDimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.QoSDimensionImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getQoSDimension()
	 * @generated
	 */
	int QO_SDIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__ANNOTATING_COMMENTS = PivotPackage.NAMED_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__OWNED_ANNOTATIONS = PivotPackage.NAMED_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__OWNED_COMMENTS = PivotPackage.NAMED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__OWNED_EXTENSIONS = PivotPackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__NAME = PivotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__EXPRESSION = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__TUPLE_DESCRIPTORS = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__WEIGHTING = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Qo SDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_FEATURE_COUNT = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ANNOTATING_COMMENTS = PivotPackage.NAMED_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_ANNOTATIONS = PivotPackage.NAMED_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_COMMENTS = PivotPackage.NAMED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_EXTENSIONS = PivotPackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = PivotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.LocationConstraintImpl <em>Location Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.LocationConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationConstraint()
	 * @generated
	 */
	int LOCATION_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__ANNOTATING_COMMENTS = CONSTRAINT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__OWNED_ANNOTATIONS = CONSTRAINT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__OWNED_COMMENTS = CONSTRAINT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__OWNED_EXTENSIONS = CONSTRAINT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__TYPE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ResourceConstraintImpl <em>Resource Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ResourceConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getResourceConstraint()
	 * @generated
	 */
	int RESOURCE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__ANNOTATING_COMMENTS = CONSTRAINT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__OWNED_ANNOTATIONS = CONSTRAINT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__OWNED_COMMENTS = CONSTRAINT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__OWNED_EXTENSIONS = CONSTRAINT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__WEIGHTING = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__RHS = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.RequiredHardwareResourceInstanceConstraintImpl <em>Required Hardware Resource Instance Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.RequiredHardwareResourceInstanceConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getRequiredHardwareResourceInstanceConstraint()
	 * @generated
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__ANNOTATING_COMMENTS = CONSTRAINT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__OWNED_ANNOTATIONS = CONSTRAINT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__OWNED_COMMENTS = CONSTRAINT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__OWNED_EXTENSIONS = CONSTRAINT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__TUPLE_DESCRIPTORS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Hardware Resource Instance Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl <em>Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTupleDescriptor()
	 * @generated
	 */
	int TUPLE_DESCRIPTOR = 9;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.InstanceTupleDescriptorImpl <em>Instance Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.InstanceTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getInstanceTupleDescriptor()
	 * @generated
	 */
	int INSTANCE_TUPLE_DESCRIPTOR = 10;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR__OWNED_COMMENTS = TUPLE_DESCRIPTOR__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = TUPLE_DESCRIPTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR__INSTANCE = TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT = TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.LocationTupleDescriptorImpl <em>Location Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.LocationTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationTupleDescriptor()
	 * @generated
	 */
	int LOCATION_TUPLE_DESCRIPTOR = 11;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = INSTANCE_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = INSTANCE_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__OWNED_COMMENTS = INSTANCE_TUPLE_DESCRIPTOR__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = INSTANCE_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__INSTANCE = INSTANCE_TUPLE_DESCRIPTOR__INSTANCE;

	/**
	 * The feature id for the '<em><b>Second Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__SECOND_INSTANCE = INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_FEATURE_COUNT = INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ComponentResourceTupleDescriptorImpl <em>Component Resource Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ComponentResourceTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getComponentResourceTupleDescriptor()
	 * @generated
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR = 12;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = INSTANCE_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = INSTANCE_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__OWNED_COMMENTS = INSTANCE_TUPLE_DESCRIPTOR__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = INSTANCE_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__INSTANCE = INSTANCE_TUPLE_DESCRIPTOR__INSTANCE;

	/**
	 * The feature id for the '<em><b>Hwresinstance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE = INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Resource Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_FEATURE_COUNT = INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ValueTupleDescriptorImpl <em>Value Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ValueTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getValueTupleDescriptor()
	 * @generated
	 */
	int VALUE_TUPLE_DESCRIPTOR = 13;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR__OWNED_COMMENTS = TUPLE_DESCRIPTOR__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = TUPLE_DESCRIPTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR__VALUE = TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_FEATURE_COUNT = TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.MeasureFunctionImpl <em>Measure Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.MeasureFunctionImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getMeasureFunction()
	 * @generated
	 */
	int MEASURE_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION__SERVICES = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.LocationConstraintTypes
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationConstraintTypes()
	 * @generated
	 */
	int LOCATION_CONSTRAINT_TYPES = 15;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.Goal <em>Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.Goal
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 16;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.Specification#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getServices()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.Specification#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getConstraints()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.Specification#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getMeasure()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Measure();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.Specification#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getGoal()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Goal();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.EvaluatableElement <em>Evaluatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluatable Element</em>'.
	 * @see org.muml.psm.allocation.language.as.EvaluatableElement
	 * @generated
	 */
	EClass getEvaluatableElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.EvaluatableElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.psm.allocation.language.as.EvaluatableElement#getExpression()
	 * @see #getEvaluatableElement()
	 * @generated
	 */
	EReference getEvaluatableElement_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement <em>Weighting Component Resource Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighting Component Resource Tuple Element</em>'.
	 * @see org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement
	 * @generated
	 */
	EClass getWeightingComponentResourceTupleElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement#getTupleDescriptors()
	 * @see #getWeightingComponentResourceTupleElement()
	 * @generated
	 */
	EReference getWeightingComponentResourceTupleElement_TupleDescriptors();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement#getWeighting <em>Weighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weighting</em>'.
	 * @see org.muml.psm.allocation.language.as.WeightingComponentResourceTupleElement#getWeighting()
	 * @see #getWeightingComponentResourceTupleElement()
	 * @generated
	 */
	EReference getWeightingComponentResourceTupleElement_Weighting();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.muml.psm.allocation.language.as.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.Service#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see org.muml.psm.allocation.language.as.Service#getDimensions()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Dimensions();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.QoSDimension <em>Qo SDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDimension</em>'.
	 * @see org.muml.psm.allocation.language.as.QoSDimension
	 * @generated
	 */
	EClass getQoSDimension();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.LocationConstraint <em>Location Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.LocationConstraint
	 * @generated
	 */
	EClass getLocationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.LocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.LocationConstraint#getTupleDescriptor()
	 * @see #getLocationConstraint()
	 * @generated
	 */
	EReference getLocationConstraint_TupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.LocationConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.psm.allocation.language.as.LocationConstraint#getType()
	 * @see #getLocationConstraint()
	 * @generated
	 */
	EAttribute getLocationConstraint_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.ResourceConstraint <em>Resource Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.ResourceConstraint
	 * @generated
	 */
	EClass getResourceConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.ResourceConstraint#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.muml.psm.allocation.language.as.ResourceConstraint#getRhs()
	 * @see #getResourceConstraint()
	 * @generated
	 */
	EReference getResourceConstraint_Rhs();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint <em>Required Hardware Resource Instance Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Hardware Resource Instance Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint
	 * @generated
	 */
	EClass getRequiredHardwareResourceInstanceConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint#getTupleDescriptors()
	 * @see #getRequiredHardwareResourceInstanceConstraint()
	 * @generated
	 */
	EReference getRequiredHardwareResourceInstanceConstraint_TupleDescriptors();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.TupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.TupleDescriptor
	 * @generated
	 */
	EClass getTupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.InstanceTupleDescriptor <em>Instance Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.InstanceTupleDescriptor
	 * @generated
	 */
	EClass getInstanceTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.InstanceTupleDescriptor#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see org.muml.psm.allocation.language.as.InstanceTupleDescriptor#getInstance()
	 * @see #getInstanceTupleDescriptor()
	 * @generated
	 */
	EAttribute getInstanceTupleDescriptor_Instance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.LocationTupleDescriptor <em>Location Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.LocationTupleDescriptor
	 * @generated
	 */
	EClass getLocationTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.LocationTupleDescriptor#getSecondInstance <em>Second Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Instance</em>'.
	 * @see org.muml.psm.allocation.language.as.LocationTupleDescriptor#getSecondInstance()
	 * @see #getLocationTupleDescriptor()
	 * @generated
	 */
	EAttribute getLocationTupleDescriptor_SecondInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor <em>Component Resource Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Resource Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor
	 * @generated
	 */
	EClass getComponentResourceTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor#getHwresinstance <em>Hwresinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwresinstance</em>'.
	 * @see org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor#getHwresinstance()
	 * @see #getComponentResourceTupleDescriptor()
	 * @generated
	 */
	EAttribute getComponentResourceTupleDescriptor_Hwresinstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.ValueTupleDescriptor <em>Value Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ValueTupleDescriptor
	 * @generated
	 */
	EClass getValueTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.ValueTupleDescriptor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.psm.allocation.language.as.ValueTupleDescriptor#getValue()
	 * @see #getValueTupleDescriptor()
	 * @generated
	 */
	EAttribute getValueTupleDescriptor_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.MeasureFunction <em>Measure Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Function</em>'.
	 * @see org.muml.psm.allocation.language.as.MeasureFunction
	 * @generated
	 */
	EClass getMeasureFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.psm.allocation.language.as.MeasureFunction#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.muml.psm.allocation.language.as.MeasureFunction#getServices()
	 * @see #getMeasureFunction()
	 * @generated
	 */
	EReference getMeasureFunction_Services();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.language.as.LocationConstraintTypes <em>Location Constraint Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Constraint Types</em>'.
	 * @see org.muml.psm.allocation.language.as.LocationConstraintTypes
	 * @generated
	 */
	EEnum getLocationConstraintTypes();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.language.as.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal</em>'.
	 * @see org.muml.psm.allocation.language.as.Goal
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
	AsFactory getAsFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.SpecificationImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SERVICES = eINSTANCE.getSpecification_Services();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONSTRAINTS = eINSTANCE.getSpecification_Constraints();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__MEASURE = eINSTANCE.getSpecification_Measure();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__GOAL = eINSTANCE.getSpecification_Goal();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.EvaluatableElementImpl <em>Evaluatable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.EvaluatableElementImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getEvaluatableElement()
		 * @generated
		 */
		EClass EVALUATABLE_ELEMENT = eINSTANCE.getEvaluatableElement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATABLE_ELEMENT__EXPRESSION = eINSTANCE.getEvaluatableElement_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.WeightingComponentResourceTupleElementImpl <em>Weighting Component Resource Tuple Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.WeightingComponentResourceTupleElementImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getWeightingComponentResourceTupleElement()
		 * @generated
		 */
		EClass WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT = eINSTANCE.getWeightingComponentResourceTupleElement();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__TUPLE_DESCRIPTORS = eINSTANCE.getWeightingComponentResourceTupleElement_TupleDescriptors();

		/**
		 * The meta object literal for the '<em><b>Weighting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTING_COMPONENT_RESOURCE_TUPLE_ELEMENT__WEIGHTING = eINSTANCE.getWeightingComponentResourceTupleElement_Weighting();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ServiceImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DIMENSIONS = eINSTANCE.getService_Dimensions();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.QoSDimensionImpl <em>Qo SDimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.QoSDimensionImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getQoSDimension()
		 * @generated
		 */
		EClass QO_SDIMENSION = eINSTANCE.getQoSDimension();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.LocationConstraintImpl <em>Location Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.LocationConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationConstraint()
		 * @generated
		 */
		EClass LOCATION_CONSTRAINT = eINSTANCE.getLocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR = eINSTANCE.getLocationConstraint_TupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_CONSTRAINT__TYPE = eINSTANCE.getLocationConstraint_Type();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ResourceConstraintImpl <em>Resource Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ResourceConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getResourceConstraint()
		 * @generated
		 */
		EClass RESOURCE_CONSTRAINT = eINSTANCE.getResourceConstraint();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT__RHS = eINSTANCE.getResourceConstraint_Rhs();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.RequiredHardwareResourceInstanceConstraintImpl <em>Required Hardware Resource Instance Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.RequiredHardwareResourceInstanceConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getRequiredHardwareResourceInstanceConstraint()
		 * @generated
		 */
		EClass REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT = eINSTANCE.getRequiredHardwareResourceInstanceConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__TUPLE_DESCRIPTORS = eINSTANCE.getRequiredHardwareResourceInstanceConstraint_TupleDescriptors();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl <em>Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTupleDescriptor()
		 * @generated
		 */
		EClass TUPLE_DESCRIPTOR = eINSTANCE.getTupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.InstanceTupleDescriptorImpl <em>Instance Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.InstanceTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getInstanceTupleDescriptor()
		 * @generated
		 */
		EClass INSTANCE_TUPLE_DESCRIPTOR = eINSTANCE.getInstanceTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TUPLE_DESCRIPTOR__INSTANCE = eINSTANCE.getInstanceTupleDescriptor_Instance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.LocationTupleDescriptorImpl <em>Location Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.LocationTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationTupleDescriptor()
		 * @generated
		 */
		EClass LOCATION_TUPLE_DESCRIPTOR = eINSTANCE.getLocationTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Second Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TUPLE_DESCRIPTOR__SECOND_INSTANCE = eINSTANCE.getLocationTupleDescriptor_SecondInstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ComponentResourceTupleDescriptorImpl <em>Component Resource Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ComponentResourceTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getComponentResourceTupleDescriptor()
		 * @generated
		 */
		EClass COMPONENT_RESOURCE_TUPLE_DESCRIPTOR = eINSTANCE.getComponentResourceTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Hwresinstance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE = eINSTANCE.getComponentResourceTupleDescriptor_Hwresinstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ValueTupleDescriptorImpl <em>Value Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ValueTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getValueTupleDescriptor()
		 * @generated
		 */
		EClass VALUE_TUPLE_DESCRIPTOR = eINSTANCE.getValueTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TUPLE_DESCRIPTOR__VALUE = eINSTANCE.getValueTupleDescriptor_Value();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.MeasureFunctionImpl <em>Measure Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.MeasureFunctionImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getMeasureFunction()
		 * @generated
		 */
		EClass MEASURE_FUNCTION = eINSTANCE.getMeasureFunction();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_FUNCTION__SERVICES = eINSTANCE.getMeasureFunction_Services();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.LocationConstraintTypes
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationConstraintTypes()
		 * @generated
		 */
		EEnum LOCATION_CONSTRAINT_TYPES = eINSTANCE.getLocationConstraintTypes();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.Goal <em>Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.Goal
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getGoal()
		 * @generated
		 */
		EEnum GOAL = eINSTANCE.getGoal();

	}

} //AsPackage
