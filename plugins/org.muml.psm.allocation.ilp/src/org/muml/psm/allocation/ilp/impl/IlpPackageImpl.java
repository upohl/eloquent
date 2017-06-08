/**
 */
package org.muml.psm.allocation.ilp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.core.CorePackage;

import org.muml.core.expressions.ExpressionsPackage;

import org.muml.core.expressions.common.CommonExpressionsPackage;

import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.ILPDataType;
import org.muml.psm.allocation.ilp.IlpFactory;
import org.muml.psm.allocation.ilp.IlpPackage;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.ObjectiveGoal;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;

import org.muml.psm.allocation.ilp.util.IlpValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IlpPackageImpl extends EPackageImpl implements IlpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLinearProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveFunctionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ilpDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectiveGoalEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.psm.allocation.ilp.IlpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IlpPackageImpl() {
		super(eNS_URI, IlpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IlpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IlpPackage init() {
		if (isInited) return (IlpPackage)EPackage.Registry.INSTANCE.getEPackage(IlpPackage.eNS_URI);

		// Obtain or create and register package
		IlpPackageImpl theIlpPackage = (IlpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IlpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IlpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIlpPackage.createPackageContents();

		// Initialize created meta-data
		theIlpPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIlpPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return IlpValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIlpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IlpPackage.eNS_URI, theIlpPackage);
		return theIlpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLinearProgram() {
		return integerLinearProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerLinearProgram_Variables() {
		return (EReference)integerLinearProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerLinearProgram_Constraints() {
		return (EReference)integerLinearProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerLinearProgram_ObjectiveFunction() {
		return (EReference)integerLinearProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_DataType() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintExpression() {
		return constraintExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableExpression() {
		return variableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableExpression_Variable() {
		return (EReference)variableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveFunctionExpression() {
		return objectiveFunctionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveFunctionExpression_Goal() {
		return (EAttribute)objectiveFunctionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectiveFunctionExpression_ObjectiveFunction() {
		return (EReference)objectiveFunctionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getILPDataType() {
		return ilpDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectiveGoal() {
		return objectiveGoalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlpFactory getIlpFactory() {
		return (IlpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		integerLinearProgramEClass = createEClass(INTEGER_LINEAR_PROGRAM);
		createEReference(integerLinearProgramEClass, INTEGER_LINEAR_PROGRAM__VARIABLES);
		createEReference(integerLinearProgramEClass, INTEGER_LINEAR_PROGRAM__CONSTRAINTS);
		createEReference(integerLinearProgramEClass, INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__DATA_TYPE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		constraintExpressionEClass = createEClass(CONSTRAINT_EXPRESSION);

		variableExpressionEClass = createEClass(VARIABLE_EXPRESSION);
		createEReference(variableExpressionEClass, VARIABLE_EXPRESSION__VARIABLE);

		objectiveFunctionExpressionEClass = createEClass(OBJECTIVE_FUNCTION_EXPRESSION);
		createEAttribute(objectiveFunctionExpressionEClass, OBJECTIVE_FUNCTION_EXPRESSION__GOAL);
		createEReference(objectiveFunctionExpressionEClass, OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION);

		// Create enums
		ilpDataTypeEEnum = createEEnum(ILP_DATA_TYPE);
		objectiveGoalEEnum = createEEnum(OBJECTIVE_GOAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonExpressionsPackage theCommonExpressionsPackage = (CommonExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constraintExpressionEClass.getESuperTypes().add(theCommonExpressionsPackage.getComparisonExpression());
		variableExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(integerLinearProgramEClass, IntegerLinearProgram.class, "IntegerLinearProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerLinearProgram_Variables(), this.getVariable(), null, "variables", null, 0, -1, IntegerLinearProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerLinearProgram_Constraints(), this.getConstraintExpression(), null, "constraints", null, 0, -1, IntegerLinearProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerLinearProgram_ObjectiveFunction(), this.getObjectiveFunctionExpression(), null, "objectiveFunction", null, 0, 1, IntegerLinearProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_DataType(), this.getILPDataType(), "dataType", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintExpressionEClass, ConstraintExpression.class, "ConstraintExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableExpressionEClass, VariableExpression.class, "VariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableExpression_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveFunctionExpressionEClass, ObjectiveFunctionExpression.class, "ObjectiveFunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveFunctionExpression_Goal(), this.getObjectiveGoal(), "goal", "MAX", 1, 1, ObjectiveFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectiveFunctionExpression_ObjectiveFunction(), theExpressionsPackage.getExpression(), null, "objectiveFunction", null, 1, 1, ObjectiveFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ilpDataTypeEEnum, ILPDataType.class, "ILPDataType");
		addEEnumLiteral(ilpDataTypeEEnum, ILPDataType.BINARY);
		addEEnumLiteral(ilpDataTypeEEnum, ILPDataType.INTEGER);
		addEEnumLiteral(ilpDataTypeEEnum, ILPDataType.REAL);

		initEEnum(objectiveGoalEEnum, ObjectiveGoal.class, "ObjectiveGoal");
		addEEnumLiteral(objectiveGoalEEnum, ObjectiveGoal.MIN);
		addEEnumLiteral(objectiveGoalEEnum, ObjectiveGoal.MAX);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (constraintExpressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidOperator"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (constraintExpressionEClass, 
		   source, 
		   new String[] {
			 "ValidOperator", "-- Invalid comparison operator (allowed <, <=, =, >=, >)\nSet{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL, core::expressions::common::ComparingOperator::EQUAL, core::expressions::common::ComparingOperator::GREATER_OR_EQUAL, core::expressions::common::ComparingOperator::GREATER}->includes(operator)"
		   });
	}

} //IlpPackageImpl
