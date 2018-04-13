/*
 * generated by Xtext
 */
package org.muml.psm.allocation.language.xtext.serializer;

import com.google.inject.Inject;
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
import org.muml.psm.allocation.language.xtext.services.AllocationSpecificationLanguageGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractAllocationSpecificationLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AllocationSpecificationLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q;
	protected AbstractElementAlias match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q;
	protected AbstractElementAlias match_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2;
	protected AbstractElementAlias match_LocationConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1;
	protected AbstractElementAlias match_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q;
	protected AbstractElementAlias match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q;
	protected AbstractElementAlias match_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0;
	protected AbstractElementAlias match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AllocationSpecificationLanguageGrammarAccess) access;
		match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDefOperationCSAccess().getUnrestrictedNameParserRuleCall_2());
		match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDefPropertyCSAccess().getUnrestrictedNameParserRuleCall_2());
		match_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImportCSAccess().getImportKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getImportCSAccess().getIncludeKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getImportCSAccess().getLibraryKeyword_0_2()));
		match_LocationConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationConstraintAccess().getRequiredHardwareResourceInstanceKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLocationConstraintAccess().getRequiredLocationKeyword_0_1()));
		match_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
		match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q = new TokenAlias(false, true, grammarAccess.getOperationContextDeclCSAccess().getUnrestrictedNameParserRuleCall_8_2_1());
		match_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getResourceConstraintAccess().getRequiredResourceKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getResourceConstraintAccess().getResourceKeyword_0_0()));
		match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getUnrestrictedNameRule())
			return getUnrestrictedNameToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * UnrestrictedName returns ecore::EString:
	 * 	EssentialOCLUnrestrictedName
	 * 						| 'import'
	 * 	| 'include'
	 * 			| 'library'
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
			if (match_DefOperationCS_UnrestrictedNameParserRuleCall_2_q.equals(syntax))
				emit_DefOperationCS_UnrestrictedNameParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q.equals(syntax))
				emit_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2.equals(syntax))
				emit_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LocationConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1.equals(syntax))
				emit_LocationConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q.equals(syntax))
				emit_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q.equals(syntax))
				emit_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0.equals(syntax))
				emit_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'def' (ambiguity) ':' name=UnrestrictedName
	 *     (rule start) 'def' (ambiguity) ':' ownedSignature=TemplateSignatureCS
	 *     isStatic?='static' 'def' (ambiguity) ':' name=UnrestrictedName
	 *     isStatic?='static' 'def' (ambiguity) ':' ownedSignature=TemplateSignatureCS
	 */
	protected void emit_DefOperationCS_UnrestrictedNameParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'def' (ambiguity) ':' name=UnrestrictedName
	 *     isStatic?='static' 'def' (ambiguity) ':' name=UnrestrictedName
	 */
	protected void emit_DefPropertyCS_UnrestrictedNameParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'import' | 'include' | 'library'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=Identifier
	 *     (rule start) (ambiguity) ownedPathName=URIPathNameCS
	 */
	protected void emit_ImportCS_ImportKeyword_0_0_or_IncludeKeyword_0_1_or_LibraryKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'requiredHardwareResourceInstance' | 'requiredLocation'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'constraint' (ambiguity) '{' tupleDescriptor=TupleDescriptor
	 *     (rule start) 'constraint' (ambiguity) name=ID
	 *     (rule start) (ambiguity) '{' tupleDescriptor=TupleDescriptor
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_LocationConstraint_RequiredHardwareResourceInstanceKeyword_0_0_or_RequiredLocationKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '|?'?
	 *
	 * This ambiguous syntax occurs at:
	 *     lowerBound=LOWER (ambiguity) ']' (rule end)
	 *     stringBounds='*' (ambiguity) ']' (rule end)
	 *     stringBounds='+' (ambiguity) ']' (rule end)
	 *     stringBounds='?' (ambiguity) ']' (rule end)
	 *     upperBound=UPPER (ambiguity) ']' (rule end)
	 */
	protected void emit_MultiplicityCS_VerticalLineQuestionMarkKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     UnrestrictedName?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedBodies+=SpecificationCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedParameters+=ParameterCS ')' ':' 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedPathName=PathNameCS '(' ')' ':' 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedPostconditions+=ConstraintCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedPreconditions+=ConstraintCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 *     ownedType=TypeExpCS 'body' (ambiguity) ':' ownedBodies+=SpecificationCS
	 */
	protected void emit_OperationContextDeclCS_UnrestrictedNameParserRuleCall_8_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'requiredResource' | 'resource'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'constraint' (ambiguity) '{' tupleDescriptor=BoundWeightTupleDescriptor
	 *     (rule start) 'constraint' (ambiguity) name=ID
	 *     (rule start) (ambiguity) '{' tupleDescriptor=BoundWeightTupleDescriptor
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_ResourceConstraint_RequiredResourceKeyword_0_1_or_ResourceKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='Tuple' (ambiguity) (rule end)
	 *     name='Tuple' (ambiguity) ownedMultiplicity=MultiplicityCS
	 */
	protected void emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
