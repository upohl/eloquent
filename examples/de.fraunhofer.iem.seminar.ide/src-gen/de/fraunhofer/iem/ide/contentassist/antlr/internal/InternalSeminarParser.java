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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'supervisors:'", "';'", "','", "'students:'", "'topics:'", "'prefers'", "'supervises'", "'is'", "'assigned'", "'to'"
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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


    // $ANTLR start "entryRuleSupervise"
    // InternalSeminar.g:178:1: entryRuleSupervise : ruleSupervise EOF ;
    public final void entryRuleSupervise() throws RecognitionException {
        try {
            // InternalSeminar.g:179:1: ( ruleSupervise EOF )
            // InternalSeminar.g:180:1: ruleSupervise EOF
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
    // InternalSeminar.g:187:1: ruleSupervise : ( ( rule__Supervise__Group__0 ) ) ;
    public final void ruleSupervise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:191:2: ( ( ( rule__Supervise__Group__0 ) ) )
            // InternalSeminar.g:192:2: ( ( rule__Supervise__Group__0 ) )
            {
            // InternalSeminar.g:192:2: ( ( rule__Supervise__Group__0 ) )
            // InternalSeminar.g:193:3: ( rule__Supervise__Group__0 )
            {
             before(grammarAccess.getSuperviseAccess().getGroup()); 
            // InternalSeminar.g:194:3: ( rule__Supervise__Group__0 )
            // InternalSeminar.g:194:4: rule__Supervise__Group__0
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
    // InternalSeminar.g:203:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalSeminar.g:204:1: ( ruleAssignment EOF )
            // InternalSeminar.g:205:1: ruleAssignment EOF
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
    // InternalSeminar.g:212:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:216:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalSeminar.g:217:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalSeminar.g:217:2: ( ( rule__Assignment__Group__0 ) )
            // InternalSeminar.g:218:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalSeminar.g:219:3: ( rule__Assignment__Group__0 )
            // InternalSeminar.g:219:4: rule__Assignment__Group__0
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
    // InternalSeminar.g:227:1: rule__Seminar__Group__0 : rule__Seminar__Group__0__Impl rule__Seminar__Group__1 ;
    public final void rule__Seminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:231:1: ( rule__Seminar__Group__0__Impl rule__Seminar__Group__1 )
            // InternalSeminar.g:232:2: rule__Seminar__Group__0__Impl rule__Seminar__Group__1
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
    // InternalSeminar.g:239:1: rule__Seminar__Group__0__Impl : ( ( rule__Seminar__Group_0__0 )* ) ;
    public final void rule__Seminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:243:1: ( ( ( rule__Seminar__Group_0__0 )* ) )
            // InternalSeminar.g:244:1: ( ( rule__Seminar__Group_0__0 )* )
            {
            // InternalSeminar.g:244:1: ( ( rule__Seminar__Group_0__0 )* )
            // InternalSeminar.g:245:2: ( rule__Seminar__Group_0__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_0()); 
            // InternalSeminar.g:246:2: ( rule__Seminar__Group_0__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeminar.g:246:3: rule__Seminar__Group_0__0
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
    // InternalSeminar.g:254:1: rule__Seminar__Group__1 : rule__Seminar__Group__1__Impl rule__Seminar__Group__2 ;
    public final void rule__Seminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:258:1: ( rule__Seminar__Group__1__Impl rule__Seminar__Group__2 )
            // InternalSeminar.g:259:2: rule__Seminar__Group__1__Impl rule__Seminar__Group__2
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
    // InternalSeminar.g:266:1: rule__Seminar__Group__1__Impl : ( ( rule__Seminar__Group_1__0 )* ) ;
    public final void rule__Seminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:270:1: ( ( ( rule__Seminar__Group_1__0 )* ) )
            // InternalSeminar.g:271:1: ( ( rule__Seminar__Group_1__0 )* )
            {
            // InternalSeminar.g:271:1: ( ( rule__Seminar__Group_1__0 )* )
            // InternalSeminar.g:272:2: ( rule__Seminar__Group_1__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_1()); 
            // InternalSeminar.g:273:2: ( rule__Seminar__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeminar.g:273:3: rule__Seminar__Group_1__0
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
    // InternalSeminar.g:281:1: rule__Seminar__Group__2 : rule__Seminar__Group__2__Impl rule__Seminar__Group__3 ;
    public final void rule__Seminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:285:1: ( rule__Seminar__Group__2__Impl rule__Seminar__Group__3 )
            // InternalSeminar.g:286:2: rule__Seminar__Group__2__Impl rule__Seminar__Group__3
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
    // InternalSeminar.g:293:1: rule__Seminar__Group__2__Impl : ( ( rule__Seminar__Group_2__0 )* ) ;
    public final void rule__Seminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:297:1: ( ( ( rule__Seminar__Group_2__0 )* ) )
            // InternalSeminar.g:298:1: ( ( rule__Seminar__Group_2__0 )* )
            {
            // InternalSeminar.g:298:1: ( ( rule__Seminar__Group_2__0 )* )
            // InternalSeminar.g:299:2: ( rule__Seminar__Group_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_2()); 
            // InternalSeminar.g:300:2: ( rule__Seminar__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSeminar.g:300:3: rule__Seminar__Group_2__0
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
    // InternalSeminar.g:308:1: rule__Seminar__Group__3 : rule__Seminar__Group__3__Impl rule__Seminar__Group__4 ;
    public final void rule__Seminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:312:1: ( rule__Seminar__Group__3__Impl rule__Seminar__Group__4 )
            // InternalSeminar.g:313:2: rule__Seminar__Group__3__Impl rule__Seminar__Group__4
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
    // InternalSeminar.g:320:1: rule__Seminar__Group__3__Impl : ( ( rule__Seminar__PreferencesAssignment_3 )* ) ;
    public final void rule__Seminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:324:1: ( ( ( rule__Seminar__PreferencesAssignment_3 )* ) )
            // InternalSeminar.g:325:1: ( ( rule__Seminar__PreferencesAssignment_3 )* )
            {
            // InternalSeminar.g:325:1: ( ( rule__Seminar__PreferencesAssignment_3 )* )
            // InternalSeminar.g:326:2: ( rule__Seminar__PreferencesAssignment_3 )*
            {
             before(grammarAccess.getSeminarAccess().getPreferencesAssignment_3()); 
            // InternalSeminar.g:327:2: ( rule__Seminar__PreferencesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==16) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeminar.g:327:3: rule__Seminar__PreferencesAssignment_3
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
    // InternalSeminar.g:335:1: rule__Seminar__Group__4 : rule__Seminar__Group__4__Impl rule__Seminar__Group__5 ;
    public final void rule__Seminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:339:1: ( rule__Seminar__Group__4__Impl rule__Seminar__Group__5 )
            // InternalSeminar.g:340:2: rule__Seminar__Group__4__Impl rule__Seminar__Group__5
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
    // InternalSeminar.g:347:1: rule__Seminar__Group__4__Impl : ( ( rule__Seminar__SupervisesAssignment_4 )* ) ;
    public final void rule__Seminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:351:1: ( ( ( rule__Seminar__SupervisesAssignment_4 )* ) )
            // InternalSeminar.g:352:1: ( ( rule__Seminar__SupervisesAssignment_4 )* )
            {
            // InternalSeminar.g:352:1: ( ( rule__Seminar__SupervisesAssignment_4 )* )
            // InternalSeminar.g:353:2: ( rule__Seminar__SupervisesAssignment_4 )*
            {
             before(grammarAccess.getSeminarAccess().getSupervisesAssignment_4()); 
            // InternalSeminar.g:354:2: ( rule__Seminar__SupervisesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==17) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeminar.g:354:3: rule__Seminar__SupervisesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__SupervisesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getSupervisesAssignment_4()); 

            }


            }

        }
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
    // InternalSeminar.g:362:1: rule__Seminar__Group__5 : rule__Seminar__Group__5__Impl ;
    public final void rule__Seminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:366:1: ( rule__Seminar__Group__5__Impl )
            // InternalSeminar.g:367:2: rule__Seminar__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Seminar__Group__5__Impl();

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
    // InternalSeminar.g:373:1: rule__Seminar__Group__5__Impl : ( ( rule__Seminar__AssignmentsAssignment_5 )* ) ;
    public final void rule__Seminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:377:1: ( ( ( rule__Seminar__AssignmentsAssignment_5 )* ) )
            // InternalSeminar.g:378:1: ( ( rule__Seminar__AssignmentsAssignment_5 )* )
            {
            // InternalSeminar.g:378:1: ( ( rule__Seminar__AssignmentsAssignment_5 )* )
            // InternalSeminar.g:379:2: ( rule__Seminar__AssignmentsAssignment_5 )*
            {
             before(grammarAccess.getSeminarAccess().getAssignmentsAssignment_5()); 
            // InternalSeminar.g:380:2: ( rule__Seminar__AssignmentsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSeminar.g:380:3: rule__Seminar__AssignmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__AssignmentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getAssignmentsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Seminar__Group_0__0"
    // InternalSeminar.g:389:1: rule__Seminar__Group_0__0 : rule__Seminar__Group_0__0__Impl rule__Seminar__Group_0__1 ;
    public final void rule__Seminar__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:393:1: ( rule__Seminar__Group_0__0__Impl rule__Seminar__Group_0__1 )
            // InternalSeminar.g:394:2: rule__Seminar__Group_0__0__Impl rule__Seminar__Group_0__1
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
    // InternalSeminar.g:401:1: rule__Seminar__Group_0__0__Impl : ( 'supervisors:' ) ;
    public final void rule__Seminar__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:405:1: ( ( 'supervisors:' ) )
            // InternalSeminar.g:406:1: ( 'supervisors:' )
            {
            // InternalSeminar.g:406:1: ( 'supervisors:' )
            // InternalSeminar.g:407:2: 'supervisors:'
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsKeyword_0_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSeminar.g:416:1: rule__Seminar__Group_0__1 : rule__Seminar__Group_0__1__Impl rule__Seminar__Group_0__2 ;
    public final void rule__Seminar__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:420:1: ( rule__Seminar__Group_0__1__Impl rule__Seminar__Group_0__2 )
            // InternalSeminar.g:421:2: rule__Seminar__Group_0__1__Impl rule__Seminar__Group_0__2
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
    // InternalSeminar.g:428:1: rule__Seminar__Group_0__1__Impl : ( ( rule__Seminar__SupervisorsAssignment_0_1 )* ) ;
    public final void rule__Seminar__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:432:1: ( ( ( rule__Seminar__SupervisorsAssignment_0_1 )* ) )
            // InternalSeminar.g:433:1: ( ( rule__Seminar__SupervisorsAssignment_0_1 )* )
            {
            // InternalSeminar.g:433:1: ( ( rule__Seminar__SupervisorsAssignment_0_1 )* )
            // InternalSeminar.g:434:2: ( rule__Seminar__SupervisorsAssignment_0_1 )*
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsAssignment_0_1()); 
            // InternalSeminar.g:435:2: ( rule__Seminar__SupervisorsAssignment_0_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeminar.g:435:3: rule__Seminar__SupervisorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__SupervisorsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSeminar.g:443:1: rule__Seminar__Group_0__2 : rule__Seminar__Group_0__2__Impl rule__Seminar__Group_0__3 ;
    public final void rule__Seminar__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:447:1: ( rule__Seminar__Group_0__2__Impl rule__Seminar__Group_0__3 )
            // InternalSeminar.g:448:2: rule__Seminar__Group_0__2__Impl rule__Seminar__Group_0__3
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
    // InternalSeminar.g:455:1: rule__Seminar__Group_0__2__Impl : ( ( rule__Seminar__Group_0_2__0 )* ) ;
    public final void rule__Seminar__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:459:1: ( ( ( rule__Seminar__Group_0_2__0 )* ) )
            // InternalSeminar.g:460:1: ( ( rule__Seminar__Group_0_2__0 )* )
            {
            // InternalSeminar.g:460:1: ( ( rule__Seminar__Group_0_2__0 )* )
            // InternalSeminar.g:461:2: ( rule__Seminar__Group_0_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_0_2()); 
            // InternalSeminar.g:462:2: ( rule__Seminar__Group_0_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeminar.g:462:3: rule__Seminar__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSeminar.g:470:1: rule__Seminar__Group_0__3 : rule__Seminar__Group_0__3__Impl ;
    public final void rule__Seminar__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:474:1: ( rule__Seminar__Group_0__3__Impl )
            // InternalSeminar.g:475:2: rule__Seminar__Group_0__3__Impl
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
    // InternalSeminar.g:481:1: rule__Seminar__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:485:1: ( ( ';' ) )
            // InternalSeminar.g:486:1: ( ';' )
            {
            // InternalSeminar.g:486:1: ( ';' )
            // InternalSeminar.g:487:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_0_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSeminar.g:497:1: rule__Seminar__Group_0_2__0 : rule__Seminar__Group_0_2__0__Impl rule__Seminar__Group_0_2__1 ;
    public final void rule__Seminar__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:501:1: ( rule__Seminar__Group_0_2__0__Impl rule__Seminar__Group_0_2__1 )
            // InternalSeminar.g:502:2: rule__Seminar__Group_0_2__0__Impl rule__Seminar__Group_0_2__1
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
    // InternalSeminar.g:509:1: rule__Seminar__Group_0_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:513:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:514:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:514:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:515:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:515:2: ( ( ',' ) )
            // InternalSeminar.g:516:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 
            // InternalSeminar.g:517:3: ( ',' )
            // InternalSeminar.g:517:4: ','
            {
            match(input,13,FOLLOW_9); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 

            }

            // InternalSeminar.g:520:2: ( ( ',' )* )
            // InternalSeminar.g:521:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_0_2_0()); 
            // InternalSeminar.g:522:3: ( ',' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeminar.g:522:4: ','
            	    {
            	    match(input,13,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSeminar.g:531:1: rule__Seminar__Group_0_2__1 : rule__Seminar__Group_0_2__1__Impl ;
    public final void rule__Seminar__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:535:1: ( rule__Seminar__Group_0_2__1__Impl )
            // InternalSeminar.g:536:2: rule__Seminar__Group_0_2__1__Impl
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
    // InternalSeminar.g:542:1: rule__Seminar__Group_0_2__1__Impl : ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) ) ;
    public final void rule__Seminar__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:546:1: ( ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) ) )
            // InternalSeminar.g:547:1: ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) )
            {
            // InternalSeminar.g:547:1: ( ( rule__Seminar__SupervisorsAssignment_0_2_1 ) )
            // InternalSeminar.g:548:2: ( rule__Seminar__SupervisorsAssignment_0_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getSupervisorsAssignment_0_2_1()); 
            // InternalSeminar.g:549:2: ( rule__Seminar__SupervisorsAssignment_0_2_1 )
            // InternalSeminar.g:549:3: rule__Seminar__SupervisorsAssignment_0_2_1
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
    // InternalSeminar.g:558:1: rule__Seminar__Group_1__0 : rule__Seminar__Group_1__0__Impl rule__Seminar__Group_1__1 ;
    public final void rule__Seminar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:562:1: ( rule__Seminar__Group_1__0__Impl rule__Seminar__Group_1__1 )
            // InternalSeminar.g:563:2: rule__Seminar__Group_1__0__Impl rule__Seminar__Group_1__1
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
    // InternalSeminar.g:570:1: rule__Seminar__Group_1__0__Impl : ( 'students:' ) ;
    public final void rule__Seminar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:574:1: ( ( 'students:' ) )
            // InternalSeminar.g:575:1: ( 'students:' )
            {
            // InternalSeminar.g:575:1: ( 'students:' )
            // InternalSeminar.g:576:2: 'students:'
            {
             before(grammarAccess.getSeminarAccess().getStudentsKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSeminar.g:585:1: rule__Seminar__Group_1__1 : rule__Seminar__Group_1__1__Impl rule__Seminar__Group_1__2 ;
    public final void rule__Seminar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:589:1: ( rule__Seminar__Group_1__1__Impl rule__Seminar__Group_1__2 )
            // InternalSeminar.g:590:2: rule__Seminar__Group_1__1__Impl rule__Seminar__Group_1__2
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
    // InternalSeminar.g:597:1: rule__Seminar__Group_1__1__Impl : ( ( rule__Seminar__StudentsAssignment_1_1 )* ) ;
    public final void rule__Seminar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:601:1: ( ( ( rule__Seminar__StudentsAssignment_1_1 )* ) )
            // InternalSeminar.g:602:1: ( ( rule__Seminar__StudentsAssignment_1_1 )* )
            {
            // InternalSeminar.g:602:1: ( ( rule__Seminar__StudentsAssignment_1_1 )* )
            // InternalSeminar.g:603:2: ( rule__Seminar__StudentsAssignment_1_1 )*
            {
             before(grammarAccess.getSeminarAccess().getStudentsAssignment_1_1()); 
            // InternalSeminar.g:604:2: ( rule__Seminar__StudentsAssignment_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeminar.g:604:3: rule__Seminar__StudentsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__StudentsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSeminar.g:612:1: rule__Seminar__Group_1__2 : rule__Seminar__Group_1__2__Impl rule__Seminar__Group_1__3 ;
    public final void rule__Seminar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:616:1: ( rule__Seminar__Group_1__2__Impl rule__Seminar__Group_1__3 )
            // InternalSeminar.g:617:2: rule__Seminar__Group_1__2__Impl rule__Seminar__Group_1__3
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
    // InternalSeminar.g:624:1: rule__Seminar__Group_1__2__Impl : ( ( rule__Seminar__Group_1_2__0 )* ) ;
    public final void rule__Seminar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:628:1: ( ( ( rule__Seminar__Group_1_2__0 )* ) )
            // InternalSeminar.g:629:1: ( ( rule__Seminar__Group_1_2__0 )* )
            {
            // InternalSeminar.g:629:1: ( ( rule__Seminar__Group_1_2__0 )* )
            // InternalSeminar.g:630:2: ( rule__Seminar__Group_1_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_1_2()); 
            // InternalSeminar.g:631:2: ( rule__Seminar__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeminar.g:631:3: rule__Seminar__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSeminar.g:639:1: rule__Seminar__Group_1__3 : rule__Seminar__Group_1__3__Impl ;
    public final void rule__Seminar__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:643:1: ( rule__Seminar__Group_1__3__Impl )
            // InternalSeminar.g:644:2: rule__Seminar__Group_1__3__Impl
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
    // InternalSeminar.g:650:1: rule__Seminar__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:654:1: ( ( ';' ) )
            // InternalSeminar.g:655:1: ( ';' )
            {
            // InternalSeminar.g:655:1: ( ';' )
            // InternalSeminar.g:656:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_1_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSeminar.g:666:1: rule__Seminar__Group_1_2__0 : rule__Seminar__Group_1_2__0__Impl rule__Seminar__Group_1_2__1 ;
    public final void rule__Seminar__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:670:1: ( rule__Seminar__Group_1_2__0__Impl rule__Seminar__Group_1_2__1 )
            // InternalSeminar.g:671:2: rule__Seminar__Group_1_2__0__Impl rule__Seminar__Group_1_2__1
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
    // InternalSeminar.g:678:1: rule__Seminar__Group_1_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:682:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:683:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:683:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:684:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:684:2: ( ( ',' ) )
            // InternalSeminar.g:685:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 
            // InternalSeminar.g:686:3: ( ',' )
            // InternalSeminar.g:686:4: ','
            {
            match(input,13,FOLLOW_9); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 

            }

            // InternalSeminar.g:689:2: ( ( ',' )* )
            // InternalSeminar.g:690:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_1_2_0()); 
            // InternalSeminar.g:691:3: ( ',' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeminar.g:691:4: ','
            	    {
            	    match(input,13,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSeminar.g:700:1: rule__Seminar__Group_1_2__1 : rule__Seminar__Group_1_2__1__Impl ;
    public final void rule__Seminar__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:704:1: ( rule__Seminar__Group_1_2__1__Impl )
            // InternalSeminar.g:705:2: rule__Seminar__Group_1_2__1__Impl
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
    // InternalSeminar.g:711:1: rule__Seminar__Group_1_2__1__Impl : ( ( rule__Seminar__StudentsAssignment_1_2_1 ) ) ;
    public final void rule__Seminar__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:715:1: ( ( ( rule__Seminar__StudentsAssignment_1_2_1 ) ) )
            // InternalSeminar.g:716:1: ( ( rule__Seminar__StudentsAssignment_1_2_1 ) )
            {
            // InternalSeminar.g:716:1: ( ( rule__Seminar__StudentsAssignment_1_2_1 ) )
            // InternalSeminar.g:717:2: ( rule__Seminar__StudentsAssignment_1_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getStudentsAssignment_1_2_1()); 
            // InternalSeminar.g:718:2: ( rule__Seminar__StudentsAssignment_1_2_1 )
            // InternalSeminar.g:718:3: rule__Seminar__StudentsAssignment_1_2_1
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
    // InternalSeminar.g:727:1: rule__Seminar__Group_2__0 : rule__Seminar__Group_2__0__Impl rule__Seminar__Group_2__1 ;
    public final void rule__Seminar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:731:1: ( rule__Seminar__Group_2__0__Impl rule__Seminar__Group_2__1 )
            // InternalSeminar.g:732:2: rule__Seminar__Group_2__0__Impl rule__Seminar__Group_2__1
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
    // InternalSeminar.g:739:1: rule__Seminar__Group_2__0__Impl : ( 'topics:' ) ;
    public final void rule__Seminar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:743:1: ( ( 'topics:' ) )
            // InternalSeminar.g:744:1: ( 'topics:' )
            {
            // InternalSeminar.g:744:1: ( 'topics:' )
            // InternalSeminar.g:745:2: 'topics:'
            {
             before(grammarAccess.getSeminarAccess().getTopicsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSeminar.g:754:1: rule__Seminar__Group_2__1 : rule__Seminar__Group_2__1__Impl rule__Seminar__Group_2__2 ;
    public final void rule__Seminar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:758:1: ( rule__Seminar__Group_2__1__Impl rule__Seminar__Group_2__2 )
            // InternalSeminar.g:759:2: rule__Seminar__Group_2__1__Impl rule__Seminar__Group_2__2
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
    // InternalSeminar.g:766:1: rule__Seminar__Group_2__1__Impl : ( ( rule__Seminar__TopicsAssignment_2_1 )* ) ;
    public final void rule__Seminar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:770:1: ( ( ( rule__Seminar__TopicsAssignment_2_1 )* ) )
            // InternalSeminar.g:771:1: ( ( rule__Seminar__TopicsAssignment_2_1 )* )
            {
            // InternalSeminar.g:771:1: ( ( rule__Seminar__TopicsAssignment_2_1 )* )
            // InternalSeminar.g:772:2: ( rule__Seminar__TopicsAssignment_2_1 )*
            {
             before(grammarAccess.getSeminarAccess().getTopicsAssignment_2_1()); 
            // InternalSeminar.g:773:2: ( rule__Seminar__TopicsAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeminar.g:773:3: rule__Seminar__TopicsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Seminar__TopicsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSeminar.g:781:1: rule__Seminar__Group_2__2 : rule__Seminar__Group_2__2__Impl rule__Seminar__Group_2__3 ;
    public final void rule__Seminar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:785:1: ( rule__Seminar__Group_2__2__Impl rule__Seminar__Group_2__3 )
            // InternalSeminar.g:786:2: rule__Seminar__Group_2__2__Impl rule__Seminar__Group_2__3
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
    // InternalSeminar.g:793:1: rule__Seminar__Group_2__2__Impl : ( ( rule__Seminar__Group_2_2__0 )* ) ;
    public final void rule__Seminar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:797:1: ( ( ( rule__Seminar__Group_2_2__0 )* ) )
            // InternalSeminar.g:798:1: ( ( rule__Seminar__Group_2_2__0 )* )
            {
            // InternalSeminar.g:798:1: ( ( rule__Seminar__Group_2_2__0 )* )
            // InternalSeminar.g:799:2: ( rule__Seminar__Group_2_2__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_2_2()); 
            // InternalSeminar.g:800:2: ( rule__Seminar__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeminar.g:800:3: rule__Seminar__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Seminar__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSeminar.g:808:1: rule__Seminar__Group_2__3 : rule__Seminar__Group_2__3__Impl ;
    public final void rule__Seminar__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:812:1: ( rule__Seminar__Group_2__3__Impl )
            // InternalSeminar.g:813:2: rule__Seminar__Group_2__3__Impl
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
    // InternalSeminar.g:819:1: rule__Seminar__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Seminar__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:823:1: ( ( ';' ) )
            // InternalSeminar.g:824:1: ( ';' )
            {
            // InternalSeminar.g:824:1: ( ';' )
            // InternalSeminar.g:825:2: ';'
            {
             before(grammarAccess.getSeminarAccess().getSemicolonKeyword_2_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSeminar.g:835:1: rule__Seminar__Group_2_2__0 : rule__Seminar__Group_2_2__0__Impl rule__Seminar__Group_2_2__1 ;
    public final void rule__Seminar__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:839:1: ( rule__Seminar__Group_2_2__0__Impl rule__Seminar__Group_2_2__1 )
            // InternalSeminar.g:840:2: rule__Seminar__Group_2_2__0__Impl rule__Seminar__Group_2_2__1
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
    // InternalSeminar.g:847:1: rule__Seminar__Group_2_2__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Seminar__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:851:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalSeminar.g:852:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalSeminar.g:852:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalSeminar.g:853:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalSeminar.g:853:2: ( ( ',' ) )
            // InternalSeminar.g:854:3: ( ',' )
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 
            // InternalSeminar.g:855:3: ( ',' )
            // InternalSeminar.g:855:4: ','
            {
            match(input,13,FOLLOW_9); 

            }

             after(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 

            }

            // InternalSeminar.g:858:2: ( ( ',' )* )
            // InternalSeminar.g:859:3: ( ',' )*
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_2_2_0()); 
            // InternalSeminar.g:860:3: ( ',' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeminar.g:860:4: ','
            	    {
            	    match(input,13,FOLLOW_9); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSeminar.g:869:1: rule__Seminar__Group_2_2__1 : rule__Seminar__Group_2_2__1__Impl ;
    public final void rule__Seminar__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:873:1: ( rule__Seminar__Group_2_2__1__Impl )
            // InternalSeminar.g:874:2: rule__Seminar__Group_2_2__1__Impl
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
    // InternalSeminar.g:880:1: rule__Seminar__Group_2_2__1__Impl : ( ( rule__Seminar__TopicsAssignment_2_2_1 ) ) ;
    public final void rule__Seminar__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:884:1: ( ( ( rule__Seminar__TopicsAssignment_2_2_1 ) ) )
            // InternalSeminar.g:885:1: ( ( rule__Seminar__TopicsAssignment_2_2_1 ) )
            {
            // InternalSeminar.g:885:1: ( ( rule__Seminar__TopicsAssignment_2_2_1 ) )
            // InternalSeminar.g:886:2: ( rule__Seminar__TopicsAssignment_2_2_1 )
            {
             before(grammarAccess.getSeminarAccess().getTopicsAssignment_2_2_1()); 
            // InternalSeminar.g:887:2: ( rule__Seminar__TopicsAssignment_2_2_1 )
            // InternalSeminar.g:887:3: rule__Seminar__TopicsAssignment_2_2_1
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
    // InternalSeminar.g:896:1: rule__Preference__Group__0 : rule__Preference__Group__0__Impl rule__Preference__Group__1 ;
    public final void rule__Preference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:900:1: ( rule__Preference__Group__0__Impl rule__Preference__Group__1 )
            // InternalSeminar.g:901:2: rule__Preference__Group__0__Impl rule__Preference__Group__1
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
    // InternalSeminar.g:908:1: rule__Preference__Group__0__Impl : ( ( rule__Preference__StudentAssignment_0 ) ) ;
    public final void rule__Preference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:912:1: ( ( ( rule__Preference__StudentAssignment_0 ) ) )
            // InternalSeminar.g:913:1: ( ( rule__Preference__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:913:1: ( ( rule__Preference__StudentAssignment_0 ) )
            // InternalSeminar.g:914:2: ( rule__Preference__StudentAssignment_0 )
            {
             before(grammarAccess.getPreferenceAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:915:2: ( rule__Preference__StudentAssignment_0 )
            // InternalSeminar.g:915:3: rule__Preference__StudentAssignment_0
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
    // InternalSeminar.g:923:1: rule__Preference__Group__1 : rule__Preference__Group__1__Impl rule__Preference__Group__2 ;
    public final void rule__Preference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:927:1: ( rule__Preference__Group__1__Impl rule__Preference__Group__2 )
            // InternalSeminar.g:928:2: rule__Preference__Group__1__Impl rule__Preference__Group__2
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
    // InternalSeminar.g:935:1: rule__Preference__Group__1__Impl : ( 'prefers' ) ;
    public final void rule__Preference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:939:1: ( ( 'prefers' ) )
            // InternalSeminar.g:940:1: ( 'prefers' )
            {
            // InternalSeminar.g:940:1: ( 'prefers' )
            // InternalSeminar.g:941:2: 'prefers'
            {
             before(grammarAccess.getPreferenceAccess().getPrefersKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getPrefersKeyword_1()); 

            }


            }

        }
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
    // InternalSeminar.g:950:1: rule__Preference__Group__2 : rule__Preference__Group__2__Impl rule__Preference__Group__3 ;
    public final void rule__Preference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:954:1: ( rule__Preference__Group__2__Impl rule__Preference__Group__3 )
            // InternalSeminar.g:955:2: rule__Preference__Group__2__Impl rule__Preference__Group__3
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
    // InternalSeminar.g:962:1: rule__Preference__Group__2__Impl : ( ( rule__Preference__TopicAssignment_2 ) ) ;
    public final void rule__Preference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:966:1: ( ( ( rule__Preference__TopicAssignment_2 ) ) )
            // InternalSeminar.g:967:1: ( ( rule__Preference__TopicAssignment_2 ) )
            {
            // InternalSeminar.g:967:1: ( ( rule__Preference__TopicAssignment_2 ) )
            // InternalSeminar.g:968:2: ( rule__Preference__TopicAssignment_2 )
            {
             before(grammarAccess.getPreferenceAccess().getTopicAssignment_2()); 
            // InternalSeminar.g:969:2: ( rule__Preference__TopicAssignment_2 )
            // InternalSeminar.g:969:3: rule__Preference__TopicAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Preference__TopicAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPreferenceAccess().getTopicAssignment_2()); 

            }


            }

        }
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
    // InternalSeminar.g:977:1: rule__Preference__Group__3 : rule__Preference__Group__3__Impl ;
    public final void rule__Preference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:981:1: ( rule__Preference__Group__3__Impl )
            // InternalSeminar.g:982:2: rule__Preference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Preference__Group__3__Impl();

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
    // InternalSeminar.g:988:1: rule__Preference__Group__3__Impl : ( ';' ) ;
    public final void rule__Preference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:992:1: ( ( ';' ) )
            // InternalSeminar.g:993:1: ( ';' )
            {
            // InternalSeminar.g:993:1: ( ';' )
            // InternalSeminar.g:994:2: ';'
            {
             before(grammarAccess.getPreferenceAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Supervise__Group__0"
    // InternalSeminar.g:1004:1: rule__Supervise__Group__0 : rule__Supervise__Group__0__Impl rule__Supervise__Group__1 ;
    public final void rule__Supervise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1008:1: ( rule__Supervise__Group__0__Impl rule__Supervise__Group__1 )
            // InternalSeminar.g:1009:2: rule__Supervise__Group__0__Impl rule__Supervise__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeminar.g:1016:1: rule__Supervise__Group__0__Impl : ( ( rule__Supervise__SupervisorAssignment_0 ) ) ;
    public final void rule__Supervise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1020:1: ( ( ( rule__Supervise__SupervisorAssignment_0 ) ) )
            // InternalSeminar.g:1021:1: ( ( rule__Supervise__SupervisorAssignment_0 ) )
            {
            // InternalSeminar.g:1021:1: ( ( rule__Supervise__SupervisorAssignment_0 ) )
            // InternalSeminar.g:1022:2: ( rule__Supervise__SupervisorAssignment_0 )
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorAssignment_0()); 
            // InternalSeminar.g:1023:2: ( rule__Supervise__SupervisorAssignment_0 )
            // InternalSeminar.g:1023:3: rule__Supervise__SupervisorAssignment_0
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
    // InternalSeminar.g:1031:1: rule__Supervise__Group__1 : rule__Supervise__Group__1__Impl rule__Supervise__Group__2 ;
    public final void rule__Supervise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1035:1: ( rule__Supervise__Group__1__Impl rule__Supervise__Group__2 )
            // InternalSeminar.g:1036:2: rule__Supervise__Group__1__Impl rule__Supervise__Group__2
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
    // InternalSeminar.g:1043:1: rule__Supervise__Group__1__Impl : ( 'supervises' ) ;
    public final void rule__Supervise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1047:1: ( ( 'supervises' ) )
            // InternalSeminar.g:1048:1: ( 'supervises' )
            {
            // InternalSeminar.g:1048:1: ( 'supervises' )
            // InternalSeminar.g:1049:2: 'supervises'
            {
             before(grammarAccess.getSuperviseAccess().getSupervisesKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSeminar.g:1058:1: rule__Supervise__Group__2 : rule__Supervise__Group__2__Impl rule__Supervise__Group__3 ;
    public final void rule__Supervise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1062:1: ( rule__Supervise__Group__2__Impl rule__Supervise__Group__3 )
            // InternalSeminar.g:1063:2: rule__Supervise__Group__2__Impl rule__Supervise__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeminar.g:1070:1: rule__Supervise__Group__2__Impl : ( ( rule__Supervise__TopicAssignment_2 ) ) ;
    public final void rule__Supervise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1074:1: ( ( ( rule__Supervise__TopicAssignment_2 ) ) )
            // InternalSeminar.g:1075:1: ( ( rule__Supervise__TopicAssignment_2 ) )
            {
            // InternalSeminar.g:1075:1: ( ( rule__Supervise__TopicAssignment_2 ) )
            // InternalSeminar.g:1076:2: ( rule__Supervise__TopicAssignment_2 )
            {
             before(grammarAccess.getSuperviseAccess().getTopicAssignment_2()); 
            // InternalSeminar.g:1077:2: ( rule__Supervise__TopicAssignment_2 )
            // InternalSeminar.g:1077:3: rule__Supervise__TopicAssignment_2
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
    // InternalSeminar.g:1085:1: rule__Supervise__Group__3 : rule__Supervise__Group__3__Impl ;
    public final void rule__Supervise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1089:1: ( rule__Supervise__Group__3__Impl )
            // InternalSeminar.g:1090:2: rule__Supervise__Group__3__Impl
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
    // InternalSeminar.g:1096:1: rule__Supervise__Group__3__Impl : ( ';' ) ;
    public final void rule__Supervise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1100:1: ( ( ';' ) )
            // InternalSeminar.g:1101:1: ( ';' )
            {
            // InternalSeminar.g:1101:1: ( ';' )
            // InternalSeminar.g:1102:2: ';'
            {
             before(grammarAccess.getSuperviseAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSeminar.g:1112:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1116:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalSeminar.g:1117:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeminar.g:1124:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__StudentAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1128:1: ( ( ( rule__Assignment__StudentAssignment_0 ) ) )
            // InternalSeminar.g:1129:1: ( ( rule__Assignment__StudentAssignment_0 ) )
            {
            // InternalSeminar.g:1129:1: ( ( rule__Assignment__StudentAssignment_0 ) )
            // InternalSeminar.g:1130:2: ( rule__Assignment__StudentAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getStudentAssignment_0()); 
            // InternalSeminar.g:1131:2: ( rule__Assignment__StudentAssignment_0 )
            // InternalSeminar.g:1131:3: rule__Assignment__StudentAssignment_0
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
    // InternalSeminar.g:1139:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1143:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalSeminar.g:1144:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSeminar.g:1151:1: rule__Assignment__Group__1__Impl : ( 'is' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1155:1: ( ( 'is' ) )
            // InternalSeminar.g:1156:1: ( 'is' )
            {
            // InternalSeminar.g:1156:1: ( 'is' )
            // InternalSeminar.g:1157:2: 'is'
            {
             before(grammarAccess.getAssignmentAccess().getIsKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSeminar.g:1166:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1170:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalSeminar.g:1171:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeminar.g:1178:1: rule__Assignment__Group__2__Impl : ( 'assigned' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1182:1: ( ( 'assigned' ) )
            // InternalSeminar.g:1183:1: ( 'assigned' )
            {
            // InternalSeminar.g:1183:1: ( 'assigned' )
            // InternalSeminar.g:1184:2: 'assigned'
            {
             before(grammarAccess.getAssignmentAccess().getAssignedKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSeminar.g:1193:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1197:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalSeminar.g:1198:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
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
    // InternalSeminar.g:1205:1: rule__Assignment__Group__3__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1209:1: ( ( 'to' ) )
            // InternalSeminar.g:1210:1: ( 'to' )
            {
            // InternalSeminar.g:1210:1: ( 'to' )
            // InternalSeminar.g:1211:2: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSeminar.g:1220:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl rule__Assignment__Group__5 ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1224:1: ( rule__Assignment__Group__4__Impl rule__Assignment__Group__5 )
            // InternalSeminar.g:1225:2: rule__Assignment__Group__4__Impl rule__Assignment__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeminar.g:1232:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__TopicAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1236:1: ( ( ( rule__Assignment__TopicAssignment_4 ) ) )
            // InternalSeminar.g:1237:1: ( ( rule__Assignment__TopicAssignment_4 ) )
            {
            // InternalSeminar.g:1237:1: ( ( rule__Assignment__TopicAssignment_4 ) )
            // InternalSeminar.g:1238:2: ( rule__Assignment__TopicAssignment_4 )
            {
             before(grammarAccess.getAssignmentAccess().getTopicAssignment_4()); 
            // InternalSeminar.g:1239:2: ( rule__Assignment__TopicAssignment_4 )
            // InternalSeminar.g:1239:3: rule__Assignment__TopicAssignment_4
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
    // InternalSeminar.g:1247:1: rule__Assignment__Group__5 : rule__Assignment__Group__5__Impl ;
    public final void rule__Assignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1251:1: ( rule__Assignment__Group__5__Impl )
            // InternalSeminar.g:1252:2: rule__Assignment__Group__5__Impl
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
    // InternalSeminar.g:1258:1: rule__Assignment__Group__5__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1262:1: ( ( ';' ) )
            // InternalSeminar.g:1263:1: ( ';' )
            {
            // InternalSeminar.g:1263:1: ( ';' )
            // InternalSeminar.g:1264:2: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_2); 
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
    // InternalSeminar.g:1274:1: rule__Seminar__SupervisorsAssignment_0_1 : ( ruleSupervisor ) ;
    public final void rule__Seminar__SupervisorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1278:1: ( ( ruleSupervisor ) )
            // InternalSeminar.g:1279:2: ( ruleSupervisor )
            {
            // InternalSeminar.g:1279:2: ( ruleSupervisor )
            // InternalSeminar.g:1280:3: ruleSupervisor
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
    // InternalSeminar.g:1289:1: rule__Seminar__SupervisorsAssignment_0_2_1 : ( ruleSupervisor ) ;
    public final void rule__Seminar__SupervisorsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1293:1: ( ( ruleSupervisor ) )
            // InternalSeminar.g:1294:2: ( ruleSupervisor )
            {
            // InternalSeminar.g:1294:2: ( ruleSupervisor )
            // InternalSeminar.g:1295:3: ruleSupervisor
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
    // InternalSeminar.g:1304:1: rule__Seminar__StudentsAssignment_1_1 : ( ruleStudent ) ;
    public final void rule__Seminar__StudentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1308:1: ( ( ruleStudent ) )
            // InternalSeminar.g:1309:2: ( ruleStudent )
            {
            // InternalSeminar.g:1309:2: ( ruleStudent )
            // InternalSeminar.g:1310:3: ruleStudent
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
    // InternalSeminar.g:1319:1: rule__Seminar__StudentsAssignment_1_2_1 : ( ruleStudent ) ;
    public final void rule__Seminar__StudentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1323:1: ( ( ruleStudent ) )
            // InternalSeminar.g:1324:2: ( ruleStudent )
            {
            // InternalSeminar.g:1324:2: ( ruleStudent )
            // InternalSeminar.g:1325:3: ruleStudent
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
    // InternalSeminar.g:1334:1: rule__Seminar__TopicsAssignment_2_1 : ( ruleTopic ) ;
    public final void rule__Seminar__TopicsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1338:1: ( ( ruleTopic ) )
            // InternalSeminar.g:1339:2: ( ruleTopic )
            {
            // InternalSeminar.g:1339:2: ( ruleTopic )
            // InternalSeminar.g:1340:3: ruleTopic
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
    // InternalSeminar.g:1349:1: rule__Seminar__TopicsAssignment_2_2_1 : ( ruleTopic ) ;
    public final void rule__Seminar__TopicsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1353:1: ( ( ruleTopic ) )
            // InternalSeminar.g:1354:2: ( ruleTopic )
            {
            // InternalSeminar.g:1354:2: ( ruleTopic )
            // InternalSeminar.g:1355:3: ruleTopic
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
    // InternalSeminar.g:1364:1: rule__Seminar__PreferencesAssignment_3 : ( rulePreference ) ;
    public final void rule__Seminar__PreferencesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1368:1: ( ( rulePreference ) )
            // InternalSeminar.g:1369:2: ( rulePreference )
            {
            // InternalSeminar.g:1369:2: ( rulePreference )
            // InternalSeminar.g:1370:3: rulePreference
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


    // $ANTLR start "rule__Seminar__SupervisesAssignment_4"
    // InternalSeminar.g:1379:1: rule__Seminar__SupervisesAssignment_4 : ( ruleSupervise ) ;
    public final void rule__Seminar__SupervisesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1383:1: ( ( ruleSupervise ) )
            // InternalSeminar.g:1384:2: ( ruleSupervise )
            {
            // InternalSeminar.g:1384:2: ( ruleSupervise )
            // InternalSeminar.g:1385:3: ruleSupervise
            {
             before(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSupervise();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getSupervisesSuperviseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__SupervisesAssignment_4"


    // $ANTLR start "rule__Seminar__AssignmentsAssignment_5"
    // InternalSeminar.g:1394:1: rule__Seminar__AssignmentsAssignment_5 : ( ruleAssignment ) ;
    public final void rule__Seminar__AssignmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1398:1: ( ( ruleAssignment ) )
            // InternalSeminar.g:1399:2: ( ruleAssignment )
            {
            // InternalSeminar.g:1399:2: ( ruleAssignment )
            // InternalSeminar.g:1400:3: ruleAssignment
            {
             before(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getAssignmentsAssignmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Seminar__AssignmentsAssignment_5"


    // $ANTLR start "rule__Supervisor__NameAssignment"
    // InternalSeminar.g:1409:1: rule__Supervisor__NameAssignment : ( RULE_ID ) ;
    public final void rule__Supervisor__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1413:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1414:2: ( RULE_ID )
            {
            // InternalSeminar.g:1414:2: ( RULE_ID )
            // InternalSeminar.g:1415:3: RULE_ID
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
    // InternalSeminar.g:1424:1: rule__Student__NameAssignment : ( RULE_ID ) ;
    public final void rule__Student__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1428:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1429:2: ( RULE_ID )
            {
            // InternalSeminar.g:1429:2: ( RULE_ID )
            // InternalSeminar.g:1430:3: RULE_ID
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
    // InternalSeminar.g:1439:1: rule__Topic__NameAssignment : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1443:1: ( ( RULE_ID ) )
            // InternalSeminar.g:1444:2: ( RULE_ID )
            {
            // InternalSeminar.g:1444:2: ( RULE_ID )
            // InternalSeminar.g:1445:3: RULE_ID
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
    // InternalSeminar.g:1454:1: rule__Preference__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1458:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1459:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1459:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1460:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1461:3: ( RULE_ID )
            // InternalSeminar.g:1462:4: RULE_ID
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


    // $ANTLR start "rule__Preference__TopicAssignment_2"
    // InternalSeminar.g:1473:1: rule__Preference__TopicAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__TopicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1477:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1478:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1478:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1479:3: ( RULE_ID )
            {
             before(grammarAccess.getPreferenceAccess().getTopicTopicCrossReference_2_0()); 
            // InternalSeminar.g:1480:3: ( RULE_ID )
            // InternalSeminar.g:1481:4: RULE_ID
            {
             before(grammarAccess.getPreferenceAccess().getTopicTopicIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPreferenceAccess().getTopicTopicIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPreferenceAccess().getTopicTopicCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__TopicAssignment_2"


    // $ANTLR start "rule__Supervise__SupervisorAssignment_0"
    // InternalSeminar.g:1492:1: rule__Supervise__SupervisorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Supervise__SupervisorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1496:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1497:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1497:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1498:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperviseAccess().getSupervisorSupervisorCrossReference_0_0()); 
            // InternalSeminar.g:1499:3: ( RULE_ID )
            // InternalSeminar.g:1500:4: RULE_ID
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
    // InternalSeminar.g:1511:1: rule__Supervise__TopicAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Supervise__TopicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1515:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1516:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1516:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1517:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperviseAccess().getTopicTopicCrossReference_2_0()); 
            // InternalSeminar.g:1518:3: ( RULE_ID )
            // InternalSeminar.g:1519:4: RULE_ID
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
    // InternalSeminar.g:1530:1: rule__Assignment__StudentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__StudentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1534:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1535:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1535:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1536:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getStudentStudentCrossReference_0_0()); 
            // InternalSeminar.g:1537:3: ( RULE_ID )
            // InternalSeminar.g:1538:4: RULE_ID
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
    // InternalSeminar.g:1549:1: rule__Assignment__TopicAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TopicAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeminar.g:1553:1: ( ( ( RULE_ID ) ) )
            // InternalSeminar.g:1554:2: ( ( RULE_ID ) )
            {
            // InternalSeminar.g:1554:2: ( ( RULE_ID ) )
            // InternalSeminar.g:1555:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTopicTopicCrossReference_4_0()); 
            // InternalSeminar.g:1556:3: ( RULE_ID )
            // InternalSeminar.g:1557:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}