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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:477:1: ruleLocationConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleLocationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tupleDescriptors_4_0 = null;

        EObject lv_tupleDescriptors_6_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:480:28: ( ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:1: ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:1: ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:481:2: ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}'
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:525:1: ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:526:1: (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:526:1: (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:527:3: lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTupleDescriptorsLocationTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1023);
            lv_tupleDescriptors_4_0=ruleLocationTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"tupleDescriptors",
                      		lv_tupleDescriptors_4_0, 
                      		"LocationTupleDescriptor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:543:2: (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:543:4: otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocationConstraint1036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getLocationConstraintAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:547:1: ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:548:1: (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:548:1: (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:549:3: lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTupleDescriptorsLocationTupleDescriptorParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1057);
            	    lv_tupleDescriptors_6_0=ruleLocationTupleDescriptor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tupleDescriptors",
            	              		lv_tupleDescriptors_6_0, 
            	              		"LocationTupleDescriptor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLocationConstraint1071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLocationConstraintAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocationConstraint1083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getLocationConstraintAccess().getOclKeyword_7());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:573:1: ( (lv_expression_9_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:574:1: (lv_expression_9_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:574:1: (lv_expression_9_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:575:3: lv_expression_9_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getExpressionModelParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleLocationConstraint1104);
            lv_expression_9_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationConstraintRule());
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

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLocationConstraint1116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getLocationConstraintAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLocationConstraint1128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getLocationConstraintAccess().getRightCurlyBracketKeyword_10());
                  
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:607:1: entryRuleResourceConstraint returns [EObject current=null] : iv_ruleResourceConstraint= ruleResourceConstraint EOF ;
    public final EObject entryRuleResourceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:608:2: (iv_ruleResourceConstraint= ruleResourceConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:609:2: iv_ruleResourceConstraint= ruleResourceConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceConstraint_in_entryRuleResourceConstraint1164);
            iv_ruleResourceConstraint=ruleResourceConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceConstraint1174); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:616:1: ruleResourceConstraint returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:619:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:620:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:620:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:620:3: otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= 'ocl' ( (lv_expression_15_0= ruleModel ) ) otherlv_16= ';' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleResourceConstraint1211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getResourceConstraintAccess().getResourceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:624:1: ( (lv_name_1_0= ruleID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SIMPLE_ID && LA8_0<=RULE_ESCAPED_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:625:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:625:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:626:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleResourceConstraint1232);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleResourceConstraint1245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getResourceConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleResourceConstraint1257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getResourceConstraintAccess().getLhsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:650:1: ( (lv_lhs_4_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:651:1: (lv_lhs_4_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:651:1: (lv_lhs_4_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:652:3: lv_lhs_4_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getLhsValueTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1278);
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

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleResourceConstraint1302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getResourceConstraintAccess().getRhsKeyword_6());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:676:1: ( (lv_rhs_7_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:677:1: (lv_rhs_7_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:677:1: (lv_rhs_7_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:678:3: lv_rhs_7_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getRhsValueTupleDescriptorParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1323);
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

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleResourceConstraint1347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getResourceConstraintAccess().getDescriptorsKeyword_9());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:702:1: ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:703:1: (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:703:1: (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:704:3: lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1368);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:720:2: (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:720:4: otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleResourceConstraint1381); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getResourceConstraintAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:724:1: ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:725:1: (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:725:1: (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:726:3: lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1402);
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
            	    break loop9;
                }
            } while (true);

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_12());
                  
            }
            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleResourceConstraint1428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getResourceConstraintAccess().getOclKeyword_13());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:750:1: ( (lv_expression_15_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:751:1: (lv_expression_15_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:751:1: (lv_expression_15_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:752:3: lv_expression_15_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getExpressionModelParserRuleCall_14_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleResourceConstraint1449);
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

            otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_15());
                  
            }
            otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResourceConstraint1473); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:784:1: entryRuleRequiredHardwareResourceInstanceConstraint returns [EObject current=null] : iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF ;
    public final EObject entryRuleRequiredHardwareResourceInstanceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredHardwareResourceInstanceConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:785:2: (iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:786:2: iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_entryRuleRequiredHardwareResourceInstanceConstraint1509);
            iv_ruleRequiredHardwareResourceInstanceConstraint=ruleRequiredHardwareResourceInstanceConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredHardwareResourceInstanceConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredHardwareResourceInstanceConstraint1519); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:793:1: ruleRequiredHardwareResourceInstanceConstraint returns [EObject current=null] : (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:796:28: ( (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:797:1: (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:797:1: (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:797:3: otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRequiredHardwareResourceInstanceConstraint1556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRequiredHardwareResourceInstanceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:801:1: ( (lv_name_1_0= ruleID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SIMPLE_ID && LA10_0<=RULE_ESCAPED_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:802:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:802:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:803:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleRequiredHardwareResourceInstanceConstraint1577);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRequiredHardwareResourceInstanceConstraint1590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRequiredHardwareResourceInstanceConstraint1602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getDescriptorsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:827:1: ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:828:1: (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:828:1: (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:829:3: lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1623);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:845:2: (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:845:4: otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRequiredHardwareResourceInstanceConstraint1636); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:849:1: ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:850:1: (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:850:1: (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:851:3: lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1657);
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
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRequiredHardwareResourceInstanceConstraint1683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getOclKeyword_7());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:875:1: ( (lv_expression_9_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:876:1: (lv_expression_9_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:876:1: (lv_expression_9_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:877:3: lv_expression_9_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getExpressionModelParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleRequiredHardwareResourceInstanceConstraint1704);
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

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRequiredHardwareResourceInstanceConstraint1728); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:909:1: entryRuleLocationTupleDescriptor returns [EObject current=null] : iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF ;
    public final EObject entryRuleLocationTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:910:2: (iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:911:2: iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_entryRuleLocationTupleDescriptor1764);
            iv_ruleLocationTupleDescriptor=ruleLocationTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationTupleDescriptor1774); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:918:1: ruleLocationTupleDescriptor returns [EObject current=null] : (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' ) ;
    public final EObject ruleLocationTupleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_instance_1_0 = null;

        AntlrDatatypeRuleToken lv_secondInstance_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:921:28: ( (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:922:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:922:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:922:3: otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_secondInstance_3_0= ruleID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocationTupleDescriptor1811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationTupleDescriptorAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:926:1: ( (lv_instance_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:927:1: (lv_instance_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:927:1: (lv_instance_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:928:3: lv_instance_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationTupleDescriptorAccess().getInstanceIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationTupleDescriptor1832);
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

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocationTupleDescriptor1844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocationTupleDescriptorAccess().getCommaKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:948:1: ( (lv_secondInstance_3_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:949:1: (lv_secondInstance_3_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:949:1: (lv_secondInstance_3_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:950:3: lv_secondInstance_3_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationTupleDescriptorAccess().getSecondInstanceIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationTupleDescriptor1865);
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

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLocationTupleDescriptor1877); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:978:1: entryRuleValueTupleDescriptor returns [EObject current=null] : iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF ;
    public final EObject entryRuleValueTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:979:2: (iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:980:2: iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_entryRuleValueTupleDescriptor1913);
            iv_ruleValueTupleDescriptor=ruleValueTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueTupleDescriptor1923); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:987:1: ruleValueTupleDescriptor returns [EObject current=null] : ( (lv_value_0_0= ruleID ) ) ;
    public final EObject ruleValueTupleDescriptor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:990:28: ( ( (lv_value_0_0= ruleID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:991:1: ( (lv_value_0_0= ruleID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:991:1: ( (lv_value_0_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:992:1: (lv_value_0_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:992:1: (lv_value_0_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:993:3: lv_value_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueTupleDescriptorAccess().getValueIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleValueTupleDescriptor1968);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1017:1: entryRuleComponentResourceTupleDescriptor returns [EObject current=null] : iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF ;
    public final EObject entryRuleComponentResourceTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentResourceTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1018:2: (iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1019:2: iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_entryRuleComponentResourceTupleDescriptor2003);
            iv_ruleComponentResourceTupleDescriptor=ruleComponentResourceTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentResourceTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentResourceTupleDescriptor2013); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1026:1: ruleComponentResourceTupleDescriptor returns [EObject current=null] : (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' ) ;
    public final EObject ruleComponentResourceTupleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_instance_1_0 = null;

        AntlrDatatypeRuleToken lv_hwresinstance_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1029:28: ( (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1030:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1030:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1030:3: otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentResourceTupleDescriptor2050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentResourceTupleDescriptorAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1034:1: ( (lv_instance_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1035:1: (lv_instance_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1035:1: (lv_instance_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1036:3: lv_instance_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorAccess().getInstanceIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2071);
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

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComponentResourceTupleDescriptor2083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentResourceTupleDescriptorAccess().getCommaKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1056:1: ( (lv_hwresinstance_3_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1057:1: (lv_hwresinstance_3_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1057:1: (lv_hwresinstance_3_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1058:3: lv_hwresinstance_3_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorAccess().getHwresinstanceIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2104);
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

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentResourceTupleDescriptor2116); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1086:1: entryRuleMeasureFunction returns [EObject current=null] : iv_ruleMeasureFunction= ruleMeasureFunction EOF ;
    public final EObject entryRuleMeasureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureFunction = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1087:2: (iv_ruleMeasureFunction= ruleMeasureFunction EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1088:2: iv_ruleMeasureFunction= ruleMeasureFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasureFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMeasureFunction_in_entryRuleMeasureFunction2152);
            iv_ruleMeasureFunction=ruleMeasureFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasureFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeasureFunction2162); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1095:1: ruleMeasureFunction returns [EObject current=null] : (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMeasureFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1098:28: ( (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1099:1: (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1099:1: (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1099:3: otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMeasureFunction2199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMeasureFunctionAccess().getMeasureKeyword_0());
                  
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
               
              	        newCompositeNode(grammarAccess.getMeasureFunctionAccess().getServicesServiceCSCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleMeasureFunction2226);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1121:2: (otherlv_2= '+' ( ( ruleID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1121:4: otherlv_2= '+' ( ( ruleID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMeasureFunction2239); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMeasureFunctionAccess().getPlusSignKeyword_2_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1125:1: ( ( ruleID ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1126:1: ( ruleID )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1126:1: ( ruleID )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1127:3: ruleID
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
            	    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleMeasureFunction2266);
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMeasureFunction2280); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1155:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1156:2: (iv_ruleModel= ruleModel EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1157:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel2316);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel2326); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1164:1: ruleModel returns [EObject current=null] : ( (lv_ownedExpression_0_0= ruleExpCS ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1167:28: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1168:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1168:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1169:1: (lv_ownedExpression_0_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1169:1: (lv_ownedExpression_0_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1170:3: lv_ownedExpression_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getOwnedExpressionExpCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleModel2371);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1194:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1195:2: (iv_ruleID= ruleID EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1196:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID2407);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID2418); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1203:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1206:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1207:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1207:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SIMPLE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ESCAPED_ID) ) {
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1207:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID2458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1215:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID2484); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1230:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1231:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1232:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER2530);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER2541); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1239:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1242:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1243:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER2580); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1258:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1259:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1260:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER2625);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER2636); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1267:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1270:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1271:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1271:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1271:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER2676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1280:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUPPER2700); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1293:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1294:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1295:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL2741);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL2752); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1302:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1305:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1306:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL2791); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1321:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1322:2: (iv_ruleURI= ruleURI EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1323:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI2836);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI2847); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1330:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1333:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1334:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI2886); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1351:1: entryRuleEssentialOCLUnaryOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLUnaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1352:2: (iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1353:2: iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_entryRuleEssentialOCLUnaryOperatorCS2932);
            iv_ruleEssentialOCLUnaryOperatorCS=ruleEssentialOCLUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorCS2942); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1360:1: ruleEssentialOCLUnaryOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) ) ;
    public final EObject ruleEssentialOCLUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1363:28: ( ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1364:1: ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1364:1: ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1365:1: ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1365:1: ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1366:1: (lv_name_0_1= '-' | lv_name_0_2= 'not' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1366:1: (lv_name_0_1= '-' | lv_name_0_2= 'not' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1367:3: lv_name_0_1= '-'
                    {
                    lv_name_0_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLUnaryOperatorCS2986); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1379:8: lv_name_0_2= 'not'
                    {
                    lv_name_0_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLUnaryOperatorCS3015); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1402:1: entryRuleEssentialOCLInfixOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLInfixOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1403:2: (iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1404:2: iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorCS_in_entryRuleEssentialOCLInfixOperatorCS3066);
            iv_ruleEssentialOCLInfixOperatorCS=ruleEssentialOCLInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorCS3076); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1411:1: ruleEssentialOCLInfixOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1414:28: ( ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1415:1: ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1415:1: ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1416:1: ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1416:1: ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1417:1: (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1417:1: (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' )
            int alt16=14;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 38:
                {
                alt16=5;
                }
                break;
            case 39:
                {
                alt16=6;
                }
                break;
            case 40:
                {
                alt16=7;
                }
                break;
            case 41:
                {
                alt16=8;
                }
                break;
            case 42:
                {
                alt16=9;
                }
                break;
            case 43:
                {
                alt16=10;
                }
                break;
            case 44:
                {
                alt16=11;
                }
                break;
            case 45:
                {
                alt16=12;
                }
                break;
            case 46:
                {
                alt16=13;
                }
                break;
            case 47:
                {
                alt16=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1418:3: lv_name_0_1= '*'
                    {
                    lv_name_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorCS3120); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1430:8: lv_name_0_2= '/'
                    {
                    lv_name_0_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorCS3149); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1442:8: lv_name_0_3= '+'
                    {
                    lv_name_0_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLInfixOperatorCS3178); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1454:8: lv_name_0_4= '-'
                    {
                    lv_name_0_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLInfixOperatorCS3207); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1466:8: lv_name_0_5= '>'
                    {
                    lv_name_0_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorCS3236); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1478:8: lv_name_0_6= '<'
                    {
                    lv_name_0_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorCS3265); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1490:8: lv_name_0_7= '>='
                    {
                    lv_name_0_7=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorCS3294); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1502:8: lv_name_0_8= '<='
                    {
                    lv_name_0_8=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorCS3323); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1514:8: lv_name_0_9= '='
                    {
                    lv_name_0_9=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorCS3352); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1526:8: lv_name_0_10= '<>'
                    {
                    lv_name_0_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorCS3381); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1538:8: lv_name_0_11= 'and'
                    {
                    lv_name_0_11=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorCS3410); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1550:8: lv_name_0_12= 'or'
                    {
                    lv_name_0_12=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorCS3439); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1562:8: lv_name_0_13= 'xor'
                    {
                    lv_name_0_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorCS3468); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1574:8: lv_name_0_14= 'implies'
                    {
                    lv_name_0_14=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLInfixOperatorCS3497); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1597:1: entryRuleEssentialOCLNavigationOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLNavigationOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1598:2: (iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1599:2: iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_entryRuleEssentialOCLNavigationOperatorCS3548);
            iv_ruleEssentialOCLNavigationOperatorCS=ruleEssentialOCLNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorCS3558); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1606:1: ruleEssentialOCLNavigationOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) ) ;
    public final EObject ruleEssentialOCLNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1609:28: ( ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1610:1: ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1610:1: ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1611:1: ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1611:1: ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1612:1: (lv_name_0_1= '.' | lv_name_0_2= '->' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1612:1: (lv_name_0_1= '.' | lv_name_0_2= '->' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            else if ( (LA17_0==49) ) {
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1613:3: lv_name_0_1= '.'
                    {
                    lv_name_0_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorCS3602); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1625:8: lv_name_0_2= '->'
                    {
                    lv_name_0_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorCS3631); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1648:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1649:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1650:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier3683);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier3694); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1657:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1660:28: (this_ID_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1662:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier3740);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1680:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1681:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1682:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3785);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral3796); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1689:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1692:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1693:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral3835); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1708:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1709:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1710:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS3879);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS3889); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1717:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1720:28: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1721:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1721:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=33 && LA18_0<=35)||(LA18_0>=37 && LA18_0<=47)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=48 && LA18_0<=49)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1722:2: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS3939);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1735:2: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS3969);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1754:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1755:2: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1756:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS4004);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorCS4014); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1763:1: ruleInfixOperatorCS returns [EObject current=null] : this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLInfixOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1766:28: (this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1768:2: this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorCSAccess().getEssentialOCLInfixOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorCS_in_ruleInfixOperatorCS4063);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1787:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1788:2: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1789:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS4097);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorCS4107); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1796:1: ruleNavigationOperatorCS returns [EObject current=null] : this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLNavigationOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1799:28: (this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1801:2: this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getEssentialOCLNavigationOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_ruleNavigationOperatorCS4156);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1820:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1821:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1822:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS4190);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS4200); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1829:1: ruleUnaryOperatorCS returns [EObject current=null] : this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLUnaryOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1832:28: (this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1834:2: this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getEssentialOCLUnaryOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_ruleUnaryOperatorCS4249);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1853:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1854:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1855:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName4284);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName4295); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1862:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1865:28: (this_Identifier_0= ruleIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1867:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName4341);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1885:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1886:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1887:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName4386);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName4397); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1894:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1897:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1899:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName4443);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1917:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1918:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1919:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName4488);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName4499); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1926:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1929:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1930:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1930:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt19=1;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt19=2;
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
                alt19=3;
                }
                break;
            case 50:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1931:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName4546);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1943:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName4579);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1955:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName4612);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1967:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLUnreservedName4636); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1980:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1981:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1982:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName4677);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName4688); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1989:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1992:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:1994:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName4734);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2012:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2013:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2014:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS4778);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS4788); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2021:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2024:28: ( ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2025:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2025:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2025:2: ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2025:2: ( (lv_path_0_0= ruleFirstPathElementCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2026:1: (lv_path_0_0= ruleFirstPathElementCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2026:1: (lv_path_0_0= ruleFirstPathElementCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2027:3: lv_path_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS4834);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2043:2: (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==51) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2043:4: otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePathNameCS4847); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2047:1: ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2048:1: (lv_path_2_0= ruleNextPathElementCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2048:1: (lv_path_2_0= ruleNextPathElementCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2049:3: lv_path_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS4868);
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
            	    break loop20;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2073:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2074:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2075:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS4906);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS4916); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2082:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2085:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2086:1: ( ( ruleUnrestrictedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2086:1: ( ( ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2087:1: ( ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2087:1: ( ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2088:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS4967);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2112:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2113:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2114:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS5002);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS5012); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2121:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2124:28: ( ( ( ruleUnreservedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2125:1: ( ( ruleUnreservedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2125:1: ( ( ruleUnreservedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2126:1: ( ruleUnreservedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2126:1: ( ruleUnreservedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2127:3: ruleUnreservedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS5063);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2153:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2154:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2155:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS5100);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS5110); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2162:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2165:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2166:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2166:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_SIMPLE_ID && LA21_0<=RULE_ESCAPED_ID)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2166:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2166:2: ( ( ruleUnrestrictedName ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2167:1: ( ruleUnrestrictedName )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2167:1: ( ruleUnrestrictedName )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2168:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS5162);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2185:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2185:6: ( () ( ( ruleURI ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2185:7: () ( ( ruleURI ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2185:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2186:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2194:2: ( ( ruleURI ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2195:1: ( ruleURI )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2195:1: ( ruleURI )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2196:3: ruleURI
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
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS5208);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2220:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2221:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2222:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier5246);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier5257); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2229:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2232:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2233:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2233:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt22=1;
                }
                break;
            case 53:
                {
                alt22=2;
                }
                break;
            case 54:
                {
                alt22=3;
                }
                break;
            case 55:
                {
                alt22=4;
                }
                break;
            case 56:
                {
                alt22=5;
                }
                break;
            case 57:
                {
                alt22=6;
                }
                break;
            case 58:
                {
                alt22=7;
                }
                break;
            case 59:
                {
                alt22=8;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2234:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePrimitiveTypeIdentifier5295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2241:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePrimitiveTypeIdentifier5314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2248:2: kw= 'Real'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier5333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2255:2: kw= 'String'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier5352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2262:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier5371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2269:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier5390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2276:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier5409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2283:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier5428); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2296:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2297:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2298:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS5468);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS5478); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2305:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2308:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2309:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2309:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2310:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2310:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2311:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS5523);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2335:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2336:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2337:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier5559);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier5570); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2344:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2347:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2348:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2348:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt23=1;
                }
                break;
            case 61:
                {
                alt23=2;
                }
                break;
            case 62:
                {
                alt23=3;
                }
                break;
            case 63:
                {
                alt23=4;
                }
                break;
            case 64:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2349:2: kw= 'Set'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCollectionTypeIdentifier5608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2356:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCollectionTypeIdentifier5627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2363:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier5646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2370:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier5665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2377:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier5684); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2390:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2391:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2392:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS5724);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS5734); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2399:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2402:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2403:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2403:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2403:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2403:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2404:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2404:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2405:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS5780);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2421:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2421:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionTypeCS5793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2425:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2426:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2426:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2427:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS5814);
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

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionTypeCS5826); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2455:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2456:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2457:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS5864);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS5874); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2464:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2467:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2468:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2468:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2468:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2468:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2469:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2469:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2470:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS5920);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2486:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2486:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMultiplicityBoundsCS5933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2490:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2491:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2491:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2492:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS5954);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2516:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2517:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2518:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS5992);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS6002); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2525:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2528:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2529:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2529:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2529:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMultiplicityCS6039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2533:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=33 && LA26_0<=34)||LA26_0==68) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2534:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS6065);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2547:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS6095);
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

            otherlv_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMultiplicityCS6107); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2570:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2571:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2572:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS6143);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS6153); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2579:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2582:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2583:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2583:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2584:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2584:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2585:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2585:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 33:
                {
                alt27=2;
                }
                break;
            case 68:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2586:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiplicityStringCS6197); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2598:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiplicityStringCS6226); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2610:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMultiplicityStringCS6255); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2633:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2634:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2635:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS6306);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS6316); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2642:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2645:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2646:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2646:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2646:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2646:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2647:1: (lv_name_0_0= 'Tuple' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2647:1: (lv_name_0_0= 'Tuple' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2648:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleTypeCS6359); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2661:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2661:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleTypeCS6385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2665:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=RULE_SIMPLE_ID && LA29_0<=RULE_ESCAPED_ID)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2665:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2665:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2666:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2666:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2667:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6407);
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2683:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==23) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2683:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleTypeCS6420); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2687:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2688:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2688:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2689:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6441);
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
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleTypeCS6457); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2717:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2718:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2719:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS6495);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS6505); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2726:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2729:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2730:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2730:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2730:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2730:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2731:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2731:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2732:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS6551);
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

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTuplePartCS6563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2752:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2753:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2753:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2754:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS6584);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2778:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2779:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2780:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS6620);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS6630); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2787:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2790:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2791:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2792:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2792:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2793:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS6676);
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCollectionLiteralExpCS6688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2813:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SIMPLE_ID && LA32_0<=RULE_SINGLE_QUOTED_STRING)||LA32_0==30||(LA32_0>=34 && LA32_0<=36)||LA32_0==50||(LA32_0>=52 && LA32_0<=64)||(LA32_0>=70 && LA32_0<=73)||LA32_0==77||LA32_0==81||LA32_0==83) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2813:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2813:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2814:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2814:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2815:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6710);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2831:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==23) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2831:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionLiteralExpCS6723); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2835:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2836:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2836:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2837:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6744);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionLiteralExpCS6760); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2865:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2866:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2867:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS6796);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS6806); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2874:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2877:28: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2878:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2878:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2878:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2878:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2879:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2879:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2880:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6852);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2896:2: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==65) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2896:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionLiteralPartCS6865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2900:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2901:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2901:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2902:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6886);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2926:1: entryRuleConstructorPartCS returns [EObject current=null] : iv_ruleConstructorPartCS= ruleConstructorPartCS EOF ;
    public final EObject entryRuleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2927:2: (iv_ruleConstructorPartCS= ruleConstructorPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2928:2: iv_ruleConstructorPartCS= ruleConstructorPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS6924);
            iv_ruleConstructorPartCS=ruleConstructorPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructorPartCS6934); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2935:1: ruleConstructorPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_initExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2938:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2939:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2939:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2939:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2939:2: ( ( ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2940:1: ( ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2940:1: ( ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2941:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS6986);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConstructorPartCS6998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstructorPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2961:1: ( (lv_initExpression_2_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2962:1: (lv_initExpression_2_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2962:1: (lv_initExpression_2_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2963:3: lv_initExpression_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorPartCSAccess().getInitExpressionExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleConstructorPartCS7019);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2987:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2988:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2989:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS7055);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS7065); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2996:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:2999:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3000:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3000:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt34=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt34=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt34=2;
                }
                break;
            case 70:
            case 71:
                {
                alt34=3;
                }
                break;
            case 34:
                {
                alt34=4;
                }
                break;
            case 72:
                {
                alt34=5;
                }
                break;
            case 73:
                {
                alt34=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3001:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7115);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3014:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7145);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3027:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7175);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3040:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7205);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3053:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7235);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3066:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7265);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3085:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3086:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3087:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7300);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7310); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3094:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3097:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3098:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3098:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3098:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleLiteralExpCS7347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTupleLiteralExpCS7359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3106:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3107:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3107:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3108:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7380);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3124:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==23) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3124:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleLiteralExpCS7393); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3128:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3129:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3129:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3130:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7414);
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
            	    break loop35;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleLiteralExpCS7428); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3158:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3159:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3160:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS7464);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS7474); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3167:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3170:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3171:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3171:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3171:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3171:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3172:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3172:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3173:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS7520);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3189:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==69) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3189:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTupleLiteralPartCS7533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3193:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3194:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3194:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3195:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS7554);
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

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTupleLiteralPartCS7568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3215:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3216:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3216:1: (lv_initExpression_4_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3217:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS7589);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3241:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3242:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3243:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS7625);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS7635); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3250:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3253:28: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3254:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3254:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3255:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3255:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3256:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS7680);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3280:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3281:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3282:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS7715);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS7725); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3289:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3292:28: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3293:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3293:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3294:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3294:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3295:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS7770);
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
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3319:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3320:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3321:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS7806);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS7816); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3328:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3331:28: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3332:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3332:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==70) ) {
                alt38=1;
            }
            else if ( (LA38_0==71) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3332:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3332:2: ( (lv_name_0_0= 'true' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3333:1: (lv_name_0_0= 'true' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3333:1: (lv_name_0_0= 'true' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3334:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleBooleanLiteralExpCS7859); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3348:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3348:6: ( (lv_name_1_0= 'false' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3349:1: (lv_name_1_0= 'false' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3349:1: (lv_name_1_0= 'false' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3350:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleBooleanLiteralExpCS7896); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3371:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3372:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3373:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7945);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7955); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3380:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3383:28: ( ( () otherlv_1= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3384:1: ( () otherlv_1= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3384:1: ( () otherlv_1= '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3384:2: () otherlv_1= '*'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3384:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3385:2: 
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

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS8004); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3405:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3406:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3407:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS8040);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS8050); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3414:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3417:28: ( ( () otherlv_1= 'invalid' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3418:1: ( () otherlv_1= 'invalid' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3418:1: ( () otherlv_1= 'invalid' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3418:2: () otherlv_1= 'invalid'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3418:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3419:2: 
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

            otherlv_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleInvalidLiteralExpCS8099); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3439:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3440:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3441:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8135);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS8145); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3448:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3451:28: ( ( () otherlv_1= 'null' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3452:1: ( () otherlv_1= 'null' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3452:1: ( () otherlv_1= 'null' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3452:2: () otherlv_1= 'null'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3452:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3453:2: 
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

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleNullLiteralExpCS8194); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3473:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3474:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3475:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8230);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS8240); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3482:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3485:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3486:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3486:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            int alt39=3;
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
                alt39=1;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt39=2;
                }
                break;
            case 50:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3487:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8290);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3500:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8320);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3513:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8350);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3532:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3533:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3534:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS8385);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS8395); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3541:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_multiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3544:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3545:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3545:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3546:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS8445);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3557:1: ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==66) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3558:1: (lv_multiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3558:1: (lv_multiplicity_1_0= ruleMultiplicityCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3559:3: lv_multiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS8465);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3583:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3584:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3585:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8502);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8512); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3592:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3595:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3596:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3596:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3597:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3597:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3598:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS8557);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3622:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3623:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3624:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS8592);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS8602); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3631:1: ruleTypeNameExpCS returns [EObject current=null] : ( (lv_pathName_0_0= rulePathNameCS ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_pathName_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3634:28: ( ( (lv_pathName_0_0= rulePathNameCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3635:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3635:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3636:1: (lv_pathName_0_0= rulePathNameCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3636:1: (lv_pathName_0_0= rulePathNameCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3637:3: lv_pathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getPathNamePathNameCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS8647);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3661:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3662:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3663:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS8682);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS8692); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3670:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject lv_multiplicity_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3673:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3674:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3674:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3674:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3674:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_SIMPLE_ID && LA41_0<=RULE_ESCAPED_ID)) ) {
                alt41=1;
            }
            else if ( (LA41_0==50||(LA41_0>=52 && LA41_0<=64)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3675:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS8743);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3688:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8773);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3699:2: ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==66) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3700:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3700:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3701:3: lv_multiplicity_2_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8794);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3725:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3726:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3727:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS8831);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS8841); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3734:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3737:28: ( ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3738:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3738:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )
            int alt48=3;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3738:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3738:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3739:2: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8892);
                    this_PrefixedExpCS_0=rulePrefixedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3750:1: ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=33 && LA46_0<=35)||(LA46_0>=37 && LA46_0<=49)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3750:2: () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3750:2: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3751:2: 
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3759:2: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3760:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3760:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3761:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8925);
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3777:2: ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) )
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( ((LA45_0>=RULE_SIMPLE_ID && LA45_0<=RULE_SINGLE_QUOTED_STRING)||LA45_0==30||(LA45_0>=34 && LA45_0<=36)||LA45_0==50||(LA45_0>=52 && LA45_0<=64)||(LA45_0>=70 && LA45_0<=73)||LA45_0==77||LA45_0==83) ) {
                                alt45=1;
                            }
                            else if ( (LA45_0==81) ) {
                                alt45=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 45, 0, input);

                                throw nvae;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3777:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3777:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3777:4: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )?
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3777:4: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3778:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3778:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3779:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_2_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8948);
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

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3795:2: ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )*
                                    loop43:
                                    do {
                                        int alt43=2;
                                        alt43 = dfa43.predict(input);
                                        switch (alt43) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3795:3: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3795:3: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3796:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3796:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3797:3: lv_ownedOperator_4_0= ruleBinaryOperatorCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_2_0_1_0_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8970);
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

                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3813:2: ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3814:1: (lv_ownedExpression_5_0= rulePrefixedExpCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3814:1: (lv_ownedExpression_5_0= rulePrefixedExpCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3815:3: lv_ownedExpression_5_0= rulePrefixedExpCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_2_0_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8991);
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
                                    	    break loop43;
                                        }
                                    } while (true);

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3831:4: ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )?
                                    int alt44=2;
                                    int LA44_0 = input.LA(1);

                                    if ( ((LA44_0>=33 && LA44_0<=35)||(LA44_0>=37 && LA44_0<=49)) ) {
                                        alt44=1;
                                    }
                                    switch (alt44) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3831:5: ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3831:5: ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3832:1: (lv_ownedOperator_6_0= ruleBinaryOperatorCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3832:1: (lv_ownedOperator_6_0= ruleBinaryOperatorCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3833:3: lv_ownedOperator_6_0= ruleBinaryOperatorCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_2_0_2_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS9015);
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

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3849:2: ( (lv_ownedExpression_7_0= ruleLetExpCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3850:1: (lv_ownedExpression_7_0= ruleLetExpCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3850:1: (lv_ownedExpression_7_0= ruleLetExpCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3851:3: lv_ownedExpression_7_0= ruleLetExpCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_0_1_2_0_2_1_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9036);
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
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3868:6: ( (lv_ownedExpression_8_0= ruleLetExpCS ) )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3868:6: ( (lv_ownedExpression_8_0= ruleLetExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3869:1: (lv_ownedExpression_8_0= ruleLetExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3869:1: (lv_ownedExpression_8_0= ruleLetExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3870:3: lv_ownedExpression_8_0= ruleLetExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_0_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9066);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3887:6: ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3887:6: ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3887:7: () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3887:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3888:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3896:2: ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=35 && LA47_0<=36)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3897:1: (lv_ownedOperator_10_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3897:1: (lv_ownedOperator_10_0= ruleUnaryOperatorCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3898:3: lv_ownedOperator_10_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS9110);
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
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3914:3: ( (lv_ownedExpression_11_0= ruleLetExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3915:1: (lv_ownedExpression_11_0= ruleLetExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3915:1: (lv_ownedExpression_11_0= ruleLetExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3916:3: lv_ownedExpression_11_0= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9132);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3934:2: this_LetExpCS_12= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getLetExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9164);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3953:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3954:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3955:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9199);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS9209); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3962:1: rulePrefixedExpCS returns [EObject current=null] : ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedOperator_1_0 = null;

        EObject lv_ownedExpression_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3965:28: ( ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3966:1: ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3966:1: ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=35 && LA50_0<=36)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_SIMPLE_ID && LA50_0<=RULE_SINGLE_QUOTED_STRING)||LA50_0==30||LA50_0==34||LA50_0==50||(LA50_0>=52 && LA50_0<=64)||(LA50_0>=70 && LA50_0<=73)||LA50_0==77||LA50_0==83) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3966:2: ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3966:2: ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3966:3: () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3966:3: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3967:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3975:2: ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=35 && LA49_0<=36)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3976:1: (lv_ownedOperator_1_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3976:1: (lv_ownedOperator_1_0= ruleUnaryOperatorCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3977:3: lv_ownedOperator_1_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS9268);
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
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3993:3: ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3994:1: (lv_ownedExpression_2_0= rulePrimaryExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3994:1: (lv_ownedExpression_2_0= rulePrimaryExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:3995:3: lv_ownedExpression_2_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9290);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4013:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9322);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4032:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4033:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4034:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS9357);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS9367); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4041:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4044:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4045:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4045:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )
            int alt67=8;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4046:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS9417);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4059:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS9447);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4072:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS9477);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4085:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS9507);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4098:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS9537);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4111:2: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS9567);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4124:2: this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS9597);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4136:6: ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4136:6: ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4136:7: () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4136:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4137:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4145:2: ( (lv_pathName_8_0= rulePathNameCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4146:1: (lv_pathName_8_0= rulePathNameCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4146:1: (lv_pathName_8_0= rulePathNameCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4147:3: lv_pathName_8_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS9636);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4163:2: ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt66=1;
                        }
                        break;
                    case 16:
                        {
                        alt66=2;
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
                        alt66=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4163:3: ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4163:3: ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4163:4: () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )?
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4163:4: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4164:2: 
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

                            otherlv_10=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS9662); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_7_2_0_1());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4176:1: ( (lv_firstIndexes_11_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4177:1: (lv_firstIndexes_11_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4177:1: (lv_firstIndexes_11_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4178:3: lv_firstIndexes_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_7_2_0_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9683);
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4194:2: (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==23) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4194:4: otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) )
                            	    {
                            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9696); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_0_3_0());
                            	          
                            	    }
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4198:1: ( (lv_firstIndexes_13_0= ruleExpCS ) )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4199:1: (lv_firstIndexes_13_0= ruleExpCS )
                            	    {
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4199:1: (lv_firstIndexes_13_0= ruleExpCS )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4200:3: lv_firstIndexes_13_0= ruleExpCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_7_2_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9717);
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
                            	    break loop51;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePrimaryExpCS9731); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_7_2_0_4());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4220:1: (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==66) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4220:3: otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']'
                                    {
                                    otherlv_15=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS9744); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_7_2_0_5_0());
                                          
                                    }
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4224:1: ( (lv_secondIndexes_16_0= ruleExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4225:1: (lv_secondIndexes_16_0= ruleExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4225:1: (lv_secondIndexes_16_0= ruleExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4226:3: lv_secondIndexes_16_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_7_2_0_5_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9765);
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

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4242:2: (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )*
                                    loop52:
                                    do {
                                        int alt52=2;
                                        int LA52_0 = input.LA(1);

                                        if ( (LA52_0==23) ) {
                                            alt52=1;
                                        }


                                        switch (alt52) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4242:4: otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) )
                                    	    {
                                    	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9778); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_0_5_2_0());
                                    	          
                                    	    }
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4246:1: ( (lv_secondIndexes_18_0= ruleExpCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4247:1: (lv_secondIndexes_18_0= ruleExpCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4247:1: (lv_secondIndexes_18_0= ruleExpCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4248:3: lv_secondIndexes_18_0= ruleExpCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_7_2_0_5_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9799);
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
                                    	    break loop52;
                                        }
                                    } while (true);

                                    otherlv_19=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePrimaryExpCS9813); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_7_2_0_5_3());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4268:3: ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==74) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4268:4: ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4268:4: ( (lv_atPre_20_0= '@' ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4269:1: (lv_atPre_20_0= '@' )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4269:1: (lv_atPre_20_0= '@' )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4270:3: lv_atPre_20_0= '@'
                                    {
                                    lv_atPre_20_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePrimaryExpCS9834); if (state.failed) return current;
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

                                    otherlv_21=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePrimaryExpCS9859); if (state.failed) return current;
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
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4288:6: ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4288:6: ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4288:7: () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}'
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4288:7: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4289:2: 
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

                            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpCS9893); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpCSAccess().getLeftCurlyBracketKeyword_7_2_1_1());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4301:1: ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) )
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( ((LA57_0>=RULE_SIMPLE_ID && LA57_0<=RULE_ESCAPED_ID)||LA57_0==17) ) {
                                alt57=1;
                            }
                            else if ( (LA57_0==RULE_SINGLE_QUOTED_STRING) ) {
                                alt57=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 57, 0, input);

                                throw nvae;
                            }
                            switch (alt57) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4301:2: ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )?
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4301:2: ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )?
                                    int alt56=2;
                                    int LA56_0 = input.LA(1);

                                    if ( ((LA56_0>=RULE_SIMPLE_ID && LA56_0<=RULE_ESCAPED_ID)) ) {
                                        alt56=1;
                                    }
                                    switch (alt56) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4301:3: ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )*
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4301:3: ( (lv_ownedParts_24_0= ruleConstructorPartCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4302:1: (lv_ownedParts_24_0= ruleConstructorPartCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4302:1: (lv_ownedParts_24_0= ruleConstructorPartCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4303:3: lv_ownedParts_24_0= ruleConstructorPartCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_7_2_1_2_0_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9916);
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

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4319:2: (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )*
                                            loop55:
                                            do {
                                                int alt55=2;
                                                int LA55_0 = input.LA(1);

                                                if ( (LA55_0==23) ) {
                                                    alt55=1;
                                                }


                                                switch (alt55) {
                                            	case 1 :
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4319:4: otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) )
                                            	    {
                                            	    otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9929); if (state.failed) return current;
                                            	    if ( state.backtracking==0 ) {

                                            	          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_1_2_0_1_0());
                                            	          
                                            	    }
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4323:1: ( (lv_ownedParts_26_0= ruleConstructorPartCS ) )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4324:1: (lv_ownedParts_26_0= ruleConstructorPartCS )
                                            	    {
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4324:1: (lv_ownedParts_26_0= ruleConstructorPartCS )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4325:3: lv_ownedParts_26_0= ruleConstructorPartCS
                                            	    {
                                            	    if ( state.backtracking==0 ) {
                                            	       
                                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_7_2_1_2_0_1_1_0()); 
                                            	      	    
                                            	    }
                                            	    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9950);
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
                                            	    break loop55;
                                                }
                                            } while (true);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4342:6: ( (lv_value_27_0= ruleStringLiteral ) )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4342:6: ( (lv_value_27_0= ruleStringLiteral ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:1: (lv_value_27_0= ruleStringLiteral )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4343:1: (lv_value_27_0= ruleStringLiteral )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4344:3: lv_value_27_0= ruleStringLiteral
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getValueStringLiteralParserRuleCall_7_2_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rulePrimaryExpCS9981);
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

                            otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePrimaryExpCS9994); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_28, grammarAccess.getPrimaryExpCSAccess().getRightCurlyBracketKeyword_7_2_1_3());
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4365:6: ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4365:6: ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4365:7: ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )?
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4365:7: ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==74) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4365:8: ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4365:8: ( (lv_atPre_29_0= '@' ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4366:1: (lv_atPre_29_0= '@' )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4366:1: (lv_atPre_29_0= '@' )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4367:3: lv_atPre_29_0= '@'
                                    {
                                    lv_atPre_29_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePrimaryExpCS10021); if (state.failed) return current;
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

                                    otherlv_30=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePrimaryExpCS10046); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_7_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4384:3: ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )?
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==30) ) {
                                alt65=1;
                            }
                            switch (alt65) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4384:4: () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4384:4: ()
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4385:2: 
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

                                    otherlv_32=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaryExpCS10073); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpCSAccess().getLeftParenthesisKeyword_7_2_2_1_1());
                                          
                                    }
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4397:1: ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )?
                                    int alt64=2;
                                    int LA64_0 = input.LA(1);

                                    if ( ((LA64_0>=RULE_SIMPLE_ID && LA64_0<=RULE_SINGLE_QUOTED_STRING)||LA64_0==30||(LA64_0>=34 && LA64_0<=36)||LA64_0==50||(LA64_0>=52 && LA64_0<=64)||(LA64_0>=70 && LA64_0<=73)||LA64_0==77||LA64_0==81||LA64_0==83) ) {
                                        alt64=1;
                                    }
                                    switch (alt64) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4397:2: ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )?
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4397:2: ( (lv_argument_33_0= ruleNavigatingArgCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4398:1: (lv_argument_33_0= ruleNavigatingArgCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4398:1: (lv_argument_33_0= ruleNavigatingArgCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4399:3: lv_argument_33_0= ruleNavigatingArgCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_7_2_2_1_2_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS10095);
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

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4415:2: ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )*
                                            loop59:
                                            do {
                                                int alt59=2;
                                                int LA59_0 = input.LA(1);

                                                if ( (LA59_0==23) ) {
                                                    alt59=1;
                                                }


                                                switch (alt59) {
                                            	case 1 :
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4416:1: (lv_argument_34_0= ruleNavigatingCommaArgCS )
                                            	    {
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4416:1: (lv_argument_34_0= ruleNavigatingCommaArgCS )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4417:3: lv_argument_34_0= ruleNavigatingCommaArgCS
                                            	    {
                                            	    if ( state.backtracking==0 ) {
                                            	       
                                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_1_0()); 
                                            	      	    
                                            	    }
                                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10116);
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
                                            	    break loop59;
                                                }
                                            } while (true);

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4433:3: ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )?
                                            int alt61=2;
                                            int LA61_0 = input.LA(1);

                                            if ( (LA61_0==21) ) {
                                                alt61=1;
                                            }
                                            switch (alt61) {
                                                case 1 :
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4433:4: ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )*
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4433:4: ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4434:1: (lv_argument_35_0= ruleNavigatingSemiArgCS )
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4434:1: (lv_argument_35_0= ruleNavigatingSemiArgCS )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4435:3: lv_argument_35_0= ruleNavigatingSemiArgCS
                                                    {
                                                    if ( state.backtracking==0 ) {
                                                       
                                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_7_2_2_1_2_2_0_0()); 
                                                      	    
                                                    }
                                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS10139);
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

                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4451:2: ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )*
                                                    loop60:
                                                    do {
                                                        int alt60=2;
                                                        int LA60_0 = input.LA(1);

                                                        if ( (LA60_0==23) ) {
                                                            alt60=1;
                                                        }


                                                        switch (alt60) {
                                                    	case 1 :
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4452:1: (lv_argument_36_0= ruleNavigatingCommaArgCS )
                                                    	    {
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4452:1: (lv_argument_36_0= ruleNavigatingCommaArgCS )
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4453:3: lv_argument_36_0= ruleNavigatingCommaArgCS
                                                    	    {
                                                    	    if ( state.backtracking==0 ) {
                                                    	       
                                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_2_1_0()); 
                                                    	      	    
                                                    	    }
                                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10160);
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
                                                    	    break loop60;
                                                        }
                                                    } while (true);


                                                    }
                                                    break;

                                            }

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4469:5: ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )?
                                            int alt63=2;
                                            int LA63_0 = input.LA(1);

                                            if ( (LA63_0==76) ) {
                                                alt63=1;
                                            }
                                            switch (alt63) {
                                                case 1 :
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4469:6: ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )*
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4469:6: ( (lv_argument_37_0= ruleNavigatingBarArgCS ) )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4470:1: (lv_argument_37_0= ruleNavigatingBarArgCS )
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4470:1: (lv_argument_37_0= ruleNavigatingBarArgCS )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4471:3: lv_argument_37_0= ruleNavigatingBarArgCS
                                                    {
                                                    if ( state.backtracking==0 ) {
                                                       
                                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_7_2_2_1_2_3_0_0()); 
                                                      	    
                                                    }
                                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS10185);
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

                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4487:2: ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )*
                                                    loop62:
                                                    do {
                                                        int alt62=2;
                                                        int LA62_0 = input.LA(1);

                                                        if ( (LA62_0==23) ) {
                                                            alt62=1;
                                                        }


                                                        switch (alt62) {
                                                    	case 1 :
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4488:1: (lv_argument_38_0= ruleNavigatingCommaArgCS )
                                                    	    {
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4488:1: (lv_argument_38_0= ruleNavigatingCommaArgCS )
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4489:3: lv_argument_38_0= ruleNavigatingCommaArgCS
                                                    	    {
                                                    	    if ( state.backtracking==0 ) {
                                                    	       
                                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_3_1_0()); 
                                                    	      	    
                                                    	    }
                                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10206);
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
                                                    	    break loop62;
                                                        }
                                                    } while (true);


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }

                                    otherlv_39=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrimaryExpCS10223); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4517:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4518:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4519:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS10264);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS10274); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4526:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4529:28: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4530:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4530:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4530:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4530:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4531:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4531:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4532:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS10320);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4548:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==69) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4548:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingArgCS10333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4552:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4553:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4553:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4554:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS10354);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4570:2: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==42) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4570:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                            {
                            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingArgCS10367); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_1_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4574:1: ( (lv_init_4_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4575:1: (lv_init_4_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4575:1: (lv_init_4_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4576:3: lv_init_4_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS10388);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4600:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4601:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4602:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS10428);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS10438); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4609:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4612:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4613:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4613:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4613:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4613:2: ( (lv_prefix_0_0= '|' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4614:1: (lv_prefix_0_0= '|' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4614:1: (lv_prefix_0_0= '|' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4615:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleNavigatingBarArgCS10481); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4628:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4629:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4629:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4630:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS10515);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4646:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4646:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingBarArgCS10528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4650:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4651:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4651:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4652:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS10549);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4668:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==42) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4668:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingBarArgCS10562); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4672:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4673:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4673:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4674:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS10583);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4698:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4699:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4700:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS10623);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS10633); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4707:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4710:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4711:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4711:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4711:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4711:2: ( (lv_prefix_0_0= ',' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4712:1: (lv_prefix_0_0= ',' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4712:1: (lv_prefix_0_0= ',' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4713:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNavigatingCommaArgCS10676); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4726:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4727:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4727:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4728:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS10710);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4744:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==69) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4744:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingCommaArgCS10723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4748:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4749:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4749:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4750:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS10744);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4766:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==42) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4766:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingCommaArgCS10757); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4770:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4771:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4771:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4772:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10778);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4796:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4797:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4798:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10818);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10828); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4805:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4808:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4809:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4809:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4809:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4809:2: ( (lv_prefix_0_0= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4810:1: (lv_prefix_0_0= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4810:1: (lv_prefix_0_0= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4811:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNavigatingSemiArgCS10871); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4824:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4825:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4825:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4826:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10905);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4842:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==69) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4842:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingSemiArgCS10918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4846:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4847:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4847:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4848:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10939);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4864:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==42) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4864:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingSemiArgCS10952); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4868:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4869:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4869:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4870:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10973);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4894:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4895:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4896:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS11013);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS11023); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4903:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4906:28: (this_ExpCS_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4908:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS11072);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4927:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4928:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4929:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11106);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS11116); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4936:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4939:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4940:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4940:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4940:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleIfExpCS11153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4944:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4945:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4945:1: (lv_condition_1_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4946:3: lv_condition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11174);
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

            otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleIfExpCS11186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4966:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4967:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4967:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4968:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11207);
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

            otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleIfExpCS11219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4988:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4989:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4989:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4990:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11240);
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

            otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleIfExpCS11252); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5018:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5019:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5020:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11288);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS11298); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5027:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5030:28: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5031:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5031:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5031:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleLetExpCS11335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5035:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5036:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5036:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5037:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11356);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5053:2: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==23) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5053:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLetExpCS11369); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5057:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5058:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5058:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5059:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11390);
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
            	    break loop76;
                }
            } while (true);

            otherlv_4=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleLetExpCS11404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5079:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5080:1: (lv_in_5_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5080:1: (lv_in_5_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5081:3: lv_in_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS11425);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5105:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5106:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5107:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11461);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS11471); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5114:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5117:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5118:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5118:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5118:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5118:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5119:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5119:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5120:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS11517);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5136:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==69) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5136:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLetVariableCS11530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5140:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5141:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5141:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5142:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11551);
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

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLetVariableCS11565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5162:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5163:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5163:1: (lv_initExpression_4_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5164:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS11586);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5188:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5189:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5190:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11622);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS11632); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5197:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5200:28: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5201:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5201:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5201:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNestedExpCS11669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5205:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5206:1: (lv_source_1_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5206:1: (lv_source_1_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5207:3: lv_source_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS11690);
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

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNestedExpCS11702); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5235:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5236:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5237:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11738);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS11748); if (state.failed) return current;

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5244:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5247:28: ( ( () otherlv_1= 'self' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5248:1: ( () otherlv_1= 'self' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5248:1: ( () otherlv_1= 'self' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5248:2: () otherlv_1= 'self'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5248:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5249:2: 
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

            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleSelfExpCS11797); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5269:1: ruleLocationConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) ) ;
    public final Enumerator ruleLocationConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5271:28: ( ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5272:1: ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5272:1: ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==84) ) {
                alt78=1;
            }
            else if ( (LA78_0==85) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5272:2: (enumLiteral_0= 'sameLocation' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5272:2: (enumLiteral_0= 'sameLocation' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5272:4: enumLiteral_0= 'sameLocation'
                    {
                    enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleLocationConstraintType11847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLocationConstraintTypeAccess().getSAME_LOCATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLocationConstraintTypeAccess().getSAME_LOCATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5278:6: (enumLiteral_1= 'differentLocation' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5278:6: (enumLiteral_1= 'differentLocation' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:5278:8: enumLiteral_1= 'differentLocation'
                    {
                    enumLiteral_1=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleLocationConstraintType11864); if (state.failed) return current;
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

    // $ANTLR start synpred87_InternalAllocationSpecificationLanguage
    public final void synpred87_InternalAllocationSpecificationLanguage_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4098:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4098:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred87_InternalAllocationSpecificationLanguage9537);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalAllocationSpecificationLanguage

    // $ANTLR start synpred88_InternalAllocationSpecificationLanguage
    public final void synpred88_InternalAllocationSpecificationLanguage_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_5 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4111:2: (this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4111:2: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred88_InternalAllocationSpecificationLanguage9567);
        this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalAllocationSpecificationLanguage

    // $ANTLR start synpred89_InternalAllocationSpecificationLanguage
    public final void synpred89_InternalAllocationSpecificationLanguage_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_6 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4124:2: (this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecificationLanguage.g:4124:2: this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred89_InternalAllocationSpecificationLanguage9597);
        this_TypeLiteralExpCS_6=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_InternalAllocationSpecificationLanguage

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
    public final boolean synpred89_InternalAllocationSpecificationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalAllocationSpecificationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA48 dfa48 = new DFA48(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA67 dfa67 = new DFA67(this);
    static final String DFA48_eotS =
        "\6\uffff";
    static final String DFA48_eofS =
        "\6\uffff";
    static final String DFA48_minS =
        "\3\4\3\uffff";
    static final String DFA48_maxS =
        "\3\123\3\uffff";
    static final String DFA48_acceptS =
        "\3\uffff\1\1\1\3\1\2";
    static final String DFA48_specialS =
        "\6\uffff}>";
    static final String[] DFA48_transitionS = {
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "3738:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )";
        }
    }
    static final String DFA43_eotS =
        "\23\uffff";
    static final String DFA43_eofS =
        "\1\21\22\uffff";
    static final String DFA43_minS =
        "\1\21\20\4\2\uffff";
    static final String DFA43_maxS =
        "\1\122\20\123\2\uffff";
    static final String DFA43_acceptS =
        "\21\uffff\1\2\1\1";
    static final String DFA43_specialS =
        "\23\uffff}>";
    static final String[] DFA43_transitionS = {
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 3795:2: ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )*";
        }
    }
    static final String DFA67_eotS =
        "\35\uffff";
    static final String DFA67_eofS =
        "\35\uffff";
    static final String DFA67_minS =
        "\1\4\12\uffff\6\0\14\uffff";
    static final String DFA67_maxS =
        "\1\123\12\uffff\6\0\14\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\14\uffff\1\7\7\uffff\1\10\1\uffff\1\5\1"+
        "\6";
    static final String DFA67_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\14\uffff}>";
    static final String[] DFA67_transitionS = {
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "4045:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )? | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecificationLanguage()) ) {s = 27;}

                        else if ( (synpred89_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred89_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred89_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred89_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred89_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalAllocationSpecificationLanguage()) ) {s = 28;}

                        else if ( (synpred89_InternalAllocationSpecificationLanguage()) ) {s = 17;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
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
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1023 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleLocationConstraint1036 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1057 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleLocationConstraint1071 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocationConstraint1083 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleLocationConstraint1104 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLocationConstraint1116 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLocationConstraint1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceConstraint_in_entryRuleResourceConstraint1164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceConstraint1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleResourceConstraint1211 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleResourceConstraint1232 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleResourceConstraint1245 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleResourceConstraint1257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1278 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1290 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleResourceConstraint1302 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1323 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1335 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleResourceConstraint1347 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1368 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleResourceConstraint1381 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1402 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1416 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleResourceConstraint1428 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleResourceConstraint1449 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1461 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleResourceConstraint1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_entryRuleRequiredHardwareResourceInstanceConstraint1509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredHardwareResourceInstanceConstraint1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleRequiredHardwareResourceInstanceConstraint1556 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleRequiredHardwareResourceInstanceConstraint1577 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRequiredHardwareResourceInstanceConstraint1590 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRequiredHardwareResourceInstanceConstraint1602 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1623 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleRequiredHardwareResourceInstanceConstraint1636 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1657 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1671 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleRequiredHardwareResourceInstanceConstraint1683 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleRequiredHardwareResourceInstanceConstraint1704 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1716 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRequiredHardwareResourceInstanceConstraint1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_entryRuleLocationTupleDescriptor1764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationTupleDescriptor1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLocationTupleDescriptor1811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationTupleDescriptor1832 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLocationTupleDescriptor1844 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationTupleDescriptor1865 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLocationTupleDescriptor1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_entryRuleValueTupleDescriptor1913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueTupleDescriptor1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleValueTupleDescriptor1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_entryRuleComponentResourceTupleDescriptor2003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentResourceTupleDescriptor2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleComponentResourceTupleDescriptor2050 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2071 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleComponentResourceTupleDescriptor2083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2104 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentResourceTupleDescriptor2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeasureFunction_in_entryRuleMeasureFunction2152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeasureFunction2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMeasureFunction2199 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleMeasureFunction2226 = new BitSet(new long[]{0x0000000200200000L});
        public static final BitSet FOLLOW_33_in_ruleMeasureFunction2239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleMeasureFunction2266 = new BitSet(new long[]{0x0000000200200000L});
        public static final BitSet FOLLOW_21_in_ruleMeasureFunction2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel2316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleModel2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID2407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID2458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER2530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER2625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUPPER2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL2741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_entryRuleEssentialOCLUnaryOperatorCS2932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorCS2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLUnaryOperatorCS2986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLUnaryOperatorCS3015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorCS_in_entryRuleEssentialOCLInfixOperatorCS3066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorCS3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorCS3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorCS3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLInfixOperatorCS3178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLInfixOperatorCS3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorCS3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorCS3265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorCS3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorCS3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorCS3352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorCS3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorCS3410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorCS3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorCS3468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLInfixOperatorCS3497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_entryRuleEssentialOCLNavigationOperatorCS3548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorCS3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorCS3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorCS3631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier3683 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier3694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS3879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS3889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS3969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS4004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorCS4014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorCS_in_ruleInfixOperatorCS4063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS4097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorCS4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_ruleNavigationOperatorCS4156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS4190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS4200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_ruleUnaryOperatorCS4249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName4284 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName4295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName4386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName4397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName4488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName4546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName4579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName4612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLUnreservedName4636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName4677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName4688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName4734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS4778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS4788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS4834 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_rulePathNameCS4847 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS4868 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS4906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS4916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS5002 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS5012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS5063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS5100 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS5110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS5162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS5208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier5246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulePrimitiveTypeIdentifier5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulePrimitiveTypeIdentifier5314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier5333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier5352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier5390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier5409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS5468 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS5478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS5523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier5559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier5570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCollectionTypeIdentifier5608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCollectionTypeIdentifier5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier5646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier5665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier5684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS5724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS5734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS5780 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleCollectionTypeCS5793 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS5814 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionTypeCS5826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS5864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS5874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS5920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMultiplicityBoundsCS5933 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS5954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS5992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS6002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMultiplicityCS6039 = new BitSet(new long[]{0x0000000600000040L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS6065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS6095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleMultiplicityCS6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS6143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS6153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMultiplicityStringCS6197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMultiplicityStringCS6226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleMultiplicityStringCS6255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS6306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTupleTypeCS6359 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTupleTypeCS6385 = new BitSet(new long[]{0xFFF4001CC00000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6407 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_23_in_ruleTupleTypeCS6420 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6441 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_31_in_ruleTupleTypeCS6457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS6495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS6505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS6551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleTuplePartCS6563 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS6584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS6620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS6630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS6676 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCollectionLiteralExpCS6688 = new BitSet(new long[]{0xFFF4001C400200F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6710 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionLiteralExpCS6723 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6744 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleCollectionLiteralExpCS6760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS6796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS6806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionLiteralPartCS6865 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS6924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructorPartCS6934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS6986 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleConstructorPartCS6998 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleConstructorPartCS7019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS7055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS7065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTupleLiteralExpCS7347 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTupleLiteralExpCS7359 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7380 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleTupleLiteralExpCS7393 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7414 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleTupleLiteralExpCS7428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS7464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS7474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS7520 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleTupleLiteralPartCS7533 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS7554 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTupleLiteralPartCS7568 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS7589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS7625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS7635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS7680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS7715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS7725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS7770 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS7806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS7816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleBooleanLiteralExpCS7859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleBooleanLiteralExpCS7896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS8004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS8040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS8050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleInvalidLiteralExpCS8099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS8145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleNullLiteralExpCS8194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS8240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS8385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS8395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS8445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS8465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS8557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS8592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS8602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS8647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS8682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS8692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS8743 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8773 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS8831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS8841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8892 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8925 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8948 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8970 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8991 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS9015 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS9110 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS9209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS9268 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS9357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS9367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS9417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS9447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS9477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS9507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS9537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS9567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS9597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS9636 = new BitSet(new long[]{0x0000000040010002L,0x0000000000000404L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS9662 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9683 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9696 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9717 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePrimaryExpCS9731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000404L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS9744 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9765 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9778 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9799 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePrimaryExpCS9813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulePrimaryExpCS9834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulePrimaryExpCS9859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpCS9893 = new BitSet(new long[]{0xFFF4001C400200F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9916 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9929 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9950 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimaryExpCS9981 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePrimaryExpCS9994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulePrimaryExpCS10021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulePrimaryExpCS10046 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_rulePrimaryExpCS10073 = new BitSet(new long[]{0xFFF4001CC00000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS10095 = new BitSet(new long[]{0x0000000080A00000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10116 = new BitSet(new long[]{0x0000000080A00000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS10139 = new BitSet(new long[]{0x0000000080800000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10160 = new BitSet(new long[]{0x0000000080800000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS10185 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10206 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_31_in_rulePrimaryExpCS10223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS10264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS10274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS10320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingArgCS10333 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS10354 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingArgCS10367 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS10388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS10428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS10438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleNavigatingBarArgCS10481 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS10515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingBarArgCS10528 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS10549 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingBarArgCS10562 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS10583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS10623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS10633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNavigatingCommaArgCS10676 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS10710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingCommaArgCS10723 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS10744 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingCommaArgCS10757 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNavigatingSemiArgCS10871 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingSemiArgCS10918 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10939 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingSemiArgCS10952 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS11013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS11023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS11072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS11116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleIfExpCS11153 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleIfExpCS11186 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleIfExpCS11219 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleIfExpCS11252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS11298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleLetExpCS11335 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11356 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L});
        public static final BitSet FOLLOW_23_in_ruleLetExpCS11369 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11390 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleLetExpCS11404 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS11425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS11471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS11517 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleLetVariableCS11530 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11551 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleLetVariableCS11565 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS11586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS11632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNestedExpCS11669 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS11690 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleNestedExpCS11702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11738 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS11748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleSelfExpCS11797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleLocationConstraintType11847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleLocationConstraintType11864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred87_InternalAllocationSpecificationLanguage9537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred88_InternalAllocationSpecificationLanguage9567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred89_InternalAllocationSpecificationLanguage9597 = new BitSet(new long[]{0x0000000000000002L});
    }


}