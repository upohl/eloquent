package org.muml.psm.allocation.language.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAllocationSpecificationLanguageLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=10;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=9;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=12;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_UNQUOTED_STRING=5;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_SIMPLE_ID=6;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalAllocationSpecificationLanguageLexer() {;} 
    public InternalAllocationSpecificationLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAllocationSpecificationLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAllocationSpecificationLanguage.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:11:7: ( '{' )
            // InternalAllocationSpecificationLanguage.g:11:9: '{'
            {
            match('{'); 

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
            // InternalAllocationSpecificationLanguage.g:12:7: ( '}' )
            // InternalAllocationSpecificationLanguage.g:12:9: '}'
            {
            match('}'); 

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
            // InternalAllocationSpecificationLanguage.g:13:7: ( 'nameProvider' )
            // InternalAllocationSpecificationLanguage.g:13:9: 'nameProvider'
            {
            match("nameProvider"); 


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
            // InternalAllocationSpecificationLanguage.g:14:7: ( 'storageProvider' )
            // InternalAllocationSpecificationLanguage.g:14:9: 'storageProvider'
            {
            match("storageProvider"); 


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
            // InternalAllocationSpecificationLanguage.g:15:7: ( 'oclContext' )
            // InternalAllocationSpecificationLanguage.g:15:9: 'oclContext'
            {
            match("oclContext"); 


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
            // InternalAllocationSpecificationLanguage.g:16:7: ( 'service' )
            // InternalAllocationSpecificationLanguage.g:16:9: 'service'
            {
            match("service"); 


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
            // InternalAllocationSpecificationLanguage.g:17:7: ( 'relation' )
            // InternalAllocationSpecificationLanguage.g:17:9: 'relation'
            {
            match("relation"); 


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
            // InternalAllocationSpecificationLanguage.g:18:7: ( 'ocl' )
            // InternalAllocationSpecificationLanguage.g:18:9: 'ocl'
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
            // InternalAllocationSpecificationLanguage.g:19:7: ( ';' )
            // InternalAllocationSpecificationLanguage.g:19:9: ';'
            {
            match(';'); 

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
            // InternalAllocationSpecificationLanguage.g:20:7: ( 'lower' )
            // InternalAllocationSpecificationLanguage.g:20:9: 'lower'
            {
            match("lower"); 


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
            // InternalAllocationSpecificationLanguage.g:21:7: ( 'upper' )
            // InternalAllocationSpecificationLanguage.g:21:9: 'upper'
            {
            match("upper"); 


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
            // InternalAllocationSpecificationLanguage.g:22:7: ( 'qos' )
            // InternalAllocationSpecificationLanguage.g:22:9: 'qos'
            {
            match("qos"); 


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
            // InternalAllocationSpecificationLanguage.g:23:7: ( '(' )
            // InternalAllocationSpecificationLanguage.g:23:9: '('
            {
            match('('); 

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
            // InternalAllocationSpecificationLanguage.g:24:7: ( ',' )
            // InternalAllocationSpecificationLanguage.g:24:9: ','
            {
            match(','); 

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
            // InternalAllocationSpecificationLanguage.g:25:7: ( ')' )
            // InternalAllocationSpecificationLanguage.g:25:9: ')'
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
            // InternalAllocationSpecificationLanguage.g:26:7: ( ':' )
            // InternalAllocationSpecificationLanguage.g:26:9: ':'
            {
            match(':'); 

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
            // InternalAllocationSpecificationLanguage.g:27:7: ( 'descriptors' )
            // InternalAllocationSpecificationLanguage.g:27:9: 'descriptors'
            {
            match("descriptors"); 


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
            // InternalAllocationSpecificationLanguage.g:28:7: ( 'weight' )
            // InternalAllocationSpecificationLanguage.g:28:9: 'weight'
            {
            match("weight"); 


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
            // InternalAllocationSpecificationLanguage.g:29:7: ( 'bound' )
            // InternalAllocationSpecificationLanguage.g:29:9: 'bound'
            {
            match("bound"); 


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
            // InternalAllocationSpecificationLanguage.g:30:7: ( 'premise' )
            // InternalAllocationSpecificationLanguage.g:30:9: 'premise'
            {
            match("premise"); 


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
            // InternalAllocationSpecificationLanguage.g:31:7: ( 'conclusion' )
            // InternalAllocationSpecificationLanguage.g:31:9: 'conclusion'
            {
            match("conclusion"); 


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
            // InternalAllocationSpecificationLanguage.g:32:7: ( 'constraint' )
            // InternalAllocationSpecificationLanguage.g:32:9: 'constraint'
            {
            match("constraint"); 


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
            // InternalAllocationSpecificationLanguage.g:33:7: ( 'resource' )
            // InternalAllocationSpecificationLanguage.g:33:9: 'resource'
            {
            match("resource"); 


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
            // InternalAllocationSpecificationLanguage.g:34:7: ( 'requiredResource' )
            // InternalAllocationSpecificationLanguage.g:34:9: 'requiredResource'
            {
            match("requiredResource"); 


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
            // InternalAllocationSpecificationLanguage.g:35:7: ( 'requiredHardwareResourceInstance' )
            // InternalAllocationSpecificationLanguage.g:35:9: 'requiredHardwareResourceInstance'
            {
            match("requiredHardwareResourceInstance"); 


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
            // InternalAllocationSpecificationLanguage.g:36:7: ( 'requiredLocation' )
            // InternalAllocationSpecificationLanguage.g:36:9: 'requiredLocation'
            {
            match("requiredLocation"); 


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
            // InternalAllocationSpecificationLanguage.g:37:7: ( 'implication' )
            // InternalAllocationSpecificationLanguage.g:37:9: 'implication'
            {
            match("implication"); 


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
            // InternalAllocationSpecificationLanguage.g:38:7: ( 'forbiddenLocation' )
            // InternalAllocationSpecificationLanguage.g:38:9: 'forbiddenLocation'
            {
            match("forbiddenLocation"); 


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
            // InternalAllocationSpecificationLanguage.g:39:7: ( 'measure' )
            // InternalAllocationSpecificationLanguage.g:39:9: 'measure'
            {
            match("measure"); 


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
            // InternalAllocationSpecificationLanguage.g:40:7: ( '+' )
            // InternalAllocationSpecificationLanguage.g:40:9: '+'
            {
            match('+'); 

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
            // InternalAllocationSpecificationLanguage.g:41:7: ( '^' )
            // InternalAllocationSpecificationLanguage.g:41:9: '^'
            {
            match('^'); 

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
            // InternalAllocationSpecificationLanguage.g:42:7: ( '^^' )
            // InternalAllocationSpecificationLanguage.g:42:9: '^^'
            {
            match("^^"); 


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
            // InternalAllocationSpecificationLanguage.g:43:7: ( 'context' )
            // InternalAllocationSpecificationLanguage.g:43:9: 'context'
            {
            match("context"); 


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
            // InternalAllocationSpecificationLanguage.g:44:7: ( 'inv' )
            // InternalAllocationSpecificationLanguage.g:44:9: 'inv'
            {
            match("inv"); 


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
            // InternalAllocationSpecificationLanguage.g:45:7: ( 'static' )
            // InternalAllocationSpecificationLanguage.g:45:9: 'static'
            {
            match("static"); 


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
            // InternalAllocationSpecificationLanguage.g:46:7: ( 'def' )
            // InternalAllocationSpecificationLanguage.g:46:9: 'def'
            {
            match("def"); 


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
            // InternalAllocationSpecificationLanguage.g:47:7: ( '=' )
            // InternalAllocationSpecificationLanguage.g:47:9: '='
            {
            match('='); 

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
            // InternalAllocationSpecificationLanguage.g:48:7: ( 'import' )
            // InternalAllocationSpecificationLanguage.g:48:9: 'import'
            {
            match("import"); 


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
            // InternalAllocationSpecificationLanguage.g:49:7: ( 'include' )
            // InternalAllocationSpecificationLanguage.g:49:9: 'include'
            {
            match("include"); 


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
            // InternalAllocationSpecificationLanguage.g:50:7: ( 'library' )
            // InternalAllocationSpecificationLanguage.g:50:9: 'library'
            {
            match("library"); 


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
            // InternalAllocationSpecificationLanguage.g:51:7: ( '::*' )
            // InternalAllocationSpecificationLanguage.g:51:9: '::*'
            {
            match("::*"); 


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
            // InternalAllocationSpecificationLanguage.g:52:7: ( 'pre' )
            // InternalAllocationSpecificationLanguage.g:52:9: 'pre'
            {
            match("pre"); 


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
            // InternalAllocationSpecificationLanguage.g:53:7: ( 'post' )
            // InternalAllocationSpecificationLanguage.g:53:9: 'post'
            {
            match("post"); 


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
            // InternalAllocationSpecificationLanguage.g:54:7: ( 'body' )
            // InternalAllocationSpecificationLanguage.g:54:9: 'body'
            {
            match("body"); 


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
            // InternalAllocationSpecificationLanguage.g:55:7: ( 'package' )
            // InternalAllocationSpecificationLanguage.g:55:9: 'package'
            {
            match("package"); 


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
            // InternalAllocationSpecificationLanguage.g:56:7: ( 'endpackage' )
            // InternalAllocationSpecificationLanguage.g:56:9: 'endpackage'
            {
            match("endpackage"); 


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
            // InternalAllocationSpecificationLanguage.g:57:7: ( 'derive' )
            // InternalAllocationSpecificationLanguage.g:57:9: 'derive'
            {
            match("derive"); 


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
            // InternalAllocationSpecificationLanguage.g:58:7: ( 'init' )
            // InternalAllocationSpecificationLanguage.g:58:9: 'init'
            {
            match("init"); 


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
            // InternalAllocationSpecificationLanguage.g:59:7: ( '<' )
            // InternalAllocationSpecificationLanguage.g:59:9: '<'
            {
            match('<'); 

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
            // InternalAllocationSpecificationLanguage.g:60:7: ( '>' )
            // InternalAllocationSpecificationLanguage.g:60:9: '>'
            {
            match('>'); 

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
            // InternalAllocationSpecificationLanguage.g:61:7: ( '?' )
            // InternalAllocationSpecificationLanguage.g:61:9: '?'
            {
            match('?'); 

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
            // InternalAllocationSpecificationLanguage.g:62:7: ( 'Boolean' )
            // InternalAllocationSpecificationLanguage.g:62:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalAllocationSpecificationLanguage.g:63:7: ( 'Integer' )
            // InternalAllocationSpecificationLanguage.g:63:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalAllocationSpecificationLanguage.g:64:7: ( 'Real' )
            // InternalAllocationSpecificationLanguage.g:64:9: 'Real'
            {
            match("Real"); 


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
            // InternalAllocationSpecificationLanguage.g:65:7: ( 'String' )
            // InternalAllocationSpecificationLanguage.g:65:9: 'String'
            {
            match("String"); 


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
            // InternalAllocationSpecificationLanguage.g:66:7: ( 'UnlimitedNatural' )
            // InternalAllocationSpecificationLanguage.g:66:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // InternalAllocationSpecificationLanguage.g:67:7: ( 'OclAny' )
            // InternalAllocationSpecificationLanguage.g:67:9: 'OclAny'
            {
            match("OclAny"); 


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
            // InternalAllocationSpecificationLanguage.g:68:7: ( 'OclInvalid' )
            // InternalAllocationSpecificationLanguage.g:68:9: 'OclInvalid'
            {
            match("OclInvalid"); 


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
            // InternalAllocationSpecificationLanguage.g:69:7: ( 'OclMessage' )
            // InternalAllocationSpecificationLanguage.g:69:9: 'OclMessage'
            {
            match("OclMessage"); 


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
            // InternalAllocationSpecificationLanguage.g:70:7: ( 'OclState' )
            // InternalAllocationSpecificationLanguage.g:70:9: 'OclState'
            {
            match("OclState"); 


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
            // InternalAllocationSpecificationLanguage.g:71:7: ( 'OclVoid' )
            // InternalAllocationSpecificationLanguage.g:71:9: 'OclVoid'
            {
            match("OclVoid"); 


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
            // InternalAllocationSpecificationLanguage.g:72:7: ( '-' )
            // InternalAllocationSpecificationLanguage.g:72:9: '-'
            {
            match('-'); 

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
            // InternalAllocationSpecificationLanguage.g:73:7: ( 'not' )
            // InternalAllocationSpecificationLanguage.g:73:9: 'not'
            {
            match("not"); 


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
            // InternalAllocationSpecificationLanguage.g:74:7: ( '*' )
            // InternalAllocationSpecificationLanguage.g:74:9: '*'
            {
            match('*'); 

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
            // InternalAllocationSpecificationLanguage.g:75:7: ( '/' )
            // InternalAllocationSpecificationLanguage.g:75:9: '/'
            {
            match('/'); 

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
            // InternalAllocationSpecificationLanguage.g:76:7: ( '>=' )
            // InternalAllocationSpecificationLanguage.g:76:9: '>='
            {
            match(">="); 


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
            // InternalAllocationSpecificationLanguage.g:77:7: ( '<=' )
            // InternalAllocationSpecificationLanguage.g:77:9: '<='
            {
            match("<="); 


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
            // InternalAllocationSpecificationLanguage.g:78:7: ( '<>' )
            // InternalAllocationSpecificationLanguage.g:78:9: '<>'
            {
            match("<>"); 


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
            // InternalAllocationSpecificationLanguage.g:79:7: ( 'and' )
            // InternalAllocationSpecificationLanguage.g:79:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:80:7: ( 'or' )
            // InternalAllocationSpecificationLanguage.g:80:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:81:7: ( 'xor' )
            // InternalAllocationSpecificationLanguage.g:81:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:82:7: ( 'implies' )
            // InternalAllocationSpecificationLanguage.g:82:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:83:7: ( '.' )
            // InternalAllocationSpecificationLanguage.g:83:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:84:7: ( '->' )
            // InternalAllocationSpecificationLanguage.g:84:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:85:7: ( '?.' )
            // InternalAllocationSpecificationLanguage.g:85:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:86:7: ( '?->' )
            // InternalAllocationSpecificationLanguage.g:86:9: '?->'
            {
            match("?->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:87:7: ( 'Map' )
            // InternalAllocationSpecificationLanguage.g:87:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:88:7: ( 'Tuple' )
            // InternalAllocationSpecificationLanguage.g:88:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:89:7: ( '::' )
            // InternalAllocationSpecificationLanguage.g:89:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:90:7: ( 'Set' )
            // InternalAllocationSpecificationLanguage.g:90:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:91:7: ( 'Bag' )
            // InternalAllocationSpecificationLanguage.g:91:9: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:92:7: ( 'Sequence' )
            // InternalAllocationSpecificationLanguage.g:92:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:93:7: ( 'Collection' )
            // InternalAllocationSpecificationLanguage.g:93:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:94:8: ( 'OrderedSet' )
            // InternalAllocationSpecificationLanguage.g:94:10: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:95:8: ( '..' )
            // InternalAllocationSpecificationLanguage.g:95:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:96:8: ( '++' )
            // InternalAllocationSpecificationLanguage.g:96:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:97:8: ( 'Lambda' )
            // InternalAllocationSpecificationLanguage.g:97:10: 'Lambda'
            {
            match("Lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:98:8: ( '<-' )
            // InternalAllocationSpecificationLanguage.g:98:10: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:99:8: ( 'true' )
            // InternalAllocationSpecificationLanguage.g:99:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:100:8: ( 'false' )
            // InternalAllocationSpecificationLanguage.g:100:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:101:8: ( 'invalid' )
            // InternalAllocationSpecificationLanguage.g:101:10: 'invalid'
            {
            match("invalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:102:8: ( 'null' )
            // InternalAllocationSpecificationLanguage.g:102:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:103:8: ( '@' )
            // InternalAllocationSpecificationLanguage.g:103:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:104:8: ( '[' )
            // InternalAllocationSpecificationLanguage.g:104:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:105:8: ( ']' )
            // InternalAllocationSpecificationLanguage.g:105:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:106:8: ( 'in' )
            // InternalAllocationSpecificationLanguage.g:106:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:107:8: ( '|' )
            // InternalAllocationSpecificationLanguage.g:107:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:108:8: ( 'if' )
            // InternalAllocationSpecificationLanguage.g:108:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:109:8: ( 'then' )
            // InternalAllocationSpecificationLanguage.g:109:10: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:110:8: ( 'else' )
            // InternalAllocationSpecificationLanguage.g:110:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:111:8: ( 'endif' )
            // InternalAllocationSpecificationLanguage.g:111:10: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:112:8: ( 'elseif' )
            // InternalAllocationSpecificationLanguage.g:112:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:113:8: ( 'let' )
            // InternalAllocationSpecificationLanguage.g:113:10: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:114:8: ( 'self' )
            // InternalAllocationSpecificationLanguage.g:114:10: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:115:8: ( '|?' )
            // InternalAllocationSpecificationLanguage.g:115:10: '|?'
            {
            match("|?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:116:8: ( '|1' )
            // InternalAllocationSpecificationLanguage.g:116:10: '|1'
            {
            match("|1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:117:8: ( 'extends' )
            // InternalAllocationSpecificationLanguage.g:117:10: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:118:8: ( '&&' )
            // InternalAllocationSpecificationLanguage.g:118:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:119:8: ( 'sameLocation' )
            // InternalAllocationSpecificationLanguage.g:119:10: 'sameLocation'
            {
            match("sameLocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:120:8: ( 'collocation' )
            // InternalAllocationSpecificationLanguage.g:120:10: 'collocation'
            {
            match("collocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:121:8: ( 'differentLocation' )
            // InternalAllocationSpecificationLanguage.g:121:10: 'differentLocation'
            {
            match("differentLocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:122:8: ( 'separateLocation' )
            // InternalAllocationSpecificationLanguage.g:122:10: 'separateLocation'
            {
            match("separateLocation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:123:8: ( 'min' )
            // InternalAllocationSpecificationLanguage.g:123:10: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:124:8: ( 'max' )
            // InternalAllocationSpecificationLanguage.g:124:10: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "RULE_UNQUOTED_STRING"
    public final void mRULE_UNQUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_UNQUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAllocationSpecificationLanguage.g:9075:22: ( '\\u00A3$%^\\u00A3$%^' )
            // InternalAllocationSpecificationLanguage.g:9075:24: '\\u00A3$%^\\u00A3$%^'
            {
            match("\u00A3$%^\u00A3$%^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNQUOTED_STRING"

    // $ANTLR start "RULE_ESCAPED_CHARACTER"
    public final void mRULE_ESCAPED_CHARACTER() throws RecognitionException {
        try {
            // InternalAllocationSpecificationLanguage.g:9077:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
            // InternalAllocationSpecificationLanguage.g:9077:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            // InternalAllocationSpecificationLanguage.g:9079:32: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalAllocationSpecificationLanguage.g:9079:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // InternalAllocationSpecificationLanguage.g:9081:27: ( '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalAllocationSpecificationLanguage.g:9081:29: '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalAllocationSpecificationLanguage.g:9081:33: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalAllocationSpecificationLanguage.g:9081:34: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalAllocationSpecificationLanguage.g:9081:57: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalAllocationSpecificationLanguage.g:9083:27: ( '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalAllocationSpecificationLanguage.g:9083:29: '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalAllocationSpecificationLanguage.g:9083:34: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalAllocationSpecificationLanguage.g:9083:35: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalAllocationSpecificationLanguage.g:9083:58: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAllocationSpecificationLanguage.g:9085:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // InternalAllocationSpecificationLanguage.g:9085:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // InternalAllocationSpecificationLanguage.g:9085:38: ( options {greedy=false; } : . )*
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
            	    // InternalAllocationSpecificationLanguage.g:9085:66: .
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
            // InternalAllocationSpecificationLanguage.g:9087:16: ( RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )* )
            // InternalAllocationSpecificationLanguage.g:9087:18: RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            {
            mRULE_LETTER_CHARACTER(); 
            // InternalAllocationSpecificationLanguage.g:9087:40: ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAllocationSpecificationLanguage.g:
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
            // InternalAllocationSpecificationLanguage.g:9089:17: ( '_' RULE_SINGLE_QUOTED_STRING )
            // InternalAllocationSpecificationLanguage.g:9089:19: '_' RULE_SINGLE_QUOTED_STRING
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
            // InternalAllocationSpecificationLanguage.g:9091:10: ( ( '0' .. '9' )+ )
            // InternalAllocationSpecificationLanguage.g:9091:12: ( '0' .. '9' )+
            {
            // InternalAllocationSpecificationLanguage.g:9091:12: ( '0' .. '9' )+
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
            	    // InternalAllocationSpecificationLanguage.g:9091:13: '0' .. '9'
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
            // InternalAllocationSpecificationLanguage.g:9093:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAllocationSpecificationLanguage.g:9093:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAllocationSpecificationLanguage.g:9093:24: ( options {greedy=false; } : . )*
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
            	    // InternalAllocationSpecificationLanguage.g:9093:52: .
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
            // InternalAllocationSpecificationLanguage.g:9095:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAllocationSpecificationLanguage.g:9095:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalAllocationSpecificationLanguage.g:9095:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAllocationSpecificationLanguage.g:9095:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAllocationSpecificationLanguage.g:9095:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAllocationSpecificationLanguage.g:9095:41: ( '\\r' )? '\\n'
                    {
                    // InternalAllocationSpecificationLanguage.g:9095:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAllocationSpecificationLanguage.g:9095:41: '\\r'
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
            // InternalAllocationSpecificationLanguage.g:9097:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAllocationSpecificationLanguage.g:9097:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAllocationSpecificationLanguage.g:9097:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalAllocationSpecificationLanguage.g:
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
            // InternalAllocationSpecificationLanguage.g:9099:16: ( . )
            // InternalAllocationSpecificationLanguage.g:9099:18: .
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
        // InternalAllocationSpecificationLanguage.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | RULE_UNQUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=125;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalAllocationSpecificationLanguage.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalAllocationSpecificationLanguage.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalAllocationSpecificationLanguage.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalAllocationSpecificationLanguage.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalAllocationSpecificationLanguage.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalAllocationSpecificationLanguage.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalAllocationSpecificationLanguage.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalAllocationSpecificationLanguage.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalAllocationSpecificationLanguage.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalAllocationSpecificationLanguage.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalAllocationSpecificationLanguage.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalAllocationSpecificationLanguage.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalAllocationSpecificationLanguage.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalAllocationSpecificationLanguage.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalAllocationSpecificationLanguage.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalAllocationSpecificationLanguage.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalAllocationSpecificationLanguage.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalAllocationSpecificationLanguage.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalAllocationSpecificationLanguage.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalAllocationSpecificationLanguage.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalAllocationSpecificationLanguage.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalAllocationSpecificationLanguage.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalAllocationSpecificationLanguage.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalAllocationSpecificationLanguage.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalAllocationSpecificationLanguage.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalAllocationSpecificationLanguage.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalAllocationSpecificationLanguage.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalAllocationSpecificationLanguage.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalAllocationSpecificationLanguage.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalAllocationSpecificationLanguage.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalAllocationSpecificationLanguage.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalAllocationSpecificationLanguage.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalAllocationSpecificationLanguage.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalAllocationSpecificationLanguage.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalAllocationSpecificationLanguage.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalAllocationSpecificationLanguage.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalAllocationSpecificationLanguage.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalAllocationSpecificationLanguage.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalAllocationSpecificationLanguage.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalAllocationSpecificationLanguage.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalAllocationSpecificationLanguage.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalAllocationSpecificationLanguage.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalAllocationSpecificationLanguage.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalAllocationSpecificationLanguage.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalAllocationSpecificationLanguage.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalAllocationSpecificationLanguage.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalAllocationSpecificationLanguage.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalAllocationSpecificationLanguage.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalAllocationSpecificationLanguage.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalAllocationSpecificationLanguage.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalAllocationSpecificationLanguage.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalAllocationSpecificationLanguage.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalAllocationSpecificationLanguage.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalAllocationSpecificationLanguage.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalAllocationSpecificationLanguage.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalAllocationSpecificationLanguage.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalAllocationSpecificationLanguage.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalAllocationSpecificationLanguage.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalAllocationSpecificationLanguage.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalAllocationSpecificationLanguage.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalAllocationSpecificationLanguage.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalAllocationSpecificationLanguage.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalAllocationSpecificationLanguage.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalAllocationSpecificationLanguage.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalAllocationSpecificationLanguage.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalAllocationSpecificationLanguage.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalAllocationSpecificationLanguage.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalAllocationSpecificationLanguage.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalAllocationSpecificationLanguage.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalAllocationSpecificationLanguage.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalAllocationSpecificationLanguage.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalAllocationSpecificationLanguage.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalAllocationSpecificationLanguage.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalAllocationSpecificationLanguage.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalAllocationSpecificationLanguage.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalAllocationSpecificationLanguage.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalAllocationSpecificationLanguage.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalAllocationSpecificationLanguage.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalAllocationSpecificationLanguage.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalAllocationSpecificationLanguage.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalAllocationSpecificationLanguage.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalAllocationSpecificationLanguage.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // InternalAllocationSpecificationLanguage.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // InternalAllocationSpecificationLanguage.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // InternalAllocationSpecificationLanguage.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // InternalAllocationSpecificationLanguage.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // InternalAllocationSpecificationLanguage.g:1:529: T__103
                {
                mT__103(); 

                }
                break;
            case 88 :
                // InternalAllocationSpecificationLanguage.g:1:536: T__104
                {
                mT__104(); 

                }
                break;
            case 89 :
                // InternalAllocationSpecificationLanguage.g:1:543: T__105
                {
                mT__105(); 

                }
                break;
            case 90 :
                // InternalAllocationSpecificationLanguage.g:1:550: T__106
                {
                mT__106(); 

                }
                break;
            case 91 :
                // InternalAllocationSpecificationLanguage.g:1:557: T__107
                {
                mT__107(); 

                }
                break;
            case 92 :
                // InternalAllocationSpecificationLanguage.g:1:564: T__108
                {
                mT__108(); 

                }
                break;
            case 93 :
                // InternalAllocationSpecificationLanguage.g:1:571: T__109
                {
                mT__109(); 

                }
                break;
            case 94 :
                // InternalAllocationSpecificationLanguage.g:1:578: T__110
                {
                mT__110(); 

                }
                break;
            case 95 :
                // InternalAllocationSpecificationLanguage.g:1:585: T__111
                {
                mT__111(); 

                }
                break;
            case 96 :
                // InternalAllocationSpecificationLanguage.g:1:592: T__112
                {
                mT__112(); 

                }
                break;
            case 97 :
                // InternalAllocationSpecificationLanguage.g:1:599: T__113
                {
                mT__113(); 

                }
                break;
            case 98 :
                // InternalAllocationSpecificationLanguage.g:1:606: T__114
                {
                mT__114(); 

                }
                break;
            case 99 :
                // InternalAllocationSpecificationLanguage.g:1:613: T__115
                {
                mT__115(); 

                }
                break;
            case 100 :
                // InternalAllocationSpecificationLanguage.g:1:620: T__116
                {
                mT__116(); 

                }
                break;
            case 101 :
                // InternalAllocationSpecificationLanguage.g:1:627: T__117
                {
                mT__117(); 

                }
                break;
            case 102 :
                // InternalAllocationSpecificationLanguage.g:1:634: T__118
                {
                mT__118(); 

                }
                break;
            case 103 :
                // InternalAllocationSpecificationLanguage.g:1:641: T__119
                {
                mT__119(); 

                }
                break;
            case 104 :
                // InternalAllocationSpecificationLanguage.g:1:648: T__120
                {
                mT__120(); 

                }
                break;
            case 105 :
                // InternalAllocationSpecificationLanguage.g:1:655: T__121
                {
                mT__121(); 

                }
                break;
            case 106 :
                // InternalAllocationSpecificationLanguage.g:1:662: T__122
                {
                mT__122(); 

                }
                break;
            case 107 :
                // InternalAllocationSpecificationLanguage.g:1:669: T__123
                {
                mT__123(); 

                }
                break;
            case 108 :
                // InternalAllocationSpecificationLanguage.g:1:676: T__124
                {
                mT__124(); 

                }
                break;
            case 109 :
                // InternalAllocationSpecificationLanguage.g:1:683: T__125
                {
                mT__125(); 

                }
                break;
            case 110 :
                // InternalAllocationSpecificationLanguage.g:1:690: T__126
                {
                mT__126(); 

                }
                break;
            case 111 :
                // InternalAllocationSpecificationLanguage.g:1:697: T__127
                {
                mT__127(); 

                }
                break;
            case 112 :
                // InternalAllocationSpecificationLanguage.g:1:704: T__128
                {
                mT__128(); 

                }
                break;
            case 113 :
                // InternalAllocationSpecificationLanguage.g:1:711: T__129
                {
                mT__129(); 

                }
                break;
            case 114 :
                // InternalAllocationSpecificationLanguage.g:1:718: T__130
                {
                mT__130(); 

                }
                break;
            case 115 :
                // InternalAllocationSpecificationLanguage.g:1:725: RULE_UNQUOTED_STRING
                {
                mRULE_UNQUOTED_STRING(); 

                }
                break;
            case 116 :
                // InternalAllocationSpecificationLanguage.g:1:746: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 117 :
                // InternalAllocationSpecificationLanguage.g:1:772: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 118 :
                // InternalAllocationSpecificationLanguage.g:1:798: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 119 :
                // InternalAllocationSpecificationLanguage.g:1:827: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 120 :
                // InternalAllocationSpecificationLanguage.g:1:842: RULE_ESCAPED_ID
                {
                mRULE_ESCAPED_ID(); 

                }
                break;
            case 121 :
                // InternalAllocationSpecificationLanguage.g:1:858: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 122 :
                // InternalAllocationSpecificationLanguage.g:1:867: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 123 :
                // InternalAllocationSpecificationLanguage.g:1:883: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 124 :
                // InternalAllocationSpecificationLanguage.g:1:899: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 125 :
                // InternalAllocationSpecificationLanguage.g:1:907: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\4\101\1\uffff\3\101\3\uffff\1\122\10\101\1\144\1\146\1\uffff\1\101\1\156\1\160\1\163\6\101\1\177\1\uffff\1\u0083\2\101\1\u0087\5\101\3\uffff\1\u0093\4\73\1\101\6\uffff\3\101\1\uffff\4\101\1\u00a5\1\101\1\uffff\5\101\3\uffff\1\u00af\1\uffff\11\101\1\u00c0\1\u00c1\5\101\5\uffff\3\101\11\uffff\11\101\7\uffff\2\101\2\uffff\6\101\15\uffff\1\101\1\u00dd\7\101\1\u00e6\1\uffff\5\101\1\u00ec\1\101\1\u00ee\2\uffff\1\101\1\u00f0\5\101\1\u00f7\5\101\1\u0101\2\101\2\uffff\3\101\1\u0107\1\u0108\4\101\1\u010e\3\101\1\u0112\4\101\1\u011b\1\u011c\1\u011d\6\101\1\uffff\1\u0124\3\101\1\u0128\3\101\1\uffff\5\101\1\uffff\1\101\1\uffff\1\101\1\uffff\4\101\1\u0137\1\101\1\uffff\1\u0139\10\101\1\uffff\1\101\1\u0143\3\101\2\uffff\2\101\1\u014a\2\101\1\uffff\1\101\1\u014e\1\101\1\uffff\10\101\3\uffff\3\101\1\u015b\1\u015c\1\101\1\uffff\3\101\1\uffff\6\101\1\u0167\1\101\1\u0169\4\101\1\u016e\1\uffff\1\101\1\uffff\11\101\1\uffff\1\101\1\u017b\2\101\1\u017e\1\101\1\uffff\3\101\1\uffff\11\101\1\u018c\2\101\2\uffff\2\101\1\u0191\7\101\1\uffff\1\101\1\uffff\1\101\1\u019b\1\101\1\u019d\1\uffff\10\101\1\u01a6\3\101\1\uffff\2\101\1\uffff\1\u01ac\3\101\1\u01b0\2\101\1\u01b3\5\101\1\uffff\1\101\1\u01ba\2\101\1\uffff\1\u01bd\6\101\1\u01c4\1\101\1\uffff\1\101\1\uffff\1\u01c7\1\u01c8\2\101\1\u01cb\2\101\1\u01ce\1\uffff\1\u01cf\1\u01d0\1\101\1\u01d2\1\101\1\uffff\1\u01d4\1\u01d5\1\u01d6\1\uffff\2\101\1\uffff\3\101\1\u01dc\2\101\1\uffff\2\101\1\uffff\3\101\1\u01e4\1\u01e5\1\101\1\uffff\2\101\2\uffff\2\101\1\uffff\2\101\3\uffff\1\101\1\uffff\1\101\3\uffff\1\u01f1\3\101\1\u01f5\1\uffff\7\101\2\uffff\13\101\1\uffff\3\101\1\uffff\6\101\1\u0211\5\101\1\u0217\1\u0218\3\101\1\u021c\1\101\1\u021e\1\u021f\1\u0220\1\u0221\4\101\1\uffff\3\101\1\u0229\1\101\2\uffff\1\u022b\1\u022c\1\101\1\uffff\1\101\4\uffff\1\u022f\2\101\1\u0232\3\101\1\uffff\1\101\2\uffff\2\101\1\uffff\2\101\1\uffff\16\101\1\u0249\7\101\1\uffff\1\u0251\1\u0252\1\101\1\u0254\2\101\1\u0257\2\uffff\1\101\1\uffff\1\u0259\1\u025a\1\uffff\1\101\2\uffff\15\101\1\u0269\1\uffff";
    static final String DFA11_eofS =
        "\u026a\uffff";
    static final String DFA11_minS =
        "\1\0\2\uffff\2\141\1\143\1\145\1\uffff\1\145\1\160\1\157\3\uffff\1\72\2\145\1\157\1\141\1\157\1\146\2\141\1\53\1\136\1\uffff\1\154\1\55\1\75\1\55\1\141\1\156\2\145\1\156\1\143\1\55\1\uffff\1\47\1\156\1\157\1\56\1\141\1\165\1\157\1\141\1\150\3\uffff\1\61\1\46\1\44\2\0\1\47\6\uffff\1\155\1\164\1\154\1\uffff\1\141\1\154\1\155\1\154\1\60\1\154\1\uffff\1\167\1\142\1\164\1\160\1\163\3\uffff\1\52\1\uffff\2\146\1\151\1\144\1\145\1\163\1\143\1\154\1\160\2\60\1\162\1\154\1\141\1\156\1\170\5\uffff\1\144\1\163\1\164\11\uffff\1\157\1\147\1\164\1\141\1\162\1\161\2\154\1\144\7\uffff\1\144\1\162\2\uffff\2\160\1\154\1\155\1\165\1\145\15\uffff\1\145\1\60\1\154\1\162\1\164\1\166\1\146\1\141\1\145\1\60\1\uffff\1\141\1\157\1\165\1\145\1\162\1\60\1\145\1\60\2\uffff\1\143\1\60\1\151\1\146\1\147\1\156\1\171\1\60\1\164\1\153\1\143\2\154\1\60\1\154\1\164\2\uffff\1\142\2\163\2\60\1\151\2\145\1\154\1\60\1\145\1\154\1\151\1\60\1\165\1\151\1\101\1\145\3\60\2\154\1\142\1\145\1\156\1\120\1\uffff\1\60\1\141\2\151\1\60\1\162\1\114\1\157\1\uffff\1\164\1\165\1\151\1\162\1\141\1\uffff\1\162\1\uffff\1\162\1\uffff\1\166\1\145\1\150\1\144\1\60\1\151\1\uffff\1\60\1\141\1\154\1\164\1\145\1\157\1\151\1\162\1\154\1\uffff\1\165\1\60\1\151\1\145\1\165\2\uffff\1\141\1\146\1\60\1\156\1\145\1\uffff\1\147\1\60\1\156\1\uffff\1\145\1\155\2\156\1\145\1\164\1\157\1\162\3\uffff\2\145\1\144\2\60\1\162\1\uffff\1\147\2\143\1\uffff\1\141\1\157\1\156\1\151\2\162\1\60\1\162\1\60\1\151\1\145\1\162\1\164\1\60\1\uffff\1\163\1\uffff\1\147\1\165\1\162\1\170\2\143\1\164\1\151\1\144\1\uffff\1\144\1\60\1\162\1\143\1\60\1\146\1\uffff\1\144\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1\166\1\163\1\141\1\151\1\145\1\60\1\143\1\141\2\uffff\1\157\1\145\1\60\1\145\1\164\1\143\1\164\1\157\1\143\1\145\1\uffff\1\171\1\uffff\1\160\1\60\1\145\1\60\1\uffff\2\145\1\163\1\141\1\164\2\141\1\163\1\60\1\144\1\145\1\144\1\uffff\1\145\1\153\1\uffff\1\60\1\163\1\156\1\162\1\60\1\143\1\164\1\60\1\141\1\163\1\164\2\144\1\uffff\1\164\1\60\1\166\1\120\1\uffff\1\60\1\145\1\141\1\145\1\156\1\145\1\144\1\60\1\164\1\uffff\1\156\1\uffff\2\60\2\151\1\60\2\164\1\60\1\uffff\2\60\1\145\1\60\1\141\1\uffff\3\60\1\uffff\2\145\1\uffff\1\154\1\141\1\145\1\60\1\123\1\151\1\uffff\1\151\1\162\1\uffff\1\114\1\164\1\170\2\60\1\110\1\uffff\1\157\1\164\2\uffff\1\157\1\156\1\uffff\2\151\3\uffff\1\156\1\uffff\1\147\3\uffff\1\60\1\144\1\151\1\147\1\60\1\uffff\1\145\1\157\1\144\2\157\1\151\1\164\2\uffff\1\145\1\141\1\157\1\162\1\114\1\156\1\164\2\157\1\114\1\145\1\uffff\1\116\1\144\1\145\1\uffff\1\164\1\156\1\145\1\166\1\143\1\157\1\60\1\163\1\162\1\143\1\163\1\157\2\60\2\156\1\157\1\60\1\141\4\60\1\162\1\151\1\141\1\156\1\uffff\1\157\1\144\1\141\1\60\1\143\2\uffff\2\60\1\143\1\uffff\1\164\4\uffff\1\60\1\144\1\164\1\60\1\165\1\167\1\164\1\uffff\1\141\2\uffff\1\141\1\165\1\uffff\1\145\1\151\1\uffff\1\162\1\141\1\151\2\164\2\162\1\157\1\143\1\162\1\157\2\151\1\141\1\60\1\156\2\145\1\156\2\157\1\154\1\uffff\2\60\1\122\1\60\2\156\1\60\2\uffff\1\145\1\uffff\2\60\1\uffff\1\163\2\uffff\1\157\1\165\1\162\1\143\1\145\1\111\1\156\1\163\1\164\1\141\1\156\1\143\1\145\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\2\uffff\1\165\1\164\1\162\1\145\1\uffff\1\157\1\160\1\157\3\uffff\1\72\1\151\1\145\1\157\1\162\1\157\1\156\1\157\1\151\1\53\1\136\1\uffff\1\170\1\76\1\75\1\56\1\157\1\156\1\145\1\164\1\156\1\162\1\76\1\uffff\1\52\1\156\1\157\1\56\1\141\1\165\1\157\1\141\1\162\3\uffff\1\77\1\46\1\44\2\uffff\1\47\6\uffff\1\155\1\164\1\154\1\uffff\1\157\1\162\1\155\1\154\1\172\1\163\1\uffff\1\167\1\142\1\164\1\160\1\163\3\uffff\1\52\1\uffff\1\163\1\146\1\151\1\165\1\145\1\163\1\143\1\156\1\160\2\172\1\162\1\154\1\141\1\156\1\170\5\uffff\1\144\1\163\1\164\11\uffff\1\157\1\147\1\164\1\141\1\162\1\164\2\154\1\144\7\uffff\1\144\1\162\2\uffff\2\160\1\154\1\155\1\165\1\145\15\uffff\1\145\1\172\1\154\1\162\1\164\1\166\1\146\1\141\1\145\1\172\1\uffff\1\141\1\157\1\165\1\145\1\162\1\172\1\145\1\172\2\uffff\1\143\1\172\1\151\1\146\1\147\1\156\1\171\1\172\1\164\1\153\1\164\1\154\1\157\1\172\1\154\1\164\2\uffff\1\142\2\163\2\172\1\160\2\145\1\154\1\172\1\145\1\154\1\151\1\172\1\165\1\151\1\126\1\145\3\172\2\154\1\142\1\145\1\156\1\120\1\uffff\1\172\1\141\2\151\1\172\1\162\1\114\1\157\1\uffff\1\164\1\165\1\151\1\162\1\141\1\uffff\1\162\1\uffff\1\162\1\uffff\1\166\1\145\1\150\1\144\1\172\1\151\1\uffff\1\172\1\141\1\154\1\164\1\145\1\157\1\151\1\162\1\154\1\uffff\1\165\1\172\1\151\1\145\1\165\2\uffff\1\141\1\146\1\172\1\156\1\145\1\uffff\1\147\1\172\1\156\1\uffff\1\145\1\155\2\156\1\145\1\164\1\157\1\162\3\uffff\2\145\1\144\2\172\1\162\1\uffff\1\147\2\143\1\uffff\1\141\1\157\1\156\1\151\2\162\1\172\1\162\1\172\1\151\1\145\1\162\1\164\1\172\1\uffff\1\163\1\uffff\1\147\1\165\1\162\1\170\1\143\1\145\1\164\1\151\1\144\1\uffff\1\144\1\172\1\162\1\143\1\172\1\146\1\uffff\1\144\1\141\1\145\1\uffff\1\147\1\156\1\151\1\171\1\166\1\163\1\141\1\151\1\145\1\172\1\143\1\141\2\uffff\1\157\1\145\1\172\1\145\1\164\1\143\1\164\1\157\1\143\1\145\1\uffff\1\171\1\uffff\1\160\1\172\1\145\1\172\1\uffff\2\145\1\163\1\141\1\164\2\141\1\163\1\172\1\144\1\145\1\144\1\uffff\1\145\1\153\1\uffff\1\172\1\163\1\156\1\162\1\172\1\143\1\164\1\172\1\141\1\163\1\164\2\144\1\uffff\1\164\1\172\1\166\1\120\1\uffff\1\172\1\145\1\141\1\145\1\156\1\145\1\144\1\172\1\164\1\uffff\1\156\1\uffff\2\172\2\151\1\172\2\164\1\172\1\uffff\2\172\1\145\1\172\1\141\1\uffff\3\172\1\uffff\2\145\1\uffff\1\154\1\141\1\145\1\172\1\123\1\151\1\uffff\1\151\1\162\1\uffff\1\114\1\164\1\170\2\172\1\122\1\uffff\1\157\1\164\2\uffff\1\157\1\156\1\uffff\2\151\3\uffff\1\156\1\uffff\1\147\3\uffff\1\172\1\144\1\151\1\147\1\172\1\uffff\1\145\1\157\1\144\2\157\1\151\1\164\2\uffff\1\145\1\141\1\157\1\162\1\114\1\156\1\164\2\157\1\114\1\145\1\uffff\1\116\1\144\1\145\1\uffff\1\164\1\156\1\145\1\166\1\143\1\157\1\172\1\163\1\162\1\143\1\163\1\157\2\172\2\156\1\157\1\172\1\141\4\172\1\162\1\151\1\141\1\156\1\uffff\1\157\1\144\1\141\1\172\1\143\2\uffff\2\172\1\143\1\uffff\1\164\4\uffff\1\172\1\144\1\164\1\172\1\165\1\167\1\164\1\uffff\1\141\2\uffff\1\141\1\165\1\uffff\1\145\1\151\1\uffff\1\162\1\141\1\151\2\164\2\162\1\157\1\143\1\162\1\157\2\151\1\141\1\172\1\156\2\145\1\156\2\157\1\154\1\uffff\2\172\1\122\1\172\2\156\1\172\2\uffff\1\145\1\uffff\2\172\1\uffff\1\163\2\uffff\1\157\1\165\1\162\1\143\1\145\1\111\1\156\1\163\1\164\1\141\1\156\1\143\1\145\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\11\3\uffff\1\15\1\16\1\17\13\uffff\1\45\13\uffff\1\100\11\uffff\1\135\1\136\1\137\6\uffff\1\167\1\171\1\174\1\175\1\1\1\2\3\uffff\1\167\6\uffff\1\11\5\uffff\1\15\1\16\1\17\1\uffff\1\20\20\uffff\1\126\1\36\1\40\1\37\1\45\3\uffff\1\103\1\104\1\130\1\61\1\102\1\62\1\113\1\114\1\63\11\uffff\1\112\1\173\1\76\1\100\1\166\1\172\1\101\2\uffff\1\125\1\111\6\uffff\1\135\1\136\1\137\1\151\1\152\1\141\1\154\1\163\1\164\1\165\1\170\1\171\1\174\12\uffff\1\106\10\uffff\1\51\1\117\20\uffff\1\140\1\142\33\uffff\1\77\10\uffff\1\10\5\uffff\1\147\1\uffff\1\14\1\uffff\1\44\6\uffff\1\52\11\uffff\1\42\5\uffff\1\161\1\162\5\uffff\1\121\3\uffff\1\120\10\uffff\1\105\1\107\1\115\6\uffff\1\134\3\uffff\1\150\16\uffff\1\54\1\uffff\1\53\11\uffff\1\60\6\uffff\1\144\3\uffff\1\66\14\uffff\1\131\1\143\12\uffff\1\12\1\uffff\1\13\4\uffff\1\23\14\uffff\1\132\2\uffff\1\145\15\uffff\1\116\4\uffff\1\43\11\uffff\1\57\1\uffff\1\22\10\uffff\1\46\5\uffff\1\146\3\uffff\1\67\2\uffff\1\71\6\uffff\1\127\2\uffff\1\6\6\uffff\1\50\2\uffff\1\24\1\55\2\uffff\1\41\2\uffff\1\110\1\133\1\47\1\uffff\1\35\1\uffff\1\153\1\64\1\65\5\uffff\1\75\7\uffff\1\7\1\27\13\uffff\1\122\3\uffff\1\74\33\uffff\1\5\5\uffff\1\25\1\26\3\uffff\1\56\1\uffff\1\72\1\73\1\124\1\123\7\uffff\1\21\1\uffff\1\156\1\33\2\uffff\1\3\2\uffff\1\155\26\uffff\1\4\7\uffff\1\160\1\30\1\uffff\1\32\2\uffff\1\70\1\uffff\1\157\1\34\16\uffff\1\31";
    static final String DFA11_specialS =
        "\1\0\64\uffff\1\1\1\2\u0233\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\73\2\72\2\73\1\72\22\73\1\72\1\73\1\65\3\73\1\63\1\66\1\13\1\15\1\45\1\27\1\14\1\44\1\51\1\46\12\71\1\16\1\7\1\33\1\31\1\34\1\35\1\57\1\70\1\36\1\54\5\70\1\37\2\70\1\55\1\52\1\70\1\43\2\70\1\40\1\41\1\53\1\42\5\70\1\60\1\73\1\61\1\30\1\67\1\73\1\47\1\21\1\23\1\17\1\32\1\25\2\70\1\24\2\70\1\10\1\26\1\3\1\5\1\22\1\12\1\6\1\4\1\56\1\11\1\70\1\20\1\50\2\70\1\1\1\62\1\2\45\73\1\64\uff5c\73",
            "",
            "",
            "\1\76\15\uffff\1\77\5\uffff\1\100",
            "\1\104\3\uffff\1\103\16\uffff\1\102",
            "\1\105\16\uffff\1\106",
            "\1\107",
            "",
            "\1\113\3\uffff\1\112\5\uffff\1\111",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "\1\121",
            "\1\123\3\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\131\15\uffff\1\130\2\uffff\1\127",
            "\1\132",
            "\1\135\6\uffff\1\133\1\134",
            "\1\137\15\uffff\1\136",
            "\1\142\3\uffff\1\140\3\uffff\1\141",
            "\1\143",
            "\1\145",
            "",
            "\1\151\1\uffff\1\150\11\uffff\1\152",
            "\1\155\17\uffff\1\153\1\154",
            "\1\157",
            "\1\162\1\161",
            "\1\165\15\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\171\16\uffff\1\170",
            "\1\172",
            "\1\173\16\uffff\1\174",
            "\1\176\20\uffff\1\175",
            "",
            "\1\u0081\2\uffff\1\u0082",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008d\11\uffff\1\u008c",
            "",
            "",
            "",
            "\1\u0092\15\uffff\1\u0091",
            "\1\u0094",
            "\1\u0095",
            "\0\u0096",
            "\0\u0097",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009f\15\uffff\1\u009e",
            "\1\u00a1\3\uffff\1\u00a2\1\uffff\1\u00a0",
            "\1\u00a3",
            "\1\u00a4",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00a6\4\uffff\1\u00a8\1\uffff\1\u00a7",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "\1\u00ae",
            "",
            "\1\u00b1\13\uffff\1\u00b2\1\u00b0",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\20\uffff\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00bb\1\uffff\1\u00ba",
            "\1\u00bc",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\u00be\5\101\1\u00bf\14\101\1\u00bd\4\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00d0\2\uffff\1\u00cf",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dc",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\101\7\uffff\2\101\1\u00e5\27\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00ed",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "\1\u00ef",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\14\101\1\u00f6\15\101",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\17\uffff\1\u00fb\1\u00fc",
            "\1\u00fd",
            "\1\u00fe\2\uffff\1\u00ff",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\u0100\31\101",
            "\1\u0102",
            "\1\u0103",
            "",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u010a\6\uffff\1\u0109",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115\7\uffff\1\u0116\3\uffff\1\u0117\5\uffff\1\u0118\2\uffff\1\u0119",
            "\1\u011a",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0138",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\u0142",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\10\101\1\u0149\21\101",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "",
            "",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0168",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175\1\uffff\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u017c",
            "\1\u017d",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "\1\u018f",
            "\1\u0190",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "",
            "\1\u019a",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u019c",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01b1",
            "\1\u01b2",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01c9",
            "\1\u01ca",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01cc",
            "\1\u01cd",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01d1",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01d3",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01dd",
            "\1\u01de",
            "",
            "\1\u01df",
            "\1\u01e0",
            "",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01e7\3\uffff\1\u01e8\5\uffff\1\u01e6",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "",
            "",
            "",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u021d",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u022a",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u022d",
            "",
            "\1\u022e",
            "",
            "",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0230",
            "\1\u0231",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "\1\u0236",
            "",
            "",
            "\1\u0237",
            "\1\u0238",
            "",
            "\1\u0239",
            "\1\u023a",
            "",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0253",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u0255",
            "\1\u0256",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "\1\u0258",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u025b",
            "",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | RULE_UNQUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
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

                        else if ( (LA11_0=='n') ) {s = 3;}

                        else if ( (LA11_0=='s') ) {s = 4;}

                        else if ( (LA11_0=='o') ) {s = 5;}

                        else if ( (LA11_0=='r') ) {s = 6;}

                        else if ( (LA11_0==';') ) {s = 7;}

                        else if ( (LA11_0=='l') ) {s = 8;}

                        else if ( (LA11_0=='u') ) {s = 9;}

                        else if ( (LA11_0=='q') ) {s = 10;}

                        else if ( (LA11_0=='(') ) {s = 11;}

                        else if ( (LA11_0==',') ) {s = 12;}

                        else if ( (LA11_0==')') ) {s = 13;}

                        else if ( (LA11_0==':') ) {s = 14;}

                        else if ( (LA11_0=='d') ) {s = 15;}

                        else if ( (LA11_0=='w') ) {s = 16;}

                        else if ( (LA11_0=='b') ) {s = 17;}

                        else if ( (LA11_0=='p') ) {s = 18;}

                        else if ( (LA11_0=='c') ) {s = 19;}

                        else if ( (LA11_0=='i') ) {s = 20;}

                        else if ( (LA11_0=='f') ) {s = 21;}

                        else if ( (LA11_0=='m') ) {s = 22;}

                        else if ( (LA11_0=='+') ) {s = 23;}

                        else if ( (LA11_0=='^') ) {s = 24;}

                        else if ( (LA11_0=='=') ) {s = 25;}

                        else if ( (LA11_0=='e') ) {s = 26;}

                        else if ( (LA11_0=='<') ) {s = 27;}

                        else if ( (LA11_0=='>') ) {s = 28;}

                        else if ( (LA11_0=='?') ) {s = 29;}

                        else if ( (LA11_0=='B') ) {s = 30;}

                        else if ( (LA11_0=='I') ) {s = 31;}

                        else if ( (LA11_0=='R') ) {s = 32;}

                        else if ( (LA11_0=='S') ) {s = 33;}

                        else if ( (LA11_0=='U') ) {s = 34;}

                        else if ( (LA11_0=='O') ) {s = 35;}

                        else if ( (LA11_0=='-') ) {s = 36;}

                        else if ( (LA11_0=='*') ) {s = 37;}

                        else if ( (LA11_0=='/') ) {s = 38;}

                        else if ( (LA11_0=='a') ) {s = 39;}

                        else if ( (LA11_0=='x') ) {s = 40;}

                        else if ( (LA11_0=='.') ) {s = 41;}

                        else if ( (LA11_0=='M') ) {s = 42;}

                        else if ( (LA11_0=='T') ) {s = 43;}

                        else if ( (LA11_0=='C') ) {s = 44;}

                        else if ( (LA11_0=='L') ) {s = 45;}

                        else if ( (LA11_0=='t') ) {s = 46;}

                        else if ( (LA11_0=='@') ) {s = 47;}

                        else if ( (LA11_0=='[') ) {s = 48;}

                        else if ( (LA11_0==']') ) {s = 49;}

                        else if ( (LA11_0=='|') ) {s = 50;}

                        else if ( (LA11_0=='&') ) {s = 51;}

                        else if ( (LA11_0=='\u00A3') ) {s = 52;}

                        else if ( (LA11_0=='\"') ) {s = 53;}

                        else if ( (LA11_0=='\'') ) {s = 54;}

                        else if ( (LA11_0=='_') ) {s = 55;}

                        else if ( (LA11_0=='A'||(LA11_0>='D' && LA11_0<='H')||(LA11_0>='J' && LA11_0<='K')||LA11_0=='N'||(LA11_0>='P' && LA11_0<='Q')||(LA11_0>='V' && LA11_0<='Z')||(LA11_0>='g' && LA11_0<='h')||(LA11_0>='j' && LA11_0<='k')||LA11_0=='v'||(LA11_0>='y' && LA11_0<='z')) ) {s = 56;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 57;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 58;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='%')||LA11_0=='\\'||LA11_0=='`'||(LA11_0>='~' && LA11_0<='\u00A2')||(LA11_0>='\u00A4' && LA11_0<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_53 = input.LA(1);

                        s = -1;
                        if ( ((LA11_53>='\u0000' && LA11_53<='\uFFFF')) ) {s = 150;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_54 = input.LA(1);

                        s = -1;
                        if ( ((LA11_54>='\u0000' && LA11_54<='\uFFFF')) ) {s = 151;}

                        else s = 59;

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