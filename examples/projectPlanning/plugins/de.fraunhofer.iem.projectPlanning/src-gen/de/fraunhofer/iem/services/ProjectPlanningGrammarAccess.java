/*
 * generated by Xtext 2.10.0
 */
package de.fraunhofer.iem.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ProjectPlanningGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProjectPlanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.iem.ProjectPlanning.ProjectPlan");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cCapabilitiesKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cCapabilitiesCapabilityParserRuleCall_0_1_0 = (RuleCall)cCapabilitiesAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cCommaKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cCapabilitiesCapabilityParserRuleCall_0_2_1_0 = (RuleCall)cCapabilitiesAssignment_0_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEmployeesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEmployeesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEmployeesEmployeeParserRuleCall_1_1_0 = (RuleCall)cEmployeesAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cEmployeesAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cEmployeesEmployeeParserRuleCall_1_2_1_0 = (RuleCall)cEmployeesAssignment_1_2_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cProjectsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cProjectsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cProjectsProjectParserRuleCall_2_1_0 = (RuleCall)cProjectsAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cProjectsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cProjectsProjectParserRuleCall_2_2_1_0 = (RuleCall)cProjectsAssignment_2_2_1.eContents().get(0);
		private final Assignment cRatingsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRatingsRatingParserRuleCall_3_0 = (RuleCall)cRatingsAssignment_3.eContents().get(0);
		private final Assignment cAssignmentsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAssignmentsAssignmentParserRuleCall_4_0 = (RuleCall)cAssignmentsAssignment_4.eContents().get(0);
		
		//ProjectPlan:
		//	('capabilities:' capabilities+=Capability* (','+ capabilities+=Capability)* ';') ('employees:' employees+=Employee*
		//	(','+ employees+=Employee)*) ('projects:' projects+=Project* (','+ projects+=Project)*) ratings+=Rating*
		//	assignments+=Assignment*;
		@Override public ParserRule getRule() { return rule; }
		
		//('capabilities:' capabilities+=Capability* (','+ capabilities+=Capability)* ';') ('employees:' employees+=Employee*
		//(','+ employees+=Employee)*) ('projects:' projects+=Project* (','+ projects+=Project)*) ratings+=Rating*
		//assignments+=Assignment*
		public Group getGroup() { return cGroup; }
		
		//('capabilities:' capabilities+=Capability* (','+ capabilities+=Capability)* ';')
		public Group getGroup_0() { return cGroup_0; }
		
		//'capabilities:'
		public Keyword getCapabilitiesKeyword_0_0() { return cCapabilitiesKeyword_0_0; }
		
		//capabilities+=Capability*
		public Assignment getCapabilitiesAssignment_0_1() { return cCapabilitiesAssignment_0_1; }
		
		//Capability
		public RuleCall getCapabilitiesCapabilityParserRuleCall_0_1_0() { return cCapabilitiesCapabilityParserRuleCall_0_1_0; }
		
		//(','+ capabilities+=Capability)*
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//','+
		public Keyword getCommaKeyword_0_2_0() { return cCommaKeyword_0_2_0; }
		
		//capabilities+=Capability
		public Assignment getCapabilitiesAssignment_0_2_1() { return cCapabilitiesAssignment_0_2_1; }
		
		//Capability
		public RuleCall getCapabilitiesCapabilityParserRuleCall_0_2_1_0() { return cCapabilitiesCapabilityParserRuleCall_0_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_0_3() { return cSemicolonKeyword_0_3; }
		
		//('employees:' employees+=Employee* (','+ employees+=Employee)*)
		public Group getGroup_1() { return cGroup_1; }
		
		//'employees:'
		public Keyword getEmployeesKeyword_1_0() { return cEmployeesKeyword_1_0; }
		
		//employees+=Employee*
		public Assignment getEmployeesAssignment_1_1() { return cEmployeesAssignment_1_1; }
		
		//Employee
		public RuleCall getEmployeesEmployeeParserRuleCall_1_1_0() { return cEmployeesEmployeeParserRuleCall_1_1_0; }
		
		//(','+ employees+=Employee)*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//','+
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }
		
		//employees+=Employee
		public Assignment getEmployeesAssignment_1_2_1() { return cEmployeesAssignment_1_2_1; }
		
		//Employee
		public RuleCall getEmployeesEmployeeParserRuleCall_1_2_1_0() { return cEmployeesEmployeeParserRuleCall_1_2_1_0; }
		
		//('projects:' projects+=Project* (','+ projects+=Project)*)
		public Group getGroup_2() { return cGroup_2; }
		
		//'projects:'
		public Keyword getProjectsKeyword_2_0() { return cProjectsKeyword_2_0; }
		
		//projects+=Project*
		public Assignment getProjectsAssignment_2_1() { return cProjectsAssignment_2_1; }
		
		//Project
		public RuleCall getProjectsProjectParserRuleCall_2_1_0() { return cProjectsProjectParserRuleCall_2_1_0; }
		
		//(','+ projects+=Project)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','+
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//projects+=Project
		public Assignment getProjectsAssignment_2_2_1() { return cProjectsAssignment_2_2_1; }
		
		//Project
		public RuleCall getProjectsProjectParserRuleCall_2_2_1_0() { return cProjectsProjectParserRuleCall_2_2_1_0; }
		
		//ratings+=Rating*
		public Assignment getRatingsAssignment_3() { return cRatingsAssignment_3; }
		
		//Rating
		public RuleCall getRatingsRatingParserRuleCall_3_0() { return cRatingsRatingParserRuleCall_3_0; }
		
		//assignments+=Assignment*
		public Assignment getAssignmentsAssignment_4() { return cAssignmentsAssignment_4; }
		
		//Assignment
		public RuleCall getAssignmentsAssignmentParserRuleCall_4_0() { return cAssignmentsAssignmentParserRuleCall_4_0; }
	}
	public class ProjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.iem.ProjectPlanning.Project");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRequiresResourcesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRequiresResourcesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRequiresResourcesINTTerminalRuleCall_2_1_0 = (RuleCall)cRequiresResourcesAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cRequiresCapabilitiesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRequiresCapabilitiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRequiresCapabilitiesCapabilityCrossReference_3_1_0 = (CrossReference)cRequiresCapabilitiesAssignment_3_1.eContents().get(0);
		private final RuleCall cRequiresCapabilitiesCapabilityIDTerminalRuleCall_3_1_0_1 = (RuleCall)cRequiresCapabilitiesCapabilityCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cRequiresCapabilitiesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cRequiresCapabilitiesCapabilityCrossReference_3_2_1_0 = (CrossReference)cRequiresCapabilitiesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cRequiresCapabilitiesCapabilityIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cRequiresCapabilitiesCapabilityCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Project:
		//	name=ID ':' ('requiresResources:' requiresResources=INT) ('requiresCapabilities:' requiresCapabilities+=[Capability]*
		//	(','+ requiresCapabilities+=[Capability])*)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' ('requiresResources:' requiresResources=INT) ('requiresCapabilities:' requiresCapabilities+=[Capability]*
		//(','+ requiresCapabilities+=[Capability])*)? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//('requiresResources:' requiresResources=INT)
		public Group getGroup_2() { return cGroup_2; }
		
		//'requiresResources:'
		public Keyword getRequiresResourcesKeyword_2_0() { return cRequiresResourcesKeyword_2_0; }
		
		//requiresResources=INT
		public Assignment getRequiresResourcesAssignment_2_1() { return cRequiresResourcesAssignment_2_1; }
		
		//INT
		public RuleCall getRequiresResourcesINTTerminalRuleCall_2_1_0() { return cRequiresResourcesINTTerminalRuleCall_2_1_0; }
		
		//('requiresCapabilities:' requiresCapabilities+=[Capability]* (','+ requiresCapabilities+=[Capability])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'requiresCapabilities:'
		public Keyword getRequiresCapabilitiesKeyword_3_0() { return cRequiresCapabilitiesKeyword_3_0; }
		
		//requiresCapabilities+=[Capability]*
		public Assignment getRequiresCapabilitiesAssignment_3_1() { return cRequiresCapabilitiesAssignment_3_1; }
		
		//[Capability]
		public CrossReference getRequiresCapabilitiesCapabilityCrossReference_3_1_0() { return cRequiresCapabilitiesCapabilityCrossReference_3_1_0; }
		
		//ID
		public RuleCall getRequiresCapabilitiesCapabilityIDTerminalRuleCall_3_1_0_1() { return cRequiresCapabilitiesCapabilityIDTerminalRuleCall_3_1_0_1; }
		
		//(','+ requiresCapabilities+=[Capability])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','+
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//requiresCapabilities+=[Capability]
		public Assignment getRequiresCapabilitiesAssignment_3_2_1() { return cRequiresCapabilitiesAssignment_3_2_1; }
		
		//[Capability]
		public CrossReference getRequiresCapabilitiesCapabilityCrossReference_3_2_1_0() { return cRequiresCapabilitiesCapabilityCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getRequiresCapabilitiesCapabilityIDTerminalRuleCall_3_2_1_0_1() { return cRequiresCapabilitiesCapabilityIDTerminalRuleCall_3_2_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class EmployeeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.iem.ProjectPlanning.Employee");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHasResourcesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cHasResourceAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cHasResourceINTTerminalRuleCall_2_1_0 = (RuleCall)cHasResourceAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cHasCapabilitiesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cHasCapabilitiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cHasCapabilitiesCapabilityCrossReference_3_1_0 = (CrossReference)cHasCapabilitiesAssignment_3_1.eContents().get(0);
		private final RuleCall cHasCapabilitiesCapabilityIDTerminalRuleCall_3_1_0_1 = (RuleCall)cHasCapabilitiesCapabilityCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cHasCapabilitiesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cHasCapabilitiesCapabilityCrossReference_3_2_1_0 = (CrossReference)cHasCapabilitiesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cHasCapabilitiesCapabilityIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cHasCapabilitiesCapabilityCrossReference_3_2_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRatesCapabilitiesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRatingsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRatingsRatingParserRuleCall_4_1_0 = (RuleCall)cRatingsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cRatingsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cRatingsRatingParserRuleCall_4_2_1_0 = (RuleCall)cRatingsAssignment_4_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Employee:
		//	name=ID ':' ('hasResources:' hasResource=INT) ('hasCapabilities:' hasCapabilities+=[Capability]* (','+
		//	hasCapabilities+=[Capability])*)? ('ratesCapabilities:' ratings+=Rating* (','+ ratings+=Rating)*)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' ('hasResources:' hasResource=INT) ('hasCapabilities:' hasCapabilities+=[Capability]* (','+
		//hasCapabilities+=[Capability])*)? ('ratesCapabilities:' ratings+=Rating* (','+ ratings+=Rating)*)? ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//('hasResources:' hasResource=INT)
		public Group getGroup_2() { return cGroup_2; }
		
		//'hasResources:'
		public Keyword getHasResourcesKeyword_2_0() { return cHasResourcesKeyword_2_0; }
		
		//hasResource=INT
		public Assignment getHasResourceAssignment_2_1() { return cHasResourceAssignment_2_1; }
		
		//INT
		public RuleCall getHasResourceINTTerminalRuleCall_2_1_0() { return cHasResourceINTTerminalRuleCall_2_1_0; }
		
		//('hasCapabilities:' hasCapabilities+=[Capability]* (','+ hasCapabilities+=[Capability])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'hasCapabilities:'
		public Keyword getHasCapabilitiesKeyword_3_0() { return cHasCapabilitiesKeyword_3_0; }
		
		//hasCapabilities+=[Capability]*
		public Assignment getHasCapabilitiesAssignment_3_1() { return cHasCapabilitiesAssignment_3_1; }
		
		//[Capability]
		public CrossReference getHasCapabilitiesCapabilityCrossReference_3_1_0() { return cHasCapabilitiesCapabilityCrossReference_3_1_0; }
		
		//ID
		public RuleCall getHasCapabilitiesCapabilityIDTerminalRuleCall_3_1_0_1() { return cHasCapabilitiesCapabilityIDTerminalRuleCall_3_1_0_1; }
		
		//(','+ hasCapabilities+=[Capability])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','+
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//hasCapabilities+=[Capability]
		public Assignment getHasCapabilitiesAssignment_3_2_1() { return cHasCapabilitiesAssignment_3_2_1; }
		
		//[Capability]
		public CrossReference getHasCapabilitiesCapabilityCrossReference_3_2_1_0() { return cHasCapabilitiesCapabilityCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getHasCapabilitiesCapabilityIDTerminalRuleCall_3_2_1_0_1() { return cHasCapabilitiesCapabilityIDTerminalRuleCall_3_2_1_0_1; }
		
		//('ratesCapabilities:' ratings+=Rating* (','+ ratings+=Rating)*)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'ratesCapabilities:'
		public Keyword getRatesCapabilitiesKeyword_4_0() { return cRatesCapabilitiesKeyword_4_0; }
		
		//ratings+=Rating*
		public Assignment getRatingsAssignment_4_1() { return cRatingsAssignment_4_1; }
		
		//Rating
		public RuleCall getRatingsRatingParserRuleCall_4_1_0() { return cRatingsRatingParserRuleCall_4_1_0; }
		
		//(','+ ratings+=Rating)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//','+
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//ratings+=Rating
		public Assignment getRatingsAssignment_4_2_1() { return cRatingsAssignment_4_2_1; }
		
		//Rating
		public RuleCall getRatingsRatingParserRuleCall_4_2_1_0() { return cRatingsRatingParserRuleCall_4_2_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class CapabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.iem.ProjectPlanning.Capability");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Capability:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class RatingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.iem.ProjectPlanning.Rating");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCapabilityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cCapabilityCapabilityCrossReference_0_0 = (CrossReference)cCapabilityAssignment_0.eContents().get(0);
		private final RuleCall cCapabilityCapabilityIDTerminalRuleCall_0_0_1 = (RuleCall)cCapabilityCapabilityCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRatingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRatingINTTerminalRuleCall_2_0 = (RuleCall)cRatingAssignment_2.eContents().get(0);
		
		//Rating:
		//	capability=[Capability] '=' rating=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//capability=[Capability] '=' rating=INT
		public Group getGroup() { return cGroup; }
		
		//capability=[Capability]
		public Assignment getCapabilityAssignment_0() { return cCapabilityAssignment_0; }
		
		//[Capability]
		public CrossReference getCapabilityCapabilityCrossReference_0_0() { return cCapabilityCapabilityCrossReference_0_0; }
		
		//ID
		public RuleCall getCapabilityCapabilityIDTerminalRuleCall_0_0_1() { return cCapabilityCapabilityIDTerminalRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//rating=INT
		public Assignment getRatingAssignment_2() { return cRatingAssignment_2; }
		
		//INT
		public RuleCall getRatingINTTerminalRuleCall_2_0() { return cRatingINTTerminalRuleCall_2_0; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.iem.ProjectPlanning.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cProjectProjectCrossReference_0_0 = (CrossReference)cProjectAssignment_0.eContents().get(0);
		private final RuleCall cProjectProjectIDTerminalRuleCall_0_0_1 = (RuleCall)cProjectProjectCrossReference_0_0.eContents().get(1);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAssignedKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEmployeeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cEmployeeEmployeeCrossReference_4_0 = (CrossReference)cEmployeeAssignment_4.eContents().get(0);
		private final RuleCall cEmployeeEmployeeIDTerminalRuleCall_4_0_1 = (RuleCall)cEmployeeEmployeeCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Assignment:
		//	project=[Project] 'is' 'assigned' 'to' employee=[Employee] ';';
		@Override public ParserRule getRule() { return rule; }
		
		//project=[Project] 'is' 'assigned' 'to' employee=[Employee] ';'
		public Group getGroup() { return cGroup; }
		
		//project=[Project]
		public Assignment getProjectAssignment_0() { return cProjectAssignment_0; }
		
		//[Project]
		public CrossReference getProjectProjectCrossReference_0_0() { return cProjectProjectCrossReference_0_0; }
		
		//ID
		public RuleCall getProjectProjectIDTerminalRuleCall_0_0_1() { return cProjectProjectIDTerminalRuleCall_0_0_1; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//'assigned'
		public Keyword getAssignedKeyword_2() { return cAssignedKeyword_2; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//employee=[Employee]
		public Assignment getEmployeeAssignment_4() { return cEmployeeAssignment_4; }
		
		//[Employee]
		public CrossReference getEmployeeEmployeeCrossReference_4_0() { return cEmployeeEmployeeCrossReference_4_0; }
		
		//ID
		public RuleCall getEmployeeEmployeeIDTerminalRuleCall_4_0_1() { return cEmployeeEmployeeIDTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	
	
	private final ProjectPlanElements pProjectPlan;
	private final ProjectElements pProject;
	private final EmployeeElements pEmployee;
	private final CapabilityElements pCapability;
	private final RatingElements pRating;
	private final AssignmentElements pAssignment;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProjectPlanningGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProjectPlan = new ProjectPlanElements();
		this.pProject = new ProjectElements();
		this.pEmployee = new EmployeeElements();
		this.pCapability = new CapabilityElements();
		this.pRating = new RatingElements();
		this.pAssignment = new AssignmentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.fraunhofer.iem.ProjectPlanning".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ProjectPlan:
	//	('capabilities:' capabilities+=Capability* (','+ capabilities+=Capability)* ';') ('employees:' employees+=Employee*
	//	(','+ employees+=Employee)*) ('projects:' projects+=Project* (','+ projects+=Project)*) ratings+=Rating*
	//	assignments+=Assignment*;
	public ProjectPlanElements getProjectPlanAccess() {
		return pProjectPlan;
	}
	
	public ParserRule getProjectPlanRule() {
		return getProjectPlanAccess().getRule();
	}
	
	//Project:
	//	name=ID ':' ('requiresResources:' requiresResources=INT) ('requiresCapabilities:' requiresCapabilities+=[Capability]*
	//	(','+ requiresCapabilities+=[Capability])*)? ';';
	public ProjectElements getProjectAccess() {
		return pProject;
	}
	
	public ParserRule getProjectRule() {
		return getProjectAccess().getRule();
	}
	
	//Employee:
	//	name=ID ':' ('hasResources:' hasResource=INT) ('hasCapabilities:' hasCapabilities+=[Capability]* (','+
	//	hasCapabilities+=[Capability])*)? ('ratesCapabilities:' ratings+=Rating* (','+ ratings+=Rating)*)? ';';
	public EmployeeElements getEmployeeAccess() {
		return pEmployee;
	}
	
	public ParserRule getEmployeeRule() {
		return getEmployeeAccess().getRule();
	}
	
	//Capability:
	//	name=ID;
	public CapabilityElements getCapabilityAccess() {
		return pCapability;
	}
	
	public ParserRule getCapabilityRule() {
		return getCapabilityAccess().getRule();
	}
	
	//Rating:
	//	capability=[Capability] '=' rating=INT;
	public RatingElements getRatingAccess() {
		return pRating;
	}
	
	public ParserRule getRatingRule() {
		return getRatingAccess().getRule();
	}
	
	//Assignment:
	//	project=[Project] 'is' 'assigned' 'to' employee=[Employee] ';';
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
