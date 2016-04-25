package org.muml.psm.allocation.ilp.lpsolve.xtext.parser.antlr.internal; 

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
import org.muml.psm.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLPSolveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min'", "'max'", "':'", "';'", "'.'", "'-'", "'='", "'>'", "'>='", "'<'", "'<='", "'bin'", "'int'", "'real'", "'+'", "'*'"
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
    public static final int T__26=26;
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


        public InternalLPSolveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLPSolveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLPSolveParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLPSolve.g"; }



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
    // InternalLPSolve.g:68:1: entryRuleIntegerLinearProgram returns [EObject current=null] : iv_ruleIntegerLinearProgram= ruleIntegerLinearProgram EOF ;
    public final EObject entryRuleIntegerLinearProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLinearProgram = null;


        try {
            // InternalLPSolve.g:69:2: (iv_ruleIntegerLinearProgram= ruleIntegerLinearProgram EOF )
            // InternalLPSolve.g:70:2: iv_ruleIntegerLinearProgram= ruleIntegerLinearProgram EOF
            {
             newCompositeNode(grammarAccess.getIntegerLinearProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerLinearProgram=ruleIntegerLinearProgram();

            state._fsp--;

             current =iv_ruleIntegerLinearProgram; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:77:1: ruleIntegerLinearProgram returns [EObject current=null] : ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* ) ;
    public final EObject ruleIntegerLinearProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_objectiveFunction_0_0 = null;

        EObject lv_constraints_1_0 = null;

        EObject lv_variables_2_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:80:28: ( ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* ) )
            // InternalLPSolve.g:81:1: ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* )
            {
            // InternalLPSolve.g:81:1: ( ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )* )
            // InternalLPSolve.g:81:2: ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) ) ( (lv_constraints_1_0= ruleConstraintExpression ) )* ( (lv_variables_2_0= ruleVariable ) )*
            {
            // InternalLPSolve.g:81:2: ( (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression ) )
            // InternalLPSolve.g:82:1: (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression )
            {
            // InternalLPSolve.g:82:1: (lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression )
            // InternalLPSolve.g:83:3: lv_objectiveFunction_0_0= ruleObjectiveFunctionExpression
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_objectiveFunction_0_0=ruleObjectiveFunctionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerLinearProgramRule());
            	        }
                   		set(
                   			current, 
                   			"objectiveFunction",
                    		lv_objectiveFunction_0_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.ObjectiveFunctionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLPSolve.g:99:2: ( (lv_constraints_1_0= ruleConstraintExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLPSolve.g:100:1: (lv_constraints_1_0= ruleConstraintExpression )
            	    {
            	    // InternalLPSolve.g:100:1: (lv_constraints_1_0= ruleConstraintExpression )
            	    // InternalLPSolve.g:101:3: lv_constraints_1_0= ruleConstraintExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_constraints_1_0=ruleConstraintExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntegerLinearProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_1_0, 
            	            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.ConstraintExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLPSolve.g:117:3: ( (lv_variables_2_0= ruleVariable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=22 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLPSolve.g:118:1: (lv_variables_2_0= ruleVariable )
            	    {
            	    // InternalLPSolve.g:118:1: (lv_variables_2_0= ruleVariable )
            	    // InternalLPSolve.g:119:3: lv_variables_2_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntegerLinearProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_2_0, 
            	            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.Variable");
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
    // InternalLPSolve.g:143:1: entryRuleObjectiveFunctionExpression returns [EObject current=null] : iv_ruleObjectiveFunctionExpression= ruleObjectiveFunctionExpression EOF ;
    public final EObject entryRuleObjectiveFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveFunctionExpression = null;


        try {
            // InternalLPSolve.g:144:2: (iv_ruleObjectiveFunctionExpression= ruleObjectiveFunctionExpression EOF )
            // InternalLPSolve.g:145:2: iv_ruleObjectiveFunctionExpression= ruleObjectiveFunctionExpression EOF
            {
             newCompositeNode(grammarAccess.getObjectiveFunctionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleObjectiveFunctionExpression=ruleObjectiveFunctionExpression();

            state._fsp--;

             current =iv_ruleObjectiveFunctionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:152:1: ruleObjectiveFunctionExpression returns [EObject current=null] : ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) ) ;
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
            // InternalLPSolve.g:155:28: ( ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) ) )
            // InternalLPSolve.g:156:1: ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) )
            {
            // InternalLPSolve.g:156:1: ( ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' ) | ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' ) )
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
                    // InternalLPSolve.g:156:2: ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' )
                    {
                    // InternalLPSolve.g:156:2: ( (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';' )
                    // InternalLPSolve.g:156:3: (otherlv_0= 'min' | otherlv_1= 'max' ) otherlv_2= ':' otherlv_3= ';'
                    {
                    // InternalLPSolve.g:156:3: (otherlv_0= 'min' | otherlv_1= 'max' )
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
                            // InternalLPSolve.g:156:5: otherlv_0= 'min'
                            {
                            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                                	newLeafNode(otherlv_0, grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // InternalLPSolve.g:161:7: otherlv_1= 'max'
                            {
                            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                                	newLeafNode(otherlv_1, grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1());
                                

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_6); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_0_1());
                        
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_3, grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:174:6: ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' )
                    {
                    // InternalLPSolve.g:174:6: ( ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';' )
                    // InternalLPSolve.g:174:7: ( (lv_goal_4_0= ruleObjectiveGoal ) ) otherlv_5= ':' ( (lv_objectiveFunction_6_0= ruleLinearExpression ) ) otherlv_7= ';'
                    {
                    // InternalLPSolve.g:174:7: ( (lv_goal_4_0= ruleObjectiveGoal ) )
                    // InternalLPSolve.g:175:1: (lv_goal_4_0= ruleObjectiveGoal )
                    {
                    // InternalLPSolve.g:175:1: (lv_goal_4_0= ruleObjectiveGoal )
                    // InternalLPSolve.g:176:3: lv_goal_4_0= ruleObjectiveGoal
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_goal_4_0=ruleObjectiveGoal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectiveFunctionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"goal",
                            		lv_goal_4_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.ObjectiveGoal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_5, grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1_1());
                        
                    // InternalLPSolve.g:196:1: ( (lv_objectiveFunction_6_0= ruleLinearExpression ) )
                    // InternalLPSolve.g:197:1: (lv_objectiveFunction_6_0= ruleLinearExpression )
                    {
                    // InternalLPSolve.g:197:1: (lv_objectiveFunction_6_0= ruleLinearExpression )
                    // InternalLPSolve.g:198:3: lv_objectiveFunction_6_0= ruleLinearExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_objectiveFunction_6_0=ruleLinearExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectiveFunctionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"objectiveFunction",
                            		lv_objectiveFunction_6_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.LinearExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:226:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // InternalLPSolve.g:227:2: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // InternalLPSolve.g:228:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
             newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;

             current =iv_ruleConstraintExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:235:1: ruleConstraintExpression returns [EObject current=null] : ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' ) ;
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
            // InternalLPSolve.g:238:28: ( ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' ) )
            // InternalLPSolve.g:239:1: ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' )
            {
            // InternalLPSolve.g:239:1: ( ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' )
            // InternalLPSolve.g:239:2: ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';'
            {
            // InternalLPSolve.g:239:2: ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalLPSolve.g:239:3: ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':'
                    {
                    // InternalLPSolve.g:239:3: ( (lv_comment_0_0= ruleVariableID ) )
                    // InternalLPSolve.g:240:1: (lv_comment_0_0= ruleVariableID )
                    {
                    // InternalLPSolve.g:240:1: (lv_comment_0_0= ruleVariableID )
                    // InternalLPSolve.g:241:3: lv_comment_0_0= ruleVariableID
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getCommentVariableIDParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_comment_0_0=ruleVariableID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.VariableID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalLPSolve.g:261:3: ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) )
            // InternalLPSolve.g:262:1: (lv_leftExpression_2_0= ruleSimpleLinearExpression )
            {
            // InternalLPSolve.g:262:1: (lv_leftExpression_2_0= ruleSimpleLinearExpression )
            // InternalLPSolve.g:263:3: lv_leftExpression_2_0= ruleSimpleLinearExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_8);
            lv_leftExpression_2_0=ruleSimpleLinearExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_2_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.SimpleLinearExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLPSolve.g:279:2: ( (lv_operator_3_0= ruleComparingOperator ) )
            // InternalLPSolve.g:280:1: (lv_operator_3_0= ruleComparingOperator )
            {
            // InternalLPSolve.g:280:1: (lv_operator_3_0= ruleComparingOperator )
            // InternalLPSolve.g:281:3: lv_operator_3_0= ruleComparingOperator
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
            lv_operator_3_0=ruleComparingOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.ComparingOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLPSolve.g:297:2: ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) )
            // InternalLPSolve.g:298:1: (lv_rightExpression_4_0= ruleSimpleLinearExpression )
            {
            // InternalLPSolve.g:298:1: (lv_rightExpression_4_0= ruleSimpleLinearExpression )
            // InternalLPSolve.g:299:3: lv_rightExpression_4_0= ruleSimpleLinearExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rightExpression_4_0=ruleSimpleLinearExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rightExpression",
                    		lv_rightExpression_4_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.SimpleLinearExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:327:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalLPSolve.g:328:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalLPSolve.g:329:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:336:1: ruleVariable returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_dataType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:339:28: ( ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' ) )
            // InternalLPSolve.g:340:1: ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' )
            {
            // InternalLPSolve.g:340:1: ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';' )
            // InternalLPSolve.g:340:2: ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= ruleVariableID ) ) otherlv_2= ';'
            {
            // InternalLPSolve.g:340:2: ( (lv_dataType_0_0= ruleILPDataType ) )
            // InternalLPSolve.g:341:1: (lv_dataType_0_0= ruleILPDataType )
            {
            // InternalLPSolve.g:341:1: (lv_dataType_0_0= ruleILPDataType )
            // InternalLPSolve.g:342:3: lv_dataType_0_0= ruleILPDataType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_9);
            lv_dataType_0_0=ruleILPDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"dataType",
                    		lv_dataType_0_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.ILPDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLPSolve.g:358:2: ( (lv_name_1_0= ruleVariableID ) )
            // InternalLPSolve.g:359:1: (lv_name_1_0= ruleVariableID )
            {
            // InternalLPSolve.g:359:1: (lv_name_1_0= ruleVariableID )
            // InternalLPSolve.g:360:3: lv_name_1_0= ruleVariableID
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameVariableIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_name_1_0=ruleVariableID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.VariableID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:388:1: entryRuleVariableID returns [String current=null] : iv_ruleVariableID= ruleVariableID EOF ;
    public final String entryRuleVariableID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableID = null;


        try {
            // InternalLPSolve.g:389:2: (iv_ruleVariableID= ruleVariableID EOF )
            // InternalLPSolve.g:390:2: iv_ruleVariableID= ruleVariableID EOF
            {
             newCompositeNode(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableID=ruleVariableID();

            state._fsp--;

             current =iv_ruleVariableID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:397:1: ruleVariableID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleVariableID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_3=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // InternalLPSolve.g:400:28: ( (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* ) )
            // InternalLPSolve.g:401:1: (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* )
            {
            // InternalLPSolve.g:401:1: (this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )* )
            // InternalLPSolve.g:401:6: this_ID_0= RULE_ID (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_0()); 
                
            // InternalLPSolve.g:408:1: (kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLPSolve.g:409:2: kw= '.' (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) )
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_11); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getVariableIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    // InternalLPSolve.g:414:1: (this_ID_2= RULE_ID | (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? ) )
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
            	            // InternalLPSolve.g:414:6: this_ID_2= RULE_ID
            	            {
            	            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            	            		current.merge(this_ID_2);
            	                
            	             
            	                newLeafNode(this_ID_2, grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // InternalLPSolve.g:422:6: (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? )
            	            {
            	            // InternalLPSolve.g:422:6: (this_INT_3= RULE_INT (this_ID_4= RULE_ID )? )
            	            // InternalLPSolve.g:422:11: this_INT_3= RULE_INT (this_ID_4= RULE_ID )?
            	            {
            	            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); 

            	            		current.merge(this_INT_3);
            	                
            	             
            	                newLeafNode(this_INT_3, grammarAccess.getVariableIDAccess().getINTTerminalRuleCall_1_1_1_0()); 
            	                
            	            // InternalLPSolve.g:429:1: (this_ID_4= RULE_ID )?
            	            int alt6=2;
            	            int LA6_0 = input.LA(1);

            	            if ( (LA6_0==RULE_ID) ) {
            	                alt6=1;
            	            }
            	            switch (alt6) {
            	                case 1 :
            	                    // InternalLPSolve.g:429:6: this_ID_4= RULE_ID
            	                    {
            	                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

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
    // InternalLPSolve.g:444:1: entryRuleLinearExpression returns [EObject current=null] : iv_ruleLinearExpression= ruleLinearExpression EOF ;
    public final EObject entryRuleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearExpression = null;


        try {
            // InternalLPSolve.g:445:2: (iv_ruleLinearExpression= ruleLinearExpression EOF )
            // InternalLPSolve.g:446:2: iv_ruleLinearExpression= ruleLinearExpression EOF
            {
             newCompositeNode(grammarAccess.getLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLinearExpression=ruleLinearExpression();

            state._fsp--;

             current =iv_ruleLinearExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:453:1: ruleLinearExpression returns [EObject current=null] : this_SimpleLinearExpression_0= ruleSimpleLinearExpression ;
    public final EObject ruleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleLinearExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:456:28: (this_SimpleLinearExpression_0= ruleSimpleLinearExpression )
            // InternalLPSolve.g:458:5: this_SimpleLinearExpression_0= ruleSimpleLinearExpression
            {
             
                    newCompositeNode(grammarAccess.getLinearExpressionAccess().getSimpleLinearExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalLPSolve.g:474:1: entryRuleSimpleLinearExpression returns [EObject current=null] : iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF ;
    public final EObject entryRuleSimpleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLinearExpression = null;


        try {
            // InternalLPSolve.g:475:2: (iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF )
            // InternalLPSolve.g:476:2: iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleLinearExpression=ruleSimpleLinearExpression();

            state._fsp--;

             current =iv_ruleSimpleLinearExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:483:1: ruleSimpleLinearExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleSimpleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:486:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // InternalLPSolve.g:488:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getSimpleLinearExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalLPSolve.g:504:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalLPSolve.g:505:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalLPSolve.g:506:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:513:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:516:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? ) )
            // InternalLPSolve.g:517:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? )
            {
            // InternalLPSolve.g:517:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? )
            // InternalLPSolve.g:518:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_13);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalLPSolve.g:526:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16||LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLPSolve.g:526:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) )
                    {
                    // InternalLPSolve.g:526:2: ()
                    // InternalLPSolve.g:527:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // InternalLPSolve.g:532:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
                    // InternalLPSolve.g:533:1: (lv_operator_2_0= ruleAdditionOperator )
                    {
                    // InternalLPSolve.g:533:1: (lv_operator_2_0= ruleAdditionOperator )
                    // InternalLPSolve.g:534:3: lv_operator_2_0= ruleAdditionOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_operator_2_0=ruleAdditionOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.AdditionOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalLPSolve.g:550:2: ( (lv_rightExpression_3_0= ruleLinearExpression ) )
                    // InternalLPSolve.g:551:1: (lv_rightExpression_3_0= ruleLinearExpression )
                    {
                    // InternalLPSolve.g:551:1: (lv_rightExpression_3_0= ruleLinearExpression )
                    // InternalLPSolve.g:552:3: lv_rightExpression_3_0= ruleLinearExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightExpression_3_0=ruleLinearExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.LinearExpression");
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
    // InternalLPSolve.g:576:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalLPSolve.g:577:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalLPSolve.g:578:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:585:1: ruleMultiplicationExpression returns [EObject current=null] : (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Operand_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:588:28: ( (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? ) )
            // InternalLPSolve.g:589:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? )
            {
            // InternalLPSolve.g:589:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? )
            // InternalLPSolve.g:590:5: this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_14);
            this_Operand_0=ruleOperand();

            state._fsp--;

             
                    current = this_Operand_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalLPSolve.g:598:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLPSolve.g:598:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) )
                    {
                    // InternalLPSolve.g:598:2: ()
                    // InternalLPSolve.g:599:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // InternalLPSolve.g:604:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
                    // InternalLPSolve.g:605:1: (lv_operator_2_0= ruleMultiplicationOperator )
                    {
                    // InternalLPSolve.g:605:1: (lv_operator_2_0= ruleMultiplicationOperator )
                    // InternalLPSolve.g:606:3: lv_operator_2_0= ruleMultiplicationOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_operator_2_0=ruleMultiplicationOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.MultiplicationOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalLPSolve.g:622:2: ( (lv_rightExpression_3_0= ruleOperand ) )
                    // InternalLPSolve.g:623:1: (lv_rightExpression_3_0= ruleOperand )
                    {
                    // InternalLPSolve.g:623:1: (lv_rightExpression_3_0= ruleOperand )
                    // InternalLPSolve.g:624:3: lv_rightExpression_3_0= ruleOperand
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightExpression_3_0=ruleOperand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.Operand");
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
    // InternalLPSolve.g:648:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalLPSolve.g:649:2: (iv_ruleOperand= ruleOperand EOF )
            // InternalLPSolve.g:650:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:657:1: ruleOperand returns [EObject current=null] : (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpression_0 = null;

        EObject this_VariableExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:660:28: ( (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression ) )
            // InternalLPSolve.g:661:1: (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression )
            {
            // InternalLPSolve.g:661:1: (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression )
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
                    // InternalLPSolve.g:662:5: this_NumberLiteralExpression_0= ruleNumberLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumberLiteralExpression_0=ruleNumberLiteralExpression();

                    state._fsp--;

                     
                            current = this_NumberLiteralExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:672:5: this_VariableExpression_1= ruleVariableExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalLPSolve.g:688:1: entryRuleNumberLiteralExpression returns [EObject current=null] : iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF ;
    public final EObject entryRuleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpression = null;


        try {
            // InternalLPSolve.g:689:2: (iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF )
            // InternalLPSolve.g:690:2: iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumberLiteralExpression=ruleNumberLiteralExpression();

            state._fsp--;

             current =iv_ruleNumberLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:697:1: ruleNumberLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:700:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalLPSolve.g:701:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalLPSolve.g:701:1: ( (lv_value_0_0= ruleNumber ) )
            // InternalLPSolve.g:702:1: (lv_value_0_0= ruleNumber )
            {
            // InternalLPSolve.g:702:1: (lv_value_0_0= ruleNumber )
            // InternalLPSolve.g:703:3: lv_value_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberLiteralExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolve.Number");
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
    // InternalLPSolve.g:727:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalLPSolve.g:728:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalLPSolve.g:729:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:736:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Decimal_1 = null;


         enterRule(); 
            
        try {
            // InternalLPSolve.g:739:28: ( ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) ) )
            // InternalLPSolve.g:740:1: ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) )
            {
            // InternalLPSolve.g:740:1: ( (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT ) )
            // InternalLPSolve.g:740:2: (kw= '-' )? (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT )
            {
            // InternalLPSolve.g:740:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLPSolve.g:741:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_15); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // InternalLPSolve.g:746:3: (this_Decimal_1= ruleDecimal | this_INT_2= RULE_INT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==14||(LA13_1>=16 && LA13_1<=21)||(LA13_1>=25 && LA13_1<=26)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==15) ) {
                    alt13=1;
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
                    // InternalLPSolve.g:747:5: this_Decimal_1= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAccess().getDecimalParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Decimal_1=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:758:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:773:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // InternalLPSolve.g:774:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalLPSolve.g:775:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:782:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalLPSolve.g:785:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalLPSolve.g:786:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalLPSolve.g:786:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalLPSolve.g:786:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_16); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:814:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalLPSolve.g:815:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalLPSolve.g:816:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:823:1: ruleVariableExpression returns [EObject current=null] : ( ( ruleVariableID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalLPSolve.g:826:28: ( ( ( ruleVariableID ) ) )
            // InternalLPSolve.g:827:1: ( ( ruleVariableID ) )
            {
            // InternalLPSolve.g:827:1: ( ( ruleVariableID ) )
            // InternalLPSolve.g:828:1: ( ruleVariableID )
            {
            // InternalLPSolve.g:828:1: ( ruleVariableID )
            // InternalLPSolve.g:829:3: ruleVariableID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableExpressionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalLPSolve.g:850:1: ruleObjectiveGoal returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) ) ;
    public final Enumerator ruleObjectiveGoal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalLPSolve.g:852:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) ) )
            // InternalLPSolve.g:853:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) )
            {
            // InternalLPSolve.g:853:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) )
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
                    // InternalLPSolve.g:853:2: (enumLiteral_0= 'min' )
                    {
                    // InternalLPSolve.g:853:2: (enumLiteral_0= 'min' )
                    // InternalLPSolve.g:853:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,11,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:859:6: (enumLiteral_1= 'max' )
                    {
                    // InternalLPSolve.g:859:6: (enumLiteral_1= 'max' )
                    // InternalLPSolve.g:859:8: enumLiteral_1= 'max'
                    {
                    enumLiteral_1=(Token)match(input,12,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:869:1: ruleComparingOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalLPSolve.g:871:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) )
            // InternalLPSolve.g:872:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalLPSolve.g:872:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
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
                    // InternalLPSolve.g:872:2: (enumLiteral_0= '=' )
                    {
                    // InternalLPSolve.g:872:2: (enumLiteral_0= '=' )
                    // InternalLPSolve.g:872:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:878:6: (enumLiteral_1= '>' )
                    {
                    // InternalLPSolve.g:878:6: (enumLiteral_1= '>' )
                    // InternalLPSolve.g:878:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,18,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalLPSolve.g:884:6: (enumLiteral_2= '>=' )
                    {
                    // InternalLPSolve.g:884:6: (enumLiteral_2= '>=' )
                    // InternalLPSolve.g:884:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalLPSolve.g:890:6: (enumLiteral_3= '<' )
                    {
                    // InternalLPSolve.g:890:6: (enumLiteral_3= '<' )
                    // InternalLPSolve.g:890:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalLPSolve.g:896:6: (enumLiteral_4= '<=' )
                    {
                    // InternalLPSolve.g:896:6: (enumLiteral_4= '<=' )
                    // InternalLPSolve.g:896:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,21,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:906:1: ruleILPDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) ) ;
    public final Enumerator ruleILPDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalLPSolve.g:908:28: ( ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) ) )
            // InternalLPSolve.g:909:1: ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) )
            {
            // InternalLPSolve.g:909:1: ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) )
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
                    // InternalLPSolve.g:909:2: (enumLiteral_0= 'bin' )
                    {
                    // InternalLPSolve.g:909:2: (enumLiteral_0= 'bin' )
                    // InternalLPSolve.g:909:4: enumLiteral_0= 'bin'
                    {
                    enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:915:6: (enumLiteral_1= 'int' )
                    {
                    // InternalLPSolve.g:915:6: (enumLiteral_1= 'int' )
                    // InternalLPSolve.g:915:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,23,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalLPSolve.g:921:6: (enumLiteral_2= 'real' )
                    {
                    // InternalLPSolve.g:921:6: (enumLiteral_2= 'real' )
                    // InternalLPSolve.g:921:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,24,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:931:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalLPSolve.g:933:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalLPSolve.g:934:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalLPSolve.g:934:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // InternalLPSolve.g:934:2: (enumLiteral_0= '+' )
                    {
                    // InternalLPSolve.g:934:2: (enumLiteral_0= '+' )
                    // InternalLPSolve.g:934:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalLPSolve.g:940:6: (enumLiteral_1= '-' )
                    {
                    // InternalLPSolve.g:940:6: (enumLiteral_1= '-' )
                    // InternalLPSolve.g:940:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,16,FollowSets000.FOLLOW_2); 

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
    // InternalLPSolve.g:950:1: ruleMultiplicationOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalLPSolve.g:952:28: ( (enumLiteral_0= '*' ) )
            // InternalLPSolve.g:953:1: (enumLiteral_0= '*' )
            {
            // InternalLPSolve.g:953:1: (enumLiteral_0= '*' )
            // InternalLPSolve.g:953:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); 

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
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\4\1\15\1\uffff\1\4\1\uffff\1\15\1\4\1\15";
    static final String dfa_3s = "\1\20\1\32\1\uffff\1\5\1\uffff\3\32";
    static final String dfa_4s = "\2\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\12\uffff\1\2",
            "\1\4\1\uffff\1\3\6\2\3\uffff\2\2",
            "",
            "\1\5\1\6",
            "",
            "\1\4\1\uffff\1\3\6\2\3\uffff\2\2",
            "\1\7\10\uffff\1\4\1\uffff\1\3\6\2\3\uffff\2\2",
            "\1\4\1\uffff\1\3\6\2\3\uffff\2\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "239:2: ( ( (lv_comment_0_0= ruleVariableID ) ) otherlv_1= ':' )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001C10032L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001C00002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008012L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002010002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    }


}