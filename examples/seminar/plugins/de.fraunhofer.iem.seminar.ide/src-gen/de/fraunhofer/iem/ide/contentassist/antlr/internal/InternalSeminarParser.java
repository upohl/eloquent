package de.fraunhofer.iem.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.iem.services.SeminarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeminarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Seminar'", "'{'", "'}'", "'supervisors:'", "';'", "','", "'students:'", "'topics:'", "'wants'", "'rates'", "'with'", "'supervises'", "'is'", "'assigned'", "'to'"
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

    	public void setGrammarAccess(SeminarGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSeminar"
    // InternalSeminar.g:53:1: entryRuleSeminar : ruleSeminar EOF ;
    public final void entryRuleSeminar() throws RecognitionException {
        try {
            // InternalSeminar.g:54:1: ( ruleSeminar EOF )
            // InternalSeminar.g:55:1: ruleSeminar EOF
            {
             before(grammarAccess.getSeminarRule()); 
            pushFollow(FOLLOW_1);
            ruleSeminar();

            state._fsp--;

             after(grammarAccess.getSeminarRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSeminar"


    // $ANTLR start "ruleSeminar"
    // InternalSeminar.g:62:1: ruleSeminar : ( ( rule__Seminar__Group__0 ) ) ;
    public final void ruleSeminar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:66:2: ( ( ( rule__Seminar__Group__0 ) ) )
            // InternalSeminar.g:67:2: ( ( rule__Seminar__Group__0 ) )
            {
            // InternalSeminar.g:67:2: ( ( rule__Seminar__Group__0 ) )
            // InternalSeminar.g:68:3: ( rule__Seminar__Group__0 )
            {
             before(grammarAccess.getSeminarAccess().getGroup()); 
            // InternalSeminar.g:69:3: ( rule__Seminar__Group__0 )
            // InternalSeminar.g:69:4: rule__Seminar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeminar"


    // $ANTLR start "entryRuleSupervisor"
    // InternalSeminar.g:78:1: entryRuleSupervisor : ruleSupervisor EOF ;
    public final void entryRuleSupervisor() throws RecognitionException {
        try {
            // InternalSeminar.g:79:1: ( ruleSupervisor EOF )
            // InternalSeminar.g:80:1: ruleSupervisor EOF
            {
             before(grammarAccess.getSupervisorRule()); 
            pushFollow(FOLLOW_1);
            ruleSupervisor();

            state._fsp--;

             after(grammarAccess.getSupervisorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSupervisor"


    // $ANTLR start "ruleSupervisor"
    // InternalSeminar.g:87:1: ruleSupervisor : ( ( rule__Supervisor__NameAssignment ) ) ;
    public final void ruleSupervisor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:91:2: ( ( ( rule__Supervisor__NameAssignment ) ) )
            // InternalSeminar.g:92:2: ( ( rule__Supervisor__NameAssignment ) )
            {
            // InternalSeminar.g:92:2: ( ( rule__Supervisor__NameAssignment ) )
            // InternalSeminar.g:93:3: ( rule__Supervisor__NameAssignment )
            {
             before(grammarAccess.getSupervisorAccess().getNameAssignment()); 
            // InternalSeminar.g:94:3: ( rule__Supervisor__NameAssignment )
            // InternalSeminar.g:94:4: rule__Supervisor__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Supervisor__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSupervisorAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupervisor"


    // $ANTLR start "entryRuleStudent"
    // InternalSeminar.g:103:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalSeminar.g:104:1: ( ruleStudent EOF )
            // InternalSeminar.g:105:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalSeminar.g:112:1: ruleStudent : ( ( rule__Student__NameAssignment ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:116:2: ( ( ( rule__Student__NameAssignment ) ) )
            // InternalSeminar.g:117:2: ( ( rule__Student__NameAssignment ) )
            {
            // InternalSeminar.g:117:2: ( ( rule__Student__NameAssignment ) )
            // InternalSeminar.g:118:3: ( rule__Student__NameAssignment )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment()); 
            // InternalSeminar.g:119:3: ( rule__Student__NameAssignment )
            // InternalSeminar.g:119:4: rule__Student__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTopic"
    // InternalSeminar.g:128:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalSeminar.g:129:1: ( ruleTopic EOF )
            // InternalSeminar.g:130:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalSeminar.g:137:1: ruleTopic : ( ( rule__Topic__NameAssignment ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:141:2: ( ( ( rule__Topic__NameAssignment ) ) )
            // InternalSeminar.g:142:2: ( ( rule__Topic__NameAssignment ) )
            {
            // InternalSeminar.g:142:2: ( ( rule__Topic__NameAssignment ) )
            // InternalSeminar.g:143:3: ( rule__Topic__NameAssignment )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment()); 
            // InternalSeminar.g:144:3: ( rule__Topic__NameAssignment )
            // InternalSeminar.g:144:4: rule__Topic__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Topic__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRulePreference"
    // InternalSeminar.g:153:1: entryRulePreference : rulePreference EOF ;
    public final void entryRulePreference() throws RecognitionException {
        try {
            // InternalSeminar.g:154:1: ( rulePreference EOF )
            // InternalSeminar.g:155:1: rulePreference EOF
            {
             before(grammarAccess.getPreferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePreference();

            state._fsp--;

             after(grammarAccess.getPreferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalSeminar.g:162:1: rulePreference : ( ( rule__Preference__Group__0 ) ) ;
    public final void rulePreference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:166:2: ( ( ( rule__Preference__Group__0 ) ) )
            // InternalSeminar.g:167:2: ( ( rule__Preference__Group__0 ) )
            {
            // InternalSeminar.g:167:2: ( ( rule__Preference__Group__0 ) )
            // InternalSeminar.g:168:3: ( rule__Preference__Group__0 )
            {
             before(grammarAccess.getPreferenceAccess().getGroup()); 
            // InternalSeminar.g:169:3: ( rule__Preference__Group__0 )
            // InternalSeminar.g:169:4: rule__Preference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Preference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleRating"
    // InternalSeminar.g:178:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // InternalSeminar.g:179:1: ( ruleRating EOF )
            // InternalSeminar.g:180:1: ruleRating EOF
            {
             before(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_1);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRatingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // InternalSeminar.g:187:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:191:2: ( ( ( rule__Rating__Group__0 ) ) )
            // InternalSeminar.g:192:2: ( ( rule__Rating__Group__0 ) )
            {
            // InternalSeminar.g:192:2: ( ( rule__Rating__Group__0 ) )
            // InternalSeminar.g:193:3: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // InternalSeminar.g:194:3: ( rule__Rating__Group__0 )
            // InternalSeminar.g:194:4: rule__Rating__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rating__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleSupervise"
    // InternalSeminar.g:203:1: entryRuleSupervise : ruleSupervise EOF ;
    public final void entryRuleSupervise() throws RecognitionException {
        try {
            // InternalSeminar.g:204:1: ( ruleSupervise EOF )
            // InternalSeminar.g:205:1: ruleSupervise EOF
            {
             before(grammarAccess.getSuperviseRule()); 
            pushFollow(FOLLOW_1);
            ruleSupervise();

            state._fsp--;

             after(grammarAccess.getSuperviseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSupervise"


    // $ANTLR start "ruleSupervise"
    // InternalSeminar.g:212:1: ruleSupervise : ( ( rule__Supervise__Group__0 ) ) ;
    public final void ruleSupervise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:216:2: ( ( ( rule__Supervise__Group__0 ) ) )
            // InternalSeminar.g:217:2: ( ( rule__Supervise__Group__0 ) )
            {
            // InternalSeminar.g:217:2: ( ( rule__Supervise__Group__0 ) )
            // InternalSeminar.g:218:3: ( rule__Supervise__Group__0 )
            {
             before(grammarAccess.getSuperviseAccess().getGroup()); 
            // InternalSeminar.g:219:3: ( rule__Supervise__Group__0 )
            // InternalSeminar.g:219:4: rule__Supervise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Supervise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperviseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupervise"


    // $ANTLR start "entryRuleAssignment"
    // InternalSeminar.g:228:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalSeminar.g:229:1: ( ruleAssignment EOF )
            // InternalSeminar.g:230:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalSeminar.g:237:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:241:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalSeminar.g:242:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalSeminar.g:242:2: ( ( rule__Assignment__Group__0 ) )
            // InternalSeminar.g:243:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalSeminar.g:244:3: ( rule__Assignment__Group__0 )
            // InternalSeminar.g:244:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "rule__Seminar__Group__0"
    // InternalSeminar.g:252:1: rule__Seminar__Group__0 : rule__Seminar__Group__0__Impl rule__Seminar__Group__1 ;
    public final void rule__Seminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:256:1: ( rule__Seminar__Group__0__Impl rule__Seminar__Group__1 )
            // InternalSeminar.g:257:2: rule__Seminar__Group__0__Impl rule__Seminar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Seminar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__1();

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
    // $ANTLR end "rule__Seminar__Group__0"


    // $ANTLR start "rule__Seminar__Group__0__Impl"
    // InternalSeminar.g:264:1: rule__Seminar__Group__0__Impl : ( 'Seminar' ) ;
    public final void rule__Seminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:268:1: ( ( 'Seminar' ) )
            // InternalSeminar.g:269:1: ( 'Seminar' )
            {
            // InternalSeminar.g:269:1: ( 'Seminar' )
            // InternalSeminar.g:270:2: 'Seminar'
            {
             before(grammarAccess.getSeminarAccess().getSeminarKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSeminarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__0__Impl"


    // $ANTLR start "rule__Seminar__Group__1"
    // InternalSeminar.g:279:1: rule__Seminar__Group__1 : rule__Seminar__Group__1__Impl rule__Seminar__Group__2 ;
    public final void rule__Seminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:283:1: ( rule__Seminar__Group__1__Impl rule__Seminar__Group__2 )
            // InternalSeminar.g:284:2: rule__Seminar__Group__1__Impl rule__Seminar__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Seminar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__2();

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
    // $ANTLR end "rule__Seminar__Group__1"


    // $ANTLR start "rule__Seminar__Group__1__Impl"
    // InternalSeminar.g:291:1: rule__Seminar__Group__1__Impl : ( ( rule__Seminar__NameAssignment_1 ) ) ;
    public final void rule__Seminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:295:1: ( ( ( rule__Seminar__NameAssignment_1 ) ) )
            // InternalSeminar.g:296:1: ( ( rule__Seminar__NameAssignment_1 ) )
            {
            // InternalSeminar.g:296:1: ( ( rule__Seminar__NameAssignment_1 ) )
            // InternalSeminar.g:297:2: ( rule__Seminar__NameAssignment_1 )
            {
             before(grammarAccess.getSeminarAccess().getNameAssignment_1()); 
            // InternalSeminar.g:298:2: ( rule__Seminar__NameAssignment_1 )
            // InternalSeminar.g:298:3: rule__Seminar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__1__Impl"


    // $ANTLR start "rule__Seminar__Group__2"
    // InternalSeminar.g:306:1: rule__Seminar__Group__2 : rule__Seminar__Group__2__Impl rule__Seminar__Group__3 ;
    public final void rule__Seminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:310:1: ( rule__Seminar__Group__2__Impl rule__Seminar__Group__3 )
            // InternalSeminar.g:311:2: rule__Seminar__Group__2__Impl rule__Seminar__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__3();

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
    // $ANTLR end "rule__Seminar__Group__2"


    // $ANTLR start "rule__Seminar__Group__2__Impl"
    // InternalSeminar.g:318:1: rule__Seminar__Group__2__Impl : ( '{' ) ;
    public final void rule__Seminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:322:1: ( ( '{' ) )
            // InternalSeminar.g:323:1: ( '{' )
            {
            // InternalSeminar.g:323:1: ( '{' )
            // InternalSeminar.g:324:2: '{'
            {
             before(grammarAccess.getSeminarAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__2__Impl"


    // $ANTLR start "rule__Seminar__Group__3"
    // InternalSeminar.g:333:1: rule__Seminar__Group__3 : rule__Seminar__Group__3__Impl rule__Seminar__Group__4 ;
    public final void rule__Seminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:337:1: ( rule__Seminar__Group__3__Impl rule__Seminar__Group__4 )
            // InternalSeminar.g:338:2: rule__Seminar__Group__3__Impl rule__Seminar__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__4();

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
    // $ANTLR end "rule__Seminar__Group__3"


    // $ANTLR start "rule__Seminar__Group__3__Impl"
    // InternalSeminar.g:345:1: rule__Seminar__Group__3__Impl : ( ( rule__Seminar__Group_3__0 )* ) ;
    public final void rule__Seminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:349:1: ( ( ( rule__Seminar__Group_3__0 )* ) )
            // InternalSeminar.g:350:1: ( ( rule__Seminar__Group_3__0 )* )
            {
            // InternalSeminar.g:350:1: ( ( rule__Seminar__Group_3__0 )* )
            // InternalSeminar.g:351:2: ( rule__Seminar__Group_3__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_3()); 
            // InternalSeminar.g:352:2: ( rule__Seminar__Group_3__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeminar.g:352:3: rule__Seminar__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Seminar__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__3__Impl"


    // $ANTLR start "rule__Seminar__Group__4"
    // InternalSeminar.g:360:1: rule__Seminar__Group__4 : rule__Seminar__Group__4__Impl rule__Seminar__Group__5 ;
    public final void rule__Seminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:364:1: ( rule__Seminar__Group__4__Impl rule__Seminar__Group__5 )
            // InternalSeminar.g:365:2: rule__Seminar__Group__4__Impl rule__Seminar__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__5();

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
    // $ANTLR end "rule__Seminar__Group__4"


    // $ANTLR start "rule__Seminar__Group__4__Impl"
    // InternalSeminar.g:372:1: rule__Seminar__Group__4__Impl : ( ( rule__Seminar__Group_4__0 )* ) ;
    public final void rule__Seminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:376:1: ( ( ( rule__Seminar__Group_4__0 )* ) )
            // InternalSeminar.g:377:1: ( ( rule__Seminar__Group_4__0 )* )
            {
            // InternalSeminar.g:377:1: ( ( rule__Seminar__Group_4__0 )* )
            // InternalSeminar.g:378:2: ( rule__Seminar__Group_4__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_4()); 
            // InternalSeminar.g:379:2: ( rule__Seminar__Group_4__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeminar.g:379:3: rule__Seminar__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__4__Impl"


    // $ANTLR start "rule__Seminar__Group__5"
    // InternalSeminar.g:387:1: rule__Seminar__Group__5 : rule__Seminar__Group__5__Impl rule__Seminar__Group__6 ;
    public final void rule__Seminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:391:1: ( rule__Seminar__Group__5__Impl rule__Seminar__Group__6 )
            // InternalSeminar.g:392:2: rule__Seminar__Group__5__Impl rule__Seminar__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__6();

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
    // $ANTLR end "rule__Seminar__Group__5"


    // $ANTLR start "rule__Seminar__Group__5__Impl"
    // InternalSeminar.g:399:1: rule__Seminar__Group__5__Impl : ( ( rule__Seminar__Group_5__0 )* ) ;
    public final void rule__Seminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:403:1: ( ( ( rule__Seminar__Group_5__0 )* ) )
            // InternalSeminar.g:404:1: ( ( rule__Seminar__Group_5__0 )* )
            {
            // InternalSeminar.g:404:1: ( ( rule__Seminar__Group_5__0 )* )
            // InternalSeminar.g:405:2: ( rule__Seminar__Group_5__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_5()); 
            // InternalSeminar.g:406:2: ( rule__Seminar__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSeminar.g:406:3: rule__Seminar__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Seminar__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__5__Impl"


    // $ANTLR start "rule__Seminar__Group__6"
    // InternalSeminar.g:414:1: rule__Seminar__Group__6 : rule__Seminar__Group__6__Impl rule__Seminar__Group__7 ;
    public final void rule__Seminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:418:1: ( rule__Seminar__Group__6__Impl rule__Seminar__Group__7 )
            // InternalSeminar.g:419:2: rule__Seminar__Group__6__Impl rule__Seminar__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__7();

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
    // $ANTLR end "rule__Seminar__Group__6"


    // $ANTLR start "rule__Seminar__Group__6__Impl"
    // InternalSeminar.g:426:1: rule__Seminar__Group__6__Impl : ( ( rule__Seminar__PreferencesAssignment_6 )* ) ;
    public final void rule__Seminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:430:1: ( ( ( rule__Seminar__PreferencesAssignment_6 )* ) )
            // InternalSeminar.g:431:1: ( ( rule__Seminar__PreferencesAssignment_6 )* )
            {
            // InternalSeminar.g:431:1: ( ( rule__Seminar__PreferencesAssignment_6 )* )
            // InternalSeminar.g:432:2: ( rule__Seminar__PreferencesAssignment_6 )*
            {
             before(grammarAccess.getSeminarAccess().getPreferencesAssignment_6()); 
            // InternalSeminar.g:433:2: ( rule__Seminar__PreferencesAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==20) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeminar.g:433:3: rule__Seminar__PreferencesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__PreferencesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getPreferencesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__6__Impl"


    // $ANTLR start "rule__Seminar__Group__7"
    // InternalSeminar.g:441:1: rule__Seminar__Group__7 : rule__Seminar__Group__7__Impl rule__Seminar__Group__8 ;
    public final void rule__Seminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:445:1: ( rule__Seminar__Group__7__Impl rule__Seminar__Group__8 )
            // InternalSeminar.g:446:2: rule__Seminar__Group__7__Impl rule__Seminar__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__8();

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
    // $ANTLR end "rule__Seminar__Group__7"


    // $ANTLR start "rule__Seminar__Group__7__Impl"
    // InternalSeminar.g:453:1: rule__Seminar__Group__7__Impl : ( ( rule__Seminar__RatingsAssignment_7 )* ) ;
    public final void rule__Seminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:457:1: ( ( ( rule__Seminar__RatingsAssignment_7 )* ) )
            // InternalSeminar.g:458:1: ( ( rule__Seminar__RatingsAssignment_7 )* )
            {
            // InternalSeminar.g:458:1: ( ( rule__Seminar__RatingsAssignment_7 )* )
            // InternalSeminar.g:459:2: ( rule__Seminar__RatingsAssignment_7 )*
            {
             before(grammarAccess.getSeminarAccess().getRatingsAssignment_7()); 
            // InternalSeminar.g:460:2: ( rule__Seminar__RatingsAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==21) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeminar.g:460:3: rule__Seminar__RatingsAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__RatingsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getRatingsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__7__Impl"


    // $ANTLR start "rule__Seminar__Group__8"
    // InternalSeminar.g:468:1: rule__Seminar__Group__8 : rule__Seminar__Group__8__Impl rule__Seminar__Group__9 ;
    public final void rule__Seminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:472:1: ( rule__Seminar__Group__8__Impl rule__Seminar__Group__9 )
            // InternalSeminar.g:473:2: rule__Seminar__Group__8__Impl rule__Seminar__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__9();

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
    // $ANTLR end "rule__Seminar__Group__8"


    // $ANTLR start "rule__Seminar__Group__8__Impl"
    // InternalSeminar.g:480:1: rule__Seminar__Group__8__Impl : ( ( rule__Seminar__SupervisesAssignment_8 )* ) ;
    public final void rule__Seminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:484:1: ( ( ( rule__Seminar__SupervisesAssignment_8 )* ) )
            // InternalSeminar.g:485:1: ( ( rule__Seminar__SupervisesAssignment_8 )* )
            {
            // InternalSeminar.g:485:1: ( ( rule__Seminar__SupervisesAssignment_8 )* )
            // InternalSeminar.g:486:2: ( rule__Seminar__SupervisesAssignment_8 )*
            {
             before(grammarAccess.getSeminarAccess().getSupervisesAssignment_8()); 
            // InternalSeminar.g:487:2: ( rule__Seminar__SupervisesAssignment_8 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==23) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalSeminar.g:487:3: rule__Seminar__SupervisesAssignment_8
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__SupervisesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getSupervisesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__8__Impl"


    // $ANTLR start "rule__Seminar__Group__9"
    // InternalSeminar.g:495:1: rule__Seminar__Group__9 : rule__Seminar__Group__9__Impl rule__Seminar__Group__10 ;
    public final void rule__Seminar__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:499:1: ( rule__Seminar__Group__9__Impl rule__Seminar__Group__10 )
            // InternalSeminar.g:500:2: rule__Seminar__Group__9__Impl rule__Seminar__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Seminar__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group__10();

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
    // $ANTLR end "rule__Seminar__Group__9"


    // $ANTLR start "rule__Seminar__Group__9__Impl"
    // InternalSeminar.g:507:1: rule__Seminar__Group__9__Impl : ( ( rule__Seminar__AssignmentsAssignment_9 )* ) ;
    public final void rule__Seminar__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:511:1: ( ( ( rule__Seminar__AssignmentsAssignment_9 )* ) )
            // InternalSeminar.g:512:1: ( ( rule__Seminar__AssignmentsAssignment_9 )* )
            {
            // InternalSeminar.g:512:1: ( ( rule__Seminar__AssignmentsAssignment_9 )* )
            // InternalSeminar.g:513:2: ( rule__Seminar__AssignmentsAssignment_9 )*
            {
             before(grammarAccess.getSeminarAccess().getAssignmentsAssignment_9()); 
            // InternalSeminar.g:514:2: ( rule__Seminar__AssignmentsAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeminar.g:514:3: rule__Seminar__AssignmentsAssignment_9
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__AssignmentsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getAssignmentsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__9__Impl"


    // $ANTLR start "rule__Seminar__Group__10"
    // InternalSeminar.g:522:1: rule__Seminar__Group__10 : rule__Seminar__Group__10__Impl ;
    public final void rule__Seminar__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:526:1: ( rule__Seminar__Group__10__Impl )
            // InternalSeminar.g:527:2: rule__Seminar__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group__10__Impl();

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
    // $ANTLR end "rule__Seminar__Group__10"


    // $ANTLR start "rule__Seminar__Group__10__Impl"
    // InternalSeminar.g:533:1: rule__Seminar__Group__10__Impl : ( '}' ) ;
    public final void rule__Seminar__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:537:1: ( ( '}' ) )
            // InternalSeminar.g:538:1: ( '}' )
            {
            // InternalSeminar.g:538:1: ( '}' )
            // InternalSeminar.g:539:2: '}'
            {
             before(grammarAccess.getSeminarAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group__10__Impl"


    // $ANTLR start "rule__Seminar__Group_3__0"
    // InternalSeminar.g:549:1: rule__Seminar__Group_3__0 : rule__Seminar__Group_3__0__Impl rule__Seminar__Group_3__1 ;
    public final void rule__Seminar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:553:1: ( rule__Seminar__Group_3__0__Impl rule__Seminar__Group_3__1 )
            // InternalSeminar.g:554:2: rule__Seminar__Group_3__0__Impl rule__Seminar__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_3__1();

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
    // $ANTLR end "rule__Seminar__Group_3__0"


    // $ANTLR start "rule__Seminar__Group_3__0__Impl"
    // InternalSeminar.g:561:1: rule__Seminar__Group_3__0__Impl : ( 'supervisors:' ) ;
    public final void rule__Seminar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:565:1: ( ( 'supervisors:' ) )
            // InternalSeminar.g:566:1: ( 'supervisors:' )
            {
            // InternalSeminar.g:566:1: ( 'supervisors:' )
            // InternalSeminar.g:567:2: 'supervisors:'
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSupervisorsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_3__0__Impl"


    // $ANTLR start "rule__Seminar__Group_3__1"
    // InternalSeminar.g:576:1: rule__Seminar__Group_3__1 : rule__Seminar__Group_3__1__Impl rule__Seminar__Group_3__2 ;
    public final void rule__Seminar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:580:1: ( rule__Seminar__Group_3__1__Impl rule__Seminar__Group_3__2 )
            // InternalSeminar.g:581:2: rule__Seminar__Group_3__1__Impl rule__Seminar__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_3__2();

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
    // $ANTLR end "rule__Seminar__Group_3__1"


    // $ANTLR start "rule__Seminar__Group_3__1__Impl"
    // InternalSeminar.g:588:1: rule__Seminar__Group_3__1__Impl : ( ( rule__Seminar__SupervisorsAssignment_3_1 )* ) ;
    public final void rule__Seminar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:592:1: ( ( ( rule__Seminar__SupervisorsAssignment_3_1 )* ) )
            // InternalSeminar.g:593:1: ( ( rule__Seminar__SupervisorsAssignment_3_1 )* )
            {
            // InternalSeminar.g:593:1: ( ( rule__Seminar__SupervisorsAssignment_3_1 )* )
            // InternalSeminar.g:594:2: ( rule__Seminar__SupervisorsAssignment_3_1 )*
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsAssignment_3_1()); 
            // InternalSeminar.g:595:2: ( rule__Seminar__SupervisorsAssignment_3_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeminar.g:595:3: rule__Seminar__SupervisorsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__SupervisorsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getSupervisorsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_3__1__Impl"


    // $ANTLR start "rule__Seminar__Group_3__2"
    // InternalSeminar.g:603:1: rule__Seminar__Group_3__2 : rule__Seminar__Group_3__2__Impl rule__Seminar__Group_3__3 ;
    public final void rule__Seminar__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:607:1: ( rule__Seminar__Group_3__2__Impl rule__Seminar__Group_3__3 )
            // InternalSeminar.g:608:2: rule__Seminar__Group_3__2__Impl rule__Seminar__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_3__3();

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
    // $ANTLR end "rule__Seminar__Group_3__2"


    // $ANTLR start "rule__Seminar__Group_3__2__Impl"
    // InternalSeminar.g:615:1: rule__Seminar__Group_3__2__Impl : ( ( rule__Seminar__Group_3_2__0 )* ) ;
    public final void rule__Seminar__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:619:1: ( ( ( rule__Seminar__Group_3_2__0 )* ) )
            // InternalSeminar.g:620:1: ( ( rule__Seminar__Group_3_2__0 )* )
            {
            // InternalSeminar.g:620:1: ( ( rule__Seminar__Group_3_2__0 )* )
            // InternalSeminar.g:621:2: ( rule__Seminar__Group_3_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_3_2()); 
            // InternalSeminar.g:622:2: ( rule__Seminar__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeminar.g:622:3: rule__Seminar__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Seminar__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_3__2__Impl"


    // $ANTLR start "rule__Seminar__Group_3__3"
    // InternalSeminar.g:630:1: rule__Seminar__Group_3__3 : rule__Seminar__Group_3__3__Impl ;
    public final void rule__Seminar__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:634:1: ( rule__Seminar__Group_3__3__Impl )
            // InternalSeminar.g:635:2: rule__Seminar__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_3__3__Impl();

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
    // $ANTLR end "rule__Seminar__Group_3__3"


    // $ANTLR start "rule__Seminar__Group_3__3__Impl"
    // InternalSeminar.g:641:1: rule__Seminar__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:645:1: ( ( ';' ) )
            // InternalSeminar.g:646:1: ( ';' )
            {
            // InternalSeminar.g:646:1: ( ';' )
            // InternalSeminar.g:647:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_3_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_3__3__Impl"


    // $ANTLR start "rule__Seminar__Group_3_2__0"
    // InternalSeminar.g:657:1: rule__Seminar__Group_3_2__0 : rule__Seminar__Group_3_2__0__Impl rule__Seminar__Group_3_2__1 ;
    public final void rule__Seminar__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:661:1: ( rule__Seminar__Group_3_2__0__Impl rule__Seminar__Group_3_2__1 )
            // InternalSeminar.g:662:2: rule__Seminar__Group_3_2__0__Impl rule__Seminar__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Seminar__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_3_2__1();

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
    // $ANTLR end "rule__Seminar__Group_3_2__0"


    // $ANTLR start "rule__Seminar__Group_3_2__0__Impl"
    // InternalSeminar.g:669:1: rule__Seminar__Group_3_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:673:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:674:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:674:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:675:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:675:2: ( ( ',' ) )
            // InternalSeminar.g:676:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_3_2_0()); 
            // InternalSeminar.g:677:3: ( ',' )
            // InternalSeminar.g:677:4: ','
            {
            match(input,17,FOLLOW_11); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_3_2_0()); 

            }

            // InternalSeminar.g:680:2: ( ( ',' )* )
            // InternalSeminar.g:681:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_3_2_0()); 
            // InternalSeminar.g:682:3: ( ',' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeminar.g:682:4: ','
            	    {
            	    match(input,17,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getCommaKeyword_3_2_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_3_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_3_2__1"
    // InternalSeminar.g:691:1: rule__Seminar__Group_3_2__1 : rule__Seminar__Group_3_2__1__Impl ;
    public final void rule__Seminar__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:695:1: ( rule__Seminar__Group_3_2__1__Impl )
            // InternalSeminar.g:696:2: rule__Seminar__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Seminar__Group_3_2__1"


    // $ANTLR start "rule__Seminar__Group_3_2__1__Impl"
    // InternalSeminar.g:702:1: rule__Seminar__Group_3_2__1__Impl : ( ( rule__Seminar__SupervisorsAssignment_3_2_1 ) ) ;
    public final void rule__Seminar__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:706:1: ( ( ( rule__Seminar__SupervisorsAssignment_3_2_1 ) ) )
            // InternalSeminar.g:707:1: ( ( rule__Seminar__SupervisorsAssignment_3_2_1 ) )
            {
            // InternalSeminar.g:707:1: ( ( rule__Seminar__SupervisorsAssignment_3_2_1 ) )
            // InternalSeminar.g:708:2: ( rule__Seminar__SupervisorsAssignment_3_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsAssignment_3_2_1()); 
            // InternalSeminar.g:709:2: ( rule__Seminar__SupervisorsAssignment_3_2_1 )
            // InternalSeminar.g:709:3: rule__Seminar__SupervisorsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__SupervisorsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getSupervisorsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_3_2__1__Impl"


    // $ANTLR start "rule__Seminar__Group_4__0"
    // InternalSeminar.g:718:1: rule__Seminar__Group_4__0 : rule__Seminar__Group_4__0__Impl rule__Seminar__Group_4__1 ;
    public final void rule__Seminar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:722:1: ( rule__Seminar__Group_4__0__Impl rule__Seminar__Group_4__1 )
            // InternalSeminar.g:723:2: rule__Seminar__Group_4__0__Impl rule__Seminar__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_4__1();

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
    // $ANTLR end "rule__Seminar__Group_4__0"


    // $ANTLR start "rule__Seminar__Group_4__0__Impl"
    // InternalSeminar.g:730:1: rule__Seminar__Group_4__0__Impl : ( 'students:' ) ;
    public final void rule__Seminar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:734:1: ( ( 'students:' ) )
            // InternalSeminar.g:735:1: ( 'students:' )
            {
            // InternalSeminar.g:735:1: ( 'students:' )
            // InternalSeminar.g:736:2: 'students:'
            {
             before(grammarAccess.getSeminarAccess().getStudentsKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getStudentsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_4__0__Impl"


    // $ANTLR start "rule__Seminar__Group_4__1"
    // InternalSeminar.g:745:1: rule__Seminar__Group_4__1 : rule__Seminar__Group_4__1__Impl rule__Seminar__Group_4__2 ;
    public final void rule__Seminar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:749:1: ( rule__Seminar__Group_4__1__Impl rule__Seminar__Group_4__2 )
            // InternalSeminar.g:750:2: rule__Seminar__Group_4__1__Impl rule__Seminar__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_4__2();

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
    // $ANTLR end "rule__Seminar__Group_4__1"


    // $ANTLR start "rule__Seminar__Group_4__1__Impl"
    // InternalSeminar.g:757:1: rule__Seminar__Group_4__1__Impl : ( ( rule__Seminar__StudentsAssignment_4_1 )* ) ;
    public final void rule__Seminar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:761:1: ( ( ( rule__Seminar__StudentsAssignment_4_1 )* ) )
            // InternalSeminar.g:762:1: ( ( rule__Seminar__StudentsAssignment_4_1 )* )
            {
            // InternalSeminar.g:762:1: ( ( rule__Seminar__StudentsAssignment_4_1 )* )
            // InternalSeminar.g:763:2: ( rule__Seminar__StudentsAssignment_4_1 )*
            {
             before(grammarAccess.getSeminarAccess().getStudentsAssignment_4_1()); 
            // InternalSeminar.g:764:2: ( rule__Seminar__StudentsAssignment_4_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeminar.g:764:3: rule__Seminar__StudentsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__StudentsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getStudentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_4__1__Impl"


    // $ANTLR start "rule__Seminar__Group_4__2"
    // InternalSeminar.g:772:1: rule__Seminar__Group_4__2 : rule__Seminar__Group_4__2__Impl rule__Seminar__Group_4__3 ;
    public final void rule__Seminar__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:776:1: ( rule__Seminar__Group_4__2__Impl rule__Seminar__Group_4__3 )
            // InternalSeminar.g:777:2: rule__Seminar__Group_4__2__Impl rule__Seminar__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_4__3();

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
    // $ANTLR end "rule__Seminar__Group_4__2"


    // $ANTLR start "rule__Seminar__Group_4__2__Impl"
    // InternalSeminar.g:784:1: rule__Seminar__Group_4__2__Impl : ( ( rule__Seminar__Group_4_2__0 )* ) ;
    public final void rule__Seminar__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:788:1: ( ( ( rule__Seminar__Group_4_2__0 )* ) )
            // InternalSeminar.g:789:1: ( ( rule__Seminar__Group_4_2__0 )* )
            {
            // InternalSeminar.g:789:1: ( ( rule__Seminar__Group_4_2__0 )* )
            // InternalSeminar.g:790:2: ( rule__Seminar__Group_4_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_4_2()); 
            // InternalSeminar.g:791:2: ( rule__Seminar__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeminar.g:791:3: rule__Seminar__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Seminar__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_4__2__Impl"


    // $ANTLR start "rule__Seminar__Group_4__3"
    // InternalSeminar.g:799:1: rule__Seminar__Group_4__3 : rule__Seminar__Group_4__3__Impl ;
    public final void rule__Seminar__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:803:1: ( rule__Seminar__Group_4__3__Impl )
            // InternalSeminar.g:804:2: rule__Seminar__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_4__3__Impl();

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
    // $ANTLR end "rule__Seminar__Group_4__3"


    // $ANTLR start "rule__Seminar__Group_4__3__Impl"
    // InternalSeminar.g:810:1: rule__Seminar__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:814:1: ( ( ';' ) )
            // InternalSeminar.g:815:1: ( ';' )
            {
            // InternalSeminar.g:815:1: ( ';' )
            // InternalSeminar.g:816:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_4_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSemicolonKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_4__3__Impl"


    // $ANTLR start "rule__Seminar__Group_4_2__0"
    // InternalSeminar.g:826:1: rule__Seminar__Group_4_2__0 : rule__Seminar__Group_4_2__0__Impl rule__Seminar__Group_4_2__1 ;
    public final void rule__Seminar__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:830:1: ( rule__Seminar__Group_4_2__0__Impl rule__Seminar__Group_4_2__1 )
            // InternalSeminar.g:831:2: rule__Seminar__Group_4_2__0__Impl rule__Seminar__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Seminar__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_4_2__1();

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
    // $ANTLR end "rule__Seminar__Group_4_2__0"


    // $ANTLR start "rule__Seminar__Group_4_2__0__Impl"
    // InternalSeminar.g:838:1: rule__Seminar__Group_4_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:842:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:843:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:843:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:844:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:844:2: ( ( ',' ) )
            // InternalSeminar.g:845:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_4_2_0()); 
            // InternalSeminar.g:846:3: ( ',' )
            // InternalSeminar.g:846:4: ','
            {
            match(input,17,FOLLOW_11); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_4_2_0()); 

            }

            // InternalSeminar.g:849:2: ( ( ',' )* )
            // InternalSeminar.g:850:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_4_2_0()); 
            // InternalSeminar.g:851:3: ( ',' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeminar.g:851:4: ','
            	    {
            	    match(input,17,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getCommaKeyword_4_2_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_4_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_4_2__1"
    // InternalSeminar.g:860:1: rule__Seminar__Group_4_2__1 : rule__Seminar__Group_4_2__1__Impl ;
    public final void rule__Seminar__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:864:1: ( rule__Seminar__Group_4_2__1__Impl )
            // InternalSeminar.g:865:2: rule__Seminar__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Seminar__Group_4_2__1"


    // $ANTLR start "rule__Seminar__Group_4_2__1__Impl"
    // InternalSeminar.g:871:1: rule__Seminar__Group_4_2__1__Impl : ( ( rule__Seminar__StudentsAssignment_4_2_1 ) ) ;
    public final void rule__Seminar__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:875:1: ( ( ( rule__Seminar__StudentsAssignment_4_2_1 ) ) )
            // InternalSeminar.g:876:1: ( ( rule__Seminar__StudentsAssignment_4_2_1 ) )
            {
            // InternalSeminar.g:876:1: ( ( rule__Seminar__StudentsAssignment_4_2_1 ) )
            // InternalSeminar.g:877:2: ( rule__Seminar__StudentsAssignment_4_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getStudentsAssignment_4_2_1()); 
            // InternalSeminar.g:878:2: ( rule__Seminar__StudentsAssignment_4_2_1 )
            // InternalSeminar.g:878:3: rule__Seminar__StudentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__StudentsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getStudentsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_4_2__1__Impl"


    // $ANTLR start "rule__Seminar__Group_5__0"
    // InternalSeminar.g:887:1: rule__Seminar__Group_5__0 : rule__Seminar__Group_5__0__Impl rule__Seminar__Group_5__1 ;
    public final void rule__Seminar__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:891:1: ( rule__Seminar__Group_5__0__Impl rule__Seminar__Group_5__1 )
            // InternalSeminar.g:892:2: rule__Seminar__Group_5__0__Impl rule__Seminar__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_5__1();

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
    // $ANTLR end "rule__Seminar__Group_5__0"


    // $ANTLR start "rule__Seminar__Group_5__0__Impl"
    // InternalSeminar.g:899:1: rule__Seminar__Group_5__0__Impl : ( 'topics:' ) ;
    public final void rule__Seminar__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:903:1: ( ( 'topics:' ) )
            // InternalSeminar.g:904:1: ( 'topics:' )
            {
            // InternalSeminar.g:904:1: ( 'topics:' )
            // InternalSeminar.g:905:2: 'topics:'
            {
             before(grammarAccess.getSeminarAccess().getTopicsKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getTopicsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_5__0__Impl"


    // $ANTLR start "rule__Seminar__Group_5__1"
    // InternalSeminar.g:914:1: rule__Seminar__Group_5__1 : rule__Seminar__Group_5__1__Impl rule__Seminar__Group_5__2 ;
    public final void rule__Seminar__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:918:1: ( rule__Seminar__Group_5__1__Impl rule__Seminar__Group_5__2 )
            // InternalSeminar.g:919:2: rule__Seminar__Group_5__1__Impl rule__Seminar__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_5__2();

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
    // $ANTLR end "rule__Seminar__Group_5__1"


    // $ANTLR start "rule__Seminar__Group_5__1__Impl"
    // InternalSeminar.g:926:1: rule__Seminar__Group_5__1__Impl : ( ( rule__Seminar__TopicsAssignment_5_1 )* ) ;
    public final void rule__Seminar__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:930:1: ( ( ( rule__Seminar__TopicsAssignment_5_1 )* ) )
            // InternalSeminar.g:931:1: ( ( rule__Seminar__TopicsAssignment_5_1 )* )
            {
            // InternalSeminar.g:931:1: ( ( rule__Seminar__TopicsAssignment_5_1 )* )
            // InternalSeminar.g:932:2: ( rule__Seminar__TopicsAssignment_5_1 )*
            {
             before(grammarAccess.getSeminarAccess().getTopicsAssignment_5_1()); 
            // InternalSeminar.g:933:2: ( rule__Seminar__TopicsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeminar.g:933:3: rule__Seminar__TopicsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__TopicsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getTopicsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_5__1__Impl"


    // $ANTLR start "rule__Seminar__Group_5__2"
    // InternalSeminar.g:941:1: rule__Seminar__Group_5__2 : rule__Seminar__Group_5__2__Impl rule__Seminar__Group_5__3 ;
    public final void rule__Seminar__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:945:1: ( rule__Seminar__Group_5__2__Impl rule__Seminar__Group_5__3 )
            // InternalSeminar.g:946:2: rule__Seminar__Group_5__2__Impl rule__Seminar__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_5__3();

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
    // $ANTLR end "rule__Seminar__Group_5__2"


    // $ANTLR start "rule__Seminar__Group_5__2__Impl"
    // InternalSeminar.g:953:1: rule__Seminar__Group_5__2__Impl : ( ( rule__Seminar__Group_5_2__0 )* ) ;
    public final void rule__Seminar__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:957:1: ( ( ( rule__Seminar__Group_5_2__0 )* ) )
            // InternalSeminar.g:958:1: ( ( rule__Seminar__Group_5_2__0 )* )
            {
            // InternalSeminar.g:958:1: ( ( rule__Seminar__Group_5_2__0 )* )
            // InternalSeminar.g:959:2: ( rule__Seminar__Group_5_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_5_2()); 
            // InternalSeminar.g:960:2: ( rule__Seminar__Group_5_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeminar.g:960:3: rule__Seminar__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Seminar__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_5__2__Impl"


    // $ANTLR start "rule__Seminar__Group_5__3"
    // InternalSeminar.g:968:1: rule__Seminar__Group_5__3 : rule__Seminar__Group_5__3__Impl ;
    public final void rule__Seminar__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:972:1: ( rule__Seminar__Group_5__3__Impl )
            // InternalSeminar.g:973:2: rule__Seminar__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_5__3__Impl();

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
    // $ANTLR end "rule__Seminar__Group_5__3"


    // $ANTLR start "rule__Seminar__Group_5__3__Impl"
    // InternalSeminar.g:979:1: rule__Seminar__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:983:1: ( ( ';' ) )
            // InternalSeminar.g:984:1: ( ';' )
            {
            // InternalSeminar.g:984:1: ( ';' )
            // InternalSeminar.g:985:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_5_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSemicolonKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_5__3__Impl"


    // $ANTLR start "rule__Seminar__Group_5_2__0"
    // InternalSeminar.g:995:1: rule__Seminar__Group_5_2__0 : rule__Seminar__Group_5_2__0__Impl rule__Seminar__Group_5_2__1 ;
    public final void rule__Seminar__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:999:1: ( rule__Seminar__Group_5_2__0__Impl rule__Seminar__Group_5_2__1 )
            // InternalSeminar.g:1000:2: rule__Seminar__Group_5_2__0__Impl rule__Seminar__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Seminar__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_5_2__1();

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
    // $ANTLR end "rule__Seminar__Group_5_2__0"


    // $ANTLR start "rule__Seminar__Group_5_2__0__Impl"
    // InternalSeminar.g:1007:1: rule__Seminar__Group_5_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1011:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:1012:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:1012:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:1013:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:1013:2: ( ( ',' ) )
            // InternalSeminar.g:1014:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_5_2_0()); 
            // InternalSeminar.g:1015:3: ( ',' )
            // InternalSeminar.g:1015:4: ','
            {
            match(input,17,FOLLOW_11); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_5_2_0()); 

            }

            // InternalSeminar.g:1018:2: ( ( ',' )* )
            // InternalSeminar.g:1019:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_5_2_0()); 
            // InternalSeminar.g:1020:3: ( ',' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeminar.g:1020:4: ','
            	    {
            	    match(input,17,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getCommaKeyword_5_2_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_5_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_5_2__1"
    // InternalSeminar.g:1029:1: rule__Seminar__Group_5_2__1 : rule__Seminar__Group_5_2__1__Impl ;
    public final void rule__Seminar__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1033:1: ( rule__Seminar__Group_5_2__1__Impl )
            // InternalSeminar.g:1034:2: rule__Seminar__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Seminar__Group_5_2__1"


    // $ANTLR start "rule__Seminar__Group_5_2__1__Impl"
    // InternalSeminar.g:1040:1: rule__Seminar__Group_5_2__1__Impl : ( ( rule__Seminar__TopicsAssignment_5_2_1 ) ) ;
    public final void rule__Seminar__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1044:1: ( ( ( rule__Seminar__TopicsAssignment_5_2_1 ) ) )
            // InternalSeminar.g:1045:1: ( ( rule__Seminar__TopicsAssignment_5_2_1 ) )
            {
            // InternalSeminar.g:1045:1: ( ( rule__Seminar__TopicsAssignment_5_2_1 ) )
            // InternalSeminar.g:1046:2: ( rule__Seminar__TopicsAssignment_5_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getTopicsAssignment_5_2_1()); 
            // InternalSeminar.g:1047:2: ( rule__Seminar__TopicsAssignment_5_2_1 )
            // InternalSeminar.g:1047:3: rule__Seminar__TopicsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__TopicsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getTopicsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_5_2__1__Impl"


    // $ANTLR start "rule__Preference__Group__0"
    // InternalSeminar.g:1056:1: rule__Preference__Group__0 : rule__Preference__Group__0__Impl rule__Preference__Group__1 ;
    public final void rule__Preference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1060:1: ( rule__Preference__Group__0__Impl rule__Preference__Group__1 )
            // InternalSeminar.g:1061:2: rule__Preference__Group__0__Impl rule__Preference__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Preference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preference__Group__1();

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
    // $ANTLR end "rule__Preference__Group__0"


    // $ANTLR start "rule__Preference__Group__0__Impl"
    // InternalSeminar.g:1068:1: rule__Preference__Group__0__Impl : ( ( rule__Preference__StudentAssignment_0 ) ) ;
    public final void rule__Preference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1072:1: ( ( ( rule__Preference__StudentAssignment_0 ) ) )
            // InternalSeminar.g:1073:1: ( ( rule__Preference__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:1073:1: ( ( rule__Preference__StudentAssignment_0 ) )
            // InternalSeminar.g:1074:2: ( rule__Preference__StudentAssignment_0 )
            {
             before(grammarAccess.getPreferenceAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:1075:2: ( rule__Preference__StudentAssignment_0 )
            // InternalSeminar.g:1075:3: rule__Preference__StudentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Preference__StudentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPreferenceAccess().getStudentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__0__Impl"


    // $ANTLR start "rule__Preference__Group__1"
    // InternalSeminar.g:1083:1: rule__Preference__Group__1 : rule__Preference__Group__1__Impl rule__Preference__Group__2 ;
    public final void rule__Preference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1087:1: ( rule__Preference__Group__1__Impl rule__Preference__Group__2 )
            // InternalSeminar.g:1088:2: rule__Preference__Group__1__Impl rule__Preference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Preference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preference__Group__2();

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
    // $ANTLR end "rule__Preference__Group__1"


    // $ANTLR start "rule__Preference__Group__1__Impl"
    // InternalSeminar.g:1095:1: rule__Preference__Group__1__Impl : ( 'wants' ) ;
    public final void rule__Preference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1099:1: ( ( 'wants' ) )
            // InternalSeminar.g:1100:1: ( 'wants' )
            {
            // InternalSeminar.g:1100:1: ( 'wants' )
            // InternalSeminar.g:1101:2: 'wants'
            {
             before(grammarAccess.getPreferenceAccess().getWantsKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getWantsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__1__Impl"


    // $ANTLR start "rule__Preference__Group__2"
    // InternalSeminar.g:1110:1: rule__Preference__Group__2 : rule__Preference__Group__2__Impl rule__Preference__Group__3 ;
    public final void rule__Preference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1114:1: ( rule__Preference__Group__2__Impl rule__Preference__Group__3 )
            // InternalSeminar.g:1115:2: rule__Preference__Group__2__Impl rule__Preference__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Preference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preference__Group__3();

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
    // $ANTLR end "rule__Preference__Group__2"


    // $ANTLR start "rule__Preference__Group__2__Impl"
    // InternalSeminar.g:1122:1: rule__Preference__Group__2__Impl : ( ( rule__Preference__TopicsAssignment_2 ) ) ;
    public final void rule__Preference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1126:1: ( ( ( rule__Preference__TopicsAssignment_2 ) ) )
            // InternalSeminar.g:1127:1: ( ( rule__Preference__TopicsAssignment_2 ) )
            {
            // InternalSeminar.g:1127:1: ( ( rule__Preference__TopicsAssignment_2 ) )
            // InternalSeminar.g:1128:2: ( rule__Preference__TopicsAssignment_2 )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsAssignment_2()); 
            // InternalSeminar.g:1129:2: ( rule__Preference__TopicsAssignment_2 )
            // InternalSeminar.g:1129:3: rule__Preference__TopicsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Preference__TopicsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPreferenceAccess().getTopicsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__2__Impl"


    // $ANTLR start "rule__Preference__Group__3"
    // InternalSeminar.g:1137:1: rule__Preference__Group__3 : rule__Preference__Group__3__Impl rule__Preference__Group__4 ;
    public final void rule__Preference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1141:1: ( rule__Preference__Group__3__Impl rule__Preference__Group__4 )
            // InternalSeminar.g:1142:2: rule__Preference__Group__3__Impl rule__Preference__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Preference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preference__Group__4();

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
    // $ANTLR end "rule__Preference__Group__3"


    // $ANTLR start "rule__Preference__Group__3__Impl"
    // InternalSeminar.g:1149:1: rule__Preference__Group__3__Impl : ( ( rule__Preference__Group_3__0 )* ) ;
    public final void rule__Preference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1153:1: ( ( ( rule__Preference__Group_3__0 )* ) )
            // InternalSeminar.g:1154:1: ( ( rule__Preference__Group_3__0 )* )
            {
            // InternalSeminar.g:1154:1: ( ( rule__Preference__Group_3__0 )* )
            // InternalSeminar.g:1155:2: ( rule__Preference__Group_3__0 )*
            {
             before(grammarAccess.getPreferenceAccess().getGroup_3()); 
            // InternalSeminar.g:1156:2: ( rule__Preference__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeminar.g:1156:3: rule__Preference__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Preference__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPreferenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__3__Impl"


    // $ANTLR start "rule__Preference__Group__4"
    // InternalSeminar.g:1164:1: rule__Preference__Group__4 : rule__Preference__Group__4__Impl ;
    public final void rule__Preference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1168:1: ( rule__Preference__Group__4__Impl )
            // InternalSeminar.g:1169:2: rule__Preference__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Preference__Group__4__Impl();

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
    // $ANTLR end "rule__Preference__Group__4"


    // $ANTLR start "rule__Preference__Group__4__Impl"
    // InternalSeminar.g:1175:1: rule__Preference__Group__4__Impl : ( ';' ) ;
    public final void rule__Preference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1179:1: ( ( ';' ) )
            // InternalSeminar.g:1180:1: ( ';' )
            {
            // InternalSeminar.g:1180:1: ( ';' )
            // InternalSeminar.g:1181:2: ';'
            {
             before(grammarAccess.getPreferenceAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__4__Impl"


    // $ANTLR start "rule__Preference__Group_3__0"
    // InternalSeminar.g:1191:1: rule__Preference__Group_3__0 : rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1 ;
    public final void rule__Preference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1195:1: ( rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1 )
            // InternalSeminar.g:1196:2: rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Preference__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Preference__Group_3__1();

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
    // $ANTLR end "rule__Preference__Group_3__0"


    // $ANTLR start "rule__Preference__Group_3__0__Impl"
    // InternalSeminar.g:1203:1: rule__Preference__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Preference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1207:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:1208:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:1208:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:1209:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:1209:2: ( ( ',' ) )
            // InternalSeminar.g:1210:3: ( ',' )
            {
             before(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 
            // InternalSeminar.g:1211:3: ( ',' )
            // InternalSeminar.g:1211:4: ','
            {
            match(input,17,FOLLOW_11); 

            }

             after(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 

            }

            // InternalSeminar.g:1214:2: ( ( ',' )* )
            // InternalSeminar.g:1215:3: ( ',' )*
            {
             before(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 
            // InternalSeminar.g:1216:3: ( ',' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSeminar.g:1216:4: ','
            	    {
            	    match(input,17,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group_3__0__Impl"


    // $ANTLR start "rule__Preference__Group_3__1"
    // InternalSeminar.g:1225:1: rule__Preference__Group_3__1 : rule__Preference__Group_3__1__Impl ;
    public final void rule__Preference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1229:1: ( rule__Preference__Group_3__1__Impl )
            // InternalSeminar.g:1230:2: rule__Preference__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Preference__Group_3__1__Impl();

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
    // $ANTLR end "rule__Preference__Group_3__1"


    // $ANTLR start "rule__Preference__Group_3__1__Impl"
    // InternalSeminar.g:1236:1: rule__Preference__Group_3__1__Impl : ( ( rule__Preference__TopicsAssignment_3_1 ) ) ;
    public final void rule__Preference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1240:1: ( ( ( rule__Preference__TopicsAssignment_3_1 ) ) )
            // InternalSeminar.g:1241:1: ( ( rule__Preference__TopicsAssignment_3_1 ) )
            {
            // InternalSeminar.g:1241:1: ( ( rule__Preference__TopicsAssignment_3_1 ) )
            // InternalSeminar.g:1242:2: ( rule__Preference__TopicsAssignment_3_1 )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsAssignment_3_1()); 
            // InternalSeminar.g:1243:2: ( rule__Preference__TopicsAssignment_3_1 )
            // InternalSeminar.g:1243:3: rule__Preference__TopicsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Preference__TopicsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPreferenceAccess().getTopicsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group_3__1__Impl"


    // $ANTLR start "rule__Rating__Group__0"
    // InternalSeminar.g:1252:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1256:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalSeminar.g:1257:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__1();

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
    // $ANTLR end "rule__Rating__Group__0"


    // $ANTLR start "rule__Rating__Group__0__Impl"
    // InternalSeminar.g:1264:1: rule__Rating__Group__0__Impl : ( ( rule__Rating__StudentAssignment_0 ) ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1268:1: ( ( ( rule__Rating__StudentAssignment_0 ) ) )
            // InternalSeminar.g:1269:1: ( ( rule__Rating__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:1269:1: ( ( rule__Rating__StudentAssignment_0 ) )
            // InternalSeminar.g:1270:2: ( rule__Rating__StudentAssignment_0 )
            {
             before(grammarAccess.getRatingAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:1271:2: ( rule__Rating__StudentAssignment_0 )
            // InternalSeminar.g:1271:3: rule__Rating__StudentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rating__StudentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getStudentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__0__Impl"


    // $ANTLR start "rule__Rating__Group__1"
    // InternalSeminar.g:1279:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1283:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalSeminar.g:1284:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__2();

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
    // $ANTLR end "rule__Rating__Group__1"


    // $ANTLR start "rule__Rating__Group__1__Impl"
    // InternalSeminar.g:1291:1: rule__Rating__Group__1__Impl : ( 'rates' ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1295:1: ( ( 'rates' ) )
            // InternalSeminar.g:1296:1: ( 'rates' )
            {
            // InternalSeminar.g:1296:1: ( 'rates' )
            // InternalSeminar.g:1297:2: 'rates'
            {
             before(grammarAccess.getRatingAccess().getRatesKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getRatesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__1__Impl"


    // $ANTLR start "rule__Rating__Group__2"
    // InternalSeminar.g:1306:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1310:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalSeminar.g:1311:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__3();

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
    // $ANTLR end "rule__Rating__Group__2"


    // $ANTLR start "rule__Rating__Group__2__Impl"
    // InternalSeminar.g:1318:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__TopicAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1322:1: ( ( ( rule__Rating__TopicAssignment_2 ) ) )
            // InternalSeminar.g:1323:1: ( ( rule__Rating__TopicAssignment_2 ) )
            {
            // InternalSeminar.g:1323:1: ( ( rule__Rating__TopicAssignment_2 ) )
            // InternalSeminar.g:1324:2: ( rule__Rating__TopicAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getTopicAssignment_2()); 
            // InternalSeminar.g:1325:2: ( rule__Rating__TopicAssignment_2 )
            // InternalSeminar.g:1325:3: rule__Rating__TopicAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rating__TopicAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getTopicAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__2__Impl"


    // $ANTLR start "rule__Rating__Group__3"
    // InternalSeminar.g:1333:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1337:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalSeminar.g:1338:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Rating__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__4();

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
    // $ANTLR end "rule__Rating__Group__3"


    // $ANTLR start "rule__Rating__Group__3__Impl"
    // InternalSeminar.g:1345:1: rule__Rating__Group__3__Impl : ( 'with' ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1349:1: ( ( 'with' ) )
            // InternalSeminar.g:1350:1: ( 'with' )
            {
            // InternalSeminar.g:1350:1: ( 'with' )
            // InternalSeminar.g:1351:2: 'with'
            {
             before(grammarAccess.getRatingAccess().getWithKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__3__Impl"


    // $ANTLR start "rule__Rating__Group__4"
    // InternalSeminar.g:1360:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl rule__Rating__Group__5 ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1364:1: ( rule__Rating__Group__4__Impl rule__Rating__Group__5 )
            // InternalSeminar.g:1365:2: rule__Rating__Group__4__Impl rule__Rating__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Rating__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__5();

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
    // $ANTLR end "rule__Rating__Group__4"


    // $ANTLR start "rule__Rating__Group__4__Impl"
    // InternalSeminar.g:1372:1: rule__Rating__Group__4__Impl : ( ( rule__Rating__RatingAssignment_4 ) ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1376:1: ( ( ( rule__Rating__RatingAssignment_4 ) ) )
            // InternalSeminar.g:1377:1: ( ( rule__Rating__RatingAssignment_4 ) )
            {
            // InternalSeminar.g:1377:1: ( ( rule__Rating__RatingAssignment_4 ) )
            // InternalSeminar.g:1378:2: ( rule__Rating__RatingAssignment_4 )
            {
             before(grammarAccess.getRatingAccess().getRatingAssignment_4()); 
            // InternalSeminar.g:1379:2: ( rule__Rating__RatingAssignment_4 )
            // InternalSeminar.g:1379:3: rule__Rating__RatingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rating__RatingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getRatingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__4__Impl"


    // $ANTLR start "rule__Rating__Group__5"
    // InternalSeminar.g:1387:1: rule__Rating__Group__5 : rule__Rating__Group__5__Impl ;
    public final void rule__Rating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1391:1: ( rule__Rating__Group__5__Impl )
            // InternalSeminar.g:1392:2: rule__Rating__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rating__Group__5__Impl();

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
    // $ANTLR end "rule__Rating__Group__5"


    // $ANTLR start "rule__Rating__Group__5__Impl"
    // InternalSeminar.g:1398:1: rule__Rating__Group__5__Impl : ( ';' ) ;
    public final void rule__Rating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1402:1: ( ( ';' ) )
            // InternalSeminar.g:1403:1: ( ';' )
            {
            // InternalSeminar.g:1403:1: ( ';' )
            // InternalSeminar.g:1404:2: ';'
            {
             before(grammarAccess.getRatingAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__5__Impl"


    // $ANTLR start "rule__Supervise__Group__0"
    // InternalSeminar.g:1414:1: rule__Supervise__Group__0 : rule__Supervise__Group__0__Impl rule__Supervise__Group__1 ;
    public final void rule__Supervise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1418:1: ( rule__Supervise__Group__0__Impl rule__Supervise__Group__1 )
            // InternalSeminar.g:1419:2: rule__Supervise__Group__0__Impl rule__Supervise__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Supervise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supervise__Group__1();

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
    // $ANTLR end "rule__Supervise__Group__0"


    // $ANTLR start "rule__Supervise__Group__0__Impl"
    // InternalSeminar.g:1426:1: rule__Supervise__Group__0__Impl : ( ( rule__Supervise__SupervisorAssignment_0 ) ) ;
    public final void rule__Supervise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1430:1: ( ( ( rule__Supervise__SupervisorAssignment_0 ) ) )
            // InternalSeminar.g:1431:1: ( ( rule__Supervise__SupervisorAssignment_0 ) )
            {
            // InternalSeminar.g:1431:1: ( ( rule__Supervise__SupervisorAssignment_0 ) )
            // InternalSeminar.g:1432:2: ( rule__Supervise__SupervisorAssignment_0 )
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorAssignment_0()); 
            // InternalSeminar.g:1433:2: ( rule__Supervise__SupervisorAssignment_0 )
            // InternalSeminar.g:1433:3: rule__Supervise__SupervisorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Supervise__SupervisorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSuperviseAccess().getSupervisorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervise__Group__0__Impl"


    // $ANTLR start "rule__Supervise__Group__1"
    // InternalSeminar.g:1441:1: rule__Supervise__Group__1 : rule__Supervise__Group__1__Impl rule__Supervise__Group__2 ;
    public final void rule__Supervise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1445:1: ( rule__Supervise__Group__1__Impl rule__Supervise__Group__2 )
            // InternalSeminar.g:1446:2: rule__Supervise__Group__1__Impl rule__Supervise__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Supervise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supervise__Group__2();

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
    // $ANTLR end "rule__Supervise__Group__1"


    // $ANTLR start "rule__Supervise__Group__1__Impl"
    // InternalSeminar.g:1453:1: rule__Supervise__Group__1__Impl : ( 'supervises' ) ;
    public final void rule__Supervise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1457:1: ( ( 'supervises' ) )
            // InternalSeminar.g:1458:1: ( 'supervises' )
            {
            // InternalSeminar.g:1458:1: ( 'supervises' )
            // InternalSeminar.g:1459:2: 'supervises'
            {
             before(grammarAccess.getSuperviseAccess().getSupervisesKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSuperviseAccess().getSupervisesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervise__Group__1__Impl"


    // $ANTLR start "rule__Supervise__Group__2"
    // InternalSeminar.g:1468:1: rule__Supervise__Group__2 : rule__Supervise__Group__2__Impl rule__Supervise__Group__3 ;
    public final void rule__Supervise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1472:1: ( rule__Supervise__Group__2__Impl rule__Supervise__Group__3 )
            // InternalSeminar.g:1473:2: rule__Supervise__Group__2__Impl rule__Supervise__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Supervise__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supervise__Group__3();

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
    // $ANTLR end "rule__Supervise__Group__2"


    // $ANTLR start "rule__Supervise__Group__2__Impl"
    // InternalSeminar.g:1480:1: rule__Supervise__Group__2__Impl : ( ( rule__Supervise__TopicAssignment_2 ) ) ;
    public final void rule__Supervise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1484:1: ( ( ( rule__Supervise__TopicAssignment_2 ) ) )
            // InternalSeminar.g:1485:1: ( ( rule__Supervise__TopicAssignment_2 ) )
            {
            // InternalSeminar.g:1485:1: ( ( rule__Supervise__TopicAssignment_2 ) )
            // InternalSeminar.g:1486:2: ( rule__Supervise__TopicAssignment_2 )
            {
             before(grammarAccess.getSuperviseAccess().getTopicAssignment_2()); 
            // InternalSeminar.g:1487:2: ( rule__Supervise__TopicAssignment_2 )
            // InternalSeminar.g:1487:3: rule__Supervise__TopicAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Supervise__TopicAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSuperviseAccess().getTopicAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervise__Group__2__Impl"


    // $ANTLR start "rule__Supervise__Group__3"
    // InternalSeminar.g:1495:1: rule__Supervise__Group__3 : rule__Supervise__Group__3__Impl ;
    public final void rule__Supervise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1499:1: ( rule__Supervise__Group__3__Impl )
            // InternalSeminar.g:1500:2: rule__Supervise__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Supervise__Group__3__Impl();

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
    // $ANTLR end "rule__Supervise__Group__3"


    // $ANTLR start "rule__Supervise__Group__3__Impl"
    // InternalSeminar.g:1506:1: rule__Supervise__Group__3__Impl : ( ';' ) ;
    public final void rule__Supervise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1510:1: ( ( ';' ) )
            // InternalSeminar.g:1511:1: ( ';' )
            {
            // InternalSeminar.g:1511:1: ( ';' )
            // InternalSeminar.g:1512:2: ';'
            {
             before(grammarAccess.getSuperviseAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSuperviseAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervise__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalSeminar.g:1522:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1526:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalSeminar.g:1527:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalSeminar.g:1534:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__StudentAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1538:1: ( ( ( rule__Assignment__StudentAssignment_0 ) ) )
            // InternalSeminar.g:1539:1: ( ( rule__Assignment__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:1539:1: ( ( rule__Assignment__StudentAssignment_0 ) )
            // InternalSeminar.g:1540:2: ( rule__Assignment__StudentAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:1541:2: ( rule__Assignment__StudentAssignment_0 )
            // InternalSeminar.g:1541:3: rule__Assignment__StudentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__StudentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getStudentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalSeminar.g:1549:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1553:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalSeminar.g:1554:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalSeminar.g:1561:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1565:1: ( ( 'is' ) )
            // InternalSeminar.g:1566:1: ( 'is' )
            {
            // InternalSeminar.g:1566:1: ( 'is' )
            // InternalSeminar.g:1567:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalSeminar.g:1576:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1580:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalSeminar.g:1581:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalSeminar.g:1588:1: rule__Assignment__Group__2__Impl : ( 'assigned' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1592:1: ( ( 'assigned' ) )
            // InternalSeminar.g:1593:1: ( 'assigned' )
            {
            // InternalSeminar.g:1593:1: ( 'assigned' )
            // InternalSeminar.g:1594:2: 'assigned'
            {
             before(grammarAccess.getAssignmentAccess().getAssignedKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getAssignedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalSeminar.g:1603:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1607:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalSeminar.g:1608:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Assignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__4();

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
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalSeminar.g:1615:1: rule__Assignment__Group__3__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1619:1: ( ( 'to' ) )
            // InternalSeminar.g:1620:1: ( 'to' )
            {
            // InternalSeminar.g:1620:1: ( 'to' )
            // InternalSeminar.g:1621:2: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // InternalSeminar.g:1630:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1634:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalSeminar.g:1635:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__5();

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
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // InternalSeminar.g:1642:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__TopicAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1646:1: ( ( ( rule__Assignment__TopicAssignment_4 ) ) )
            // InternalSeminar.g:1647:1: ( ( rule__Assignment__TopicAssignment_4 ) )
            {
            // InternalSeminar.g:1647:1: ( ( rule__Assignment__TopicAssignment_4 ) )
            // InternalSeminar.g:1648:2: ( rule__Assignment__TopicAssignment_4 )
            {
             before(grammarAccess.getAssignmentAccess().getTopicAssignment_4()); 
            // InternalSeminar.g:1649:2: ( rule__Assignment__TopicAssignment_4 )
            // InternalSeminar.g:1649:3: rule__Assignment__TopicAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TopicAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTopicAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group__5"
    // InternalSeminar.g:1657:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1661:1: ( rule__Assignment__Group__5__Impl )
            // InternalSeminar.g:1662:2: rule__Assignment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__5__Impl();

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
    // $ANTLR end "rule__Assignment__Group__5"


    // $ANTLR start "rule__Assignment__Group__5__Impl"
    // InternalSeminar.g:1668:1: rule__Assignment__Group__5__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1672:1: ( ( ';' ) )
            // InternalSeminar.g:1673:1: ( ';' )
            {
            // InternalSeminar.g:1673:1: ( ';' )
            // InternalSeminar.g:1674:2: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__5__Impl"


    // $ANTLR start "rule__Seminar__NameAssignment_1"
    // InternalSeminar.g:1684:1: rule__Seminar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Seminar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1688:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1689:2: ( RULE_ID )
            {
            // InternalSeminar.g:1689:2: ( RULE_ID )
            // InternalSeminar.g:1690:3: RULE_ID
            {
             before(grammarAccess.getSeminarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__NameAssignment_1"


    // $ANTLR start "rule__Seminar__SupervisorsAssignment_3_1"
    // InternalSeminar.g:1699:1: rule__Seminar__SupervisorsAssignment_3_1 : ( ruleSupervisor ) ;
    public final void rule__Seminar__SupervisorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1703:1: ( ( ruleSupervisor ) )
            // InternalSeminar.g:1704:2: ( ruleSupervisor )
            {
            // InternalSeminar.g:1704:2: ( ruleSupervisor )
            // InternalSeminar.g:1705:3: ruleSupervisor
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervisor();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisorsAssignment_3_1"


    // $ANTLR start "rule__Seminar__SupervisorsAssignment_3_2_1"
    // InternalSeminar.g:1714:1: rule__Seminar__SupervisorsAssignment_3_2_1 : ( ruleSupervisor ) ;
    public final void rule__Seminar__SupervisorsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1718:1: ( ( ruleSupervisor ) )
            // InternalSeminar.g:1719:2: ( ruleSupervisor )
            {
            // InternalSeminar.g:1719:2: ( ruleSupervisor )
            // InternalSeminar.g:1720:3: ruleSupervisor
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervisor();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisorsAssignment_3_2_1"


    // $ANTLR start "rule__Seminar__StudentsAssignment_4_1"
    // InternalSeminar.g:1729:1: rule__Seminar__StudentsAssignment_4_1 : ( ruleStudent ) ;
    public final void rule__Seminar__StudentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1733:1: ( ( ruleStudent ) )
            // InternalSeminar.g:1734:2: ( ruleStudent )
            {
            // InternalSeminar.g:1734:2: ( ruleStudent )
            // InternalSeminar.g:1735:3: ruleStudent
            {
             before(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__StudentsAssignment_4_1"


    // $ANTLR start "rule__Seminar__StudentsAssignment_4_2_1"
    // InternalSeminar.g:1744:1: rule__Seminar__StudentsAssignment_4_2_1 : ( ruleStudent ) ;
    public final void rule__Seminar__StudentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1748:1: ( ( ruleStudent ) )
            // InternalSeminar.g:1749:2: ( ruleStudent )
            {
            // InternalSeminar.g:1749:2: ( ruleStudent )
            // InternalSeminar.g:1750:3: ruleStudent
            {
             before(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__StudentsAssignment_4_2_1"


    // $ANTLR start "rule__Seminar__TopicsAssignment_5_1"
    // InternalSeminar.g:1759:1: rule__Seminar__TopicsAssignment_5_1 : ( ruleTopic ) ;
    public final void rule__Seminar__TopicsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1763:1: ( ( ruleTopic ) )
            // InternalSeminar.g:1764:2: ( ruleTopic )
            {
            // InternalSeminar.g:1764:2: ( ruleTopic )
            // InternalSeminar.g:1765:3: ruleTopic
            {
             before(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__TopicsAssignment_5_1"


    // $ANTLR start "rule__Seminar__TopicsAssignment_5_2_1"
    // InternalSeminar.g:1774:1: rule__Seminar__TopicsAssignment_5_2_1 : ( ruleTopic ) ;
    public final void rule__Seminar__TopicsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1778:1: ( ( ruleTopic ) )
            // InternalSeminar.g:1779:2: ( ruleTopic )
            {
            // InternalSeminar.g:1779:2: ( ruleTopic )
            // InternalSeminar.g:1780:3: ruleTopic
            {
             before(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__TopicsAssignment_5_2_1"


    // $ANTLR start "rule__Seminar__PreferencesAssignment_6"
    // InternalSeminar.g:1789:1: rule__Seminar__PreferencesAssignment_6 : ( rulePreference ) ;
    public final void rule__Seminar__PreferencesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1793:1: ( ( rulePreference ) )
            // InternalSeminar.g:1794:2: ( rulePreference )
            {
            // InternalSeminar.g:1794:2: ( rulePreference )
            // InternalSeminar.g:1795:3: rulePreference
            {
             before(grammarAccess.getSeminarAccess().getPreferencesPreferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePreference();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getPreferencesPreferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__PreferencesAssignment_6"


    // $ANTLR start "rule__Seminar__RatingsAssignment_7"
    // InternalSeminar.g:1804:1: rule__Seminar__RatingsAssignment_7 : ( ruleRating ) ;
    public final void rule__Seminar__RatingsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1808:1: ( ( ruleRating ) )
            // InternalSeminar.g:1809:2: ( ruleRating )
            {
            // InternalSeminar.g:1809:2: ( ruleRating )
            // InternalSeminar.g:1810:3: ruleRating
            {
             before(grammarAccess.getSeminarAccess().getRatingsRatingParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getRatingsRatingParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__RatingsAssignment_7"


    // $ANTLR start "rule__Seminar__SupervisesAssignment_8"
    // InternalSeminar.g:1819:1: rule__Seminar__SupervisesAssignment_8 : ( ruleSupervise ) ;
    public final void rule__Seminar__SupervisesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1823:1: ( ( ruleSupervise ) )
            // InternalSeminar.g:1824:2: ( ruleSupervise )
            {
            // InternalSeminar.g:1824:2: ( ruleSupervise )
            // InternalSeminar.g:1825:3: ruleSupervise
            {
             before(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervise();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisesAssignment_8"


    // $ANTLR start "rule__Seminar__AssignmentsAssignment_9"
    // InternalSeminar.g:1834:1: rule__Seminar__AssignmentsAssignment_9 : ( ruleAssignment ) ;
    public final void rule__Seminar__AssignmentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1838:1: ( ( ruleAssignment ) )
            // InternalSeminar.g:1839:2: ( ruleAssignment )
            {
            // InternalSeminar.g:1839:2: ( ruleAssignment )
            // InternalSeminar.g:1840:3: ruleAssignment
            {
             before(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__AssignmentsAssignment_9"


    // $ANTLR start "rule__Supervisor__NameAssignment"
    // InternalSeminar.g:1849:1: rule__Supervisor__NameAssignment : ( RULE_ID ) ;
    public final void rule__Supervisor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1853:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1854:2: ( RULE_ID )
            {
            // InternalSeminar.g:1854:2: ( RULE_ID )
            // InternalSeminar.g:1855:3: RULE_ID
            {
             before(grammarAccess.getSupervisorAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSupervisorAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervisor__NameAssignment"


    // $ANTLR start "rule__Student__NameAssignment"
    // InternalSeminar.g:1864:1: rule__Student__NameAssignment : ( RULE_ID ) ;
    public final void rule__Student__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1868:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1869:2: ( RULE_ID )
            {
            // InternalSeminar.g:1869:2: ( RULE_ID )
            // InternalSeminar.g:1870:3: RULE_ID
            {
             before(grammarAccess.getStudentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NameAssignment"


    // $ANTLR start "rule__Topic__NameAssignment"
    // InternalSeminar.g:1879:1: rule__Topic__NameAssignment : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1883:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1884:2: ( RULE_ID )
            {
            // InternalSeminar.g:1884:2: ( RULE_ID )
            // InternalSeminar.g:1885:3: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__NameAssignment"


    // $ANTLR start "rule__Preference__StudentAssignment_0"
    // InternalSeminar.g:1894:1: rule__Preference__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1898:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1899:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1899:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1900:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1901:3: ( RULE_ID )
            // InternalSeminar.g:1902:4: RULE_ID
            {
             before(grammarAccess.getPreferenceAccess().getStudentStudentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getStudentStudentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPreferenceAccess().getStudentStudentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__StudentAssignment_0"


    // $ANTLR start "rule__Preference__TopicsAssignment_2"
    // InternalSeminar.g:1913:1: rule__Preference__TopicsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__TopicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1917:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1918:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1918:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1919:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_2_0()); 
            // InternalSeminar.g:1920:3: ( RULE_ID )
            // InternalSeminar.g:1921:4: RULE_ID
            {
             before(grammarAccess.getPreferenceAccess().getTopicsTopicIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getTopicsTopicIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__TopicsAssignment_2"


    // $ANTLR start "rule__Preference__TopicsAssignment_3_1"
    // InternalSeminar.g:1932:1: rule__Preference__TopicsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__TopicsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1936:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1937:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1937:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1938:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_3_1_0()); 
            // InternalSeminar.g:1939:3: ( RULE_ID )
            // InternalSeminar.g:1940:4: RULE_ID
            {
             before(grammarAccess.getPreferenceAccess().getTopicsTopicIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getTopicsTopicIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__TopicsAssignment_3_1"


    // $ANTLR start "rule__Rating__StudentAssignment_0"
    // InternalSeminar.g:1951:1: rule__Rating__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1955:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1956:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1956:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1957:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1958:3: ( RULE_ID )
            // InternalSeminar.g:1959:4: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getStudentStudentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getStudentStudentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRatingAccess().getStudentStudentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__StudentAssignment_0"


    // $ANTLR start "rule__Rating__TopicAssignment_2"
    // InternalSeminar.g:1970:1: rule__Rating__TopicAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__TopicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1974:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1975:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1975:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1976:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getTopicTopicCrossReference_2_0()); 
            // InternalSeminar.g:1977:3: ( RULE_ID )
            // InternalSeminar.g:1978:4: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getTopicTopicIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getTopicTopicIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRatingAccess().getTopicTopicCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__TopicAssignment_2"


    // $ANTLR start "rule__Rating__RatingAssignment_4"
    // InternalSeminar.g:1989:1: rule__Rating__RatingAssignment_4 : ( RULE_REAL ) ;
    public final void rule__Rating__RatingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1993:1: ( ( RULE_REAL ) )
            // InternalSeminar.g:1994:2: ( RULE_REAL )
            {
            // InternalSeminar.g:1994:2: ( RULE_REAL )
            // InternalSeminar.g:1995:3: RULE_REAL
            {
             before(grammarAccess.getRatingAccess().getRatingREALTerminalRuleCall_4_0()); 
            match(input,RULE_REAL,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getRatingREALTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__RatingAssignment_4"


    // $ANTLR start "rule__Supervise__SupervisorAssignment_0"
    // InternalSeminar.g:2004:1: rule__Supervise__SupervisorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Supervise__SupervisorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:2008:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:2009:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:2009:2: ( ( RULE_ID ) )
            // InternalSeminar.g:2010:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorSupervisorCrossReference_0_0()); 
            // InternalSeminar.g:2011:3: ( RULE_ID )
            // InternalSeminar.g:2012:4: RULE_ID
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorSupervisorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSuperviseAccess().getSupervisorSupervisorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSuperviseAccess().getSupervisorSupervisorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervise__SupervisorAssignment_0"


    // $ANTLR start "rule__Supervise__TopicAssignment_2"
    // InternalSeminar.g:2023:1: rule__Supervise__TopicAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Supervise__TopicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:2027:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:2028:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:2028:2: ( ( RULE_ID ) )
            // InternalSeminar.g:2029:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperviseAccess().getTopicTopicCrossReference_2_0()); 
            // InternalSeminar.g:2030:3: ( RULE_ID )
            // InternalSeminar.g:2031:4: RULE_ID
            {
             before(grammarAccess.getSuperviseAccess().getTopicTopicIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSuperviseAccess().getTopicTopicIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSuperviseAccess().getTopicTopicCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Supervise__TopicAssignment_2"


    // $ANTLR start "rule__Assignment__StudentAssignment_0"
    // InternalSeminar.g:2042:1: rule__Assignment__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:2046:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:2047:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:2047:2: ( ( RULE_ID ) )
            // InternalSeminar.g:2048:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:2049:3: ( RULE_ID )
            // InternalSeminar.g:2050:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getStudentStudentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getStudentStudentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getStudentStudentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__StudentAssignment_0"


    // $ANTLR start "rule__Assignment__TopicAssignment_4"
    // InternalSeminar.g:2061:1: rule__Assignment__TopicAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TopicAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:2065:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:2066:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:2066:2: ( ( RULE_ID ) )
            // InternalSeminar.g:2067:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTopicTopicCrossReference_4_0()); 
            // InternalSeminar.g:2068:3: ( RULE_ID )
            // InternalSeminar.g:2069:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTopicTopicIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getTopicTopicIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getTopicTopicCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TopicAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000CC010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}