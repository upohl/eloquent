/*
 * generated by Xtext
 */
package org.muml.psm.allocation.ilp.lpsolve.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.muml.psm.allocation.ilp.ArithmeticExpression;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IlpPackage;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.LiteralExpression;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.Variable;
import org.muml.psm.allocation.ilp.VariableExpression;
import org.muml.psm.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractLPSolveSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LPSolveGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IlpPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IlpPackage.ARITHMETIC_EXPRESSION:
				if (rule == grammarAccess.getLinearExpressionRule()
						|| rule == grammarAccess.getSimpleLinearExpressionRule()
						|| rule == grammarAccess.getAdditionExpressionRule()) {
					sequence_AdditionExpression_MultiplicationExpression(context, (ArithmeticExpression) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()
						|| rule == grammarAccess.getMultiplicationExpressionRule()) {
					sequence_MultiplicationExpression(context, (ArithmeticExpression) semanticObject); 
					return; 
				}
				else break;
			case IlpPackage.CONSTRAINT_EXPRESSION:
				sequence_ConstraintExpression(context, (ConstraintExpression) semanticObject); 
				return; 
			case IlpPackage.INTEGER_LINEAR_PROGRAM:
				sequence_IntegerLinearProgram(context, (IntegerLinearProgram) semanticObject); 
				return; 
			case IlpPackage.LITERAL_EXPRESSION:
				sequence_NumberLiteralExpression(context, (LiteralExpression) semanticObject); 
				return; 
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION:
				sequence_ObjectiveFunctionExpression(context, (ObjectiveFunctionExpression) semanticObject); 
				return; 
			case IlpPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case IlpPackage.VARIABLE_EXPRESSION:
				sequence_VariableExpression(context, (VariableExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     LinearExpression returns ArithmeticExpression
	 *     SimpleLinearExpression returns ArithmeticExpression
	 *     AdditionExpression returns ArithmeticExpression
	 *
	 * Constraint:
	 *     (
	 *         (leftExpression=AdditionExpression_ArithmeticExpression_1_0 operator=AdditionOperator rightExpression=LinearExpression) | 
	 *         (leftExpression=MultiplicationExpression_ArithmeticExpression_1_0 operator=MultiplicationOperator rightExpression=Operand)
	 *     )
	 */
	protected void sequence_AdditionExpression_MultiplicationExpression(ISerializationContext context, ArithmeticExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns ConstraintExpression
	 *
	 * Constraint:
	 *     (comment=VariableID? leftExpression=SimpleLinearExpression operator=RelationalOperator rightExpression=SimpleLinearExpression)
	 */
	protected void sequence_ConstraintExpression(ISerializationContext context, ConstraintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntegerLinearProgram returns IntegerLinearProgram
	 *
	 * Constraint:
	 *     (objectiveFunction=ObjectiveFunctionExpression constraints+=ConstraintExpression* variables+=Variable*)
	 */
	protected void sequence_IntegerLinearProgram(ISerializationContext context, IntegerLinearProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AdditionExpression.ArithmeticExpression_1_0 returns ArithmeticExpression
	 *     MultiplicationExpression returns ArithmeticExpression
	 *
	 * Constraint:
	 *     (leftExpression=MultiplicationExpression_ArithmeticExpression_1_0 operator=MultiplicationOperator rightExpression=Operand)
	 */
	protected void sequence_MultiplicationExpression(ISerializationContext context, ArithmeticExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.BINARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.BINARY_EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(), semanticObject.getLeftExpression());
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0(), semanticObject.getRightExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LinearExpression returns LiteralExpression
	 *     SimpleLinearExpression returns LiteralExpression
	 *     AdditionExpression returns LiteralExpression
	 *     AdditionExpression.ArithmeticExpression_1_0 returns LiteralExpression
	 *     MultiplicationExpression returns LiteralExpression
	 *     MultiplicationExpression.ArithmeticExpression_1_0 returns LiteralExpression
	 *     Operand returns LiteralExpression
	 *     NumberLiteralExpression returns LiteralExpression
	 *
	 * Constraint:
	 *     value=Number
	 */
	protected void sequence_NumberLiteralExpression(ISerializationContext context, LiteralExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.LITERAL_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.LITERAL_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectiveFunctionExpression returns ObjectiveFunctionExpression
	 *
	 * Constraint:
	 *     (goal=ObjectiveGoal objectiveFunction=LinearExpression)
	 */
	protected void sequence_ObjectiveFunctionExpression(ISerializationContext context, ObjectiveFunctionExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__GOAL));
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0(), semanticObject.getGoal());
		feeder.accept(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0(), semanticObject.getObjectiveFunction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LinearExpression returns VariableExpression
	 *     SimpleLinearExpression returns VariableExpression
	 *     AdditionExpression returns VariableExpression
	 *     AdditionExpression.ArithmeticExpression_1_0 returns VariableExpression
	 *     MultiplicationExpression returns VariableExpression
	 *     MultiplicationExpression.ArithmeticExpression_1_0 returns VariableExpression
	 *     Operand returns VariableExpression
	 *     VariableExpression returns VariableExpression
	 *
	 * Constraint:
	 *     variable=[Variable|VariableID]
	 */
	protected void sequence_VariableExpression(ISerializationContext context, VariableExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.VARIABLE_EXPRESSION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.VARIABLE_EXPRESSION__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableExpressionAccess().getVariableVariableVariableIDParserRuleCall_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (dataType=ILPDataType name=VariableID)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.VARIABLE__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.VARIABLE__DATA_TYPE));
			if (transientValues.isValueTransient(semanticObject, IlpPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0(), semanticObject.getDataType());
		feeder.accept(grammarAccess.getVariableAccess().getNameVariableIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
