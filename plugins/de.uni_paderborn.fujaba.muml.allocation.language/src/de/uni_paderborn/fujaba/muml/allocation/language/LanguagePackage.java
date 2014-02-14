/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains all classes which describe the abstract
 * syntax of the deployment specification language.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.allocation.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "language";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/allocation/language/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguagePackage eINSTANCE = de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.OptionalNamedElementImpl <em>Optional Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.OptionalNamedElementImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getOptionalNamedElement()
	 * @generated
	 */
	int OPTIONAL_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Optional Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optional Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.SpecificationImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SERVICES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONSTRAINTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MEASURE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ServiceImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DIMENSIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl <em>Qo SDimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getQoSDimension()
	 * @generated
	 */
	int QO_SDIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__METRIC = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__TUPLE_DESCRIPTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION__VALUE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Qo SDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Qo SDimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDIMENSION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = OPTIONAL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = OPTIONAL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = OPTIONAL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = OPTIONAL_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationConstraintImpl <em>Location Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getLocationConstraint()
	 * @generated
	 */
	int LOCATION_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__EXPRESSION = CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Tuple Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT__TUPLE_DESCRIPTORS = CONSTRAINT_FEATURE_COUNT + 0;

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
	 * The number of operations of the '<em>Location Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ResourceConstraintImpl <em>Resource Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ResourceConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getResourceConstraint()
	 * @generated
	 */
	int RESOURCE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
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
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT__LHS = CONSTRAINT_FEATURE_COUNT + 1;

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
	 * The number of operations of the '<em>Resource Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.RequiredHardwareResourceInstanceConstraintImpl <em>Required Hardware Resource Instance Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.RequiredHardwareResourceInstanceConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getRequiredHardwareResourceInstanceConstraint()
	 * @generated
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
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
	 * The number of operations of the '<em>Required Hardware Resource Instance Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HARDWARE_RESOURCE_INSTANCE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.TupleDescriptorImpl <em>Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.TupleDescriptorImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getTupleDescriptor()
	 * @generated
	 */
	int TUPLE_DESCRIPTOR = 8;

	/**
	 * The number of structural features of the '<em>Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.InstanceTupleDescriptorImpl <em>Instance Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.InstanceTupleDescriptorImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getInstanceTupleDescriptor()
	 * @generated
	 */
	int INSTANCE_TUPLE_DESCRIPTOR = 9;

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
	 * The number of operations of the '<em>Instance Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TUPLE_DESCRIPTOR_OPERATION_COUNT = TUPLE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationTupleDescriptorImpl <em>Location Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationTupleDescriptorImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getLocationTupleDescriptor()
	 * @generated
	 */
	int LOCATION_TUPLE_DESCRIPTOR = 10;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__INSTANCE = INSTANCE_TUPLE_DESCRIPTOR__INSTANCE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR__INSTANCES = INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_FEATURE_COUNT = INSTANCE_TUPLE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TUPLE_DESCRIPTOR_OPERATION_COUNT = INSTANCE_TUPLE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ComponentResourceTupleDescriptorImpl <em>Component Resource Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ComponentResourceTupleDescriptorImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getComponentResourceTupleDescriptor()
	 * @generated
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR = 11;

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
	 * The number of operations of the '<em>Component Resource Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RESOURCE_TUPLE_DESCRIPTOR_OPERATION_COUNT = INSTANCE_TUPLE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ValueTupleDescriptorImpl <em>Value Tuple Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ValueTupleDescriptorImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getValueTupleDescriptor()
	 * @generated
	 */
	int VALUE_TUPLE_DESCRIPTOR = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Tuple Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TUPLE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.MeasureFunctionImpl <em>Measure Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.MeasureFunctionImpl
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getMeasureFunction()
	 * @generated
	 */
	int MEASURE_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION__SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Measure Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measure Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getLocationConstraintTypes()
	 * @generated
	 */
	int LOCATION_CONSTRAINT_TYPES = 14;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.OptionalNamedElement <em>Optional Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Named Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.OptionalNamedElement
	 * @generated
	 */
	EClass getOptionalNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.OptionalNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.OptionalNamedElement#getName()
	 * @see #getOptionalNamedElement()
	 * @generated
	 */
	EAttribute getOptionalNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.Specification#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Specification#getServices()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.Specification#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Specification#getConstraints()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.Specification#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Specification#getMeasure()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Measure();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.Service#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Service#getDimensions()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Dimensions();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension <em>Qo SDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDimension</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension
	 * @generated
	 */
	EClass getQoSDimension();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getMetric()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EAttribute getQoSDimension_Metric();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getTupleDescriptors()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EReference getQoSDimension_TupleDescriptors();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.QoSDimension#getValue()
	 * @see #getQoSDimension()
	 * @generated
	 */
	EReference getQoSDimension_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint <em>Location Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint
	 * @generated
	 */
	EClass getLocationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint#getTupleDescriptors()
	 * @see #getLocationConstraint()
	 * @generated
	 */
	EReference getLocationConstraint_TupleDescriptors();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraint#getType()
	 * @see #getLocationConstraint()
	 * @generated
	 */
	EAttribute getLocationConstraint_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint <em>Resource Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint
	 * @generated
	 */
	EClass getResourceConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getTupleDescriptors()
	 * @see #getResourceConstraint()
	 * @generated
	 */
	EReference getResourceConstraint_TupleDescriptors();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getLhs()
	 * @see #getResourceConstraint()
	 * @generated
	 */
	EReference getResourceConstraint_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ResourceConstraint#getRhs()
	 * @see #getResourceConstraint()
	 * @generated
	 */
	EReference getResourceConstraint_Rhs();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.RequiredHardwareResourceInstanceConstraint <em>Required Hardware Resource Instance Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Hardware Resource Instance Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.RequiredHardwareResourceInstanceConstraint
	 * @generated
	 */
	EClass getRequiredHardwareResourceInstanceConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.RequiredHardwareResourceInstanceConstraint#getTupleDescriptors <em>Tuple Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Descriptors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.RequiredHardwareResourceInstanceConstraint#getTupleDescriptors()
	 * @see #getRequiredHardwareResourceInstanceConstraint()
	 * @generated
	 */
	EReference getRequiredHardwareResourceInstanceConstraint_TupleDescriptors();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.TupleDescriptor <em>Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Descriptor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.TupleDescriptor
	 * @generated
	 */
	EClass getTupleDescriptor();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor <em>Instance Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Tuple Descriptor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor
	 * @generated
	 */
	EClass getInstanceTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.InstanceTupleDescriptor#getInstance()
	 * @see #getInstanceTupleDescriptor()
	 * @generated
	 */
	EAttribute getInstanceTupleDescriptor_Instance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationTupleDescriptor <em>Location Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Tuple Descriptor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationTupleDescriptor
	 * @generated
	 */
	EClass getLocationTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationTupleDescriptor#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationTupleDescriptor#getInstances()
	 * @see #getLocationTupleDescriptor()
	 * @generated
	 */
	EAttribute getLocationTupleDescriptor_Instances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor <em>Component Resource Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Resource Tuple Descriptor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor
	 * @generated
	 */
	EClass getComponentResourceTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor#getHwresinstance <em>Hwresinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwresinstance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ComponentResourceTupleDescriptor#getHwresinstance()
	 * @see #getComponentResourceTupleDescriptor()
	 * @generated
	 */
	EAttribute getComponentResourceTupleDescriptor_Hwresinstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.ValueTupleDescriptor <em>Value Tuple Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Tuple Descriptor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ValueTupleDescriptor
	 * @generated
	 */
	EClass getValueTupleDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.allocation.language.ValueTupleDescriptor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.ValueTupleDescriptor#getValue()
	 * @see #getValueTupleDescriptor()
	 * @generated
	 */
	EAttribute getValueTupleDescriptor_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.allocation.language.MeasureFunction <em>Measure Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Function</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.MeasureFunction
	 * @generated
	 */
	EClass getMeasureFunction();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.allocation.language.MeasureFunction#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.MeasureFunction#getServices()
	 * @see #getMeasureFunction()
	 * @generated
	 */
	EReference getMeasureFunction_Services();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes <em>Location Constraint Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Constraint Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes
	 * @generated
	 */
	EEnum getLocationConstraintTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LanguageFactory getLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.OptionalNamedElementImpl <em>Optional Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.OptionalNamedElementImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getOptionalNamedElement()
		 * @generated
		 */
		EClass OPTIONAL_NAMED_ELEMENT = eINSTANCE.getOptionalNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_NAMED_ELEMENT__NAME = eINSTANCE.getOptionalNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.SpecificationImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getSpecification()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ServiceImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getService()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl <em>Qo SDimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.QoSDimensionImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getQoSDimension()
		 * @generated
		 */
		EClass QO_SDIMENSION = eINSTANCE.getQoSDimension();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SDIMENSION__METRIC = eINSTANCE.getQoSDimension_Metric();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENSION__TUPLE_DESCRIPTORS = eINSTANCE.getQoSDimension_TupleDescriptors();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SDIMENSION__VALUE = eINSTANCE.getQoSDimension_Value();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationConstraintImpl <em>Location Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getLocationConstraint()
		 * @generated
		 */
		EClass LOCATION_CONSTRAINT = eINSTANCE.getLocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_CONSTRAINT__TUPLE_DESCRIPTORS = eINSTANCE.getLocationConstraint_TupleDescriptors();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_CONSTRAINT__TYPE = eINSTANCE.getLocationConstraint_Type();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ResourceConstraintImpl <em>Resource Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ResourceConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getResourceConstraint()
		 * @generated
		 */
		EClass RESOURCE_CONSTRAINT = eINSTANCE.getResourceConstraint();

		/**
		 * The meta object literal for the '<em><b>Tuple Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT__TUPLE_DESCRIPTORS = eINSTANCE.getResourceConstraint_TupleDescriptors();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT__LHS = eINSTANCE.getResourceConstraint_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONSTRAINT__RHS = eINSTANCE.getResourceConstraint_Rhs();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.RequiredHardwareResourceInstanceConstraintImpl <em>Required Hardware Resource Instance Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.RequiredHardwareResourceInstanceConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getRequiredHardwareResourceInstanceConstraint()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.TupleDescriptorImpl <em>Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.TupleDescriptorImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getTupleDescriptor()
		 * @generated
		 */
		EClass TUPLE_DESCRIPTOR = eINSTANCE.getTupleDescriptor();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.InstanceTupleDescriptorImpl <em>Instance Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.InstanceTupleDescriptorImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getInstanceTupleDescriptor()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationTupleDescriptorImpl <em>Location Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LocationTupleDescriptorImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getLocationTupleDescriptor()
		 * @generated
		 */
		EClass LOCATION_TUPLE_DESCRIPTOR = eINSTANCE.getLocationTupleDescriptor();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TUPLE_DESCRIPTOR__INSTANCES = eINSTANCE.getLocationTupleDescriptor_Instances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ComponentResourceTupleDescriptorImpl <em>Component Resource Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ComponentResourceTupleDescriptorImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getComponentResourceTupleDescriptor()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.ValueTupleDescriptorImpl <em>Value Tuple Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.ValueTupleDescriptorImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getValueTupleDescriptor()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.impl.MeasureFunctionImpl <em>Measure Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.MeasureFunctionImpl
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getMeasureFunction()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes <em>Location Constraint Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.LocationConstraintTypes
		 * @see de.uni_paderborn.fujaba.muml.allocation.language.impl.LanguagePackageImpl#getLocationConstraintTypes()
		 * @generated
		 */
		EEnum LOCATION_CONSTRAINT_TYPES = eINSTANCE.getLocationConstraintTypes();

	}

} //LanguagePackage
