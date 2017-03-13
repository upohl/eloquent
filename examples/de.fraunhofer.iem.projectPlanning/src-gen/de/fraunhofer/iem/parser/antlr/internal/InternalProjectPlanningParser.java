package de.fraunhofer.iem.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.iem.services.ProjectPlanningGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectPlanningParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'capabilities:'", "','", "';'", "'employees:'", "'projects:'", "':'", "'requiresResources:'", "'requiresCapabilities:'", "'hasResources:'", "'hasCapabilities:'", "'ratesCapabilities:'", "'='", "'is'", "'assigned'", "'to'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProjectPlanningParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectPlanningParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectPlanningParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectPlanning.g"; }



     	private ProjectPlanningGrammarAccess grammarAccess;

        public InternalProjectPlanningParser(TokenStream input, ProjectPlanningGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProjectPlan";
       	}

       	@Override
       	protected ProjectPlanningGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProjectPlan"
    // InternalProjectPlanning.g:64:1: entryRuleProjectPlan returns [EObject current=null] : iv_ruleProjectPlan= ruleProjectPlan EOF ;
    public final EObject entryRuleProjectPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectPlan = null;


        try {
            // InternalProjectPlanning.g:64:52: (iv_ruleProjectPlan= ruleProjectPlan EOF )
            // InternalProjectPlanning.g:65:2: iv_ruleProjectPlan= ruleProjectPlan EOF
            {
             newCompositeNode(grammarAccess.getProjectPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectPlan=ruleProjectPlan();

            state._fsp--;

             current =iv_ruleProjectPlan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectPlan"


    // $ANTLR start "ruleProjectPlan"
    // InternalProjectPlanning.g:71:1: ruleProjectPlan returns [EObject current=null] : ( (otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';' ) (otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )* ) (otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )* ) ( (lv_ratings_13_0= ruleRating ) )* ( (lv_assignments_14_0= ruleAssignment ) )* ) ;
    public final EObject ruleProjectPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_capabilities_1_0 = null;

        EObject lv_capabilities_3_0 = null;

        EObject lv_employees_6_0 = null;

        EObject lv_employees_8_0 = null;

        EObject lv_projects_10_0 = null;

        EObject lv_projects_12_0 = null;

        EObject lv_ratings_13_0 = null;

        EObject lv_assignments_14_0 = null;



        	enterRule();

        try {
            // InternalProjectPlanning.g:77:2: ( ( (otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';' ) (otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )* ) (otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )* ) ( (lv_ratings_13_0= ruleRating ) )* ( (lv_assignments_14_0= ruleAssignment ) )* ) )
            // InternalProjectPlanning.g:78:2: ( (otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';' ) (otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )* ) (otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )* ) ( (lv_ratings_13_0= ruleRating ) )* ( (lv_assignments_14_0= ruleAssignment ) )* )
            {
            // InternalProjectPlanning.g:78:2: ( (otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';' ) (otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )* ) (otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )* ) ( (lv_ratings_13_0= ruleRating ) )* ( (lv_assignments_14_0= ruleAssignment ) )* )
            // InternalProjectPlanning.g:79:3: (otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';' ) (otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )* ) (otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )* ) ( (lv_ratings_13_0= ruleRating ) )* ( (lv_assignments_14_0= ruleAssignment ) )*
            {
            // InternalProjectPlanning.g:79:3: (otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';' )
            // InternalProjectPlanning.g:80:4: otherlv_0= 'capabilities:' ( (lv_capabilities_1_0= ruleCapability ) )* ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getProjectPlanAccess().getCapabilitiesKeyword_0_0());
            			
            // InternalProjectPlanning.g:84:4: ( (lv_capabilities_1_0= ruleCapability ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectPlanning.g:85:5: (lv_capabilities_1_0= ruleCapability )
            	    {
            	    // InternalProjectPlanning.g:85:5: (lv_capabilities_1_0= ruleCapability )
            	    // InternalProjectPlanning.g:86:6: lv_capabilities_1_0= ruleCapability
            	    {

            	    						newCompositeNode(grammarAccess.getProjectPlanAccess().getCapabilitiesCapabilityParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_capabilities_1_0=ruleCapability();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"capabilities",
            	    							lv_capabilities_1_0,
            	    							"de.fraunhofer.iem.ProjectPlanning.Capability");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalProjectPlanning.g:103:4: ( (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProjectPlanning.g:104:5: (otherlv_2= ',' )+ ( (lv_capabilities_3_0= ruleCapability ) )
            	    {
            	    // InternalProjectPlanning.g:104:5: (otherlv_2= ',' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==12) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalProjectPlanning.g:105:6: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    	    						newLeafNode(otherlv_2, grammarAccess.getProjectPlanAccess().getCommaKeyword_0_2_0());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    // InternalProjectPlanning.g:110:5: ( (lv_capabilities_3_0= ruleCapability ) )
            	    // InternalProjectPlanning.g:111:6: (lv_capabilities_3_0= ruleCapability )
            	    {
            	    // InternalProjectPlanning.g:111:6: (lv_capabilities_3_0= ruleCapability )
            	    // InternalProjectPlanning.g:112:7: lv_capabilities_3_0= ruleCapability
            	    {

            	    							newCompositeNode(grammarAccess.getProjectPlanAccess().getCapabilitiesCapabilityParserRuleCall_0_2_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_capabilities_3_0=ruleCapability();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    							}
            	    							add(
            	    								current,
            	    								"capabilities",
            	    								lv_capabilities_3_0,
            	    								"de.fraunhofer.iem.ProjectPlanning.Capability");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getProjectPlanAccess().getSemicolonKeyword_0_3());
            			

            }

            // InternalProjectPlanning.g:135:3: (otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )* )
            // InternalProjectPlanning.g:136:4: otherlv_5= 'employees:' ( (lv_employees_6_0= ruleEmployee ) )* ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )*
            {
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getProjectPlanAccess().getEmployeesKeyword_1_0());
            			
            // InternalProjectPlanning.g:140:4: ( (lv_employees_6_0= ruleEmployee ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectPlanning.g:141:5: (lv_employees_6_0= ruleEmployee )
            	    {
            	    // InternalProjectPlanning.g:141:5: (lv_employees_6_0= ruleEmployee )
            	    // InternalProjectPlanning.g:142:6: lv_employees_6_0= ruleEmployee
            	    {

            	    						newCompositeNode(grammarAccess.getProjectPlanAccess().getEmployeesEmployeeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_employees_6_0=ruleEmployee();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"employees",
            	    							lv_employees_6_0,
            	    							"de.fraunhofer.iem.ProjectPlanning.Employee");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalProjectPlanning.g:159:4: ( (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectPlanning.g:160:5: (otherlv_7= ',' )+ ( (lv_employees_8_0= ruleEmployee ) )
            	    {
            	    // InternalProjectPlanning.g:160:5: (otherlv_7= ',' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==12) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalProjectPlanning.g:161:6: otherlv_7= ','
            	    	    {
            	    	    otherlv_7=(Token)match(input,12,FOLLOW_4); 

            	    	    						newLeafNode(otherlv_7, grammarAccess.getProjectPlanAccess().getCommaKeyword_1_2_0());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalProjectPlanning.g:166:5: ( (lv_employees_8_0= ruleEmployee ) )
            	    // InternalProjectPlanning.g:167:6: (lv_employees_8_0= ruleEmployee )
            	    {
            	    // InternalProjectPlanning.g:167:6: (lv_employees_8_0= ruleEmployee )
            	    // InternalProjectPlanning.g:168:7: lv_employees_8_0= ruleEmployee
            	    {

            	    							newCompositeNode(grammarAccess.getProjectPlanAccess().getEmployeesEmployeeParserRuleCall_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_employees_8_0=ruleEmployee();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    							}
            	    							add(
            	    								current,
            	    								"employees",
            	    								lv_employees_8_0,
            	    								"de.fraunhofer.iem.ProjectPlanning.Employee");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            // InternalProjectPlanning.g:187:3: (otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )* )
            // InternalProjectPlanning.g:188:4: otherlv_9= 'projects:' ( (lv_projects_10_0= ruleProject ) )* ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )*
            {
            otherlv_9=(Token)match(input,15,FOLLOW_9); 

            				newLeafNode(otherlv_9, grammarAccess.getProjectPlanAccess().getProjectsKeyword_2_0());
            			
            // InternalProjectPlanning.g:192:4: ( (lv_projects_10_0= ruleProject ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==16) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectPlanning.g:193:5: (lv_projects_10_0= ruleProject )
            	    {
            	    // InternalProjectPlanning.g:193:5: (lv_projects_10_0= ruleProject )
            	    // InternalProjectPlanning.g:194:6: lv_projects_10_0= ruleProject
            	    {

            	    						newCompositeNode(grammarAccess.getProjectPlanAccess().getProjectsProjectParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_projects_10_0=ruleProject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"projects",
            	    							lv_projects_10_0,
            	    							"de.fraunhofer.iem.ProjectPlanning.Project");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalProjectPlanning.g:211:4: ( (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProjectPlanning.g:212:5: (otherlv_11= ',' )+ ( (lv_projects_12_0= ruleProject ) )
            	    {
            	    // InternalProjectPlanning.g:212:5: (otherlv_11= ',' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==12) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalProjectPlanning.g:213:6: otherlv_11= ','
            	    	    {
            	    	    otherlv_11=(Token)match(input,12,FOLLOW_4); 

            	    	    						newLeafNode(otherlv_11, grammarAccess.getProjectPlanAccess().getCommaKeyword_2_2_0());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    // InternalProjectPlanning.g:218:5: ( (lv_projects_12_0= ruleProject ) )
            	    // InternalProjectPlanning.g:219:6: (lv_projects_12_0= ruleProject )
            	    {
            	    // InternalProjectPlanning.g:219:6: (lv_projects_12_0= ruleProject )
            	    // InternalProjectPlanning.g:220:7: lv_projects_12_0= ruleProject
            	    {

            	    							newCompositeNode(grammarAccess.getProjectPlanAccess().getProjectsProjectParserRuleCall_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_projects_12_0=ruleProject();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    							}
            	    							add(
            	    								current,
            	    								"projects",
            	    								lv_projects_12_0,
            	    								"de.fraunhofer.iem.ProjectPlanning.Project");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            // InternalProjectPlanning.g:239:3: ( (lv_ratings_13_0= ruleRating ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==22) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalProjectPlanning.g:240:4: (lv_ratings_13_0= ruleRating )
            	    {
            	    // InternalProjectPlanning.g:240:4: (lv_ratings_13_0= ruleRating )
            	    // InternalProjectPlanning.g:241:5: lv_ratings_13_0= ruleRating
            	    {

            	    					newCompositeNode(grammarAccess.getProjectPlanAccess().getRatingsRatingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_ratings_13_0=ruleRating();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ratings",
            	    						lv_ratings_13_0,
            	    						"de.fraunhofer.iem.ProjectPlanning.Rating");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalProjectPlanning.g:258:3: ( (lv_assignments_14_0= ruleAssignment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProjectPlanning.g:259:4: (lv_assignments_14_0= ruleAssignment )
            	    {
            	    // InternalProjectPlanning.g:259:4: (lv_assignments_14_0= ruleAssignment )
            	    // InternalProjectPlanning.g:260:5: lv_assignments_14_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getProjectPlanAccess().getAssignmentsAssignmentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_assignments_14_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectPlanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignments",
            	    						lv_assignments_14_0,
            	    						"de.fraunhofer.iem.ProjectPlanning.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectPlan"


    // $ANTLR start "entryRuleProject"
    // InternalProjectPlanning.g:281:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalProjectPlanning.g:281:48: (iv_ruleProject= ruleProject EOF )
            // InternalProjectPlanning.g:282:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalProjectPlanning.g:288:1: ruleProject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) ) ) (otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_requiresResources_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalProjectPlanning.g:294:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) ) ) (otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' ) )
            // InternalProjectPlanning.g:295:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) ) ) (otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' )
            {
            // InternalProjectPlanning.g:295:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) ) ) (otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';' )
            // InternalProjectPlanning.g:296:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) ) ) (otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= ';'
            {
            // InternalProjectPlanning.g:296:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectPlanning.g:297:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectPlanning.g:297:4: (lv_name_0_0= RULE_ID )
            // InternalProjectPlanning.g:298:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getColonKeyword_1());
            		
            // InternalProjectPlanning.g:318:3: (otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) ) )
            // InternalProjectPlanning.g:319:4: otherlv_2= 'requiresResources:' ( (lv_requiresResources_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            				newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getRequiresResourcesKeyword_2_0());
            			
            // InternalProjectPlanning.g:323:4: ( (lv_requiresResources_3_0= RULE_INT ) )
            // InternalProjectPlanning.g:324:5: (lv_requiresResources_3_0= RULE_INT )
            {
            // InternalProjectPlanning.g:324:5: (lv_requiresResources_3_0= RULE_INT )
            // InternalProjectPlanning.g:325:6: lv_requiresResources_3_0= RULE_INT
            {
            lv_requiresResources_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            						newLeafNode(lv_requiresResources_3_0, grammarAccess.getProjectAccess().getRequiresResourcesINTTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getProjectRule());
            						}
            						setWithLastConsumed(
            							current,
            							"requiresResources",
            							lv_requiresResources_3_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            // InternalProjectPlanning.g:342:3: (otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProjectPlanning.g:343:4: otherlv_4= 'requiresCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getRequiresCapabilitiesKeyword_3_0());
                    			
                    // InternalProjectPlanning.g:347:4: ( (otherlv_5= RULE_ID ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalProjectPlanning.g:348:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalProjectPlanning.g:348:5: (otherlv_5= RULE_ID )
                    	    // InternalProjectPlanning.g:349:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getProjectRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_3); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getRequiresCapabilitiesCapabilityCrossReference_3_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalProjectPlanning.g:360:4: ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==12) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalProjectPlanning.g:361:5: (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    // InternalProjectPlanning.g:361:5: (otherlv_6= ',' )+
                    	    int cnt13=0;
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( (LA13_0==12) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalProjectPlanning.g:362:6: otherlv_6= ','
                    	    	    {
                    	    	    otherlv_6=(Token)match(input,12,FOLLOW_4); 

                    	    	    						newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getCommaKeyword_3_2_0());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt13 >= 1 ) break loop13;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(13, input);
                    	                throw eee;
                    	        }
                    	        cnt13++;
                    	    } while (true);

                    	    // InternalProjectPlanning.g:367:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalProjectPlanning.g:368:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalProjectPlanning.g:368:6: (otherlv_7= RULE_ID )
                    	    // InternalProjectPlanning.g:369:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProjectRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getRequiresCapabilitiesCapabilityCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEmployee"
    // InternalProjectPlanning.g:390:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalProjectPlanning.g:390:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalProjectPlanning.g:391:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalProjectPlanning.g:397:1: ruleEmployee returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) ) ) (otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )* )? otherlv_12= ';' ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_hasResource_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_ratings_9_0 = null;

        EObject lv_ratings_11_0 = null;



        	enterRule();

        try {
            // InternalProjectPlanning.g:403:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) ) ) (otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )* )? otherlv_12= ';' ) )
            // InternalProjectPlanning.g:404:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) ) ) (otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )* )? otherlv_12= ';' )
            {
            // InternalProjectPlanning.g:404:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) ) ) (otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )* )? otherlv_12= ';' )
            // InternalProjectPlanning.g:405:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' (otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) ) ) (otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )? (otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )* )? otherlv_12= ';'
            {
            // InternalProjectPlanning.g:405:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectPlanning.g:406:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectPlanning.g:406:4: (lv_name_0_0= RULE_ID )
            // InternalProjectPlanning.g:407:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEmployeeAccess().getColonKeyword_1());
            		
            // InternalProjectPlanning.g:427:3: (otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) ) )
            // InternalProjectPlanning.g:428:4: otherlv_2= 'hasResources:' ( (lv_hasResource_3_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            				newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getHasResourcesKeyword_2_0());
            			
            // InternalProjectPlanning.g:432:4: ( (lv_hasResource_3_0= RULE_INT ) )
            // InternalProjectPlanning.g:433:5: (lv_hasResource_3_0= RULE_INT )
            {
            // InternalProjectPlanning.g:433:5: (lv_hasResource_3_0= RULE_INT )
            // InternalProjectPlanning.g:434:6: lv_hasResource_3_0= RULE_INT
            {
            lv_hasResource_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            						newLeafNode(lv_hasResource_3_0, grammarAccess.getEmployeeAccess().getHasResourceINTTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEmployeeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"hasResource",
            							lv_hasResource_3_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            // InternalProjectPlanning.g:451:3: (otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProjectPlanning.g:452:4: otherlv_4= 'hasCapabilities:' ( (otherlv_5= RULE_ID ) )* ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getHasCapabilitiesKeyword_3_0());
                    			
                    // InternalProjectPlanning.g:456:4: ( (otherlv_5= RULE_ID ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalProjectPlanning.g:457:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalProjectPlanning.g:457:5: (otherlv_5= RULE_ID )
                    	    // InternalProjectPlanning.g:458:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEmployeeRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getEmployeeAccess().getHasCapabilitiesCapabilityCrossReference_3_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalProjectPlanning.g:469:4: ( (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==12) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalProjectPlanning.g:470:5: (otherlv_6= ',' )+ ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    // InternalProjectPlanning.g:470:5: (otherlv_6= ',' )+
                    	    int cnt17=0;
                    	    loop17:
                    	    do {
                    	        int alt17=2;
                    	        int LA17_0 = input.LA(1);

                    	        if ( (LA17_0==12) ) {
                    	            alt17=1;
                    	        }


                    	        switch (alt17) {
                    	    	case 1 :
                    	    	    // InternalProjectPlanning.g:471:6: otherlv_6= ','
                    	    	    {
                    	    	    otherlv_6=(Token)match(input,12,FOLLOW_4); 

                    	    	    						newLeafNode(otherlv_6, grammarAccess.getEmployeeAccess().getCommaKeyword_3_2_0());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt17 >= 1 ) break loop17;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(17, input);
                    	                throw eee;
                    	        }
                    	        cnt17++;
                    	    } while (true);

                    	    // InternalProjectPlanning.g:476:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalProjectPlanning.g:477:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalProjectPlanning.g:477:6: (otherlv_7= RULE_ID )
                    	    // InternalProjectPlanning.g:478:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEmployeeRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getEmployeeAccess().getHasCapabilitiesCapabilityCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProjectPlanning.g:491:3: (otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProjectPlanning.g:492:4: otherlv_8= 'ratesCapabilities:' ( (lv_ratings_9_0= ruleRating ) )* ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEmployeeAccess().getRatesCapabilitiesKeyword_4_0());
                    			
                    // InternalProjectPlanning.g:496:4: ( (lv_ratings_9_0= ruleRating ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalProjectPlanning.g:497:5: (lv_ratings_9_0= ruleRating )
                    	    {
                    	    // InternalProjectPlanning.g:497:5: (lv_ratings_9_0= ruleRating )
                    	    // InternalProjectPlanning.g:498:6: lv_ratings_9_0= ruleRating
                    	    {

                    	    						newCompositeNode(grammarAccess.getEmployeeAccess().getRatingsRatingParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_ratings_9_0=ruleRating();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEmployeeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ratings",
                    	    							lv_ratings_9_0,
                    	    							"de.fraunhofer.iem.ProjectPlanning.Rating");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // InternalProjectPlanning.g:515:4: ( (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==12) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalProjectPlanning.g:516:5: (otherlv_10= ',' )+ ( (lv_ratings_11_0= ruleRating ) )
                    	    {
                    	    // InternalProjectPlanning.g:516:5: (otherlv_10= ',' )+
                    	    int cnt21=0;
                    	    loop21:
                    	    do {
                    	        int alt21=2;
                    	        int LA21_0 = input.LA(1);

                    	        if ( (LA21_0==12) ) {
                    	            alt21=1;
                    	        }


                    	        switch (alt21) {
                    	    	case 1 :
                    	    	    // InternalProjectPlanning.g:517:6: otherlv_10= ','
                    	    	    {
                    	    	    otherlv_10=(Token)match(input,12,FOLLOW_4); 

                    	    	    						newLeafNode(otherlv_10, grammarAccess.getEmployeeAccess().getCommaKeyword_4_2_0());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt21 >= 1 ) break loop21;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(21, input);
                    	                throw eee;
                    	        }
                    	        cnt21++;
                    	    } while (true);

                    	    // InternalProjectPlanning.g:522:5: ( (lv_ratings_11_0= ruleRating ) )
                    	    // InternalProjectPlanning.g:523:6: (lv_ratings_11_0= ruleRating )
                    	    {
                    	    // InternalProjectPlanning.g:523:6: (lv_ratings_11_0= ruleRating )
                    	    // InternalProjectPlanning.g:524:7: lv_ratings_11_0= ruleRating
                    	    {

                    	    							newCompositeNode(grammarAccess.getEmployeeAccess().getRatingsRatingParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_ratings_11_0=ruleRating();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEmployeeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ratings",
                    	    								lv_ratings_11_0,
                    	    								"de.fraunhofer.iem.ProjectPlanning.Rating");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEmployeeAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleCapability"
    // InternalProjectPlanning.g:551:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // InternalProjectPlanning.g:551:51: (iv_ruleCapability= ruleCapability EOF )
            // InternalProjectPlanning.g:552:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalProjectPlanning.g:558:1: ruleCapability returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalProjectPlanning.g:564:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalProjectPlanning.g:565:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalProjectPlanning.g:565:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectPlanning.g:566:3: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectPlanning.g:566:3: (lv_name_0_0= RULE_ID )
            // InternalProjectPlanning.g:567:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCapabilityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleRating"
    // InternalProjectPlanning.g:586:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalProjectPlanning.g:586:47: (iv_ruleRating= ruleRating EOF )
            // InternalProjectPlanning.g:587:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // InternalProjectPlanning.g:593:1: ruleRating returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rating_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rating_2_0=null;


        	enterRule();

        try {
            // InternalProjectPlanning.g:599:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rating_2_0= RULE_INT ) ) ) )
            // InternalProjectPlanning.g:600:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rating_2_0= RULE_INT ) ) )
            {
            // InternalProjectPlanning.g:600:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rating_2_0= RULE_INT ) ) )
            // InternalProjectPlanning.g:601:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rating_2_0= RULE_INT ) )
            {
            // InternalProjectPlanning.g:601:3: ( (otherlv_0= RULE_ID ) )
            // InternalProjectPlanning.g:602:4: (otherlv_0= RULE_ID )
            {
            // InternalProjectPlanning.g:602:4: (otherlv_0= RULE_ID )
            // InternalProjectPlanning.g:603:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getCapabilityCapabilityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getEqualsSignKeyword_1());
            		
            // InternalProjectPlanning.g:618:3: ( (lv_rating_2_0= RULE_INT ) )
            // InternalProjectPlanning.g:619:4: (lv_rating_2_0= RULE_INT )
            {
            // InternalProjectPlanning.g:619:4: (lv_rating_2_0= RULE_INT )
            // InternalProjectPlanning.g:620:5: lv_rating_2_0= RULE_INT
            {
            lv_rating_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_rating_2_0, grammarAccess.getRatingAccess().getRatingINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rating",
            						lv_rating_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleAssignment"
    // InternalProjectPlanning.g:640:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalProjectPlanning.g:640:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalProjectPlanning.g:641:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalProjectPlanning.g:647:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalProjectPlanning.g:653:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalProjectPlanning.g:654:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalProjectPlanning.g:654:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalProjectPlanning.g:655:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalProjectPlanning.g:655:3: ( (otherlv_0= RULE_ID ) )
            // InternalProjectPlanning.g:656:4: (otherlv_0= RULE_ID )
            {
            // InternalProjectPlanning.g:656:4: (otherlv_0= RULE_ID )
            // InternalProjectPlanning.g:657:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getProjectProjectCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getAssignedKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getToKeyword_3());
            		
            // InternalProjectPlanning.g:680:3: ( (otherlv_4= RULE_ID ) )
            // InternalProjectPlanning.g:681:4: (otherlv_4= RULE_ID )
            {
            // InternalProjectPlanning.g:681:4: (otherlv_4= RULE_ID )
            // InternalProjectPlanning.g:682:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEmployeeEmployeeCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAssignmentAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000203010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000203000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});

}