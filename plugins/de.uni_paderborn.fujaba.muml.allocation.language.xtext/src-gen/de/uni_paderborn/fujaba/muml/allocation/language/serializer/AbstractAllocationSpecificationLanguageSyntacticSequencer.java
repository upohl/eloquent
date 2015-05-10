package de.uni_paderborn.fujaba.muml.allocation.language.serializer;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.muml.allocation.language.services.AllocationSpecificationLanguageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractAllocationSpecificationLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AllocationSpecificationLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q;
	protected AbstractElementAlias match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q;
	protected AbstractElementAlias match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_7_2_1_q;
	protected AbstractElementAlias match_RequiredHardwareResourceInstanceConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1;
	protected AbstractElementAlias match_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0;
	protected AbstractElementAlias match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AllocationSpecificationLanguageGrammarAccess) access;
		match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDefOperationCSAccess().getUnrestrictedNameParserRuleCall_2());
		match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDefPropertyCSAccess().getUnrestrictedNameParserRuleCall_2());
		match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_7_2_1_q = new TokenAlias(false, true, grammarAccess.getOperationContextDeclCSAccess().getUnrestrictedNameParserRuleCall_7_2_1());
		match_RequiredHardwareResourceInstanceConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRequiredHardwareResourceInstanceKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRequiredLocationKeyword_0_1()));
		match_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getResourceConstraintAccess().getRequiredResourceKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getResourceConstraintAccess().getResourceKeyword_0_0()));
		match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getUnrestrictedNameRule())
			return getUnrestrictedNameToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * UnrestrictedName returns ecore::EString:
	 * 	EssentialOCLUnrestrictedName
	 * 				| 'derive'
	 * 		| 'import'
	 * 	| 'include'
	 * 	| 'init'
	 * 		| 'library'
	 * 				;
	 */
	protected String getUnrestrictedNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q.equals(syntax))
				emit_DefOperationCS_UnrestrictedNameParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q.equals(syntax))
				emit_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_7_2_1_q.equals(syntax))
				emit_OperationContextDeclCS_UnrestrictedNameParserRuleCall_7_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredHardwareResourceInstanceConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1.equals(syntax))
				emit_RequiredHardwareResourceInstanceConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0.equals(syntax))
				emit_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     UnrestrictedName?
	 */
	protected void emit_DefOperationCS_UnrestrictedNameParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnrestrictedName?
	 */
	protected void emit_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnrestrictedName?
	 */
	protected void emit_OperationContextDeclCS_UnrestrictedNameParserRuleCall_7_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'requiredHardwareResourceInstance' | 'requiredLocation'
	 */
	protected void emit_RequiredHardwareResourceInstanceConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'resource' | 'requiredResource'
	 */
	protected void emit_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
