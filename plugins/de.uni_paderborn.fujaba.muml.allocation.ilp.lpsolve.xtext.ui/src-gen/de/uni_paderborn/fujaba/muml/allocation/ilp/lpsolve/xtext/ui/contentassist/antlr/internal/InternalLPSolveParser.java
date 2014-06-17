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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:97:1: ruleObjectiveFunctionExpression : ( ( rule__ObjectiveFunctionExpression__Alternatives ) ) ;
    public final void ruleObjectiveFunctionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:101:2: ( ( ( rule__ObjectiveFunctionExpression__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:102:1: ( ( rule__ObjectiveFunctionExpression__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:102:1: ( ( rule__ObjectiveFunctionExpression__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:103:1: ( rule__ObjectiveFunctionExpression__Alternatives )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:104:1: ( rule__ObjectiveFunctionExpression__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:104:2: rule__ObjectiveFunctionExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_in_ruleObjectiveFunctionExpression154);
            rule__ObjectiveFunctionExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "rule__ObjectiveFunctionExpression__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:492:1: rule__ObjectiveFunctionExpression__Alternatives : ( ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) ) | ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) ) );
    public final void rule__ObjectiveFunctionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:496:1: ( ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) ) | ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==25) ) {
                    int LA1_3 = input.LA(3);

                    if ( ((LA1_3>=RULE_DECIMAL && LA1_3<=RULE_ID)) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==26) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==14) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==25) ) {
                    int LA1_3 = input.LA(3);

                    if ( ((LA1_3>=RULE_DECIMAL && LA1_3<=RULE_ID)) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==26) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:497:1: ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:497:1: ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:498:1: ( rule__ObjectiveFunctionExpression__Group_0__0 )
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:499:1: ( rule__ObjectiveFunctionExpression__Group_0__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:499:2: rule__ObjectiveFunctionExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0_in_rule__ObjectiveFunctionExpression__Alternatives971);
                    rule__ObjectiveFunctionExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:503:6: ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:503:6: ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:504:1: ( rule__ObjectiveFunctionExpression__Group_1__0 )
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:505:1: ( rule__ObjectiveFunctionExpression__Group_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:505:2: rule__ObjectiveFunctionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0_in_rule__ObjectiveFunctionExpression__Alternatives989);
                    rule__ObjectiveFunctionExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Alternatives"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Alternatives_0_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:514:1: rule__ObjectiveFunctionExpression__Alternatives_0_0 : ( ( 'min' ) | ( 'max' ) );
    public final void rule__ObjectiveFunctionExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:518:1: ( ( 'min' ) | ( 'max' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:519:1: ( 'min' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:519:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:520:1: 'min'
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveFunctionExpression__Alternatives_0_01023); 
                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:527:6: ( 'max' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:527:6: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:528:1: 'max'
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ObjectiveFunctionExpression__Alternatives_0_01043); 
                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Alternatives_0_0"


    // $ANTLR start "rule__Operand__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:540:1: rule__Operand__Alternatives : ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:544:1: ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_DECIMAL && LA3_0<=RULE_INT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:545:1: ( ruleNumberLiteralExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:545:1: ( ruleNumberLiteralExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:546:1: ruleNumberLiteralExpression
                    {
                     before(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives1077);
                    ruleNumberLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:551:6: ( ruleVariableExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:551:6: ( ruleVariableExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:552:1: ruleVariableExpression
                    {
                     before(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives1094);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:562:1: rule__Number__Alternatives : ( ( RULE_DECIMAL ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:566:1: ( ( RULE_DECIMAL ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DECIMAL) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:567:1: ( RULE_DECIMAL )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:567:1: ( RULE_DECIMAL )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:568:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 
                    match(input,RULE_DECIMAL,FollowSets000.FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives1126); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:573:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:573:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:574:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Number__Alternatives1143); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:584:1: rule__ObjectiveGoal__Alternatives : ( ( ( 'min' ) ) | ( ( 'max' ) ) );
    public final void rule__ObjectiveGoal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:588:1: ( ( ( 'min' ) ) | ( ( 'max' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:589:1: ( ( 'min' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:589:1: ( ( 'min' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:590:1: ( 'min' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:591:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:591:3: 'min'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1176); 

                    }

                     after(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:596:6: ( ( 'max' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:596:6: ( ( 'max' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:597:1: ( 'max' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:598:1: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:598:3: 'max'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ObjectiveGoal__Alternatives1197); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:608:1: rule__ComparingOperator__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:612:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:613:1: ( ( '=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:613:1: ( ( '=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:614:1: ( '=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:615:1: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:615:3: '='
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ComparingOperator__Alternatives1233); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:620:6: ( ( '>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:620:6: ( ( '>' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:621:1: ( '>' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:622:1: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:622:3: '>'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ComparingOperator__Alternatives1254); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:627:6: ( ( '>=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:627:6: ( ( '>=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:628:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:629:1: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:629:3: '>='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ComparingOperator__Alternatives1275); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:634:6: ( ( '<' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:634:6: ( ( '<' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:635:1: ( '<' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:636:1: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:636:3: '<'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ComparingOperator__Alternatives1296); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:641:6: ( ( '<=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:641:6: ( ( '<=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:642:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:643:1: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:643:3: '<='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ComparingOperator__Alternatives1317); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:653:1: rule__ILPDataType__Alternatives : ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) );
    public final void rule__ILPDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:657:1: ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:658:1: ( ( 'bin' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:658:1: ( ( 'bin' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:659:1: ( 'bin' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:660:1: ( 'bin' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:660:3: 'bin'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ILPDataType__Alternatives1353); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:665:6: ( ( 'int' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:665:6: ( ( 'int' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:666:1: ( 'int' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:667:1: ( 'int' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:667:3: 'int'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ILPDataType__Alternatives1374); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:672:6: ( ( 'real' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:672:6: ( ( 'real' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:673:1: ( 'real' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:674:1: ( 'real' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:674:3: 'real'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ILPDataType__Alternatives1395); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:684:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:688:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:689:1: ( ( '+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:689:1: ( ( '+' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:690:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:691:1: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:691:3: '+'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__AdditionOperator__Alternatives1431); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:696:6: ( ( '-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:696:6: ( ( '-' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:697:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:698:1: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:698:3: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AdditionOperator__Alternatives1452); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:710:1: rule__IntegerLinearProgram__Group__0 : rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 ;
    public final void rule__IntegerLinearProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:714:1: ( rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:715:2: rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01485);
            rule__IntegerLinearProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01488);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:722:1: rule__IntegerLinearProgram__Group__0__Impl : ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) ;
    public final void rule__IntegerLinearProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:726:1: ( ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:727:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:727:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:728:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:729:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:729:2: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1515);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:739:1: rule__IntegerLinearProgram__Group__1 : rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 ;
    public final void rule__IntegerLinearProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:743:1: ( rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:744:2: rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11545);
            rule__IntegerLinearProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11548);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:751:1: rule__IntegerLinearProgram__Group__1__Impl : ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) ;
    public final void rule__IntegerLinearProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:755:1: ( ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:756:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:756:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:757:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:758:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_DECIMAL && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:758:2: rule__IntegerLinearProgram__ConstraintsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1575);
            	    rule__IntegerLinearProgram__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:768:1: rule__IntegerLinearProgram__Group__2 : rule__IntegerLinearProgram__Group__2__Impl ;
    public final void rule__IntegerLinearProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:772:1: ( rule__IntegerLinearProgram__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:773:2: rule__IntegerLinearProgram__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21606);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:779:1: rule__IntegerLinearProgram__Group__2__Impl : ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) ;
    public final void rule__IntegerLinearProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:783:1: ( ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:784:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:784:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:785:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:786:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=20 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:786:2: rule__IntegerLinearProgram__VariablesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1633);
            	    rule__IntegerLinearProgram__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_0__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:802:1: rule__ObjectiveFunctionExpression__Group_0__0 : rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1 ;
    public final void rule__ObjectiveFunctionExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:806:1: ( rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:807:2: rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0__Impl_in_rule__ObjectiveFunctionExpression__Group_0__01670);
            rule__ObjectiveFunctionExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1_in_rule__ObjectiveFunctionExpression__Group_0__01673);
            rule__ObjectiveFunctionExpression__Group_0__1();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_0__0"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_0__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:814:1: rule__ObjectiveFunctionExpression__Group_0__0__Impl : ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:818:1: ( ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:819:1: ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:819:1: ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:820:1: ( rule__ObjectiveFunctionExpression__Alternatives_0_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:821:1: ( rule__ObjectiveFunctionExpression__Alternatives_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:821:2: rule__ObjectiveFunctionExpression__Alternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_0_0_in_rule__ObjectiveFunctionExpression__Group_0__0__Impl1700);
            rule__ObjectiveFunctionExpression__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives_0_0()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_0__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:831:1: rule__ObjectiveFunctionExpression__Group_0__1 : rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2 ;
    public final void rule__ObjectiveFunctionExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:835:1: ( rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:836:2: rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1__Impl_in_rule__ObjectiveFunctionExpression__Group_0__11730);
            rule__ObjectiveFunctionExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2_in_rule__ObjectiveFunctionExpression__Group_0__11733);
            rule__ObjectiveFunctionExpression__Group_0__2();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_0__1"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_0__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:843:1: rule__ObjectiveFunctionExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:847:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:848:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:848:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:849:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_0_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_0__1__Impl1761); 
             after(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_0__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:862:1: rule__ObjectiveFunctionExpression__Group_0__2 : rule__ObjectiveFunctionExpression__Group_0__2__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:866:1: ( rule__ObjectiveFunctionExpression__Group_0__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:867:2: rule__ObjectiveFunctionExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2__Impl_in_rule__ObjectiveFunctionExpression__Group_0__21792);
            rule__ObjectiveFunctionExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_0__2"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_0__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:873:1: rule__ObjectiveFunctionExpression__Group_0__2__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:877:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:878:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:878:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:879:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_0_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_0__2__Impl1820); 
             after(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_0_2()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_0__2__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:898:1: rule__ObjectiveFunctionExpression__Group_1__0 : rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:902:1: ( rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:903:2: rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0__Impl_in_rule__ObjectiveFunctionExpression__Group_1__01857);
            rule__ObjectiveFunctionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1_in_rule__ObjectiveFunctionExpression__Group_1__01860);
            rule__ObjectiveFunctionExpression__Group_1__1();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__0"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:910:1: rule__ObjectiveFunctionExpression__Group_1__0__Impl : ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:914:1: ( ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:915:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:915:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:916:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:917:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:917:2: rule__ObjectiveFunctionExpression__GoalAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_1_0_in_rule__ObjectiveFunctionExpression__Group_1__0__Impl1887);
            rule__ObjectiveFunctionExpression__GoalAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_1_0()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:927:1: rule__ObjectiveFunctionExpression__Group_1__1 : rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:931:1: ( rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:932:2: rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1__Impl_in_rule__ObjectiveFunctionExpression__Group_1__11917);
            rule__ObjectiveFunctionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2_in_rule__ObjectiveFunctionExpression__Group_1__11920);
            rule__ObjectiveFunctionExpression__Group_1__2();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__1"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:939:1: rule__ObjectiveFunctionExpression__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:943:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:944:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:944:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:945:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_1__1__Impl1948); 
             after(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:958:1: rule__ObjectiveFunctionExpression__Group_1__2 : rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:962:1: ( rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:963:2: rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2__Impl_in_rule__ObjectiveFunctionExpression__Group_1__21979);
            rule__ObjectiveFunctionExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3_in_rule__ObjectiveFunctionExpression__Group_1__21982);
            rule__ObjectiveFunctionExpression__Group_1__3();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__2"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:970:1: rule__ObjectiveFunctionExpression__Group_1__2__Impl : ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:974:1: ( ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:975:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:975:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:976:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:977:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:977:2: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2_in_rule__ObjectiveFunctionExpression__Group_1__2__Impl2009);
            rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_1_2()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__3"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:987:1: rule__ObjectiveFunctionExpression__Group_1__3 : rule__ObjectiveFunctionExpression__Group_1__3__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:991:1: ( rule__ObjectiveFunctionExpression__Group_1__3__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:992:2: rule__ObjectiveFunctionExpression__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3__Impl_in_rule__ObjectiveFunctionExpression__Group_1__32039);
            rule__ObjectiveFunctionExpression__Group_1__3__Impl();

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__3"


    // $ANTLR start "rule__ObjectiveFunctionExpression__Group_1__3__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:998:1: rule__ObjectiveFunctionExpression__Group_1__3__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1002:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1003:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1003:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1004:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_1_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_1__3__Impl2067); 
             after(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_1_3()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1025:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1029:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1030:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__02106);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__02109);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1037:1: rule__ConstraintExpression__Group__0__Impl : ( ( rule__ConstraintExpression__Group_0__0 )? ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1041:1: ( ( ( rule__ConstraintExpression__Group_0__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1042:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1042:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1043:1: ( rule__ConstraintExpression__Group_0__0 )?
            {
             before(grammarAccess.getConstraintExpressionAccess().getGroup_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1044:1: ( rule__ConstraintExpression__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==25) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1044:2: rule__ConstraintExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl2136);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1054:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1058:1: ( rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1059:2: rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__12167);
            rule__ConstraintExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__12170);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1066:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1070:1: ( ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1071:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1071:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1072:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1073:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1073:2: rule__ConstraintExpression__LeftExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl2197);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1083:1: rule__ConstraintExpression__Group__2 : rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 ;
    public final void rule__ConstraintExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1087:1: ( rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1088:2: rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__22227);
            rule__ConstraintExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__22230);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1095:1: rule__ConstraintExpression__Group__2__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) ;
    public final void rule__ConstraintExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1099:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1100:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1100:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1101:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1102:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1102:2: rule__ConstraintExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl2257);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1112:1: rule__ConstraintExpression__Group__3 : rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 ;
    public final void rule__ConstraintExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1116:1: ( rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1117:2: rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__32287);
            rule__ConstraintExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__32290);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1124:1: rule__ConstraintExpression__Group__3__Impl : ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) ;
    public final void rule__ConstraintExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1128:1: ( ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1129:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1129:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1130:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionAssignment_3()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1131:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1131:2: rule__ConstraintExpression__RightExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2317);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1141:1: rule__ConstraintExpression__Group__4 : rule__ConstraintExpression__Group__4__Impl ;
    public final void rule__ConstraintExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1145:1: ( rule__ConstraintExpression__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1146:2: rule__ConstraintExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42347);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1152:1: rule__ConstraintExpression__Group__4__Impl : ( ';' ) ;
    public final void rule__ConstraintExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1156:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1157:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1157:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1158:1: ';'
            {
             before(grammarAccess.getConstraintExpressionAccess().getSemicolonKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConstraintExpression__Group__4__Impl2375); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1181:1: rule__ConstraintExpression__Group_0__0 : rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 ;
    public final void rule__ConstraintExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1185:1: ( rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1186:2: rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02416);
            rule__ConstraintExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02419);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1193:1: rule__ConstraintExpression__Group_0__0__Impl : ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) ;
    public final void rule__ConstraintExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1197:1: ( ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1198:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1198:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1199:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentAssignment_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1200:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1200:2: rule__ConstraintExpression__CommentAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2446);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1210:1: rule__ConstraintExpression__Group_0__1 : rule__ConstraintExpression__Group_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1214:1: ( rule__ConstraintExpression__Group_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1215:2: rule__ConstraintExpression__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12476);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1221:1: rule__ConstraintExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ConstraintExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1225:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1226:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1226:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1227:1: ':'
            {
             before(grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConstraintExpression__Group_0__1__Impl2504); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1244:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1248:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1249:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02539);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02542);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1256:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__DataTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1260:1: ( ( ( rule__Variable__DataTypeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1261:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1261:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1262:1: ( rule__Variable__DataTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getDataTypeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1263:1: ( rule__Variable__DataTypeAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1263:2: rule__Variable__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2569);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1273:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1277:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1278:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12599);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12602);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1285:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1289:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1290:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1290:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1291:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1292:1: ( rule__Variable__NameAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1292:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2629);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1302:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1306:1: ( rule__Variable__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1307:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22659);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1313:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1317:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1318:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1318:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1319:1: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Variable__Group__2__Impl2687); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1338:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1342:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1343:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__02724);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__02727);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1350:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1354:1: ( ( ruleMultiplicationExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1355:1: ( ruleMultiplicationExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1355:1: ( ruleMultiplicationExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1356:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl2754);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1367:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1371:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1372:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__12783);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1378:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1382:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1383:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1383:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1384:1: ( rule__AdditionExpression__Group_1__0 )?
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1385:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=23 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1385:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl2810);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1399:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1403:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1404:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__02845);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__02848);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1411:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1415:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1416:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1416:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1417:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1418:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1420:1: 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1430:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1434:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1435:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__12906);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__12909);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1442:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1446:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1447:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1447:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1448:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1449:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1449:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl2936);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1459:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1463:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1464:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__22966);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1470:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1474:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1475:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1475:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1476:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1477:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1477:2: rule__AdditionExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl2993);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1493:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1497:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1498:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__03029);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__03032);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1505:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1509:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1510:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1510:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1511:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl3059);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1522:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1526:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1527:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__13088);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1533:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1537:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1538:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1538:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1539:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1540:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1540:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl3115);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1554:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1558:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1559:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__03150);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__03153);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1566:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1570:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1571:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1571:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1572:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1573:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1575:1: 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1585:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1589:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1590:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__13211);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__13214);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1597:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1601:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1602:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1602:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1603:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1604:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1604:2: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl3241);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1614:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1618:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1619:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__23271);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1625:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1629:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1630:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1630:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1631:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1632:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1632:2: rule__MultiplicationExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3298);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1649:1: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 : ( ruleObjectiveFunctionExpression ) ;
    public final void rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1653:1: ( ( ruleObjectiveFunctionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1654:1: ( ruleObjectiveFunctionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1654:1: ( ruleObjectiveFunctionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1655:1: ruleObjectiveFunctionExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_03339);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1664:1: rule__IntegerLinearProgram__ConstraintsAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__IntegerLinearProgram__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1668:1: ( ( ruleConstraintExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1669:1: ( ruleConstraintExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1669:1: ( ruleConstraintExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1670:1: ruleConstraintExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_13370);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1679:1: rule__IntegerLinearProgram__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__IntegerLinearProgram__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1683:1: ( ( ruleVariable ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1684:1: ( ruleVariable )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1684:1: ( ruleVariable )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1685:1: ruleVariable
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_23401);
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


    // $ANTLR start "rule__ObjectiveFunctionExpression__GoalAssignment_1_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1694:1: rule__ObjectiveFunctionExpression__GoalAssignment_1_0 : ( ruleObjectiveGoal ) ;
    public final void rule__ObjectiveFunctionExpression__GoalAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1698:1: ( ( ruleObjectiveGoal ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1699:1: ( ruleObjectiveGoal )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1699:1: ( ruleObjectiveGoal )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1700:1: ruleObjectiveGoal
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_1_03432);
            ruleObjectiveGoal();

            state._fsp--;

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__GoalAssignment_1_0"


    // $ANTLR start "rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1709:1: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1713:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1714:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1714:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1715:1: ruleLinearExpression
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_23463);
            ruleLinearExpression();

            state._fsp--;

             after(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2"


    // $ANTLR start "rule__ConstraintExpression__CommentAssignment_0_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1724:1: rule__ConstraintExpression__CommentAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ConstraintExpression__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1728:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1729:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1729:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1730:1: RULE_ID
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ConstraintExpression__CommentAssignment_0_03494); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1739:1: rule__ConstraintExpression__LeftExpressionAssignment_1 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__LeftExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1743:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1744:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1744:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1745:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_13525);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1754:1: rule__ConstraintExpression__OperatorAssignment_2 : ( ruleComparingOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1758:1: ( ( ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1759:1: ( ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1759:1: ( ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1760:1: ruleComparingOperator
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_23556);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1769:1: rule__ConstraintExpression__RightExpressionAssignment_3 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__RightExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1773:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1774:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1774:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1775:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_33587);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1784:1: rule__Variable__DataTypeAssignment_0 : ( ruleILPDataType ) ;
    public final void rule__Variable__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1788:1: ( ( ruleILPDataType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1789:1: ( ruleILPDataType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1789:1: ( ruleILPDataType )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1790:1: ruleILPDataType
            {
             before(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_03618);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1799:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1803:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1804:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1804:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1805:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_13649); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1814:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1818:1: ( ( ruleAdditionOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1819:1: ( ruleAdditionOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1819:1: ( ruleAdditionOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1820:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_13680);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1829:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1833:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1834:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1834:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1835:1: ruleLinearExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_23711);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1844:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1848:1: ( ( ruleMultiplicationOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1849:1: ( ruleMultiplicationOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1849:1: ( ruleMultiplicationOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1850:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_13742);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1859:1: rule__MultiplicationExpression__RightExpressionAssignment_1_2 : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1863:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1864:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1864:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1865:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_23773);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1874:1: rule__NumberLiteralExpression__ValueAssignment : ( ruleNumber ) ;
    public final void rule__NumberLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1878:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1879:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1879:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1880:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment3804);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1889:1: rule__VariableExpression__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableExpression__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1893:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1894:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1894:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1895:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1896:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1897:1: RULE_ID
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableExpression__VariableAssignment3839); 
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
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_in_ruleObjectiveFunctionExpression154 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0_in_rule__ObjectiveFunctionExpression__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0_in_rule__ObjectiveFunctionExpression__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveFunctionExpression__Alternatives_0_01023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ObjectiveFunctionExpression__Alternatives_0_01043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives1077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ObjectiveGoal__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ComparingOperator__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ComparingOperator__Alternatives1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ComparingOperator__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ComparingOperator__Alternatives1296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ComparingOperator__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ILPDataType__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ILPDataType__Alternatives1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ILPDataType__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AdditionOperator__Alternatives1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AdditionOperator__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01485 = new BitSet(new long[]{0x0000000000700070L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11545 = new BitSet(new long[]{0x0000000000700070L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1575 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1633 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0__Impl_in_rule__ObjectiveFunctionExpression__Group_0__01670 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1_in_rule__ObjectiveFunctionExpression__Group_0__01673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_0_0_in_rule__ObjectiveFunctionExpression__Group_0__0__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1__Impl_in_rule__ObjectiveFunctionExpression__Group_0__11730 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2_in_rule__ObjectiveFunctionExpression__Group_0__11733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_0__1__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2__Impl_in_rule__ObjectiveFunctionExpression__Group_0__21792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_0__2__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0__Impl_in_rule__ObjectiveFunctionExpression__Group_1__01857 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1_in_rule__ObjectiveFunctionExpression__Group_1__01860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_1_0_in_rule__ObjectiveFunctionExpression__Group_1__0__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1__Impl_in_rule__ObjectiveFunctionExpression__Group_1__11917 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2_in_rule__ObjectiveFunctionExpression__Group_1__11920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_1__1__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2__Impl_in_rule__ObjectiveFunctionExpression__Group_1__21979 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3_in_rule__ObjectiveFunctionExpression__Group_1__21982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2_in_rule__ObjectiveFunctionExpression__Group_1__2__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3__Impl_in_rule__ObjectiveFunctionExpression__Group_1__32039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_1__3__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__02106 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__02109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__12167 = new BitSet(new long[]{0x00000000000F8000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__12170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__22227 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__22230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__32287 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__32290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConstraintExpression__Group__4__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02416 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConstraintExpression__Group_0__1__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02539 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12599 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Variable__Group__2__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__02724 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__02727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__12783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__02845 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__02848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__12906 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__12909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__22966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__03029 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__03032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__13088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__03150 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__03153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__13211 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__13214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__23271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_03339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_13370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_23401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_1_03432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_23463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ConstraintExpression__CommentAssignment_0_03494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_13525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_23556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_33587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_03618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_13649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_13680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_23711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_13742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_23773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableExpression__VariableAssignment3839 = new BitSet(new long[]{0x0000000000000002L});
    }


}