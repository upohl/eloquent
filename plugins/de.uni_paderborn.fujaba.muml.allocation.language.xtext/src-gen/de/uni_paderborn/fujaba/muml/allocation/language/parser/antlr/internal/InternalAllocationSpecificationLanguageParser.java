package de.uni_paderborn.fujaba.muml.allocation.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_paderborn.fujaba.muml.allocation.language.services.AllocationSpecificationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAllocationSpecificationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'service'", "'qos'", "'value'", "';'", "'descriptors'", "','", "'ocl'", "'constraint'", "'resource'", "'lhs'", "'rhs'", "'requiredHardwareResourceInstance'", "'('", "')'", "'measure'", "'+'", "'*'", "'-'", "'not'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'Tuple'", "'::'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'['", "']'", "'?'", "':'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'", "'self'", "'sameLocation'", "'differentLocation'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ESCAPED_ID=5;
    public static final int RULE_DOUBLE_QUOTED_STRING=10;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int RULE_ML_SINGLE_QUOTED_STRING=11;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__84=84;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalAllocationSpecificationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAllocationSpecificationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAllocationSpecificationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AllocationSpecificationLanguageGrammarAccess grammarAccess;
     	
        public InternalAllocationSpecificationLanguageParser(TokenStream input, AllocationSpecificationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected AllocationSpecificationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecification"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:74:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:75:2: (iv_ruleSpecification= ruleSpecification EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:76:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSpecification_in_entryRuleSpecification81);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpecification91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:83:1: ruleSpecification returns [EObject current=null] : ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) )? otherlv_6= '}' ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_services_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_measure_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:86:28: ( ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) )? otherlv_6= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:87:1: ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) )? otherlv_6= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:87:1: ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) )? otherlv_6= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:87:2: () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) )? otherlv_6= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:87:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSpecificationAccess().getSpecificationCSAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:96:2: ( (lv_name_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:97:1: (lv_name_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:97:1: (lv_name_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:98:3: lv_name_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecificationAccess().getNameIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleSpecification149);
            lv_name_1_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSpecification161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:118:1: ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }
                else if ( (LA1_0==25) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:118:2: ( (lv_services_3_0= ruleService ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:118:2: ( (lv_services_3_0= ruleService ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:119:1: (lv_services_3_0= ruleService )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:119:1: (lv_services_3_0= ruleService )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:120:3: lv_services_3_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getServicesServiceParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleService_in_ruleSpecification183);
            	    lv_services_3_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"services",
            	              		lv_services_3_0, 
            	              		"Service");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:137:6: ( (lv_constraints_4_0= ruleConstraint ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:137:6: ( (lv_constraints_4_0= ruleConstraint ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:138:1: (lv_constraints_4_0= ruleConstraint )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:138:1: (lv_constraints_4_0= ruleConstraint )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:139:3: lv_constraints_4_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getConstraintsConstraintParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleSpecification210);
            	    lv_constraints_4_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_4_0, 
            	              		"Constraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:155:4: ( (lv_measure_5_0= ruleMeasureFunction ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:156:1: (lv_measure_5_0= ruleMeasureFunction )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:156:1: (lv_measure_5_0= ruleMeasureFunction )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:157:3: lv_measure_5_0= ruleMeasureFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpecificationAccess().getMeasureMeasureFunctionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMeasureFunction_in_ruleSpecification233);
                    lv_measure_5_0=ruleMeasureFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"measure",
                              		lv_measure_5_0, 
                              		"MeasureFunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSpecification246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleService"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:185:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:186:2: (iv_ruleService= ruleService EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:187:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService282);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService292); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:194:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dimensions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:197:28: ( (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:198:1: (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:198:1: (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:198:3: otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleService329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:202:1: ( (lv_name_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:203:1: (lv_name_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:203:1: (lv_name_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:204:3: lv_name_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNameIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleService350);
            lv_name_1_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleService362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:224:1: ( (lv_dimensions_3_0= ruleQosDimension ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:225:1: (lv_dimensions_3_0= ruleQosDimension )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:225:1: (lv_dimensions_3_0= ruleQosDimension )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:226:3: lv_dimensions_3_0= ruleQosDimension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getDimensionsQosDimensionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQosDimension_in_ruleService383);
            	    lv_dimensions_3_0=ruleQosDimension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dimensions",
            	              		lv_dimensions_3_0, 
            	              		"QosDimension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleService396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleQosDimension"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:254:1: entryRuleQosDimension returns [EObject current=null] : iv_ruleQosDimension= ruleQosDimension EOF ;
    public final EObject entryRuleQosDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQosDimension = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:255:2: (iv_ruleQosDimension= ruleQosDimension EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:256:2: iv_ruleQosDimension= ruleQosDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQosDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQosDimension_in_entryRuleQosDimension432);
            iv_ruleQosDimension=ruleQosDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQosDimension; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQosDimension442); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQosDimension"


    // $ANTLR start "ruleQosDimension"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:263:1: ruleQosDimension returns [EObject current=null] : (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleModel ) ) otherlv_13= ';' otherlv_14= '}' ) ;
    public final EObject ruleQosDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_tupleDescriptors_7_0 = null;

        EObject lv_tupleDescriptors_9_0 = null;

        EObject lv_metric_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:266:28: ( (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleModel ) ) otherlv_13= ';' otherlv_14= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:267:1: (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleModel ) ) otherlv_13= ';' otherlv_14= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:267:1: (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleModel ) ) otherlv_13= ';' otherlv_14= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:267:3: otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleModel ) ) otherlv_13= ';' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQosDimension479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQosDimensionAccess().getQosKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:271:1: ( (lv_name_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:272:1: (lv_name_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:272:1: (lv_name_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:273:3: lv_name_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getNameIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleQosDimension500);
            lv_name_1_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQosDimensionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQosDimension512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQosDimensionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleQosDimension524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getQosDimensionAccess().getValueKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:297:1: ( (lv_value_4_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:298:1: (lv_value_4_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:298:1: (lv_value_4_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:299:3: lv_value_4_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getValueValueTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleQosDimension545);
            lv_value_4_0=ruleValueTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQosDimensionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"ValueTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQosDimension557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getQosDimensionAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleQosDimension569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQosDimensionAccess().getDescriptorsKeyword_6());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:323:1: ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:324:1: (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:324:1: (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:325:3: lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension590);
            lv_tupleDescriptors_7_0=ruleComponentResourceTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQosDimensionRule());
              	        }
                     		add(
                     			current, 
                     			"tupleDescriptors",
                      		lv_tupleDescriptors_7_0, 
                      		"ComponentResourceTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:341:2: (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:341:4: otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleQosDimension603); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getQosDimensionAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:345:1: ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:346:1: (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:346:1: (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:347:3: lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQosDimensionAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension624);
            	    lv_tupleDescriptors_9_0=ruleComponentResourceTupleDescriptor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQosDimensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tupleDescriptors",
            	              		lv_tupleDescriptors_9_0, 
            	              		"ComponentResourceTupleDescriptor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQosDimension638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getQosDimensionAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleQosDimension650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getQosDimensionAccess().getOclKeyword_10());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:371:1: ( (lv_metric_12_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:372:1: (lv_metric_12_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:372:1: (lv_metric_12_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:373:3: lv_metric_12_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getMetricModelParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleQosDimension671);
            lv_metric_12_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQosDimensionRule());
              	        }
                     		set(
                     			current, 
                     			"metric",
                      		lv_metric_12_0, 
                      		"Model");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQosDimension683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getQosDimensionAccess().getSemicolonKeyword_12());
                  
            }
            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQosDimension695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getQosDimensionAccess().getRightCurlyBracketKeyword_13());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQosDimension"


    // $ANTLR start "entryRuleConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:405:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:406:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:407:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint731);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint741); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:414:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_LocationConstraint_1 = null;

        EObject this_ResourceConstraint_2 = null;

        EObject this_RequiredHardwareResourceInstanceConstraint_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:417:28: ( (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:418:1: (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:418:1: (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:418:3: otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstraint778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:422:1: (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 84:
            case 85:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:423:2: this_LocationConstraint_1= ruleLocationConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getLocationConstraintParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLocationConstraint_in_ruleConstraint804);
                    this_LocationConstraint_1=ruleLocationConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocationConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:436:2: this_ResourceConstraint_2= ruleResourceConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getResourceConstraintParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleResourceConstraint_in_ruleConstraint834);
                    this_ResourceConstraint_2=ruleResourceConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ResourceConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:449:2: this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getRequiredHardwareResourceInstanceConstraintParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_ruleConstraint864);
                    this_RequiredHardwareResourceInstanceConstraint_3=ruleRequiredHardwareResourceInstanceConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RequiredHardwareResourceInstanceConstraint_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLocationConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:468:1: entryRuleLocationConstraint returns [EObject current=null] : iv_ruleLocationConstraint= ruleLocationConstraint EOF ;
    public final EObject entryRuleLocationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:469:2: (iv_ruleLocationConstraint= ruleLocationConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:470:2: iv_ruleLocationConstraint= ruleLocationConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationConstraint_in_entryRuleLocationConstraint900);
            iv_ruleLocationConstraint=ruleLocationConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationConstraint910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationConstraint"


    // $ANTLR start "ruleLocationConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:477:1: ruleLocationConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'ocl' ( (lv_expression_7_0= ruleModel ) ) otherlv_8= ';' otherlv_9= '}' ) ;
    public final EObject ruleLocationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tupleDescriptor_4_0 = null;

        EObject lv_expression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:480:28: ( ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'ocl' ( (lv_expression_7_0= ruleModel ) ) otherlv_8= ';' otherlv_9= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:1: ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'ocl' ( (lv_expression_7_0= ruleModel ) ) otherlv_8= ';' otherlv_9= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:1: ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'ocl' ( (lv_expression_7_0= ruleModel ) ) otherlv_8= ';' otherlv_9= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:2: ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'ocl' ( (lv_expression_7_0= ruleModel ) ) otherlv_8= ';' otherlv_9= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:2: ( (lv_type_0_0= ruleLocationConstraintType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:482:1: (lv_type_0_0= ruleLocationConstraintType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:482:1: (lv_type_0_0= ruleLocationConstraintType )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:483:3: lv_type_0_0= ruleLocationConstraintType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTypeLocationConstraintTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationConstraintType_in_ruleLocationConstraint956);
            lv_type_0_0=ruleLocationConstraintType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"LocationConstraintType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:499:2: ( (lv_name_1_0= ruleID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SIMPLE_ID && LA6_0<=RULE_ESCAPED_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:500:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:500:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:501:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationConstraint977);
                    lv_name_1_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLocationConstraint990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocationConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLocationConstraint1002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocationConstraintAccess().getDescriptorsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:525:1: ( (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:526:1: (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:526:1: (lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:527:3: lv_tupleDescriptor_4_0= ruleLocationTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTupleDescriptorLocationTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1023);
            lv_tupleDescriptor_4_0=ruleLocationTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"tupleDescriptor",
                      		lv_tupleDescriptor_4_0, 
                      		"LocationTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLocationConstraint1035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLocationConstraintAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocationConstraint1047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLocationConstraintAccess().getOclKeyword_6());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:551:1: ( (lv_expression_7_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:552:1: (lv_expression_7_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:552:1: (lv_expression_7_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:553:3: lv_expression_7_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getExpressionModelParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleLocationConstraint1068);
            lv_expression_7_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_7_0, 
                      		"Model");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLocationConstraint1080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getLocationConstraintAccess().getSemicolonKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLocationConstraint1092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getLocationConstraintAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationConstraint"


    // $ANTLR start "entryRuleResourceConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:585:1: entryRuleResourceConstraint returns [EObject current=null] : iv_ruleResourceConstraint= ruleResourceConstraint EOF ;
    public final EObject entryRuleResourceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:586:2: (iv_ruleResourceConstraint= ruleResourceConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:587:2: iv_ruleResourceConstraint= ruleResourceConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceConstraint_in_entryRuleResourceConstraint1128);
            iv_ruleResourceConstraint=ruleResourceConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceConstraint1138); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceConstraint"


    // $ANTLR start "ruleResourceConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:594:1: ruleResourceConstraint returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' ) ;
    public final EObject ruleResourceConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lhs_4_0 = null;

        EObject lv_rhs_7_0 = null;

        EObject lv_tupleDescriptors_10_0 = null;

        EObject lv_tupleDescriptors_12_0 = null;

        EObject lv_expression_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:597:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:598:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:598:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:598:3: otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleResourceConstraint1175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getResourceConstraintAccess().getResourceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:602:1: ( (lv_name_1_0= ruleID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIMPLE_ID && LA7_0<=RULE_ESCAPED_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:603:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:603:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:604:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleResourceConstraint1196);
                    lv_name_1_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleResourceConstraint1209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getResourceConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleResourceConstraint1221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getResourceConstraintAccess().getLhsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:628:1: ( (lv_lhs_4_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:629:1: (lv_lhs_4_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:629:1: (lv_lhs_4_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:630:3: lv_lhs_4_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getLhsValueTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1242);
            lv_lhs_4_0=ruleValueTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResourceConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_4_0, 
                      		"ValueTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleResourceConstraint1266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getResourceConstraintAccess().getRhsKeyword_6());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:654:1: ( (lv_rhs_7_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:655:1: (lv_rhs_7_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:655:1: (lv_rhs_7_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:656:3: lv_rhs_7_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getRhsValueTupleDescriptorParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1287);
            lv_rhs_7_0=ruleValueTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResourceConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_7_0, 
                      		"ValueTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleResourceConstraint1311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getResourceConstraintAccess().getDescriptorsKeyword_9());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:680:1: ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:681:1: (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:681:1: (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:682:3: lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1332);
            lv_tupleDescriptors_10_0=ruleComponentResourceTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResourceConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"tupleDescriptors",
                      		lv_tupleDescriptors_10_0, 
                      		"ComponentResourceTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:698:2: (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:698:4: otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleResourceConstraint1345); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getResourceConstraintAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:702:1: ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:703:1: (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:703:1: (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:704:3: lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1366);
            	    lv_tupleDescriptors_12_0=ruleComponentResourceTupleDescriptor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getResourceConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tupleDescriptors",
            	              		lv_tupleDescriptors_12_0, 
            	              		"ComponentResourceTupleDescriptor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_12());
                  
            }
            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleResourceConstraint1392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getResourceConstraintAccess().getOclKeyword_13());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:728:1: ( (lv_expression_15_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:729:1: (lv_expression_15_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:729:1: (lv_expression_15_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:730:3: lv_expression_15_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getExpressionModelParserRuleCall_14_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleResourceConstraint1413);
            lv_expression_15_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResourceConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_15_0, 
                      		"Model");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_15());
                  
            }
            otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResourceConstraint1437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getResourceConstraintAccess().getRightCurlyBracketKeyword_16());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceConstraint"


    // $ANTLR start "entryRuleRequiredHardwareResourceInstanceConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:762:1: entryRuleRequiredHardwareResourceInstanceConstraint returns [EObject current=null] : iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF ;
    public final EObject entryRuleRequiredHardwareResourceInstanceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredHardwareResourceInstanceConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:763:2: (iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:764:2: iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_entryRuleRequiredHardwareResourceInstanceConstraint1473);
            iv_ruleRequiredHardwareResourceInstanceConstraint=ruleRequiredHardwareResourceInstanceConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredHardwareResourceInstanceConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredHardwareResourceInstanceConstraint1483); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredHardwareResourceInstanceConstraint"


    // $ANTLR start "ruleRequiredHardwareResourceInstanceConstraint"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:771:1: ruleRequiredHardwareResourceInstanceConstraint returns [EObject current=null] : (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleRequiredHardwareResourceInstanceConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tupleDescriptors_4_0 = null;

        EObject lv_tupleDescriptors_6_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:774:28: ( (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:775:1: (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:775:1: (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:775:3: otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRequiredHardwareResourceInstanceConstraint1520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRequiredHardwareResourceInstanceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:779:1: ( (lv_name_1_0= ruleID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_SIMPLE_ID && LA9_0<=RULE_ESCAPED_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:780:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:780:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:781:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleRequiredHardwareResourceInstanceConstraint1541);
                    lv_name_1_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRequiredHardwareResourceInstanceConstraint1554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRequiredHardwareResourceInstanceConstraint1566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getDescriptorsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:805:1: ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:806:1: (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:806:1: (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:807:3: lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1587);
            lv_tupleDescriptors_4_0=ruleComponentResourceTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"tupleDescriptors",
                      		lv_tupleDescriptors_4_0, 
                      		"ComponentResourceTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:823:2: (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:823:4: otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRequiredHardwareResourceInstanceConstraint1600); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:827:1: ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:828:1: (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:828:1: (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:829:3: lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1621);
            	    lv_tupleDescriptors_6_0=ruleComponentResourceTupleDescriptor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tupleDescriptors",
            	              		lv_tupleDescriptors_6_0, 
            	              		"ComponentResourceTupleDescriptor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRequiredHardwareResourceInstanceConstraint1647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getOclKeyword_7());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:853:1: ( (lv_expression_9_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:854:1: (lv_expression_9_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:854:1: (lv_expression_9_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:855:3: lv_expression_9_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getExpressionModelParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleRequiredHardwareResourceInstanceConstraint1668);
            lv_expression_9_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_9_0, 
                      		"Model");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRequiredHardwareResourceInstanceConstraint1692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredHardwareResourceInstanceConstraint"


    // $ANTLR start "entryRuleLocationTupleDescriptor"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:887:1: entryRuleLocationTupleDescriptor returns [EObject current=null] : iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF ;
    public final EObject entryRuleLocationTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:888:2: (iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:889:2: iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_entryRuleLocationTupleDescriptor1728);
            iv_ruleLocationTupleDescriptor=ruleLocationTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationTupleDescriptor1738); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationTupleDescriptor"


    // $ANTLR start "ruleLocationTupleDescriptor"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:896:1: ruleLocationTupleDescriptor returns [EObject current=null] : (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' ) ;
    public final EObject ruleLocationTupleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_instance_1_0 = null;

        AntlrDatatypeRuleToken lv_secondInstance_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:899:28: ( (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:900:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:900:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:900:3: otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocationTupleDescriptor1775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationTupleDescriptorAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:904:1: ( (lv_instance_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:905:1: (lv_instance_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:905:1: (lv_instance_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:906:3: lv_instance_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationTupleDescriptorAccess().getInstanceIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationTupleDescriptor1796);
            lv_instance_1_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationTupleDescriptorRule());
              	        }
                     		set(
                     			current, 
                     			"instance",
                      		lv_instance_1_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocationTupleDescriptor1808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocationTupleDescriptorAccess().getCommaKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:926:1: ( (lv_secondInstance_3_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:927:1: (lv_secondInstance_3_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:927:1: (lv_secondInstance_3_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:928:3: lv_secondInstance_3_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationTupleDescriptorAccess().getSecondInstanceIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationTupleDescriptor1829);
            lv_secondInstance_3_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationTupleDescriptorRule());
              	        }
                     		set(
                     			current, 
                     			"secondInstance",
                      		lv_secondInstance_3_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLocationTupleDescriptor1841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocationTupleDescriptorAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationTupleDescriptor"


    // $ANTLR start "entryRuleValueTupleDescriptor"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:956:1: entryRuleValueTupleDescriptor returns [EObject current=null] : iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF ;
    public final EObject entryRuleValueTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:957:2: (iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:958:2: iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_entryRuleValueTupleDescriptor1877);
            iv_ruleValueTupleDescriptor=ruleValueTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueTupleDescriptor1887); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueTupleDescriptor"


    // $ANTLR start "ruleValueTupleDescriptor"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:965:1: ruleValueTupleDescriptor returns [EObject current=null] : ( (lv_value_0_0= ruleID ) ) ;
    public final EObject ruleValueTupleDescriptor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:968:28: ( ( (lv_value_0_0= ruleID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:969:1: ( (lv_value_0_0= ruleID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:969:1: ( (lv_value_0_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:970:1: (lv_value_0_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:970:1: (lv_value_0_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:971:3: lv_value_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueTupleDescriptorAccess().getValueIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleValueTupleDescriptor1932);
            lv_value_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueTupleDescriptorRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueTupleDescriptor"


    // $ANTLR start "entryRuleComponentResourceTupleDescriptor"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:995:1: entryRuleComponentResourceTupleDescriptor returns [EObject current=null] : iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF ;
    public final EObject entryRuleComponentResourceTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentResourceTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:996:2: (iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:997:2: iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_entryRuleComponentResourceTupleDescriptor1967);
            iv_ruleComponentResourceTupleDescriptor=ruleComponentResourceTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentResourceTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentResourceTupleDescriptor1977); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentResourceTupleDescriptor"


    // $ANTLR start "ruleComponentResourceTupleDescriptor"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1004:1: ruleComponentResourceTupleDescriptor returns [EObject current=null] : (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' ) ;
    public final EObject ruleComponentResourceTupleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_instance_1_0 = null;

        AntlrDatatypeRuleToken lv_hwresinstance_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1007:28: ( (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1008:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1008:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1008:3: otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentResourceTupleDescriptor2014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentResourceTupleDescriptorAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1012:1: ( (lv_instance_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1013:1: (lv_instance_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1013:1: (lv_instance_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1014:3: lv_instance_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorAccess().getInstanceIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2035);
            lv_instance_1_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentResourceTupleDescriptorRule());
              	        }
                     		set(
                     			current, 
                     			"instance",
                      		lv_instance_1_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComponentResourceTupleDescriptor2047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentResourceTupleDescriptorAccess().getCommaKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1034:1: ( (lv_hwresinstance_3_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1035:1: (lv_hwresinstance_3_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1035:1: (lv_hwresinstance_3_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1036:3: lv_hwresinstance_3_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorAccess().getHwresinstanceIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2068);
            lv_hwresinstance_3_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentResourceTupleDescriptorRule());
              	        }
                     		set(
                     			current, 
                     			"hwresinstance",
                      		lv_hwresinstance_3_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentResourceTupleDescriptor2080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getComponentResourceTupleDescriptorAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentResourceTupleDescriptor"


    // $ANTLR start "entryRuleMeasureFunction"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1064:1: entryRuleMeasureFunction returns [EObject current=null] : iv_ruleMeasureFunction= ruleMeasureFunction EOF ;
    public final EObject entryRuleMeasureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureFunction = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1065:2: (iv_ruleMeasureFunction= ruleMeasureFunction EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1066:2: iv_ruleMeasureFunction= ruleMeasureFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasureFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMeasureFunction_in_entryRuleMeasureFunction2116);
            iv_ruleMeasureFunction=ruleMeasureFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasureFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeasureFunction2126); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasureFunction"


    // $ANTLR start "ruleMeasureFunction"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1073:1: ruleMeasureFunction returns [EObject current=null] : (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMeasureFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1076:28: ( (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1077:1: (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1077:1: (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1077:3: otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMeasureFunction2163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMeasureFunctionAccess().getMeasureKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1081:1: ( ( ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1082:1: ( ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1082:1: ( ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1083:3: ruleID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMeasureFunctionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMeasureFunctionAccess().getServicesServiceCSCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleMeasureFunction2190);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1099:2: (otherlv_2= '+' ( ( ruleID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1099:4: otherlv_2= '+' ( ( ruleID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMeasureFunction2203); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMeasureFunctionAccess().getPlusSignKeyword_2_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1103:1: ( ( ruleID ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1104:1: ( ruleID )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1104:1: ( ruleID )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1105:3: ruleID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMeasureFunctionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMeasureFunctionAccess().getServicesServiceCSCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleMeasureFunction2230);
            	    ruleID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMeasureFunction2244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMeasureFunctionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasureFunction"


    // $ANTLR start "entryRuleModel"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1133:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1134:2: (iv_ruleModel= ruleModel EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1135:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel2280);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel2290); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1142:1: ruleModel returns [EObject current=null] : ( (lv_ownedExpression_0_0= ruleExpCS ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1145:28: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1146:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1146:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1147:1: (lv_ownedExpression_0_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1147:1: (lv_ownedExpression_0_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1148:3: lv_ownedExpression_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getOwnedExpressionExpCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleModel2335);
            lv_ownedExpression_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpression",
                      		lv_ownedExpression_0_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleID"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1172:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1173:2: (iv_ruleID= ruleID EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1174:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID2371);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID2382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1181:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1184:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1185:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1185:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SIMPLE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ESCAPED_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1185:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID2422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1193:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID2448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESCAPED_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleLOWER"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1208:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1209:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1210:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER2494);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER2505); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1217:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1220:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1221:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER2544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleUPPER"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1236:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1237:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1238:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER2589);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER2600); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1245:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1248:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1249:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1249:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1249:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER2640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1258:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUPPER2664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1271:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1272:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1273:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL2705);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL2716); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1280:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1283:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1284:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL2755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleURI"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1299:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1300:2: (iv_ruleURI= ruleURI EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1301:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI2800);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI2811); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1308:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1311:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1312:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI2850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getURIAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1329:1: entryRuleEssentialOCLUnaryOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLUnaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1330:2: (iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1331:2: iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_entryRuleEssentialOCLUnaryOperatorCS2896);
            iv_ruleEssentialOCLUnaryOperatorCS=ruleEssentialOCLUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorCS2906); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorCS"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1338:1: ruleEssentialOCLUnaryOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) ) ;
    public final EObject ruleEssentialOCLUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1341:28: ( ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1342:1: ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1342:1: ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1343:1: ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1343:1: ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1344:1: (lv_name_0_1= '-' | lv_name_0_2= 'not' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1344:1: (lv_name_0_1= '-' | lv_name_0_2= 'not' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1345:3: lv_name_0_1= '-'
                    {
                    lv_name_0_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLUnaryOperatorCS2950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_1, grammarAccess.getEssentialOCLUnaryOperatorCSAccess().getNameHyphenMinusKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLUnaryOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1357:8: lv_name_0_2= 'not'
                    {
                    lv_name_0_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLUnaryOperatorCS2979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_2, grammarAccess.getEssentialOCLUnaryOperatorCSAccess().getNameNotKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLUnaryOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnaryOperatorCS"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1380:1: entryRuleEssentialOCLInfixOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLInfixOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1381:2: (iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1382:2: iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorCS_in_entryRuleEssentialOCLInfixOperatorCS3030);
            iv_ruleEssentialOCLInfixOperatorCS=ruleEssentialOCLInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorCS3040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorCS"


    // $ANTLR start "ruleEssentialOCLInfixOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1389:1: ruleEssentialOCLInfixOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) ) ;
    public final EObject ruleEssentialOCLInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        Token lv_name_0_9=null;
        Token lv_name_0_10=null;
        Token lv_name_0_11=null;
        Token lv_name_0_12=null;
        Token lv_name_0_13=null;
        Token lv_name_0_14=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1392:28: ( ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1393:1: ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1393:1: ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1394:1: ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1394:1: ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1395:1: (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1395:1: (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' )
            int alt15=14;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            case 38:
                {
                alt15=5;
                }
                break;
            case 39:
                {
                alt15=6;
                }
                break;
            case 40:
                {
                alt15=7;
                }
                break;
            case 41:
                {
                alt15=8;
                }
                break;
            case 42:
                {
                alt15=9;
                }
                break;
            case 43:
                {
                alt15=10;
                }
                break;
            case 44:
                {
                alt15=11;
                }
                break;
            case 45:
                {
                alt15=12;
                }
                break;
            case 46:
                {
                alt15=13;
                }
                break;
            case 47:
                {
                alt15=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1396:3: lv_name_0_1= '*'
                    {
                    lv_name_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorCS3084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_1, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameAsteriskKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1408:8: lv_name_0_2= '/'
                    {
                    lv_name_0_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorCS3113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_2, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameSolidusKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1420:8: lv_name_0_3= '+'
                    {
                    lv_name_0_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLInfixOperatorCS3142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_3, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNamePlusSignKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1432:8: lv_name_0_4= '-'
                    {
                    lv_name_0_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLInfixOperatorCS3171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_4, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameHyphenMinusKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1444:8: lv_name_0_5= '>'
                    {
                    lv_name_0_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorCS3200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_5, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameGreaterThanSignKeyword_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_5, null);
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1456:8: lv_name_0_6= '<'
                    {
                    lv_name_0_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorCS3229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_6, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameLessThanSignKeyword_0_5());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_6, null);
                      	    
                    }

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1468:8: lv_name_0_7= '>='
                    {
                    lv_name_0_7=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorCS3258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_7, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameGreaterThanSignEqualsSignKeyword_0_6());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_7, null);
                      	    
                    }

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1480:8: lv_name_0_8= '<='
                    {
                    lv_name_0_8=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorCS3287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_8, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameLessThanSignEqualsSignKeyword_0_7());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_8, null);
                      	    
                    }

                    }
                    break;
                case 9 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1492:8: lv_name_0_9= '='
                    {
                    lv_name_0_9=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorCS3316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_9, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameEqualsSignKeyword_0_8());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_9, null);
                      	    
                    }

                    }
                    break;
                case 10 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1504:8: lv_name_0_10= '<>'
                    {
                    lv_name_0_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorCS3345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_10, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameLessThanSignGreaterThanSignKeyword_0_9());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_10, null);
                      	    
                    }

                    }
                    break;
                case 11 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1516:8: lv_name_0_11= 'and'
                    {
                    lv_name_0_11=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorCS3374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_11, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameAndKeyword_0_10());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_11, null);
                      	    
                    }

                    }
                    break;
                case 12 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1528:8: lv_name_0_12= 'or'
                    {
                    lv_name_0_12=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorCS3403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_12, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameOrKeyword_0_11());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_12, null);
                      	    
                    }

                    }
                    break;
                case 13 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1540:8: lv_name_0_13= 'xor'
                    {
                    lv_name_0_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorCS3432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_13, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameXorKeyword_0_12());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_13, null);
                      	    
                    }

                    }
                    break;
                case 14 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1552:8: lv_name_0_14= 'implies'
                    {
                    lv_name_0_14=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLInfixOperatorCS3461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_14, grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameImpliesKeyword_0_13());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLInfixOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_14, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLInfixOperatorCS"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1575:1: entryRuleEssentialOCLNavigationOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLNavigationOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1576:2: (iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1577:2: iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_entryRuleEssentialOCLNavigationOperatorCS3512);
            iv_ruleEssentialOCLNavigationOperatorCS=ruleEssentialOCLNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorCS3522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorCS"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1584:1: ruleEssentialOCLNavigationOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) ) ;
    public final EObject ruleEssentialOCLNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1587:28: ( ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1588:1: ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1588:1: ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1589:1: ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1589:1: ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1590:1: (lv_name_0_1= '.' | lv_name_0_2= '->' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1590:1: (lv_name_0_1= '.' | lv_name_0_2= '->' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            else if ( (LA16_0==49) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1591:3: lv_name_0_1= '.'
                    {
                    lv_name_0_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorCS3566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_1, grammarAccess.getEssentialOCLNavigationOperatorCSAccess().getNameFullStopKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLNavigationOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1603:8: lv_name_0_2= '->'
                    {
                    lv_name_0_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorCS3595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_2, grammarAccess.getEssentialOCLNavigationOperatorCSAccess().getNameHyphenMinusGreaterThanSignKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEssentialOCLNavigationOperatorCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLNavigationOperatorCS"


    // $ANTLR start "entryRuleIdentifier"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1626:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1627:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1628:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier3647);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier3658); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1635:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1638:28: (this_ID_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1640:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier3704);
            this_ID_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1658:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1659:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1660:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3749);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral3760); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1667:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1670:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1671:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral3799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBinaryOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1686:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1687:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1688:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS3843);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS3853); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperatorCS"


    // $ANTLR start "ruleBinaryOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1695:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1698:28: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1699:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1699:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=33 && LA17_0<=35)||(LA17_0>=37 && LA17_0<=47)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=48 && LA17_0<=49)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1700:2: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS3903);
                    this_InfixOperatorCS_0=ruleInfixOperatorCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InfixOperatorCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1713:2: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS3933);
                    this_NavigationOperatorCS_1=ruleNavigationOperatorCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NavigationOperatorCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperatorCS"


    // $ANTLR start "entryRuleInfixOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1732:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1733:2: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1734:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS3968);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorCS3978); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfixOperatorCS"


    // $ANTLR start "ruleInfixOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1741:1: ruleInfixOperatorCS returns [EObject current=null] : this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLInfixOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1744:28: (this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1746:2: this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorCSAccess().getEssentialOCLInfixOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorCS_in_ruleInfixOperatorCS4027);
            this_EssentialOCLInfixOperatorCS_0=ruleEssentialOCLInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EssentialOCLInfixOperatorCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixOperatorCS"


    // $ANTLR start "entryRuleNavigationOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1765:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1766:2: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1767:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS4061);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorCS4071); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationOperatorCS"


    // $ANTLR start "ruleNavigationOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1774:1: ruleNavigationOperatorCS returns [EObject current=null] : this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLNavigationOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1777:28: (this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1779:2: this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getEssentialOCLNavigationOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_ruleNavigationOperatorCS4120);
            this_EssentialOCLNavigationOperatorCS_0=ruleEssentialOCLNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EssentialOCLNavigationOperatorCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationOperatorCS"


    // $ANTLR start "entryRuleUnaryOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1798:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1799:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1800:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS4154);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS4164); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperatorCS"


    // $ANTLR start "ruleUnaryOperatorCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1807:1: ruleUnaryOperatorCS returns [EObject current=null] : this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLUnaryOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1810:28: (this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1812:2: this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getEssentialOCLUnaryOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_ruleUnaryOperatorCS4213);
            this_EssentialOCLUnaryOperatorCS_0=ruleEssentialOCLUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EssentialOCLUnaryOperatorCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperatorCS"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1831:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1832:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1833:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName4248);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName4259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1840:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1843:28: (this_Identifier_0= ruleIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1845:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName4305);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1863:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1864:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1865:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName4350);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName4361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1872:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1875:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1877:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName4407);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1895:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1896:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1897:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName4452);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName4463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1904:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1907:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1908:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1908:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt18=1;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt18=2;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt18=3;
                }
                break;
            case 50:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1909:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName4510);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UnrestrictedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1921:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName4543);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CollectionTypeIdentifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1933:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName4576);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimitiveTypeIdentifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1945:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLUnreservedName4600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1958:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1959:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1960:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName4641);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName4652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1967:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1970:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1972:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName4698);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRulePathNameCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1990:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1991:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1992:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS4742);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS4752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1999:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2002:28: ( ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2003:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2003:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2003:2: ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2003:2: ( (lv_path_0_0= ruleFirstPathElementCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2004:1: (lv_path_0_0= ruleFirstPathElementCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2004:1: (lv_path_0_0= ruleFirstPathElementCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2005:3: lv_path_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS4798);
            lv_path_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              	        }
                     		add(
                     			current, 
                     			"path",
                      		lv_path_0_0, 
                      		"FirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2021:2: (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2021:4: otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePathNameCS4811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2025:1: ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2026:1: (lv_path_2_0= ruleNextPathElementCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2026:1: (lv_path_2_0= ruleNextPathElementCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2027:3: lv_path_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS4832);
            	    lv_path_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"path",
            	              		lv_path_2_0, 
            	              		"NextPathElementCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2051:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2052:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2053:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS4870);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS4880); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2060:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2063:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2064:1: ( ( ruleUnrestrictedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2064:1: ( ( ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2065:1: ( ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2065:1: ( ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2066:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS4931);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2090:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2091:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2092:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS4966);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS4976); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2099:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2102:28: ( ( ( ruleUnreservedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2103:1: ( ( ruleUnreservedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2103:1: ( ( ruleUnreservedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2104:1: ( ruleUnreservedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2104:1: ( ruleUnreservedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2105:3: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNextPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextPathElementCSAccess().getElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS5027);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRuleURIFirstPathElementCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2131:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2132:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2133:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS5064);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS5074); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURIFirstPathElementCS"


    // $ANTLR start "ruleURIFirstPathElementCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2140:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2143:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2144:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2144:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_SIMPLE_ID && LA20_0<=RULE_ESCAPED_ID)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2144:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2144:2: ( ( ruleUnrestrictedName ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2145:1: ( ruleUnrestrictedName )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2145:1: ( ruleUnrestrictedName )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2146:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getElementNamedElementCrossReference_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS5126);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2163:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2163:6: ( () ( ( ruleURI ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2163:7: () ( ( ruleURI ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2163:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2164:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getURIFirstPathElementCSAccess().getPathElementWithURICSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2172:2: ( ( ruleURI ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2173:1: ( ruleURI )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2173:1: ( ruleURI )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2174:3: ruleURI
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getElementNamespaceCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS5172);
                    ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURIFirstPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2198:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2199:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2200:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier5210);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier5221); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2207:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2210:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2211:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2211:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt21=1;
                }
                break;
            case 53:
                {
                alt21=2;
                }
                break;
            case 54:
                {
                alt21=3;
                }
                break;
            case 55:
                {
                alt21=4;
                }
                break;
            case 56:
                {
                alt21=5;
                }
                break;
            case 57:
                {
                alt21=6;
                }
                break;
            case 58:
                {
                alt21=7;
                }
                break;
            case 59:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2212:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePrimitiveTypeIdentifier5259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2219:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePrimitiveTypeIdentifier5278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2226:2: kw= 'Real'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier5297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2233:2: kw= 'String'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier5316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2240:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier5335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2247:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier5354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2254:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier5373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2261:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier5392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2274:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2275:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2276:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS5432);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS5442); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2283:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2286:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2287:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2287:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2288:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2288:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2289:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS5487);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"PrimitiveTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2313:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2314:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2315:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier5523);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier5534); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2322:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2325:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2326:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2326:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt22=1;
                }
                break;
            case 61:
                {
                alt22=2;
                }
                break;
            case 62:
                {
                alt22=3;
                }
                break;
            case 63:
                {
                alt22=4;
                }
                break;
            case 64:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2327:2: kw= 'Set'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCollectionTypeIdentifier5572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2334:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCollectionTypeIdentifier5591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2341:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier5610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2348:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier5629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2355:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier5648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2368:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2369:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2370:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS5688);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS5698); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2377:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2380:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2381:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2381:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2381:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2381:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2382:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2382:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2383:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS5744);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"CollectionTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2399:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2399:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionTypeCS5757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2403:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2404:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2404:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2405:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS5778);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionTypeCS5790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2433:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2434:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2435:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS5828);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS5838); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2442:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2445:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2446:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2446:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2446:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2446:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2447:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2447:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2448:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS5884);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_0_0, 
                      		"LOWER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2464:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2464:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMultiplicityBoundsCS5897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2468:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2469:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2469:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2470:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS5918);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_0, 
                              		"UPPER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2494:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2495:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2496:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS5956);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS5966); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2503:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2506:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2507:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2507:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2507:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMultiplicityCS6003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2511:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=33 && LA25_0<=34)||LA25_0==68) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2512:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS6029);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityBoundsCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2525:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS6059);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityStringCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMultiplicityCS6071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2548:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2549:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2550:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS6107);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS6117); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2557:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2560:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2561:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2561:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2562:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2562:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2563:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2563:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt26=1;
                }
                break;
            case 33:
                {
                alt26=2;
                }
                break;
            case 68:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2564:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiplicityStringCS6161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2576:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiplicityStringCS6190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2588:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMultiplicityStringCS6219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2611:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2612:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2613:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS6270);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS6280); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2620:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2623:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2624:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2624:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2624:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2624:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2625:1: (lv_name_0_0= 'Tuple' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2625:1: (lv_name_0_0= 'Tuple' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2626:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleTypeCS6323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTupleTypeCSRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2639:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2639:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleTypeCS6349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2643:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_SIMPLE_ID && LA28_0<=RULE_ESCAPED_ID)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2643:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2643:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2644:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2644:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2645:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6371);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_2_0, 
                                      		"TuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2661:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==23) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2661:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleTypeCS6384); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2665:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2666:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2666:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2667:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6405);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_4_0, 
                            	              		"TuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleTypeCS6421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2695:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2696:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2697:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS6459);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS6469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2704:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2707:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2708:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2708:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2708:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2708:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2709:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2709:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2710:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS6515);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTuplePartCS6527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2730:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2731:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2731:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2732:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS6548);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_2_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2756:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2757:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2758:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS6584);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS6594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2765:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2768:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2769:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2769:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2769:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2769:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2770:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2770:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2771:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS6640);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCollectionLiteralExpCS6652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SIMPLE_ID && LA31_0<=RULE_SINGLE_QUOTED_STRING)||LA31_0==30||(LA31_0>=34 && LA31_0<=36)||LA31_0==50||(LA31_0>=52 && LA31_0<=64)||(LA31_0>=70 && LA31_0<=73)||LA31_0==77||LA31_0==81||LA31_0==83) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2792:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2792:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2793:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6674);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"CollectionLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2809:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2809:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionLiteralExpCS6687); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2813:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2814:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2814:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2815:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6708);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"CollectionLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionLiteralExpCS6724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2843:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2844:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2845:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS6760);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS6770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2852:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2855:28: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2856:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2856:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2856:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2856:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2857:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2857:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2858:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6816);
            lv_expressionCS_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"expressionCS",
                      		lv_expressionCS_0_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2874:2: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==65) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2874:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionLiteralPartCS6829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2878:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2879:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2879:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2880:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6850);
                    lv_lastExpressionCS_2_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"lastExpressionCS",
                              		lv_lastExpressionCS_2_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleConstructorPartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2904:1: entryRuleConstructorPartCS returns [EObject current=null] : iv_ruleConstructorPartCS= ruleConstructorPartCS EOF ;
    public final EObject entryRuleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2905:2: (iv_ruleConstructorPartCS= ruleConstructorPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2906:2: iv_ruleConstructorPartCS= ruleConstructorPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS6888);
            iv_ruleConstructorPartCS=ruleConstructorPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructorPartCS6898); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructorPartCS"


    // $ANTLR start "ruleConstructorPartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2913:1: ruleConstructorPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_initExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2916:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2917:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2917:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2917:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2917:2: ( ( ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2918:1: ( ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2918:1: ( ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2919:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructorPartCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorPartCSAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS6950);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConstructorPartCS6962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstructorPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2939:1: ( (lv_initExpression_2_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2940:1: (lv_initExpression_2_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2940:1: (lv_initExpression_2_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2941:3: lv_initExpression_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorPartCSAccess().getInitExpressionExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleConstructorPartCS6983);
            lv_initExpression_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructorPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_2_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructorPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2965:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2966:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2967:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS7019);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS7029); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2974:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2977:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2978:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2978:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt33=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt33=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt33=2;
                }
                break;
            case 70:
            case 71:
                {
                alt33=3;
                }
                break;
            case 34:
                {
                alt33=4;
                }
                break;
            case 72:
                {
                alt33=5;
                }
                break;
            case 73:
                {
                alt33=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2979:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7079);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteralExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2992:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7109);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteralExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3005:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7139);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteralExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3018:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7169);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnlimitedNaturalLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3031:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7199);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvalidLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3044:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7229);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteralExpCS_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3063:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3064:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3065:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7264);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7274); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3072:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3075:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3076:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3076:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3076:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleLiteralExpCS7311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTupleLiteralExpCS7323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3084:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3085:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3085:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3086:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7344);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedParts",
                      		lv_ownedParts_2_0, 
                      		"TupleLiteralPartCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3102:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==23) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3102:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleLiteralExpCS7357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3106:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3107:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3107:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3108:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7378);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedParts",
            	              		lv_ownedParts_4_0, 
            	              		"TupleLiteralPartCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleLiteralExpCS7392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3136:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3137:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3138:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS7428);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS7438); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3145:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3148:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3149:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3149:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3149:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3149:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3150:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3150:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3151:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS7484);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3167:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3167:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTupleLiteralPartCS7497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3171:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3172:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3172:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3173:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS7518);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTupleLiteralPartCS7532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3193:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3194:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3194:1: (lv_initExpression_4_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3195:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS7553);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_4_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3219:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3220:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3221:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS7589);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS7599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3228:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3231:28: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3232:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3232:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3233:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3233:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3234:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS7644);
            lv_name_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"NUMBER_LITERAL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3258:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3259:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3260:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS7679);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS7689); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3267:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3270:28: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3271:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3271:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3272:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3272:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3273:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS7734);
            	    lv_name_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"name",
            	              		lv_name_0_0, 
            	              		"StringLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3297:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3298:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3299:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS7770);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS7780); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3306:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3309:28: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3310:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3310:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==70) ) {
                alt37=1;
            }
            else if ( (LA37_0==71) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3310:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3310:2: ( (lv_name_0_0= 'true' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3311:1: (lv_name_0_0= 'true' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3311:1: (lv_name_0_0= 'true' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3312:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleBooleanLiteralExpCS7823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getNameTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3326:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3326:6: ( (lv_name_1_0= 'false' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3327:1: (lv_name_1_0= 'false' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3327:1: (lv_name_1_0= 'false' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3328:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleBooleanLiteralExpCS7860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getNameFalseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_0, "false");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3349:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3350:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3351:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7909);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3358:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3361:28: ( ( () otherlv_1= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3362:1: ( () otherlv_1= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3362:1: ( () otherlv_1= '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3362:2: () otherlv_1= '*'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3362:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3363:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS7968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3383:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3384:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3385:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS8004);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS8014); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3392:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3395:28: ( ( () otherlv_1= 'invalid' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3396:1: ( () otherlv_1= 'invalid' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3396:1: ( () otherlv_1= 'invalid' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3396:2: () otherlv_1= 'invalid'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3396:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3397:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleInvalidLiteralExpCS8063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3417:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3418:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3419:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8099);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS8109); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3426:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3429:28: ( ( () otherlv_1= 'null' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3430:1: ( () otherlv_1= 'null' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3430:1: ( () otherlv_1= 'null' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3430:2: () otherlv_1= 'null'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3430:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3431:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleNullLiteralExpCS8158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3451:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3452:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3453:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8194);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS8204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3460:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3463:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3464:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3464:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt38=1;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt38=2;
                }
                break;
            case 50:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3465:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8254);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveTypeCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3478:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8284);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionTypeCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3491:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8314);
                    this_TupleTypeCS_2=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleTypeCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3510:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3511:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3512:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS8349);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS8359); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3519:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_multiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3522:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3523:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3523:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3524:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS8409);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3535:1: ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3536:1: (lv_multiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3536:1: (lv_multiplicity_1_0= ruleMultiplicityCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3537:3: lv_multiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS8429);
                    lv_multiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      	        }
                             		set(
                             			current, 
                             			"multiplicity",
                              		lv_multiplicity_1_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3561:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3562:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3563:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8466);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8476); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3570:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3573:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3574:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3574:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3575:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3575:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3576:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS8521);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"TypeLiteralWithMultiplicityCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3600:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3601:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3602:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS8556);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS8566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3609:1: ruleTypeNameExpCS returns [EObject current=null] : ( (lv_pathName_0_0= rulePathNameCS ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_pathName_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3612:28: ( ( (lv_pathName_0_0= rulePathNameCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3613:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3613:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3614:1: (lv_pathName_0_0= rulePathNameCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3614:1: (lv_pathName_0_0= rulePathNameCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3615:3: lv_pathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getPathNamePathNameCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS8611);
            lv_pathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"pathName",
                      		lv_pathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3639:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3640:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3641:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS8646);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS8656); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3648:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject lv_multiplicity_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3651:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3652:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3652:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3652:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3652:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_SIMPLE_ID && LA40_0<=RULE_ESCAPED_ID)) ) {
                alt40=1;
            }
            else if ( (LA40_0==50||(LA40_0>=52 && LA40_0<=64)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3653:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS8707);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeNameExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3666:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8737);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3677:2: ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==66) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3678:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3678:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3679:3: lv_multiplicity_2_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8758);
                    lv_multiplicity_2_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"multiplicity",
                              		lv_multiplicity_2_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3703:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3704:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3705:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS8795);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS8805); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3712:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedExpCS_0 = null;

        EObject lv_ownedOperator_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;

        EObject lv_ownedOperator_4_0 = null;

        EObject lv_ownedExpression_5_0 = null;

        EObject lv_ownedOperator_6_0 = null;

        EObject lv_ownedExpression_7_0 = null;

        EObject lv_ownedExpression_8_0 = null;

        EObject lv_ownedOperator_10_0 = null;

        EObject lv_ownedExpression_11_0 = null;

        EObject this_LetExpCS_12 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3715:28: ( ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3716:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3716:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3716:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3716:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3717:2: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8856);
                    this_PrefixedExpCS_0=rulePrefixedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3728:1: ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=33 && LA45_0<=35)||(LA45_0>=37 && LA45_0<=49)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3728:2: () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3728:2: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3729:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndAdd(
                                          grammarAccess.getExpCSAccess().getInfixExpCSOwnedExpressionAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3737:2: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3738:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3738:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3739:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8889);
                            lv_ownedOperator_2_0=ruleBinaryOperatorCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedOperator",
                                      		lv_ownedOperator_2_0, 
                                      		"BinaryOperatorCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3755:2: ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) )
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( ((LA44_0>=RULE_SIMPLE_ID && LA44_0<=RULE_SINGLE_QUOTED_STRING)||LA44_0==30||(LA44_0>=34 && LA44_0<=36)||LA44_0==50||(LA44_0>=52 && LA44_0<=64)||(LA44_0>=70 && LA44_0<=73)||LA44_0==77||LA44_0==83) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==81) ) {
                                alt44=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 0, input);

                                throw nvae;
                            }
                            switch (alt44) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3755:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3755:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3755:4: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )?
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3755:4: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3756:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3756:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3757:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_2_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8912);
                                    lv_ownedExpression_3_0=rulePrefixedExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"ownedExpression",
                                              		lv_ownedExpression_3_0, 
                                              		"PrefixedExpCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3773:2: ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )*
                                    loop42:
                                    do {
                                        int alt42=2;
                                        alt42 = dfa42.predict(input);
                                        switch (alt42) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3773:3: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3773:3: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3774:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3774:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3775:3: lv_ownedOperator_4_0= ruleBinaryOperatorCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_2_0_1_0_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8934);
                                    	    lv_ownedOperator_4_0=ruleBinaryOperatorCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"ownedOperator",
                                    	              		lv_ownedOperator_4_0, 
                                    	              		"BinaryOperatorCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }

                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3791:2: ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3792:1: (lv_ownedExpression_5_0= rulePrefixedExpCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3792:1: (lv_ownedExpression_5_0= rulePrefixedExpCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3793:3: lv_ownedExpression_5_0= rulePrefixedExpCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_2_0_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8955);
                                    	    lv_ownedExpression_5_0=rulePrefixedExpCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"ownedExpression",
                                    	              		lv_ownedExpression_5_0, 
                                    	              		"PrefixedExpCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop42;
                                        }
                                    } while (true);

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3809:4: ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )?
                                    int alt43=2;
                                    int LA43_0 = input.LA(1);

                                    if ( ((LA43_0>=33 && LA43_0<=35)||(LA43_0>=37 && LA43_0<=49)) ) {
                                        alt43=1;
                                    }
                                    switch (alt43) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3809:5: ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3809:5: ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3810:1: (lv_ownedOperator_6_0= ruleBinaryOperatorCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3810:1: (lv_ownedOperator_6_0= ruleBinaryOperatorCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3811:3: lv_ownedOperator_6_0= ruleBinaryOperatorCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_2_0_2_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8979);
                                            lv_ownedOperator_6_0=ruleBinaryOperatorCS();

                                            state._fsp--;
                                            if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                                              	        }
                                                     		add(
                                                     			current, 
                                                     			"ownedOperator",
                                                      		lv_ownedOperator_6_0, 
                                                      		"BinaryOperatorCS");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3827:2: ( (lv_ownedExpression_7_0= ruleLetExpCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3828:1: (lv_ownedExpression_7_0= ruleLetExpCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3828:1: (lv_ownedExpression_7_0= ruleLetExpCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3829:3: lv_ownedExpression_7_0= ruleLetExpCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_0_1_2_0_2_1_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9000);
                                            lv_ownedExpression_7_0=ruleLetExpCS();

                                            state._fsp--;
                                            if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                                              	        }
                                                     		add(
                                                     			current, 
                                                     			"ownedExpression",
                                                      		lv_ownedExpression_7_0, 
                                                      		"LetExpCS");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }


                                            }
                                            break;

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3846:6: ( (lv_ownedExpression_8_0= ruleLetExpCS ) )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3846:6: ( (lv_ownedExpression_8_0= ruleLetExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3847:1: (lv_ownedExpression_8_0= ruleLetExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3847:1: (lv_ownedExpression_8_0= ruleLetExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3848:3: lv_ownedExpression_8_0= ruleLetExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_0_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9030);
                                    lv_ownedExpression_8_0=ruleLetExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"ownedExpression",
                                              		lv_ownedExpression_8_0, 
                                              		"LetExpCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3865:6: ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3865:6: ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3865:7: () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3865:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3866:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpCSAccess().getPrefixExpCSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3874:2: ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0>=35 && LA46_0<=36)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3875:1: (lv_ownedOperator_10_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3875:1: (lv_ownedOperator_10_0= ruleUnaryOperatorCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3876:3: lv_ownedOperator_10_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS9074);
                    	    lv_ownedOperator_10_0=ruleUnaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedOperator",
                    	              		lv_ownedOperator_10_0, 
                    	              		"UnaryOperatorCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3892:3: ( (lv_ownedExpression_11_0= ruleLetExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3893:1: (lv_ownedExpression_11_0= ruleLetExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3893:1: (lv_ownedExpression_11_0= ruleLetExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3894:3: lv_ownedExpression_11_0= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9096);
                    lv_ownedExpression_11_0=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_11_0, 
                              		"LetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3912:2: this_LetExpCS_12= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getLetExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9128);
                    this_LetExpCS_12=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpCS_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3931:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3932:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3933:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9163);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS9173); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedExpCS"


    // $ANTLR start "rulePrefixedExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3940:1: rulePrefixedExpCS returns [EObject current=null] : ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedOperator_1_0 = null;

        EObject lv_ownedExpression_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3943:28: ( ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3944:1: ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3944:1: ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=35 && LA49_0<=36)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_SIMPLE_ID && LA49_0<=RULE_SINGLE_QUOTED_STRING)||LA49_0==30||LA49_0==34||LA49_0==50||(LA49_0>=52 && LA49_0<=64)||(LA49_0>=70 && LA49_0<=73)||LA49_0==77||LA49_0==83) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3944:2: ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3944:2: ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3944:3: () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3944:3: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3945:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedExpCSAccess().getPrefixExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3953:2: ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=35 && LA48_0<=36)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3954:1: (lv_ownedOperator_1_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3954:1: (lv_ownedOperator_1_0= ruleUnaryOperatorCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3955:3: lv_ownedOperator_1_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS9232);
                    	    lv_ownedOperator_1_0=ruleUnaryOperatorCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedOperator",
                    	              		lv_ownedOperator_1_0, 
                    	              		"UnaryOperatorCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3971:3: ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3972:1: (lv_ownedExpression_2_0= rulePrimaryExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3972:1: (lv_ownedExpression_2_0= rulePrimaryExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3973:3: lv_ownedExpression_2_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9254);
                    lv_ownedExpression_2_0=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_2_0, 
                              		"PrimaryExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3991:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9286);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4010:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4011:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4012:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS9321);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS9331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4019:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_atPre_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token lv_atPre_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_39=null;
        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_SelfExpCS_2 = null;

        EObject this_PrimitiveLiteralExpCS_3 = null;

        EObject this_TupleLiteralExpCS_4 = null;

        EObject this_CollectionLiteralExpCS_5 = null;

        EObject this_TypeLiteralExpCS_6 = null;

        EObject lv_pathName_8_0 = null;

        EObject lv_firstIndexes_11_0 = null;

        EObject lv_firstIndexes_13_0 = null;

        EObject lv_secondIndexes_16_0 = null;

        EObject lv_secondIndexes_18_0 = null;

        EObject lv_ownedParts_24_0 = null;

        EObject lv_ownedParts_26_0 = null;

        AntlrDatatypeRuleToken lv_value_27_0 = null;

        EObject lv_argument_33_0 = null;

        EObject lv_argument_34_0 = null;

        EObject lv_argument_35_0 = null;

        EObject lv_argument_36_0 = null;

        EObject lv_argument_37_0 = null;

        EObject lv_argument_38_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4022:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4023:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4023:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )
            int alt66=8;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4024:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS9381);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4037:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS9411);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4050:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS9441);
                    this_SelfExpCS_2=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4063:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS9471);
                    this_PrimitiveLiteralExpCS_3=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4076:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS9501);
                    this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4089:2: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS9531);
                    this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionLiteralExpCS_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4102:2: this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS9561);
                    this_TypeLiteralExpCS_6=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralExpCS_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4114:6: ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4114:6: ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4114:7: () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4114:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4115:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpCSAccess().getNameExpCSAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4123:2: ( (lv_pathName_8_0= rulePathNameCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4124:1: (lv_pathName_8_0= rulePathNameCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4124:1: (lv_pathName_8_0= rulePathNameCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4125:3: lv_pathName_8_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS9600);
                    lv_pathName_8_0=rulePathNameCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"pathName",
                              		lv_pathName_8_0, 
                              		"PathNameCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4141:2: ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) )
                    int alt65=3;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt65=1;
                        }
                        break;
                    case 16:
                        {
                        alt65=2;
                        }
                        break;
                    case EOF:
                    case 17:
                    case 21:
                    case 23:
                    case 30:
                    case 31:
                    case 33:
                    case 34:
                    case 35:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 65:
                    case 67:
                    case 69:
                    case 74:
                    case 76:
                    case 78:
                    case 79:
                    case 80:
                    case 82:
                        {
                        alt65=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }

                    switch (alt65) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4141:3: ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4141:3: ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4141:4: () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )?
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4141:4: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4142:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getPrimaryExpCSAccess().getIndexExpCSNameExpAction_7_2_0_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_10=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS9626); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_7_2_0_1());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4154:1: ( (lv_firstIndexes_11_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4155:1: (lv_firstIndexes_11_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4155:1: (lv_firstIndexes_11_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4156:3: lv_firstIndexes_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_7_2_0_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9647);
                            lv_firstIndexes_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"firstIndexes",
                                      		lv_firstIndexes_11_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4172:2: (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==23) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4172:4: otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) )
                            	    {
                            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9660); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_0_3_0());
                            	          
                            	    }
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4176:1: ( (lv_firstIndexes_13_0= ruleExpCS ) )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4177:1: (lv_firstIndexes_13_0= ruleExpCS )
                            	    {
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4177:1: (lv_firstIndexes_13_0= ruleExpCS )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4178:3: lv_firstIndexes_13_0= ruleExpCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_7_2_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9681);
                            	    lv_firstIndexes_13_0=ruleExpCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"firstIndexes",
                            	              		lv_firstIndexes_13_0, 
                            	              		"ExpCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePrimaryExpCS9695); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_7_2_0_4());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4198:1: (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==66) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4198:3: otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']'
                                    {
                                    otherlv_15=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS9708); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_7_2_0_5_0());
                                          
                                    }
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4202:1: ( (lv_secondIndexes_16_0= ruleExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4203:1: (lv_secondIndexes_16_0= ruleExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4203:1: (lv_secondIndexes_16_0= ruleExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4204:3: lv_secondIndexes_16_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_7_2_0_5_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9729);
                                    lv_secondIndexes_16_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"secondIndexes",
                                              		lv_secondIndexes_16_0, 
                                              		"ExpCS");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4220:2: (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )*
                                    loop51:
                                    do {
                                        int alt51=2;
                                        int LA51_0 = input.LA(1);

                                        if ( (LA51_0==23) ) {
                                            alt51=1;
                                        }


                                        switch (alt51) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4220:4: otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) )
                                    	    {
                                    	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9742); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_0_5_2_0());
                                    	          
                                    	    }
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4224:1: ( (lv_secondIndexes_18_0= ruleExpCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4225:1: (lv_secondIndexes_18_0= ruleExpCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4225:1: (lv_secondIndexes_18_0= ruleExpCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4226:3: lv_secondIndexes_18_0= ruleExpCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_7_2_0_5_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9763);
                                    	    lv_secondIndexes_18_0=ruleExpCS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"secondIndexes",
                                    	              		lv_secondIndexes_18_0, 
                                    	              		"ExpCS");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop51;
                                        }
                                    } while (true);

                                    otherlv_19=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePrimaryExpCS9777); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_7_2_0_5_3());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4246:3: ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==74) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4246:4: ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4246:4: ( (lv_atPre_20_0= '@' ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4247:1: (lv_atPre_20_0= '@' )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4247:1: (lv_atPre_20_0= '@' )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4248:3: lv_atPre_20_0= '@'
                                    {
                                    lv_atPre_20_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePrimaryExpCS9798); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_atPre_20_0, grammarAccess.getPrimaryExpCSAccess().getAtPreCommercialAtKeyword_7_2_0_6_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpCSRule());
                                      	        }
                                             		setWithLastConsumed(current, "atPre", true, "@");
                                      	    
                                    }

                                    }


                                    }

                                    otherlv_21=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePrimaryExpCS9823); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_21, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_7_2_0_6_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4266:6: ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4266:6: ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4266:7: () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}'
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4266:7: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4267:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getPrimaryExpCSAccess().getConstructorExpCSNameExpAction_7_2_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpCS9857); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpCSAccess().getLeftCurlyBracketKeyword_7_2_1_1());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4279:1: ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) )
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( ((LA56_0>=RULE_SIMPLE_ID && LA56_0<=RULE_ESCAPED_ID)||LA56_0==17) ) {
                                alt56=1;
                            }
                            else if ( (LA56_0==RULE_SINGLE_QUOTED_STRING) ) {
                                alt56=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 0, input);

                                throw nvae;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4279:2: ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )?
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4279:2: ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )?
                                    int alt55=2;
                                    int LA55_0 = input.LA(1);

                                    if ( ((LA55_0>=RULE_SIMPLE_ID && LA55_0<=RULE_ESCAPED_ID)) ) {
                                        alt55=1;
                                    }
                                    switch (alt55) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4279:3: ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )*
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4279:3: ( (lv_ownedParts_24_0= ruleConstructorPartCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4280:1: (lv_ownedParts_24_0= ruleConstructorPartCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4280:1: (lv_ownedParts_24_0= ruleConstructorPartCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4281:3: lv_ownedParts_24_0= ruleConstructorPartCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_7_2_1_2_0_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9880);
                                            lv_ownedParts_24_0=ruleConstructorPartCS();

                                            state._fsp--;
                                            if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                              	        }
                                                     		add(
                                                     			current, 
                                                     			"ownedParts",
                                                      		lv_ownedParts_24_0, 
                                                      		"ConstructorPartCS");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4297:2: (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )*
                                            loop54:
                                            do {
                                                int alt54=2;
                                                int LA54_0 = input.LA(1);

                                                if ( (LA54_0==23) ) {
                                                    alt54=1;
                                                }


                                                switch (alt54) {
                                            	case 1 :
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4297:4: otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) )
                                            	    {
                                            	    otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9893); if (state.failed) return current;
                                            	    if ( state.backtracking==0 ) {

                                            	          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_1_2_0_1_0());
                                            	          
                                            	    }
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4301:1: ( (lv_ownedParts_26_0= ruleConstructorPartCS ) )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4302:1: (lv_ownedParts_26_0= ruleConstructorPartCS )
                                            	    {
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4302:1: (lv_ownedParts_26_0= ruleConstructorPartCS )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4303:3: lv_ownedParts_26_0= ruleConstructorPartCS
                                            	    {
                                            	    if ( state.backtracking==0 ) {
                                            	       
                                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_7_2_1_2_0_1_1_0()); 
                                            	      	    
                                            	    }
                                            	    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9914);
                                            	    lv_ownedParts_26_0=ruleConstructorPartCS();

                                            	    state._fsp--;
                                            	    if (state.failed) return current;
                                            	    if ( state.backtracking==0 ) {

                                            	      	        if (current==null) {
                                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                            	      	        }
                                            	             		add(
                                            	             			current, 
                                            	             			"ownedParts",
                                            	              		lv_ownedParts_26_0, 
                                            	              		"ConstructorPartCS");
                                            	      	        afterParserOrEnumRuleCall();
                                            	      	    
                                            	    }

                                            	    }


                                            	    }


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop54;
                                                }
                                            } while (true);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4320:6: ( (lv_value_27_0= ruleStringLiteral ) )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4320:6: ( (lv_value_27_0= ruleStringLiteral ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4321:1: (lv_value_27_0= ruleStringLiteral )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4321:1: (lv_value_27_0= ruleStringLiteral )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4322:3: lv_value_27_0= ruleStringLiteral
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getValueStringLiteralParserRuleCall_7_2_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rulePrimaryExpCS9945);
                                    lv_value_27_0=ruleStringLiteral();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"value",
                                              		lv_value_27_0, 
                                              		"StringLiteral");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePrimaryExpCS9958); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_28, grammarAccess.getPrimaryExpCSAccess().getRightCurlyBracketKeyword_7_2_1_3());
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:6: ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:6: ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:7: ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )?
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:7: ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==74) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:8: ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:8: ( (lv_atPre_29_0= '@' ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4344:1: (lv_atPre_29_0= '@' )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4344:1: (lv_atPre_29_0= '@' )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4345:3: lv_atPre_29_0= '@'
                                    {
                                    lv_atPre_29_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePrimaryExpCS9985); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_atPre_29_0, grammarAccess.getPrimaryExpCSAccess().getAtPreCommercialAtKeyword_7_2_2_0_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpCSRule());
                                      	        }
                                             		setWithLastConsumed(current, "atPre", true, "@");
                                      	    
                                    }

                                    }


                                    }

                                    otherlv_30=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePrimaryExpCS10010); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_7_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4362:3: ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==30) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4362:4: () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4362:4: ()
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4363:2: 
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {

                                              current = forceCreateModelElementAndSet(
                                                  grammarAccess.getPrimaryExpCSAccess().getInvocationExpCSNameExpAction_7_2_2_1_0(),
                                                  current);
                                          
                                    }

                                    }

                                    otherlv_32=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaryExpCS10037); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpCSAccess().getLeftParenthesisKeyword_7_2_2_1_1());
                                          
                                    }
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4375:1: ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )?
                                    int alt63=2;
                                    int LA63_0 = input.LA(1);

                                    if ( ((LA63_0>=RULE_SIMPLE_ID && LA63_0<=RULE_SINGLE_QUOTED_STRING)||LA63_0==30||(LA63_0>=34 && LA63_0<=36)||LA63_0==50||(LA63_0>=52 && LA63_0<=64)||(LA63_0>=70 && LA63_0<=73)||LA63_0==77||LA63_0==81||LA63_0==83) ) {
                                        alt63=1;
                                    }
                                    switch (alt63) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4375:2: ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )?
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4375:2: ( (lv_argument_33_0= ruleNavigatingArgCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4376:1: (lv_argument_33_0= ruleNavigatingArgCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4376:1: (lv_argument_33_0= ruleNavigatingArgCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4377:3: lv_argument_33_0= ruleNavigatingArgCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_7_2_2_1_2_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS10059);
                                            lv_argument_33_0=ruleNavigatingArgCS();

                                            state._fsp--;
                                            if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                              	        }
                                                     		add(
                                                     			current, 
                                                     			"argument",
                                                      		lv_argument_33_0, 
                                                      		"NavigatingArgCS");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4393:2: ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )*
                                            loop58:
                                            do {
                                                int alt58=2;
                                                int LA58_0 = input.LA(1);

                                                if ( (LA58_0==23) ) {
                                                    alt58=1;
                                                }


                                                switch (alt58) {
                                            	case 1 :
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4394:1: (lv_argument_34_0= ruleNavigatingCommaArgCS )
                                            	    {
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4394:1: (lv_argument_34_0= ruleNavigatingCommaArgCS )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4395:3: lv_argument_34_0= ruleNavigatingCommaArgCS
                                            	    {
                                            	    if ( state.backtracking==0 ) {
                                            	       
                                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_1_0()); 
                                            	      	    
                                            	    }
                                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10080);
                                            	    lv_argument_34_0=ruleNavigatingCommaArgCS();

                                            	    state._fsp--;
                                            	    if (state.failed) return current;
                                            	    if ( state.backtracking==0 ) {

                                            	      	        if (current==null) {
                                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                            	      	        }
                                            	             		add(
                                            	             			current, 
                                            	             			"argument",
                                            	              		lv_argument_34_0, 
                                            	              		"NavigatingCommaArgCS");
                                            	      	        afterParserOrEnumRuleCall();
                                            	      	    
                                            	    }

                                            	    }


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop58;
                                                }
                                            } while (true);

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4411:3: ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )?
                                            int alt60=2;
                                            int LA60_0 = input.LA(1);

                                            if ( (LA60_0==21) ) {
                                                alt60=1;
                                            }
                                            switch (alt60) {
                                                case 1 :
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4411:4: ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )*
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4411:4: ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4412:1: (lv_argument_35_0= ruleNavigatingSemiArgCS )
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4412:1: (lv_argument_35_0= ruleNavigatingSemiArgCS )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4413:3: lv_argument_35_0= ruleNavigatingSemiArgCS
                                                    {
                                                    if ( state.backtracking==0 ) {
                                                       
                                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_7_2_2_1_2_2_0_0()); 
                                                      	    
                                                    }
                                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS10103);
                                                    lv_argument_35_0=ruleNavigatingSemiArgCS();

                                                    state._fsp--;
                                                    if (state.failed) return current;
                                                    if ( state.backtracking==0 ) {

                                                      	        if (current==null) {
                                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                                      	        }
                                                             		add(
                                                             			current, 
                                                             			"argument",
                                                              		lv_argument_35_0, 
                                                              		"NavigatingSemiArgCS");
                                                      	        afterParserOrEnumRuleCall();
                                                      	    
                                                    }

                                                    }


                                                    }

                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4429:2: ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )*
                                                    loop59:
                                                    do {
                                                        int alt59=2;
                                                        int LA59_0 = input.LA(1);

                                                        if ( (LA59_0==23) ) {
                                                            alt59=1;
                                                        }


                                                        switch (alt59) {
                                                    	case 1 :
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4430:1: (lv_argument_36_0= ruleNavigatingCommaArgCS )
                                                    	    {
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4430:1: (lv_argument_36_0= ruleNavigatingCommaArgCS )
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4431:3: lv_argument_36_0= ruleNavigatingCommaArgCS
                                                    	    {
                                                    	    if ( state.backtracking==0 ) {
                                                    	       
                                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_2_1_0()); 
                                                    	      	    
                                                    	    }
                                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10124);
                                                    	    lv_argument_36_0=ruleNavigatingCommaArgCS();

                                                    	    state._fsp--;
                                                    	    if (state.failed) return current;
                                                    	    if ( state.backtracking==0 ) {

                                                    	      	        if (current==null) {
                                                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                                    	      	        }
                                                    	             		add(
                                                    	             			current, 
                                                    	             			"argument",
                                                    	              		lv_argument_36_0, 
                                                    	              		"NavigatingCommaArgCS");
                                                    	      	        afterParserOrEnumRuleCall();
                                                    	      	    
                                                    	    }

                                                    	    }


                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop59;
                                                        }
                                                    } while (true);


                                                    }
                                                    break;

                                            }

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4447:5: ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )?
                                            int alt62=2;
                                            int LA62_0 = input.LA(1);

                                            if ( (LA62_0==76) ) {
                                                alt62=1;
                                            }
                                            switch (alt62) {
                                                case 1 :
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4447:6: ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )*
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4447:6: ( (lv_argument_37_0= ruleNavigatingBarArgCS ) )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4448:1: (lv_argument_37_0= ruleNavigatingBarArgCS )
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4448:1: (lv_argument_37_0= ruleNavigatingBarArgCS )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4449:3: lv_argument_37_0= ruleNavigatingBarArgCS
                                                    {
                                                    if ( state.backtracking==0 ) {
                                                       
                                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_7_2_2_1_2_3_0_0()); 
                                                      	    
                                                    }
                                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS10149);
                                                    lv_argument_37_0=ruleNavigatingBarArgCS();

                                                    state._fsp--;
                                                    if (state.failed) return current;
                                                    if ( state.backtracking==0 ) {

                                                      	        if (current==null) {
                                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                                      	        }
                                                             		add(
                                                             			current, 
                                                             			"argument",
                                                              		lv_argument_37_0, 
                                                              		"NavigatingBarArgCS");
                                                      	        afterParserOrEnumRuleCall();
                                                      	    
                                                    }

                                                    }


                                                    }

                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4465:2: ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )*
                                                    loop61:
                                                    do {
                                                        int alt61=2;
                                                        int LA61_0 = input.LA(1);

                                                        if ( (LA61_0==23) ) {
                                                            alt61=1;
                                                        }


                                                        switch (alt61) {
                                                    	case 1 :
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4466:1: (lv_argument_38_0= ruleNavigatingCommaArgCS )
                                                    	    {
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4466:1: (lv_argument_38_0= ruleNavigatingCommaArgCS )
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4467:3: lv_argument_38_0= ruleNavigatingCommaArgCS
                                                    	    {
                                                    	    if ( state.backtracking==0 ) {
                                                    	       
                                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_3_1_0()); 
                                                    	      	    
                                                    	    }
                                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10170);
                                                    	    lv_argument_38_0=ruleNavigatingCommaArgCS();

                                                    	    state._fsp--;
                                                    	    if (state.failed) return current;
                                                    	    if ( state.backtracking==0 ) {

                                                    	      	        if (current==null) {
                                                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpCSRule());
                                                    	      	        }
                                                    	             		add(
                                                    	             			current, 
                                                    	             			"argument",
                                                    	              		lv_argument_38_0, 
                                                    	              		"NavigatingCommaArgCS");
                                                    	      	        afterParserOrEnumRuleCall();
                                                    	      	    
                                                    	    }

                                                    	    }


                                                    	    }
                                                    	    break;

                                                    	default :
                                                    	    break loop61;
                                                        }
                                                    } while (true);


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }

                                    otherlv_39=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrimaryExpCS10187); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_39, grammarAccess.getPrimaryExpCSAccess().getRightParenthesisKeyword_7_2_2_1_3());
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4495:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4496:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4497:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS10228);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS10238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4504:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4507:28: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4508:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4508:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4508:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4508:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4509:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4509:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4510:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS10284);
            lv_name_0_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4526:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==69) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4526:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingArgCS10297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4530:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4531:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4531:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4532:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS10318);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4548:2: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==42) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4548:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                            {
                            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingArgCS10331); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_1_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4552:1: ( (lv_init_4_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4553:1: (lv_init_4_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4553:1: (lv_init_4_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4554:3: lv_init_4_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS10352);
                            lv_init_4_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_4_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4578:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4579:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4580:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS10392);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS10402); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4587:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4590:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4591:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4591:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4591:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4591:2: ( (lv_prefix_0_0= '|' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4592:1: (lv_prefix_0_0= '|' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4592:1: (lv_prefix_0_0= '|' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4593:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleNavigatingBarArgCS10445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4606:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4607:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4607:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4608:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS10479);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4624:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==69) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4624:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingBarArgCS10492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4628:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4629:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4629:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4630:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS10513);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4646:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==42) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4646:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingBarArgCS10526); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4650:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4651:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4651:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4652:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS10547);
                            lv_init_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4676:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4677:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4678:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS10587);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS10597); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4685:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4688:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4689:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4689:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4689:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4689:2: ( (lv_prefix_0_0= ',' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4690:1: (lv_prefix_0_0= ',' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4690:1: (lv_prefix_0_0= ',' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4691:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNavigatingCommaArgCS10640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4704:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4705:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4705:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4706:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS10674);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4722:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==69) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4722:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingCommaArgCS10687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4726:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4727:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4727:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4728:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS10708);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4744:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==42) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4744:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingCommaArgCS10721); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4748:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4749:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4749:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4750:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10742);
                            lv_init_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4774:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4775:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4776:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10782);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4783:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4786:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4787:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4787:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4787:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4787:2: ( (lv_prefix_0_0= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4788:1: (lv_prefix_0_0= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4788:1: (lv_prefix_0_0= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4789:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNavigatingSemiArgCS10835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4802:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4803:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4803:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4804:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10869);
            lv_name_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4820:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==69) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4820:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingSemiArgCS10882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4824:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4825:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4825:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4826:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10903);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4842:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==42) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4842:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingSemiArgCS10916); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4846:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4847:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4847:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4848:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10937);
                            lv_init_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"init",
                                      		lv_init_5_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4872:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4873:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4874:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10977);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10987); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4881:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4884:28: (this_ExpCS_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4886:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS11036);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4905:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4906:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4907:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11070);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS11080); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4914:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4917:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4918:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4918:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4918:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleIfExpCS11117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4922:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4923:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4923:1: (lv_condition_1_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4924:3: lv_condition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11138);
            lv_condition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleIfExpCS11150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4944:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4945:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4945:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4946:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11171);
            lv_thenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_3_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleIfExpCS11183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4966:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4967:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4967:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4968:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11204);
            lv_elseExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"elseExpression",
                      		lv_elseExpression_5_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleIfExpCS11216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfExpCSAccess().getEndifKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4996:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4997:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4998:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11252);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS11262); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5005:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5008:28: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5009:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5009:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5009:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleLetExpCS11299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5013:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5014:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5014:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5015:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11320);
            lv_variable_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"LetVariableCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5031:2: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==23) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5031:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLetExpCS11333); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5035:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5036:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5036:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5037:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11354);
            	    lv_variable_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variable",
            	              		lv_variable_3_0, 
            	              		"LetVariableCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_4=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleLetExpCS11368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5057:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5058:1: (lv_in_5_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5058:1: (lv_in_5_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5059:3: lv_in_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS11389);
            lv_in_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"in",
                      		lv_in_5_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5083:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5084:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5085:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11425);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS11435); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5092:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5095:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5096:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5096:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5096:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5096:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5097:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5097:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5098:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS11481);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5114:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==69) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5114:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLetVariableCS11494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5118:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5119:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5119:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5120:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11515);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLetVariableCS11529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5140:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5141:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5141:1: (lv_initExpression_4_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5142:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS11550);
            lv_initExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"initExpression",
                      		lv_initExpression_4_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5166:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5167:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5168:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11586);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS11596); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5175:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5178:28: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5179:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5179:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5179:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNestedExpCS11633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5183:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5184:1: (lv_source_1_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5184:1: (lv_source_1_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5185:3: lv_source_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS11654);
            lv_source_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNestedExpCS11666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5213:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5214:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5215:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11702);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS11712); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5222:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5225:28: ( ( () otherlv_1= 'self' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5226:1: ( () otherlv_1= 'self' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5226:1: ( () otherlv_1= 'self' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5226:2: () otherlv_1= 'self'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5226:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5227:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleSelfExpCS11761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "ruleLocationConstraintType"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5247:1: ruleLocationConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) ) ;
    public final Enumerator ruleLocationConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5249:28: ( ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5250:1: ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5250:1: ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==84) ) {
                alt77=1;
            }
            else if ( (LA77_0==85) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5250:2: (enumLiteral_0= 'sameLocation' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5250:2: (enumLiteral_0= 'sameLocation' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5250:4: enumLiteral_0= 'sameLocation'
                    {
                    enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleLocationConstraintType11811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLocationConstraintTypeAccess().getSAME_LOCATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLocationConstraintTypeAccess().getSAME_LOCATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5256:6: (enumLiteral_1= 'differentLocation' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5256:6: (enumLiteral_1= 'differentLocation' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5256:8: enumLiteral_1= 'differentLocation'
                    {
                    enumLiteral_1=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleLocationConstraintType11828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLocationConstraintTypeAccess().getDIFFERENT_LOCATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLocationConstraintTypeAccess().getDIFFERENT_LOCATIONEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationConstraintType"

    // $ANTLR start synpred86_InternalAllocationSpecificationLanguage
    public final void synpred86_InternalAllocationSpecificationLanguage_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4076:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4076:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred86_InternalAllocationSpecificationLanguage9501);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_InternalAllocationSpecificationLanguage

    // $ANTLR start synpred87_InternalAllocationSpecificationLanguage
    public final void synpred87_InternalAllocationSpecificationLanguage_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_5 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4089:2: (this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4089:2: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred87_InternalAllocationSpecificationLanguage9531);
        this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalAllocationSpecificationLanguage

    // $ANTLR start synpred88_InternalAllocationSpecificationLanguage
    public final void synpred88_InternalAllocationSpecificationLanguage_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_6 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4102:2: (this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4102:2: this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred88_InternalAllocationSpecificationLanguage9561);
        this_TypeLiteralExpCS_6=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalAllocationSpecificationLanguage

    // Delegated rules

    public final boolean synpred88_InternalAllocationSpecificationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalAllocationSpecificationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalAllocationSpecificationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalAllocationSpecificationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalAllocationSpecificationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalAllocationSpecificationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA47 dfa47 = new DFA47(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA66 dfa66 = new DFA66(this);
    static final String DFA47_eotS =
        "\6\uffff";
    static final String DFA47_eofS =
        "\6\uffff";
    static final String DFA47_minS =
        "\3\4\3\uffff";
    static final String DFA47_maxS =
        "\3\123\3\uffff";
    static final String DFA47_acceptS =
        "\3\uffff\1\1\1\3\1\2";
    static final String DFA47_specialS =
        "\6\uffff}>";
    static final String[] DFA47_transitionS = {
            "\4\3\26\uffff\1\3\3\uffff\1\3\1\1\1\2\15\uffff\1\3\1\uffff\15"+
            "\3\5\uffff\4\3\3\uffff\1\3\3\uffff\1\4\1\uffff\1\3",
            "\4\3\26\uffff\1\3\3\uffff\1\3\1\1\1\2\15\uffff\1\3\1\uffff"+
            "\15\3\5\uffff\4\3\3\uffff\1\3\3\uffff\1\5\1\uffff\1\3",
            "\4\3\26\uffff\1\3\3\uffff\1\3\1\1\1\2\15\uffff\1\3\1\uffff"+
            "\15\3\5\uffff\4\3\3\uffff\1\3\3\uffff\1\5\1\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "3716:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )";
        }
    }
    static final String DFA42_eotS =
        "\23\uffff";
    static final String DFA42_eofS =
        "\1\21\22\uffff";
    static final String DFA42_minS =
        "\1\21\20\4\2\uffff";
    static final String DFA42_maxS =
        "\1\122\20\123\2\uffff";
    static final String DFA42_acceptS =
        "\21\uffff\1\2\1\1";
    static final String DFA42_specialS =
        "\23\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\21\3\uffff\1\21\1\uffff\1\21\7\uffff\1\21\1\uffff\1\3\1\1"+
            "\1\4\1\uffff\1\2\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\17\uffff\1\21\1\uffff\1\21\1\uffff\1\21\6\uffff"+
            "\1\21\1\uffff\3\21\1\uffff\1\21",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "\4\22\26\uffff\1\22\3\uffff\3\22\15\uffff\1\22\1\uffff\15\22"+
            "\5\uffff\4\22\3\uffff\1\22\3\uffff\1\21\1\uffff\1\22",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 3773:2: ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )*";
        }
    }
    static final String DFA66_eotS =
        "\35\uffff";
    static final String DFA66_eofS =
        "\35\uffff";
    static final String DFA66_minS =
        "\1\4\12\uffff\6\0\14\uffff";
    static final String DFA66_maxS =
        "\1\123\12\uffff\6\0\14\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\14\uffff\1\7\7\uffff\1\10\1\uffff\1\5\1"+
        "\6";
    static final String DFA66_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\14\uffff}>";
    static final String[] DFA66_transitionS = {
            "\2\31\2\4\26\uffff\1\1\3\uffff\1\4\17\uffff\1\13\1\uffff\10"+
            "\21\1\14\1\15\1\16\1\17\1\20\5\uffff\4\4\3\uffff\1\2\5\uffff"+
            "\1\3",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "4023:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_11 = input.LA(1);

                         
                        int index66_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalAllocationSpecificationLanguage()) ) {s = 27;}

                        else if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index66_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_12 = input.LA(1);

                         
                        int index66_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index66_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_13 = input.LA(1);

                         
                        int index66_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index66_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_14 = input.LA(1);

                         
                        int index66_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index66_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA66_15 = input.LA(1);

                         
                        int index66_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index66_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecification91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleSpecification149 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSpecification161 = new BitSet(new long[]{0x0000000102060000L});
        public static final BitSet FOLLOW_ruleService_in_ruleSpecification183 = new BitSet(new long[]{0x0000000102060000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleSpecification210 = new BitSet(new long[]{0x0000000102060000L});
        public static final BitSet FOLLOW_ruleMeasureFunction_in_ruleSpecification233 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSpecification246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleService329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleService350 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleService362 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_ruleQosDimension_in_ruleService383 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleService396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQosDimension_in_entryRuleQosDimension432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQosDimension442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleQosDimension479 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleQosDimension500 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQosDimension512 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleQosDimension524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleQosDimension545 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleQosDimension557 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleQosDimension569 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension590 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleQosDimension603 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension624 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleQosDimension638 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleQosDimension650 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleQosDimension671 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleQosDimension683 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQosDimension695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleConstraint778 = new BitSet(new long[]{0x0000000024000000L,0x0000000000300000L});
        public static final BitSet FOLLOW_ruleLocationConstraint_in_ruleConstraint804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceConstraint_in_ruleConstraint834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_ruleConstraint864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationConstraint_in_entryRuleLocationConstraint900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationConstraint910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationConstraintType_in_ruleLocationConstraint956 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationConstraint977 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLocationConstraint990 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLocationConstraint1002 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1023 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLocationConstraint1035 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocationConstraint1047 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleLocationConstraint1068 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLocationConstraint1080 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLocationConstraint1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceConstraint_in_entryRuleResourceConstraint1128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceConstraint1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleResourceConstraint1175 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleResourceConstraint1196 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleResourceConstraint1209 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleResourceConstraint1221 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1242 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1254 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleResourceConstraint1266 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1287 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1299 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleResourceConstraint1311 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1332 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleResourceConstraint1345 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1366 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1380 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleResourceConstraint1392 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleResourceConstraint1413 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1425 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleResourceConstraint1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_entryRuleRequiredHardwareResourceInstanceConstraint1473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredHardwareResourceInstanceConstraint1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleRequiredHardwareResourceInstanceConstraint1520 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleRequiredHardwareResourceInstanceConstraint1541 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRequiredHardwareResourceInstanceConstraint1554 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRequiredHardwareResourceInstanceConstraint1566 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1587 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleRequiredHardwareResourceInstanceConstraint1600 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1621 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1635 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleRequiredHardwareResourceInstanceConstraint1647 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleRequiredHardwareResourceInstanceConstraint1668 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1680 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRequiredHardwareResourceInstanceConstraint1692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_entryRuleLocationTupleDescriptor1728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationTupleDescriptor1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLocationTupleDescriptor1775 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationTupleDescriptor1796 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLocationTupleDescriptor1808 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationTupleDescriptor1829 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLocationTupleDescriptor1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_entryRuleValueTupleDescriptor1877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueTupleDescriptor1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleValueTupleDescriptor1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_entryRuleComponentResourceTupleDescriptor1967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentResourceTupleDescriptor1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleComponentResourceTupleDescriptor2014 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2035 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleComponentResourceTupleDescriptor2047 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2068 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentResourceTupleDescriptor2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeasureFunction_in_entryRuleMeasureFunction2116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeasureFunction2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMeasureFunction2163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleMeasureFunction2190 = new BitSet(new long[]{0x0000000200200000L});
        public static final BitSet FOLLOW_33_in_ruleMeasureFunction2203 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleMeasureFunction2230 = new BitSet(new long[]{0x0000000200200000L});
        public static final BitSet FOLLOW_21_in_ruleMeasureFunction2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel2280 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel2290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleModel2335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID2371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID2448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER2494 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER2505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER2589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER2600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUPPER2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL2705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI2811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_entryRuleEssentialOCLUnaryOperatorCS2896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorCS2906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLUnaryOperatorCS2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLUnaryOperatorCS2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorCS_in_entryRuleEssentialOCLInfixOperatorCS3030 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorCS3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorCS3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorCS3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLInfixOperatorCS3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLInfixOperatorCS3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorCS3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorCS3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorCS3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorCS3287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorCS3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorCS3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorCS3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorCS3403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorCS3432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLInfixOperatorCS3461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_entryRuleEssentialOCLNavigationOperatorCS3512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorCS3522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorCS3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorCS3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier3647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier3704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral3799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS3843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS3903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS3933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS3968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorCS3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorCS_in_ruleInfixOperatorCS4027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS4061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorCS4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_ruleNavigationOperatorCS4120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS4154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_ruleUnaryOperatorCS4213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName4248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName4350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName4361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName4452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName4463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName4510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName4543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLUnreservedName4600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName4641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName4698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS4742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS4752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS4798 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_rulePathNameCS4811 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS4832 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS4870 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS4880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS4931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS4966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS5027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS5064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS5126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS5172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier5210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier5221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulePrimitiveTypeIdentifier5259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulePrimitiveTypeIdentifier5278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier5297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier5335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier5354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier5373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier5392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS5432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS5442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS5487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier5523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCollectionTypeIdentifier5572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCollectionTypeIdentifier5591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier5610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier5629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier5648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS5688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS5698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS5744 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleCollectionTypeCS5757 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS5778 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionTypeCS5790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS5828 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS5838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS5884 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMultiplicityBoundsCS5897 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS5918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS5956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS5966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMultiplicityCS6003 = new BitSet(new long[]{0x0000000600000040L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS6029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS6059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleMultiplicityCS6071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS6107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS6117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMultiplicityStringCS6161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMultiplicityStringCS6190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleMultiplicityStringCS6219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS6270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS6280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTupleTypeCS6323 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTupleTypeCS6349 = new BitSet(new long[]{0xFFF4001CC00000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6371 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_23_in_ruleTupleTypeCS6384 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6405 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_31_in_ruleTupleTypeCS6421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS6459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS6469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS6515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleTuplePartCS6527 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS6548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS6584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS6594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS6640 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCollectionLiteralExpCS6652 = new BitSet(new long[]{0xFFF4001C400200F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6674 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionLiteralExpCS6687 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6708 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleCollectionLiteralExpCS6724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS6760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS6770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionLiteralPartCS6829 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS6888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructorPartCS6898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS6950 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleConstructorPartCS6962 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleConstructorPartCS6983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS7019 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS7029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTupleLiteralExpCS7311 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTupleLiteralExpCS7323 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7344 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleTupleLiteralExpCS7357 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7378 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleTupleLiteralExpCS7392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS7428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS7438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS7484 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleTupleLiteralPartCS7497 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS7518 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTupleLiteralPartCS7532 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS7553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS7589 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS7599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS7644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS7679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS7689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS7734 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS7770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS7780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleBooleanLiteralExpCS7823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleBooleanLiteralExpCS7860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS7968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS8004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS8014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleInvalidLiteralExpCS8063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS8109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleNullLiteralExpCS8158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS8204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS8349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS8359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS8409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS8429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS8521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS8556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS8566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS8611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS8646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS8656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS8707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8737 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS8795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS8805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8856 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8889 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8912 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8934 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8955 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8979 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS9074 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS9173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS9232 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS9321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS9331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS9381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS9411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS9441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS9471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS9501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS9531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS9561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS9600 = new BitSet(new long[]{0x0000000040010002L,0x0000000000000404L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS9626 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9647 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9660 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9681 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePrimaryExpCS9695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000404L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS9708 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9729 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9742 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9763 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePrimaryExpCS9777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulePrimaryExpCS9798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulePrimaryExpCS9823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpCS9857 = new BitSet(new long[]{0xFFF4001C400200F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9880 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9893 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9914 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimaryExpCS9945 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePrimaryExpCS9958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulePrimaryExpCS9985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulePrimaryExpCS10010 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_rulePrimaryExpCS10037 = new BitSet(new long[]{0xFFF4001CC00000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS10059 = new BitSet(new long[]{0x0000000080A00000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10080 = new BitSet(new long[]{0x0000000080A00000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS10103 = new BitSet(new long[]{0x0000000080800000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10124 = new BitSet(new long[]{0x0000000080800000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS10149 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10170 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_31_in_rulePrimaryExpCS10187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS10228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS10238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS10284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingArgCS10297 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS10318 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingArgCS10331 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS10352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS10392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS10402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleNavigatingBarArgCS10445 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS10479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingBarArgCS10492 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS10513 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingBarArgCS10526 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS10547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS10587 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS10597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNavigatingCommaArgCS10640 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS10674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingCommaArgCS10687 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS10708 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingCommaArgCS10721 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNavigatingSemiArgCS10835 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingSemiArgCS10882 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10903 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingSemiArgCS10916 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS11036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS11080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleIfExpCS11117 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleIfExpCS11150 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleIfExpCS11183 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleIfExpCS11216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS11262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleLetExpCS11299 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11320 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L});
        public static final BitSet FOLLOW_23_in_ruleLetExpCS11333 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11354 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleLetExpCS11368 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS11389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS11435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS11481 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleLetVariableCS11494 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11515 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleLetVariableCS11529 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS11550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS11596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNestedExpCS11633 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS11654 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleNestedExpCS11666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS11712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleSelfExpCS11761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleLocationConstraintType11811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleLocationConstraintType11828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred86_InternalAllocationSpecificationLanguage9501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred87_InternalAllocationSpecificationLanguage9531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred88_InternalAllocationSpecificationLanguage9561 = new BitSet(new long[]{0x0000000000000002L});
    }


}