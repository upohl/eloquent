package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ConstraintExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IlpPackage;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveFunctionExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.Variable;
import de.uni_paderborn.fujaba.muml.allocation.ilp.VariableExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.storydriven.core.expressions.common.ArithmeticExpression;
import org.storydriven.core.expressions.common.CommonExpressionsPackage;
import org.storydriven.core.expressions.common.LiteralExpression;

@SuppressWarnings("all")
public abstract class AbstractLPSolveSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LPSolveGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommonExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommonExpressionsPackage.ARITHMETIC_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getLinearExpressionRule() ||
				   context == grammarAccess.getSimpleLinearExpressionRule()) {
					sequence_AdditionExpression_MultiplicationExpression(context, (ArithmeticExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionRule()) {
					sequence_MultiplicationExpression(context, (ArithmeticExpression) semanticObject); 
					return; 
				}
				else break;
			case CommonExpressionsPackage.LITERAL_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0() ||
				   context == grammarAccess.getLinearExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0() ||
				   context == grammarAccess.getNumberLiteralExpressionRule() ||
				   context == grammarAccess.getOperandRule() ||
				   context == grammarAccess.getSimpleLinearExpressionRule()) {
					sequence_NumberLiteralExpression(context, (LiteralExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == IlpPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IlpPackage.CONSTRAINT_EXPRESSION:
				if(context == grammarAccess.getConstraintExpressionRule()) {
					sequence_ConstraintExpression(context, (ConstraintExpression) semanticObject); 
					return; 
				}
				else break;
			case IlpPackage.INTEGER_LINEAR_PROGRAM:
				if(context == grammarAccess.getIntegerLinearProgramRule()) {
					sequence_IntegerLinearProgram(context, (IntegerLinearProgram) semanticObject); 
					return; 
				}
				else break;
			case IlpPackage.OBJECTIVE_FUNCTION_EXPRESSION:
				if(context == grammarAccess.getObjectiveFunctionExpressionRule()) {
					sequence_ObjectiveFunctionExpression(context, (ObjectiveFunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case IlpPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case IlpPackage.VARIABLE_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0() ||
				   context == grammarAccess.getLinearExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0() ||
				   context == grammarAccess.getOperandRule() ||
				   context == grammarAccess.getSimpleLinearExpressionRule() ||
				   context == grammarAccess.getVariableExpressionRule()) {
					sequence_VariableExpression(context, (VariableExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (leftExpression=AdditionExpression_ArithmeticExpression_1_0 operator=AdditionOperator rightExpression=LinearExpression) | 
	 *         (leftExpression=MultiplicationExpression_ArithmeticExpression_1_0 operator=MultiplicationOperator rightExpression=Operand)
	 *     )
	 */
	protected void sequence_AdditionExpression_MultiplicationExpression(EObject context, ArithmeticExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=VariableID? leftExpression=SimpleLinearExpression operator=ComparingOperator rightExpression=SimpleLinearExpression)
	 */
	protected void sequence_ConstraintExpression(EObject context, ConstraintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (objectiveFunction=ObjectiveFunctionExpression constraints+=ConstraintExpression* variables+=Variable*)
	 */
	protected void sequence_IntegerLinearProgram(EObject context, IntegerLinearProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpression=MultiplicationExpression_ArithmeticExpression_1_0 operator=MultiplicationOperator rightExpression=Operand)
	 */
	protected void sequence_MultiplicationExpression(EObject context, ArithmeticExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Number
	 */
	protected void sequence_NumberLiteralExpression(EObject context, LiteralExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (goal=ObjectiveGoal objectiveFunction=LinearExpression)?
	 */
	protected void sequence_ObjectiveFunctionExpression(EObject context, ObjectiveFunctionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__GOAL));
			if(transientValues.isValueTransient(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IlpPackage.Literals.OBJECTIVE_FUNCTION_EXPRESSION__OBJECTIVE_FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0(), semanticObject.getGoal());
		feeder.accept(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0(), semanticObject.getObjectiveFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable|VariableID]
	 */
	protected void sequence_VariableExpression(EObject context, VariableExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dataType=ILPDataType name=VariableID)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
