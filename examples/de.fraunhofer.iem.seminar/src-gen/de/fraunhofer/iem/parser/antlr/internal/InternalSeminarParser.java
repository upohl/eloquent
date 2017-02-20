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
import de.fraunhofer.iem.services.SeminarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeminarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Seminar'", "'{'", "'supervisors:'", "','", "';'", "'students:'", "'topics:'", "'}'", "'wants'", "'rates'", "'with'", "'supervises'", "'is'", "'assigned'", "'to'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_REAL=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSeminarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeminarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeminarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeminar.g"; }



     	private SeminarGrammarAccess grammarAccess;

        public InternalSeminarParser(TokenStream input, SeminarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Seminar";
       	}

       	@Override
       	protected SeminarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSeminar"
    // InternalSeminar.g:64:1: entryRuleSeminar returns [EObject current=null] : iv_ruleSeminar= ruleSeminar EOF ;
    public final EObject entryRuleSeminar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeminar = null;


        try {
            // InternalSeminar.g:64:48: (iv_ruleSeminar= ruleSeminar EOF )
            // InternalSeminar.g:65:2: iv_ruleSeminar= ruleSeminar EOF
            {
             newCompositeNode(grammarAccess.getSeminarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeminar=ruleSeminar();

            state._fsp--;

             current =iv_ruleSeminar; 
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
    // $ANTLR end "entryRuleSeminar"


    // $ANTLR start "ruleSeminar"
    // InternalSeminar.g:71:1: ruleSeminar returns [EObject current=null] : (otherlv_0= 'Seminar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';' )* (otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';' )* (otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';' )* ( (lv_preferences_18_0= rulePreference ) )* ( (lv_ratings_19_0= ruleRating ) )* ( (lv_supervises_20_0= ruleSupervise ) )* ( (lv_assignments_21_0= ruleAssignment ) )* otherlv_22= '}' ) ;
    public final EObject ruleSeminar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        EObject lv_supervisors_4_0 = null;

        EObject lv_supervisors_6_0 = null;

        EObject lv_students_9_0 = null;

        EObject lv_students_11_0 = null;

        EObject lv_topics_14_0 = null;

        EObject lv_topics_16_0 = null;

        EObject lv_preferences_18_0 = null;

        EObject lv_ratings_19_0 = null;

        EObject lv_supervises_20_0 = null;

        EObject lv_assignments_21_0 = null;



        	enterRule();

        try {
            // InternalSeminar.g:77:2: ( (otherlv_0= 'Seminar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';' )* (otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';' )* (otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';' )* ( (lv_preferences_18_0= rulePreference ) )* ( (lv_ratings_19_0= ruleRating ) )* ( (lv_supervises_20_0= ruleSupervise ) )* ( (lv_assignments_21_0= ruleAssignment ) )* otherlv_22= '}' ) )
            // InternalSeminar.g:78:2: (otherlv_0= 'Seminar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';' )* (otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';' )* (otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';' )* ( (lv_preferences_18_0= rulePreference ) )* ( (lv_ratings_19_0= ruleRating ) )* ( (lv_supervises_20_0= ruleSupervise ) )* ( (lv_assignments_21_0= ruleAssignment ) )* otherlv_22= '}' )
            {
            // InternalSeminar.g:78:2: (otherlv_0= 'Seminar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';' )* (otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';' )* (otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';' )* ( (lv_preferences_18_0= rulePreference ) )* ( (lv_ratings_19_0= ruleRating ) )* ( (lv_supervises_20_0= ruleSupervise ) )* ( (lv_assignments_21_0= ruleAssignment ) )* otherlv_22= '}' )
            // InternalSeminar.g:79:3: otherlv_0= 'Seminar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';' )* (otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';' )* (otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';' )* ( (lv_preferences_18_0= rulePreference ) )* ( (lv_ratings_19_0= ruleRating ) )* ( (lv_supervises_20_0= ruleSupervise ) )* ( (lv_assignments_21_0= ruleAssignment ) )* otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSeminarAccess().getSeminarKeyword_0());
            		
            // InternalSeminar.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSeminar.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSeminar.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSeminar.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSeminarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeminarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSeminarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSeminar.g:105:3: (otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeminar.g:106:4: otherlv_3= 'supervisors:' ( (lv_supervisors_4_0= ruleSupervisor ) )* ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )* otherlv_7= ';'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSeminarAccess().getSupervisorsKeyword_3_0());
            	    			
            	    // InternalSeminar.g:110:4: ( (lv_supervisors_4_0= ruleSupervisor ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalSeminar.g:111:5: (lv_supervisors_4_0= ruleSupervisor )
            	    	    {
            	    	    // InternalSeminar.g:111:5: (lv_supervisors_4_0= ruleSupervisor )
            	    	    // InternalSeminar.g:112:6: lv_supervisors_4_0= ruleSupervisor
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_3_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_supervisors_4_0=ruleSupervisor();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"supervisors",
            	    	    							lv_supervisors_4_0,
            	    	    							"de.fraunhofer.iem.Seminar.Supervisor");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // InternalSeminar.g:129:4: ( (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalSeminar.g:130:5: (otherlv_5= ',' )+ ( (lv_supervisors_6_0= ruleSupervisor ) )
            	    	    {
            	    	    // InternalSeminar.g:130:5: (otherlv_5= ',' )+
            	    	    int cnt2=0;
            	    	    loop2:
            	    	    do {
            	    	        int alt2=2;
            	    	        int LA2_0 = input.LA(1);

            	    	        if ( (LA2_0==15) ) {
            	    	            alt2=1;
            	    	        }


            	    	        switch (alt2) {
            	    	    	case 1 :
            	    	    	    // InternalSeminar.g:131:6: otherlv_5= ','
            	    	    	    {
            	    	    	    otherlv_5=(Token)match(input,15,FOLLOW_7); 

            	    	    	    						newLeafNode(otherlv_5, grammarAccess.getSeminarAccess().getCommaKeyword_3_2_0());
            	    	    	    					

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

            	    	    // InternalSeminar.g:136:5: ( (lv_supervisors_6_0= ruleSupervisor ) )
            	    	    // InternalSeminar.g:137:6: (lv_supervisors_6_0= ruleSupervisor )
            	    	    {
            	    	    // InternalSeminar.g:137:6: (lv_supervisors_6_0= ruleSupervisor )
            	    	    // InternalSeminar.g:138:7: lv_supervisors_6_0= ruleSupervisor
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_3_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_supervisors_6_0=ruleSupervisor();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"supervisors",
            	    	    								lv_supervisors_6_0,
            	    	    								"de.fraunhofer.iem.Seminar.Supervisor");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSeminarAccess().getSemicolonKeyword_3_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSeminar.g:161:3: (otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeminar.g:162:4: otherlv_8= 'students:' ( (lv_students_9_0= ruleStudent ) )* ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )* otherlv_12= ';'
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSeminarAccess().getStudentsKeyword_4_0());
            	    			
            	    // InternalSeminar.g:166:4: ( (lv_students_9_0= ruleStudent ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalSeminar.g:167:5: (lv_students_9_0= ruleStudent )
            	    	    {
            	    	    // InternalSeminar.g:167:5: (lv_students_9_0= ruleStudent )
            	    	    // InternalSeminar.g:168:6: lv_students_9_0= ruleStudent
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_4_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_students_9_0=ruleStudent();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"students",
            	    	    							lv_students_9_0,
            	    	    							"de.fraunhofer.iem.Seminar.Student");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // InternalSeminar.g:185:4: ( (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==15) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalSeminar.g:186:5: (otherlv_10= ',' )+ ( (lv_students_11_0= ruleStudent ) )
            	    	    {
            	    	    // InternalSeminar.g:186:5: (otherlv_10= ',' )+
            	    	    int cnt6=0;
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( (LA6_0==15) ) {
            	    	            alt6=1;
            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // InternalSeminar.g:187:6: otherlv_10= ','
            	    	    	    {
            	    	    	    otherlv_10=(Token)match(input,15,FOLLOW_7); 

            	    	    	    						newLeafNode(otherlv_10, grammarAccess.getSeminarAccess().getCommaKeyword_4_2_0());
            	    	    	    					

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt6 >= 1 ) break loop6;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(6, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt6++;
            	    	    } while (true);

            	    	    // InternalSeminar.g:192:5: ( (lv_students_11_0= ruleStudent ) )
            	    	    // InternalSeminar.g:193:6: (lv_students_11_0= ruleStudent )
            	    	    {
            	    	    // InternalSeminar.g:193:6: (lv_students_11_0= ruleStudent )
            	    	    // InternalSeminar.g:194:7: lv_students_11_0= ruleStudent
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_students_11_0=ruleStudent();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"students",
            	    	    								lv_students_11_0,
            	    	    								"de.fraunhofer.iem.Seminar.Student");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSeminarAccess().getSemicolonKeyword_4_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSeminar.g:217:3: (otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeminar.g:218:4: otherlv_13= 'topics:' ( (lv_topics_14_0= ruleTopic ) )* ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )* otherlv_17= ';'
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSeminarAccess().getTopicsKeyword_5_0());
            	    			
            	    // InternalSeminar.g:222:4: ( (lv_topics_14_0= ruleTopic ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalSeminar.g:223:5: (lv_topics_14_0= ruleTopic )
            	    	    {
            	    	    // InternalSeminar.g:223:5: (lv_topics_14_0= ruleTopic )
            	    	    // InternalSeminar.g:224:6: lv_topics_14_0= ruleTopic
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_5_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_topics_14_0=ruleTopic();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"topics",
            	    	    							lv_topics_14_0,
            	    	    							"de.fraunhofer.iem.Seminar.Topic");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    // InternalSeminar.g:241:4: ( (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==15) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalSeminar.g:242:5: (otherlv_15= ',' )+ ( (lv_topics_16_0= ruleTopic ) )
            	    	    {
            	    	    // InternalSeminar.g:242:5: (otherlv_15= ',' )+
            	    	    int cnt10=0;
            	    	    loop10:
            	    	    do {
            	    	        int alt10=2;
            	    	        int LA10_0 = input.LA(1);

            	    	        if ( (LA10_0==15) ) {
            	    	            alt10=1;
            	    	        }


            	    	        switch (alt10) {
            	    	    	case 1 :
            	    	    	    // InternalSeminar.g:243:6: otherlv_15= ','
            	    	    	    {
            	    	    	    otherlv_15=(Token)match(input,15,FOLLOW_7); 

            	    	    	    						newLeafNode(otherlv_15, grammarAccess.getSeminarAccess().getCommaKeyword_5_2_0());
            	    	    	    					

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt10 >= 1 ) break loop10;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(10, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt10++;
            	    	    } while (true);

            	    	    // InternalSeminar.g:248:5: ( (lv_topics_16_0= ruleTopic ) )
            	    	    // InternalSeminar.g:249:6: (lv_topics_16_0= ruleTopic )
            	    	    {
            	    	    // InternalSeminar.g:249:6: (lv_topics_16_0= ruleTopic )
            	    	    // InternalSeminar.g:250:7: lv_topics_16_0= ruleTopic
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_5_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_topics_16_0=ruleTopic();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"topics",
            	    	    								lv_topics_16_0,
            	    	    								"de.fraunhofer.iem.Seminar.Topic");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_17, grammarAccess.getSeminarAccess().getSemicolonKeyword_5_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSeminar.g:273:3: ( (lv_preferences_18_0= rulePreference ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==20) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeminar.g:274:4: (lv_preferences_18_0= rulePreference )
            	    {
            	    // InternalSeminar.g:274:4: (lv_preferences_18_0= rulePreference )
            	    // InternalSeminar.g:275:5: lv_preferences_18_0= rulePreference
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getPreferencesPreferenceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_preferences_18_0=rulePreference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"preferences",
            	    						lv_preferences_18_0,
            	    						"de.fraunhofer.iem.Seminar.Preference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSeminar.g:292:3: ( (lv_ratings_19_0= ruleRating ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==21) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeminar.g:293:4: (lv_ratings_19_0= ruleRating )
            	    {
            	    // InternalSeminar.g:293:4: (lv_ratings_19_0= ruleRating )
            	    // InternalSeminar.g:294:5: lv_ratings_19_0= ruleRating
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getRatingsRatingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ratings_19_0=ruleRating();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ratings",
            	    						lv_ratings_19_0,
            	    						"de.fraunhofer.iem.Seminar.Rating");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalSeminar.g:311:3: ( (lv_supervises_20_0= ruleSupervise ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==23) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeminar.g:312:4: (lv_supervises_20_0= ruleSupervise )
            	    {
            	    // InternalSeminar.g:312:4: (lv_supervises_20_0= ruleSupervise )
            	    // InternalSeminar.g:313:5: lv_supervises_20_0= ruleSupervise
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_supervises_20_0=ruleSupervise();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"supervises",
            	    						lv_supervises_20_0,
            	    						"de.fraunhofer.iem.Seminar.Supervise");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSeminar.g:330:3: ( (lv_assignments_21_0= ruleAssignment ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeminar.g:331:4: (lv_assignments_21_0= ruleAssignment )
            	    {
            	    // InternalSeminar.g:331:4: (lv_assignments_21_0= ruleAssignment )
            	    // InternalSeminar.g:332:5: lv_assignments_21_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_assignments_21_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignments",
            	    						lv_assignments_21_0,
            	    						"de.fraunhofer.iem.Seminar.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getSeminarAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleSeminar"


    // $ANTLR start "entryRuleSupervisor"
    // InternalSeminar.g:357:1: entryRuleSupervisor returns [EObject current=null] : iv_ruleSupervisor= ruleSupervisor EOF ;
    public final EObject entryRuleSupervisor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervisor = null;


        try {
            // InternalSeminar.g:357:51: (iv_ruleSupervisor= ruleSupervisor EOF )
            // InternalSeminar.g:358:2: iv_ruleSupervisor= ruleSupervisor EOF
            {
             newCompositeNode(grammarAccess.getSupervisorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupervisor=ruleSupervisor();

            state._fsp--;

             current =iv_ruleSupervisor; 
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
    // $ANTLR end "entryRuleSupervisor"


    // $ANTLR start "ruleSupervisor"
    // InternalSeminar.g:364:1: ruleSupervisor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSupervisor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeminar.g:370:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeminar.g:371:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeminar.g:371:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeminar.g:372:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeminar.g:372:3: (lv_name_0_0= RULE_ID )
            // InternalSeminar.g:373:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSupervisorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSupervisorRule());
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
    // $ANTLR end "ruleSupervisor"


    // $ANTLR start "entryRuleStudent"
    // InternalSeminar.g:392:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalSeminar.g:392:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalSeminar.g:393:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalSeminar.g:399:1: ruleStudent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeminar.g:405:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeminar.g:406:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeminar.g:406:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeminar.g:407:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeminar.g:407:3: (lv_name_0_0= RULE_ID )
            // InternalSeminar.g:408:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStudentAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStudentRule());
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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTopic"
    // InternalSeminar.g:427:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalSeminar.g:427:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalSeminar.g:428:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalSeminar.g:434:1: ruleTopic returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeminar.g:440:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeminar.g:441:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeminar.g:441:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeminar.g:442:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeminar.g:442:3: (lv_name_0_0= RULE_ID )
            // InternalSeminar.g:443:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTopicRule());
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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRulePreference"
    // InternalSeminar.g:462:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // InternalSeminar.g:462:51: (iv_rulePreference= rulePreference EOF )
            // InternalSeminar.g:463:2: iv_rulePreference= rulePreference EOF
            {
             newCompositeNode(grammarAccess.getPreferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreference=rulePreference();

            state._fsp--;

             current =iv_rulePreference; 
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
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalSeminar.g:469:1: rulePreference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'wants' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSeminar.g:475:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'wants' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalSeminar.g:476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'wants' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalSeminar.g:476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'wants' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalSeminar.g:477:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'wants' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';'
            {
            // InternalSeminar.g:477:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:478:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:478:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:479:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getPreferenceAccess().getStudentStudentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPreferenceAccess().getWantsKeyword_1());
            		
            // InternalSeminar.g:494:3: ( (otherlv_2= RULE_ID ) )
            // InternalSeminar.g:495:4: (otherlv_2= RULE_ID )
            {
            // InternalSeminar.g:495:4: (otherlv_2= RULE_ID )
            // InternalSeminar.g:496:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_2_0());
            				

            }


            }

            // InternalSeminar.g:507:3: ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSeminar.g:508:4: (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) )
            	    {
            	    // InternalSeminar.g:508:4: (otherlv_3= ',' )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==15) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalSeminar.g:509:5: otherlv_3= ','
            	    	    {
            	    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getPreferenceAccess().getCommaKeyword_3_0());
            	    	    				

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

            	    // InternalSeminar.g:514:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSeminar.g:515:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSeminar.g:515:5: (otherlv_4= RULE_ID )
            	    // InternalSeminar.g:516:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPreferenceRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_4, grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPreferenceAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleRating"
    // InternalSeminar.g:536:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalSeminar.g:536:47: (iv_ruleRating= ruleRating EOF )
            // InternalSeminar.g:537:2: iv_ruleRating= ruleRating EOF
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
    // InternalSeminar.g:543:1: ruleRating returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rating_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSeminar.g:549:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' ) )
            // InternalSeminar.g:550:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' )
            {
            // InternalSeminar.g:550:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' )
            // InternalSeminar.g:551:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';'
            {
            // InternalSeminar.g:551:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:552:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:552:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:553:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getStudentStudentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getRatesKeyword_1());
            		
            // InternalSeminar.g:568:3: ( (otherlv_2= RULE_ID ) )
            // InternalSeminar.g:569:4: (otherlv_2= RULE_ID )
            {
            // InternalSeminar.g:569:4: (otherlv_2= RULE_ID )
            // InternalSeminar.g:570:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getTopicTopicCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getWithKeyword_3());
            		
            // InternalSeminar.g:585:3: ( (lv_rating_4_0= RULE_REAL ) )
            // InternalSeminar.g:586:4: (lv_rating_4_0= RULE_REAL )
            {
            // InternalSeminar.g:586:4: (lv_rating_4_0= RULE_REAL )
            // InternalSeminar.g:587:5: lv_rating_4_0= RULE_REAL
            {
            lv_rating_4_0=(Token)match(input,RULE_REAL,FOLLOW_16); 

            					newLeafNode(lv_rating_4_0, grammarAccess.getRatingAccess().getRatingREALTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rating",
            						lv_rating_4_0,
            						"de.fraunhofer.iem.Seminar.REAL");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleSupervise"
    // InternalSeminar.g:611:1: entryRuleSupervise returns [EObject current=null] : iv_ruleSupervise= ruleSupervise EOF ;
    public final EObject entryRuleSupervise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervise = null;


        try {
            // InternalSeminar.g:611:50: (iv_ruleSupervise= ruleSupervise EOF )
            // InternalSeminar.g:612:2: iv_ruleSupervise= ruleSupervise EOF
            {
             newCompositeNode(grammarAccess.getSuperviseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupervise=ruleSupervise();

            state._fsp--;

             current =iv_ruleSupervise; 
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
    // $ANTLR end "entryRuleSupervise"


    // $ANTLR start "ruleSupervise"
    // InternalSeminar.g:618:1: ruleSupervise returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleSupervise() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSeminar.g:624:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSeminar.g:625:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSeminar.g:625:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalSeminar.g:626:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSeminar.g:626:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:627:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:627:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:628:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperviseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getSuperviseAccess().getSupervisorSupervisorCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperviseAccess().getSupervisesKeyword_1());
            		
            // InternalSeminar.g:643:3: ( (otherlv_2= RULE_ID ) )
            // InternalSeminar.g:644:4: (otherlv_2= RULE_ID )
            {
            // InternalSeminar.g:644:4: (otherlv_2= RULE_ID )
            // InternalSeminar.g:645:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperviseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getSuperviseAccess().getTopicTopicCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSuperviseAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleSupervise"


    // $ANTLR start "entryRuleAssignment"
    // InternalSeminar.g:664:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalSeminar.g:664:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSeminar.g:665:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalSeminar.g:671:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalSeminar.g:677:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSeminar.g:678:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSeminar.g:678:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalSeminar.g:679:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalSeminar.g:679:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:680:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:680:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:681:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getStudentStudentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getAssignedKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getToKeyword_3());
            		
            // InternalSeminar.g:704:3: ( (otherlv_4= RULE_ID ) )
            // InternalSeminar.g:705:4: (otherlv_4= RULE_ID )
            {
            // InternalSeminar.g:705:4: (otherlv_4= RULE_ID )
            // InternalSeminar.g:706:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getTopicTopicCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000E4010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});

}