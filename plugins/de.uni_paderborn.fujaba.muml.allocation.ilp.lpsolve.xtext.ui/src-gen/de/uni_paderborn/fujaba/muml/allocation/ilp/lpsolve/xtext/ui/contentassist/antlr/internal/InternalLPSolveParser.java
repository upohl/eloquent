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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'min'", "'max'", "'='", "'>'", "'>='", "'<'", "'<='", "'bin'", "'int'", "'real'", "'+'", "'-'", "':'", "';'", "'.'"
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:377:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:381:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:382:1: ( ( rule__Number__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:382:1: ( ( rule__Number__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:383:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:384:1: ( rule__Number__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:384:2: rule__Number__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__0_in_ruleNumber752);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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


    // $ANTLR start "entryRuleDecimal"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:396:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:397:1: ( ruleDecimal EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:398:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal779);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal786); 

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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:405:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:409:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:410:1: ( ( rule__Decimal__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:410:1: ( ( rule__Decimal__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:411:1: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:412:1: ( rule__Decimal__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:412:2: rule__Decimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__0_in_ruleDecimal812);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleVariableExpression"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:424:1: entryRuleVariableExpression : ruleVariableExpression EOF ;
    public final void entryRuleVariableExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:425:1: ( ruleVariableExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:426:1: ruleVariableExpression EOF
            {
             before(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression839);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableExpression846); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:433:1: ruleVariableExpression : ( ( rule__VariableExpression__VariableAssignment ) ) ;
    public final void ruleVariableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:437:2: ( ( ( rule__VariableExpression__VariableAssignment ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:438:1: ( ( rule__VariableExpression__VariableAssignment ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:438:1: ( ( rule__VariableExpression__VariableAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:439:1: ( rule__VariableExpression__VariableAssignment )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableAssignment()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:440:1: ( rule__VariableExpression__VariableAssignment )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:440:2: rule__VariableExpression__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableExpression__VariableAssignment_in_ruleVariableExpression872);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:453:1: ruleObjectiveGoal : ( ( rule__ObjectiveGoal__Alternatives ) ) ;
    public final void ruleObjectiveGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:457:1: ( ( ( rule__ObjectiveGoal__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:458:1: ( ( rule__ObjectiveGoal__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:458:1: ( ( rule__ObjectiveGoal__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:459:1: ( rule__ObjectiveGoal__Alternatives )
            {
             before(grammarAccess.getObjectiveGoalAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:460:1: ( rule__ObjectiveGoal__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:460:2: rule__ObjectiveGoal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveGoal__Alternatives_in_ruleObjectiveGoal909);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:472:1: ruleComparingOperator : ( ( rule__ComparingOperator__Alternatives ) ) ;
    public final void ruleComparingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:476:1: ( ( ( rule__ComparingOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:477:1: ( ( rule__ComparingOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:477:1: ( ( rule__ComparingOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:478:1: ( rule__ComparingOperator__Alternatives )
            {
             before(grammarAccess.getComparingOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:479:1: ( rule__ComparingOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:479:2: rule__ComparingOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator945);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:491:1: ruleILPDataType : ( ( rule__ILPDataType__Alternatives ) ) ;
    public final void ruleILPDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:495:1: ( ( ( rule__ILPDataType__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:496:1: ( ( rule__ILPDataType__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:496:1: ( ( rule__ILPDataType__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:497:1: ( rule__ILPDataType__Alternatives )
            {
             before(grammarAccess.getILPDataTypeAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:498:1: ( rule__ILPDataType__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:498:2: rule__ILPDataType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ILPDataType__Alternatives_in_ruleILPDataType981);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:510:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:514:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:515:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:515:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:516:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:517:1: ( rule__AdditionOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:517:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator1017);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:529:1: ruleMultiplicationOperator : ( ( '*' ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:533:1: ( ( ( '*' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:534:1: ( ( '*' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:534:1: ( ( '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:535:1: ( '*' )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:536:1: ( '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:536:3: '*'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleMultiplicationOperator1054); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:548:1: rule__ObjectiveFunctionExpression__Alternatives : ( ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) ) | ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) ) );
    public final void rule__ObjectiveFunctionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:552:1: ( ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) ) | ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==24) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==25) ) {
                        alt1=1;
                    }
                    else if ( ((LA1_3>=RULE_ID && LA1_3<=RULE_INT)||LA1_3==23) ) {
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
            else if ( (LA1_0==13) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==24) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==25) ) {
                        alt1=1;
                    }
                    else if ( ((LA1_3>=RULE_ID && LA1_3<=RULE_INT)||LA1_3==23) ) {
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:553:1: ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:553:1: ( ( rule__ObjectiveFunctionExpression__Group_0__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:554:1: ( rule__ObjectiveFunctionExpression__Group_0__0 )
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:555:1: ( rule__ObjectiveFunctionExpression__Group_0__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:555:2: rule__ObjectiveFunctionExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0_in_rule__ObjectiveFunctionExpression__Alternatives1091);
                    rule__ObjectiveFunctionExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:559:6: ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:559:6: ( ( rule__ObjectiveFunctionExpression__Group_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:560:1: ( rule__ObjectiveFunctionExpression__Group_1__0 )
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getGroup_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:561:1: ( rule__ObjectiveFunctionExpression__Group_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:561:2: rule__ObjectiveFunctionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0_in_rule__ObjectiveFunctionExpression__Alternatives1109);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:570:1: rule__ObjectiveFunctionExpression__Alternatives_0_0 : ( ( 'min' ) | ( 'max' ) );
    public final void rule__ObjectiveFunctionExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:574:1: ( ( 'min' ) | ( 'max' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:575:1: ( 'min' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:575:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:576:1: 'min'
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__ObjectiveFunctionExpression__Alternatives_0_01143); 
                     after(grammarAccess.getObjectiveFunctionExpressionAccess().getMinKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:583:6: ( 'max' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:583:6: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:584:1: 'max'
                    {
                     before(grammarAccess.getObjectiveFunctionExpressionAccess().getMaxKeyword_0_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveFunctionExpression__Alternatives_0_01163); 
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


    // $ANTLR start "rule__VariableID__Alternatives_1_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:596:1: rule__VariableID__Alternatives_1_1 : ( ( RULE_ID ) | ( ( rule__VariableID__Group_1_1_1__0 ) ) );
    public final void rule__VariableID__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:600:1: ( ( RULE_ID ) | ( ( rule__VariableID__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:601:1: ( RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:601:1: ( RULE_ID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:602:1: RULE_ID
                    {
                     before(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableID__Alternatives_1_11197); 
                     after(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:607:6: ( ( rule__VariableID__Group_1_1_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:607:6: ( ( rule__VariableID__Group_1_1_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:608:1: ( rule__VariableID__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getVariableIDAccess().getGroup_1_1_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:609:1: ( rule__VariableID__Group_1_1_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:609:2: rule__VariableID__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1_1_1__0_in_rule__VariableID__Alternatives_1_11214);
                    rule__VariableID__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableIDAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__VariableID__Alternatives_1_1"


    // $ANTLR start "rule__Operand__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:618:1: rule__Operand__Alternatives : ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:622:1: ( ( ruleNumberLiteralExpression ) | ( ruleVariableExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:623:1: ( ruleNumberLiteralExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:623:1: ( ruleNumberLiteralExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:624:1: ruleNumberLiteralExpression
                    {
                     before(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives1247);
                    ruleNumberLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNumberLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:629:6: ( ruleVariableExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:629:6: ( ruleVariableExpression )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:630:1: ruleVariableExpression
                    {
                     before(grammarAccess.getOperandAccess().getVariableExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives1264);
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


    // $ANTLR start "rule__Number__Alternatives_1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:640:1: rule__Number__Alternatives_1 : ( ( ruleDecimal ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:644:1: ( ( ruleDecimal ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==11||(LA5_1>=14 && LA5_1<=18)||(LA5_1>=22 && LA5_1<=23)||LA5_1==25) ) {
                    alt5=2;
                }
                else if ( (LA5_1==26) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:645:1: ( ruleDecimal )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:645:1: ( ruleDecimal )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:646:1: ruleDecimal
                    {
                     before(grammarAccess.getNumberAccess().getDecimalParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_rule__Number__Alternatives_11296);
                    ruleDecimal();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getDecimalParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:651:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:651:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:652:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Number__Alternatives_11313); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_1"


    // $ANTLR start "rule__ObjectiveGoal__Alternatives"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:662:1: rule__ObjectiveGoal__Alternatives : ( ( ( 'min' ) ) | ( ( 'max' ) ) );
    public final void rule__ObjectiveGoal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:666:1: ( ( ( 'min' ) ) | ( ( 'max' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:667:1: ( ( 'min' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:667:1: ( ( 'min' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:668:1: ( 'min' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:669:1: ( 'min' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:669:3: 'min'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__ObjectiveGoal__Alternatives1346); 

                    }

                     after(grammarAccess.getObjectiveGoalAccess().getMINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:674:6: ( ( 'max' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:674:6: ( ( 'max' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:675:1: ( 'max' )
                    {
                     before(grammarAccess.getObjectiveGoalAccess().getMAXEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:676:1: ( 'max' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:676:3: 'max'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1367); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:686:1: rule__ComparingOperator__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:690:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:691:1: ( ( '=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:691:1: ( ( '=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:692:1: ( '=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:693:1: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:693:3: '='
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ComparingOperator__Alternatives1403); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:698:6: ( ( '>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:698:6: ( ( '>' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:699:1: ( '>' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:700:1: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:700:3: '>'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ComparingOperator__Alternatives1424); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:705:6: ( ( '>=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:705:6: ( ( '>=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:706:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:707:1: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:707:3: '>='
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ComparingOperator__Alternatives1445); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:712:6: ( ( '<' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:712:6: ( ( '<' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:713:1: ( '<' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:714:1: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:714:3: '<'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ComparingOperator__Alternatives1466); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:719:6: ( ( '<=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:719:6: ( ( '<=' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:720:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:721:1: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:721:3: '<='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ComparingOperator__Alternatives1487); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:731:1: rule__ILPDataType__Alternatives : ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) );
    public final void rule__ILPDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:735:1: ( ( ( 'bin' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:736:1: ( ( 'bin' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:736:1: ( ( 'bin' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:737:1: ( 'bin' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:738:1: ( 'bin' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:738:3: 'bin'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ILPDataType__Alternatives1523); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getBINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:743:6: ( ( 'int' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:743:6: ( ( 'int' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:744:1: ( 'int' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:745:1: ( 'int' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:745:3: 'int'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ILPDataType__Alternatives1544); 

                    }

                     after(grammarAccess.getILPDataTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:750:6: ( ( 'real' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:750:6: ( ( 'real' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:751:1: ( 'real' )
                    {
                     before(grammarAccess.getILPDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:752:1: ( 'real' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:752:3: 'real'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ILPDataType__Alternatives1565); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:762:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:766:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:767:1: ( ( '+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:767:1: ( ( '+' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:768:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:769:1: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:769:3: '+'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__AdditionOperator__Alternatives1601); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:774:6: ( ( '-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:774:6: ( ( '-' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:775:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:776:1: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:776:3: '-'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__AdditionOperator__Alternatives1622); 

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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:788:1: rule__IntegerLinearProgram__Group__0 : rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 ;
    public final void rule__IntegerLinearProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:792:1: ( rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:793:2: rule__IntegerLinearProgram__Group__0__Impl rule__IntegerLinearProgram__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01655);
            rule__IntegerLinearProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01658);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:800:1: rule__IntegerLinearProgram__Group__0__Impl : ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) ;
    public final void rule__IntegerLinearProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:804:1: ( ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:805:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:805:1: ( ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:806:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:807:1: ( rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:807:2: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1685);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:817:1: rule__IntegerLinearProgram__Group__1 : rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 ;
    public final void rule__IntegerLinearProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:821:1: ( rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:822:2: rule__IntegerLinearProgram__Group__1__Impl rule__IntegerLinearProgram__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11715);
            rule__IntegerLinearProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11718);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:829:1: rule__IntegerLinearProgram__Group__1__Impl : ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) ;
    public final void rule__IntegerLinearProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:833:1: ( ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:834:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:834:1: ( ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:835:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:836:1: ( rule__IntegerLinearProgram__ConstraintsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:836:2: rule__IntegerLinearProgram__ConstraintsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1745);
            	    rule__IntegerLinearProgram__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:846:1: rule__IntegerLinearProgram__Group__2 : rule__IntegerLinearProgram__Group__2__Impl ;
    public final void rule__IntegerLinearProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:850:1: ( rule__IntegerLinearProgram__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:851:2: rule__IntegerLinearProgram__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21776);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:857:1: rule__IntegerLinearProgram__Group__2__Impl : ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) ;
    public final void rule__IntegerLinearProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:861:1: ( ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:862:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:862:1: ( ( rule__IntegerLinearProgram__VariablesAssignment_2 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:863:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:864:1: ( rule__IntegerLinearProgram__VariablesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:864:2: rule__IntegerLinearProgram__VariablesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1803);
            	    rule__IntegerLinearProgram__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:880:1: rule__ObjectiveFunctionExpression__Group_0__0 : rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1 ;
    public final void rule__ObjectiveFunctionExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:884:1: ( rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:885:2: rule__ObjectiveFunctionExpression__Group_0__0__Impl rule__ObjectiveFunctionExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0__Impl_in_rule__ObjectiveFunctionExpression__Group_0__01840);
            rule__ObjectiveFunctionExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1_in_rule__ObjectiveFunctionExpression__Group_0__01843);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:892:1: rule__ObjectiveFunctionExpression__Group_0__0__Impl : ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:896:1: ( ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:897:1: ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:897:1: ( ( rule__ObjectiveFunctionExpression__Alternatives_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:898:1: ( rule__ObjectiveFunctionExpression__Alternatives_0_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getAlternatives_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:899:1: ( rule__ObjectiveFunctionExpression__Alternatives_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:899:2: rule__ObjectiveFunctionExpression__Alternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_0_0_in_rule__ObjectiveFunctionExpression__Group_0__0__Impl1870);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:909:1: rule__ObjectiveFunctionExpression__Group_0__1 : rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2 ;
    public final void rule__ObjectiveFunctionExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:913:1: ( rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:914:2: rule__ObjectiveFunctionExpression__Group_0__1__Impl rule__ObjectiveFunctionExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1__Impl_in_rule__ObjectiveFunctionExpression__Group_0__11900);
            rule__ObjectiveFunctionExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2_in_rule__ObjectiveFunctionExpression__Group_0__11903);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:921:1: rule__ObjectiveFunctionExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:925:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:926:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:926:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:927:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_0_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ObjectiveFunctionExpression__Group_0__1__Impl1931); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:940:1: rule__ObjectiveFunctionExpression__Group_0__2 : rule__ObjectiveFunctionExpression__Group_0__2__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:944:1: ( rule__ObjectiveFunctionExpression__Group_0__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:945:2: rule__ObjectiveFunctionExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2__Impl_in_rule__ObjectiveFunctionExpression__Group_0__21962);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:951:1: rule__ObjectiveFunctionExpression__Group_0__2__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:955:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:956:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:956:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:957:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_0_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_0__2__Impl1990); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:976:1: rule__ObjectiveFunctionExpression__Group_1__0 : rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:980:1: ( rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:981:2: rule__ObjectiveFunctionExpression__Group_1__0__Impl rule__ObjectiveFunctionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0__Impl_in_rule__ObjectiveFunctionExpression__Group_1__02027);
            rule__ObjectiveFunctionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1_in_rule__ObjectiveFunctionExpression__Group_1__02030);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:988:1: rule__ObjectiveFunctionExpression__Group_1__0__Impl : ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:992:1: ( ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:993:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:993:1: ( ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:994:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalAssignment_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:995:1: ( rule__ObjectiveFunctionExpression__GoalAssignment_1_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:995:2: rule__ObjectiveFunctionExpression__GoalAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_1_0_in_rule__ObjectiveFunctionExpression__Group_1__0__Impl2057);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1005:1: rule__ObjectiveFunctionExpression__Group_1__1 : rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1009:1: ( rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1010:2: rule__ObjectiveFunctionExpression__Group_1__1__Impl rule__ObjectiveFunctionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1__Impl_in_rule__ObjectiveFunctionExpression__Group_1__12087);
            rule__ObjectiveFunctionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2_in_rule__ObjectiveFunctionExpression__Group_1__12090);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1017:1: rule__ObjectiveFunctionExpression__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1021:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1022:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1022:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1023:1: ':'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getColonKeyword_1_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ObjectiveFunctionExpression__Group_1__1__Impl2118); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1036:1: rule__ObjectiveFunctionExpression__Group_1__2 : rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3 ;
    public final void rule__ObjectiveFunctionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1040:1: ( rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1041:2: rule__ObjectiveFunctionExpression__Group_1__2__Impl rule__ObjectiveFunctionExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2__Impl_in_rule__ObjectiveFunctionExpression__Group_1__22149);
            rule__ObjectiveFunctionExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3_in_rule__ObjectiveFunctionExpression__Group_1__22152);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1048:1: rule__ObjectiveFunctionExpression__Group_1__2__Impl : ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1052:1: ( ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1053:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1053:1: ( ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1054:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 )
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1055:1: ( rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1055:2: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2_in_rule__ObjectiveFunctionExpression__Group_1__2__Impl2179);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1065:1: rule__ObjectiveFunctionExpression__Group_1__3 : rule__ObjectiveFunctionExpression__Group_1__3__Impl ;
    public final void rule__ObjectiveFunctionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1069:1: ( rule__ObjectiveFunctionExpression__Group_1__3__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1070:2: rule__ObjectiveFunctionExpression__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3__Impl_in_rule__ObjectiveFunctionExpression__Group_1__32209);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1076:1: rule__ObjectiveFunctionExpression__Group_1__3__Impl : ( ';' ) ;
    public final void rule__ObjectiveFunctionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1080:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1081:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1081:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1082:1: ';'
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getSemicolonKeyword_1_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_1__3__Impl2237); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1103:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1107:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1108:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__02276);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__02279);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1115:1: rule__ConstraintExpression__Group__0__Impl : ( ( rule__ConstraintExpression__Group_0__0 )? ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1119:1: ( ( ( rule__ConstraintExpression__Group_0__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1120:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1120:1: ( ( rule__ConstraintExpression__Group_0__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1121:1: ( rule__ConstraintExpression__Group_0__0 )?
            {
             before(grammarAccess.getConstraintExpressionAccess().getGroup_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1122:1: ( rule__ConstraintExpression__Group_0__0 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1122:2: rule__ConstraintExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl2306);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1132:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1136:1: ( rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1137:2: rule__ConstraintExpression__Group__1__Impl rule__ConstraintExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__12337);
            rule__ConstraintExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__12340);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1144:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1148:1: ( ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1149:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1149:1: ( ( rule__ConstraintExpression__LeftExpressionAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1150:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1151:1: ( rule__ConstraintExpression__LeftExpressionAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1151:2: rule__ConstraintExpression__LeftExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl2367);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1161:1: rule__ConstraintExpression__Group__2 : rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 ;
    public final void rule__ConstraintExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1165:1: ( rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1166:2: rule__ConstraintExpression__Group__2__Impl rule__ConstraintExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__22397);
            rule__ConstraintExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__22400);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1173:1: rule__ConstraintExpression__Group__2__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) ;
    public final void rule__ConstraintExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1177:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1178:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1178:1: ( ( rule__ConstraintExpression__OperatorAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1179:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1180:1: ( rule__ConstraintExpression__OperatorAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1180:2: rule__ConstraintExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl2427);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1190:1: rule__ConstraintExpression__Group__3 : rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 ;
    public final void rule__ConstraintExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1194:1: ( rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1195:2: rule__ConstraintExpression__Group__3__Impl rule__ConstraintExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__32457);
            rule__ConstraintExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__32460);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1202:1: rule__ConstraintExpression__Group__3__Impl : ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) ;
    public final void rule__ConstraintExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1206:1: ( ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1207:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1207:1: ( ( rule__ConstraintExpression__RightExpressionAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1208:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionAssignment_3()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1209:1: ( rule__ConstraintExpression__RightExpressionAssignment_3 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1209:2: rule__ConstraintExpression__RightExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2487);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1219:1: rule__ConstraintExpression__Group__4 : rule__ConstraintExpression__Group__4__Impl ;
    public final void rule__ConstraintExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1223:1: ( rule__ConstraintExpression__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1224:2: rule__ConstraintExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42517);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1230:1: rule__ConstraintExpression__Group__4__Impl : ( ';' ) ;
    public final void rule__ConstraintExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1234:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1235:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1235:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1236:1: ';'
            {
             before(grammarAccess.getConstraintExpressionAccess().getSemicolonKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ConstraintExpression__Group__4__Impl2545); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1259:1: rule__ConstraintExpression__Group_0__0 : rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 ;
    public final void rule__ConstraintExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1263:1: ( rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1264:2: rule__ConstraintExpression__Group_0__0__Impl rule__ConstraintExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02586);
            rule__ConstraintExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02589);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1271:1: rule__ConstraintExpression__Group_0__0__Impl : ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) ;
    public final void rule__ConstraintExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1275:1: ( ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1276:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1276:1: ( ( rule__ConstraintExpression__CommentAssignment_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1277:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentAssignment_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1278:1: ( rule__ConstraintExpression__CommentAssignment_0_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1278:2: rule__ConstraintExpression__CommentAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2616);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1288:1: rule__ConstraintExpression__Group_0__1 : rule__ConstraintExpression__Group_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1292:1: ( rule__ConstraintExpression__Group_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1293:2: rule__ConstraintExpression__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12646);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1299:1: rule__ConstraintExpression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ConstraintExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1303:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1304:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1304:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1305:1: ':'
            {
             before(grammarAccess.getConstraintExpressionAccess().getColonKeyword_0_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ConstraintExpression__Group_0__1__Impl2674); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1322:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1326:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1327:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02709);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02712);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1334:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__DataTypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1338:1: ( ( ( rule__Variable__DataTypeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1339:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1339:1: ( ( rule__Variable__DataTypeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1340:1: ( rule__Variable__DataTypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getDataTypeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1341:1: ( rule__Variable__DataTypeAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1341:2: rule__Variable__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2739);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1351:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1355:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1356:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12769);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12772);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1363:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1367:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1368:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1368:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1369:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1370:1: ( rule__Variable__NameAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1370:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2799);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1380:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1384:1: ( rule__Variable__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1385:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22829);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1391:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1395:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1396:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1396:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1397:1: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Variable__Group__2__Impl2857); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1416:1: rule__VariableID__Group__0 : rule__VariableID__Group__0__Impl rule__VariableID__Group__1 ;
    public final void rule__VariableID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1420:1: ( rule__VariableID__Group__0__Impl rule__VariableID__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1421:2: rule__VariableID__Group__0__Impl rule__VariableID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__02894);
            rule__VariableID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__02897);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1428:1: rule__VariableID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__VariableID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1432:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1433:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1433:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1434:1: RULE_ID
            {
             before(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableID__Group__0__Impl2924); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1445:1: rule__VariableID__Group__1 : rule__VariableID__Group__1__Impl ;
    public final void rule__VariableID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1449:1: ( rule__VariableID__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1450:2: rule__VariableID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__12953);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1456:1: rule__VariableID__Group__1__Impl : ( ( rule__VariableID__Group_1__0 )* ) ;
    public final void rule__VariableID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1460:1: ( ( ( rule__VariableID__Group_1__0 )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1461:1: ( ( rule__VariableID__Group_1__0 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1461:1: ( ( rule__VariableID__Group_1__0 )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1462:1: ( rule__VariableID__Group_1__0 )*
            {
             before(grammarAccess.getVariableIDAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1463:1: ( rule__VariableID__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1463:2: rule__VariableID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__0_in_rule__VariableID__Group__1__Impl2980);
            	    rule__VariableID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1477:1: rule__VariableID__Group_1__0 : rule__VariableID__Group_1__0__Impl rule__VariableID__Group_1__1 ;
    public final void rule__VariableID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1481:1: ( rule__VariableID__Group_1__0__Impl rule__VariableID__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1482:2: rule__VariableID__Group_1__0__Impl rule__VariableID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__0__Impl_in_rule__VariableID__Group_1__03015);
            rule__VariableID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__1_in_rule__VariableID__Group_1__03018);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1489:1: rule__VariableID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__VariableID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1493:1: ( ( '.' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1494:1: ( '.' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1494:1: ( '.' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1495:1: '.'
            {
             before(grammarAccess.getVariableIDAccess().getFullStopKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__VariableID__Group_1__0__Impl3046); 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1508:1: rule__VariableID__Group_1__1 : rule__VariableID__Group_1__1__Impl ;
    public final void rule__VariableID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1512:1: ( rule__VariableID__Group_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1513:2: rule__VariableID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1__1__Impl_in_rule__VariableID__Group_1__13077);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1519:1: rule__VariableID__Group_1__1__Impl : ( ( rule__VariableID__Alternatives_1_1 ) ) ;
    public final void rule__VariableID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1523:1: ( ( ( rule__VariableID__Alternatives_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1524:1: ( ( rule__VariableID__Alternatives_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1524:1: ( ( rule__VariableID__Alternatives_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1525:1: ( rule__VariableID__Alternatives_1_1 )
            {
             before(grammarAccess.getVariableIDAccess().getAlternatives_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1526:1: ( rule__VariableID__Alternatives_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1526:2: rule__VariableID__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Alternatives_1_1_in_rule__VariableID__Group_1__1__Impl3104);
            rule__VariableID__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableIDAccess().getAlternatives_1_1()); 

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


    // $ANTLR start "rule__VariableID__Group_1_1_1__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1540:1: rule__VariableID__Group_1_1_1__0 : rule__VariableID__Group_1_1_1__0__Impl rule__VariableID__Group_1_1_1__1 ;
    public final void rule__VariableID__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1544:1: ( rule__VariableID__Group_1_1_1__0__Impl rule__VariableID__Group_1_1_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1545:2: rule__VariableID__Group_1_1_1__0__Impl rule__VariableID__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1_1_1__0__Impl_in_rule__VariableID__Group_1_1_1__03138);
            rule__VariableID__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1_1_1__1_in_rule__VariableID__Group_1_1_1__03141);
            rule__VariableID__Group_1_1_1__1();

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
    // $ANTLR end "rule__VariableID__Group_1_1_1__0"


    // $ANTLR start "rule__VariableID__Group_1_1_1__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1552:1: rule__VariableID__Group_1_1_1__0__Impl : ( RULE_INT ) ;
    public final void rule__VariableID__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1556:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1557:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1557:1: ( RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1558:1: RULE_INT
            {
             before(grammarAccess.getVariableIDAccess().getINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__VariableID__Group_1_1_1__0__Impl3168); 
             after(grammarAccess.getVariableIDAccess().getINTTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__VariableID__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__VariableID__Group_1_1_1__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1569:1: rule__VariableID__Group_1_1_1__1 : rule__VariableID__Group_1_1_1__1__Impl ;
    public final void rule__VariableID__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1573:1: ( rule__VariableID__Group_1_1_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1574:2: rule__VariableID__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableID__Group_1_1_1__1__Impl_in_rule__VariableID__Group_1_1_1__13197);
            rule__VariableID__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__VariableID__Group_1_1_1__1"


    // $ANTLR start "rule__VariableID__Group_1_1_1__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1580:1: rule__VariableID__Group_1_1_1__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__VariableID__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1584:1: ( ( ( RULE_ID )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1585:1: ( ( RULE_ID )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1585:1: ( ( RULE_ID )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1586:1: ( RULE_ID )?
            {
             before(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1587:1: ( RULE_ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1587:3: RULE_ID
                    {
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableID__Group_1_1_1__1__Impl3225); 

                    }
                    break;

            }

             after(grammarAccess.getVariableIDAccess().getIDTerminalRuleCall_1_1_1_1()); 

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
    // $ANTLR end "rule__VariableID__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1601:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1605:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1606:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__03260);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__03263);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1613:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1617:1: ( ( ruleMultiplicationExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1618:1: ( ruleMultiplicationExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1618:1: ( ruleMultiplicationExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1619:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl3290);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1630:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1634:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1635:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__13319);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1641:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )? ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1645:1: ( ( ( rule__AdditionExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1646:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1646:1: ( ( rule__AdditionExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1647:1: ( rule__AdditionExpression__Group_1__0 )?
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1648:1: ( rule__AdditionExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=22 && LA15_0<=23)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1648:2: rule__AdditionExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl3346);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1662:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1666:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1667:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__03381);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__03384);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1674:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1678:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1679:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1679:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1680:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1681:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1683:1: 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1693:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1697:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1698:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__13442);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__13445);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1705:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1709:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1710:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1710:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1711:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1712:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1712:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl3472);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1722:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1726:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1727:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__23502);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1733:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1737:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1738:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1738:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1739:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1740:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1740:2: rule__AdditionExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl3529);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1756:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1760:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1761:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__03565);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__03568);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1768:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1772:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1773:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1773:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1774:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl3595);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1785:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1789:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1790:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__13624);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1796:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )? ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1800:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1801:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1801:1: ( ( rule__MultiplicationExpression__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1802:1: ( rule__MultiplicationExpression__Group_1__0 )?
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1803:1: ( rule__MultiplicationExpression__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1803:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl3651);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1817:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1821:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1822:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__03686);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__03689);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1829:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1833:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1834:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1834:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1835:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1836:1: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1838:1: 
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1848:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1852:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1853:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__13747);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__13750);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1860:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1864:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1865:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1865:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1866:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1867:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1867:2: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl3777);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1877:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1881:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1882:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__23807);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1888:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1892:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1893:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1893:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1894:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1895:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1895:2: rule__MultiplicationExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3834);
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


    // $ANTLR start "rule__Number__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1911:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1915:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1916:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__03870);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__1_in_rule__Number__Group__03873);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1923:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1927:1: ( ( ( '-' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1928:1: ( ( '-' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1928:1: ( ( '-' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1929:1: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1930:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1931:2: '-'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Number__Group__0__Impl3902); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1942:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1946:1: ( rule__Number__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1947:2: rule__Number__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__13935);
            rule__Number__Group__1__Impl();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1953:1: rule__Number__Group__1__Impl : ( ( rule__Number__Alternatives_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1957:1: ( ( ( rule__Number__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1958:1: ( ( rule__Number__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1958:1: ( ( rule__Number__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1959:1: ( rule__Number__Alternatives_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1960:1: ( rule__Number__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1960:2: rule__Number__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Alternatives_1_in_rule__Number__Group__1__Impl3962);
            rule__Number__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1974:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1978:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1979:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__03996);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__03999);
            rule__Decimal__Group__1();

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
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1986:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1990:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1991:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1991:1: ( RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:1992:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Decimal__Group__0__Impl4026); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2003:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2007:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2008:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__14055);
            rule__Decimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__14058);
            rule__Decimal__Group__2();

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
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2015:1: rule__Decimal__Group__1__Impl : ( '.' ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2019:1: ( ( '.' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2020:1: ( '.' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2020:1: ( '.' )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2021:1: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Decimal__Group__1__Impl4086); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__2"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2034:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2038:1: ( rule__Decimal__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2039:2: rule__Decimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__24117);
            rule__Decimal__Group__2__Impl();

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
    // $ANTLR end "rule__Decimal__Group__2"


    // $ANTLR start "rule__Decimal__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2045:1: rule__Decimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2049:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2050:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2050:1: ( RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2051:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Decimal__Group__2__Impl4144); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Decimal__Group__2__Impl"


    // $ANTLR start "rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0"
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2069:1: rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0 : ( ruleObjectiveFunctionExpression ) ;
    public final void rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2073:1: ( ( ruleObjectiveFunctionExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2074:1: ( ruleObjectiveFunctionExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2074:1: ( ruleObjectiveFunctionExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2075:1: ruleObjectiveFunctionExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getObjectiveFunctionObjectiveFunctionExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_04184);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2084:1: rule__IntegerLinearProgram__ConstraintsAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__IntegerLinearProgram__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2088:1: ( ( ruleConstraintExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2089:1: ( ruleConstraintExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2089:1: ( ruleConstraintExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2090:1: ruleConstraintExpression
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getConstraintsConstraintExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_14215);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2099:1: rule__IntegerLinearProgram__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__IntegerLinearProgram__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2103:1: ( ( ruleVariable ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2104:1: ( ruleVariable )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2104:1: ( ruleVariable )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2105:1: ruleVariable
            {
             before(grammarAccess.getIntegerLinearProgramAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_24246);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2114:1: rule__ObjectiveFunctionExpression__GoalAssignment_1_0 : ( ruleObjectiveGoal ) ;
    public final void rule__ObjectiveFunctionExpression__GoalAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2118:1: ( ( ruleObjectiveGoal ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2119:1: ( ruleObjectiveGoal )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2119:1: ( ruleObjectiveGoal )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2120:1: ruleObjectiveGoal
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getGoalObjectiveGoalEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_1_04277);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2129:1: rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2133:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2134:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2134:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2135:1: ruleLinearExpression
            {
             before(grammarAccess.getObjectiveFunctionExpressionAccess().getObjectiveFunctionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_24308);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2144:1: rule__ConstraintExpression__CommentAssignment_0_0 : ( ruleVariableID ) ;
    public final void rule__ConstraintExpression__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2148:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2149:1: ( ruleVariableID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2149:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2150:1: ruleVariableID
            {
             before(grammarAccess.getConstraintExpressionAccess().getCommentVariableIDParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__ConstraintExpression__CommentAssignment_0_04339);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2159:1: rule__ConstraintExpression__LeftExpressionAssignment_1 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__LeftExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2163:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2164:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2164:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2165:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getLeftExpressionSimpleLinearExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_14370);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2174:1: rule__ConstraintExpression__OperatorAssignment_2 : ( ruleComparingOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2178:1: ( ( ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2179:1: ( ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2179:1: ( ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2180:1: ruleComparingOperator
            {
             before(grammarAccess.getConstraintExpressionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_24401);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2189:1: rule__ConstraintExpression__RightExpressionAssignment_3 : ( ruleSimpleLinearExpression ) ;
    public final void rule__ConstraintExpression__RightExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2193:1: ( ( ruleSimpleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2194:1: ( ruleSimpleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2194:1: ( ruleSimpleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2195:1: ruleSimpleLinearExpression
            {
             before(grammarAccess.getConstraintExpressionAccess().getRightExpressionSimpleLinearExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_34432);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2204:1: rule__Variable__DataTypeAssignment_0 : ( ruleILPDataType ) ;
    public final void rule__Variable__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2208:1: ( ( ruleILPDataType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2209:1: ( ruleILPDataType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2209:1: ( ruleILPDataType )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2210:1: ruleILPDataType
            {
             before(grammarAccess.getVariableAccess().getDataTypeILPDataTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_04463);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2219:1: rule__Variable__NameAssignment_1 : ( ruleVariableID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2223:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2224:1: ( ruleVariableID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2224:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2225:1: ruleVariableID
            {
             before(grammarAccess.getVariableAccess().getNameVariableIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__Variable__NameAssignment_14494);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2234:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2238:1: ( ( ruleAdditionOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2239:1: ( ruleAdditionOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2239:1: ( ruleAdditionOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2240:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_14525);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2249:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleLinearExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2253:1: ( ( ruleLinearExpression ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2254:1: ( ruleLinearExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2254:1: ( ruleLinearExpression )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2255:1: ruleLinearExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionLinearExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_24556);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2264:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2268:1: ( ( ruleMultiplicationOperator ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2269:1: ( ruleMultiplicationOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2269:1: ( ruleMultiplicationOperator )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2270:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_14587);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2279:1: rule__MultiplicationExpression__RightExpressionAssignment_1_2 : ( ruleOperand ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2283:1: ( ( ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2284:1: ( ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2284:1: ( ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2285:1: ruleOperand
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_24618);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2294:1: rule__NumberLiteralExpression__ValueAssignment : ( ruleNumber ) ;
    public final void rule__NumberLiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2298:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2299:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2299:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2300:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralExpressionAccess().getValueNumberParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment4649);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2309:1: rule__VariableExpression__VariableAssignment : ( ( ruleVariableID ) ) ;
    public final void rule__VariableExpression__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2313:1: ( ( ( ruleVariableID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2314:1: ( ( ruleVariableID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2314:1: ( ( ruleVariableID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2315:1: ( ruleVariableID )
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableCrossReference_0()); 
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2316:1: ( ruleVariableID )
            // ../de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui/src-gen/de/uni_paderborn/fujaba/muml/allocation/ilp/lpsolve/xtext/ui/contentassist/antlr/internal/InternalLPSolve.g:2317:1: ruleVariableID
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableVariableVariableIDParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableID_in_rule__VariableExpression__VariableAssignment4684);
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


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\10\uffff";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\1\4\1\13\1\uffff\1\4\1\uffff\1\13\1\4\1\13";
    static final String DFA12_maxS =
        "\1\27\1\32\1\uffff\1\5\1\uffff\3\32";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\21\uffff\1\2",
            "\1\2\2\uffff\5\2\3\uffff\2\2\1\4\1\uffff\1\3",
            "",
            "\1\5\1\6",
            "",
            "\1\2\2\uffff\5\2\3\uffff\2\2\1\4\1\uffff\1\3",
            "\1\7\6\uffff\1\2\2\uffff\5\2\3\uffff\2\2\1\4\1\uffff\1\3",
            "\1\2\2\uffff\5\2\3\uffff\2\2\1\4\1\uffff\1\3"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1122:1: ( rule__ConstraintExpression__Group_0__0 )?";
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
        public static final BitSet FOLLOW_rule__Number__Group__0_in_ruleNumber752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal779 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__0_in_ruleDecimal812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression839 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableExpression__VariableAssignment_in_ruleVariableExpression872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveGoal__Alternatives_in_ruleObjectiveGoal909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ILPDataType__Alternatives_in_ruleILPDataType981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMultiplicationOperator1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0_in_rule__ObjectiveFunctionExpression__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0_in_rule__ObjectiveFunctionExpression__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ObjectiveFunctionExpression__Alternatives_0_01143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveFunctionExpression__Alternatives_0_01163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableID__Alternatives_1_11197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1_1_1__0_in_rule__VariableID__Alternatives_1_11214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpression_in_rule__Operand__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableExpression_in_rule__Operand__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_rule__Number__Alternatives_11296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_11313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ObjectiveGoal__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ObjectiveGoal__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ComparingOperator__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ComparingOperator__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ComparingOperator__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ComparingOperator__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ComparingOperator__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ILPDataType__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ILPDataType__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ILPDataType__Alternatives1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__AdditionOperator__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AdditionOperator__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__0__Impl_in_rule__IntegerLinearProgram__Group__01655 = new BitSet(new long[]{0x0000000000B80030L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1_in_rule__IntegerLinearProgram__Group__01658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_0_in_rule__IntegerLinearProgram__Group__0__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__1__Impl_in_rule__IntegerLinearProgram__Group__11715 = new BitSet(new long[]{0x0000000000B80030L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2_in_rule__IntegerLinearProgram__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__ConstraintsAssignment_1_in_rule__IntegerLinearProgram__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000800032L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__Group__2__Impl_in_rule__IntegerLinearProgram__Group__21776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLinearProgram__VariablesAssignment_2_in_rule__IntegerLinearProgram__Group__2__Impl1803 = new BitSet(new long[]{0x0000000000380002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__0__Impl_in_rule__ObjectiveFunctionExpression__Group_0__01840 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1_in_rule__ObjectiveFunctionExpression__Group_0__01843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Alternatives_0_0_in_rule__ObjectiveFunctionExpression__Group_0__0__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__1__Impl_in_rule__ObjectiveFunctionExpression__Group_0__11900 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2_in_rule__ObjectiveFunctionExpression__Group_0__11903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ObjectiveFunctionExpression__Group_0__1__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_0__2__Impl_in_rule__ObjectiveFunctionExpression__Group_0__21962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_0__2__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__0__Impl_in_rule__ObjectiveFunctionExpression__Group_1__02027 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1_in_rule__ObjectiveFunctionExpression__Group_1__02030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__GoalAssignment_1_0_in_rule__ObjectiveFunctionExpression__Group_1__0__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__1__Impl_in_rule__ObjectiveFunctionExpression__Group_1__12087 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2_in_rule__ObjectiveFunctionExpression__Group_1__12090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ObjectiveFunctionExpression__Group_1__1__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__2__Impl_in_rule__ObjectiveFunctionExpression__Group_1__22149 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3_in_rule__ObjectiveFunctionExpression__Group_1__22152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_2_in_rule__ObjectiveFunctionExpression__Group_1__2__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ObjectiveFunctionExpression__Group_1__3__Impl_in_rule__ObjectiveFunctionExpression__Group_1__32209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ObjectiveFunctionExpression__Group_1__3__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__02276 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__02279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0_in_rule__ConstraintExpression__Group__0__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__12337 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2_in_rule__ConstraintExpression__Group__12340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__LeftExpressionAssignment_1_in_rule__ConstraintExpression__Group__1__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__2__Impl_in_rule__ConstraintExpression__Group__22397 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3_in_rule__ConstraintExpression__Group__22400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_2_in_rule__ConstraintExpression__Group__2__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__3__Impl_in_rule__ConstraintExpression__Group__32457 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4_in_rule__ConstraintExpression__Group__32460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__RightExpressionAssignment_3_in_rule__ConstraintExpression__Group__3__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group__4__Impl_in_rule__ConstraintExpression__Group__42517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ConstraintExpression__Group__4__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__0__Impl_in_rule__ConstraintExpression__Group_0__02586 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1_in_rule__ConstraintExpression__Group_0__02589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__CommentAssignment_0_0_in_rule__ConstraintExpression__Group_0__0__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConstraintExpression__Group_0__1__Impl_in_rule__ConstraintExpression__Group_0__12646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ConstraintExpression__Group_0__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DataTypeAssignment_0_in_rule__Variable__Group__0__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12769 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__12772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__22829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Variable__Group__2__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__0__Impl_in_rule__VariableID__Group__02894 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1_in_rule__VariableID__Group__02897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableID__Group__0__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group__1__Impl_in_rule__VariableID__Group__12953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__0_in_rule__VariableID__Group__1__Impl2980 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__0__Impl_in_rule__VariableID__Group_1__03015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__1_in_rule__VariableID__Group_1__03018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__VariableID__Group_1__0__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1__1__Impl_in_rule__VariableID__Group_1__13077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Alternatives_1_1_in_rule__VariableID__Group_1__1__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1_1_1__0__Impl_in_rule__VariableID__Group_1_1_1__03138 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1_1_1__1_in_rule__VariableID__Group_1_1_1__03141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__VariableID__Group_1_1_1__0__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableID__Group_1_1_1__1__Impl_in_rule__VariableID__Group_1_1_1__13197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableID__Group_1_1_1__1__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__03260 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__03263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__13319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__03381 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__03384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__13442 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__13445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__23502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AdditionExpression__RightExpressionAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__03565 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__03568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__Group__0__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__13624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__03686 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__03689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__13747 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__13750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__23807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiplicationExpression__RightExpressionAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__03870 = new BitSet(new long[]{0x0000000000800020L});
        public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__03873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Number__Group__0__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__13935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Alternatives_1_in_rule__Number__Group__1__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__03996 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__03999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__0__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__14055 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__14058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Decimal__Group__1__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__24117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__2__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveFunctionExpression_in_rule__IntegerLinearProgram__ObjectiveFunctionAssignment_04184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__IntegerLinearProgram__ConstraintsAssignment_14215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__IntegerLinearProgram__VariablesAssignment_24246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleObjectiveGoal_in_rule__ObjectiveFunctionExpression__GoalAssignment_1_04277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__ObjectiveFunctionExpression__ObjectiveFunctionAssignment_1_24308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__ConstraintExpression__CommentAssignment_0_04339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__LeftExpressionAssignment_14370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_rule__ConstraintExpression__OperatorAssignment_24401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleLinearExpression_in_rule__ConstraintExpression__RightExpressionAssignment_34432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleILPDataType_in_rule__Variable__DataTypeAssignment_04463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__Variable__NameAssignment_14494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_14525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinearExpression_in_rule__AdditionExpression__RightExpressionAssignment_1_24556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_14587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_rule__MultiplicationExpression__RightExpressionAssignment_1_24618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteralExpression__ValueAssignment4649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableID_in_rule__VariableExpression__VariableAssignment4684 = new BitSet(new long[]{0x0000000000000002L});
    }


}