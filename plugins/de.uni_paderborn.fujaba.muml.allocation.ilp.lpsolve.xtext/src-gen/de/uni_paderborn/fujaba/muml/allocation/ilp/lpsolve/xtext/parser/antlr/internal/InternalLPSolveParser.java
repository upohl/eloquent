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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "';'", "'min'", "'max'", "'='", "'>'", "'>='", "'<'", "'<='", "'bin'", "'int'", "'real'", "'+'", "'-'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=5;

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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)) ) {
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

                if ( ((LA2_0>=21 && LA2_0<=23)) ) {
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:152:1: ruleObjectiveFunctionExpression returns [EObject current=null] : ( ( (lv_goal_0_0= ruleObjectiveGoal ) ) otherlv_1= ':' ( (lv_objectiveFunction_2_0= ruleLinearExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleObjectiveFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_goal_0_0 = null;

        EObject lv_objectiveFunction_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:155:28: ( ( ( (lv_goal_0_0= ruleObjectiveGoal ) ) otherlv_1= ':' ( (lv_objectiveFunction_2_0= ruleLinearExpression ) )? otherlv_3= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:1: ( ( (lv_goal_0_0= ruleObjectiveGoal ) ) otherlv_1= ':' ( (lv_objectiveFunction_2_0= ruleLinearExpression ) )? otherlv_3= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:1: ( ( (lv_goal_0_0= ruleObjectiveGoal ) ) otherlv_1= ':' ( (lv_objectiveFunction_2_0= ruleLinearExpression ) )? otherlv_3= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:2: ( (lv_goal_0_0= ruleObjectiveGoal ) ) otherlv_1= ':' ( (lv_objectiveFunction_2_0= ruleLinearExpression ) )? otherlv_3= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:156:2: ( (lv_goal_0_0= ruleObjectiveGoal ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:157:1: (lv_goal_0_0= ruleObjectiveGoal )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:157:1: (lv_goal_0_0= ruleObjectiveGoal )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:158:3: lv_goal_0_0= ruleObjectiveGoal
            {
             
            	        newCompositeNode(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveGoal_in_ruleObjectiveFunctionExpression267);
            lv_goal_0_0=ruleObjectiveGoal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjectiveFunctionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"goal",
                    		lv_goal_0_0, 
                    		"ObjectiveGoal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleObjectiveFunctionExpression279); 

                	newLeafNode(otherlv_1, grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:178:1: ( (lv_objectiveFunction_2_0= ruleLinearExpression ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:179:1: (lv_objectiveFunction_2_0= ruleLinearExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:179:1: (lv_objectiveFunction_2_0= ruleLinearExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:180:3: lv_objectiveFunction_2_0= ruleLinearExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_ruleObjectiveFunctionExpression300);
                    lv_objectiveFunction_2_0=ruleLinearExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjectiveFunctionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"objectiveFunction",
                            		lv_objectiveFunction_2_0, 
                            		"LinearExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleObjectiveFunctionExpression313); 

                	newLeafNode(otherlv_3, grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_3());
                

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:208:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:209:2: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:210:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
             newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression349);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;

             current =iv_ruleConstraintExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraintExpression359); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:217:1: ruleConstraintExpression returns [EObject current=null] : ( ( ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleConstraintExpression() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_leftExpression_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:220:28: ( ( ( ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:221:1: ( ( ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:221:1: ( ( ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:221:2: ( ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) ) ( (lv_operator_3_0= ruleComparingOperator ) ) ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) ) otherlv_5= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:221:2: ( ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:221:3: ( (lv_comment_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:221:3: ( (lv_comment_0_0= RULE_ID ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:222:1: (lv_comment_0_0= RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:222:1: (lv_comment_0_0= RULE_ID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:223:3: lv_comment_0_0= RULE_ID
                    {
                    lv_comment_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstraintExpression402); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getConstraintExpressionAccess().getCommentIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstraintExpression419); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:243:3: ( (lv_leftExpression_2_0= ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:244:1: (lv_leftExpression_2_0= ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:244:1: (lv_leftExpression_2_0= ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:245:3: lv_leftExpression_2_0= ruleSimpleLinearExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression442);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:261:2: ( (lv_operator_3_0= ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:262:1: (lv_operator_3_0= ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:262:1: (lv_operator_3_0= ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:263:3: lv_operator_3_0= ruleComparingOperator
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_ruleConstraintExpression463);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:279:2: ( (lv_rightExpression_4_0= ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:280:1: (lv_rightExpression_4_0= ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:280:1: (lv_rightExpression_4_0= ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:281:3: lv_rightExpression_4_0= ruleSimpleLinearExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression484);
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstraintExpression496); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:309:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:310:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:311:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable532);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable542); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:318:1: ruleVariable returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_dataType_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:321:28: ( ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:322:1: ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:322:1: ( ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:322:2: ( (lv_dataType_0_0= ruleILPDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:322:2: ( (lv_dataType_0_0= ruleILPDataType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:323:1: (lv_dataType_0_0= ruleILPDataType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:323:1: (lv_dataType_0_0= ruleILPDataType )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:324:3: lv_dataType_0_0= ruleILPDataType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleILPDataType_in_ruleVariable588);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:340:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:341:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:341:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:342:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariable605); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariable622); 

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


    // $ANTLR start "entryRuleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:370:1: entryRuleLinearExpression returns [EObject current=null] : iv_ruleLinearExpression= ruleLinearExpression EOF ;
    public final EObject entryRuleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinearExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:371:2: (iv_ruleLinearExpression= ruleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:372:2: iv_ruleLinearExpression= ruleLinearExpression EOF
            {
             newCompositeNode(grammarAccess.getLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression658);
            iv_ruleLinearExpression=ruleLinearExpression();

            state._fsp--;

             current =iv_ruleLinearExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinearExpression668); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:379:1: ruleLinearExpression returns [EObject current=null] : this_SimpleLinearExpression_0= ruleSimpleLinearExpression ;
    public final EObject ruleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleLinearExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:382:28: (this_SimpleLinearExpression_0= ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:384:5: this_SimpleLinearExpression_0= ruleSimpleLinearExpression
            {
             
                    newCompositeNode(grammarAccess.getLinearExpressionAccess().getSimpleLinearExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression714);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:400:1: entryRuleSimpleLinearExpression returns [EObject current=null] : iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF ;
    public final EObject entryRuleSimpleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLinearExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:401:2: (iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:402:2: iv_ruleSimpleLinearExpression= ruleSimpleLinearExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression748);
            iv_ruleSimpleLinearExpression=ruleSimpleLinearExpression();

            state._fsp--;

             current =iv_ruleSimpleLinearExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleLinearExpression758); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:409:1: ruleSimpleLinearExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleSimpleLinearExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:412:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:414:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getSimpleLinearExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression804);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:430:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:431:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:432:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression838);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression848); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:439:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:442:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:443:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:443:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:444:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression895);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:452:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=24 && LA5_0<=25)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:452:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleLinearExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:452:2: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:453:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:458:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:459:1: (lv_operator_2_0= ruleAdditionOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:459:1: (lv_operator_2_0= ruleAdditionOperator )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:460:3: lv_operator_2_0= ruleAdditionOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression925);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:476:2: ( (lv_rightExpression_3_0= ruleLinearExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:477:1: (lv_rightExpression_3_0= ruleLinearExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:477:1: (lv_rightExpression_3_0= ruleLinearExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:478:3: lv_rightExpression_3_0= ruleLinearExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_ruleAdditionExpression946);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:502:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:503:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:504:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression984);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression994); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:511:1: ruleMultiplicationExpression returns [EObject current=null] : (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Operand_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:514:28: ( (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:515:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:515:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:516:5: this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression1041);
            this_Operand_0=ruleOperand();

            state._fsp--;

             
                    current = this_Operand_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:524:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:524:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_3_0= ruleOperand ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:524:2: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:525:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:530:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:531:1: (lv_operator_2_0= ruleMultiplicationOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:531:1: (lv_operator_2_0= ruleMultiplicationOperator )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:532:3: lv_operator_2_0= ruleMultiplicationOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression1071);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:548:2: ( (lv_rightExpression_3_0= ruleOperand ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:549:1: (lv_rightExpression_3_0= ruleOperand )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:549:1: (lv_rightExpression_3_0= ruleOperand )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:550:3: lv_rightExpression_3_0= ruleOperand
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression1092);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:574:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:575:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:576:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand1130);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand1140); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:583:1: ruleOperand returns [EObject current=null] : (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpression_0 = null;

        EObject this_VariableExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:586:28: ( (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:587:1: (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:587:1: (this_NumberLiteralExpression_0= ruleNumberLiteralExpression | this_VariableExpression_1= ruleVariableExpression )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_DECIMAL && LA7_0<=RULE_INT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:588:5: this_NumberLiteralExpression_0= ruleNumberLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_ruleOperand1187);
                    this_NumberLiteralExpression_0=ruleNumberLiteralExpression();

                    state._fsp--;

                     
                            current = this_NumberLiteralExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:598:5: this_VariableExpression_1= ruleVariableExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_ruleOperand1214);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:614:1: entryRuleNumberLiteralExpression returns [EObject current=null] : iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF ;
    public final EObject entryRuleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:615:2: (iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:616:2: iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression1249);
            iv_ruleNumberLiteralExpression=ruleNumberLiteralExpression();

            state._fsp--;

             current =iv_ruleNumberLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpression1259); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:623:1: ruleNumberLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:626:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:627:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:627:1: ( (lv_value_0_0= ruleNumber ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:628:1: (lv_value_0_0= ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:628:1: (lv_value_0_0= ruleNumber )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:629:3: lv_value_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleNumberLiteralExpression1304);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:653:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:654:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:655:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber1340);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber1351); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:662:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DECIMAL_0= RULE_DECIMAL | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:665:28: ( (this_DECIMAL_0= RULE_DECIMAL | this_INT_1= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:666:1: (this_DECIMAL_0= RULE_DECIMAL | this_INT_1= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:666:1: (this_DECIMAL_0= RULE_DECIMAL | this_INT_1= RULE_INT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DECIMAL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:666:6: this_DECIMAL_0= RULE_DECIMAL
                    {
                    this_DECIMAL_0=(Token)match(input,RULE_DECIMAL,FollowSets000.FOLLOW_RULE_DECIMAL_in_ruleNumber1391); 

                    		current.merge(this_DECIMAL_0);
                        
                     
                        newLeafNode(this_DECIMAL_0, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:674:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNumber1417); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:689:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:690:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:691:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression1462);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableExpression1472); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:698:1: ruleVariableExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:701:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:702:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:702:1: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:703:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:703:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:704:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableExpression1516); 

            		newLeafNode(otherlv_0, grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            	

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:723:1: ruleObjectiveGoal returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) ) ;
    public final Enumerator ruleObjectiveGoal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:725:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:726:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:726:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:726:2: (enumLiteral_0= 'min' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:726:2: (enumLiteral_0= 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:726:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleObjectiveGoal1565); 

                            current = grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:732:6: (enumLiteral_1= 'max' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:732:6: (enumLiteral_1= 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:732:8: enumLiteral_1= 'max'
                    {
                    enumLiteral_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleObjectiveGoal1582); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:742:1: ruleComparingOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:744:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:745:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:745:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:745:2: (enumLiteral_0= '=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:745:2: (enumLiteral_0= '=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:745:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComparingOperator1627); 

                            current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:751:6: (enumLiteral_1= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:751:6: (enumLiteral_1= '>' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:751:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComparingOperator1644); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:757:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:757:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:757:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComparingOperator1661); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:763:6: (enumLiteral_3= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:763:6: (enumLiteral_3= '<' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:763:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComparingOperator1678); 

                            current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:769:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:769:6: (enumLiteral_4= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:769:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleComparingOperator1695); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:779:1: ruleILPDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) ) ;
    public final Enumerator ruleILPDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:781:28: ( ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:782:1: ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:782:1: ( (enumLiteral_0= 'bin' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:782:2: (enumLiteral_0= 'bin' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:782:2: (enumLiteral_0= 'bin' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:782:4: enumLiteral_0= 'bin'
                    {
                    enumLiteral_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleILPDataType1740); 

                            current = grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:788:6: (enumLiteral_1= 'int' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:788:6: (enumLiteral_1= 'int' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:788:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleILPDataType1757); 

                            current = grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:794:6: (enumLiteral_2= 'real' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:794:6: (enumLiteral_2= 'real' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:794:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleILPDataType1774); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:804:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:806:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:807:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:807:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:807:2: (enumLiteral_0= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:807:2: (enumLiteral_0= '+' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:807:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAdditionOperator1819); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:813:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:813:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:813:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAdditionOperator1836); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:823:1: ruleMultiplicationOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:825:28: ( (enumLiteral_0= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:826:1: (enumLiteral_0= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:826:1: (enumLiteral_0= '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/parser/antlr/internal/InternalLPSolve.g:826:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiplicationOperator1880); 

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntegerLinearProgram_in_entryRuleIntegerLinearProgram75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLinearProgram85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_ruleIntegerLinearProgram131 = new BitSet(new long[]{0x0000000000E00072L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleIntegerLinearProgram152 = new BitSet(new long[]{0x0000000000E00072L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleIntegerLinearProgram174 = new BitSet(new long[]{0x0000000000E00002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_entryRuleObjectiveFunctionExpression211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectiveFunctionExpression221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveGoal_in_ruleObjectiveFunctionExpression267 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleObjectiveFunctionExpression279 = new BitSet(new long[]{0x0000000000002070L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_ruleObjectiveFunctionExpression300 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleObjectiveFunctionExpression313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintExpression402 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstraintExpression419 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression442 = new BitSet(new long[]{0x00000000001F0000L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_ruleConstraintExpression463 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleConstraintExpression484 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstraintExpression496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleILPDataType_in_ruleVariable588 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariable605 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariable622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinearExpression668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLinearExpression758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression895 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression925 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_ruleAdditionExpression946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression1041 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression1071 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand1130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_ruleOperand1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_ruleOperand1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression1249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpression1259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteralExpression1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression1462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableExpression1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleObjectiveGoal1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleObjectiveGoal1582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleComparingOperator1627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleComparingOperator1644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleComparingOperator1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleComparingOperator1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleComparingOperator1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleILPDataType1740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleILPDataType1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleILPDataType1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAdditionOperator1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAdditionOperator1836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMultiplicationOperator1880 = new BitSet(new long[]{0x0000000000000002L});
    }


}