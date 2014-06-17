package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLPSolveParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMAL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'min'", "'max'", "'='", "'>'", "'>='", "'<'", "'<='", "'bin'", "'int'", "'real'", "'+'", "'-'", "':'", "';'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=4;

    // delegates
    // delegators


        public InternalLPSolveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLPSolveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLPSolveParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g"; }


     
     	private LPSolveGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LPSolveGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleIntegerLinearProgram"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:60:1: entryRuleIntegerLinearProgram : ruleIntegerLinearProgram EOF ;
    public final void entryRuleIntegerLinearProgram() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:61:1: ( ruleIntegerLinearProgram EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:62:1: ruleIntegerLinearProgram EOF
            {
             before(grammarAccess.getIntegerLinearProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLinearProgram_in_entryRuleIntegerLinearProgram61);
            ruleIntegerLinearProgram();

            state._fsp--;

             after(grammarAccess.getIntegerLinearProgramRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLinearProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLinearProgram"


    // $ANTLR start "ruleIntegerLinearProgram"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:69:1: ruleIntegerLinearProgram : ( ( rule__IntegerLinearProgram__Group__0 ) ) ;
    public final void ruleIntegerLinearProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:73:2: ( ( ( rule__IntegerLinearProgram__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:74:1: ( ( rule__IntegerLinearProgram__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:74:1: ( ( rule__IntegerLinearProgram__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:75:1: ( rule__IntegerLinearProgram__Group__0 )
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:76:1: ( rule__IntegerLinearProgram__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:76:2: rule__IntegerLinearProgram__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__0_in_ruleIntegerLinearProgram94);
            rule__IntegerLinearProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLinearProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLinearProgram"


    // $ANTLR start "entryRuleObjectiveFunctionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:88:1: entryRuleObjectiveFunctionExpression : ruleObjectiveFunctionExpression EOF ;
    public final void entryRuleObjectiveFunctionExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:89:1: ( ruleObjectiveFunctionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:90:1: ruleObjectiveFunctionExpression EOF
            {
             before(grammarAccess.getObjectiveFunctionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_entryRuleObjectiveFunctionExpression121);
            ruleObjectiveFunctionExpression();

            state._fsp--;

             after(grammarAccess.getObjectiveFunctionExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObjectiveFunctionExpression128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectiveFunctionExpression"


    // $ANTLR start "ruleObjectiveFunctionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:97:1: ruleObjectiveFunctionExpression : ( ( rule__ObjectiveFunctionExpression__Group__0 ) ) ;
    public final void ruleObjectiveFunctionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:101:2: ( ( ( rule__ObjectiveFunctionExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:102:1: ( ( rule__ObjectiveFunctionExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:102:1: ( ( rule__ObjectiveFunctionExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:103:1: ( rule__ObjectiveFunctionExpression__Group__0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:104:1: ( rule__ObjectiveFunctionExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:104:2: rule__ObjectiveFunctionExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__0_in_ruleObjectiveFunctionExpression154);
            rule__ObjectiveFunctionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectiveFunctionExpression"


    // $ANTLR start "entryRuleConstraintExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:116:1: entryRuleConstraintExpression : ruleConstraintExpression EOF ;
    public final void entryRuleConstraintExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:117:1: ( ruleConstraintExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:118:1: ruleConstraintExpression EOF
            {
             before(grammarAccess.getConstraintExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression181);
            ruleConstraintExpression();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraintExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:125:1: ruleConstraintExpression : ( ( rule__ConstraintExpression__Group__0 ) ) ;
    public final void ruleConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:129:2: ( ( ( rule__ConstraintExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:130:1: ( ( rule__ConstraintExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:130:1: ( ( rule__ConstraintExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:131:1: ( rule__ConstraintExpression__Group__0 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:132:1: ( rule__ConstraintExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:132:2: rule__ConstraintExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression214);
            rule__ConstraintExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleVariable"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:144:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:145:1: ( ruleVariable EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:146:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable241);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:153:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:157:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:158:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:158:1: ( ( rule__Variable__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:159:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:160:1: ( rule__Variable__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:160:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable274);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:172:1: entryRuleLinearExpression : ruleLinearExpression EOF ;
    public final void entryRuleLinearExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:173:1: ( ruleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:174:1: ruleLinearExpression EOF
            {
             before(grammarAccess.getLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression301);
            ruleLinearExpression();

            state._fsp--;

             after(grammarAccess.getLinearExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinearExpression308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinearExpression"


    // $ANTLR start "ruleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:181:1: ruleLinearExpression : ( ruleSimpleLinearExpression ) ;
    public final void ruleLinearExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:185:2: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:186:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:186:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:187:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getLinearExpressionAccess().getSimpleLinearExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression334);
            ruleSimpleLinearExpression();

            state._fsp--;

             after(grammarAccess.getLinearExpressionAccess().getSimpleLinearExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinearExpression"


    // $ANTLR start "entryRuleSimpleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:200:1: entryRuleSimpleLinearExpression : ruleSimpleLinearExpression EOF ;
    public final void entryRuleSimpleLinearExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:201:1: ( ruleSimpleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:202:1: ruleSimpleLinearExpression EOF
            {
             before(grammarAccess.getSimpleLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression360);
            ruleSimpleLinearExpression();

            state._fsp--;

             after(grammarAccess.getSimpleLinearExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleLinearExpression367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleLinearExpression"


    // $ANTLR start "ruleSimpleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:209:1: ruleSimpleLinearExpression : ( ruleAdditionExpression ) ;
    public final void ruleSimpleLinearExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:213:2: ( ( ruleAdditionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:214:1: ( ruleAdditionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:214:1: ( ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:215:1: ruleAdditionExpression
            {
             before(grammarAccess.getSimpleLinearExpressionAccess().getAdditionExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression393);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getSimpleLinearExpressionAccess().getAdditionExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleLinearExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:228:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:229:1: ( ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:230:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression419);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression426); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:237:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:241:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:242:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:242:1: ( ( rule__AdditionExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:243:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:244:1: ( rule__AdditionExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:244:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression452);
            rule__AdditionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:256:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:257:1: ( ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:258:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression479);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression486); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:265:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:269:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:270:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:270:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:271:1: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:272:1: ( rule__MultiplicationExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:272:2: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression512);
            rule__MultiplicationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleOperand"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:284:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:285:1: ( ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:286:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand539);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand546); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:293:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:297:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:298:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:298:1: ( ( rule__Operand__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:299:1: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:300:1: ( rule__Operand__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:300:2: rule__Operand__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operand__Alternatives_in_ruleOperand572);
            rule__Operand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleNumberLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:312:1: entryRuleNumberLiteralExpression : ruleNumberLiteralExpression EOF ;
    public final void entryRuleNumberLiteralExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:313:1: ( ruleNumberLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:314:1: ruleNumberLiteralExpression EOF
            {
             before(grammarAccess.getNumberLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression599);
            ruleNumberLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNumberLiteralExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpression606); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteralExpression"


    // $ANTLR start "ruleNumberLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:321:1: ruleNumberLiteralExpression : ( ( rule__NumberLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNumberLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:325:2: ( ( ( rule__NumberLiteralExpression__ValueAssignment ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:326:1: ( ( rule__NumberLiteralExpression__ValueAssignment ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:326:1: ( ( rule__NumberLiteralExpression__ValueAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:327:1: ( rule__NumberLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralExpressionAccess().getValueAssignment()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:328:1: ( rule__NumberLiteralExpression__ValueAssignment )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:328:2: rule__NumberLiteralExpression__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberLiteralExpression__ValueAssignment_in_ruleNumberLiteralExpression632);
            rule__NumberLiteralExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteralExpression"


    // $ANTLR start "entryRuleNumber"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:340:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:341:1: ( ruleNumber EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:342:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber659);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:349:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:353:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:354:1: ( ( rule__Number__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:354:1: ( ( rule__Number__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:355:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:356:1: ( rule__Number__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:356:2: rule__Number__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Alternatives_in_ruleNumber692);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:368:1: entryRuleVariableExpression : ruleVariableExpression EOF ;
    public final void entryRuleVariableExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:369:1: ( ruleVariableExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:370:1: ruleVariableExpression EOF
            {
             before(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression719);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableExpression726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:377:1: ruleVariableExpression : ( ( rule__VariableExpression__VariableAssignment ) ) ;
    public final void ruleVariableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:381:2: ( ( ( rule__VariableExpression__VariableAssignment ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:382:1: ( ( rule__VariableExpression__VariableAssignment ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:382:1: ( ( rule__VariableExpression__VariableAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:383:1: ( rule__VariableExpression__VariableAssignment )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableAssignment()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:384:1: ( rule__VariableExpression__VariableAssignment )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:384:2: rule__VariableExpression__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableExpression__VariableAssignment_in_ruleVariableExpression752);
            rule__VariableExpression__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpressionAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "ruleObjectiveGoal"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:397:1: ruleObjectiveGoal : ( ( rule__ObjectiveGoal__Alternatives ) ) ;
    public final void ruleObjectiveGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:401:1: ( ( ( rule__ObjectiveGoal__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:402:1: ( ( rule__ObjectiveGoal__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:402:1: ( ( rule__ObjectiveGoal__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:403:1: ( rule__ObjectiveGoal__Alternatives )
            {
             before(grammarAccess.getObjectiveGoalAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:404:1: ( rule__ObjectiveGoal__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:404:2: rule__ObjectiveGoal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveGoal__Alternatives_in_ruleObjectiveGoal789);
            rule__ObjectiveGoal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveGoalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectiveGoal"


    // $ANTLR start "ruleComparingOperator"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:416:1: ruleComparingOperator : ( ( rule__ComparingOperator__Alternatives ) ) ;
    public final void ruleComparingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:420:1: ( ( ( rule__ComparingOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:421:1: ( ( rule__ComparingOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:421:1: ( ( rule__ComparingOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:422:1: ( rule__ComparingOperator__Alternatives )
            {
             before(grammarAccess.getComparingOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:423:1: ( rule__ComparingOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:423:2: rule__ComparingOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator825);
            rule__ComparingOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparingOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparingOperator"


    // $ANTLR start "ruleILPDataType"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:435:1: ruleILPDataType : ( ( rule__ILPDataType__Alternatives ) ) ;
    public final void ruleILPDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:439:1: ( ( ( rule__ILPDataType__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:440:1: ( ( rule__ILPDataType__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:440:1: ( ( rule__ILPDataType__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:441:1: ( rule__ILPDataType__Alternatives )
            {
             before(grammarAccess.getILPDataTypeAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:442:1: ( rule__ILPDataType__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:442:2: rule__ILPDataType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ILPDataType__Alternatives_in_ruleILPDataType861);
            rule__ILPDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getILPDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleILPDataType"


    // $ANTLR start "ruleAdditionOperator"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:454:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:458:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:459:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:459:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:460:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:461:1: ( rule__AdditionOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:461:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator897);
            rule__AdditionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:473:1: ruleMultiplicationOperator : ( ( '*' ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:477:1: ( ( ( '*' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:478:1: ( ( '*' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:478:1: ( ( '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:479:1: ( '*' )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:480:1: ( '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:480:3: '*'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiplicationOperator934); 

            }

             after(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "rule__Operand__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:492:1: rule__Operand__Alternatives : ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:496:1: ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_DECIMAL && LA1_0<=RULE_INT)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:497:1: ( ruleNumberLiteralExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:497:1: ( ruleNumberLiteralExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:498:1: ruleNumberLiteralExpression
                    {
                     before(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives971);
                    ruleNumberLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:503:6: ( ruleVariableExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:503:6: ( ruleVariableExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:504:1: ruleVariableExpression
                    {
                     before(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives988);
                    ruleVariableExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:514:1: rule__Number__Alternatives : ( ( RULE_DECIMAL ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:518:1: ( ( RULE_DECIMAL ) | ( RULE_INT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DECIMAL) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:519:1: ( RULE_DECIMAL )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:519:1: ( RULE_DECIMAL )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:520:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 
                    match(input,RULE_DECIMAL,FollowSets000.FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives1020); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:525:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:525:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:526:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Number__Alternatives1037); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__ObjectiveGoal__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:536:1: rule__ObjectiveGoal__Alternatives : ( ( ( 'min' ) ) | ( ( 'max' ) ) );
    public final void rule__ObjectiveGoal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:540:1: ( ( ( 'min' ) ) | ( ( 'max' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:541:1: ( ( 'min' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:541:1: ( ( 'min' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:542:1: ( 'min' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:543:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:543:3: 'min'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1070); 

                    }

                     after(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:548:6: ( ( 'max' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:548:6: ( ( 'max' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:549:1: ( 'max' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:550:1: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:550:3: 'max'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ObjectiveGoal__Alternatives1091); 

                    }

                     after(grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveGoal__Alternatives"


    // $ANTLR start "rule__ComparingOperator__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:560:1: rule__ComparingOperator__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:564:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:565:1: ( ( '=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:565:1: ( ( '=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:566:1: ( '=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:567:1: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:567:3: '='
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ComparingOperator__Alternatives1127); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:572:6: ( ( '>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:572:6: ( ( '>' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:573:1: ( '>' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:574:1: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:574:3: '>'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ComparingOperator__Alternatives1148); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:579:6: ( ( '>=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:579:6: ( ( '>=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:580:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:581:1: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:581:3: '>='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ComparingOperator__Alternatives1169); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:586:6: ( ( '<' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:586:6: ( ( '<' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:587:1: ( '<' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:588:1: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:588:3: '<'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ComparingOperator__Alternatives1190); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:593:6: ( ( '<=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:593:6: ( ( '<=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:594:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:595:1: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:595:3: '<='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ComparingOperator__Alternatives1211); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparingOperator__Alternatives"


    // $ANTLR start "rule__ILPDataType__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:605:1: rule__ILPDataType__Alternatives : ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) );
    public final void rule__ILPDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:609:1: ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:610:1: ( ( 'bin' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:610:1: ( ( 'bin' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:611:1: ( 'bin' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:612:1: ( 'bin' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:612:3: 'bin'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ILPDataType__Alternatives1247); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:617:6: ( ( 'int' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:617:6: ( ( 'int' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:618:1: ( 'int' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:619:1: ( 'int' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:619:3: 'int'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ILPDataType__Alternatives1268); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:624:6: ( ( 'real' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:624:6: ( ( 'real' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:625:1: ( 'real' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:626:1: ( 'real' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:626:3: 'real'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ILPDataType__Alternatives1289); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ILPDataType__Alternatives"


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:636:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:640:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:641:1: ( ( '+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:641:1: ( ( '+' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:642:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:643:1: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:643:3: '+'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__AdditionOperator__Alternatives1325); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:648:6: ( ( '-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:648:6: ( ( '-' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:649:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:650:1: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:650:3: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AdditionOperator__Alternatives1346); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionOperator__Alternatives"


    // $ANTLR start "rule__IntegerLinearProgram__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:662:1: rule__IntegerLinearProgram__Group__0 : rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 ;
    public final void rule__IntegerLinearProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:666:1: ( rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:667:2: rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01379);
            rule__IntegerLinearProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01382);
            rule__IntegerLinearProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__Group__0"


    // $ANTLR start "rule__IntegerLinearProgram__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:674:1: rule__IntegerLinearProgram__Group__0__Impl : ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) ;
    public final void rule__IntegerLinearProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:678:1: ( ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:679:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:679:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:680:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:681:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:681:2: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1409);
            rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__Group__0__Impl"


    // $ANTLR start "rule__IntegerLinearProgram__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:691:1: rule__IntegerLinearProgram__Group__1 : rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 ;
    public final void rule__IntegerLinearProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:695:1: ( rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:696:2: rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11439);
            rule__IntegerLinearProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11442);
            rule__IntegerLinearProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__Group__1"


    // $ANTLR start "rule__IntegerLinearProgram__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:703:1: rule__IntegerLinearProgram__Group__1__Impl : ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) ;
    public final void rule__IntegerLinearProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:707:1: ( ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:708:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:708:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:709:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:710:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_DECIMAL && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:710:2: rule__IntegerLinearProgram__ConstraintsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1469);
            	    rule__IntegerLinearProgram__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getIntegerLinearProgramAccess().getConstraintsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__Group__1__Impl"


    // $ANTLR start "rule__IntegerLinearProgram__Group__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:720:1: rule__IntegerLinearProgram__Group__2 : rule__IntegerLinearProgram__Group__2__Impl ;
    public final void rule__IntegerLinearProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:724:1: ( rule__IntegerLinearProgram__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:725:2: rule__IntegerLinearProgram__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21500);
            rule__IntegerLinearProgram__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__Group__2"


    // $ANTLR start "rule__IntegerLinearProgram__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:731:1: rule__IntegerLinearProgram__Group__2__Impl : ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) ;
    public final void rule__IntegerLinearProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:735:1: ( ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:736:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:736:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:737:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:738:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:738:2: rule__IntegerLinearProgram__VariablesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1527);
            	    rule__IntegerLinearProgram__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntegerLinearProgramAccess().getVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__Group__2__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:754:1: rule__ObjectiveFunctionExpression__Group__0 : rule__ObjectiveFunctionExpression__Group__0__Impl rule__ObjectiveFunctionExpression__Group__1 ;
    public final void rule__ObjectiveFunctionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:758:1: ( rule__ObjectiveFunctionExpression__Group__0__Impl rule__ObjectiveFunctionExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:759:2: rule__ObjectiveFunctionExpression__Group__0__Impl rule__ObjectiveFunctionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__0__Impl_in_rule__ObjectiveFunctionExpression__Group__01564);
            rule__ObjectiveFunctionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__1_in_rule__ObjectiveFunctionExpression__Group__01567);
            rule__ObjectiveFunctionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__0"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:766:1: rule__ObjectiveFunctionExpression__Group__0__Impl : ( ( rule__ObjectiveFunctionExpression__GoalAssignment_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:770:1: ( ( ( rule__ObjectiveFunctionExpression__GoalAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:771:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:771:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:772:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:773:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:773:2: rule__ObjectiveFunctionExpression__GoalAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_0_in_rule__ObjectiveFunctionExpression__Group__0__Impl1594);
            rule__ObjectiveFunctionExpression__GoalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__0__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:783:1: rule__ObjectiveFunctionExpression__Group__1 : rule__ObjectiveFunctionExpression__Group__1__Impl rule__ObjectiveFunctionExpression__Group__2 ;
    public final void rule__ObjectiveFunctionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:787:1: ( rule__ObjectiveFunctionExpression__Group__1__Impl rule__ObjectiveFunctionExpression__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:788:2: rule__ObjectiveFunctionExpression__Group__1__Impl rule__ObjectiveFunctionExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__1__Impl_in_rule__ObjectiveFunctionExpression__Group__11624);
            rule__ObjectiveFunctionExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__2_in_rule__ObjectiveFunctionExpression__Group__11627);
            rule__ObjectiveFunctionExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__1"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:795:1: rule__ObjectiveFunctionExpression__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:799:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:800:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:800:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:801:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group__1__Impl1655); 
             after(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__1__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:814:1: rule__ObjectiveFunctionExpression__Group__2 : rule__ObjectiveFunctionExpression__Group__2__Impl rule__ObjectiveFunctionExpression__Group__3 ;
    public final void rule__ObjectiveFunctionExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:818:1: ( rule__ObjectiveFunctionExpression__Group__2__Impl rule__ObjectiveFunctionExpression__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:819:2: rule__ObjectiveFunctionExpression__Group__2__Impl rule__ObjectiveFunctionExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__2__Impl_in_rule__ObjectiveFunctionExpression__Group__21686);
            rule__ObjectiveFunctionExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__3_in_rule__ObjectiveFunctionExpression__Group__21689);
            rule__ObjectiveFunctionExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__2"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:826:1: rule__ObjectiveFunctionExpression__Group__2__Impl : ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 )? ) ;
    public final void rule__ObjectiveFunctionExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:830:1: ( ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:831:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:831:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:832:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 )?
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:833:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_DECIMAL && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:833:2: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2_in_rule__ObjectiveFunctionExpression__Group__2__Impl1716);
                    rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__2__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__3"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:843:1: rule__ObjectiveFunctionExpression__Group__3 : rule__ObjectiveFunctionExpression__Group__3__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:847:1: ( rule__ObjectiveFunctionExpression__Group__3__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:848:2: rule__ObjectiveFunctionExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group__3__Impl_in_rule__ObjectiveFunctionExpression__Group__31747);
            rule__ObjectiveFunctionExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__3"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:854:1: rule__ObjectiveFunctionExpression__Group__3__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:858:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:859:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:859:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:860:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group__3__Impl1775); 
             after(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group__3__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:881:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:885:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:886:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__01814);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__01817);
            rule__ConstraintExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__0"


    // $ANTLR start "rule__ConstraintExpression__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:893:1: rule__ConstraintExpression__Group__0__Impl : ( ( rule__ConstraintExpression__Group_0__0 )? ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:897:1: ( ( ( rule__ConstraintExpression__Group_0__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:898:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:898:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:899:1: ( rule__ConstraintExpression__Group_0__0 )?
            {
             before(grammarAccess.getConstraintExpressionAccess().getGroup_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:900:1: ( rule__ConstraintExpression__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==25) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:900:2: rule__ConstraintExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl1844);
                    rule__ConstraintExpression__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintExpressionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:910:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:914:1: ( rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:915:2: rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__11875);
            rule__ConstraintExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__11878);
            rule__ConstraintExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__1"


    // $ANTLR start "rule__ConstraintExpression__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:922:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:926:1: ( ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:927:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:927:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:928:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:929:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:929:2: rule__ConstraintExpression__LeftExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl1905);
            rule__ConstraintExpression__LeftExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintExpressionAccess().getLeftExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__1__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:939:1: rule__ConstraintExpression__Group__2 : rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 ;
    public final void rule__ConstraintExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:943:1: ( rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:944:2: rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__21935);
            rule__ConstraintExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__21938);
            rule__ConstraintExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__2"


    // $ANTLR start "rule__ConstraintExpression__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:951:1: rule__ConstraintExpression__Group__2__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) ;
    public final void rule__ConstraintExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:955:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:956:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:956:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:957:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:958:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:958:2: rule__ConstraintExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl1965);
            rule__ConstraintExpression__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__2__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__3"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:968:1: rule__ConstraintExpression__Group__3 : rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 ;
    public final void rule__ConstraintExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:972:1: ( rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:973:2: rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__31995);
            rule__ConstraintExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__31998);
            rule__ConstraintExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__3"


    // $ANTLR start "rule__ConstraintExpression__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:980:1: rule__ConstraintExpression__Group__3__Impl : ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) ;
    public final void rule__ConstraintExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:984:1: ( ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:985:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:985:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:986:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionAssignment_3()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:987:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:987:2: rule__ConstraintExpression__RightExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2025);
            rule__ConstraintExpression__RightExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintExpressionAccess().getRightExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__3__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__4"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:997:1: rule__ConstraintExpression__Group__4 : rule__ConstraintExpression__Group__4__Impl ;
    public final void rule__ConstraintExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1001:1: ( rule__ConstraintExpression__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1002:2: rule__ConstraintExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42055);
            rule__ConstraintExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__4"


    // $ANTLR start "rule__ConstraintExpression__Group__4__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1008:1: rule__ConstraintExpression__Group__4__Impl : ( ';' ) ;
    public final void rule__ConstraintExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1012:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1013:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1013:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1014:1: ';'
            {
             before(grammarAccess.getConstraintExpressionAccess().getSemicolonKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConstraintExpression__Group__4__Impl2083); 
             after(grammarAccess.getConstraintExpressionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__4__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_0__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1037:1: rule__ConstraintExpression__Group_0__0 : rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 ;
    public final void rule__ConstraintExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1041:1: ( rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1042:2: rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02124);
            rule__ConstraintExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02127);
            rule__ConstraintExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_0__0"


    // $ANTLR start "rule__ConstraintExpression__Group_0__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1049:1: rule__ConstraintExpression__Group_0__0__Impl : ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) ;
    public final void rule__ConstraintExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1053:1: ( ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1054:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1054:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1055:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentAssignment_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1056:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1056:2: rule__ConstraintExpression__CommentAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2154);
            rule__ConstraintExpression__CommentAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintExpressionAccess().getCommentAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_0__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1066:1: rule__ConstraintExpression__Group_0__1 : rule__ConstraintExpression__Group_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1070:1: ( rule__ConstraintExpression__Group_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1071:2: rule__ConstraintExpression__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12184);
            rule__ConstraintExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_0__1"


    // $ANTLR start "rule__ConstraintExpression__Group_0__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1077:1: rule__ConstraintExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ConstraintExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1081:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1082:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1082:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1083:1: ':'
            {
             before(grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConstraintExpression__Group_0__1__Impl2212); 
             after(grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_0__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1100:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1104:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1105:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02247);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02250);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1112:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__DataTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1116:1: ( ( ( rule__Variable__DataTypeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1117:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1117:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1118:1: ( rule__Variable__DataTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getDataTypeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1119:1: ( rule__Variable__DataTypeAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1119:2: rule__Variable__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2277);
            rule__Variable__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1129:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1133:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1134:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12307);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12310);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1141:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1145:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1146:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1146:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1147:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1148:1: ( rule__Variable__NameAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1148:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2337);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1158:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1162:1: ( rule__Variable__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1163:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22367);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1169:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1173:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1174:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1174:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1175:1: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Variable__Group__2__Impl2395); 
             after(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1194:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1198:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1199:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__02432);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__02435);
            rule__AdditionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1206:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1210:1: ( ( ruleMultiplicationExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1211:1: ( ruleMultiplicationExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1211:1: ( ruleMultiplicationExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1212:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl2462);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1223:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1227:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1228:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__12491);
            rule__AdditionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1234:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1238:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1239:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1239:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1240:1: ( rule__AdditionExpression__Group_1__0 )?
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1241:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1241:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl2518);
                    rule__AdditionExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1255:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1259:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1260:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__02553);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__02556);
            rule__AdditionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1267:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1271:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1272:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1272:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1273:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1274:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1276:1: 
            {
            }

             after(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1286:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1290:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1291:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__12614);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__12617);
            rule__AdditionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1298:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1302:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1303:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1303:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1304:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1305:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1305:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl2644);
            rule__AdditionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1315:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1319:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1320:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__22674);
            rule__AdditionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2"


    // $ANTLR start "rule__AdditionExpression__Group_1__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1326:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1330:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1331:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1331:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1332:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1333:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1333:2: rule__AdditionExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl2701);
            rule__AdditionExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1349:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1353:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1354:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__02737);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__02740);
            rule__MultiplicationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0"


    // $ANTLR start "rule__MultiplicationExpression__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1361:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1365:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1366:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1366:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1367:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl2767);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1378:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1382:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1383:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__12796);
            rule__MultiplicationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1"


    // $ANTLR start "rule__MultiplicationExpression__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1389:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1393:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1394:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1394:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1395:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1396:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1396:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl2823);
                    rule__MultiplicationExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1410:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1414:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1415:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__02858);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__02861);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1422:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1426:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1427:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1427:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1428:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1429:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1431:1: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1441:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1445:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1446:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__12919);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__12922);
            rule__MultiplicationExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1453:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1457:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1458:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1458:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1459:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1460:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1460:2: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl2949);
            rule__MultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1470:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1474:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1475:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__22979);
            rule__MultiplicationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1481:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1485:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1486:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1486:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1487:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1488:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1488:2: rule__MultiplicationExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3006);
            rule__MultiplicationExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1505:1: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 : ( ruleObjectiveFunctionExpression ) ;
    public final void rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1509:1: ( ( ruleObjectiveFunctionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1510:1: ( ruleObjectiveFunctionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1510:1: ( ruleObjectiveFunctionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1511:1: ruleObjectiveFunctionExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_03047);
            ruleObjectiveFunctionExpression();

            state._fsp--;

             after(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0"


    // $ANTLR start "rule__IntegerLinearProgram__ConstraintsAssignment_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1520:1: rule__IntegerLinearProgram__ConstraintsAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__IntegerLinearProgram__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1524:1: ( ( ruleConstraintExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1525:1: ( ruleConstraintExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1525:1: ( ruleConstraintExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1526:1: ruleConstraintExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_13078);
            ruleConstraintExpression();

            state._fsp--;

             after(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__ConstraintsAssignment_1"


    // $ANTLR start "rule__IntegerLinearProgram__VariablesAssignment_2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1535:1: rule__IntegerLinearProgram__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__IntegerLinearProgram__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1539:1: ( ( ruleVariable ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1540:1: ( ruleVariable )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1540:1: ( ruleVariable )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1541:1: ruleVariable
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_23109);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLinearProgram__VariablesAssignment_2"


    // $ANTLR start "rule__ObjectiveFunctionExpression__GoalAssignment_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1550:1: rule__ObjectiveFunctionExpression__GoalAssignment_0 : ( ruleObjectiveGoal ) ;
    public final void rule__ObjectiveFunctionExpression__GoalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1554:1: ( ( ruleObjectiveGoal ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1555:1: ( ruleObjectiveGoal )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1555:1: ( ruleObjectiveGoal )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1556:1: ruleObjectiveGoal
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_03140);
            ruleObjectiveGoal();

            state._fsp--;

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__GoalAssignment_0"


    // $ANTLR start "rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1565:1: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2 : ( ruleLinearExpression ) ;
    public final void rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1569:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1570:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1570:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1571:1: ruleLinearExpression
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_23171);
            ruleLinearExpression();

            state._fsp--;

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2"


    // $ANTLR start "rule__ConstraintExpression__CommentAssignment_0_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1580:1: rule__ConstraintExpression__CommentAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ConstraintExpression__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1584:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1585:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1585:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1586:1: RULE_ID
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ConstraintExpression__CommentAssignment_0_03202); 
             after(grammarAccess.getConstraintExpressionAccess().getCommentIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__CommentAssignment_0_0"


    // $ANTLR start "rule__ConstraintExpression__LeftExpressionAssignment_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1595:1: rule__ConstraintExpression__LeftExpressionAssignment_1 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__LeftExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1599:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1600:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1600:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1601:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_13233);
            ruleSimpleLinearExpression();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__LeftExpressionAssignment_1"


    // $ANTLR start "rule__ConstraintExpression__OperatorAssignment_2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1610:1: rule__ConstraintExpression__OperatorAssignment_2 : ( ruleComparingOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1614:1: ( ( ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1615:1: ( ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1615:1: ( ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1616:1: ruleComparingOperator
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_23264);
            ruleComparingOperator();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__OperatorAssignment_2"


    // $ANTLR start "rule__ConstraintExpression__RightExpressionAssignment_3"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1625:1: rule__ConstraintExpression__RightExpressionAssignment_3 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__RightExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1629:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1630:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1630:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1631:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_33295);
            ruleSimpleLinearExpression();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__RightExpressionAssignment_3"


    // $ANTLR start "rule__Variable__DataTypeAssignment_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1640:1: rule__Variable__DataTypeAssignment_0 : ( ruleILPDataType ) ;
    public final void rule__Variable__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1644:1: ( ( ruleILPDataType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1645:1: ( ruleILPDataType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1645:1: ( ruleILPDataType )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1646:1: ruleILPDataType
            {
             before(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_03326);
            ruleILPDataType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__DataTypeAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1655:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1659:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1660:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1660:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1661:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_13357); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__AdditionExpression__OperatorAssignment_1_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1670:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1674:1: ( ( ruleAdditionOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1675:1: ( ruleAdditionOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1675:1: ( ruleAdditionOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1676:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_13388);
            ruleAdditionOperator();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RightExpressionAssignment_1_2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1685:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1689:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1690:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1690:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1691:1: ruleLinearExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_23419);
            ruleLinearExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__OperatorAssignment_1_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1700:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1704:1: ( ( ruleMultiplicationOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1705:1: ( ruleMultiplicationOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1705:1: ( ruleMultiplicationOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1706:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_13450);
            ruleMultiplicationOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RightExpressionAssignment_1_2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1715:1: rule__MultiplicationExpression__RightExpressionAssignment_1_2 : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1719:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1720:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1720:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1721:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_23481);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__NumberLiteralExpression__ValueAssignment"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1730:1: rule__NumberLiteralExpression__ValueAssignment : ( ruleNumber ) ;
    public final void rule__NumberLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1734:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1735:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1735:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1736:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment3512);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteralExpression__ValueAssignment"


    // $ANTLR start "rule__VariableExpression__VariableAssignment"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1745:1: rule__VariableExpression__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableExpression__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1749:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1750:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1750:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1751:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1752:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1753:1: RULE_ID
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableExpression__VariableAssignment3547); 
             after(grammarAccess.getVariableExpressionAccess().getVariableVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__VariableAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntegerLinearProgram_in_entryRuleIntegerLinearProgram61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLinearProgram68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__0_in_ruleIntegerLinearProgram94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_entryRuleObjectiveFunctionExpression121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectiveFunctionExpression128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__0_in_ruleObjectiveFunctionExpression154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinearExpression308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLinearExpression367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression419 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpression606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberLiteralExpression__ValueAssignment_in_ruleNumberLiteralExpression632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableExpression__VariableAssignment_in_ruleVariableExpression752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveGoal__Alternatives_in_ruleObjectiveGoal789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ILPDataType__Alternatives_in_ruleILPDataType861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMultiplicationOperator934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ObjectiveGoal__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ComparingOperator__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ComparingOperator__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ComparingOperator__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ComparingOperator__Alternatives1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ComparingOperator__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ILPDataType__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ILPDataType__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ILPDataType__Alternatives1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AdditionOperator__Alternatives1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AdditionOperator__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01379 = new BitSet(new long[]{0x0000000000700070L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11439 = new BitSet(new long[]{0x0000000000700070L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1469 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1527 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__0__Impl_in_rule__ObjectiveFunctionExpression__Group__01564 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__1_in_rule__ObjectiveFunctionExpression__Group__01567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_0_in_rule__ObjectiveFunctionExpression__Group__0__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__1__Impl_in_rule__ObjectiveFunctionExpression__Group__11624 = new BitSet(new long[]{0x0000000004000070L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__2_in_rule__ObjectiveFunctionExpression__Group__11627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group__1__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__2__Impl_in_rule__ObjectiveFunctionExpression__Group__21686 = new BitSet(new long[]{0x0000000004000070L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__3_in_rule__ObjectiveFunctionExpression__Group__21689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_2_in_rule__ObjectiveFunctionExpression__Group__2__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group__3__Impl_in_rule__ObjectiveFunctionExpression__Group__31747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group__3__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__01814 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__01817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__11875 = new BitSet(new long[]{0x00000000000F8000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__11878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__21935 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__21938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__31995 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__31998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConstraintExpression__Group__4__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02124 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConstraintExpression__Group_0__1__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02247 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12307 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Variable__Group__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__02432 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__12491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__02553 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__02556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__12614 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__12617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__22674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__02737 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__02740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__12796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__02858 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__02861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__12919 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__12922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__22979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_03047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_13078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_23109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_03140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_23171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ConstraintExpression__CommentAssignment_0_03202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_13233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_23264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_33295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_03326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_13357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_13388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_23419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_13450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_23481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment3512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableExpression__VariableAssignment3547 = new BitSet(new long[]{0x0000000000000002L});
    }


}