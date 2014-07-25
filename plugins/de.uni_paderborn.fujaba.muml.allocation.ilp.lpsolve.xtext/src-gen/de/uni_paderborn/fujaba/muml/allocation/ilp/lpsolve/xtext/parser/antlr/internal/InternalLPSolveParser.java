package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLPSolveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min'", "'max'", "':'", "';'", "'.'", "'-'", "'='", "'>'", "'>='", "'<'", "'<='", "'bin'", "'int'", "'real'", "'+'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLPSolveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLPSolveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLPSolveParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g"; }



     	private LPSolveGrammarAccess grammarAccess;
     	
        public InternalLPSolveParser(TokenStream input, LPSolveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IntegerLinearProgram";	
       	}
       	
       	@Override
       	protected LPSolveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIntegerLinearProgram"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:68:1: entryRuleIntegerLinearProgram returns [EObject current=null] : iv_ruleIntegerLinearProgram= ruleIntegerLinearProgram EOF ;
    public final EObject entryRuleIntegerLinearProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLinearProgram = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:69:2: (iv_ruleIntegerLinearProgram= ruleIntegerLinearProgram EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:70:2: iv_ruleIntegerLinearProgram= ruleIntegerLinearProgram EOF
            {
             newCompositeNode(grammarAccess.getIntegerLinearProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLinearProgram_in_entryRuleIntegerLinearProgram75);
            iv_ruleIntegerLinearProgram=ruleIntegerLinearProgram();

            state._fsp--;

             current =iv_ruleIntegerLinearProgram; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLinearProgram85); 

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
    // $ANTLR end "entryRuleIntegerLinearProgram"


    // $ANTLR start "ruleIntegerLinearProgram"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:77:1: ruleIntegerLinearProgram returns [EObject current=null] : ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* ) ;
    public final EObject ruleIntegerLinearProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_objectiveFunction_0_0 = null;

        EObject lv_constraints_1_0 = null;

        EObject lv_variables_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:80:28: ( ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:81:1: ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:81:1: ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:81:2: ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:81:2: ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:82:1: (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:82:1: (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:83:3: lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_ruleIntegerLinearProgram131);
            lv_objectiveFunction_0_0=ruleObjectiveFunctionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerLinearProgramRule());
            	        }
                   		set(
                   			current, 
                   			"objectiveFunction",
                    		lv_objectiveFunction_0_0, 
                    		"ObjectiveFunctionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:99:2: ( (lv_constraints_1_0= ruleConstraintExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:100:1: (lv_constraints_1_0= ruleConstraintExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:100:1: (lv_constraints_1_0= ruleConstraintExpression )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:101:3: lv_constraints_1_0= ruleConstraintExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_ruleIntegerLinearProgram152);
            	    lv_constraints_1_0=ruleConstraintExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntegerLinearProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_1_0, 
            	            		"ConstraintExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:117:3: ( (lv_variables_2_0= ruleVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=22 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:118:1: (lv_variables_2_0= ruleVariable )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:118:1: (lv_variables_2_0= ruleVariable )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:119:3: lv_variables_2_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleIntegerLinearProgram174);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntegerLinearProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_2_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleIntegerLinearProgram"


    // $ANTLR start "entryRuleObjectiveFunctionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:143:1: entryRuleObjectiveFunctionExpression returns [EObject current=null] : iv_ruleObjectiveFunctionExpression= ruleObjectiveFunctionExpression EOF ;
    public final EObject entryRuleObjectiveFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveFunctionExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:144:2: (iv_ruleObjectiveFunctionExpression= ruleObjectiveFunctionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:145:2: iv_ruleObjectiveFunctionExpression= ruleObjectiveFunctionExpression EOF
            {
             newCompositeNode(grammarAccess.getObjectiveFunctionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_entryRuleObjectiveFunctionExpression211);
            iv_ruleObjectiveFunctionExpression=ruleObjectiveFunctionExpression();

            state._fsp--;

             current =iv_ruleObjectiveFunctionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObjectiveFunctionExpression221); 

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
    // $ANTLR end "entryRuleObjectiveFunctionExpression"


    // $ANTLR start "ruleObjectiveFunctionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:152:1: ruleObjectiveFunctionExpression returns [EObject current=null] : ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleObjectiveFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_goal_4_0 = null;

        EObject lv_objectiveFunction_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:155:28: ( ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:1: ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:1: ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==14) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_INT)||LA4_3==16) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==12) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==13) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==14) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_INT)||LA4_3==16) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:2: ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:2: ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:3: (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';'
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:3: (otherlv_0= 'min' | otherlv_1= 'max' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==11) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==12) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:5: otherlv_0= 'min'
                            {
                            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleObjectiveFunctionExpression260); 

                                	newLeafNode(otherlv_0, grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:161:7: otherlv_1= 'max'
                            {
                            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleObjectiveFunctionExpression278); 

                                	newLeafNode(otherlv_1, grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1());
                                

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleObjectiveFunctionExpression291); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_0_1());
                        
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleObjectiveFunctionExpression303); 

                        	newLeafNode(otherlv_3, grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:174:6: ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:174:6: ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:174:7: ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';'
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:174:7: ( (lv_goal_4_0= ruleObjectiveGoal ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:175:1: (lv_goal_4_0= ruleObjectiveGoal )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:175:1: (lv_goal_4_0= ruleObjectiveGoal )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:176:3: lv_goal_4_0= ruleObjectiveGoal
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleObjectiveGoal_in_ruleObjectiveFunctionExpression332);
                    lv_goal_4_0=ruleObjectiveGoal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectiveFunctionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"goal",
                            		lv_goal_4_0, 
                            		"ObjectiveGoal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleObjectiveFunctionExpression344); 

                        	newLeafNode(otherlv_5, grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1_1());
                        
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:196:1: ( (lv_objectiveFunction_6_0= ruleLinearExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:197:1: (lv_objectiveFunction_6_0= ruleLinearExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:197:1: (lv_objectiveFunction_6_0= ruleLinearExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:198:3: lv_objectiveFunction_6_0= ruleLinearExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_ruleObjectiveFunctionExpression365);
                    lv_objectiveFunction_6_0=ruleLinearExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectiveFunctionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"objectiveFunction",
                            		lv_objectiveFunction_6_0, 
                            		"LinearExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleObjectiveFunctionExpression377); 

                        	newLeafNode(otherlv_7, grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_1_3());
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleObjectiveFunctionExpression"


    // $ANTLR start "entryRuleConstraintExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:226:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:227:2: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:228:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
             newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression414);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;

             current =iv_ruleConstraintExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraintExpression424); 

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
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:235:1: ruleConstraintExpression returns [EObject current=null] : ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleConstraintExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_leftExpression_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:238:28: ( ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:239:1: ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:239:1: ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:239:2: ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:239:2: ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:239:3: ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':'
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:239:3: ( (lv_comment_0_0= ruleVariableID ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:240:1: (lv_comment_0_0= ruleVariableID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:240:1: (lv_comment_0_0= ruleVariableID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:241:3: lv_comment_0_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getCommentVariableIDParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleConstraintExpression471);
                    lv_comment_0_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstraintExpression483); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:261:3: ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:262:1: (lv_leftExpression_2_0= ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:262:1: (lv_leftExpression_2_0= ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:263:3: lv_leftExpression_2_0= ruleSimpleLinearExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression506);
            lv_leftExpression_2_0=ruleSimpleLinearExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_2_0, 
                    		"SimpleLinearExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:279:2: ( (lv_operator_3_0= ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:280:1: (lv_operator_3_0= ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:280:1: (lv_operator_3_0= ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:281:3: lv_operator_3_0= ruleComparingOperator
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_ruleConstraintExpression527);
            lv_operator_3_0=ruleComparingOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"ComparingOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:297:2: ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:298:1: (lv_rightExpression_4_0= ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:298:1: (lv_rightExpression_4_0= ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:299:3: lv_rightExpression_4_0= ruleSimpleLinearExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression548);
            lv_rightExpression_4_0=ruleSimpleLinearExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rightExpression",
                    		lv_rightExpression_4_0, 
                    		"SimpleLinearExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstraintExpression560); 

                	newLeafNode(otherlv_5, grammarAccess.getConstraintExpressionAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleVariable"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:327:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:328:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:329:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable596);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable606); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:336:1: ruleVariable returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_dataType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:339:28: ( ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:340:1: ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:340:1: ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:340:2: ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:340:2: ( (lv_dataType_0_0= ruleILPDataType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:341:1: (lv_dataType_0_0= ruleILPDataType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:341:1: (lv_dataType_0_0= ruleILPDataType )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:342:3: lv_dataType_0_0= ruleILPDataType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleILPDataType_in_ruleVariable652);
            lv_dataType_0_0=ruleILPDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_0_0, 
                    		"ILPDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:358:2: ( (lv_name_1_0= ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:359:1: (lv_name_1_0= ruleVariableID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:359:1: (lv_name_1_0= ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:360:3: lv_name_1_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameVariableIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleVariable673);
            lv_name_1_0=ruleVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVariable685); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableID"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:388:1: entryRuleVariableID returns [String current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final String entryRuleVariableID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableID = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:389:2: (iv_ruleVariableID= ruleVariableID EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:390:2: iv_ruleVariableID= ruleVariableID EOF
            {
             newCompositeNode(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID722);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;

             current =iv_ruleVariableID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID733); 

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
    // $ANTLR end "entryRuleVariableID"


    // $ANTLR start "ruleVariableID"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:397:1: ruleVariableID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleVariableID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_3=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:400:28: ( (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:401:1: (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:401:1: (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:401:6: this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableID773); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:408:1: (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:409:2: kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) )
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariableID792); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariableIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:414:1: (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_ID) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_INT) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:414:6: this_ID_2= RULE_ID
            	            {
            	            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableID808); 

            	            		current.merge(this_ID_2);
            	                
            	             
            	                newLeafNode(this_ID_2, grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:422:6: (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? )
            	            {
            	            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:422:6: (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? )
            	            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:422:11: this_INT_3= RULE_INT (this_ID_4= RULE_ID )?
            	            {
            	            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVariableID835); 

            	            		current.merge(this_INT_3);
            	                
            	             
            	                newLeafNode(this_INT_3, grammarAccess.getVariableIDAccess().getINTTerminalRuleCall_1_1_1_0()); 
            	                
            	            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:429:1: (this_ID_4= RULE_ID )?
            	            int alt6=2;
            	            int LA6_0 = input.LA(1);

            	            if ( (LA6_0==RULE_ID) ) {
            	                alt6=1;
            	            }
            	            switch (alt6) {
            	                case 1 :
            	                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:429:6: this_ID_4= RULE_ID
            	                    {
            	                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableID856); 

            	                    		current.merge(this_ID_4);
            	                        
            	                     
            	                        newLeafNode(this_ID_4, grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_1_1()); 
            	                        

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleVariableID"


    // $ANTLR start "entryRuleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:444:1: entryRuleLinearExpression returns [EObject current=null] : iv_ruleLinearExpression= ruleLinearExpression EOF ;
    public final EObject entryRuleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:445:2: (iv_ruleLinearExpression= ruleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:446:2: iv_ruleLinearExpression= ruleLinearExpression EOF
            {
             newCompositeNode(grammarAccess.getLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression907);
            iv_ruleLinearExpression=ruleLinearExpression();

            state._fsp--;

             current =iv_ruleLinearExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinearExpression917); 

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
    // $ANTLR end "entryRuleLinearExpression"


    // $ANTLR start "ruleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:453:1: ruleLinearExpression returns [EObject current=null] : this_SimpleLinearExpression_0= ruleSimpleLinearExpression ;
    public final EObject ruleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleLinearExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:456:28: (this_SimpleLinearExpression_0= ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:458:5: this_SimpleLinearExpression_0= ruleSimpleLinearExpression
            {
             
                    newCompositeNode(grammarAccess.getLinearExpressionAccess().getSimpleLinearExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression963);
            this_SimpleLinearExpression_0=ruleSimpleLinearExpression();

            state._fsp--;

             
                    current = this_SimpleLinearExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleLinearExpression"


    // $ANTLR start "entryRuleSimpleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:474:1: entryRuleSimpleLinearExpression returns [EObject current=null] : iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF ;
    public final EObject entryRuleSimpleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLinearExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:475:2: (iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:476:2: iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression997);
            iv_ruleSimpleLinearExpression=ruleSimpleLinearExpression();

            state._fsp--;

             current =iv_ruleSimpleLinearExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleLinearExpression1007); 

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
    // $ANTLR end "entryRuleSimpleLinearExpression"


    // $ANTLR start "ruleSimpleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:483:1: ruleSimpleLinearExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleSimpleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:486:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:488:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getSimpleLinearExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression1053);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;

             
                    current = this_AdditionExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleSimpleLinearExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:504:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:505:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:506:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1087);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression1097); 

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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:513:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:516:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:517:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:517:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:518:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression1144);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:526:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16||LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:526:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:526:2: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:527:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:532:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:533:1: (lv_operator_2_0= ruleAdditionOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:533:1: (lv_operator_2_0= ruleAdditionOperator )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:534:3: lv_operator_2_0= ruleAdditionOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression1174);
                    lv_operator_2_0=ruleAdditionOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"AdditionOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:550:2: ( (lv_rightExpression_3_0= ruleLinearExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:551:1: (lv_rightExpression_3_0= ruleLinearExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:551:1: (lv_rightExpression_3_0= ruleLinearExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:552:3: lv_rightExpression_3_0= ruleLinearExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_ruleAdditionExpression1195);
                    lv_rightExpression_3_0=ruleLinearExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"LinearExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:576:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:577:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:578:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1233);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression1243); 

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:585:1: ruleMultiplicationExpression returns [EObject current=null] : (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Operand_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:588:28: ( (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:589:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:589:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:590:5: this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression1290);
            this_Operand_0=ruleOperand();

            state._fsp--;

             
                    current = this_Operand_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:598:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:598:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:598:2: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:599:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:604:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:605:1: (lv_operator_2_0= ruleMultiplicationOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:605:1: (lv_operator_2_0= ruleMultiplicationOperator )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:606:3: lv_operator_2_0= ruleMultiplicationOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression1320);
                    lv_operator_2_0=ruleMultiplicationOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"MultiplicationOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:622:2: ( (lv_rightExpression_3_0= ruleOperand ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:623:1: (lv_rightExpression_3_0= ruleOperand )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:623:1: (lv_rightExpression_3_0= ruleOperand )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:624:3: lv_rightExpression_3_0= ruleOperand
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression1341);
                    lv_rightExpression_3_0=ruleOperand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"Operand");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleOperand"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:648:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:649:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:650:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand1379);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand1389); 

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:657:1: ruleOperand returns [EObject current=null] : (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpression_0 = null;

        EObject this_VariableExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:660:28: ( (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:661:1: (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:661:1: (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:662:5: this_NumberLiteralExpression_0= ruleNumberLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_ruleOperand1436);
                    this_NumberLiteralExpression_0=ruleNumberLiteralExpression();

                    state._fsp--;

                     
                            current = this_NumberLiteralExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:672:5: this_VariableExpression_1= ruleVariableExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_ruleOperand1463);
                    this_VariableExpression_1=ruleVariableExpression();

                    state._fsp--;

                     
                            current = this_VariableExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleNumberLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:688:1: entryRuleNumberLiteralExpression returns [EObject current=null] : iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF ;
    public final EObject entryRuleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:689:2: (iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:690:2: iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression1498);
            iv_ruleNumberLiteralExpression=ruleNumberLiteralExpression();

            state._fsp--;

             current =iv_ruleNumberLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpression1508); 

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
    // $ANTLR end "entryRuleNumberLiteralExpression"


    // $ANTLR start "ruleNumberLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:697:1: ruleNumberLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:700:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:701:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:701:1: ( (lv_value_0_0= ruleNumber ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:702:1: (lv_value_0_0= ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:702:1: (lv_value_0_0= ruleNumber )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:703:3: lv_value_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleNumberLiteralExpression1553);
            lv_value_0_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberLiteralExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Number");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNumberLiteralExpression"


    // $ANTLR start "entryRuleNumber"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:727:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:728:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:729:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber1589);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber1600); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:736:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Decimal_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:739:28: ( ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:740:1: ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:740:1: ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:740:2: (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:740:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:741:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNumber1639); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:746:3: (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==15) ) {
                    alt13=1;
                }
                else if ( (LA13_1==EOF||LA13_1==14||(LA13_1>=16 && LA13_1<=21)||(LA13_1>=25 && LA13_1<=26)) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:747:5: this_Decimal_1= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getDecimalParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_ruleNumber1664);
                    this_Decimal_1=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:758:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNumber1690); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleDecimal"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:773:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:774:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:775:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal1737);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal1748); 

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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:782:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:785:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:786:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:786:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:786:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDecimal1788); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDecimal1806); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDecimal1821); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleVariableExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:814:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:815:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:816:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression1866);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableExpression1876); 

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
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:823:1: ruleVariableExpression returns [EObject current=null] : ( ( ruleVariableID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:826:28: ( ( ( ruleVariableID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:827:1: ( ( ruleVariableID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:827:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:828:1: ( ruleVariableID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:828:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:829:3: ruleVariableID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableExpressionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_ruleVariableExpression1923);
            ruleVariableID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "ruleObjectiveGoal"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:850:1: ruleObjectiveGoal returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) ) ;
    public final Enumerator ruleObjectiveGoal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:852:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:853:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:853:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            else if ( (LA14_0==12) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:853:2: (enumLiteral_0= 'min' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:853:2: (enumLiteral_0= 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:853:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleObjectiveGoal1972); 

                            current = grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:859:6: (enumLiteral_1= 'max' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:859:6: (enumLiteral_1= 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:859:8: enumLiteral_1= 'max'
                    {
                    enumLiteral_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleObjectiveGoal1989); 

                            current = grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleObjectiveGoal"


    // $ANTLR start "ruleComparingOperator"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:869:1: ruleComparingOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:871:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:872:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:872:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt15=1;
                }
                break;
            case 18:
                {
                alt15=2;
                }
                break;
            case 19:
                {
                alt15=3;
                }
                break;
            case 20:
                {
                alt15=4;
                }
                break;
            case 21:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:872:2: (enumLiteral_0= '=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:872:2: (enumLiteral_0= '=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:872:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComparingOperator2034); 

                            current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:878:6: (enumLiteral_1= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:878:6: (enumLiteral_1= '>' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:878:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComparingOperator2051); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:884:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:884:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:884:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComparingOperator2068); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:890:6: (enumLiteral_3= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:890:6: (enumLiteral_3= '<' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:890:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleComparingOperator2085); 

                            current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:896:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:896:6: (enumLiteral_4= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:896:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleComparingOperator2102); 

                            current = grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleComparingOperator"


    // $ANTLR start "ruleILPDataType"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:906:1: ruleILPDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) ) ;
    public final Enumerator ruleILPDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:908:28: ( ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:909:1: ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:909:1: ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:909:2: (enumLiteral_0= 'bin' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:909:2: (enumLiteral_0= 'bin' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:909:4: enumLiteral_0= 'bin'
                    {
                    enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleILPDataType2147); 

                            current = grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:915:6: (enumLiteral_1= 'int' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:915:6: (enumLiteral_1= 'int' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:915:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleILPDataType2164); 

                            current = grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:921:6: (enumLiteral_2= 'real' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:921:6: (enumLiteral_2= 'real' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:921:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleILPDataType2181); 

                            current = grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleILPDataType"


    // $ANTLR start "ruleAdditionOperator"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:931:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:933:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:934:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:934:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            else if ( (LA17_0==16) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:934:2: (enumLiteral_0= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:934:2: (enumLiteral_0= '+' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:934:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAdditionOperator2226); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:940:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:940:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:940:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAdditionOperator2243); 

                            current = grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:950:1: ruleMultiplicationOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:952:28: ( (enumLiteral_0= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:953:1: (enumLiteral_0= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:953:1: (enumLiteral_0= '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:953:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiplicationOperator2287); 

                    current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleMultiplicationOperator"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\10\uffff";
    static final String DFA5_eofS =
        "\10\uffff";
    static final String DFA5_minS =
        "\1\4\1\15\1\uffff\1\4\1\uffff\1\15\1\4\1\15";
    static final String DFA5_maxS =
        "\1\20\1\32\1\uffff\1\5\1\uffff\3\32";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String DFA5_specialS =
        "\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\12\uffff\1\2",
            "\1\4\1\uffff\1\3\6\2\3\uffff\2\2",
            "",
            "\1\5\1\6",
            "",
            "\1\4\1\uffff\1\3\6\2\3\uffff\2\2",
            "\1\7\10\uffff\1\4\1\uffff\1\3\6\2\3\uffff\2\2",
            "\1\4\1\uffff\1\3\6\2\3\uffff\2\2"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "239:2: ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntegerLinearProgram_in_entryRuleIntegerLinearProgram75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLinearProgram85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_ruleIntegerLinearProgram131 = new BitSet(new long[]{0x0000000001C10032L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleIntegerLinearProgram152 = new BitSet(new long[]{0x0000000001C10032L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleIntegerLinearProgram174 = new BitSet(new long[]{0x0000000001C00002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_entryRuleObjectiveFunctionExpression211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectiveFunctionExpression221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleObjectiveFunctionExpression260 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_12_in_ruleObjectiveFunctionExpression278 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleObjectiveFunctionExpression291 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleObjectiveFunctionExpression303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveGoal_in_ruleObjectiveFunctionExpression332 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleObjectiveFunctionExpression344 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_ruleObjectiveFunctionExpression365 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleObjectiveFunctionExpression377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleConstraintExpression471 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstraintExpression483 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression506 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_ruleConstraintExpression527 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression548 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConstraintExpression560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleILPDataType_in_ruleVariable652 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleVariable673 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleVariable685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableID773 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleVariableID792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableID808 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVariableID835 = new BitSet(new long[]{0x0000000000008012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableID856 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinearExpression917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLinearExpression1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression1144 = new BitSet(new long[]{0x0000000002010002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression1174 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_ruleAdditionExpression1195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression1290 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression1320 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand1379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand1389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_ruleOperand1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_ruleOperand1463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression1498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpression1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteralExpression1553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleNumber1639 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDecimal_in_ruleNumber1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal1737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal1748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal1788 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDecimal1806 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression1866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_ruleVariableExpression1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleObjectiveGoal1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleObjectiveGoal1989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleComparingOperator2034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleComparingOperator2051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleComparingOperator2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleComparingOperator2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleComparingOperator2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleILPDataType2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleILPDataType2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleILPDataType2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAdditionOperator2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAdditionOperator2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMultiplicationOperator2287 = new BitSet(new long[]{0x0000000000000002L});
    }


}