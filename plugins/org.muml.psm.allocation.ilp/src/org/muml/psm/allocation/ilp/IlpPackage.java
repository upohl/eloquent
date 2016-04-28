/**
 */
package org.muml.psm.allocation.ilp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.ExpressionsPackage;
import org.muml.mumlcore.expressions.common.CommonExpressionsPackage;

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
 * This package contains all classes for modeling an Integer Linear Program.
 * <!-- end-model-doc -->
 * @see org.muml.psm.allocation.ilp.IlpFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface IlpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ilp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/allocation/ilp/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ilp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlpPackage eINSTANCE = org.muml.psm.allocation.ilp.impl.IlpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl <em>Integer Linear Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getIntegerLinearProgram()
	 * @generated
	 */
	int INTEGER_LINEAR_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LINEAR_PROGRAM__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LINEAR_PROGRAM__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Objective Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION = 2;

	/**
	 * The number of structural features of the '<em>Integer Linear Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LINEAR_PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integer Linear Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LINEAR_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.impl.VariableImpl
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DATA_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.impl.ConstraintExpressionImpl
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getConstraintExpression()
	 * @generated
	 */
	int CONSTRAINT_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION__EXTENSIONS = CommonExpressionsPackage.COMPARISON_EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION__COMMENT = CommonExpressionsPackage.COMPARISON_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION__LEFT_EXPRESSION = CommonExpressionsPackage.COMPARISON_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION__RIGHT_EXPRESSION = CommonExpressionsPackage.COMPARISON_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION__OPERATOR = CommonExpressionsPackage.COMPARISON_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Constraint Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION_FEATURE_COUNT = CommonExpressionsPackage.COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION___GET_EXTENSION__ECLASS = CommonExpressionsPackage.COMPARISON_EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Constraint Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EXPRESSION_OPERATION_COUNT = CommonExpressionsPackage.COMPARISON_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.impl.VariableExpressionImpl
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getVariableExpression()
	 * @generated
	 */
	int VARIABLE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__EXTENSIONS = ExpressionsPackage.EXPRESSION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.impl.ObjectiveFunctionExpressionImpl <em>Objective Function Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.impl.ObjectiveFunctionExpressionImpl
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getObjectiveFunctionExpression()
	 * @generated
	 */
	int OBJECTIVE_FUNCTION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FUNCTION_EXPRESSION__GOAL = 0;

	/**
	 * The feature id for the '<em><b>Objective Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Objective Function Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FUNCTION_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Objective Function Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FUNCTION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.ILPDataType <em>ILP Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.ILPDataType
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getILPDataType()
	 * @generated
	 */
	int ILP_DATA_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.ilp.ObjectiveGoal <em>Objective Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.ilp.ObjectiveGoal
	 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getObjectiveGoal()
	 * @generated
	 */
	int OBJECTIVE_GOAL = 6;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.ilp.IntegerLinearProgram <em>Integer Linear Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Linear Program</em>'.
	 * @see org.muml.psm.allocation.ilp.IntegerLinearProgram
	 * @generated
	 */
	EClass getIntegerLinearProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.muml.psm.allocation.ilp.IntegerLinearProgram#getVariables()
	 * @see #getIntegerLinearProgram()
	 * @generated
	 */
	EReference getIntegerLinearProgram_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.psm.allocation.ilp.IntegerLinearProgram#getConstraints()
	 * @see #getIntegerLinearProgram()
	 * @generated
	 */
	EReference getIntegerLinearProgram_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.ilp.IntegerLinearProgram#getObjectiveFunction <em>Objective Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective Function</em>'.
	 * @see org.muml.psm.allocation.ilp.IntegerLinearProgram#getObjectiveFunction()
	 * @see #getIntegerLinearProgram()
	 * @generated
	 */
	EReference getIntegerLinearProgram_ObjectiveFunction();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.ilp.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.muml.psm.allocation.ilp.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.ilp.Variable#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.muml.psm.allocation.ilp.Variable#getDataType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_DataType();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.ilp.ConstraintExpression <em>Constraint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Expression</em>'.
	 * @see org.muml.psm.allocation.ilp.ConstraintExpression
	 * @generated
	 */
	EClass getConstraintExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.ilp.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Expression</em>'.
	 * @see org.muml.psm.allocation.ilp.VariableExpression
	 * @generated
	 */
	EClass getVariableExpression();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.ilp.VariableExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.muml.psm.allocation.ilp.VariableExpression#getVariable()
	 * @see #getVariableExpression()
	 * @generated
	 */
	EReference getVariableExpression_Variable();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression <em>Objective Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Function Expression</em>'.
	 * @see org.muml.psm.allocation.ilp.ObjectiveFunctionExpression
	 * @generated
	 */
	EClass getObjectiveFunctionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getGoal()
	 * @see #getObjectiveFunctionExpression()
	 * @generated
	 */
	EAttribute getObjectiveFunctionExpression_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getObjectiveFunction <em>Objective Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective Function</em>'.
	 * @see org.muml.psm.allocation.ilp.ObjectiveFunctionExpression#getObjectiveFunction()
	 * @see #getObjectiveFunctionExpression()
	 * @generated
	 */
	EReference getObjectiveFunctionExpression_ObjectiveFunction();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.ilp.ILPDataType <em>ILP Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ILP Data Type</em>'.
	 * @see org.muml.psm.allocation.ilp.ILPDataType
	 * @generated
	 */
	EEnum getILPDataType();

	/**
	 * Returns the meta object for enum '{@link org.muml.psm.allocation.ilp.ObjectiveGoal <em>Objective Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Objective Goal</em>'.
	 * @see org.muml.psm.allocation.ilp.ObjectiveGoal
	 * @generated
	 */
	EEnum getObjectiveGoal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IlpFactory getIlpFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl <em>Integer Linear Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.impl.IntegerLinearProgramImpl
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getIntegerLinearProgram()
		 * @generated
		 */
		EClass INTEGER_LINEAR_PROGRAM = eINSTANCE.getIntegerLinearProgram();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_LINEAR_PROGRAM__VARIABLES = eINSTANCE.getIntegerLinearProgram_Variables();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_LINEAR_PROGRAM__CONSTRAINTS = eINSTANCE.getIntegerLinearProgram_Constraints();

		/**
		 * The meta object literal for the '<em><b>Objective Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_LINEAR_PROGRAM__OBJECTIVE_FUNCTION = eINSTANCE.getIntegerLinearProgram_ObjectiveFunction();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.impl.VariableImpl
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DATA_TYPE = eINSTANCE.getVariable_DataType();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.impl.ConstraintExpressionImpl
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getConstraintExpression()
		 * @generated
		 */
		EClass CONSTRAINT_EXPRESSION = eINSTANCE.getConstraintExpression();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.impl.VariableExpressionImpl
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getVariableExpression()
		 * @generated
		 */
		EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_EXPRESSION__VARIABLE = eINSTANCE.getVariableExpression_Variable();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.impl.ObjectiveFunctionExpressionImpl <em>Objective Function Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.impl.ObjectiveFunctionExpressionImpl
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getObjectiveFunctionExpression()
		 * @generated
		 */
		EClass OBJECTIVE_FUNCTION_EXPRESSION = eINSTANCE.getObjectiveFunctionExpression();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_FUNCTION_EXPRESSION__GOAL = eINSTANCE.getObjectiveFunctionExpression_Goal();

		/**
		 * The meta object literal for the '<em><b>Objective Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION = eINSTANCE.getObjectiveFunctionExpression_ObjectiveFunction();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.ILPDataType <em>ILP Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.ILPDataType
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getILPDataType()
		 * @generated
		 */
		EEnum ILP_DATA_TYPE = eINSTANCE.getILPDataType();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.ilp.ObjectiveGoal <em>Objective Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.ilp.ObjectiveGoal
		 * @see org.muml.psm.allocation.ilp.impl.IlpPackageImpl#getObjectiveGoal()
		 * @generated
		 */
		EEnum OBJECTIVE_GOAL = eINSTANCE.getObjectiveGoal();

	}

} //IlpPackage
