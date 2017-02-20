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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'supervisors:'", "','", "';'", "'students:'", "'topics:'", "'likes'", "'rates'", "'with'", "'supervises'", "'is'", "'assigned'", "'to'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
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
    // InternalSeminar.g:71:1: ruleSeminar returns [EObject current=null] : ( (otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';' )* (otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';' )* (otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';' )* ( (lv_preferences_15_0= rulePreference ) )* ( (lv_ratings_16_0= ruleRating ) )* ( (lv_supervises_17_0= ruleSupervise ) )* ( (lv_assignments_18_0= ruleAssignment ) )* ) ;
    public final EObject ruleSeminar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_supervisors_1_0 = null;

        EObject lv_supervisors_3_0 = null;

        EObject lv_students_6_0 = null;

        EObject lv_students_8_0 = null;

        EObject lv_topics_11_0 = null;

        EObject lv_topics_13_0 = null;

        EObject lv_preferences_15_0 = null;

        EObject lv_ratings_16_0 = null;

        EObject lv_supervises_17_0 = null;

        EObject lv_assignments_18_0 = null;



        	enterRule();

        try {
            // InternalSeminar.g:77:2: ( ( (otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';' )* (otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';' )* (otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';' )* ( (lv_preferences_15_0= rulePreference ) )* ( (lv_ratings_16_0= ruleRating ) )* ( (lv_supervises_17_0= ruleSupervise ) )* ( (lv_assignments_18_0= ruleAssignment ) )* ) )
            // InternalSeminar.g:78:2: ( (otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';' )* (otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';' )* (otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';' )* ( (lv_preferences_15_0= rulePreference ) )* ( (lv_ratings_16_0= ruleRating ) )* ( (lv_supervises_17_0= ruleSupervise ) )* ( (lv_assignments_18_0= ruleAssignment ) )* )
            {
            // InternalSeminar.g:78:2: ( (otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';' )* (otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';' )* (otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';' )* ( (lv_preferences_15_0= rulePreference ) )* ( (lv_ratings_16_0= ruleRating ) )* ( (lv_supervises_17_0= ruleSupervise ) )* ( (lv_assignments_18_0= ruleAssignment ) )* )
            // InternalSeminar.g:79:3: (otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';' )* (otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';' )* (otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';' )* ( (lv_preferences_15_0= rulePreference ) )* ( (lv_ratings_16_0= ruleRating ) )* ( (lv_supervises_17_0= ruleSupervise ) )* ( (lv_assignments_18_0= ruleAssignment ) )*
            {
            // InternalSeminar.g:79:3: (otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeminar.g:80:4: otherlv_0= 'supervisors:' ( (lv_supervisors_1_0= ruleSupervisor ) )* ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )* otherlv_4= ';'
            	    {
            	    otherlv_0=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_0, grammarAccess.getSeminarAccess().getSupervisorsKeyword_0_0());
            	    			
            	    // InternalSeminar.g:84:4: ( (lv_supervisors_1_0= ruleSupervisor ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalSeminar.g:85:5: (lv_supervisors_1_0= ruleSupervisor )
            	    	    {
            	    	    // InternalSeminar.g:85:5: (lv_supervisors_1_0= ruleSupervisor )
            	    	    // InternalSeminar.g:86:6: lv_supervisors_1_0= ruleSupervisor
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_0_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_supervisors_1_0=ruleSupervisor();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"supervisors",
            	    	    							lv_supervisors_1_0,
            	    	    							"de.fraunhofer.iem.Seminar.Supervisor");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // InternalSeminar.g:103:4: ( (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==13) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalSeminar.g:104:5: (otherlv_2= ',' )+ ( (lv_supervisors_3_0= ruleSupervisor ) )
            	    	    {
            	    	    // InternalSeminar.g:104:5: (otherlv_2= ',' )+
            	    	    int cnt2=0;
            	    	    loop2:
            	    	    do {
            	    	        int alt2=2;
            	    	        int LA2_0 = input.LA(1);

            	    	        if ( (LA2_0==13) ) {
            	    	            alt2=1;
            	    	        }


            	    	        switch (alt2) {
            	    	    	case 1 :
            	    	    	    // InternalSeminar.g:105:6: otherlv_2= ','
            	    	    	    {
            	    	    	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    	    	    						newLeafNode(otherlv_2, grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0());
            	    	    	    					

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

            	    	    // InternalSeminar.g:110:5: ( (lv_supervisors_3_0= ruleSupervisor ) )
            	    	    // InternalSeminar.g:111:6: (lv_supervisors_3_0= ruleSupervisor )
            	    	    {
            	    	    // InternalSeminar.g:111:6: (lv_supervisors_3_0= ruleSupervisor )
            	    	    // InternalSeminar.g:112:7: lv_supervisors_3_0= ruleSupervisor
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_0_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_supervisors_3_0=ruleSupervisor();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"supervisors",
            	    	    								lv_supervisors_3_0,
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

            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSeminarAccess().getSemicolonKeyword_0_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSeminar.g:135:3: (otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeminar.g:136:4: otherlv_5= 'students:' ( (lv_students_6_0= ruleStudent ) )* ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )* otherlv_9= ';'
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSeminarAccess().getStudentsKeyword_1_0());
            	    			
            	    // InternalSeminar.g:140:4: ( (lv_students_6_0= ruleStudent ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalSeminar.g:141:5: (lv_students_6_0= ruleStudent )
            	    	    {
            	    	    // InternalSeminar.g:141:5: (lv_students_6_0= ruleStudent )
            	    	    // InternalSeminar.g:142:6: lv_students_6_0= ruleStudent
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_1_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_students_6_0=ruleStudent();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"students",
            	    	    							lv_students_6_0,
            	    	    							"de.fraunhofer.iem.Seminar.Student");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // InternalSeminar.g:159:4: ( (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==13) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalSeminar.g:160:5: (otherlv_7= ',' )+ ( (lv_students_8_0= ruleStudent ) )
            	    	    {
            	    	    // InternalSeminar.g:160:5: (otherlv_7= ',' )+
            	    	    int cnt6=0;
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( (LA6_0==13) ) {
            	    	            alt6=1;
            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // InternalSeminar.g:161:6: otherlv_7= ','
            	    	    	    {
            	    	    	    otherlv_7=(Token)match(input,13,FOLLOW_4); 

            	    	    	    						newLeafNode(otherlv_7, grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0());
            	    	    	    					

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

            	    	    // InternalSeminar.g:166:5: ( (lv_students_8_0= ruleStudent ) )
            	    	    // InternalSeminar.g:167:6: (lv_students_8_0= ruleStudent )
            	    	    {
            	    	    // InternalSeminar.g:167:6: (lv_students_8_0= ruleStudent )
            	    	    // InternalSeminar.g:168:7: lv_students_8_0= ruleStudent
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_students_8_0=ruleStudent();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"students",
            	    	    								lv_students_8_0,
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

            	    otherlv_9=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSeminarAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSeminar.g:191:3: (otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeminar.g:192:4: otherlv_10= 'topics:' ( (lv_topics_11_0= ruleTopic ) )* ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )* otherlv_14= ';'
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSeminarAccess().getTopicsKeyword_2_0());
            	    			
            	    // InternalSeminar.g:196:4: ( (lv_topics_11_0= ruleTopic ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalSeminar.g:197:5: (lv_topics_11_0= ruleTopic )
            	    	    {
            	    	    // InternalSeminar.g:197:5: (lv_topics_11_0= ruleTopic )
            	    	    // InternalSeminar.g:198:6: lv_topics_11_0= ruleTopic
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_topics_11_0=ruleTopic();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"topics",
            	    	    							lv_topics_11_0,
            	    	    							"de.fraunhofer.iem.Seminar.Topic");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    // InternalSeminar.g:215:4: ( (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==13) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalSeminar.g:216:5: (otherlv_12= ',' )+ ( (lv_topics_13_0= ruleTopic ) )
            	    	    {
            	    	    // InternalSeminar.g:216:5: (otherlv_12= ',' )+
            	    	    int cnt10=0;
            	    	    loop10:
            	    	    do {
            	    	        int alt10=2;
            	    	        int LA10_0 = input.LA(1);

            	    	        if ( (LA10_0==13) ) {
            	    	            alt10=1;
            	    	        }


            	    	        switch (alt10) {
            	    	    	case 1 :
            	    	    	    // InternalSeminar.g:217:6: otherlv_12= ','
            	    	    	    {
            	    	    	    otherlv_12=(Token)match(input,13,FOLLOW_4); 

            	    	    	    						newLeafNode(otherlv_12, grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0());
            	    	    	    					

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

            	    	    // InternalSeminar.g:222:5: ( (lv_topics_13_0= ruleTopic ) )
            	    	    // InternalSeminar.g:223:6: (lv_topics_13_0= ruleTopic )
            	    	    {
            	    	    // InternalSeminar.g:223:6: (lv_topics_13_0= ruleTopic )
            	    	    // InternalSeminar.g:224:7: lv_topics_13_0= ruleTopic
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_2_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_topics_13_0=ruleTopic();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"topics",
            	    	    								lv_topics_13_0,
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

            	    otherlv_14=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_14, grammarAccess.getSeminarAccess().getSemicolonKeyword_2_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSeminar.g:247:3: ( (lv_preferences_15_0= rulePreference ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==17) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeminar.g:248:4: (lv_preferences_15_0= rulePreference )
            	    {
            	    // InternalSeminar.g:248:4: (lv_preferences_15_0= rulePreference )
            	    // InternalSeminar.g:249:5: lv_preferences_15_0= rulePreference
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getPreferencesPreferenceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_preferences_15_0=rulePreference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"preferences",
            	    						lv_preferences_15_0,
            	    						"de.fraunhofer.iem.Seminar.Preference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSeminar.g:266:3: ( (lv_ratings_16_0= ruleRating ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==18) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeminar.g:267:4: (lv_ratings_16_0= ruleRating )
            	    {
            	    // InternalSeminar.g:267:4: (lv_ratings_16_0= ruleRating )
            	    // InternalSeminar.g:268:5: lv_ratings_16_0= ruleRating
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getRatingsRatingParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_ratings_16_0=ruleRating();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ratings",
            	    						lv_ratings_16_0,
            	    						"de.fraunhofer.iem.Seminar.Rating");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalSeminar.g:285:3: ( (lv_supervises_17_0= ruleSupervise ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==20) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeminar.g:286:4: (lv_supervises_17_0= ruleSupervise )
            	    {
            	    // InternalSeminar.g:286:4: (lv_supervises_17_0= ruleSupervise )
            	    // InternalSeminar.g:287:5: lv_supervises_17_0= ruleSupervise
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_supervises_17_0=ruleSupervise();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"supervises",
            	    						lv_supervises_17_0,
            	    						"de.fraunhofer.iem.Seminar.Supervise");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSeminar.g:304:3: ( (lv_assignments_18_0= ruleAssignment ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeminar.g:305:4: (lv_assignments_18_0= ruleAssignment )
            	    {
            	    // InternalSeminar.g:305:4: (lv_assignments_18_0= ruleAssignment )
            	    // InternalSeminar.g:306:5: lv_assignments_18_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_assignments_18_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignments",
            	    						lv_assignments_18_0,
            	    						"de.fraunhofer.iem.Seminar.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleSeminar"


    // $ANTLR start "entryRuleSupervisor"
    // InternalSeminar.g:327:1: entryRuleSupervisor returns [EObject current=null] : iv_ruleSupervisor= ruleSupervisor EOF ;
    public final EObject entryRuleSupervisor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervisor = null;


        try {
            // InternalSeminar.g:327:51: (iv_ruleSupervisor= ruleSupervisor EOF )
            // InternalSeminar.g:328:2: iv_ruleSupervisor= ruleSupervisor EOF
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
    // InternalSeminar.g:334:1: ruleSupervisor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSupervisor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeminar.g:340:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeminar.g:341:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeminar.g:341:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeminar.g:342:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeminar.g:342:3: (lv_name_0_0= RULE_ID )
            // InternalSeminar.g:343:4: lv_name_0_0= RULE_ID
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
    // InternalSeminar.g:362:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalSeminar.g:362:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalSeminar.g:363:2: iv_ruleStudent= ruleStudent EOF
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
    // InternalSeminar.g:369:1: ruleStudent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeminar.g:375:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeminar.g:376:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeminar.g:376:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeminar.g:377:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeminar.g:377:3: (lv_name_0_0= RULE_ID )
            // InternalSeminar.g:378:4: lv_name_0_0= RULE_ID
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
    // InternalSeminar.g:397:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalSeminar.g:397:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalSeminar.g:398:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalSeminar.g:404:1: ruleTopic returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSeminar.g:410:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSeminar.g:411:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSeminar.g:411:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSeminar.g:412:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSeminar.g:412:3: (lv_name_0_0= RULE_ID )
            // InternalSeminar.g:413:4: lv_name_0_0= RULE_ID
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
    // InternalSeminar.g:432:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // InternalSeminar.g:432:51: (iv_rulePreference= rulePreference EOF )
            // InternalSeminar.g:433:2: iv_rulePreference= rulePreference EOF
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
    // InternalSeminar.g:439:1: rulePreference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'likes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) ;
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
            // InternalSeminar.g:445:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'likes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalSeminar.g:446:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'likes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalSeminar.g:446:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'likes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalSeminar.g:447:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'likes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';'
            {
            // InternalSeminar.g:447:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:448:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:448:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:449:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getPreferenceAccess().getStudentStudentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPreferenceAccess().getLikesKeyword_1());
            		
            // InternalSeminar.g:464:3: ( (otherlv_2= RULE_ID ) )
            // InternalSeminar.g:465:4: (otherlv_2= RULE_ID )
            {
            // InternalSeminar.g:465:4: (otherlv_2= RULE_ID )
            // InternalSeminar.g:466:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_2_0());
            				

            }


            }

            // InternalSeminar.g:477:3: ( (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSeminar.g:478:4: (otherlv_3= ',' )+ ( (otherlv_4= RULE_ID ) )
            	    {
            	    // InternalSeminar.g:478:4: (otherlv_3= ',' )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==13) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalSeminar.g:479:5: otherlv_3= ','
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

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

            	    // InternalSeminar.g:484:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSeminar.g:485:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSeminar.g:485:5: (otherlv_4= RULE_ID )
            	    // InternalSeminar.g:486:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPreferenceRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(otherlv_4, grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSeminar.g:506:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalSeminar.g:506:47: (iv_ruleRating= ruleRating EOF )
            // InternalSeminar.g:507:2: iv_ruleRating= ruleRating EOF
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
    // InternalSeminar.g:513:1: ruleRating returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' ) ;
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
            // InternalSeminar.g:519:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' ) )
            // InternalSeminar.g:520:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' )
            {
            // InternalSeminar.g:520:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';' )
            // InternalSeminar.g:521:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rates' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_rating_4_0= RULE_REAL ) ) otherlv_5= ';'
            {
            // InternalSeminar.g:521:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:522:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:522:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:523:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getStudentStudentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getRatesKeyword_1());
            		
            // InternalSeminar.g:538:3: ( (otherlv_2= RULE_ID ) )
            // InternalSeminar.g:539:4: (otherlv_2= RULE_ID )
            {
            // InternalSeminar.g:539:4: (otherlv_2= RULE_ID )
            // InternalSeminar.g:540:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getTopicTopicCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getWithKeyword_3());
            		
            // InternalSeminar.g:555:3: ( (lv_rating_4_0= RULE_REAL ) )
            // InternalSeminar.g:556:4: (lv_rating_4_0= RULE_REAL )
            {
            // InternalSeminar.g:556:4: (lv_rating_4_0= RULE_REAL )
            // InternalSeminar.g:557:5: lv_rating_4_0= RULE_REAL
            {
            lv_rating_4_0=(Token)match(input,RULE_REAL,FOLLOW_15); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSeminar.g:581:1: entryRuleSupervise returns [EObject current=null] : iv_ruleSupervise= ruleSupervise EOF ;
    public final EObject entryRuleSupervise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervise = null;


        try {
            // InternalSeminar.g:581:50: (iv_ruleSupervise= ruleSupervise EOF )
            // InternalSeminar.g:582:2: iv_ruleSupervise= ruleSupervise EOF
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
    // InternalSeminar.g:588:1: ruleSupervise returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleSupervise() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSeminar.g:594:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSeminar.g:595:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSeminar.g:595:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalSeminar.g:596:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'supervises' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSeminar.g:596:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:597:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:597:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:598:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperviseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getSuperviseAccess().getSupervisorSupervisorCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperviseAccess().getSupervisesKeyword_1());
            		
            // InternalSeminar.g:613:3: ( (otherlv_2= RULE_ID ) )
            // InternalSeminar.g:614:4: (otherlv_2= RULE_ID )
            {
            // InternalSeminar.g:614:4: (otherlv_2= RULE_ID )
            // InternalSeminar.g:615:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperviseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getSuperviseAccess().getTopicTopicCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSeminar.g:634:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalSeminar.g:634:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSeminar.g:635:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalSeminar.g:641:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalSeminar.g:647:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSeminar.g:648:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSeminar.g:648:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalSeminar.g:649:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'assigned' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalSeminar.g:649:3: ( (otherlv_0= RULE_ID ) )
            // InternalSeminar.g:650:4: (otherlv_0= RULE_ID )
            {
            // InternalSeminar.g:650:4: (otherlv_0= RULE_ID )
            // InternalSeminar.g:651:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getStudentStudentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getAssignedKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getToKeyword_3());
            		
            // InternalSeminar.g:674:3: ( (otherlv_4= RULE_ID ) )
            // InternalSeminar.g:675:4: (otherlv_4= RULE_ID )
            {
            // InternalSeminar.g:675:4: (otherlv_4= RULE_ID )
            // InternalSeminar.g:676:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getTopicTopicCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000019012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});

}