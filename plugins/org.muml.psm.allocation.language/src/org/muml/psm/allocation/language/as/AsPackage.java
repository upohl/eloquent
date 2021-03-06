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
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__RELATIONS = PivotPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SERVICES = PivotPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONSTRAINTS = PivotPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MEASURE = PivotPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__GOAL = PivotPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME_PROVIDER = PivotPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Storage Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__STORAGE_PROVIDER = PivotPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ocl Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OCL_CONTEXT = PivotPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = PivotPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.EvaluableElementImpl <em>Evaluable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.EvaluableElementImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getEvaluableElement()
	 * @generated
	 */
	int EVALUABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT__EXPRESSION = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUABLE_ELEMENT_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.RelationImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ANNOTATING_COMMENTS = PivotPackage.NAMED_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNED_ANNOTATIONS = PivotPackage.NAMED_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNED_COMMENTS = PivotPackage.NAMED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNED_EXTENSIONS = PivotPackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = PivotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__EXPRESSION = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TUPLE_DESCRIPTOR = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LOWER_BOUND = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__UPPER_BOUND = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = PivotPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.BoundImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 3;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__ANNOTATING_COMMENTS = EVALUABLE_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__OWNED_ANNOTATIONS = EVALUABLE_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__OWNED_COMMENTS = EVALUABLE_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__OWNED_EXTENSIONS = EVALUABLE_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__EXPRESSION = EVALUABLE_ELEMENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_FEATURE_COUNT = EVALUABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

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
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.CoherenceConstraintImpl <em>Coherence Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.CoherenceConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getCoherenceConstraint()
	 * @generated
	 */
	int COHERENCE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__ANNOTATING_COMMENTS = CONSTRAINT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__OWNED_ANNOTATIONS = CONSTRAINT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__OWNED_COMMENTS = CONSTRAINT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__OWNED_EXTENSIONS = CONSTRAINT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT__TYPE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coherence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHERENCE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ResourceConstraintImpl <em>Resource Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ResourceConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getResourceConstraint()
	 * @generated
	 */
	int RESOURCE_CONSTRAINT = 6;

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
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.LocationConstraintImpl <em>Location Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.LocationConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getLocationConstraint()
	 * @generated
	 */
	int LOCATION_CONSTRAINT = 7;

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
	 * The number of structural features of the '<em>Location Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintImpl <em>Implication Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ImplicationConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getImplicationConstraint()
	 * @generated
	 */
	int IMPLICATION_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__ANNOTATING_COMMENTS = CONSTRAINT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__OWNED_ANNOTATIONS = CONSTRAINT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__OWNED_COMMENTS = CONSTRAINT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__OWNED_EXTENSIONS = CONSTRAINT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implication Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ForbiddenLocationConstraintImpl <em>Forbidden Location Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ForbiddenLocationConstraintImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getForbiddenLocationConstraint()
	 * @generated
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__ANNOTATING_COMMENTS = CONSTRAINT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__OWNED_ANNOTATIONS = CONSTRAINT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__OWNED_COMMENTS = CONSTRAINT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__OWNED_EXTENSIONS = CONSTRAINT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forbidden Location Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORBIDDEN_LOCATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl <em>Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.TupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTupleDescriptor()
	 * @generated
	 */
	int TUPLE_DESCRIPTOR = 10;

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
	 * The feature id for the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR__SEQUENCE_PART = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.WeightTupleDescriptorImpl <em>Weight Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.WeightTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getWeightTupleDescriptor()
	 * @generated
	 */
	int WEIGHT_TUPLE_DESCRIPTOR = 11;

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
	 * The feature id for the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_TUPLE_DESCRIPTOR__SEQUENCE_PART = TUPLE_DESCRIPTOR__SEQUENCE_PART;

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
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR = 12;

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
	 * The feature id for the '<em><b>Sequence Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_WEIGHT_TUPLE_DESCRIPTOR__SEQUENCE_PART = WEIGHT_TUPLE_DESCRIPTOR__SEQUENCE_PART;

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
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl <em>Implication Constraint Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getImplicationConstraintTupleDescriptor()
	 * @generated
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR = 13;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__ANNOTATING_COMMENTS = PivotPackage.ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__OWNED_ANNOTATIONS = PivotPackage.ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__OWNED_COMMENTS = PivotPackage.ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__OWNED_EXTENSIONS = PivotPackage.ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE = PivotPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Premise Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR = PivotPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION = PivotPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conclusion Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR = PivotPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implication Constraint Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR_FEATURE_COUNT = PivotPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.TypedNamedPartImpl <em>Typed Named Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.TypedNamedPartImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getTypedNamedPart()
	 * @generated
	 */
	int TYPED_NAMED_PART = 14;

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
	int TYPED_PAIR = 15;

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
	int MEASURE_FUNCTION = 16;

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
	int SERVICE = 17;

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
	int QO_SDIMENSION = 18;

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
	int JAVA_IMPLEMENTATION_PROVIDER = 19;

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
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.NameProvider <em>Name Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.NameProvider
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getNameProvider()
	 * @generated
	 */
	int NAME_PROVIDER = 20;

	/**
	 * The number of structural features of the '<em>Name Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.StorageProvider <em>Storage Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.StorageProvider
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getStorageProvider()
	 * @generated
	 */
	int STORAGE_PROVIDER = 21;

	/**
	 * The number of structural features of the '<em>Storage Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.impl.OCLContextImpl <em>OCL Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.impl.OCLContextImpl
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getOCLContext()
	 * @generated
	 */
	int OCL_CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Annotating Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__ANNOTATING_COMMENTS = PivotPackage.TYPED_ELEMENT__ANNOTATING_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__OWNED_ANNOTATIONS = PivotPackage.TYPED_ELEMENT__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__OWNED_COMMENTS = PivotPackage.TYPED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__OWNED_EXTENSIONS = PivotPackage.TYPED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__NAME = PivotPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__IS_MANY = PivotPackage.TYPED_ELEMENT__IS_MANY;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__IS_REQUIRED = PivotPackage.TYPED_ELEMENT__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT__TYPE = PivotPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>OCL Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_FEATURE_COUNT = PivotPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.CoherenceConstraintType <em>Coherence Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.CoherenceConstraintType
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getCoherenceConstraintType()
	 * @generated
	 */
	int COHERENCE_CONSTRAINT_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.language.as.Goal <em>Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.language.as.Goal
	 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 24;


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
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.language.as.Specification#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getRelations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Relations();

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
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.Specification#getOclContext <em>Ocl Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ocl Context</em>'.
	 * @see org.muml.psm.allocation.language.as.Specification#getOclContext()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OclContext();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.EvaluableElement <em>Evaluable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluable Element</em>'.
	 * @see org.muml.psm.allocation.language.as.EvaluableElement
	 * @generated
	 */
	EClass getEvaluableElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.EvaluableElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.psm.allocation.language.as.EvaluableElement#getExpression()
	 * @see #getEvaluableElement()
	 * @generated
	 */
	EReference getEvaluableElement_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.muml.psm.allocation.language.as.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.Relation#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.Relation#getTupleDescriptor()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TupleDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.Relation#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.muml.psm.allocation.language.as.Relation#getLowerBound()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.Relation#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.muml.psm.allocation.language.as.Relation#getUpperBound()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see org.muml.psm.allocation.language.as.Bound
	 * @generated
	 */
	EClass getBound();

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
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.CoherenceConstraint <em>Coherence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coherence Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.CoherenceConstraint
	 * @generated
	 */
	EClass getCoherenceConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.CoherenceConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.CoherenceConstraint#getTupleDescriptor()
	 * @see #getCoherenceConstraint()
	 * @generated
	 */
	EReference getCoherenceConstraint_TupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.CoherenceConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.muml.psm.allocation.language.as.CoherenceConstraint#getType()
	 * @see #getCoherenceConstraint()
	 * @generated
	 */
	EAttribute getCoherenceConstraint_Type();

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
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.ImplicationConstraint <em>Implication Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraint
	 * @generated
	 */
	EClass getImplicationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.ImplicationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraint#getTupleDescriptor()
	 * @see #getImplicationConstraint()
	 * @generated
	 */
	EReference getImplicationConstraint_TupleDescriptor();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.ForbiddenLocationConstraint <em>Forbidden Location Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forbidden Location Constraint</em>'.
	 * @see org.muml.psm.allocation.language.as.ForbiddenLocationConstraint
	 * @generated
	 */
	EClass getForbiddenLocationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.ForbiddenLocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ForbiddenLocationConstraint#getTupleDescriptor()
	 * @see #getForbiddenLocationConstraint()
	 * @generated
	 */
	EReference getForbiddenLocationConstraint_TupleDescriptor();

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
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.TupleDescriptor#getSequencePart <em>Sequence Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Part</em>'.
	 * @see org.muml.psm.allocation.language.as.TupleDescriptor#getSequencePart()
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	EAttribute getTupleDescriptor_SequencePart();

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
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor <em>Implication Constraint Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Constraint Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor
	 * @generated
	 */
	EClass getImplicationConstraintTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getPremise()
	 * @see #getImplicationConstraintTupleDescriptor()
	 * @generated
	 */
	EAttribute getImplicationConstraintTupleDescriptor_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getPremiseTupleDescriptor <em>Premise Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getPremiseTupleDescriptor()
	 * @see #getImplicationConstraintTupleDescriptor()
	 * @generated
	 */
	EReference getImplicationConstraintTupleDescriptor_PremiseTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getConclusion()
	 * @see #getImplicationConstraintTupleDescriptor()
	 * @generated
	 */
	EAttribute getImplicationConstraintTupleDescriptor_Conclusion();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getConclusionTupleDescriptor <em>Conclusion Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conclusion Tuple Descriptor</em>'.
	 * @see org.muml.psm.allocation.language.as.ImplicationConstraintTupleDescriptor#getConclusionTupleDescriptor()
	 * @see #getImplicationConstraintTupleDescriptor()
	 * @generated
	 */
	EReference getImplicationConstraintTupleDescriptor_ConclusionTupleDescriptor();

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
	 * Returns the meta object for class '{@link org.muml.psm.allocation.language.as.OCLContext <em>OCL Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Context</em>'.
	 * @see org.muml.psm.allocation.language.as.OCLContext
	 * @generated
	 */
	EClass getOCLContext();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.language.as.CoherenceConstraintType <em>Coherence Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coherence Constraint Type</em>'.
	 * @see org.muml.psm.allocation.language.as.CoherenceConstraintType
	 * @generated
	 */
	EEnum getCoherenceConstraintType();

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
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__RELATIONS = eINSTANCE.getSpecification_Relations();

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
		 * The meta object literal for the '<em><b>Ocl Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OCL_CONTEXT = eINSTANCE.getSpecification_OclContext();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.EvaluableElementImpl <em>Evaluable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.EvaluableElementImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getEvaluableElement()
		 * @generated
		 */
		EClass EVALUABLE_ELEMENT = eINSTANCE.getEvaluableElement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUABLE_ELEMENT__EXPRESSION = eINSTANCE.getEvaluableElement_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.RelationImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TUPLE_DESCRIPTOR = eINSTANCE.getRelation_TupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LOWER_BOUND = eINSTANCE.getRelation_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__UPPER_BOUND = eINSTANCE.getRelation_UpperBound();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.BoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.BoundImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getBound()
		 * @generated
		 */
		EClass BOUND = eINSTANCE.getBound();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.CoherenceConstraintImpl <em>Coherence Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.CoherenceConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getCoherenceConstraint()
		 * @generated
		 */
		EClass COHERENCE_CONSTRAINT = eINSTANCE.getCoherenceConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COHERENCE_CONSTRAINT__TUPLE_DESCRIPTOR = eINSTANCE.getCoherenceConstraint_TupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COHERENCE_CONSTRAINT__TYPE = eINSTANCE.getCoherenceConstraint_Type();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintImpl <em>Implication Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ImplicationConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getImplicationConstraint()
		 * @generated
		 */
		EClass IMPLICATION_CONSTRAINT = eINSTANCE.getImplicationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_CONSTRAINT__TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraint_TupleDescriptor();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ForbiddenLocationConstraintImpl <em>Forbidden Location Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ForbiddenLocationConstraintImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getForbiddenLocationConstraint()
		 * @generated
		 */
		EClass FORBIDDEN_LOCATION_CONSTRAINT = eINSTANCE.getForbiddenLocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORBIDDEN_LOCATION_CONSTRAINT__TUPLE_DESCRIPTOR = eINSTANCE.getForbiddenLocationConstraint_TupleDescriptor();

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
		 * The meta object literal for the '<em><b>Sequence Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_DESCRIPTOR__SEQUENCE_PART = eINSTANCE.getTupleDescriptor_SequencePart();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl <em>Implication Constraint Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.ImplicationConstraintTupleDescriptorImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getImplicationConstraintTupleDescriptor()
		 * @generated
		 */
		EClass IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraintTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Premise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE = eINSTANCE.getImplicationConstraintTupleDescriptor_Premise();

		/**
		 * The meta object literal for the '<em><b>Premise Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__PREMISE_TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraintTupleDescriptor_PremiseTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Conclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION = eINSTANCE.getImplicationConstraintTupleDescriptor_Conclusion();

		/**
		 * The meta object literal for the '<em><b>Conclusion Tuple Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_CONSTRAINT_TUPLE_DESCRIPTOR__CONCLUSION_TUPLE_DESCRIPTOR = eINSTANCE.getImplicationConstraintTupleDescriptor_ConclusionTupleDescriptor();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.NameProvider <em>Name Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.NameProvider
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getNameProvider()
		 * @generated
		 */
		EClass NAME_PROVIDER = eINSTANCE.getNameProvider();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.StorageProvider <em>Storage Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.StorageProvider
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getStorageProvider()
		 * @generated
		 */
		EClass STORAGE_PROVIDER = eINSTANCE.getStorageProvider();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.impl.OCLContextImpl <em>OCL Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.impl.OCLContextImpl
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getOCLContext()
		 * @generated
		 */
		EClass OCL_CONTEXT = eINSTANCE.getOCLContext();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.language.as.CoherenceConstraintType <em>Coherence Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.language.as.CoherenceConstraintType
		 * @see org.muml.psm.allocation.language.as.impl.AsPackageImpl#getCoherenceConstraintType()
		 * @generated
		 */
		EEnum COHERENCE_CONSTRAINT_TYPE = eINSTANCE.getCoherenceConstraintType();

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
