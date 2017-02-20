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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'supervisors:'", "';'", "','", "'students:'", "'topics:'", "'likes'", "'rates'", "'with'", "'supervises'", "'is'", "'assigned'", "'to'"
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
    // InternalSeminar.g:264:1: rule__Seminar__Group__0__Impl : ( ( rule__Seminar__Group_0__0 )* ) ;
    public final void rule__Seminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:268:1: ( ( ( rule__Seminar__Group_0__0 )* ) )
            // InternalSeminar.g:269:1: ( ( rule__Seminar__Group_0__0 )* )
            {
            // InternalSeminar.g:269:1: ( ( rule__Seminar__Group_0__0 )* )
            // InternalSeminar.g:270:2: ( rule__Seminar__Group_0__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_0()); 
            // InternalSeminar.g:271:2: ( rule__Seminar__Group_0__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeminar.g:271:3: rule__Seminar__Group_0__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Seminar__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_0()); 

            }


            }

        }
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
            pushFollow(FOLLOW_3);
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
    // InternalSeminar.g:291:1: rule__Seminar__Group__1__Impl : ( ( rule__Seminar__Group_1__0 )* ) ;
    public final void rule__Seminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:295:1: ( ( ( rule__Seminar__Group_1__0 )* ) )
            // InternalSeminar.g:296:1: ( ( rule__Seminar__Group_1__0 )* )
            {
            // InternalSeminar.g:296:1: ( ( rule__Seminar__Group_1__0 )* )
            // InternalSeminar.g:297:2: ( rule__Seminar__Group_1__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_1()); 
            // InternalSeminar.g:298:2: ( rule__Seminar__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeminar.g:298:3: rule__Seminar__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Seminar__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_1()); 

            }


            }

        }
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
            pushFollow(FOLLOW_3);
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
    // InternalSeminar.g:318:1: rule__Seminar__Group__2__Impl : ( ( rule__Seminar__Group_2__0 )* ) ;
    public final void rule__Seminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:322:1: ( ( ( rule__Seminar__Group_2__0 )* ) )
            // InternalSeminar.g:323:1: ( ( rule__Seminar__Group_2__0 )* )
            {
            // InternalSeminar.g:323:1: ( ( rule__Seminar__Group_2__0 )* )
            // InternalSeminar.g:324:2: ( rule__Seminar__Group_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_2()); 
            // InternalSeminar.g:325:2: ( rule__Seminar__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSeminar.g:325:3: rule__Seminar__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Seminar__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_2()); 

            }


            }

        }
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
            pushFollow(FOLLOW_3);
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
    // InternalSeminar.g:345:1: rule__Seminar__Group__3__Impl : ( ( rule__Seminar__PreferencesAssignment_3 )* ) ;
    public final void rule__Seminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:349:1: ( ( ( rule__Seminar__PreferencesAssignment_3 )* ) )
            // InternalSeminar.g:350:1: ( ( rule__Seminar__PreferencesAssignment_3 )* )
            {
            // InternalSeminar.g:350:1: ( ( rule__Seminar__PreferencesAssignment_3 )* )
            // InternalSeminar.g:351:2: ( rule__Seminar__PreferencesAssignment_3 )*
            {
             before(grammarAccess.getSeminarAccess().getPreferencesAssignment_3()); 
            // InternalSeminar.g:352:2: ( rule__Seminar__PreferencesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==17) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeminar.g:352:3: rule__Seminar__PreferencesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__PreferencesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getPreferencesAssignment_3()); 

            }


            }

        }
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
            pushFollow(FOLLOW_3);
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
    // InternalSeminar.g:372:1: rule__Seminar__Group__4__Impl : ( ( rule__Seminar__RatingsAssignment_4 )* ) ;
    public final void rule__Seminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:376:1: ( ( ( rule__Seminar__RatingsAssignment_4 )* ) )
            // InternalSeminar.g:377:1: ( ( rule__Seminar__RatingsAssignment_4 )* )
            {
            // InternalSeminar.g:377:1: ( ( rule__Seminar__RatingsAssignment_4 )* )
            // InternalSeminar.g:378:2: ( rule__Seminar__RatingsAssignment_4 )*
            {
             before(grammarAccess.getSeminarAccess().getRatingsAssignment_4()); 
            // InternalSeminar.g:379:2: ( rule__Seminar__RatingsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==18) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeminar.g:379:3: rule__Seminar__RatingsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__RatingsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getRatingsAssignment_4()); 

            }


            }

        }
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
            pushFollow(FOLLOW_3);
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
    // InternalSeminar.g:399:1: rule__Seminar__Group__5__Impl : ( ( rule__Seminar__SupervisesAssignment_5 )* ) ;
    public final void rule__Seminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:403:1: ( ( ( rule__Seminar__SupervisesAssignment_5 )* ) )
            // InternalSeminar.g:404:1: ( ( rule__Seminar__SupervisesAssignment_5 )* )
            {
            // InternalSeminar.g:404:1: ( ( rule__Seminar__SupervisesAssignment_5 )* )
            // InternalSeminar.g:405:2: ( rule__Seminar__SupervisesAssignment_5 )*
            {
             before(grammarAccess.getSeminarAccess().getSupervisesAssignment_5()); 
            // InternalSeminar.g:406:2: ( rule__Seminar__SupervisesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==20) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalSeminar.g:406:3: rule__Seminar__SupervisesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__SupervisesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getSupervisesAssignment_5()); 

            }


            }

        }
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
    // InternalSeminar.g:414:1: rule__Seminar__Group__6 : rule__Seminar__Group__6__Impl ;
    public final void rule__Seminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:418:1: ( rule__Seminar__Group__6__Impl )
            // InternalSeminar.g:419:2: rule__Seminar__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group__6__Impl();

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
    // InternalSeminar.g:425:1: rule__Seminar__Group__6__Impl : ( ( rule__Seminar__AssignmentsAssignment_6 )* ) ;
    public final void rule__Seminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:429:1: ( ( ( rule__Seminar__AssignmentsAssignment_6 )* ) )
            // InternalSeminar.g:430:1: ( ( rule__Seminar__AssignmentsAssignment_6 )* )
            {
            // InternalSeminar.g:430:1: ( ( rule__Seminar__AssignmentsAssignment_6 )* )
            // InternalSeminar.g:431:2: ( rule__Seminar__AssignmentsAssignment_6 )*
            {
             before(grammarAccess.getSeminarAccess().getAssignmentsAssignment_6()); 
            // InternalSeminar.g:432:2: ( rule__Seminar__AssignmentsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeminar.g:432:3: rule__Seminar__AssignmentsAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__AssignmentsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getAssignmentsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Seminar__Group_0__0"
    // InternalSeminar.g:441:1: rule__Seminar__Group_0__0 : rule__Seminar__Group_0__0__Impl rule__Seminar__Group_0__1 ;
    public final void rule__Seminar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:445:1: ( rule__Seminar__Group_0__0__Impl rule__Seminar__Group_0__1 )
            // InternalSeminar.g:446:2: rule__Seminar__Group_0__0__Impl rule__Seminar__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_0__1();

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
    // $ANTLR end "rule__Seminar__Group_0__0"


    // $ANTLR start "rule__Seminar__Group_0__0__Impl"
    // InternalSeminar.g:453:1: rule__Seminar__Group_0__0__Impl : ( 'supervisors:' ) ;
    public final void rule__Seminar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:457:1: ( ( 'supervisors:' ) )
            // InternalSeminar.g:458:1: ( 'supervisors:' )
            {
            // InternalSeminar.g:458:1: ( 'supervisors:' )
            // InternalSeminar.g:459:2: 'supervisors:'
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSupervisorsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_0__0__Impl"


    // $ANTLR start "rule__Seminar__Group_0__1"
    // InternalSeminar.g:468:1: rule__Seminar__Group_0__1 : rule__Seminar__Group_0__1__Impl rule__Seminar__Group_0__2 ;
    public final void rule__Seminar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:472:1: ( rule__Seminar__Group_0__1__Impl rule__Seminar__Group_0__2 )
            // InternalSeminar.g:473:2: rule__Seminar__Group_0__1__Impl rule__Seminar__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_0__2();

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
    // $ANTLR end "rule__Seminar__Group_0__1"


    // $ANTLR start "rule__Seminar__Group_0__1__Impl"
    // InternalSeminar.g:480:1: rule__Seminar__Group_0__1__Impl : ( ( rule__Seminar__SupervisorsAssignment_0_1 )* ) ;
    public final void rule__Seminar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:484:1: ( ( ( rule__Seminar__SupervisorsAssignment_0_1 )* ) )
            // InternalSeminar.g:485:1: ( ( rule__Seminar__SupervisorsAssignment_0_1 )* )
            {
            // InternalSeminar.g:485:1: ( ( rule__Seminar__SupervisorsAssignment_0_1 )* )
            // InternalSeminar.g:486:2: ( rule__Seminar__SupervisorsAssignment_0_1 )*
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsAssignment_0_1()); 
            // InternalSeminar.g:487:2: ( rule__Seminar__SupervisorsAssignment_0_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeminar.g:487:3: rule__Seminar__SupervisorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__SupervisorsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getSupervisorsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_0__1__Impl"


    // $ANTLR start "rule__Seminar__Group_0__2"
    // InternalSeminar.g:495:1: rule__Seminar__Group_0__2 : rule__Seminar__Group_0__2__Impl rule__Seminar__Group_0__3 ;
    public final void rule__Seminar__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:499:1: ( rule__Seminar__Group_0__2__Impl rule__Seminar__Group_0__3 )
            // InternalSeminar.g:500:2: rule__Seminar__Group_0__2__Impl rule__Seminar__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_0__3();

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
    // $ANTLR end "rule__Seminar__Group_0__2"


    // $ANTLR start "rule__Seminar__Group_0__2__Impl"
    // InternalSeminar.g:507:1: rule__Seminar__Group_0__2__Impl : ( ( rule__Seminar__Group_0_2__0 )* ) ;
    public final void rule__Seminar__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:511:1: ( ( ( rule__Seminar__Group_0_2__0 )* ) )
            // InternalSeminar.g:512:1: ( ( rule__Seminar__Group_0_2__0 )* )
            {
            // InternalSeminar.g:512:1: ( ( rule__Seminar__Group_0_2__0 )* )
            // InternalSeminar.g:513:2: ( rule__Seminar__Group_0_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_0_2()); 
            // InternalSeminar.g:514:2: ( rule__Seminar__Group_0_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeminar.g:514:3: rule__Seminar__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_0__2__Impl"


    // $ANTLR start "rule__Seminar__Group_0__3"
    // InternalSeminar.g:522:1: rule__Seminar__Group_0__3 : rule__Seminar__Group_0__3__Impl ;
    public final void rule__Seminar__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:526:1: ( rule__Seminar__Group_0__3__Impl )
            // InternalSeminar.g:527:2: rule__Seminar__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_0__3__Impl();

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
    // $ANTLR end "rule__Seminar__Group_0__3"


    // $ANTLR start "rule__Seminar__Group_0__3__Impl"
    // InternalSeminar.g:533:1: rule__Seminar__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:537:1: ( ( ';' ) )
            // InternalSeminar.g:538:1: ( ';' )
            {
            // InternalSeminar.g:538:1: ( ';' )
            // InternalSeminar.g:539:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_0_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSemicolonKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_0__3__Impl"


    // $ANTLR start "rule__Seminar__Group_0_2__0"
    // InternalSeminar.g:549:1: rule__Seminar__Group_0_2__0 : rule__Seminar__Group_0_2__0__Impl rule__Seminar__Group_0_2__1 ;
    public final void rule__Seminar__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:553:1: ( rule__Seminar__Group_0_2__0__Impl rule__Seminar__Group_0_2__1 )
            // InternalSeminar.g:554:2: rule__Seminar__Group_0_2__0__Impl rule__Seminar__Group_0_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_0_2__1();

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
    // $ANTLR end "rule__Seminar__Group_0_2__0"


    // $ANTLR start "rule__Seminar__Group_0_2__0__Impl"
    // InternalSeminar.g:561:1: rule__Seminar__Group_0_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:565:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:566:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:566:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:567:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:567:2: ( ( ',' ) )
            // InternalSeminar.g:568:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 
            // InternalSeminar.g:569:3: ( ',' )
            // InternalSeminar.g:569:4: ','
            {
            match(input,14,FOLLOW_9); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 

            }

            // InternalSeminar.g:572:2: ( ( ',' )* )
            // InternalSeminar.g:573:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 
            // InternalSeminar.g:574:3: ( ',' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeminar.g:574:4: ','
            	    {
            	    match(input,14,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 

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
    // $ANTLR end "rule__Seminar__Group_0_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_0_2__1"
    // InternalSeminar.g:583:1: rule__Seminar__Group_0_2__1 : rule__Seminar__Group_0_2__1__Impl ;
    public final void rule__Seminar__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:587:1: ( rule__Seminar__Group_0_2__1__Impl )
            // InternalSeminar.g:588:2: rule__Seminar__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_0_2__1__Impl();

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
    // $ANTLR end "rule__Seminar__Group_0_2__1"


    // $ANTLR start "rule__Seminar__Group_0_2__1__Impl"
    // InternalSeminar.g:594:1: rule__Seminar__Group_0_2__1__Impl : ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) ) ;
    public final void rule__Seminar__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:598:1: ( ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) ) )
            // InternalSeminar.g:599:1: ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) )
            {
            // InternalSeminar.g:599:1: ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) )
            // InternalSeminar.g:600:2: ( rule__Seminar__SupervisorsAssignment_0_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsAssignment_0_2_1()); 
            // InternalSeminar.g:601:2: ( rule__Seminar__SupervisorsAssignment_0_2_1 )
            // InternalSeminar.g:601:3: rule__Seminar__SupervisorsAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__SupervisorsAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getSupervisorsAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_0_2__1__Impl"


    // $ANTLR start "rule__Seminar__Group_1__0"
    // InternalSeminar.g:610:1: rule__Seminar__Group_1__0 : rule__Seminar__Group_1__0__Impl rule__Seminar__Group_1__1 ;
    public final void rule__Seminar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:614:1: ( rule__Seminar__Group_1__0__Impl rule__Seminar__Group_1__1 )
            // InternalSeminar.g:615:2: rule__Seminar__Group_1__0__Impl rule__Seminar__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_1__1();

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
    // $ANTLR end "rule__Seminar__Group_1__0"


    // $ANTLR start "rule__Seminar__Group_1__0__Impl"
    // InternalSeminar.g:622:1: rule__Seminar__Group_1__0__Impl : ( 'students:' ) ;
    public final void rule__Seminar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:626:1: ( ( 'students:' ) )
            // InternalSeminar.g:627:1: ( 'students:' )
            {
            // InternalSeminar.g:627:1: ( 'students:' )
            // InternalSeminar.g:628:2: 'students:'
            {
             before(grammarAccess.getSeminarAccess().getStudentsKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getStudentsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_1__0__Impl"


    // $ANTLR start "rule__Seminar__Group_1__1"
    // InternalSeminar.g:637:1: rule__Seminar__Group_1__1 : rule__Seminar__Group_1__1__Impl rule__Seminar__Group_1__2 ;
    public final void rule__Seminar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:641:1: ( rule__Seminar__Group_1__1__Impl rule__Seminar__Group_1__2 )
            // InternalSeminar.g:642:2: rule__Seminar__Group_1__1__Impl rule__Seminar__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_1__2();

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
    // $ANTLR end "rule__Seminar__Group_1__1"


    // $ANTLR start "rule__Seminar__Group_1__1__Impl"
    // InternalSeminar.g:649:1: rule__Seminar__Group_1__1__Impl : ( ( rule__Seminar__StudentsAssignment_1_1 )* ) ;
    public final void rule__Seminar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:653:1: ( ( ( rule__Seminar__StudentsAssignment_1_1 )* ) )
            // InternalSeminar.g:654:1: ( ( rule__Seminar__StudentsAssignment_1_1 )* )
            {
            // InternalSeminar.g:654:1: ( ( rule__Seminar__StudentsAssignment_1_1 )* )
            // InternalSeminar.g:655:2: ( rule__Seminar__StudentsAssignment_1_1 )*
            {
             before(grammarAccess.getSeminarAccess().getStudentsAssignment_1_1()); 
            // InternalSeminar.g:656:2: ( rule__Seminar__StudentsAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeminar.g:656:3: rule__Seminar__StudentsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__StudentsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getStudentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_1__1__Impl"


    // $ANTLR start "rule__Seminar__Group_1__2"
    // InternalSeminar.g:664:1: rule__Seminar__Group_1__2 : rule__Seminar__Group_1__2__Impl rule__Seminar__Group_1__3 ;
    public final void rule__Seminar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:668:1: ( rule__Seminar__Group_1__2__Impl rule__Seminar__Group_1__3 )
            // InternalSeminar.g:669:2: rule__Seminar__Group_1__2__Impl rule__Seminar__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_1__3();

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
    // $ANTLR end "rule__Seminar__Group_1__2"


    // $ANTLR start "rule__Seminar__Group_1__2__Impl"
    // InternalSeminar.g:676:1: rule__Seminar__Group_1__2__Impl : ( ( rule__Seminar__Group_1_2__0 )* ) ;
    public final void rule__Seminar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:680:1: ( ( ( rule__Seminar__Group_1_2__0 )* ) )
            // InternalSeminar.g:681:1: ( ( rule__Seminar__Group_1_2__0 )* )
            {
            // InternalSeminar.g:681:1: ( ( rule__Seminar__Group_1_2__0 )* )
            // InternalSeminar.g:682:2: ( rule__Seminar__Group_1_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_1_2()); 
            // InternalSeminar.g:683:2: ( rule__Seminar__Group_1_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeminar.g:683:3: rule__Seminar__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_1__2__Impl"


    // $ANTLR start "rule__Seminar__Group_1__3"
    // InternalSeminar.g:691:1: rule__Seminar__Group_1__3 : rule__Seminar__Group_1__3__Impl ;
    public final void rule__Seminar__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:695:1: ( rule__Seminar__Group_1__3__Impl )
            // InternalSeminar.g:696:2: rule__Seminar__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_1__3__Impl();

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
    // $ANTLR end "rule__Seminar__Group_1__3"


    // $ANTLR start "rule__Seminar__Group_1__3__Impl"
    // InternalSeminar.g:702:1: rule__Seminar__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:706:1: ( ( ';' ) )
            // InternalSeminar.g:707:1: ( ';' )
            {
            // InternalSeminar.g:707:1: ( ';' )
            // InternalSeminar.g:708:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_1__3__Impl"


    // $ANTLR start "rule__Seminar__Group_1_2__0"
    // InternalSeminar.g:718:1: rule__Seminar__Group_1_2__0 : rule__Seminar__Group_1_2__0__Impl rule__Seminar__Group_1_2__1 ;
    public final void rule__Seminar__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:722:1: ( rule__Seminar__Group_1_2__0__Impl rule__Seminar__Group_1_2__1 )
            // InternalSeminar.g:723:2: rule__Seminar__Group_1_2__0__Impl rule__Seminar__Group_1_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_1_2__1();

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
    // $ANTLR end "rule__Seminar__Group_1_2__0"


    // $ANTLR start "rule__Seminar__Group_1_2__0__Impl"
    // InternalSeminar.g:730:1: rule__Seminar__Group_1_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:734:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:735:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:735:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:736:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:736:2: ( ( ',' ) )
            // InternalSeminar.g:737:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 
            // InternalSeminar.g:738:3: ( ',' )
            // InternalSeminar.g:738:4: ','
            {
            match(input,14,FOLLOW_9); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 

            }

            // InternalSeminar.g:741:2: ( ( ',' )* )
            // InternalSeminar.g:742:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 
            // InternalSeminar.g:743:3: ( ',' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeminar.g:743:4: ','
            	    {
            	    match(input,14,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Seminar__Group_1_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_1_2__1"
    // InternalSeminar.g:752:1: rule__Seminar__Group_1_2__1 : rule__Seminar__Group_1_2__1__Impl ;
    public final void rule__Seminar__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:756:1: ( rule__Seminar__Group_1_2__1__Impl )
            // InternalSeminar.g:757:2: rule__Seminar__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Seminar__Group_1_2__1"


    // $ANTLR start "rule__Seminar__Group_1_2__1__Impl"
    // InternalSeminar.g:763:1: rule__Seminar__Group_1_2__1__Impl : ( ( rule__Seminar__StudentsAssignment_1_2_1 ) ) ;
    public final void rule__Seminar__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:767:1: ( ( ( rule__Seminar__StudentsAssignment_1_2_1 ) ) )
            // InternalSeminar.g:768:1: ( ( rule__Seminar__StudentsAssignment_1_2_1 ) )
            {
            // InternalSeminar.g:768:1: ( ( rule__Seminar__StudentsAssignment_1_2_1 ) )
            // InternalSeminar.g:769:2: ( rule__Seminar__StudentsAssignment_1_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getStudentsAssignment_1_2_1()); 
            // InternalSeminar.g:770:2: ( rule__Seminar__StudentsAssignment_1_2_1 )
            // InternalSeminar.g:770:3: rule__Seminar__StudentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__StudentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getStudentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_1_2__1__Impl"


    // $ANTLR start "rule__Seminar__Group_2__0"
    // InternalSeminar.g:779:1: rule__Seminar__Group_2__0 : rule__Seminar__Group_2__0__Impl rule__Seminar__Group_2__1 ;
    public final void rule__Seminar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:783:1: ( rule__Seminar__Group_2__0__Impl rule__Seminar__Group_2__1 )
            // InternalSeminar.g:784:2: rule__Seminar__Group_2__0__Impl rule__Seminar__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_2__1();

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
    // $ANTLR end "rule__Seminar__Group_2__0"


    // $ANTLR start "rule__Seminar__Group_2__0__Impl"
    // InternalSeminar.g:791:1: rule__Seminar__Group_2__0__Impl : ( 'topics:' ) ;
    public final void rule__Seminar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:795:1: ( ( 'topics:' ) )
            // InternalSeminar.g:796:1: ( 'topics:' )
            {
            // InternalSeminar.g:796:1: ( 'topics:' )
            // InternalSeminar.g:797:2: 'topics:'
            {
             before(grammarAccess.getSeminarAccess().getTopicsKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getTopicsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_2__1"
    // InternalSeminar.g:806:1: rule__Seminar__Group_2__1 : rule__Seminar__Group_2__1__Impl rule__Seminar__Group_2__2 ;
    public final void rule__Seminar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:810:1: ( rule__Seminar__Group_2__1__Impl rule__Seminar__Group_2__2 )
            // InternalSeminar.g:811:2: rule__Seminar__Group_2__1__Impl rule__Seminar__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_2__2();

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
    // $ANTLR end "rule__Seminar__Group_2__1"


    // $ANTLR start "rule__Seminar__Group_2__1__Impl"
    // InternalSeminar.g:818:1: rule__Seminar__Group_2__1__Impl : ( ( rule__Seminar__TopicsAssignment_2_1 )* ) ;
    public final void rule__Seminar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:822:1: ( ( ( rule__Seminar__TopicsAssignment_2_1 )* ) )
            // InternalSeminar.g:823:1: ( ( rule__Seminar__TopicsAssignment_2_1 )* )
            {
            // InternalSeminar.g:823:1: ( ( rule__Seminar__TopicsAssignment_2_1 )* )
            // InternalSeminar.g:824:2: ( rule__Seminar__TopicsAssignment_2_1 )*
            {
             before(grammarAccess.getSeminarAccess().getTopicsAssignment_2_1()); 
            // InternalSeminar.g:825:2: ( rule__Seminar__TopicsAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeminar.g:825:3: rule__Seminar__TopicsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__TopicsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getTopicsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_2__1__Impl"


    // $ANTLR start "rule__Seminar__Group_2__2"
    // InternalSeminar.g:833:1: rule__Seminar__Group_2__2 : rule__Seminar__Group_2__2__Impl rule__Seminar__Group_2__3 ;
    public final void rule__Seminar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:837:1: ( rule__Seminar__Group_2__2__Impl rule__Seminar__Group_2__3 )
            // InternalSeminar.g:838:2: rule__Seminar__Group_2__2__Impl rule__Seminar__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Seminar__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_2__3();

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
    // $ANTLR end "rule__Seminar__Group_2__2"


    // $ANTLR start "rule__Seminar__Group_2__2__Impl"
    // InternalSeminar.g:845:1: rule__Seminar__Group_2__2__Impl : ( ( rule__Seminar__Group_2_2__0 )* ) ;
    public final void rule__Seminar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:849:1: ( ( ( rule__Seminar__Group_2_2__0 )* ) )
            // InternalSeminar.g:850:1: ( ( rule__Seminar__Group_2_2__0 )* )
            {
            // InternalSeminar.g:850:1: ( ( rule__Seminar__Group_2_2__0 )* )
            // InternalSeminar.g:851:2: ( rule__Seminar__Group_2_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_2_2()); 
            // InternalSeminar.g:852:2: ( rule__Seminar__Group_2_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeminar.g:852:3: rule__Seminar__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_2__2__Impl"


    // $ANTLR start "rule__Seminar__Group_2__3"
    // InternalSeminar.g:860:1: rule__Seminar__Group_2__3 : rule__Seminar__Group_2__3__Impl ;
    public final void rule__Seminar__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:864:1: ( rule__Seminar__Group_2__3__Impl )
            // InternalSeminar.g:865:2: rule__Seminar__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_2__3__Impl();

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
    // $ANTLR end "rule__Seminar__Group_2__3"


    // $ANTLR start "rule__Seminar__Group_2__3__Impl"
    // InternalSeminar.g:871:1: rule__Seminar__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:875:1: ( ( ';' ) )
            // InternalSeminar.g:876:1: ( ';' )
            {
            // InternalSeminar.g:876:1: ( ';' )
            // InternalSeminar.g:877:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_2_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSeminarAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_2__3__Impl"


    // $ANTLR start "rule__Seminar__Group_2_2__0"
    // InternalSeminar.g:887:1: rule__Seminar__Group_2_2__0 : rule__Seminar__Group_2_2__0__Impl rule__Seminar__Group_2_2__1 ;
    public final void rule__Seminar__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:891:1: ( rule__Seminar__Group_2_2__0__Impl rule__Seminar__Group_2_2__1 )
            // InternalSeminar.g:892:2: rule__Seminar__Group_2_2__0__Impl rule__Seminar__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Seminar__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Seminar__Group_2_2__1();

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
    // $ANTLR end "rule__Seminar__Group_2_2__0"


    // $ANTLR start "rule__Seminar__Group_2_2__0__Impl"
    // InternalSeminar.g:899:1: rule__Seminar__Group_2_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:903:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:904:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:904:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:905:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:905:2: ( ( ',' ) )
            // InternalSeminar.g:906:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 
            // InternalSeminar.g:907:3: ( ',' )
            // InternalSeminar.g:907:4: ','
            {
            match(input,14,FOLLOW_9); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 

            }

            // InternalSeminar.g:910:2: ( ( ',' )* )
            // InternalSeminar.g:911:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 
            // InternalSeminar.g:912:3: ( ',' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeminar.g:912:4: ','
            	    {
            	    match(input,14,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Seminar__Group_2_2__0__Impl"


    // $ANTLR start "rule__Seminar__Group_2_2__1"
    // InternalSeminar.g:921:1: rule__Seminar__Group_2_2__1 : rule__Seminar__Group_2_2__1__Impl ;
    public final void rule__Seminar__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:925:1: ( rule__Seminar__Group_2_2__1__Impl )
            // InternalSeminar.g:926:2: rule__Seminar__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Seminar__Group_2_2__1"


    // $ANTLR start "rule__Seminar__Group_2_2__1__Impl"
    // InternalSeminar.g:932:1: rule__Seminar__Group_2_2__1__Impl : ( ( rule__Seminar__TopicsAssignment_2_2_1 ) ) ;
    public final void rule__Seminar__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:936:1: ( ( ( rule__Seminar__TopicsAssignment_2_2_1 ) ) )
            // InternalSeminar.g:937:1: ( ( rule__Seminar__TopicsAssignment_2_2_1 ) )
            {
            // InternalSeminar.g:937:1: ( ( rule__Seminar__TopicsAssignment_2_2_1 ) )
            // InternalSeminar.g:938:2: ( rule__Seminar__TopicsAssignment_2_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getTopicsAssignment_2_2_1()); 
            // InternalSeminar.g:939:2: ( rule__Seminar__TopicsAssignment_2_2_1 )
            // InternalSeminar.g:939:3: rule__Seminar__TopicsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__TopicsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getTopicsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__Group_2_2__1__Impl"


    // $ANTLR start "rule__Preference__Group__0"
    // InternalSeminar.g:948:1: rule__Preference__Group__0 : rule__Preference__Group__0__Impl rule__Preference__Group__1 ;
    public final void rule__Preference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:952:1: ( rule__Preference__Group__0__Impl rule__Preference__Group__1 )
            // InternalSeminar.g:953:2: rule__Preference__Group__0__Impl rule__Preference__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeminar.g:960:1: rule__Preference__Group__0__Impl : ( ( rule__Preference__StudentAssignment_0 ) ) ;
    public final void rule__Preference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:964:1: ( ( ( rule__Preference__StudentAssignment_0 ) ) )
            // InternalSeminar.g:965:1: ( ( rule__Preference__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:965:1: ( ( rule__Preference__StudentAssignment_0 ) )
            // InternalSeminar.g:966:2: ( rule__Preference__StudentAssignment_0 )
            {
             before(grammarAccess.getPreferenceAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:967:2: ( rule__Preference__StudentAssignment_0 )
            // InternalSeminar.g:967:3: rule__Preference__StudentAssignment_0
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
    // InternalSeminar.g:975:1: rule__Preference__Group__1 : rule__Preference__Group__1__Impl rule__Preference__Group__2 ;
    public final void rule__Preference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:979:1: ( rule__Preference__Group__1__Impl rule__Preference__Group__2 )
            // InternalSeminar.g:980:2: rule__Preference__Group__1__Impl rule__Preference__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeminar.g:987:1: rule__Preference__Group__1__Impl : ( 'likes' ) ;
    public final void rule__Preference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:991:1: ( ( 'likes' ) )
            // InternalSeminar.g:992:1: ( 'likes' )
            {
            // InternalSeminar.g:992:1: ( 'likes' )
            // InternalSeminar.g:993:2: 'likes'
            {
             before(grammarAccess.getPreferenceAccess().getLikesKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getLikesKeyword_1()); 

            }


            }

        }
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
    // InternalSeminar.g:1002:1: rule__Preference__Group__2 : rule__Preference__Group__2__Impl rule__Preference__Group__3 ;
    public final void rule__Preference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1006:1: ( rule__Preference__Group__2__Impl rule__Preference__Group__3 )
            // InternalSeminar.g:1007:2: rule__Preference__Group__2__Impl rule__Preference__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeminar.g:1014:1: rule__Preference__Group__2__Impl : ( ( rule__Preference__TopicsAssignment_2 ) ) ;
    public final void rule__Preference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1018:1: ( ( ( rule__Preference__TopicsAssignment_2 ) ) )
            // InternalSeminar.g:1019:1: ( ( rule__Preference__TopicsAssignment_2 ) )
            {
            // InternalSeminar.g:1019:1: ( ( rule__Preference__TopicsAssignment_2 ) )
            // InternalSeminar.g:1020:2: ( rule__Preference__TopicsAssignment_2 )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsAssignment_2()); 
            // InternalSeminar.g:1021:2: ( rule__Preference__TopicsAssignment_2 )
            // InternalSeminar.g:1021:3: rule__Preference__TopicsAssignment_2
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
    // InternalSeminar.g:1029:1: rule__Preference__Group__3 : rule__Preference__Group__3__Impl rule__Preference__Group__4 ;
    public final void rule__Preference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1033:1: ( rule__Preference__Group__3__Impl rule__Preference__Group__4 )
            // InternalSeminar.g:1034:2: rule__Preference__Group__3__Impl rule__Preference__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeminar.g:1041:1: rule__Preference__Group__3__Impl : ( ( rule__Preference__Group_3__0 )* ) ;
    public final void rule__Preference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1045:1: ( ( ( rule__Preference__Group_3__0 )* ) )
            // InternalSeminar.g:1046:1: ( ( rule__Preference__Group_3__0 )* )
            {
            // InternalSeminar.g:1046:1: ( ( rule__Preference__Group_3__0 )* )
            // InternalSeminar.g:1047:2: ( rule__Preference__Group_3__0 )*
            {
             before(grammarAccess.getPreferenceAccess().getGroup_3()); 
            // InternalSeminar.g:1048:2: ( rule__Preference__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeminar.g:1048:3: rule__Preference__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalSeminar.g:1056:1: rule__Preference__Group__4 : rule__Preference__Group__4__Impl ;
    public final void rule__Preference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1060:1: ( rule__Preference__Group__4__Impl )
            // InternalSeminar.g:1061:2: rule__Preference__Group__4__Impl
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
    // InternalSeminar.g:1067:1: rule__Preference__Group__4__Impl : ( ';' ) ;
    public final void rule__Preference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1071:1: ( ( ';' ) )
            // InternalSeminar.g:1072:1: ( ';' )
            {
            // InternalSeminar.g:1072:1: ( ';' )
            // InternalSeminar.g:1073:2: ';'
            {
             before(grammarAccess.getPreferenceAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSeminar.g:1083:1: rule__Preference__Group_3__0 : rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1 ;
    public final void rule__Preference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1087:1: ( rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1 )
            // InternalSeminar.g:1088:2: rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeminar.g:1095:1: rule__Preference__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Preference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1099:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:1100:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:1100:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:1101:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:1101:2: ( ( ',' ) )
            // InternalSeminar.g:1102:3: ( ',' )
            {
             before(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 
            // InternalSeminar.g:1103:3: ( ',' )
            // InternalSeminar.g:1103:4: ','
            {
            match(input,14,FOLLOW_9); 

            }

             after(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 

            }

            // InternalSeminar.g:1106:2: ( ( ',' )* )
            // InternalSeminar.g:1107:3: ( ',' )*
            {
             before(grammarAccess.getPreferenceAccess().getCommaKeyword_3_0()); 
            // InternalSeminar.g:1108:3: ( ',' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSeminar.g:1108:4: ','
            	    {
            	    match(input,14,FOLLOW_9); 

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
    // InternalSeminar.g:1117:1: rule__Preference__Group_3__1 : rule__Preference__Group_3__1__Impl ;
    public final void rule__Preference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1121:1: ( rule__Preference__Group_3__1__Impl )
            // InternalSeminar.g:1122:2: rule__Preference__Group_3__1__Impl
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
    // InternalSeminar.g:1128:1: rule__Preference__Group_3__1__Impl : ( ( rule__Preference__TopicsAssignment_3_1 ) ) ;
    public final void rule__Preference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1132:1: ( ( ( rule__Preference__TopicsAssignment_3_1 ) ) )
            // InternalSeminar.g:1133:1: ( ( rule__Preference__TopicsAssignment_3_1 ) )
            {
            // InternalSeminar.g:1133:1: ( ( rule__Preference__TopicsAssignment_3_1 ) )
            // InternalSeminar.g:1134:2: ( rule__Preference__TopicsAssignment_3_1 )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsAssignment_3_1()); 
            // InternalSeminar.g:1135:2: ( rule__Preference__TopicsAssignment_3_1 )
            // InternalSeminar.g:1135:3: rule__Preference__TopicsAssignment_3_1
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
    // InternalSeminar.g:1144:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1148:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalSeminar.g:1149:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeminar.g:1156:1: rule__Rating__Group__0__Impl : ( ( rule__Rating__StudentAssignment_0 ) ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1160:1: ( ( ( rule__Rating__StudentAssignment_0 ) ) )
            // InternalSeminar.g:1161:1: ( ( rule__Rating__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:1161:1: ( ( rule__Rating__StudentAssignment_0 ) )
            // InternalSeminar.g:1162:2: ( rule__Rating__StudentAssignment_0 )
            {
             before(grammarAccess.getRatingAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:1163:2: ( rule__Rating__StudentAssignment_0 )
            // InternalSeminar.g:1163:3: rule__Rating__StudentAssignment_0
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
    // InternalSeminar.g:1171:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1175:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalSeminar.g:1176:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeminar.g:1183:1: rule__Rating__Group__1__Impl : ( 'rates' ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1187:1: ( ( 'rates' ) )
            // InternalSeminar.g:1188:1: ( 'rates' )
            {
            // InternalSeminar.g:1188:1: ( 'rates' )
            // InternalSeminar.g:1189:2: 'rates'
            {
             before(grammarAccess.getRatingAccess().getRatesKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSeminar.g:1198:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1202:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalSeminar.g:1203:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeminar.g:1210:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__TopicAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1214:1: ( ( ( rule__Rating__TopicAssignment_2 ) ) )
            // InternalSeminar.g:1215:1: ( ( rule__Rating__TopicAssignment_2 ) )
            {
            // InternalSeminar.g:1215:1: ( ( rule__Rating__TopicAssignment_2 ) )
            // InternalSeminar.g:1216:2: ( rule__Rating__TopicAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getTopicAssignment_2()); 
            // InternalSeminar.g:1217:2: ( rule__Rating__TopicAssignment_2 )
            // InternalSeminar.g:1217:3: rule__Rating__TopicAssignment_2
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
    // InternalSeminar.g:1225:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1229:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalSeminar.g:1230:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSeminar.g:1237:1: rule__Rating__Group__3__Impl : ( 'with' ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1241:1: ( ( 'with' ) )
            // InternalSeminar.g:1242:1: ( 'with' )
            {
            // InternalSeminar.g:1242:1: ( 'with' )
            // InternalSeminar.g:1243:2: 'with'
            {
             before(grammarAccess.getRatingAccess().getWithKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSeminar.g:1252:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl rule__Rating__Group__5 ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1256:1: ( rule__Rating__Group__4__Impl rule__Rating__Group__5 )
            // InternalSeminar.g:1257:2: rule__Rating__Group__4__Impl rule__Rating__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeminar.g:1264:1: rule__Rating__Group__4__Impl : ( ( rule__Rating__RatingAssignment_4 ) ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1268:1: ( ( ( rule__Rating__RatingAssignment_4 ) ) )
            // InternalSeminar.g:1269:1: ( ( rule__Rating__RatingAssignment_4 ) )
            {
            // InternalSeminar.g:1269:1: ( ( rule__Rating__RatingAssignment_4 ) )
            // InternalSeminar.g:1270:2: ( rule__Rating__RatingAssignment_4 )
            {
             before(grammarAccess.getRatingAccess().getRatingAssignment_4()); 
            // InternalSeminar.g:1271:2: ( rule__Rating__RatingAssignment_4 )
            // InternalSeminar.g:1271:3: rule__Rating__RatingAssignment_4
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
    // InternalSeminar.g:1279:1: rule__Rating__Group__5 : rule__Rating__Group__5__Impl ;
    public final void rule__Rating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1283:1: ( rule__Rating__Group__5__Impl )
            // InternalSeminar.g:1284:2: rule__Rating__Group__5__Impl
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
    // InternalSeminar.g:1290:1: rule__Rating__Group__5__Impl : ( ';' ) ;
    public final void rule__Rating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1294:1: ( ( ';' ) )
            // InternalSeminar.g:1295:1: ( ';' )
            {
            // InternalSeminar.g:1295:1: ( ';' )
            // InternalSeminar.g:1296:2: ';'
            {
             before(grammarAccess.getRatingAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSeminar.g:1306:1: rule__Supervise__Group__0 : rule__Supervise__Group__0__Impl rule__Supervise__Group__1 ;
    public final void rule__Supervise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1310:1: ( rule__Supervise__Group__0__Impl rule__Supervise__Group__1 )
            // InternalSeminar.g:1311:2: rule__Supervise__Group__0__Impl rule__Supervise__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSeminar.g:1318:1: rule__Supervise__Group__0__Impl : ( ( rule__Supervise__SupervisorAssignment_0 ) ) ;
    public final void rule__Supervise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1322:1: ( ( ( rule__Supervise__SupervisorAssignment_0 ) ) )
            // InternalSeminar.g:1323:1: ( ( rule__Supervise__SupervisorAssignment_0 ) )
            {
            // InternalSeminar.g:1323:1: ( ( rule__Supervise__SupervisorAssignment_0 ) )
            // InternalSeminar.g:1324:2: ( rule__Supervise__SupervisorAssignment_0 )
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorAssignment_0()); 
            // InternalSeminar.g:1325:2: ( rule__Supervise__SupervisorAssignment_0 )
            // InternalSeminar.g:1325:3: rule__Supervise__SupervisorAssignment_0
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
    // InternalSeminar.g:1333:1: rule__Supervise__Group__1 : rule__Supervise__Group__1__Impl rule__Supervise__Group__2 ;
    public final void rule__Supervise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1337:1: ( rule__Supervise__Group__1__Impl rule__Supervise__Group__2 )
            // InternalSeminar.g:1338:2: rule__Supervise__Group__1__Impl rule__Supervise__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeminar.g:1345:1: rule__Supervise__Group__1__Impl : ( 'supervises' ) ;
    public final void rule__Supervise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1349:1: ( ( 'supervises' ) )
            // InternalSeminar.g:1350:1: ( 'supervises' )
            {
            // InternalSeminar.g:1350:1: ( 'supervises' )
            // InternalSeminar.g:1351:2: 'supervises'
            {
             before(grammarAccess.getSuperviseAccess().getSupervisesKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSeminar.g:1360:1: rule__Supervise__Group__2 : rule__Supervise__Group__2__Impl rule__Supervise__Group__3 ;
    public final void rule__Supervise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1364:1: ( rule__Supervise__Group__2__Impl rule__Supervise__Group__3 )
            // InternalSeminar.g:1365:2: rule__Supervise__Group__2__Impl rule__Supervise__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeminar.g:1372:1: rule__Supervise__Group__2__Impl : ( ( rule__Supervise__TopicAssignment_2 ) ) ;
    public final void rule__Supervise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1376:1: ( ( ( rule__Supervise__TopicAssignment_2 ) ) )
            // InternalSeminar.g:1377:1: ( ( rule__Supervise__TopicAssignment_2 ) )
            {
            // InternalSeminar.g:1377:1: ( ( rule__Supervise__TopicAssignment_2 ) )
            // InternalSeminar.g:1378:2: ( rule__Supervise__TopicAssignment_2 )
            {
             before(grammarAccess.getSuperviseAccess().getTopicAssignment_2()); 
            // InternalSeminar.g:1379:2: ( rule__Supervise__TopicAssignment_2 )
            // InternalSeminar.g:1379:3: rule__Supervise__TopicAssignment_2
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
    // InternalSeminar.g:1387:1: rule__Supervise__Group__3 : rule__Supervise__Group__3__Impl ;
    public final void rule__Supervise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1391:1: ( rule__Supervise__Group__3__Impl )
            // InternalSeminar.g:1392:2: rule__Supervise__Group__3__Impl
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
    // InternalSeminar.g:1398:1: rule__Supervise__Group__3__Impl : ( ';' ) ;
    public final void rule__Supervise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1402:1: ( ( ';' ) )
            // InternalSeminar.g:1403:1: ( ';' )
            {
            // InternalSeminar.g:1403:1: ( ';' )
            // InternalSeminar.g:1404:2: ';'
            {
             before(grammarAccess.getSuperviseAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSeminar.g:1414:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1418:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalSeminar.g:1419:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSeminar.g:1426:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__StudentAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1430:1: ( ( ( rule__Assignment__StudentAssignment_0 ) ) )
            // InternalSeminar.g:1431:1: ( ( rule__Assignment__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:1431:1: ( ( rule__Assignment__StudentAssignment_0 ) )
            // InternalSeminar.g:1432:2: ( rule__Assignment__StudentAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:1433:2: ( rule__Assignment__StudentAssignment_0 )
            // InternalSeminar.g:1433:3: rule__Assignment__StudentAssignment_0
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
    // InternalSeminar.g:1441:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1445:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalSeminar.g:1446:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeminar.g:1453:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1457:1: ( ( 'is' ) )
            // InternalSeminar.g:1458:1: ( 'is' )
            {
            // InternalSeminar.g:1458:1: ( 'is' )
            // InternalSeminar.g:1459:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSeminar.g:1468:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1472:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalSeminar.g:1473:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSeminar.g:1480:1: rule__Assignment__Group__2__Impl : ( 'assigned' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1484:1: ( ( 'assigned' ) )
            // InternalSeminar.g:1485:1: ( 'assigned' )
            {
            // InternalSeminar.g:1485:1: ( 'assigned' )
            // InternalSeminar.g:1486:2: 'assigned'
            {
             before(grammarAccess.getAssignmentAccess().getAssignedKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSeminar.g:1495:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1499:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalSeminar.g:1500:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeminar.g:1507:1: rule__Assignment__Group__3__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1511:1: ( ( 'to' ) )
            // InternalSeminar.g:1512:1: ( 'to' )
            {
            // InternalSeminar.g:1512:1: ( 'to' )
            // InternalSeminar.g:1513:2: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSeminar.g:1522:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1526:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalSeminar.g:1527:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeminar.g:1534:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__TopicAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1538:1: ( ( ( rule__Assignment__TopicAssignment_4 ) ) )
            // InternalSeminar.g:1539:1: ( ( rule__Assignment__TopicAssignment_4 ) )
            {
            // InternalSeminar.g:1539:1: ( ( rule__Assignment__TopicAssignment_4 ) )
            // InternalSeminar.g:1540:2: ( rule__Assignment__TopicAssignment_4 )
            {
             before(grammarAccess.getAssignmentAccess().getTopicAssignment_4()); 
            // InternalSeminar.g:1541:2: ( rule__Assignment__TopicAssignment_4 )
            // InternalSeminar.g:1541:3: rule__Assignment__TopicAssignment_4
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
    // InternalSeminar.g:1549:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1553:1: ( rule__Assignment__Group__5__Impl )
            // InternalSeminar.g:1554:2: rule__Assignment__Group__5__Impl
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
    // InternalSeminar.g:1560:1: rule__Assignment__Group__5__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1564:1: ( ( ';' ) )
            // InternalSeminar.g:1565:1: ( ';' )
            {
            // InternalSeminar.g:1565:1: ( ';' )
            // InternalSeminar.g:1566:2: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Seminar__SupervisorsAssignment_0_1"
    // InternalSeminar.g:1576:1: rule__Seminar__SupervisorsAssignment_0_1 : ( ruleSupervisor ) ;
    public final void rule__Seminar__SupervisorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1580:1: ( ( ruleSupervisor ) )
            // InternalSeminar.g:1581:2: ( ruleSupervisor )
            {
            // InternalSeminar.g:1581:2: ( ruleSupervisor )
            // InternalSeminar.g:1582:3: ruleSupervisor
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervisor();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisorsAssignment_0_1"


    // $ANTLR start "rule__Seminar__SupervisorsAssignment_0_2_1"
    // InternalSeminar.g:1591:1: rule__Seminar__SupervisorsAssignment_0_2_1 : ( ruleSupervisor ) ;
    public final void rule__Seminar__SupervisorsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1595:1: ( ( ruleSupervisor ) )
            // InternalSeminar.g:1596:2: ( ruleSupervisor )
            {
            // InternalSeminar.g:1596:2: ( ruleSupervisor )
            // InternalSeminar.g:1597:3: ruleSupervisor
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervisor();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisorsSupervisorParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisorsAssignment_0_2_1"


    // $ANTLR start "rule__Seminar__StudentsAssignment_1_1"
    // InternalSeminar.g:1606:1: rule__Seminar__StudentsAssignment_1_1 : ( ruleStudent ) ;
    public final void rule__Seminar__StudentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1610:1: ( ( ruleStudent ) )
            // InternalSeminar.g:1611:2: ( ruleStudent )
            {
            // InternalSeminar.g:1611:2: ( ruleStudent )
            // InternalSeminar.g:1612:3: ruleStudent
            {
             before(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__StudentsAssignment_1_1"


    // $ANTLR start "rule__Seminar__StudentsAssignment_1_2_1"
    // InternalSeminar.g:1621:1: rule__Seminar__StudentsAssignment_1_2_1 : ( ruleStudent ) ;
    public final void rule__Seminar__StudentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1625:1: ( ( ruleStudent ) )
            // InternalSeminar.g:1626:2: ( ruleStudent )
            {
            // InternalSeminar.g:1626:2: ( ruleStudent )
            // InternalSeminar.g:1627:3: ruleStudent
            {
             before(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getStudentsStudentParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__StudentsAssignment_1_2_1"


    // $ANTLR start "rule__Seminar__TopicsAssignment_2_1"
    // InternalSeminar.g:1636:1: rule__Seminar__TopicsAssignment_2_1 : ( ruleTopic ) ;
    public final void rule__Seminar__TopicsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1640:1: ( ( ruleTopic ) )
            // InternalSeminar.g:1641:2: ( ruleTopic )
            {
            // InternalSeminar.g:1641:2: ( ruleTopic )
            // InternalSeminar.g:1642:3: ruleTopic
            {
             before(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__TopicsAssignment_2_1"


    // $ANTLR start "rule__Seminar__TopicsAssignment_2_2_1"
    // InternalSeminar.g:1651:1: rule__Seminar__TopicsAssignment_2_2_1 : ( ruleTopic ) ;
    public final void rule__Seminar__TopicsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1655:1: ( ( ruleTopic ) )
            // InternalSeminar.g:1656:2: ( ruleTopic )
            {
            // InternalSeminar.g:1656:2: ( ruleTopic )
            // InternalSeminar.g:1657:3: ruleTopic
            {
             before(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getTopicsTopicParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__TopicsAssignment_2_2_1"


    // $ANTLR start "rule__Seminar__PreferencesAssignment_3"
    // InternalSeminar.g:1666:1: rule__Seminar__PreferencesAssignment_3 : ( rulePreference ) ;
    public final void rule__Seminar__PreferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1670:1: ( ( rulePreference ) )
            // InternalSeminar.g:1671:2: ( rulePreference )
            {
            // InternalSeminar.g:1671:2: ( rulePreference )
            // InternalSeminar.g:1672:3: rulePreference
            {
             before(grammarAccess.getSeminarAccess().getPreferencesPreferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePreference();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getPreferencesPreferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__PreferencesAssignment_3"


    // $ANTLR start "rule__Seminar__RatingsAssignment_4"
    // InternalSeminar.g:1681:1: rule__Seminar__RatingsAssignment_4 : ( ruleRating ) ;
    public final void rule__Seminar__RatingsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1685:1: ( ( ruleRating ) )
            // InternalSeminar.g:1686:2: ( ruleRating )
            {
            // InternalSeminar.g:1686:2: ( ruleRating )
            // InternalSeminar.g:1687:3: ruleRating
            {
             before(grammarAccess.getSeminarAccess().getRatingsRatingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getRatingsRatingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__RatingsAssignment_4"


    // $ANTLR start "rule__Seminar__SupervisesAssignment_5"
    // InternalSeminar.g:1696:1: rule__Seminar__SupervisesAssignment_5 : ( ruleSupervise ) ;
    public final void rule__Seminar__SupervisesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1700:1: ( ( ruleSupervise ) )
            // InternalSeminar.g:1701:2: ( ruleSupervise )
            {
            // InternalSeminar.g:1701:2: ( ruleSupervise )
            // InternalSeminar.g:1702:3: ruleSupervise
            {
             before(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervise();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisesAssignment_5"


    // $ANTLR start "rule__Seminar__AssignmentsAssignment_6"
    // InternalSeminar.g:1711:1: rule__Seminar__AssignmentsAssignment_6 : ( ruleAssignment ) ;
    public final void rule__Seminar__AssignmentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1715:1: ( ( ruleAssignment ) )
            // InternalSeminar.g:1716:2: ( ruleAssignment )
            {
            // InternalSeminar.g:1716:2: ( ruleAssignment )
            // InternalSeminar.g:1717:3: ruleAssignment
            {
             before(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__AssignmentsAssignment_6"


    // $ANTLR start "rule__Supervisor__NameAssignment"
    // InternalSeminar.g:1726:1: rule__Supervisor__NameAssignment : ( RULE_ID ) ;
    public final void rule__Supervisor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1730:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1731:2: ( RULE_ID )
            {
            // InternalSeminar.g:1731:2: ( RULE_ID )
            // InternalSeminar.g:1732:3: RULE_ID
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
    // InternalSeminar.g:1741:1: rule__Student__NameAssignment : ( RULE_ID ) ;
    public final void rule__Student__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1745:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1746:2: ( RULE_ID )
            {
            // InternalSeminar.g:1746:2: ( RULE_ID )
            // InternalSeminar.g:1747:3: RULE_ID
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
    // InternalSeminar.g:1756:1: rule__Topic__NameAssignment : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1760:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1761:2: ( RULE_ID )
            {
            // InternalSeminar.g:1761:2: ( RULE_ID )
            // InternalSeminar.g:1762:3: RULE_ID
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
    // InternalSeminar.g:1771:1: rule__Preference__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1775:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1776:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1776:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1777:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1778:3: ( RULE_ID )
            // InternalSeminar.g:1779:4: RULE_ID
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
    // InternalSeminar.g:1790:1: rule__Preference__TopicsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__TopicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1794:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1795:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1795:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1796:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_2_0()); 
            // InternalSeminar.g:1797:3: ( RULE_ID )
            // InternalSeminar.g:1798:4: RULE_ID
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
    // InternalSeminar.g:1809:1: rule__Preference__TopicsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__TopicsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1813:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1814:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1814:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1815:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getTopicsTopicCrossReference_3_1_0()); 
            // InternalSeminar.g:1816:3: ( RULE_ID )
            // InternalSeminar.g:1817:4: RULE_ID
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
    // InternalSeminar.g:1828:1: rule__Rating__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1832:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1833:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1833:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1834:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1835:3: ( RULE_ID )
            // InternalSeminar.g:1836:4: RULE_ID
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
    // InternalSeminar.g:1847:1: rule__Rating__TopicAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__TopicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1851:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1852:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1852:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1853:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getTopicTopicCrossReference_2_0()); 
            // InternalSeminar.g:1854:3: ( RULE_ID )
            // InternalSeminar.g:1855:4: RULE_ID
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
    // InternalSeminar.g:1866:1: rule__Rating__RatingAssignment_4 : ( RULE_REAL ) ;
    public final void rule__Rating__RatingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1870:1: ( ( RULE_REAL ) )
            // InternalSeminar.g:1871:2: ( RULE_REAL )
            {
            // InternalSeminar.g:1871:2: ( RULE_REAL )
            // InternalSeminar.g:1872:3: RULE_REAL
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
    // InternalSeminar.g:1881:1: rule__Supervise__SupervisorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Supervise__SupervisorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1885:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1886:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1886:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1887:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorSupervisorCrossReference_0_0()); 
            // InternalSeminar.g:1888:3: ( RULE_ID )
            // InternalSeminar.g:1889:4: RULE_ID
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
    // InternalSeminar.g:1900:1: rule__Supervise__TopicAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Supervise__TopicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1904:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1905:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1905:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1906:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperviseAccess().getTopicTopicCrossReference_2_0()); 
            // InternalSeminar.g:1907:3: ( RULE_ID )
            // InternalSeminar.g:1908:4: RULE_ID
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
    // InternalSeminar.g:1919:1: rule__Assignment__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1923:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1924:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1924:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1925:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1926:3: ( RULE_ID )
            // InternalSeminar.g:1927:4: RULE_ID
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
    // InternalSeminar.g:1938:1: rule__Assignment__TopicAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TopicAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1942:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1943:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1943:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1944:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTopicTopicCrossReference_4_0()); 
            // InternalSeminar.g:1945:3: ( RULE_ID )
            // InternalSeminar.g:1946:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});

}