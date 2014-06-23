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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMAL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'min'", "'max'", "'='", "'>'", "'>='", "'<'", "'<='", "'bin'", "'int'", "'real'", "'+'", "'-'", "':'", "';'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int T__27=27;
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


    // $ANTLR start "entryRuleVariableID"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:172:1: entryRuleVariableID : ruleVariableID EOF ;
    public final void entryRuleVariableID() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:173:1: ( ruleVariableID EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:174:1: ruleVariableID EOF
            {
             before(grammarAccess.getVariableIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_entryRuleVariableID301);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getVariableIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableID308); 

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
    // $ANTLR end "entryRuleVariableID"


    // $ANTLR start "ruleVariableID"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:181:1: ruleVariableID : ( ( rule__VariableID__Group__0 ) ) ;
    public final void ruleVariableID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:185:2: ( ( ( rule__VariableID__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:186:1: ( ( rule__VariableID__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:186:1: ( ( rule__VariableID__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:187:1: ( rule__VariableID__Group__0 )
            {
             before(grammarAccess.getVariableIDAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:188:1: ( rule__VariableID__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:188:2: rule__VariableID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0_in_ruleVariableID334);
            rule__VariableID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableIDAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableID"


    // $ANTLR start "entryRuleLinearExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:200:1: entryRuleLinearExpression : ruleLinearExpression EOF ;
    public final void entryRuleLinearExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:201:1: ( ruleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:202:1: ruleLinearExpression EOF
            {
             before(grammarAccess.getLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression361);
            ruleLinearExpression();

            state._fsp--;

             after(grammarAccess.getLinearExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinearExpression368); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:209:1: ruleLinearExpression : ( ruleSimpleLinearExpression ) ;
    public final void ruleLinearExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:213:2: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:214:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:214:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:215:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getLinearExpressionAccess().getSimpleLinearExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression394);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:228:1: entryRuleSimpleLinearExpression : ruleSimpleLinearExpression EOF ;
    public final void entryRuleSimpleLinearExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:229:1: ( ruleSimpleLinearExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:230:1: ruleSimpleLinearExpression EOF
            {
             before(grammarAccess.getSimpleLinearExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression420);
            ruleSimpleLinearExpression();

            state._fsp--;

             after(grammarAccess.getSimpleLinearExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleLinearExpression427); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:237:1: ruleSimpleLinearExpression : ( ruleAdditionExpression ) ;
    public final void ruleSimpleLinearExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:241:2: ( ( ruleAdditionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:242:1: ( ruleAdditionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:242:1: ( ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:243:1: ruleAdditionExpression
            {
             before(grammarAccess.getSimpleLinearExpressionAccess().getAdditionExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression453);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:256:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:257:1: ( ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:258:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression479);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression486); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:265:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:269:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:270:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:270:1: ( ( rule__AdditionExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:271:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:272:1: ( rule__AdditionExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:272:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression512);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:284:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:285:1: ( ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:286:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression539);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression546); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:293:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:297:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:298:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:298:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:299:1: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:300:1: ( rule__MultiplicationExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:300:2: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression572);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:312:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:313:1: ( ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:314:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand599);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand606); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:321:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:325:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:326:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:326:1: ( ( rule__Operand__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:327:1: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:328:1: ( rule__Operand__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:328:2: rule__Operand__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operand__Alternatives_in_ruleOperand632);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:340:1: entryRuleNumberLiteralExpression : ruleNumberLiteralExpression EOF ;
    public final void entryRuleNumberLiteralExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:341:1: ( ruleNumberLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:342:1: ruleNumberLiteralExpression EOF
            {
             before(grammarAccess.getNumberLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression659);
            ruleNumberLiteralExpression();

            state._fsp--;

             after(grammarAccess.getNumberLiteralExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpression666); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:349:1: ruleNumberLiteralExpression : ( ( rule__NumberLiteralExpression__ValueAssignment ) ) ;
    public final void ruleNumberLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:353:2: ( ( ( rule__NumberLiteralExpression__ValueAssignment ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:354:1: ( ( rule__NumberLiteralExpression__ValueAssignment ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:354:1: ( ( rule__NumberLiteralExpression__ValueAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:355:1: ( rule__NumberLiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralExpressionAccess().getValueAssignment()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:356:1: ( rule__NumberLiteralExpression__ValueAssignment )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:356:2: rule__NumberLiteralExpression__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberLiteralExpression__ValueAssignment_in_ruleNumberLiteralExpression692);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:368:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:369:1: ( ruleNumber EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:370:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber719);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber726); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:377:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:381:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:382:1: ( ( rule__Number__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:382:1: ( ( rule__Number__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:383:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:384:1: ( rule__Number__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:384:2: rule__Number__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Alternatives_in_ruleNumber752);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:396:1: entryRuleVariableExpression : ruleVariableExpression EOF ;
    public final void entryRuleVariableExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:397:1: ( ruleVariableExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:398:1: ruleVariableExpression EOF
            {
             before(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression779);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableExpression786); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:405:1: ruleVariableExpression : ( ( rule__VariableExpression__VariableAssignment ) ) ;
    public final void ruleVariableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:409:2: ( ( ( rule__VariableExpression__VariableAssignment ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:410:1: ( ( rule__VariableExpression__VariableAssignment ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:410:1: ( ( rule__VariableExpression__VariableAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:411:1: ( rule__VariableExpression__VariableAssignment )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableAssignment()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:412:1: ( rule__VariableExpression__VariableAssignment )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:412:2: rule__VariableExpression__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableExpression__VariableAssignment_in_ruleVariableExpression812);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:425:1: ruleObjectiveGoal : ( ( rule__ObjectiveGoal__Alternatives ) ) ;
    public final void ruleObjectiveGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:429:1: ( ( ( rule__ObjectiveGoal__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:430:1: ( ( rule__ObjectiveGoal__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:430:1: ( ( rule__ObjectiveGoal__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:431:1: ( rule__ObjectiveGoal__Alternatives )
            {
             before(grammarAccess.getObjectiveGoalAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:432:1: ( rule__ObjectiveGoal__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:432:2: rule__ObjectiveGoal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveGoal__Alternatives_in_ruleObjectiveGoal849);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:444:1: ruleComparingOperator : ( ( rule__ComparingOperator__Alternatives ) ) ;
    public final void ruleComparingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:448:1: ( ( ( rule__ComparingOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:449:1: ( ( rule__ComparingOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:449:1: ( ( rule__ComparingOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:450:1: ( rule__ComparingOperator__Alternatives )
            {
             before(grammarAccess.getComparingOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:451:1: ( rule__ComparingOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:451:2: rule__ComparingOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator885);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:463:1: ruleILPDataType : ( ( rule__ILPDataType__Alternatives ) ) ;
    public final void ruleILPDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:467:1: ( ( ( rule__ILPDataType__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:468:1: ( ( rule__ILPDataType__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:468:1: ( ( rule__ILPDataType__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:469:1: ( rule__ILPDataType__Alternatives )
            {
             before(grammarAccess.getILPDataTypeAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:470:1: ( rule__ILPDataType__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:470:2: rule__ILPDataType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ILPDataType__Alternatives_in_ruleILPDataType921);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:482:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:486:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:487:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:487:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:488:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:489:1: ( rule__AdditionOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:489:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator957);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:501:1: ruleMultiplicationOperator : ( ( '*' ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:505:1: ( ( ( '*' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:506:1: ( ( '*' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:506:1: ( ( '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:507:1: ( '*' )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:508:1: ( '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:508:3: '*'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiplicationOperator994); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:520:1: rule__ObjectiveFunctionExpression__Alternatives : ( ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) ) | ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) ) );
    public final void rule__ObjectiveFunctionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:524:1: ( ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) ) | ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==25) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==26) ) {
                        alt1=1;
                    }
                    else if ( ((LA1_3>=RULE_DECIMAL && LA1_3<=RULE_ID)) ) {
                        alt1=2;
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

                    if ( (LA1_3==26) ) {
                        alt1=1;
                    }
                    else if ( ((LA1_3>=RULE_DECIMAL && LA1_3<=RULE_ID)) ) {
                        alt1=2;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:525:1: ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:525:1: ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:526:1: ( rule__ObjectiveFunctionExpression__Group_0__0 )
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:527:1: ( rule__ObjectiveFunctionExpression__Group_0__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:527:2: rule__ObjectiveFunctionExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0_in_rule__ObjectiveFunctionExpression__Alternatives1031);
                    rule__ObjectiveFunctionExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:531:6: ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:531:6: ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:532:1: ( rule__ObjectiveFunctionExpression__Group_1__0 )
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:533:1: ( rule__ObjectiveFunctionExpression__Group_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:533:2: rule__ObjectiveFunctionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0_in_rule__ObjectiveFunctionExpression__Alternatives1049);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:542:1: rule__ObjectiveFunctionExpression__Alternatives_0_0 : ( ( 'min' ) | ( 'max' ) );
    public final void rule__ObjectiveFunctionExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:546:1: ( ( 'min' ) | ( 'max' ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:547:1: ( 'min' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:547:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:548:1: 'min'
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveFunctionExpression__Alternatives_0_01083); 
                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:555:6: ( 'max' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:555:6: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:556:1: 'max'
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ObjectiveFunctionExpression__Alternatives_0_01103); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:568:1: rule__Operand__Alternatives : ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:572:1: ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:573:1: ( ruleNumberLiteralExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:573:1: ( ruleNumberLiteralExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:574:1: ruleNumberLiteralExpression
                    {
                     before(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives1137);
                    ruleNumberLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:579:6: ( ruleVariableExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:579:6: ( ruleVariableExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:580:1: ruleVariableExpression
                    {
                     before(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives1154);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:590:1: rule__Number__Alternatives : ( ( RULE_DECIMAL ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:594:1: ( ( RULE_DECIMAL ) | ( RULE_INT ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:595:1: ( RULE_DECIMAL )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:595:1: ( RULE_DECIMAL )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:596:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 
                    match(input,RULE_DECIMAL,FollowSets000.FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives1186); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:601:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:601:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:602:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Number__Alternatives1203); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:612:1: rule__ObjectiveGoal__Alternatives : ( ( ( 'min' ) ) | ( ( 'max' ) ) );
    public final void rule__ObjectiveGoal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:616:1: ( ( ( 'min' ) ) | ( ( 'max' ) ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:617:1: ( ( 'min' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:617:1: ( ( 'min' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:618:1: ( 'min' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:619:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:619:3: 'min'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1236); 

                    }

                     after(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:624:6: ( ( 'max' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:624:6: ( ( 'max' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:625:1: ( 'max' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:626:1: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:626:3: 'max'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ObjectiveGoal__Alternatives1257); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:636:1: rule__ComparingOperator__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:640:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:641:1: ( ( '=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:641:1: ( ( '=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:642:1: ( '=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:643:1: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:643:3: '='
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ComparingOperator__Alternatives1293); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:648:6: ( ( '>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:648:6: ( ( '>' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:649:1: ( '>' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:650:1: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:650:3: '>'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ComparingOperator__Alternatives1314); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:655:6: ( ( '>=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:655:6: ( ( '>=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:656:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:657:1: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:657:3: '>='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ComparingOperator__Alternatives1335); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:662:6: ( ( '<' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:662:6: ( ( '<' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:663:1: ( '<' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:664:1: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:664:3: '<'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ComparingOperator__Alternatives1356); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:669:6: ( ( '<=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:669:6: ( ( '<=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:670:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:671:1: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:671:3: '<='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ComparingOperator__Alternatives1377); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:681:1: rule__ILPDataType__Alternatives : ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) );
    public final void rule__ILPDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:685:1: ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:686:1: ( ( 'bin' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:686:1: ( ( 'bin' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:687:1: ( 'bin' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:688:1: ( 'bin' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:688:3: 'bin'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ILPDataType__Alternatives1413); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:693:6: ( ( 'int' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:693:6: ( ( 'int' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:694:1: ( 'int' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:695:1: ( 'int' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:695:3: 'int'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ILPDataType__Alternatives1434); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:700:6: ( ( 'real' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:700:6: ( ( 'real' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:701:1: ( 'real' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:702:1: ( 'real' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:702:3: 'real'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ILPDataType__Alternatives1455); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:712:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:716:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:717:1: ( ( '+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:717:1: ( ( '+' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:718:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:719:1: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:719:3: '+'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__AdditionOperator__Alternatives1491); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:724:6: ( ( '-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:724:6: ( ( '-' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:725:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:726:1: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:726:3: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AdditionOperator__Alternatives1512); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:738:1: rule__IntegerLinearProgram__Group__0 : rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 ;
    public final void rule__IntegerLinearProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:742:1: ( rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:743:2: rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01545);
            rule__IntegerLinearProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01548);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:750:1: rule__IntegerLinearProgram__Group__0__Impl : ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) ;
    public final void rule__IntegerLinearProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:754:1: ( ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:755:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:755:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:756:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:757:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:757:2: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1575);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:767:1: rule__IntegerLinearProgram__Group__1 : rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 ;
    public final void rule__IntegerLinearProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:771:1: ( rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:772:2: rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11605);
            rule__IntegerLinearProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11608);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:779:1: rule__IntegerLinearProgram__Group__1__Impl : ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) ;
    public final void rule__IntegerLinearProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:783:1: ( ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:784:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:784:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:785:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:786:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_DECIMAL && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:786:2: rule__IntegerLinearProgram__ConstraintsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1635);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:796:1: rule__IntegerLinearProgram__Group__2 : rule__IntegerLinearProgram__Group__2__Impl ;
    public final void rule__IntegerLinearProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:800:1: ( rule__IntegerLinearProgram__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:801:2: rule__IntegerLinearProgram__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21666);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:807:1: rule__IntegerLinearProgram__Group__2__Impl : ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) ;
    public final void rule__IntegerLinearProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:811:1: ( ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:812:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:812:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:813:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:814:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=20 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:814:2: rule__IntegerLinearProgram__VariablesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1693);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:830:1: rule__ObjectiveFunctionExpression__Group_0__0 : rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1 ;
    public final void rule__ObjectiveFunctionExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:834:1: ( rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:835:2: rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0__Impl_in_rule__ObjectiveFunctionExpression__Group_0__01730);
            rule__ObjectiveFunctionExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1_in_rule__ObjectiveFunctionExpression__Group_0__01733);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:842:1: rule__ObjectiveFunctionExpression__Group_0__0__Impl : ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:846:1: ( ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:847:1: ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:847:1: ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:848:1: ( rule__ObjectiveFunctionExpression__Alternatives_0_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:849:1: ( rule__ObjectiveFunctionExpression__Alternatives_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:849:2: rule__ObjectiveFunctionExpression__Alternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_0_0_in_rule__ObjectiveFunctionExpression__Group_0__0__Impl1760);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:859:1: rule__ObjectiveFunctionExpression__Group_0__1 : rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2 ;
    public final void rule__ObjectiveFunctionExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:863:1: ( rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:864:2: rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1__Impl_in_rule__ObjectiveFunctionExpression__Group_0__11790);
            rule__ObjectiveFunctionExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2_in_rule__ObjectiveFunctionExpression__Group_0__11793);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:871:1: rule__ObjectiveFunctionExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:875:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:876:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:876:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:877:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_0_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_0__1__Impl1821); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:890:1: rule__ObjectiveFunctionExpression__Group_0__2 : rule__ObjectiveFunctionExpression__Group_0__2__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:894:1: ( rule__ObjectiveFunctionExpression__Group_0__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:895:2: rule__ObjectiveFunctionExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2__Impl_in_rule__ObjectiveFunctionExpression__Group_0__21852);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:901:1: rule__ObjectiveFunctionExpression__Group_0__2__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:905:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:906:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:906:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:907:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_0_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_0__2__Impl1880); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:926:1: rule__ObjectiveFunctionExpression__Group_1__0 : rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:930:1: ( rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:931:2: rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0__Impl_in_rule__ObjectiveFunctionExpression__Group_1__01917);
            rule__ObjectiveFunctionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1_in_rule__ObjectiveFunctionExpression__Group_1__01920);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:938:1: rule__ObjectiveFunctionExpression__Group_1__0__Impl : ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:942:1: ( ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:943:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:943:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:944:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:945:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:945:2: rule__ObjectiveFunctionExpression__GoalAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_1_0_in_rule__ObjectiveFunctionExpression__Group_1__0__Impl1947);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:955:1: rule__ObjectiveFunctionExpression__Group_1__1 : rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:959:1: ( rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:960:2: rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1__Impl_in_rule__ObjectiveFunctionExpression__Group_1__11977);
            rule__ObjectiveFunctionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2_in_rule__ObjectiveFunctionExpression__Group_1__11980);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:967:1: rule__ObjectiveFunctionExpression__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:971:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:972:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:972:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:973:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_1__1__Impl2008); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:986:1: rule__ObjectiveFunctionExpression__Group_1__2 : rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:990:1: ( rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:991:2: rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2__Impl_in_rule__ObjectiveFunctionExpression__Group_1__22039);
            rule__ObjectiveFunctionExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3_in_rule__ObjectiveFunctionExpression__Group_1__22042);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:998:1: rule__ObjectiveFunctionExpression__Group_1__2__Impl : ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1002:1: ( ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1003:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1003:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1004:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1005:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1005:2: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2_in_rule__ObjectiveFunctionExpression__Group_1__2__Impl2069);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1015:1: rule__ObjectiveFunctionExpression__Group_1__3 : rule__ObjectiveFunctionExpression__Group_1__3__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1019:1: ( rule__ObjectiveFunctionExpression__Group_1__3__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1020:2: rule__ObjectiveFunctionExpression__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3__Impl_in_rule__ObjectiveFunctionExpression__Group_1__32099);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1026:1: rule__ObjectiveFunctionExpression__Group_1__3__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1030:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1031:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1031:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1032:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_1_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_1__3__Impl2127); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1053:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1057:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1058:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__02166);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__02169);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1065:1: rule__ConstraintExpression__Group__0__Impl : ( ( rule__ConstraintExpression__Group_0__0 )? ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1069:1: ( ( ( rule__ConstraintExpression__Group_0__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1070:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1070:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1071:1: ( rule__ConstraintExpression__Group_0__0 )?
            {
             before(grammarAccess.getConstraintExpressionAccess().getGroup_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1072:1: ( rule__ConstraintExpression__Group_0__0 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1072:2: rule__ConstraintExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl2196);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1082:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1086:1: ( rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1087:2: rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__12227);
            rule__ConstraintExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__12230);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1094:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1098:1: ( ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1099:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1099:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1100:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1101:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1101:2: rule__ConstraintExpression__LeftExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl2257);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1111:1: rule__ConstraintExpression__Group__2 : rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 ;
    public final void rule__ConstraintExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1115:1: ( rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1116:2: rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__22287);
            rule__ConstraintExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__22290);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1123:1: rule__ConstraintExpression__Group__2__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) ;
    public final void rule__ConstraintExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1127:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1128:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1128:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1129:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1130:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1130:2: rule__ConstraintExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl2317);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1140:1: rule__ConstraintExpression__Group__3 : rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 ;
    public final void rule__ConstraintExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1144:1: ( rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1145:2: rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__32347);
            rule__ConstraintExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__32350);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1152:1: rule__ConstraintExpression__Group__3__Impl : ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) ;
    public final void rule__ConstraintExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1156:1: ( ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1157:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1157:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1158:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionAssignment_3()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1159:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1159:2: rule__ConstraintExpression__RightExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2377);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1169:1: rule__ConstraintExpression__Group__4 : rule__ConstraintExpression__Group__4__Impl ;
    public final void rule__ConstraintExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1173:1: ( rule__ConstraintExpression__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1174:2: rule__ConstraintExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42407);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1180:1: rule__ConstraintExpression__Group__4__Impl : ( ';' ) ;
    public final void rule__ConstraintExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1184:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1185:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1185:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1186:1: ';'
            {
             before(grammarAccess.getConstraintExpressionAccess().getSemicolonKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ConstraintExpression__Group__4__Impl2435); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1209:1: rule__ConstraintExpression__Group_0__0 : rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 ;
    public final void rule__ConstraintExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1213:1: ( rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1214:2: rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02476);
            rule__ConstraintExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02479);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1221:1: rule__ConstraintExpression__Group_0__0__Impl : ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) ;
    public final void rule__ConstraintExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1225:1: ( ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1226:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1226:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1227:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentAssignment_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1228:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1228:2: rule__ConstraintExpression__CommentAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2506);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1238:1: rule__ConstraintExpression__Group_0__1 : rule__ConstraintExpression__Group_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1242:1: ( rule__ConstraintExpression__Group_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1243:2: rule__ConstraintExpression__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12536);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1249:1: rule__ConstraintExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ConstraintExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1253:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1254:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1254:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1255:1: ':'
            {
             before(grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConstraintExpression__Group_0__1__Impl2564); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1272:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1276:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1277:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02599);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02602);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1284:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__DataTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1288:1: ( ( ( rule__Variable__DataTypeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1289:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1289:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1290:1: ( rule__Variable__DataTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getDataTypeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1291:1: ( rule__Variable__DataTypeAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1291:2: rule__Variable__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2629);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1301:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1305:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1306:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12659);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12662);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1313:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1317:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1318:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1318:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1319:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1320:1: ( rule__Variable__NameAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1320:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2689);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1330:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1334:1: ( rule__Variable__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1335:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22719);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1341:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1345:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1346:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1346:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1347:1: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Variable__Group__2__Impl2747); 
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


    // $ANTLR start "rule__VariableID__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1366:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1370:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1371:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__02784);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__02787);
            rule__VariableID__Group__1();

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
    // $ANTLR end "rule__VariableID__Group__0"


    // $ANTLR start "rule__VariableID__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1378:1: rule__VariableID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1382:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1383:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1383:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1384:1: RULE_ID
            {
             before(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableID__Group__0__Impl2814); 
             after(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VariableID__Group__0__Impl"


    // $ANTLR start "rule__VariableID__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1395:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1399:1: ( rule__VariableID__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1400:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__12843);
            rule__VariableID__Group__1__Impl();

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
    // $ANTLR end "rule__VariableID__Group__1"


    // $ANTLR start "rule__VariableID__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1406:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__Group_1__0 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1410:1: ( ( ( rule__VariableID__Group_1__0 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1411:1: ( ( rule__VariableID__Group_1__0 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1411:1: ( ( rule__VariableID__Group_1__0 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1412:1: ( rule__VariableID__Group_1__0 )*
            {
             before(grammarAccess.getVariableIDAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1413:1: ( rule__VariableID__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1413:2: rule__VariableID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__0_in_rule__VariableID__Group__1__Impl2870);
            	    rule__VariableID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVariableIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VariableID__Group__1__Impl"


    // $ANTLR start "rule__VariableID__Group_1__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1427:1: rule__VariableID__Group_1__0 : rule__VariableID__Group_1__0__Impl rule__VariableID__Group_1__1 ;
    public final void rule__VariableID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1431:1: ( rule__VariableID__Group_1__0__Impl rule__VariableID__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1432:2: rule__VariableID__Group_1__0__Impl rule__VariableID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__0__Impl_in_rule__VariableID__Group_1__02905);
            rule__VariableID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__1_in_rule__VariableID__Group_1__02908);
            rule__VariableID__Group_1__1();

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
    // $ANTLR end "rule__VariableID__Group_1__0"


    // $ANTLR start "rule__VariableID__Group_1__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1439:1: rule__VariableID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__VariableID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1443:1: ( ( '.' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1444:1: ( '.' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1444:1: ( '.' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1445:1: '.'
            {
             before(grammarAccess.getVariableIDAccess().getFullStopKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__VariableID__Group_1__0__Impl2936); 
             after(grammarAccess.getVariableIDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__VariableID__Group_1__0__Impl"


    // $ANTLR start "rule__VariableID__Group_1__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1458:1: rule__VariableID__Group_1__1 : rule__VariableID__Group_1__1__Impl ;
    public final void rule__VariableID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1462:1: ( rule__VariableID__Group_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1463:2: rule__VariableID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__1__Impl_in_rule__VariableID__Group_1__12967);
            rule__VariableID__Group_1__1__Impl();

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
    // $ANTLR end "rule__VariableID__Group_1__1"


    // $ANTLR start "rule__VariableID__Group_1__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1469:1: rule__VariableID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__VariableID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1473:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1474:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1474:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1475:1: RULE_ID
            {
             before(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableID__Group_1__1__Impl2994); 
             after(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__VariableID__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1490:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1494:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1495:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__03027);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__03030);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1502:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1506:1: ( ( ruleMultiplicationExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1507:1: ( ruleMultiplicationExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1507:1: ( ruleMultiplicationExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1508:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl3057);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1519:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1523:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1524:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__13086);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1530:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1534:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1535:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1535:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1536:1: ( rule__AdditionExpression__Group_1__0 )?
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1537:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1537:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl3113);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1551:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1555:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1556:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__03148);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__03151);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1563:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1567:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1568:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1568:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1569:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1570:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1572:1: 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1582:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1586:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1587:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__13209);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__13212);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1594:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1598:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1599:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1599:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1600:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1601:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1601:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl3239);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1611:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1615:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1616:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__23269);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1622:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1626:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1627:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1627:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1628:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1629:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1629:2: rule__AdditionExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl3296);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1645:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1649:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1650:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__03332);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__03335);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1657:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1661:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1662:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1662:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1663:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl3362);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1674:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1678:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1679:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__13391);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1685:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1689:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1690:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1690:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1691:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1692:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1692:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl3418);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1706:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1710:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1711:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__03453);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__03456);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1718:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1722:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1723:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1723:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1724:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1725:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1727:1: 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1737:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1741:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1742:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__13514);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__13517);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1749:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1753:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1754:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1754:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1755:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1756:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1756:2: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl3544);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1766:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1770:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1771:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__23574);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1777:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1781:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1782:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1782:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1783:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1784:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1784:2: rule__MultiplicationExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3601);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1801:1: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 : ( ruleObjectiveFunctionExpression ) ;
    public final void rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1805:1: ( ( ruleObjectiveFunctionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1806:1: ( ruleObjectiveFunctionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1806:1: ( ruleObjectiveFunctionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1807:1: ruleObjectiveFunctionExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_03642);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1816:1: rule__IntegerLinearProgram__ConstraintsAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__IntegerLinearProgram__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1820:1: ( ( ruleConstraintExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1821:1: ( ruleConstraintExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1821:1: ( ruleConstraintExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1822:1: ruleConstraintExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_13673);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1831:1: rule__IntegerLinearProgram__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__IntegerLinearProgram__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1835:1: ( ( ruleVariable ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1836:1: ( ruleVariable )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1836:1: ( ruleVariable )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1837:1: ruleVariable
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_23704);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1846:1: rule__ObjectiveFunctionExpression__GoalAssignment_1_0 : ( ruleObjectiveGoal ) ;
    public final void rule__ObjectiveFunctionExpression__GoalAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1850:1: ( ( ruleObjectiveGoal ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1851:1: ( ruleObjectiveGoal )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1851:1: ( ruleObjectiveGoal )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1852:1: ruleObjectiveGoal
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_1_03735);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1861:1: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1865:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1866:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1866:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1867:1: ruleLinearExpression
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_23766);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1876:1: rule__ConstraintExpression__CommentAssignment_0_0 : ( ruleVariableID ) ;
    public final void rule__ConstraintExpression__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1880:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1881:1: ( ruleVariableID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1881:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1882:1: ruleVariableID
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentVariableIDParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__ConstraintExpression__CommentAssignment_0_03797);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionAccess().getCommentVariableIDParserRuleCall_0_0_0()); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1891:1: rule__ConstraintExpression__LeftExpressionAssignment_1 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__LeftExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1895:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1896:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1896:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1897:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_13828);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1906:1: rule__ConstraintExpression__OperatorAssignment_2 : ( ruleComparingOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1910:1: ( ( ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1911:1: ( ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1911:1: ( ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1912:1: ruleComparingOperator
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_23859);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1921:1: rule__ConstraintExpression__RightExpressionAssignment_3 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__RightExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1925:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1926:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1926:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1927:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_33890);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1936:1: rule__Variable__DataTypeAssignment_0 : ( ruleILPDataType ) ;
    public final void rule__Variable__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1940:1: ( ( ruleILPDataType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1941:1: ( ruleILPDataType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1941:1: ( ruleILPDataType )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1942:1: ruleILPDataType
            {
             before(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_03921);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1951:1: rule__Variable__NameAssignment_1 : ( ruleVariableID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1955:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1956:1: ( ruleVariableID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1956:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1957:1: ruleVariableID
            {
             before(grammarAccess.getVariableAccess().getNameVariableIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Variable__NameAssignment_13952);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameVariableIDParserRuleCall_1_0()); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1966:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1970:1: ( ( ruleAdditionOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1971:1: ( ruleAdditionOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1971:1: ( ruleAdditionOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1972:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_13983);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1981:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1985:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1986:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1986:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1987:1: ruleLinearExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_24014);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1996:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2000:1: ( ( ruleMultiplicationOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2001:1: ( ruleMultiplicationOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2001:1: ( ruleMultiplicationOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2002:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_14045);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2011:1: rule__MultiplicationExpression__RightExpressionAssignment_1_2 : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2015:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2016:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2016:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2017:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_24076);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2026:1: rule__NumberLiteralExpression__ValueAssignment : ( ruleNumber ) ;
    public final void rule__NumberLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2030:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2031:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2031:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2032:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment4107);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2041:1: rule__VariableExpression__VariableAssignment : ( ( ruleVariableID ) ) ;
    public final void rule__VariableExpression__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2045:1: ( ( ( ruleVariableID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2046:1: ( ( ruleVariableID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2046:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2047:1: ( ruleVariableID )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2048:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2049:1: ruleVariableID
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableVariableIDParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__VariableExpression__VariableAssignment4142);
            ruleVariableID();

            state._fsp--;

             after(grammarAccess.getVariableExpressionAccess().getVariableVariableVariableIDParserRuleCall_0_1()); 

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\6\uffff";
    static final String DFA11_eofS =
        "\6\uffff";
    static final String DFA11_minS =
        "\1\4\1\14\1\uffff\1\6\1\uffff\1\14";
    static final String DFA11_maxS =
        "\1\6\1\33\1\uffff\1\6\1\uffff\1\33";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA11_specialS =
        "\6\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\2\1\1",
            "\1\2\2\uffff\5\2\3\uffff\2\2\1\4\1\uffff\1\3",
            "",
            "\1\5",
            "",
            "\1\2\2\uffff\5\2\3\uffff\2\2\1\4\1\uffff\1\3"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1072:1: ( rule__ConstraintExpression__Group_0__0 )?";
        }
    }
 

    
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
        public static final BitSet FOLLOW_ruleVariableID_in_entryRuleVariableID301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableID308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0_in_ruleVariableID334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_entryRuleLinearExpression361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinearExpression368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_ruleLinearExpression394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_entryRuleSimpleLinearExpression420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleLinearExpression427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleSimpleLinearExpression453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_entryRuleNumberLiteralExpression659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpression666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberLiteralExpression__ValueAssignment_in_ruleNumberLiteralExpression692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression779 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableExpression__VariableAssignment_in_ruleVariableExpression812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveGoal__Alternatives_in_ruleObjectiveGoal849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ILPDataType__Alternatives_in_ruleILPDataType921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMultiplicationOperator994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0_in_rule__ObjectiveFunctionExpression__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0_in_rule__ObjectiveFunctionExpression__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveFunctionExpression__Alternatives_0_01083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ObjectiveFunctionExpression__Alternatives_0_01103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ObjectiveGoal__Alternatives1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ComparingOperator__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ComparingOperator__Alternatives1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ComparingOperator__Alternatives1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ComparingOperator__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ComparingOperator__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ILPDataType__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ILPDataType__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ILPDataType__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AdditionOperator__Alternatives1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AdditionOperator__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01545 = new BitSet(new long[]{0x0000000000700070L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11605 = new BitSet(new long[]{0x0000000000700070L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1635 = new BitSet(new long[]{0x0000000000000072L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1693 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0__Impl_in_rule__ObjectiveFunctionExpression__Group_0__01730 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1_in_rule__ObjectiveFunctionExpression__Group_0__01733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_0_0_in_rule__ObjectiveFunctionExpression__Group_0__0__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1__Impl_in_rule__ObjectiveFunctionExpression__Group_0__11790 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2_in_rule__ObjectiveFunctionExpression__Group_0__11793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_0__1__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2__Impl_in_rule__ObjectiveFunctionExpression__Group_0__21852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_0__2__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0__Impl_in_rule__ObjectiveFunctionExpression__Group_1__01917 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1_in_rule__ObjectiveFunctionExpression__Group_1__01920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_1_0_in_rule__ObjectiveFunctionExpression__Group_1__0__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1__Impl_in_rule__ObjectiveFunctionExpression__Group_1__11977 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2_in_rule__ObjectiveFunctionExpression__Group_1__11980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_1__1__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2__Impl_in_rule__ObjectiveFunctionExpression__Group_1__22039 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3_in_rule__ObjectiveFunctionExpression__Group_1__22042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2_in_rule__ObjectiveFunctionExpression__Group_1__2__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3__Impl_in_rule__ObjectiveFunctionExpression__Group_1__32099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ObjectiveFunctionExpression__Group_1__3__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__02166 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__02169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__12227 = new BitSet(new long[]{0x00000000000F8000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__12230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__22287 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__22290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__32347 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__32350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ConstraintExpression__Group__4__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02476 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConstraintExpression__Group_0__1__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02599 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12659 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Variable__Group__2__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__02784 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__02787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableID__Group__0__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__12843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__0_in_rule__VariableID__Group__1__Impl2870 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__0__Impl_in_rule__VariableID__Group_1__02905 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__1_in_rule__VariableID__Group_1__02908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__VariableID__Group_1__0__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__1__Impl_in_rule__VariableID__Group_1__12967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableID__Group_1__1__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__03027 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__03030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__13086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__03148 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__03151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__13209 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__13212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__23269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__03332 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__03335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__13391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__03453 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__03456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__13514 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__13517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__23574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_03642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_13673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_23704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_1_03735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_23766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__ConstraintExpression__CommentAssignment_0_03797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_13828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_23859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_33890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_03921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Variable__NameAssignment_13952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_13983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_24014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_14045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_24076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__VariableExpression__VariableAssignment4142 = new BitSet(new long[]{0x0000000000000002L});
    }


}