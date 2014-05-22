/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.allocation.language.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.allocation.language.services.AllocationSpecificationLanguageGrammarAccess;

public class AllocationSpecificationLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private AllocationSpecificationLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_paderborn.fujaba.muml.allocation.language.ui.contentassist.antlr.internal.InternalAllocationSpecificationLanguageParser createParser() {
		de.uni_paderborn.fujaba.muml.allocation.language.ui.contentassist.antlr.internal.InternalAllocationSpecificationLanguageParser result = new de.uni_paderborn.fujaba.muml.allocation.language.ui.contentassist.antlr.internal.InternalAllocationSpecificationLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSpecificationAccess().getAlternatives_3(), "rule__Specification__Alternatives_3");
					put(grammarAccess.getConstraintAccess().getAlternatives_1(), "rule__Constraint__Alternatives_1");
					put(grammarAccess.getIDAccess().getAlternatives(), "rule__ID__Alternatives");
					put(grammarAccess.getUPPERAccess().getAlternatives(), "rule__UPPER__Alternatives");
					put(grammarAccess.getEssentialOCLReservedKeywordAccess().getAlternatives(), "rule__EssentialOCLReservedKeyword__Alternatives");
					put(grammarAccess.getEssentialOCLUnaryOperatorCSAccess().getNameAlternatives_0(), "rule__EssentialOCLUnaryOperatorCS__NameAlternatives_0");
					put(grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameAlternatives_0(), "rule__EssentialOCLInfixOperatorCS__NameAlternatives_0");
					put(grammarAccess.getEssentialOCLNavigationOperatorCSAccess().getNameAlternatives_0(), "rule__EssentialOCLNavigationOperatorCS__NameAlternatives_0");
					put(grammarAccess.getBinaryOperatorCSAccess().getAlternatives(), "rule__BinaryOperatorCS__Alternatives");
					put(grammarAccess.getEssentialOCLUnreservedNameAccess().getAlternatives(), "rule__EssentialOCLUnreservedName__Alternatives");
					put(grammarAccess.getURIFirstPathElementCSAccess().getAlternatives(), "rule__URIFirstPathElementCS__Alternatives");
					put(grammarAccess.getPrimitiveTypeIdentifierAccess().getAlternatives(), "rule__PrimitiveTypeIdentifier__Alternatives");
					put(grammarAccess.getCollectionTypeIdentifierAccess().getAlternatives(), "rule__CollectionTypeIdentifier__Alternatives");
					put(grammarAccess.getMultiplicityCSAccess().getAlternatives_1(), "rule__MultiplicityCS__Alternatives_1");
					put(grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAlternatives_0(), "rule__MultiplicityStringCS__StringBoundsAlternatives_0");
					put(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives(), "rule__PrimitiveLiteralExpCS__Alternatives");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives(), "rule__BooleanLiteralExpCS__Alternatives");
					put(grammarAccess.getTypeLiteralCSAccess().getAlternatives(), "rule__TypeLiteralCS__Alternatives");
					put(grammarAccess.getTypeExpCSAccess().getAlternatives_0(), "rule__TypeExpCS__Alternatives_0");
					put(grammarAccess.getExpCSAccess().getAlternatives(), "rule__ExpCS__Alternatives");
					put(grammarAccess.getExpCSAccess().getAlternatives_0_1_2(), "rule__ExpCS__Alternatives_0_1_2");
					put(grammarAccess.getPrefixedExpCSAccess().getAlternatives(), "rule__PrefixedExpCS__Alternatives");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives(), "rule__PrimaryExpCS__Alternatives");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives_7_2(), "rule__PrimaryExpCS__Alternatives_7_2");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives_7_2_1_2(), "rule__PrimaryExpCS__Alternatives_7_2_1_2");
					put(grammarAccess.getLocationConstraintTypeAccess().getAlternatives(), "rule__LocationConstraintType__Alternatives");
					put(grammarAccess.getSpecificationAccess().getGroup(), "rule__Specification__Group__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getQosDimensionAccess().getGroup(), "rule__QosDimension__Group__0");
					put(grammarAccess.getQosDimensionAccess().getGroup_8(), "rule__QosDimension__Group_8__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getLocationConstraintAccess().getGroup(), "rule__LocationConstraint__Group__0");
					put(grammarAccess.getLocationConstraintAccess().getGroup_5(), "rule__LocationConstraint__Group_5__0");
					put(grammarAccess.getResourceConstraintAccess().getGroup(), "rule__ResourceConstraint__Group__0");
					put(grammarAccess.getResourceConstraintAccess().getGroup_11(), "rule__ResourceConstraint__Group_11__0");
					put(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getGroup(), "rule__RequiredHardwareResourceInstanceConstraint__Group__0");
					put(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getGroup_5(), "rule__RequiredHardwareResourceInstanceConstraint__Group_5__0");
					put(grammarAccess.getLocationTupleDescriptorAccess().getGroup(), "rule__LocationTupleDescriptor__Group__0");
					put(grammarAccess.getComponentResourceTupleDescriptorAccess().getGroup(), "rule__ComponentResourceTupleDescriptor__Group__0");
					put(grammarAccess.getMeasureFunctionAccess().getGroup(), "rule__MeasureFunction__Group__0");
					put(grammarAccess.getMeasureFunctionAccess().getGroup_2(), "rule__MeasureFunction__Group_2__0");
					put(grammarAccess.getPathNameCSAccess().getGroup(), "rule__PathNameCS__Group__0");
					put(grammarAccess.getPathNameCSAccess().getGroup_1(), "rule__PathNameCS__Group_1__0");
					put(grammarAccess.getURIPathNameCSAccess().getGroup(), "rule__URIPathNameCS__Group__0");
					put(grammarAccess.getURIPathNameCSAccess().getGroup_1(), "rule__URIPathNameCS__Group_1__0");
					put(grammarAccess.getURIFirstPathElementCSAccess().getGroup_1(), "rule__URIFirstPathElementCS__Group_1__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup(), "rule__CollectionTypeCS__Group__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup_1(), "rule__CollectionTypeCS__Group_1__0");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getGroup(), "rule__MultiplicityBoundsCS__Group__0");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getGroup_1(), "rule__MultiplicityBoundsCS__Group_1__0");
					put(grammarAccess.getMultiplicityCSAccess().getGroup(), "rule__MultiplicityCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup(), "rule__TupleTypeCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1(), "rule__TupleTypeCS__Group_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1(), "rule__TupleTypeCS__Group_1_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1_1(), "rule__TupleTypeCS__Group_1_1_1__0");
					put(grammarAccess.getTuplePartCSAccess().getGroup(), "rule__TuplePartCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup(), "rule__CollectionLiteralExpCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2(), "rule__CollectionLiteralExpCS__Group_2__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1(), "rule__CollectionLiteralExpCS__Group_2_1__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup(), "rule__CollectionLiteralPartCS__Group__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1(), "rule__CollectionLiteralPartCS__Group_1__0");
					put(grammarAccess.getConstructorPartCSAccess().getGroup(), "rule__ConstructorPartCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup(), "rule__TupleLiteralExpCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup_3(), "rule__TupleLiteralExpCS__Group_3__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup(), "rule__TupleLiteralPartCS__Group__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1(), "rule__TupleLiteralPartCS__Group_1__0");
					put(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup(), "rule__UnlimitedNaturalLiteralExpCS__Group__0");
					put(grammarAccess.getInvalidLiteralExpCSAccess().getGroup(), "rule__InvalidLiteralExpCS__Group__0");
					put(grammarAccess.getNullLiteralExpCSAccess().getGroup(), "rule__NullLiteralExpCS__Group__0");
					put(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getGroup(), "rule__TypeLiteralWithMultiplicityCS__Group__0");
					put(grammarAccess.getTypeExpCSAccess().getGroup(), "rule__TypeExpCS__Group__0");
					put(grammarAccess.getExpCSAccess().getGroup_0(), "rule__ExpCS__Group_0__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1(), "rule__ExpCS__Group_0_1__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1_2_0(), "rule__ExpCS__Group_0_1_2_0__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1_2_0_1(), "rule__ExpCS__Group_0_1_2_0_1__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1_2_0_2(), "rule__ExpCS__Group_0_1_2_0_2__0");
					put(grammarAccess.getExpCSAccess().getGroup_1(), "rule__ExpCS__Group_1__0");
					put(grammarAccess.getPrefixedExpCSAccess().getGroup_0(), "rule__PrefixedExpCS__Group_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7(), "rule__PrimaryExpCS__Group_7__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_0(), "rule__PrimaryExpCS__Group_7_2_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_0_3(), "rule__PrimaryExpCS__Group_7_2_0_3__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_0_5(), "rule__PrimaryExpCS__Group_7_2_0_5__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_0_5_2(), "rule__PrimaryExpCS__Group_7_2_0_5_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_0_6(), "rule__PrimaryExpCS__Group_7_2_0_6__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_1(), "rule__PrimaryExpCS__Group_7_2_1__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_1_2_0(), "rule__PrimaryExpCS__Group_7_2_1_2_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_1_2_0_1(), "rule__PrimaryExpCS__Group_7_2_1_2_0_1__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_2(), "rule__PrimaryExpCS__Group_7_2_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_2_0(), "rule__PrimaryExpCS__Group_7_2_2_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_2_1(), "rule__PrimaryExpCS__Group_7_2_2_1__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_2_1_2(), "rule__PrimaryExpCS__Group_7_2_2_1_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_2_1_2_2(), "rule__PrimaryExpCS__Group_7_2_2_1_2_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_7_2_2_1_2_3(), "rule__PrimaryExpCS__Group_7_2_2_1_2_3__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup(), "rule__NavigatingArgCS__Group__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup_1(), "rule__NavigatingArgCS__Group_1__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup_1_2(), "rule__NavigatingArgCS__Group_1_2__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup(), "rule__NavigatingBarArgCS__Group__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2(), "rule__NavigatingBarArgCS__Group_2__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2_2(), "rule__NavigatingBarArgCS__Group_2_2__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup(), "rule__NavigatingCommaArgCS__Group__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2(), "rule__NavigatingCommaArgCS__Group_2__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2_2(), "rule__NavigatingCommaArgCS__Group_2_2__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup(), "rule__NavigatingSemiArgCS__Group__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2(), "rule__NavigatingSemiArgCS__Group_2__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2_2(), "rule__NavigatingSemiArgCS__Group_2_2__0");
					put(grammarAccess.getIfExpCSAccess().getGroup(), "rule__IfExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup(), "rule__LetExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup_2(), "rule__LetExpCS__Group_2__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup(), "rule__LetVariableCS__Group__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup_1(), "rule__LetVariableCS__Group_1__0");
					put(grammarAccess.getNestedExpCSAccess().getGroup(), "rule__NestedExpCS__Group__0");
					put(grammarAccess.getSelfExpCSAccess().getGroup(), "rule__SelfExpCS__Group__0");
					put(grammarAccess.getSpecificationAccess().getNameAssignment_1(), "rule__Specification__NameAssignment_1");
					put(grammarAccess.getSpecificationAccess().getServicesAssignment_3_0(), "rule__Specification__ServicesAssignment_3_0");
					put(grammarAccess.getSpecificationAccess().getConstraintsAssignment_3_1(), "rule__Specification__ConstraintsAssignment_3_1");
					put(grammarAccess.getSpecificationAccess().getMeasureAssignment_4(), "rule__Specification__MeasureAssignment_4");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getDimensionsAssignment_3(), "rule__Service__DimensionsAssignment_3");
					put(grammarAccess.getQosDimensionAccess().getNameAssignment_1(), "rule__QosDimension__NameAssignment_1");
					put(grammarAccess.getQosDimensionAccess().getValueAssignment_4(), "rule__QosDimension__ValueAssignment_4");
					put(grammarAccess.getQosDimensionAccess().getTupleDescriptorsAssignment_7(), "rule__QosDimension__TupleDescriptorsAssignment_7");
					put(grammarAccess.getQosDimensionAccess().getTupleDescriptorsAssignment_8_1(), "rule__QosDimension__TupleDescriptorsAssignment_8_1");
					put(grammarAccess.getQosDimensionAccess().getMetricAssignment_11(), "rule__QosDimension__MetricAssignment_11");
					put(grammarAccess.getLocationConstraintAccess().getTypeAssignment_0(), "rule__LocationConstraint__TypeAssignment_0");
					put(grammarAccess.getLocationConstraintAccess().getNameAssignment_1(), "rule__LocationConstraint__NameAssignment_1");
					put(grammarAccess.getLocationConstraintAccess().getTupleDescriptorsAssignment_4(), "rule__LocationConstraint__TupleDescriptorsAssignment_4");
					put(grammarAccess.getLocationConstraintAccess().getTupleDescriptorsAssignment_5_1(), "rule__LocationConstraint__TupleDescriptorsAssignment_5_1");
					put(grammarAccess.getLocationConstraintAccess().getExpressionAssignment_8(), "rule__LocationConstraint__ExpressionAssignment_8");
					put(grammarAccess.getResourceConstraintAccess().getNameAssignment_1(), "rule__ResourceConstraint__NameAssignment_1");
					put(grammarAccess.getResourceConstraintAccess().getLhsAssignment_4(), "rule__ResourceConstraint__LhsAssignment_4");
					put(grammarAccess.getResourceConstraintAccess().getRhsAssignment_7(), "rule__ResourceConstraint__RhsAssignment_7");
					put(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsAssignment_10(), "rule__ResourceConstraint__TupleDescriptorsAssignment_10");
					put(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsAssignment_11_1(), "rule__ResourceConstraint__TupleDescriptorsAssignment_11_1");
					put(grammarAccess.getResourceConstraintAccess().getExpressionAssignment_14(), "rule__ResourceConstraint__ExpressionAssignment_14");
					put(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getNameAssignment_1(), "rule__RequiredHardwareResourceInstanceConstraint__NameAssignment_1");
					put(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsAssignment_4(), "rule__RequiredHardwareResourceInstanceConstraint__TupleDescriptorsAssignment_4");
					put(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsAssignment_5_1(), "rule__RequiredHardwareResourceInstanceConstraint__TupleDescriptorsAssignment_5_1");
					put(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getExpressionAssignment_8(), "rule__RequiredHardwareResourceInstanceConstraint__ExpressionAssignment_8");
					put(grammarAccess.getLocationTupleDescriptorAccess().getInstanceAssignment_1(), "rule__LocationTupleDescriptor__InstanceAssignment_1");
					put(grammarAccess.getLocationTupleDescriptorAccess().getInstancesAssignment_3(), "rule__LocationTupleDescriptor__InstancesAssignment_3");
					put(grammarAccess.getValueTupleDescriptorAccess().getValueAssignment(), "rule__ValueTupleDescriptor__ValueAssignment");
					put(grammarAccess.getComponentResourceTupleDescriptorAccess().getInstanceAssignment_1(), "rule__ComponentResourceTupleDescriptor__InstanceAssignment_1");
					put(grammarAccess.getComponentResourceTupleDescriptorAccess().getHwresinstanceAssignment_3(), "rule__ComponentResourceTupleDescriptor__HwresinstanceAssignment_3");
					put(grammarAccess.getMeasureFunctionAccess().getServicesAssignment_1(), "rule__MeasureFunction__ServicesAssignment_1");
					put(grammarAccess.getMeasureFunctionAccess().getServicesAssignment_2_1(), "rule__MeasureFunction__ServicesAssignment_2_1");
					put(grammarAccess.getModelAccess().getOwnedExpressionAssignment(), "rule__Model__OwnedExpressionAssignment");
					put(grammarAccess.getEssentialOCLUnaryOperatorCSAccess().getNameAssignment(), "rule__EssentialOCLUnaryOperatorCS__NameAssignment");
					put(grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameAssignment(), "rule__EssentialOCLInfixOperatorCS__NameAssignment");
					put(grammarAccess.getEssentialOCLNavigationOperatorCSAccess().getNameAssignment(), "rule__EssentialOCLNavigationOperatorCS__NameAssignment");
					put(grammarAccess.getPathNameCSAccess().getPathAssignment_0(), "rule__PathNameCS__PathAssignment_0");
					put(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1(), "rule__PathNameCS__PathAssignment_1_1");
					put(grammarAccess.getFirstPathElementCSAccess().getElementAssignment(), "rule__FirstPathElementCS__ElementAssignment");
					put(grammarAccess.getNextPathElementCSAccess().getElementAssignment(), "rule__NextPathElementCS__ElementAssignment");
					put(grammarAccess.getURIPathNameCSAccess().getPathAssignment_0(), "rule__URIPathNameCS__PathAssignment_0");
					put(grammarAccess.getURIPathNameCSAccess().getPathAssignment_1_1(), "rule__URIPathNameCS__PathAssignment_1_1");
					put(grammarAccess.getURIFirstPathElementCSAccess().getElementAssignment_0(), "rule__URIFirstPathElementCS__ElementAssignment_0");
					put(grammarAccess.getURIFirstPathElementCSAccess().getElementAssignment_1_1(), "rule__URIFirstPathElementCS__ElementAssignment_1_1");
					put(grammarAccess.getPrimitiveTypeCSAccess().getNameAssignment(), "rule__PrimitiveTypeCS__NameAssignment");
					put(grammarAccess.getCollectionTypeCSAccess().getNameAssignment_0(), "rule__CollectionTypeCS__NameAssignment_0");
					put(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_1(), "rule__CollectionTypeCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundAssignment_0(), "rule__MultiplicityBoundsCS__LowerBoundAssignment_0");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundAssignment_1_1(), "rule__MultiplicityBoundsCS__UpperBoundAssignment_1_1");
					put(grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAssignment(), "rule__MultiplicityStringCS__StringBoundsAssignment");
					put(grammarAccess.getTupleTypeCSAccess().getNameAssignment_0(), "rule__TupleTypeCS__NameAssignment_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_1_0(), "rule__TupleTypeCS__OwnedPartsAssignment_1_1_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_1_1_1(), "rule__TupleTypeCS__OwnedPartsAssignment_1_1_1_1");
					put(grammarAccess.getTuplePartCSAccess().getNameAssignment_0(), "rule__TuplePartCS__NameAssignment_0");
					put(grammarAccess.getTuplePartCSAccess().getOwnedTypeAssignment_2(), "rule__TuplePartCS__OwnedTypeAssignment_2");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeAssignment_0(), "rule__CollectionLiteralExpCS__OwnedTypeAssignment_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_0(), "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_1_1(), "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0(), "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1(), "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1");
					put(grammarAccess.getConstructorPartCSAccess().getPropertyAssignment_0(), "rule__ConstructorPartCS__PropertyAssignment_0");
					put(grammarAccess.getConstructorPartCSAccess().getInitExpressionAssignment_2(), "rule__ConstructorPartCS__InitExpressionAssignment_2");
					put(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_2(), "rule__TupleLiteralExpCS__OwnedPartsAssignment_2");
					put(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_3_1(), "rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0(), "rule__TupleLiteralPartCS__NameAssignment_0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeAssignment_1_1(), "rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3(), "rule__TupleLiteralPartCS__InitExpressionAssignment_3");
					put(grammarAccess.getNumberLiteralExpCSAccess().getNameAssignment(), "rule__NumberLiteralExpCS__NameAssignment");
					put(grammarAccess.getStringLiteralExpCSAccess().getNameAssignment(), "rule__StringLiteralExpCS__NameAssignment");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_0(), "rule__BooleanLiteralExpCS__NameAssignment_0");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_1(), "rule__BooleanLiteralExpCS__NameAssignment_1");
					put(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getMultiplicityAssignment_1(), "rule__TypeLiteralWithMultiplicityCS__MultiplicityAssignment_1");
					put(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeAssignment(), "rule__TypeLiteralExpCS__OwnedTypeAssignment");
					put(grammarAccess.getTypeNameExpCSAccess().getPathNameAssignment(), "rule__TypeNameExpCS__PathNameAssignment");
					put(grammarAccess.getTypeExpCSAccess().getMultiplicityAssignment_1(), "rule__TypeExpCS__MultiplicityAssignment_1");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_0_1_1(), "rule__ExpCS__OwnedOperatorAssignment_0_1_1");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_0_0(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_0_0");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_0_1_2_0_1_0(), "rule__ExpCS__OwnedOperatorAssignment_0_1_2_0_1_0");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_0_1_1(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_0_1_1");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_0_1_2_0_2_0(), "rule__ExpCS__OwnedOperatorAssignment_0_1_2_0_2_0");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_0_2_1(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_0_2_1");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_1(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_1");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_1_1(), "rule__ExpCS__OwnedOperatorAssignment_1_1");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_1_2(), "rule__ExpCS__OwnedExpressionAssignment_1_2");
					put(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_0_1(), "rule__PrefixedExpCS__OwnedOperatorAssignment_0_1");
					put(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionAssignment_0_2(), "rule__PrefixedExpCS__OwnedExpressionAssignment_0_2");
					put(grammarAccess.getPrimaryExpCSAccess().getPathNameAssignment_7_1(), "rule__PrimaryExpCS__PathNameAssignment_7_1");
					put(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesAssignment_7_2_0_2(), "rule__PrimaryExpCS__FirstIndexesAssignment_7_2_0_2");
					put(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesAssignment_7_2_0_3_1(), "rule__PrimaryExpCS__FirstIndexesAssignment_7_2_0_3_1");
					put(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesAssignment_7_2_0_5_1(), "rule__PrimaryExpCS__SecondIndexesAssignment_7_2_0_5_1");
					put(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesAssignment_7_2_0_5_2_1(), "rule__PrimaryExpCS__SecondIndexesAssignment_7_2_0_5_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getAtPreAssignment_7_2_0_6_0(), "rule__PrimaryExpCS__AtPreAssignment_7_2_0_6_0");
					put(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsAssignment_7_2_1_2_0_0(), "rule__PrimaryExpCS__OwnedPartsAssignment_7_2_1_2_0_0");
					put(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsAssignment_7_2_1_2_0_1_1(), "rule__PrimaryExpCS__OwnedPartsAssignment_7_2_1_2_0_1_1");
					put(grammarAccess.getPrimaryExpCSAccess().getValueAssignment_7_2_1_2_1(), "rule__PrimaryExpCS__ValueAssignment_7_2_1_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getAtPreAssignment_7_2_2_0_0(), "rule__PrimaryExpCS__AtPreAssignment_7_2_2_0_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_7_2_2_1_2_0(), "rule__PrimaryExpCS__ArgumentAssignment_7_2_2_1_2_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_7_2_2_1_2_1(), "rule__PrimaryExpCS__ArgumentAssignment_7_2_2_1_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_7_2_2_1_2_2_0(), "rule__PrimaryExpCS__ArgumentAssignment_7_2_2_1_2_2_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_7_2_2_1_2_2_1(), "rule__PrimaryExpCS__ArgumentAssignment_7_2_2_1_2_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_7_2_2_1_2_3_0(), "rule__PrimaryExpCS__ArgumentAssignment_7_2_2_1_2_3_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_7_2_2_1_2_3_1(), "rule__PrimaryExpCS__ArgumentAssignment_7_2_2_1_2_3_1");
					put(grammarAccess.getNavigatingArgCSAccess().getNameAssignment_0(), "rule__NavigatingArgCS__NameAssignment_0");
					put(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeAssignment_1_1(), "rule__NavigatingArgCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getNavigatingArgCSAccess().getInitAssignment_1_2_1(), "rule__NavigatingArgCS__InitAssignment_1_2_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingBarArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getNameAssignment_1(), "rule__NavigatingBarArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getInitAssignment_2_2_1(), "rule__NavigatingBarArgCS__InitAssignment_2_2_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingCommaArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getNameAssignment_1(), "rule__NavigatingCommaArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getInitAssignment_2_2_1(), "rule__NavigatingCommaArgCS__InitAssignment_2_2_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingSemiArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getNameAssignment_1(), "rule__NavigatingSemiArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getInitAssignment_2_2_1(), "rule__NavigatingSemiArgCS__InitAssignment_2_2_1");
					put(grammarAccess.getIfExpCSAccess().getConditionAssignment_1(), "rule__IfExpCS__ConditionAssignment_1");
					put(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3(), "rule__IfExpCS__ThenExpressionAssignment_3");
					put(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5(), "rule__IfExpCS__ElseExpressionAssignment_5");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_1(), "rule__LetExpCS__VariableAssignment_1");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1(), "rule__LetExpCS__VariableAssignment_2_1");
					put(grammarAccess.getLetExpCSAccess().getInAssignment_4(), "rule__LetExpCS__InAssignment_4");
					put(grammarAccess.getLetVariableCSAccess().getNameAssignment_0(), "rule__LetVariableCS__NameAssignment_0");
					put(grammarAccess.getLetVariableCSAccess().getOwnedTypeAssignment_1_1(), "rule__LetVariableCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_3(), "rule__LetVariableCS__InitExpressionAssignment_3");
					put(grammarAccess.getNestedExpCSAccess().getSourceAssignment_1(), "rule__NestedExpCS__SourceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_paderborn.fujaba.muml.allocation.language.ui.contentassist.antlr.internal.InternalAllocationSpecificationLanguageParser typedParser = (de.uni_paderborn.fujaba.muml.allocation.language.ui.contentassist.antlr.internal.InternalAllocationSpecificationLanguageParser) parser;
			typedParser.entryRuleSpecification();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AllocationSpecificationLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AllocationSpecificationLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
