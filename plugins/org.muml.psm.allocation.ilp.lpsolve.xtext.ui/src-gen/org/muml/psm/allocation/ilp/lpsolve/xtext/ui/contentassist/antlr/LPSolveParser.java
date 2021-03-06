/*
 * generated by Xtext
 */
package org.muml.psm.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.muml.psm.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;

public class LPSolveParser extends AbstractContentAssistParser {
	
	@Inject
	private LPSolveGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.muml.psm.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr.internal.InternalLPSolveParser createParser() {
		org.muml.psm.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr.internal.InternalLPSolveParser result = new org.muml.psm.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr.internal.InternalLPSolveParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives(), "rule__ObjectiveFunctionExpression__Alternatives");
					put(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives_0_0(), "rule__ObjectiveFunctionExpression__Alternatives_0_0");
					put(grammarAccess.getVariableIDAccess().getAlternatives_1_1(), "rule__VariableID__Alternatives_1_1");
					put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives_1(), "rule__Number__Alternatives_1");
					put(grammarAccess.getObjectiveGoalAccess().getAlternatives(), "rule__ObjectiveGoal__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getILPDataTypeAccess().getAlternatives(), "rule__ILPDataType__Alternatives");
					put(grammarAccess.getAdditionOperatorAccess().getAlternatives(), "rule__AdditionOperator__Alternatives");
					put(grammarAccess.getIntegerLinearProgramAccess().getGroup(), "rule__IntegerLinearProgram__Group__0");
					put(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0(), "rule__ObjectiveFunctionExpression__Group_0__0");
					put(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_1(), "rule__ObjectiveFunctionExpression__Group_1__0");
					put(grammarAccess.getConstraintExpressionAccess().getGroup(), "rule__ConstraintExpression__Group__0");
					put(grammarAccess.getConstraintExpressionAccess().getGroup_0(), "rule__ConstraintExpression__Group_0__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableIDAccess().getGroup(), "rule__VariableID__Group__0");
					put(grammarAccess.getVariableIDAccess().getGroup_1(), "rule__VariableID__Group_1__0");
					put(grammarAccess.getVariableIDAccess().getGroup_1_1_1(), "rule__VariableID__Group_1_1_1__0");
					put(grammarAccess.getAdditionExpressionAccess().getGroup(), "rule__AdditionExpression__Group__0");
					put(grammarAccess.getAdditionExpressionAccess().getGroup_1(), "rule__AdditionExpression__Group_1__0");
					put(grammarAccess.getMultiplicationExpressionAccess().getGroup(), "rule__MultiplicationExpression__Group__0");
					put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1(), "rule__MultiplicationExpression__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
					put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
					put(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionAssignment_0(), "rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0");
					put(grammarAccess.getIntegerLinearProgramAccess().getConstraintsAssignment_1(), "rule__IntegerLinearProgram__ConstraintsAssignment_1");
					put(grammarAccess.getIntegerLinearProgramAccess().getVariablesAssignment_2(), "rule__IntegerLinearProgram__VariablesAssignment_2");
					put(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_1_0(), "rule__ObjectiveFunctionExpression__GoalAssignment_1_0");
					put(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_1_2(), "rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2");
					put(grammarAccess.getConstraintExpressionAccess().getCommentAssignment_0_0(), "rule__ConstraintExpression__CommentAssignment_0_0");
					put(grammarAccess.getConstraintExpressionAccess().getLeftExpressionAssignment_1(), "rule__ConstraintExpression__LeftExpressionAssignment_1");
					put(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_2(), "rule__ConstraintExpression__OperatorAssignment_2");
					put(grammarAccess.getConstraintExpressionAccess().getRightExpressionAssignment_3(), "rule__ConstraintExpression__RightExpressionAssignment_3");
					put(grammarAccess.getVariableAccess().getDataTypeAssignment_0(), "rule__Variable__DataTypeAssignment_0");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditionExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2(), "rule__AdditionExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1(), "rule__MultiplicationExpression__OperatorAssignment_1_1");
					put(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_2(), "rule__MultiplicationExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getNumberLiteralExpressionAccess().getValueAssignment(), "rule__NumberLiteralExpression__ValueAssignment");
					put(grammarAccess.getVariableExpressionAccess().getVariableAssignment(), "rule__VariableExpression__VariableAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.muml.psm.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr.internal.InternalLPSolveParser typedParser = (org.muml.psm.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr.internal.InternalLPSolveParser) parser;
			typedParser.entryRuleIntegerLinearProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LPSolveGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LPSolveGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
