package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.serializer;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractLPSolveSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LPSolveGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ObjectiveFunctionExpression_MaxKeyword_0_0_1_or_MinKeyword_0_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LPSolveGrammarAccess) access;
		match_ObjectiveFunctionExpression_MaxKeyword_0_0_1_or_MinKeyword_0_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1()), new TokenAlias(false, false, grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ObjectiveFunctionExpression_MaxKeyword_0_0_1_or_MinKeyword_0_0_0.equals(syntax))
				emit_ObjectiveFunctionExpression_MaxKeyword_0_0_1_or_MinKeyword_0_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'max' | 'min'
	 */
	protected void emit_ObjectiveFunctionExpression_MaxKeyword_0_0_1_or_MinKeyword_0_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
