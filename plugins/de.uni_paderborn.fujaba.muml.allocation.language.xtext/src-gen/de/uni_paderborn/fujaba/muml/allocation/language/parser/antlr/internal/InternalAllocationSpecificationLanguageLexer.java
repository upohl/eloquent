package de.uni_paderborn.fujaba.muml.allocation.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAllocationSpecificationLanguageLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ESCAPED_ID=5;
    public static final int RULE_DOUBLE_QUOTED_STRING=10;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_SIMPLE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=11;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=14;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalAllocationSpecificationLanguageLexer() {;} 
    public InternalAllocationSpecificationLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAllocationSpecificationLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:11:7: ( '{' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:11:9: '{'
            {
            match('{'); 

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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:12:7: ( '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:12:9: '}'
            {
            match('}'); 

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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:13:7: ( 'service' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:13:9: 'service'
            {
            match("service"); 


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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:14:7: ( 'qos' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:14:9: 'qos'
            {
            match("qos"); 


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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:15:7: ( 'value' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:15:9: 'value'
            {
            match("value"); 


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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:16:7: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:16:9: ';'
            {
            match(';'); 

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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:17:7: ( 'descriptors' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:17:9: 'descriptors'
            {
            match("descriptors"); 


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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:18:7: ( ',' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:18:9: ','
            {
            match(','); 

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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:19:7: ( 'ocl' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:19:9: 'ocl'
            {
            match("ocl"); 


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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:20:7: ( 'constraint' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:20:9: 'constraint'
            {
            match("constraint"); 


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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:21:7: ( 'resource' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:21:9: 'resource'
            {
            match("resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:22:7: ( 'lhs' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:22:9: 'lhs'
            {
            match("lhs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:23:7: ( 'rhs' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:23:9: 'rhs'
            {
            match("rhs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:24:7: ( 'requiredHardwareResourceInstance' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:24:9: 'requiredHardwareResourceInstance'
            {
            match("requiredHardwareResourceInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:25:7: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:26:7: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:27:7: ( 'measure' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:27:9: 'measure'
            {
            match("measure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:28:7: ( '+' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:29:7: ( '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:29:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:30:7: ( '-' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:31:7: ( 'not' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:31:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:32:7: ( '/' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:33:7: ( '>' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:34:7: ( '<' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:35:7: ( '>=' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:35:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:36:7: ( '<=' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:37:7: ( '=' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:37:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:38:7: ( '<>' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:38:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:39:7: ( 'and' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:39:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:40:7: ( 'or' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:40:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:41:7: ( 'xor' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:41:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:42:7: ( 'implies' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:42:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:43:7: ( '.' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:43:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:44:7: ( '->' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:44:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:45:7: ( 'Tuple' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:45:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:46:7: ( '::' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:46:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:47:7: ( 'Boolean' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:47:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:48:7: ( 'Integer' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:48:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:49:7: ( 'Real' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:49:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:50:7: ( 'String' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:50:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:51:7: ( 'UnlimitedNatural' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:51:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:52:7: ( 'OclAny' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:52:9: 'OclAny'
            {
            match("OclAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:53:7: ( 'OclInvalid' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:53:9: 'OclInvalid'
            {
            match("OclInvalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:54:7: ( 'OclVoid' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:54:9: 'OclVoid'
            {
            match("OclVoid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:55:7: ( 'Set' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:55:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:56:7: ( 'Bag' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:56:9: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:57:7: ( 'Sequence' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:57:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:58:7: ( 'Collection' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:58:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:59:7: ( 'OrderedSet' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:59:9: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:60:7: ( '..' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:60:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:61:7: ( '[' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:61:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:62:7: ( ']' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:62:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:63:7: ( '?' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:63:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:64:7: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:64:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:65:7: ( 'true' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:65:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:66:7: ( 'false' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:66:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:67:7: ( 'invalid' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:67:9: 'invalid'
            {
            match("invalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:68:7: ( 'null' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:68:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:69:7: ( '@' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:69:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:70:7: ( 'pre' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:70:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:71:7: ( '|' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:71:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:72:7: ( 'if' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:72:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:73:7: ( 'then' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:73:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:74:7: ( 'else' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:74:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:75:7: ( 'endif' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:75:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:76:7: ( 'let' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:76:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:77:7: ( 'in' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:77:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:78:7: ( 'self' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:78:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:79:7: ( 'sameLocation' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:79:9: 'sameLocation'
            {
            match("sameLocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:80:7: ( 'differentLocation' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:80:9: 'differentLocation'
            {
            match("differentLocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "RULE_ESCAPED_CHARACTER"
    public final void mRULE_ESCAPED_CHARACTER() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5287:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5287:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHARACTER"

    // $ANTLR start "RULE_LETTER_CHARACTER"
    public final void mRULE_LETTER_CHARACTER() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5289:32: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5289:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_CHARACTER"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5291:27: ( '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5291:29: '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5291:33: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5291:34: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5291:57: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_QUOTED_STRING"

    // $ANTLR start "RULE_SINGLE_QUOTED_STRING"
    public final void mRULE_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5293:27: ( '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5293:29: '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5293:34: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5293:35: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5293:58: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop2;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_ML_SINGLE_QUOTED_STRING"
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5295:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5295:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5295:38: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5295:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("'/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_SIMPLE_ID"
    public final void mRULE_SIMPLE_ID() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5297:16: ( RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5297:18: RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            {
            mRULE_LETTER_CHARACTER(); 
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5297:40: ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ID"

    // $ANTLR start "RULE_ESCAPED_ID"
    public final void mRULE_ESCAPED_ID() throws RecognitionException {
        try {
            int _type = RULE_ESCAPED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5299:17: ( '_' RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5299:19: '_' RULE_SINGLE_QUOTED_STRING
            {
            match('_'); 
            mRULE_SINGLE_QUOTED_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5301:10: ( ( '0' .. '9' )+ )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5301:12: ( '0' .. '9' )+
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5301:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5301:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5303:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5303:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5303:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5303:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5305:41: '\\r'
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5307:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5309:16: ( . )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5309:18: .
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
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=80;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:430: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 72 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:456: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 73 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:482: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 74 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:511: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 75 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:526: RULE_ESCAPED_ID
                {
                mRULE_ESCAPED_ID(); 

                }
                break;
            case 76 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:542: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 77 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:551: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 78 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:567: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 79 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:583: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 80 :
                // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1:591: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\3\71\1\uffff\1\71\1\uffff\4\71\2\uffff\1\71\2\uffff\1\116"+
        "\1\71\1\123\1\125\1\130\1\uffff\3\71\1\140\1\71\1\143\7\71\3\uffff"+
        "\2\71\1\uffff\1\71\1\uffff\1\71\2\64\1\71\6\uffff\2\71\1\uffff\2"+
        "\71\1\uffff\2\71\1\uffff\1\71\1\u0086\5\71\2\uffff\1\71\5\uffff"+
        "\2\71\11\uffff\3\71\1\u0094\1\u0095\2\uffff\1\71\2\uffff\12\71\3"+
        "\uffff\3\71\1\uffff\1\71\1\uffff\2\71\5\uffff\3\71\1\u00ab\3\71"+
        "\1\u00af\1\uffff\3\71\1\u00b3\1\u00b4\1\u00b5\1\71\1\u00b7\1\71"+
        "\1\u00b9\1\u00ba\2\71\2\uffff\2\71\1\u00bf\3\71\1\u00c3\10\71\1"+
        "\u00ce\3\71\1\u00d2\1\71\1\uffff\3\71\1\uffff\3\71\3\uffff\1\71"+
        "\1\uffff\1\u00db\2\uffff\4\71\1\uffff\1\71\1\u00e1\1\71\1\uffff"+
        "\7\71\1\u00ea\1\u00eb\1\71\1\uffff\1\u00ed\2\71\1\uffff\1\71\1\u00f1"+
        "\6\71\1\uffff\2\71\1\u00fa\2\71\1\uffff\10\71\2\uffff\1\u0105\1"+
        "\uffff\1\u0106\2\71\1\uffff\10\71\1\uffff\2\71\1\u0113\2\71\1\u0116"+
        "\4\71\2\uffff\1\u011b\6\71\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126"+
        "\1\uffff\2\71\1\uffff\1\71\1\u012a\2\71\1\uffff\4\71\1\u0131\1\71"+
        "\5\uffff\1\u0133\2\71\1\uffff\6\71\1\uffff\1\71\1\uffff\7\71\1\u0144"+
        "\2\71\1\u0147\1\u0148\1\u0149\1\71\1\u014b\1\71\1\uffff\2\71\3\uffff"+
        "\1\u014f\1\uffff\3\71\1\uffff\13\71\1\u015e\1\u015f\1\71\2\uffff"+
        "\16\71\1\u016f\1\uffff";
    static final String DFA11_eofS =
        "\u0170\uffff";
    static final String DFA11_minS =
        "\1\0\2\uffff\1\141\1\157\1\141\1\uffff\1\145\1\uffff\1\143\1\157"+
        "\2\145\2\uffff\1\145\2\uffff\1\55\1\157\1\47\2\75\1\uffff\1\156"+
        "\1\157\1\146\1\56\1\165\1\72\1\141\1\156\2\145\1\156\1\143\1\157"+
        "\3\uffff\1\150\1\141\1\uffff\1\162\1\uffff\1\154\2\0\1\47\6\uffff"+
        "\1\154\1\155\1\uffff\1\163\1\154\1\uffff\1\163\1\146\1\uffff\1\154"+
        "\1\60\1\156\1\161\2\163\1\164\2\uffff\1\141\5\uffff\1\164\1\154"+
        "\11\uffff\1\144\1\162\1\160\2\60\2\uffff\1\160\2\uffff\1\157\1\147"+
        "\1\164\1\141\1\162\1\161\2\154\1\144\1\154\3\uffff\1\165\1\145\1"+
        "\154\1\uffff\1\145\1\uffff\1\163\1\144\5\uffff\1\166\1\146\1\145"+
        "\1\60\1\165\1\143\1\146\1\60\1\uffff\1\163\1\157\1\165\3\60\1\163"+
        "\1\60\1\154\2\60\1\154\1\141\2\uffff\2\154\1\60\1\145\1\154\1\151"+
        "\1\60\1\165\1\151\1\101\1\145\1\154\1\145\1\156\1\163\1\60\1\145"+
        "\2\151\1\60\1\114\1\uffff\1\145\1\162\1\145\1\uffff\1\164\1\165"+
        "\1\151\3\uffff\1\165\1\uffff\1\60\2\uffff\1\151\1\154\2\145\1\uffff"+
        "\1\147\1\60\1\156\1\uffff\1\145\1\155\2\156\1\157\1\162\1\145\2"+
        "\60\1\145\1\uffff\1\60\1\146\1\143\1\uffff\1\157\1\60\1\151\5\162"+
        "\1\uffff\1\145\1\151\1\60\1\141\1\145\1\uffff\1\147\1\156\1\151"+
        "\1\171\1\166\1\151\1\145\1\143\2\uffff\1\60\1\uffff\1\60\1\145\1"+
        "\143\1\uffff\1\160\1\145\1\141\1\143\2\145\1\163\1\144\1\uffff\1"+
        "\156\1\162\1\60\1\143\1\164\1\60\1\141\2\144\1\164\2\uffff\1\60"+
        "\1\141\1\164\1\156\1\151\1\145\1\144\5\60\1\uffff\2\145\1\uffff"+
        "\1\154\1\60\1\123\1\151\1\uffff\1\164\1\157\1\164\1\156\1\60\1\110"+
        "\5\uffff\1\60\1\144\1\151\1\uffff\1\145\1\157\1\151\1\162\1\114"+
        "\1\164\1\uffff\1\141\1\uffff\1\116\1\144\1\164\1\156\1\157\1\163"+
        "\1\157\1\60\1\162\1\141\3\60\1\156\1\60\1\143\1\uffff\1\144\1\164"+
        "\3\uffff\1\60\1\uffff\1\141\1\167\1\165\1\uffff\1\164\1\141\1\162"+
        "\1\151\1\162\1\141\1\157\1\145\1\154\1\156\1\122\2\60\1\145\2\uffff"+
        "\1\163\1\157\1\165\1\162\1\143\1\145\1\111\1\156\1\163\1\164\1\141"+
        "\1\156\1\143\1\145\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\2\uffff\1\145\1\157\1\141\1\uffff\1\151\1\uffff\1\162\1"+
        "\157\2\150\2\uffff\1\145\2\uffff\1\76\1\165\1\52\1\75\1\76\1\uffff"+
        "\1\156\1\157\1\156\1\56\1\165\1\72\1\157\1\156\1\145\1\164\1\156"+
        "\1\162\1\157\3\uffff\1\162\1\141\1\uffff\1\162\1\uffff\1\156\2\uffff"+
        "\1\47\6\uffff\1\162\1\155\1\uffff\1\163\1\154\1\uffff\1\163\1\146"+
        "\1\uffff\1\154\1\172\1\156\3\163\1\164\2\uffff\1\141\5\uffff\1\164"+
        "\1\154\11\uffff\1\144\1\162\1\160\2\172\2\uffff\1\160\2\uffff\1"+
        "\157\1\147\1\164\1\141\1\162\1\164\2\154\1\144\1\154\3\uffff\1\165"+
        "\1\145\1\154\1\uffff\1\145\1\uffff\1\163\1\144\5\uffff\1\166\1\146"+
        "\1\145\1\172\1\165\1\143\1\146\1\172\1\uffff\1\163\1\157\1\165\3"+
        "\172\1\163\1\172\1\154\2\172\1\154\1\141\2\uffff\2\154\1\172\1\145"+
        "\1\154\1\151\1\172\1\165\1\151\1\126\1\145\1\154\1\145\1\156\1\163"+
        "\1\172\1\145\2\151\1\172\1\114\1\uffff\1\145\1\162\1\145\1\uffff"+
        "\1\164\1\165\1\151\3\uffff\1\165\1\uffff\1\172\2\uffff\1\151\1\154"+
        "\2\145\1\uffff\1\147\1\172\1\156\1\uffff\1\145\1\155\2\156\1\157"+
        "\1\162\1\145\2\172\1\145\1\uffff\1\172\1\146\1\143\1\uffff\1\157"+
        "\1\172\1\151\5\162\1\uffff\1\145\1\151\1\172\1\141\1\145\1\uffff"+
        "\1\147\1\156\1\151\1\171\1\166\1\151\1\145\1\143\2\uffff\1\172\1"+
        "\uffff\1\172\1\145\1\143\1\uffff\1\160\1\145\1\141\1\143\2\145\1"+
        "\163\1\144\1\uffff\1\156\1\162\1\172\1\143\1\164\1\172\1\141\2\144"+
        "\1\164\2\uffff\1\172\1\141\1\164\1\156\1\151\1\145\1\144\5\172\1"+
        "\uffff\2\145\1\uffff\1\154\1\172\1\123\1\151\1\uffff\1\164\1\157"+
        "\1\164\1\156\1\172\1\110\5\uffff\1\172\1\144\1\151\1\uffff\1\145"+
        "\1\157\1\151\1\162\1\114\1\164\1\uffff\1\141\1\uffff\1\116\1\144"+
        "\1\164\1\156\1\157\1\163\1\157\1\172\1\162\1\141\3\172\1\156\1\172"+
        "\1\143\1\uffff\1\144\1\164\3\uffff\1\172\1\uffff\1\141\1\167\1\165"+
        "\1\uffff\1\164\1\141\1\162\1\151\1\162\1\141\1\157\1\145\1\154\1"+
        "\156\1\122\2\172\1\145\2\uffff\1\163\1\157\1\165\1\162\1\143\1\145"+
        "\1\111\1\156\1\163\1\164\1\141\1\156\1\143\1\145\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\uffff\1\10\4\uffff\1\17\1\20\1\uffff"+
        "\1\22\1\23\5\uffff\1\33\15\uffff\1\63\1\64\1\65\2\uffff\1\73\1\uffff"+
        "\1\75\4\uffff\1\112\1\114\1\117\1\120\1\1\1\2\2\uffff\1\112\2\uffff"+
        "\1\6\2\uffff\1\10\7\uffff\1\17\1\20\1\uffff\1\22\1\23\1\42\1\116"+
        "\1\24\2\uffff\1\111\1\115\1\26\1\31\1\27\1\32\1\34\1\30\1\33\5\uffff"+
        "\1\62\1\41\1\uffff\1\44\1\66\12\uffff\1\63\1\64\1\65\3\uffff\1\73"+
        "\1\uffff\1\75\2\uffff\1\107\1\110\1\113\1\114\1\117\10\uffff\1\36"+
        "\15\uffff\1\103\1\76\25\uffff\1\4\3\uffff\1\11\3\uffff\1\15\1\14"+
        "\1\102\1\uffff\1\25\1\uffff\1\35\1\37\4\uffff\1\56\3\uffff\1\55"+
        "\12\uffff\1\74\3\uffff\1\104\10\uffff\1\72\5\uffff\1\47\10\uffff"+
        "\1\67\1\77\1\uffff\1\100\3\uffff\1\5\10\uffff\1\43\12\uffff\1\70"+
        "\1\101\14\uffff\1\50\2\uffff\1\52\4\uffff\1\3\6\uffff\1\21\1\40"+
        "\1\71\1\45\1\46\3\uffff\1\54\6\uffff\1\13\1\uffff\1\57\20\uffff"+
        "\1\12\2\uffff\1\53\1\61\1\60\1\uffff\1\7\3\uffff\1\105\16\uffff"+
        "\1\51\1\106\17\uffff\1\16";
    static final String DFA11_specialS =
        "\1\0\55\uffff\1\2\1\1\u0140\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\64\1\56\4\64\1\57\1\15\1"+
            "\16\1\21\1\20\1\10\1\22\1\33\1\24\12\62\1\35\1\6\1\26\1\27\1"+
            "\25\1\47\1\52\1\61\1\36\1\44\5\61\1\37\5\61\1\43\2\61\1\40\1"+
            "\41\1\34\1\42\5\61\1\45\1\64\1\46\1\64\1\60\1\64\1\30\1\61\1"+
            "\12\1\7\1\55\1\51\2\61\1\32\2\61\1\14\1\17\1\23\1\11\1\53\1"+
            "\4\1\13\1\3\1\50\1\61\1\5\1\61\1\31\2\61\1\1\1\54\1\2\uff82"+
            "\64",
            "",
            "",
            "\1\70\3\uffff\1\67",
            "\1\72",
            "\1\73",
            "",
            "\1\75\3\uffff\1\76",
            "",
            "\1\100\16\uffff\1\101",
            "\1\102",
            "\1\103\2\uffff\1\104",
            "\1\106\2\uffff\1\105",
            "",
            "",
            "\1\111",
            "",
            "",
            "\1\115\20\uffff\1\114",
            "\1\117\5\uffff\1\120",
            "\1\121\2\uffff\1\122",
            "\1\124",
            "\1\126\1\127",
            "",
            "\1\132",
            "\1\133",
            "\1\136\6\uffff\1\134\1\135",
            "\1\137",
            "\1\141",
            "\1\142",
            "\1\145\15\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\151\16\uffff\1\150",
            "\1\152",
            "\1\153\16\uffff\1\154",
            "\1\155",
            "",
            "",
            "",
            "\1\162\11\uffff\1\161",
            "\1\163",
            "",
            "\1\165",
            "",
            "\1\167\1\uffff\1\170",
            "\0\171",
            "\0\172",
            "\1\173",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177\5\uffff\1\176",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0087",
            "\1\u0089\1\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\25\71\1\u0093\4\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009d\2\uffff\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00b6",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00b8",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6\7\uffff\1\u00c7\14\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "",
            "\1\u00da",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ec",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0114",
            "\1\u0115",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0132",
            "",
            "",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0145",
            "\1\u0146",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0160",
            "",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            ""
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

    static class DFA11 extends DFA {

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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='{') ) {s = 1;}

                        else if ( (LA11_0=='}') ) {s = 2;}

                        else if ( (LA11_0=='s') ) {s = 3;}

                        else if ( (LA11_0=='q') ) {s = 4;}

                        else if ( (LA11_0=='v') ) {s = 5;}

                        else if ( (LA11_0==';') ) {s = 6;}

                        else if ( (LA11_0=='d') ) {s = 7;}

                        else if ( (LA11_0==',') ) {s = 8;}

                        else if ( (LA11_0=='o') ) {s = 9;}

                        else if ( (LA11_0=='c') ) {s = 10;}

                        else if ( (LA11_0=='r') ) {s = 11;}

                        else if ( (LA11_0=='l') ) {s = 12;}

                        else if ( (LA11_0=='(') ) {s = 13;}

                        else if ( (LA11_0==')') ) {s = 14;}

                        else if ( (LA11_0=='m') ) {s = 15;}

                        else if ( (LA11_0=='+') ) {s = 16;}

                        else if ( (LA11_0=='*') ) {s = 17;}

                        else if ( (LA11_0=='-') ) {s = 18;}

                        else if ( (LA11_0=='n') ) {s = 19;}

                        else if ( (LA11_0=='/') ) {s = 20;}

                        else if ( (LA11_0=='>') ) {s = 21;}

                        else if ( (LA11_0=='<') ) {s = 22;}

                        else if ( (LA11_0=='=') ) {s = 23;}

                        else if ( (LA11_0=='a') ) {s = 24;}

                        else if ( (LA11_0=='x') ) {s = 25;}

                        else if ( (LA11_0=='i') ) {s = 26;}

                        else if ( (LA11_0=='.') ) {s = 27;}

                        else if ( (LA11_0=='T') ) {s = 28;}

                        else if ( (LA11_0==':') ) {s = 29;}

                        else if ( (LA11_0=='B') ) {s = 30;}

                        else if ( (LA11_0=='I') ) {s = 31;}

                        else if ( (LA11_0=='R') ) {s = 32;}

                        else if ( (LA11_0=='S') ) {s = 33;}

                        else if ( (LA11_0=='U') ) {s = 34;}

                        else if ( (LA11_0=='O') ) {s = 35;}

                        else if ( (LA11_0=='C') ) {s = 36;}

                        else if ( (LA11_0=='[') ) {s = 37;}

                        else if ( (LA11_0==']') ) {s = 38;}

                        else if ( (LA11_0=='?') ) {s = 39;}

                        else if ( (LA11_0=='t') ) {s = 40;}

                        else if ( (LA11_0=='f') ) {s = 41;}

                        else if ( (LA11_0=='@') ) {s = 42;}

                        else if ( (LA11_0=='p') ) {s = 43;}

                        else if ( (LA11_0=='|') ) {s = 44;}

                        else if ( (LA11_0=='e') ) {s = 45;}

                        else if ( (LA11_0=='\"') ) {s = 46;}

                        else if ( (LA11_0=='\'') ) {s = 47;}

                        else if ( (LA11_0=='_') ) {s = 48;}

                        else if ( (LA11_0=='A'||(LA11_0>='D' && LA11_0<='H')||(LA11_0>='J' && LA11_0<='N')||(LA11_0>='P' && LA11_0<='Q')||(LA11_0>='V' && LA11_0<='Z')||LA11_0=='b'||(LA11_0>='g' && LA11_0<='h')||(LA11_0>='j' && LA11_0<='k')||LA11_0=='u'||LA11_0=='w'||(LA11_0>='y' && LA11_0<='z')) ) {s = 49;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 50;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 51;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_47 = input.LA(1);

                        s = -1;
                        if ( ((LA11_47>='\u0000' && LA11_47<='\uFFFF')) ) {s = 122;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_46 = input.LA(1);

                        s = -1;
                        if ( ((LA11_46>='\u0000' && LA11_46<='\uFFFF')) ) {s = 121;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}