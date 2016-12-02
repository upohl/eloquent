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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>Name Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME_PROVIDER = PivotPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Storage Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__STORAGE_PROVIDER = PivotPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = PivotPackage.MODEL_FEATURE_COUNT + 6;

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
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

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
	int LOCATION_CONSTRAINT = 3;

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
	int RESOURCE_CONSTRAINT = 4;

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
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__TUPLE_DESCRIPTOR = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.RequiredHardwareResourceInstanceConstraintImpl <em>Required Hardware Resource Instance Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.RequiredHardwareResourceInstanceConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getRequiredHardwareResourceInstanceConstraint()
	 * @generated
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT = 5;

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
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__TUPLE_DESCRIPTOR = CONSTRAINT_FEATURE_COUNT + 0;

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
	int TUPLE_DESCRIPTOR = 6;

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
	 * The feature id for the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR__TYPED_PAIRS = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.WeightTupleDescriptorImpl <em>Weight Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.WeightTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getWeightTupleDescriptor()
	 * @generated
	 */
	int WEIGHT_TUPLE_DESCRIPTOR = 7;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__OWNED_COMMENTS = TUPLE_DESCRIPTOR__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = TUPLE_DESCRIPTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__TYPED_PAIRS = TUPLE_DESCRIPTOR__TYPED_PAIRS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__WEIGHT = TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weight Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR_FEATURE_COUNT = TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.BoundWeightTupleDescriptorImpl <em>Bound Weight Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.BoundWeightTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getBoundWeightTupleDescriptor()
	 * @generated
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR = 8;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = WEIGHT_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = WEIGHT_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__OWNED_COMMENTS = WEIGHT_TUPLE_DESCRIPTOR__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = WEIGHT_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Typed Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__TYPED_PAIRS = WEIGHT_TUPLE_DESCRIPTOR__TYPED_PAIRS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__WEIGHT = WEIGHT_TUPLE_DESCRIPTOR__WEIGHT;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__BOUND = WEIGHT_TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bound Weight Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR_FEATURE_COUNT = WEIGHT_TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.TypedNamedPartImpl <em>Typed Named Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.TypedNamedPartImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTypedNamedPart()
	 * @generated
	 */
	int TYPED_NAMED_PART = 9;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__ANNOTATING_COMMENTS = PivotPackage.TYPED_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__OWNED_ANNOTATIONS = PivotPackage.TYPED_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__OWNED_COMMENTS = PivotPackage.TYPED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__OWNED_EXTENSIONS = PivotPackage.TYPED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__NAME = PivotPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__IS_MANY = PivotPackage.TYPED_ELEMENT__IS_MANY;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__IS_REQUIRED = PivotPackage.TYPED_ELEMENT__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART__TYPE = PivotPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Typed Named Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NAMED_PART_FEATURE_COUNT = PivotPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.TypedPairImpl <em>Typed Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.TypedPairImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTypedPair()
	 * @generated
	 */
	int TYPED_PAIR = 10;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR__FIRST = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR__SECOND = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PAIR_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.MeasureFunctionImpl <em>Measure Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.MeasureFunctionImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getMeasureFunction()
	 * @generated
	 */
	int MEASURE_FUNCTION = 11;

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
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ServiceImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 12;

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
	int QO_SDIMENSION = 13;

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
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__TUPLE_DESCRIPTOR = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qo SDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_FEATURE_COUNT = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.JavaImplementationProviderImpl <em>Java Implementation Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.JavaImplementationProviderImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getJavaImplementationProvider()
	 * @generated
	 */
	int JAVA_IMPLEMENTATION_PROVIDER = 14;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Java Implementation Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_IMPLEMENTATION_PROVIDER_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.NameProviderImpl <em>Name Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.NameProviderImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getNameProvider()
	 * @generated
	 */
	int NAME_PROVIDER = 15;

	/**
	 * The number of structural features of the '<em>Name Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.StorageProviderImpl <em>Storage Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.StorageProviderImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getStorageProvider()
	 * @generated
	 */
	int STORAGE_PROVIDER = 16;

	/**
	 * The number of structural features of the '<em>Storage Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.LocationConstraintTypes
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationConstraintTypes()
	 * @generated
	 */
	int LOCATION_CONSTRAINT_TYPES = 17;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.Goal <em>Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.Goal
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 18;


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
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.language.as.Specification#getNameProvider <em>Name Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Provider</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getNameProvider()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_NameProvider();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.language.as.Specification#getStorageProvider <em>Storage Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage Provider</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getStorageProvider()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_StorageProvider();

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
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.ResourceConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ResourceConstraint#getTupleDescriptor()
	 * @see #getResourceConstraint()
	 * @generated
	 */
	EReference getResourceConstraint_TupleDescriptor();

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
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint#getTupleDescriptor()
	 * @see #getRequiredHardwareResourceInstanceConstraint()
	 * @generated
	 */
	EReference getRequiredHardwareResourceInstanceConstraint_TupleDescriptor();

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
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.TupleDescriptor#getTypedPairs <em>Typed Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typed Pairs</em>'.
	 * @see org.muml.psm.allocation.language.as.TupleDescriptor#getTypedPairs()
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	EReference getTupleDescriptor_TypedPairs();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.WeightTupleDescriptor <em>Weight Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weight Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.WeightTupleDescriptor
	 * @generated
	 */
	EClass getWeightTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.WeightTupleDescriptor#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.muml.psm.allocation.language.as.WeightTupleDescriptor#getWeight()
	 * @see #getWeightTupleDescriptor()
	 * @generated
	 */
	EAttribute getWeightTupleDescriptor_Weight();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor <em>Bound Weight Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Weight Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor
	 * @generated
	 */
	EClass getBoundWeightTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor#getBound()
	 * @see #getBoundWeightTupleDescriptor()
	 * @generated
	 */
	EAttribute getBoundWeightTupleDescriptor_Bound();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.TypedNamedPart <em>Typed Named Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Named Part</em>'.
	 * @see org.muml.psm.allocation.language.as.TypedNamedPart
	 * @generated
	 */
	EClass getTypedNamedPart();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.TypedPair <em>Typed Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Pair</em>'.
	 * @see org.muml.psm.allocation.language.as.TypedPair
	 * @generated
	 */
	EClass getTypedPair();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.TypedPair#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see org.muml.psm.allocation.language.as.TypedPair#getFirst()
	 * @see #getTypedPair()
	 * @generated
	 */
	EReference getTypedPair_First();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.TypedPair#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see org.muml.psm.allocation.language.as.TypedPair#getSecond()
	 * @see #getTypedPair()
	 * @generated
	 */
	EReference getTypedPair_Second();

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
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.QoSDimension#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.QoSDimension#getTupleDescriptor()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EReference getQoSDimension_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.JavaImplementationProvider <em>Java Implementation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Implementation Provider</em>'.
	 * @see org.muml.psm.allocation.language.as.JavaImplementationProvider
	 * @generated
	 */
	EClass getJavaImplementationProvider();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.NameProvider <em>Name Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Provider</em>'.
	 * @see org.muml.psm.allocation.language.as.NameProvider
	 * @generated
	 */
	EClass getNameProvider();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.StorageProvider <em>Storage Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Provider</em>'.
	 * @see org.muml.psm.allocation.language.as.StorageProvider
	 * @generated
	 */
	EClass getStorageProvider();

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
		 * The meta object literal for the '<em><b>Name Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__NAME_PROVIDER = eINSTANCE.getSpecification_NameProvider();

		/**
		 * The meta object literal for the '<em><b>Storage Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__STORAGE_PROVIDER = eINSTANCE.getSpecification_StorageProvider();

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
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT__TUPLE_DESCRIPTOR = eINSTANCE.getResourceConstraint_TupleDescriptor();

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
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__TUPLE_DESCRIPTOR = eINSTANCE.getRequiredHardwareResourceInstanceConstraint_TupleDescriptor();

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
		 * The meta object literal for the '<em><b>Typed Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_DESCRIPTOR__TYPED_PAIRS = eINSTANCE.getTupleDescriptor_TypedPairs();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.WeightTupleDescriptorImpl <em>Weight Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.WeightTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getWeightTupleDescriptor()
		 * @generated
		 */
		EClass WEIGHT_TUPLE_DESCRIPTOR = eINSTANCE.getWeightTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHT_TUPLE_DESCRIPTOR__WEIGHT = eINSTANCE.getWeightTupleDescriptor_Weight();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.BoundWeightTupleDescriptorImpl <em>Bound Weight Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.BoundWeightTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getBoundWeightTupleDescriptor()
		 * @generated
		 */
		EClass BOUND_WEIGHT_TUPLE_DESCRIPTOR = eINSTANCE.getBoundWeightTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND_WEIGHT_TUPLE_DESCRIPTOR__BOUND = eINSTANCE.getBoundWeightTupleDescriptor_Bound();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.TypedNamedPartImpl <em>Typed Named Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.TypedNamedPartImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTypedNamedPart()
		 * @generated
		 */
		EClass TYPED_NAMED_PART = eINSTANCE.getTypedNamedPart();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.TypedPairImpl <em>Typed Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.TypedPairImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTypedPair()
		 * @generated
		 */
		EClass TYPED_PAIR = eINSTANCE.getTypedPair();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_PAIR__FIRST = eINSTANCE.getTypedPair_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_PAIR__SECOND = eINSTANCE.getTypedPair_Second();

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
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENSION__TUPLE_DESCRIPTOR = eINSTANCE.getQoSDimension_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.JavaImplementationProviderImpl <em>Java Implementation Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.JavaImplementationProviderImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getJavaImplementationProvider()
		 * @generated
		 */
		EClass JAVA_IMPLEMENTATION_PROVIDER = eINSTANCE.getJavaImplementationProvider();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.NameProviderImpl <em>Name Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.NameProviderImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getNameProvider()
		 * @generated
		 */
		EClass NAME_PROVIDER = eINSTANCE.getNameProvider();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.StorageProviderImpl <em>Storage Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.StorageProviderImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getStorageProvider()
		 * @generated
		 */
		EClass STORAGE_PROVIDER = eINSTANCE.getStorageProvider();

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
