package de.fraunhofer.iem.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeminarLexer extends Lexer {
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

    public InternalSeminarLexer() {;} 
    public InternalSeminarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSeminarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSeminar.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:11:7: ( 'Seminar' )
            // InternalSeminar.g:11:9: 'Seminar'
            {
            match("Seminar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:12:7: ( '{' )
            // InternalSeminar.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:13:7: ( '}' )
            // InternalSeminar.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:14:7: ( 'supervisors:' )
            // InternalSeminar.g:14:9: 'supervisors:'
            {
            match("supervisors:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:15:7: ( ';' )
            // InternalSeminar.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:16:7: ( ',' )
            // InternalSeminar.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:17:7: ( 'students:' )
            // InternalSeminar.g:17:9: 'students:'
            {
            match("students:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:18:7: ( 'topics:' )
            // InternalSeminar.g:18:9: 'topics:'
            {
            match("topics:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:19:7: ( 'wants' )
            // InternalSeminar.g:19:9: 'wants'
            {
            match("wants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:20:7: ( 'rates' )
            // InternalSeminar.g:20:9: 'rates'
            {
            match("rates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:21:7: ( 'with' )
            // InternalSeminar.g:21:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:22:7: ( 'supervises' )
            // InternalSeminar.g:22:9: 'supervises'
            {
            match("supervises"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:23:7: ( 'is' )
            // InternalSeminar.g:23:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:24:7: ( 'assigned' )
            // InternalSeminar.g:24:9: 'assigned'
            {
            match("assigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:25:7: ( 'to' )
            // InternalSeminar.g:25:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2080:11: ( '0' .. '9' . ( '0' .. '9' )+ )
            // InternalSeminar.g:2080:13: '0' .. '9' . ( '0' .. '9' )+
            {
            matchRange('0','9'); 
            matchAny(); 
            // InternalSeminar.g:2080:24: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeminar.g:2080:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2082:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSeminar.g:2082:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSeminar.g:2082:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSeminar.g:2082:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSeminar.g:2082:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSeminar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2084:10: ( ( '0' .. '9' )+ )
            // InternalSeminar.g:2084:12: ( '0' .. '9' )+
            {
            // InternalSeminar.g:2084:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeminar.g:2084:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2086:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSeminar.g:2086:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSeminar.g:2086:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeminar.g:2086:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSeminar.g:2086:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSeminar.g:2086:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSeminar.g:2086:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSeminar.g:2086:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSeminar.g:2086:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSeminar.g:2086:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSeminar.g:2086:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2088:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSeminar.g:2088:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSeminar.g:2088:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeminar.g:2088:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2090:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSeminar.g:2090:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSeminar.g:2090:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeminar.g:2090:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalSeminar.g:2090:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeminar.g:2090:41: ( '\\r' )? '\\n'
                    {
                    // InternalSeminar.g:2090:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSeminar.g:2090:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2092:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSeminar.g:2092:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSeminar.g:2092:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeminar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeminar.g:2094:16: ( . )
            // InternalSeminar.g:2094:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSeminar.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=23;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalSeminar.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSeminar.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSeminar.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSeminar.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSeminar.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSeminar.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSeminar.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSeminar.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSeminar.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSeminar.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSeminar.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSeminar.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSeminar.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSeminar.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSeminar.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSeminar.g:1:100: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 17 :
                // InternalSeminar.g:1:110: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalSeminar.g:1:118: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalSeminar.g:1:127: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalSeminar.g:1:139: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalSeminar.g:1:155: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalSeminar.g:1:171: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalSeminar.g:1:179: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\25\2\uffff\1\25\2\uffff\5\25\1\43\1\23\1\uffff\3\23\2\uffff\1\25\3\uffff\2\25\2\uffff\1\55\3\25\1\61\1\25\1\43\6\uffff\4\25\1\uffff\3\25\1\uffff\1\25\1\44\5\25\1\101\6\25\1\110\1\uffff\1\111\5\25\2\uffff\1\25\1\120\2\25\1\uffff\1\25\1\uffff\2\25\1\127\2\25\2\uffff\1\25\1\133\1\25\2\uffff";
    static final String DFA13_eofS =
        "\135\uffff";
    static final String DFA13_minS =
        "\1\0\1\145\2\uffff\1\164\2\uffff\1\157\2\141\2\163\1\0\1\101\1\uffff\2\0\1\52\2\uffff\1\155\3\uffff\1\160\1\165\2\uffff\1\60\1\156\2\164\1\60\1\163\1\60\6\uffff\1\151\1\145\1\144\1\151\1\uffff\1\164\1\150\1\145\1\uffff\1\151\1\60\1\156\1\162\1\145\1\143\1\163\1\60\1\163\1\147\1\141\1\166\1\156\1\163\1\60\1\uffff\1\60\1\156\1\162\1\151\1\164\1\72\2\uffff\1\145\1\60\2\163\1\uffff\1\144\1\uffff\1\145\1\72\1\60\1\162\1\163\2\uffff\1\163\1\60\1\72\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\2\uffff\1\165\2\uffff\1\157\1\151\1\141\2\163\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\155\3\uffff\1\160\1\165\2\uffff\1\172\1\156\2\164\1\172\1\163\1\71\6\uffff\1\151\1\145\1\144\1\151\1\uffff\1\164\1\150\1\145\1\uffff\1\151\1\71\1\156\1\162\1\145\1\143\1\163\1\172\1\163\1\147\1\141\1\166\1\156\1\163\1\172\1\uffff\1\172\1\156\1\162\1\151\1\164\1\72\2\uffff\1\145\1\172\2\163\1\uffff\1\144\1\uffff\1\157\1\72\1\172\1\162\1\163\2\uffff\1\163\1\172\1\72\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\7\uffff\1\21\3\uffff\1\26\1\27\1\uffff\1\21\1\2\1\3\2\uffff\1\5\1\6\7\uffff\1\22\1\20\1\23\1\24\1\25\1\26\4\uffff\1\17\3\uffff\1\15\17\uffff\1\13\6\uffff\1\11\1\12\4\uffff\1\10\1\uffff\1\1\5\uffff\1\7\1\16\3\uffff\1\14\1\4";
    static final String DFA13_specialS =
        "\1\1\13\uffff\1\3\2\uffff\1\0\1\2\114\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\4\23\1\6\2\23\1\21\12\14\1\23\1\5\5\23\22\16\1\1\7\16\3\23\1\15\1\16\1\23\1\13\7\16\1\12\10\16\1\11\1\4\1\7\2\16\1\10\3\16\1\2\1\23\1\3\uff82\23",
            "\1\24",
            "",
            "",
            "\1\31\1\30",
            "",
            "",
            "\1\34",
            "\1\35\7\uffff\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\60\44\12\42\uffc6\44",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\45",
            "\0\45",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\17\25\1\54\12\25",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\62",
            "\12\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\12\63",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "\1\117",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "",
            "\1\125\11\uffff\1\124",
            "\1\126",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\134",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFF')) ) {s = 37;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='S') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='s') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0==',') ) {s = 6;}

                        else if ( (LA13_0=='t') ) {s = 7;}

                        else if ( (LA13_0=='w') ) {s = 8;}

                        else if ( (LA13_0=='r') ) {s = 9;}

                        else if ( (LA13_0=='i') ) {s = 10;}

                        else if ( (LA13_0=='a') ) {s = 11;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 12;}

                        else if ( (LA13_0=='^') ) {s = 13;}

                        else if ( ((LA13_0>='A' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='q')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 14;}

                        else if ( (LA13_0=='\"') ) {s = 15;}

                        else if ( (LA13_0=='\'') ) {s = 16;}

                        else if ( (LA13_0=='/') ) {s = 17;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 18;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFF')) ) {s = 37;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='0' && LA13_12<='9')) ) {s = 34;}

                        else if ( ((LA13_12>='\u0000' && LA13_12<='/')||(LA13_12>=':' && LA13_12<='\uFFFF')) ) {s = 36;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}