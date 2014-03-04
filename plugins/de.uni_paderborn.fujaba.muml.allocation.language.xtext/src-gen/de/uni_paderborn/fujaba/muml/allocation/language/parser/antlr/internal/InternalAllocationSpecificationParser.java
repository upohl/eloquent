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
import de.uni_paderborn.fujaba.muml.allocation.language.services.AllocationSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAllocationSpecificationParser extends AbstractInternalAntlrParser {
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


        public InternalAllocationSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAllocationSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAllocationSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AllocationSpecificationGrammarAccess grammarAccess;
     	
        public InternalAllocationSpecificationParser(TokenStream input, AllocationSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected AllocationSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecification"
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:74:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:75:2: (iv_ruleSpecification= ruleSpecification EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:76:2: iv_ruleSpecification= ruleSpecification EOF
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:83:1: ruleSpecification returns [EObject current=null] : ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) ) otherlv_6= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:86:28: ( ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) ) otherlv_6= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:87:1: ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) ) otherlv_6= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:87:1: ( () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) ) otherlv_6= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:87:2: () ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )* ( (lv_measure_5_0= ruleMeasureFunction ) ) otherlv_6= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:87:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSpecificationAccess().getSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:96:2: ( (lv_name_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:97:1: (lv_name_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:97:1: (lv_name_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:98:3: lv_name_1_0= ruleID
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:118:1: ( ( (lv_services_3_0= ruleService ) ) | ( (lv_constraints_4_0= ruleConstraint ) ) )*
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
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:118:2: ( (lv_services_3_0= ruleService ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:118:2: ( (lv_services_3_0= ruleService ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:119:1: (lv_services_3_0= ruleService )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:119:1: (lv_services_3_0= ruleService )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:120:3: lv_services_3_0= ruleService
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
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:137:6: ( (lv_constraints_4_0= ruleConstraint ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:137:6: ( (lv_constraints_4_0= ruleConstraint ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:138:1: (lv_constraints_4_0= ruleConstraint )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:138:1: (lv_constraints_4_0= ruleConstraint )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:139:3: lv_constraints_4_0= ruleConstraint
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:155:4: ( (lv_measure_5_0= ruleMeasureFunction ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:156:1: (lv_measure_5_0= ruleMeasureFunction )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:156:1: (lv_measure_5_0= ruleMeasureFunction )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:157:3: lv_measure_5_0= ruleMeasureFunction
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

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSpecification245); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:185:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:186:2: (iv_ruleService= ruleService EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:187:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService281);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService291); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:194:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dimensions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:197:28: ( (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:198:1: (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:198:1: (otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:198:3: otherlv_0= 'service' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_dimensions_3_0= ruleQosDimension ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleService328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:202:1: ( (lv_name_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:203:1: (lv_name_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:203:1: (lv_name_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:204:3: lv_name_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNameIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleService349);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleService361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:224:1: ( (lv_dimensions_3_0= ruleQosDimension ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:225:1: (lv_dimensions_3_0= ruleQosDimension )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:225:1: (lv_dimensions_3_0= ruleQosDimension )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:226:3: lv_dimensions_3_0= ruleQosDimension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getDimensionsQosDimensionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQosDimension_in_ruleService382);
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
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleService395); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:254:1: entryRuleQosDimension returns [EObject current=null] : iv_ruleQosDimension= ruleQosDimension EOF ;
    public final EObject entryRuleQosDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQosDimension = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:255:2: (iv_ruleQosDimension= ruleQosDimension EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:256:2: iv_ruleQosDimension= ruleQosDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQosDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQosDimension_in_entryRuleQosDimension431);
            iv_ruleQosDimension=ruleQosDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQosDimension; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQosDimension441); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:263:1: ruleQosDimension returns [EObject current=null] : (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleID ) ) otherlv_13= ';' otherlv_14= '}' ) ;
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

        AntlrDatatypeRuleToken lv_metric_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:266:28: ( (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleID ) ) otherlv_13= ';' otherlv_14= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:267:1: (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleID ) ) otherlv_13= ';' otherlv_14= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:267:1: (otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleID ) ) otherlv_13= ';' otherlv_14= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:267:3: otherlv_0= 'qos' ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'descriptors' ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_10= ';' otherlv_11= 'ocl' ( (lv_metric_12_0= ruleID ) ) otherlv_13= ';' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQosDimension478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQosDimensionAccess().getQosKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:271:1: ( (lv_name_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:272:1: (lv_name_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:272:1: (lv_name_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:273:3: lv_name_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getNameIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleQosDimension499);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQosDimension511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQosDimensionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleQosDimension523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getQosDimensionAccess().getValueKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:297:1: ( (lv_value_4_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:298:1: (lv_value_4_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:298:1: (lv_value_4_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:299:3: lv_value_4_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getValueValueTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleQosDimension544);
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

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQosDimension556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getQosDimensionAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleQosDimension568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getQosDimensionAccess().getDescriptorsKeyword_6());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:323:1: ( (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:324:1: (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:324:1: (lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:325:3: lv_tupleDescriptors_7_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension589);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:341:2: (otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:341:4: otherlv_8= ',' ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleQosDimension602); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getQosDimensionAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:345:1: ( (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:346:1: (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:346:1: (lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:347:3: lv_tupleDescriptors_9_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQosDimensionAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension623);
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
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQosDimension637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getQosDimensionAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleQosDimension649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getQosDimensionAccess().getOclKeyword_10());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:371:1: ( (lv_metric_12_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:372:1: (lv_metric_12_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:372:1: (lv_metric_12_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:373:3: lv_metric_12_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQosDimensionAccess().getMetricIDParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleQosDimension670);
            lv_metric_12_0=ruleID();

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
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQosDimension682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getQosDimensionAccess().getSemicolonKeyword_12());
                  
            }
            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQosDimension694); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:405:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:406:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:407:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint730);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint740); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:414:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_LocationConstraint_1 = null;

        EObject this_ResourceConstraint_2 = null;

        EObject this_RequiredHardwareResourceInstanceConstraint_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:417:28: ( (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:418:1: (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:418:1: (otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:418:3: otherlv_0= 'constraint' (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstraint777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:422:1: (this_LocationConstraint_1= ruleLocationConstraint | this_ResourceConstraint_2= ruleResourceConstraint | this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 84:
            case 85:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:423:2: this_LocationConstraint_1= ruleLocationConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getLocationConstraintParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLocationConstraint_in_ruleConstraint803);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:436:2: this_ResourceConstraint_2= ruleResourceConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getResourceConstraintParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleResourceConstraint_in_ruleConstraint833);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:449:2: this_RequiredHardwareResourceInstanceConstraint_3= ruleRequiredHardwareResourceInstanceConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintAccess().getRequiredHardwareResourceInstanceConstraintParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_ruleConstraint863);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:468:1: entryRuleLocationConstraint returns [EObject current=null] : iv_ruleLocationConstraint= ruleLocationConstraint EOF ;
    public final EObject entryRuleLocationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:469:2: (iv_ruleLocationConstraint= ruleLocationConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:470:2: iv_ruleLocationConstraint= ruleLocationConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationConstraint_in_entryRuleLocationConstraint899);
            iv_ruleLocationConstraint=ruleLocationConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationConstraint909); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:477:1: ruleLocationConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:480:28: ( ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:481:1: ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:481:1: ( ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:481:2: ( (lv_type_0_0= ruleLocationConstraintType ) ) ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= 'ocl' ( (lv_expression_9_0= ruleModel ) ) otherlv_10= ';' otherlv_11= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:481:2: ( (lv_type_0_0= ruleLocationConstraintType ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:482:1: (lv_type_0_0= ruleLocationConstraintType )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:482:1: (lv_type_0_0= ruleLocationConstraintType )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:483:3: lv_type_0_0= ruleLocationConstraintType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTypeLocationConstraintTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationConstraintType_in_ruleLocationConstraint955);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:499:2: ( (lv_name_1_0= ruleID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SIMPLE_ID && LA5_0<=RULE_ESCAPED_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:500:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:500:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:501:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationConstraint976);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLocationConstraint989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocationConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLocationConstraint1001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocationConstraintAccess().getDescriptorsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:525:1: ( (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:526:1: (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:526:1: (lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:527:3: lv_tupleDescriptors_4_0= ruleLocationTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTupleDescriptorsLocationTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1022);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:543:2: (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:543:4: otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocationConstraint1035); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getLocationConstraintAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:547:1: ( (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:548:1: (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:548:1: (lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:549:3: lv_tupleDescriptors_6_0= ruleLocationTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getTupleDescriptorsLocationTupleDescriptorParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1056);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLocationConstraint1070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLocationConstraintAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocationConstraint1082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getLocationConstraintAccess().getOclKeyword_7());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:573:1: ( (lv_expression_9_0= ruleModel ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:574:1: (lv_expression_9_0= ruleModel )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:574:1: (lv_expression_9_0= ruleModel )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:575:3: lv_expression_9_0= ruleModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationConstraintAccess().getExpressionModelParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleLocationConstraint1103);
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

            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLocationConstraint1115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getLocationConstraintAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLocationConstraint1127); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:607:1: entryRuleResourceConstraint returns [EObject current=null] : iv_ruleResourceConstraint= ruleResourceConstraint EOF ;
    public final EObject entryRuleResourceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:608:2: (iv_ruleResourceConstraint= ruleResourceConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:609:2: iv_ruleResourceConstraint= ruleResourceConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceConstraint_in_entryRuleResourceConstraint1163);
            iv_ruleResourceConstraint=ruleResourceConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceConstraint1173); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:616:1: ruleResourceConstraint returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lhs_4_0 = null;

        EObject lv_rhs_7_0 = null;

        EObject lv_tupleDescriptors_10_0 = null;

        EObject lv_tupleDescriptors_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:619:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:620:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:620:1: (otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:620:3: otherlv_0= 'resource' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'lhs' ( (lv_lhs_4_0= ruleValueTupleDescriptor ) ) otherlv_5= ';' otherlv_6= 'rhs' ( (lv_rhs_7_0= ruleValueTupleDescriptor ) ) otherlv_8= ';' otherlv_9= 'descriptors' ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_13= ';' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleResourceConstraint1210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getResourceConstraintAccess().getResourceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:624:1: ( (lv_name_1_0= ruleID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SIMPLE_ID && LA7_0<=RULE_ESCAPED_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:625:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:625:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:626:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleResourceConstraint1231);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleResourceConstraint1244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getResourceConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleResourceConstraint1256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getResourceConstraintAccess().getLhsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:650:1: ( (lv_lhs_4_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:651:1: (lv_lhs_4_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:651:1: (lv_lhs_4_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:652:3: lv_lhs_4_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getLhsValueTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1277);
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

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleResourceConstraint1301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getResourceConstraintAccess().getRhsKeyword_6());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:676:1: ( (lv_rhs_7_0= ruleValueTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:677:1: (lv_rhs_7_0= ruleValueTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:677:1: (lv_rhs_7_0= ruleValueTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:678:3: lv_rhs_7_0= ruleValueTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getRhsValueTupleDescriptorParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1322);
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

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleResourceConstraint1346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getResourceConstraintAccess().getDescriptorsKeyword_9());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:702:1: ( (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:703:1: (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:703:1: (lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:704:3: lv_tupleDescriptors_10_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1367);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:720:2: (otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:720:4: otherlv_11= ',' ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleResourceConstraint1380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getResourceConstraintAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:724:1: ( (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:725:1: (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:725:1: (lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:726:3: lv_tupleDescriptors_12_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResourceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1401);
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

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleResourceConstraint1415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getResourceConstraintAccess().getSemicolonKeyword_12());
                  
            }
            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleResourceConstraint1427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getResourceConstraintAccess().getRightCurlyBracketKeyword_13());
                  
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:758:1: entryRuleRequiredHardwareResourceInstanceConstraint returns [EObject current=null] : iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF ;
    public final EObject entryRuleRequiredHardwareResourceInstanceConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredHardwareResourceInstanceConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:759:2: (iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:760:2: iv_ruleRequiredHardwareResourceInstanceConstraint= ruleRequiredHardwareResourceInstanceConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_entryRuleRequiredHardwareResourceInstanceConstraint1463);
            iv_ruleRequiredHardwareResourceInstanceConstraint=ruleRequiredHardwareResourceInstanceConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredHardwareResourceInstanceConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredHardwareResourceInstanceConstraint1473); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:767:1: ruleRequiredHardwareResourceInstanceConstraint returns [EObject current=null] : (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= '}' ) ;
    public final EObject ruleRequiredHardwareResourceInstanceConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_tupleDescriptors_4_0 = null;

        EObject lv_tupleDescriptors_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:770:28: ( (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:771:1: (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:771:1: (otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:771:3: otherlv_0= 'requiredHardwareResourceInstance' ( (lv_name_1_0= ruleID ) )? otherlv_2= '{' otherlv_3= 'descriptors' ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) ) (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )* otherlv_7= ';' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRequiredHardwareResourceInstanceConstraint1510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRequiredHardwareResourceInstanceKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:775:1: ( (lv_name_1_0= ruleID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_SIMPLE_ID && LA9_0<=RULE_ESCAPED_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:776:1: (lv_name_1_0= ruleID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:776:1: (lv_name_1_0= ruleID )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:777:3: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getNameIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleRequiredHardwareResourceInstanceConstraint1531);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRequiredHardwareResourceInstanceConstraint1544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRequiredHardwareResourceInstanceConstraint1556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getDescriptorsKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:801:1: ( (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:802:1: (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:802:1: (lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:803:3: lv_tupleDescriptors_4_0= ruleComponentResourceTupleDescriptor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1577);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:819:2: (otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:819:4: otherlv_5= ',' ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRequiredHardwareResourceInstanceConstraint1590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:823:1: ( (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:824:1: (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:824:1: (lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:825:3: lv_tupleDescriptors_6_0= ruleComponentResourceTupleDescriptor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getTupleDescriptorsComponentResourceTupleDescriptorParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1611);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getSemicolonKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRequiredHardwareResourceInstanceConstraint1637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRequiredHardwareResourceInstanceConstraintAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:857:1: entryRuleLocationTupleDescriptor returns [EObject current=null] : iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF ;
    public final EObject entryRuleLocationTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:858:2: (iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:859:2: iv_ruleLocationTupleDescriptor= ruleLocationTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocationTupleDescriptor_in_entryRuleLocationTupleDescriptor1673);
            iv_ruleLocationTupleDescriptor=ruleLocationTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationTupleDescriptor1683); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:866:1: ruleLocationTupleDescriptor returns [EObject current=null] : (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_instances_3_0= ruleID ) ) otherlv_4= ')' ) ;
    public final EObject ruleLocationTupleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_instance_1_0 = null;

        AntlrDatatypeRuleToken lv_instances_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:869:28: ( (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_instances_3_0= ruleID ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:870:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_instances_3_0= ruleID ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:870:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_instances_3_0= ruleID ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:870:3: otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_instances_3_0= ruleID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocationTupleDescriptor1720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationTupleDescriptorAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:874:1: ( (lv_instance_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:875:1: (lv_instance_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:875:1: (lv_instance_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:876:3: lv_instance_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationTupleDescriptorAccess().getInstanceIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationTupleDescriptor1741);
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

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocationTupleDescriptor1753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocationTupleDescriptorAccess().getCommaKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:896:1: ( (lv_instances_3_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:897:1: (lv_instances_3_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:897:1: (lv_instances_3_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:898:3: lv_instances_3_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationTupleDescriptorAccess().getInstancesIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleLocationTupleDescriptor1774);
            lv_instances_3_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationTupleDescriptorRule());
              	        }
                     		set(
                     			current, 
                     			"instances",
                      		lv_instances_3_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLocationTupleDescriptor1786); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:926:1: entryRuleValueTupleDescriptor returns [EObject current=null] : iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF ;
    public final EObject entryRuleValueTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:927:2: (iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:928:2: iv_ruleValueTupleDescriptor= ruleValueTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTupleDescriptor_in_entryRuleValueTupleDescriptor1822);
            iv_ruleValueTupleDescriptor=ruleValueTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueTupleDescriptor1832); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:935:1: ruleValueTupleDescriptor returns [EObject current=null] : ( (lv_value_0_0= ruleID ) ) ;
    public final EObject ruleValueTupleDescriptor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:938:28: ( ( (lv_value_0_0= ruleID ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:939:1: ( (lv_value_0_0= ruleID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:939:1: ( (lv_value_0_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:940:1: (lv_value_0_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:940:1: (lv_value_0_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:941:3: lv_value_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueTupleDescriptorAccess().getValueIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleValueTupleDescriptor1877);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:965:1: entryRuleComponentResourceTupleDescriptor returns [EObject current=null] : iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF ;
    public final EObject entryRuleComponentResourceTupleDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentResourceTupleDescriptor = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:966:2: (iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:967:2: iv_ruleComponentResourceTupleDescriptor= ruleComponentResourceTupleDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComponentResourceTupleDescriptor_in_entryRuleComponentResourceTupleDescriptor1912);
            iv_ruleComponentResourceTupleDescriptor=ruleComponentResourceTupleDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentResourceTupleDescriptor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentResourceTupleDescriptor1922); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:974:1: ruleComponentResourceTupleDescriptor returns [EObject current=null] : (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' ) ;
    public final EObject ruleComponentResourceTupleDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_instance_1_0 = null;

        AntlrDatatypeRuleToken lv_hwresinstance_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:977:28: ( (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:978:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:978:1: (otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:978:3: otherlv_0= '(' ( (lv_instance_1_0= ruleID ) ) otherlv_2= ',' ( (lv_hwresinstance_3_0= ruleID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentResourceTupleDescriptor1959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentResourceTupleDescriptorAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:982:1: ( (lv_instance_1_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:983:1: (lv_instance_1_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:983:1: (lv_instance_1_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:984:3: lv_instance_1_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorAccess().getInstanceIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor1980);
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

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComponentResourceTupleDescriptor1992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentResourceTupleDescriptorAccess().getCommaKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1004:1: ( (lv_hwresinstance_3_0= ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1005:1: (lv_hwresinstance_3_0= ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1005:1: (lv_hwresinstance_3_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1006:3: lv_hwresinstance_3_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentResourceTupleDescriptorAccess().getHwresinstanceIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2013);
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

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentResourceTupleDescriptor2025); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1034:1: entryRuleMeasureFunction returns [EObject current=null] : iv_ruleMeasureFunction= ruleMeasureFunction EOF ;
    public final EObject entryRuleMeasureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureFunction = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1035:2: (iv_ruleMeasureFunction= ruleMeasureFunction EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1036:2: iv_ruleMeasureFunction= ruleMeasureFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasureFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMeasureFunction_in_entryRuleMeasureFunction2061);
            iv_ruleMeasureFunction=ruleMeasureFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasureFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeasureFunction2071); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1043:1: ruleMeasureFunction returns [EObject current=null] : (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMeasureFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1046:28: ( (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1047:1: (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1047:1: (otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1047:3: otherlv_0= 'measure' ( ( ruleID ) ) (otherlv_2= '+' ( ( ruleID ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMeasureFunction2108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMeasureFunctionAccess().getMeasureKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1051:1: ( ( ruleID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1052:1: ( ruleID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1052:1: ( ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1053:3: ruleID
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
               
              	        newCompositeNode(grammarAccess.getMeasureFunctionAccess().getServicesServiceCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleMeasureFunction2135);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1069:2: (otherlv_2= '+' ( ( ruleID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1069:4: otherlv_2= '+' ( ( ruleID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMeasureFunction2148); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMeasureFunctionAccess().getPlusSignKeyword_2_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1073:1: ( ( ruleID ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1074:1: ( ruleID )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1074:1: ( ruleID )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1075:3: ruleID
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
            	       
            	      	        newCompositeNode(grammarAccess.getMeasureFunctionAccess().getServicesServiceCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleMeasureFunction2175);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMeasureFunction2189); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1103:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1104:2: (iv_ruleModel= ruleModel EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1105:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel2225);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel2235); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1112:1: ruleModel returns [EObject current=null] : ( (lv_ownedExpression_0_0= ruleExpCS ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1115:28: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1116:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1116:1: ( (lv_ownedExpression_0_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1117:1: (lv_ownedExpression_0_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1117:1: (lv_ownedExpression_0_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1118:3: lv_ownedExpression_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getOwnedExpressionExpCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleModel2280);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1142:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1143:2: (iv_ruleID= ruleID EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1144:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID2316);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID2327); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1151:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1154:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1155:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1155:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1155:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID2367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1163:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID2393); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1178:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1179:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1180:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER2439);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER2450); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1187:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1190:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1191:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER2489); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1206:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1207:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1208:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER2534);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER2545); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1215:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1218:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1219:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1219:1: (this_INT_0= RULE_INT | kw= '*' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1219:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER2585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1228:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUPPER2609); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1241:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1242:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1243:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL2650);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL2661); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1250:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1253:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1254:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL2700); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1269:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1270:2: (iv_ruleURI= ruleURI EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1271:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI2745);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI2756); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1278:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1281:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1282:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI2795); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1299:1: entryRuleEssentialOCLUnaryOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLUnaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1300:2: (iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1301:2: iv_ruleEssentialOCLUnaryOperatorCS= ruleEssentialOCLUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_entryRuleEssentialOCLUnaryOperatorCS2841);
            iv_ruleEssentialOCLUnaryOperatorCS=ruleEssentialOCLUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorCS2851); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1308:1: ruleEssentialOCLUnaryOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) ) ;
    public final EObject ruleEssentialOCLUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1311:28: ( ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1312:1: ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1312:1: ( ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1313:1: ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1313:1: ( (lv_name_0_1= '-' | lv_name_0_2= 'not' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1314:1: (lv_name_0_1= '-' | lv_name_0_2= 'not' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1314:1: (lv_name_0_1= '-' | lv_name_0_2= 'not' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1315:3: lv_name_0_1= '-'
                    {
                    lv_name_0_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLUnaryOperatorCS2895); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1327:8: lv_name_0_2= 'not'
                    {
                    lv_name_0_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLUnaryOperatorCS2924); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1350:1: entryRuleEssentialOCLInfixOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLInfixOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1351:2: (iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1352:2: iv_ruleEssentialOCLInfixOperatorCS= ruleEssentialOCLInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorCS_in_entryRuleEssentialOCLInfixOperatorCS2975);
            iv_ruleEssentialOCLInfixOperatorCS=ruleEssentialOCLInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorCS2985); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1359:1: ruleEssentialOCLInfixOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1362:28: ( ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1363:1: ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1363:1: ( ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1364:1: ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1364:1: ( (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1365:1: (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1365:1: (lv_name_0_1= '*' | lv_name_0_2= '/' | lv_name_0_3= '+' | lv_name_0_4= '-' | lv_name_0_5= '>' | lv_name_0_6= '<' | lv_name_0_7= '>=' | lv_name_0_8= '<=' | lv_name_0_9= '=' | lv_name_0_10= '<>' | lv_name_0_11= 'and' | lv_name_0_12= 'or' | lv_name_0_13= 'xor' | lv_name_0_14= 'implies' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1366:3: lv_name_0_1= '*'
                    {
                    lv_name_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorCS3029); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1378:8: lv_name_0_2= '/'
                    {
                    lv_name_0_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorCS3058); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1390:8: lv_name_0_3= '+'
                    {
                    lv_name_0_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEssentialOCLInfixOperatorCS3087); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1402:8: lv_name_0_4= '-'
                    {
                    lv_name_0_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLInfixOperatorCS3116); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1414:8: lv_name_0_5= '>'
                    {
                    lv_name_0_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorCS3145); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1426:8: lv_name_0_6= '<'
                    {
                    lv_name_0_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorCS3174); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1438:8: lv_name_0_7= '>='
                    {
                    lv_name_0_7=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorCS3203); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1450:8: lv_name_0_8= '<='
                    {
                    lv_name_0_8=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorCS3232); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1462:8: lv_name_0_9= '='
                    {
                    lv_name_0_9=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorCS3261); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1474:8: lv_name_0_10= '<>'
                    {
                    lv_name_0_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorCS3290); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1486:8: lv_name_0_11= 'and'
                    {
                    lv_name_0_11=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorCS3319); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1498:8: lv_name_0_12= 'or'
                    {
                    lv_name_0_12=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorCS3348); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1510:8: lv_name_0_13= 'xor'
                    {
                    lv_name_0_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorCS3377); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1522:8: lv_name_0_14= 'implies'
                    {
                    lv_name_0_14=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLInfixOperatorCS3406); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1545:1: entryRuleEssentialOCLNavigationOperatorCS returns [EObject current=null] : iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF ;
    public final EObject entryRuleEssentialOCLNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEssentialOCLNavigationOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1546:2: (iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1547:2: iv_ruleEssentialOCLNavigationOperatorCS= ruleEssentialOCLNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_entryRuleEssentialOCLNavigationOperatorCS3457);
            iv_ruleEssentialOCLNavigationOperatorCS=ruleEssentialOCLNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorCS3467); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1554:1: ruleEssentialOCLNavigationOperatorCS returns [EObject current=null] : ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) ) ;
    public final EObject ruleEssentialOCLNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1557:28: ( ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1558:1: ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1558:1: ( ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1559:1: ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1559:1: ( (lv_name_0_1= '.' | lv_name_0_2= '->' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1560:1: (lv_name_0_1= '.' | lv_name_0_2= '->' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1560:1: (lv_name_0_1= '.' | lv_name_0_2= '->' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1561:3: lv_name_0_1= '.'
                    {
                    lv_name_0_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorCS3511); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1573:8: lv_name_0_2= '->'
                    {
                    lv_name_0_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorCS3540); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1596:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1597:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1598:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier3592);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier3603); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1605:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1608:28: (this_ID_0= ruleID )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1610:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier3649);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1628:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1629:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1630:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3694);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral3705); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1637:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1640:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1641:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral3744); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1656:1: entryRuleBinaryOperatorCS returns [EObject current=null] : iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF ;
    public final EObject entryRuleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1657:2: (iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1658:2: iv_ruleBinaryOperatorCS= ruleBinaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS3788);
            iv_ruleBinaryOperatorCS=ruleBinaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorCS3798); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1665:1: ruleBinaryOperatorCS returns [EObject current=null] : (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) ;
    public final EObject ruleBinaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_InfixOperatorCS_0 = null;

        EObject this_NavigationOperatorCS_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1668:28: ( (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1669:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1669:1: (this_InfixOperatorCS_0= ruleInfixOperatorCS | this_NavigationOperatorCS_1= ruleNavigationOperatorCS )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1670:2: this_InfixOperatorCS_0= ruleInfixOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getInfixOperatorCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS3848);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1683:2: this_NavigationOperatorCS_1= ruleNavigationOperatorCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorCSAccess().getNavigationOperatorCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS3878);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1702:1: entryRuleInfixOperatorCS returns [EObject current=null] : iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF ;
    public final EObject entryRuleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1703:2: (iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1704:2: iv_ruleInfixOperatorCS= ruleInfixOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS3913);
            iv_ruleInfixOperatorCS=ruleInfixOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorCS3923); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1711:1: ruleInfixOperatorCS returns [EObject current=null] : this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS ;
    public final EObject ruleInfixOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLInfixOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1714:28: (this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1716:2: this_EssentialOCLInfixOperatorCS_0= ruleEssentialOCLInfixOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorCSAccess().getEssentialOCLInfixOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorCS_in_ruleInfixOperatorCS3972);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1735:1: entryRuleNavigationOperatorCS returns [EObject current=null] : iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF ;
    public final EObject entryRuleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1736:2: (iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1737:2: iv_ruleNavigationOperatorCS= ruleNavigationOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS4006);
            iv_ruleNavigationOperatorCS=ruleNavigationOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorCS4016); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1744:1: ruleNavigationOperatorCS returns [EObject current=null] : this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS ;
    public final EObject ruleNavigationOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLNavigationOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1747:28: (this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1749:2: this_EssentialOCLNavigationOperatorCS_0= ruleEssentialOCLNavigationOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorCSAccess().getEssentialOCLNavigationOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_ruleNavigationOperatorCS4065);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1768:1: entryRuleUnaryOperatorCS returns [EObject current=null] : iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF ;
    public final EObject entryRuleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperatorCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1769:2: (iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1770:2: iv_ruleUnaryOperatorCS= ruleUnaryOperatorCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS4099);
            iv_ruleUnaryOperatorCS=ruleUnaryOperatorCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorCS4109); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1777:1: ruleUnaryOperatorCS returns [EObject current=null] : this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS ;
    public final EObject ruleUnaryOperatorCS() throws RecognitionException {
        EObject current = null;

        EObject this_EssentialOCLUnaryOperatorCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1780:28: (this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1782:2: this_EssentialOCLUnaryOperatorCS_0= ruleEssentialOCLUnaryOperatorCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorCSAccess().getEssentialOCLUnaryOperatorCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_ruleUnaryOperatorCS4158);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1801:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1802:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1803:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName4193);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName4204); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1810:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1813:28: (this_Identifier_0= ruleIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1815:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName4250);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1833:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1834:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1835:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName4295);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName4306); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1842:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1845:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1847:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName4352);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1865:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1866:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1867:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName4397);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName4408); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1874:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1877:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1878:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1878:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Tuple' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1879:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName4455);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1891:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName4488);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1903:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName4521);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1915:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLUnreservedName4545); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1928:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1929:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1930:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName4586);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName4597); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1937:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1940:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1942:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName4643);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1960:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1961:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1962:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS4687);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS4697); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1969:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1972:28: ( ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1973:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1973:1: ( ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1973:2: ( (lv_path_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1973:2: ( (lv_path_0_0= ruleFirstPathElementCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1974:1: (lv_path_0_0= ruleFirstPathElementCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1974:1: (lv_path_0_0= ruleFirstPathElementCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1975:3: lv_path_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS4743);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1991:2: (otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1991:4: otherlv_1= '::' ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePathNameCS4756); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1995:1: ( (lv_path_2_0= ruleNextPathElementCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1996:1: (lv_path_2_0= ruleNextPathElementCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1996:1: (lv_path_2_0= ruleNextPathElementCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:1997:3: lv_path_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getPathNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS4777);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2021:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2022:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2023:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS4815);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS4825); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2030:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2033:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2034:1: ( ( ruleUnrestrictedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2034:1: ( ( ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2035:1: ( ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2035:1: ( ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2036:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS4876);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2060:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2061:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2062:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS4911);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS4921); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2069:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2072:28: ( ( ( ruleUnreservedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2073:1: ( ( ruleUnreservedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2073:1: ( ( ruleUnreservedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2074:1: ( ruleUnreservedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2074:1: ( ruleUnreservedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2075:3: ruleUnreservedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS4972);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2101:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2102:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2103:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS5009);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS5019); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2110:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2113:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2114:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2114:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2114:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2114:2: ( ( ruleUnrestrictedName ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2115:1: ( ruleUnrestrictedName )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2115:1: ( ruleUnrestrictedName )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2116:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS5071);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2133:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2133:6: ( () ( ( ruleURI ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2133:7: () ( ( ruleURI ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2133:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2134:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2142:2: ( ( ruleURI ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2143:1: ( ruleURI )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2143:1: ( ruleURI )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2144:3: ruleURI
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
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS5117);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2168:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2169:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2170:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier5155);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier5166); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2177:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2180:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2181:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2181:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2182:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePrimitiveTypeIdentifier5204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2189:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePrimitiveTypeIdentifier5223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2196:2: kw= 'Real'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier5242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2203:2: kw= 'String'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier5261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2210:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier5280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2217:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier5299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2224:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier5318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2231:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier5337); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2244:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2245:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2246:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS5377);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS5387); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2253:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2256:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2257:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2257:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2258:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2258:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2259:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS5432);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2283:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2284:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2285:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier5468);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier5479); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2292:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2295:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2296:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2296:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2297:2: kw= 'Set'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCollectionTypeIdentifier5517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2304:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCollectionTypeIdentifier5536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2311:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier5555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2318:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier5574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2325:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier5593); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2338:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2339:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2340:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS5633);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS5643); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2347:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2350:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2351:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2351:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2351:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2351:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2352:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2352:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2353:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS5689);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2369:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2369:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionTypeCS5702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2373:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2374:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2374:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2375:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS5723);
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

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionTypeCS5735); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2403:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2404:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2405:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS5773);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS5783); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2412:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2415:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2416:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2416:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2416:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2416:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2417:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2417:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2418:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS5829);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2434:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2434:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMultiplicityBoundsCS5842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2438:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2439:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2439:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2440:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS5863);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2464:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2465:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2466:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS5901);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS5911); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2473:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2476:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2477:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2477:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2477:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMultiplicityCS5948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2481:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2482:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS5974);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2495:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS6004);
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

            otherlv_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMultiplicityCS6016); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2518:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2519:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2520:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS6052);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS6062); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2527:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2530:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2531:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2531:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2532:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2532:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2533:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2533:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2534:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiplicityStringCS6106); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2546:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiplicityStringCS6135); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2558:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMultiplicityStringCS6164); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2581:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2582:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2583:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS6215);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS6225); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2590:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2593:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2594:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2594:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2594:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2594:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2595:1: (lv_name_0_0= 'Tuple' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2595:1: (lv_name_0_0= 'Tuple' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2596:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleTypeCS6268); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2609:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2609:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleTypeCS6294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2613:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_SIMPLE_ID && LA28_0<=RULE_ESCAPED_ID)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2613:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2613:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2614:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2614:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2615:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6316);
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2631:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==23) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2631:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleTypeCS6329); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2635:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2636:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2636:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2637:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6350);
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

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleTypeCS6366); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2665:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2666:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2667:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS6404);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS6414); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2674:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2677:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2678:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2678:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2678:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2678:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2679:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2679:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2680:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS6460);
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

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTuplePartCS6472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2700:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2701:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2701:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2702:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS6493);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2726:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2727:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2728:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS6529);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS6539); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2735:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2738:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2739:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2739:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2739:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2739:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2740:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2740:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2741:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS6585);
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

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCollectionLiteralExpCS6597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2761:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SIMPLE_ID && LA31_0<=RULE_SINGLE_QUOTED_STRING)||LA31_0==30||(LA31_0>=34 && LA31_0<=36)||LA31_0==50||(LA31_0>=52 && LA31_0<=64)||(LA31_0>=70 && LA31_0<=73)||LA31_0==77||LA31_0==81||LA31_0==83) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2761:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2761:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2762:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2762:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2763:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6619);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2779:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2779:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCollectionLiteralExpCS6632); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2783:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2784:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2784:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2785:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6653);
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

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCollectionLiteralExpCS6669); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2813:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2814:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2815:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS6705);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS6715); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2822:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressionCS_0_0 = null;

        EObject lv_lastExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2825:28: ( ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2826:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2826:1: ( ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2826:2: ( (lv_expressionCS_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2826:2: ( (lv_expressionCS_0_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2827:1: (lv_expressionCS_0_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2827:1: (lv_expressionCS_0_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2828:3: lv_expressionCS_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6761);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2844:2: (otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==65) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2844:4: otherlv_1= '..' ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    {
                    otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionLiteralPartCS6774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2848:1: ( (lv_lastExpressionCS_2_0= ruleExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2849:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2849:1: (lv_lastExpressionCS_2_0= ruleExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2850:3: lv_lastExpressionCS_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6795);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2874:1: entryRuleConstructorPartCS returns [EObject current=null] : iv_ruleConstructorPartCS= ruleConstructorPartCS EOF ;
    public final EObject entryRuleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2875:2: (iv_ruleConstructorPartCS= ruleConstructorPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2876:2: iv_ruleConstructorPartCS= ruleConstructorPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS6833);
            iv_ruleConstructorPartCS=ruleConstructorPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstructorPartCS6843); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2883:1: ruleConstructorPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleConstructorPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_initExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2886:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2887:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2887:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2887:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( (lv_initExpression_2_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2887:2: ( ( ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2888:1: ( ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2888:1: ( ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2889:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS6895);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConstructorPartCS6907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConstructorPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2909:1: ( (lv_initExpression_2_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2910:1: (lv_initExpression_2_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2910:1: (lv_initExpression_2_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2911:3: lv_initExpression_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorPartCSAccess().getInitExpressionExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleConstructorPartCS6928);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2935:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2936:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2937:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS6964);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS6974); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2944:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2947:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2948:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2948:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2949:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7024);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2962:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7054);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2975:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7084);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:2988:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7114);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3001:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7144);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3014:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7174);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3033:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3034:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3035:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7209);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7219); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3042:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3045:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3046:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3046:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3046:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTupleLiteralExpCS7256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTupleLiteralExpCS7268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3054:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3055:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3055:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3056:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7289);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3072:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==23) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3072:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTupleLiteralExpCS7302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3076:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3077:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3077:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3078:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7323);
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

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleLiteralExpCS7337); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3106:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3107:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3108:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS7373);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS7383); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3115:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3118:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3119:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3119:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3119:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3119:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3120:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3120:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3121:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS7429);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3137:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3137:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTupleLiteralPartCS7442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3141:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3142:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3142:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3143:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS7463);
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

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTupleLiteralPartCS7477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3163:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3164:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3164:1: (lv_initExpression_4_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3165:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS7498);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3189:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3190:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3191:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS7534);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS7544); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3198:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3201:28: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3202:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3202:1: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3203:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3203:1: (lv_name_0_0= ruleNUMBER_LITERAL )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3204:3: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getNameNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS7589);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3228:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3229:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3230:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS7624);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS7634); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3237:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_name_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3240:28: ( ( (lv_name_0_0= ruleStringLiteral ) )+ )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3241:1: ( (lv_name_0_0= ruleStringLiteral ) )+
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3241:1: ( (lv_name_0_0= ruleStringLiteral ) )+
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
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3242:1: (lv_name_0_0= ruleStringLiteral )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3242:1: (lv_name_0_0= ruleStringLiteral )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3243:3: lv_name_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getNameStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS7679);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3267:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3268:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3269:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS7715);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS7725); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3276:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3279:28: ( ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3280:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3280:1: ( ( (lv_name_0_0= 'true' ) ) | ( (lv_name_1_0= 'false' ) ) )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3280:2: ( (lv_name_0_0= 'true' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3280:2: ( (lv_name_0_0= 'true' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3281:1: (lv_name_0_0= 'true' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3281:1: (lv_name_0_0= 'true' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3282:3: lv_name_0_0= 'true'
                    {
                    lv_name_0_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleBooleanLiteralExpCS7768); if (state.failed) return current;
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3296:6: ( (lv_name_1_0= 'false' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3296:6: ( (lv_name_1_0= 'false' ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3297:1: (lv_name_1_0= 'false' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3297:1: (lv_name_1_0= 'false' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3298:3: lv_name_1_0= 'false'
                    {
                    lv_name_1_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleBooleanLiteralExpCS7805); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3319:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3320:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3321:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7854);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7864); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3328:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3331:28: ( ( () otherlv_1= '*' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3332:1: ( () otherlv_1= '*' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3332:1: ( () otherlv_1= '*' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3332:2: () otherlv_1= '*'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3332:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3333:2: 
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

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS7913); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3353:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3354:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3355:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS7949);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS7959); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3362:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3365:28: ( ( () otherlv_1= 'invalid' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3366:1: ( () otherlv_1= 'invalid' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3366:1: ( () otherlv_1= 'invalid' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3366:2: () otherlv_1= 'invalid'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3366:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3367:2: 
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

            otherlv_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleInvalidLiteralExpCS8008); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3387:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3388:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3389:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8044);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS8054); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3396:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3399:28: ( ( () otherlv_1= 'null' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3400:1: ( () otherlv_1= 'null' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3400:1: ( () otherlv_1= 'null' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3400:2: () otherlv_1= 'null'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3400:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3401:2: 
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

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleNullLiteralExpCS8103); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3421:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3422:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3423:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8139);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS8149); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3430:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_TupleTypeCS_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3433:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3434:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3434:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_TupleTypeCS_2= ruleTupleTypeCS )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3435:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8199);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3448:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8229);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3461:2: this_TupleTypeCS_2= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8259);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3480:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3481:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3482:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS8294);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS8304); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3489:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_multiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3492:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3493:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3493:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3494:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS8354);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3505:1: ( (lv_multiplicity_1_0= ruleMultiplicityCS ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3506:1: (lv_multiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3506:1: (lv_multiplicity_1_0= ruleMultiplicityCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3507:3: lv_multiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS8374);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3531:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3532:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3533:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8411);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8421); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3540:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3543:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3544:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3544:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3545:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3545:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3546:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS8466);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3570:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3571:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3572:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS8501);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS8511); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3579:1: ruleTypeNameExpCS returns [EObject current=null] : ( (lv_pathName_0_0= rulePathNameCS ) ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_pathName_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3582:28: ( ( (lv_pathName_0_0= rulePathNameCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3583:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3583:1: ( (lv_pathName_0_0= rulePathNameCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3584:1: (lv_pathName_0_0= rulePathNameCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3584:1: (lv_pathName_0_0= rulePathNameCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3585:3: lv_pathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getPathNamePathNameCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS8556);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3609:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3610:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3611:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS8591);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS8601); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3618:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject lv_multiplicity_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3621:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3622:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3622:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3622:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS ) ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3622:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3623:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS8652);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3636:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8682);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3647:2: ( (lv_multiplicity_2_0= ruleMultiplicityCS ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==66) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3648:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3648:1: (lv_multiplicity_2_0= ruleMultiplicityCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3649:3: lv_multiplicity_2_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8703);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3673:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3674:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3675:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS8740);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS8750); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3682:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3685:28: ( ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3686:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3686:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3686:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3686:2: (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3687:2: this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8801);
                    this_PrefixedExpCS_0=rulePrefixedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3698:1: ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=33 && LA45_0<=35)||(LA45_0>=37 && LA45_0<=49)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3698:2: () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3698:2: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3699:2: 
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3707:2: ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3708:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3708:1: (lv_ownedOperator_2_0= ruleBinaryOperatorCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3709:3: lv_ownedOperator_2_0= ruleBinaryOperatorCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8834);
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3725:2: ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) )
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
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3725:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3725:3: ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3725:4: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )?
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3725:4: ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3726:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3726:1: (lv_ownedExpression_3_0= rulePrefixedExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3727:3: lv_ownedExpression_3_0= rulePrefixedExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_2_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8857);
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

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3743:2: ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )*
                                    loop42:
                                    do {
                                        int alt42=2;
                                        alt42 = dfa42.predict(input);
                                        switch (alt42) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3743:3: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3743:3: ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3744:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3744:1: (lv_ownedOperator_4_0= ruleBinaryOperatorCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3745:3: lv_ownedOperator_4_0= ruleBinaryOperatorCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_2_0_1_0_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8879);
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

                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3761:2: ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3762:1: (lv_ownedExpression_5_0= rulePrefixedExpCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3762:1: (lv_ownedExpression_5_0= rulePrefixedExpCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3763:3: lv_ownedExpression_5_0= rulePrefixedExpCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionPrefixedExpCSParserRuleCall_0_1_2_0_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_ruleExpCS8900);
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

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3779:4: ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )?
                                    int alt43=2;
                                    int LA43_0 = input.LA(1);

                                    if ( ((LA43_0>=33 && LA43_0<=35)||(LA43_0>=37 && LA43_0<=49)) ) {
                                        alt43=1;
                                    }
                                    switch (alt43) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3779:5: ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3779:5: ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3780:1: (lv_ownedOperator_6_0= ruleBinaryOperatorCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3780:1: (lv_ownedOperator_6_0= ruleBinaryOperatorCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3781:3: lv_ownedOperator_6_0= ruleBinaryOperatorCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorBinaryOperatorCSParserRuleCall_0_1_2_0_2_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8924);
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

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3797:2: ( (lv_ownedExpression_7_0= ruleLetExpCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3798:1: (lv_ownedExpression_7_0= ruleLetExpCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3798:1: (lv_ownedExpression_7_0= ruleLetExpCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3799:3: lv_ownedExpression_7_0= ruleLetExpCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_0_1_2_0_2_1_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS8945);
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
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3816:6: ( (lv_ownedExpression_8_0= ruleLetExpCS ) )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3816:6: ( (lv_ownedExpression_8_0= ruleLetExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3817:1: (lv_ownedExpression_8_0= ruleLetExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3817:1: (lv_ownedExpression_8_0= ruleLetExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3818:3: lv_ownedExpression_8_0= ruleLetExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_0_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS8975);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3835:6: ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3835:6: ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3835:7: () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3835:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3836:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3844:2: ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+
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
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3845:1: (lv_ownedOperator_10_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3845:1: (lv_ownedOperator_10_0= ruleUnaryOperatorCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3846:3: lv_ownedOperator_10_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS9019);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3862:3: ( (lv_ownedExpression_11_0= ruleLetExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3863:1: (lv_ownedExpression_11_0= ruleLetExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3863:1: (lv_ownedExpression_11_0= ruleLetExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3864:3: lv_ownedExpression_11_0= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedExpressionLetExpCSParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9041);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3882:2: this_LetExpCS_12= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getLetExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_ruleExpCS9073);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3901:1: entryRulePrefixedExpCS returns [EObject current=null] : iv_rulePrefixedExpCS= rulePrefixedExpCS EOF ;
    public final EObject entryRulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3902:2: (iv_rulePrefixedExpCS= rulePrefixedExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3903:2: iv_rulePrefixedExpCS= rulePrefixedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9108);
            iv_rulePrefixedExpCS=rulePrefixedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedExpCS9118); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3910:1: rulePrefixedExpCS returns [EObject current=null] : ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedOperator_1_0 = null;

        EObject lv_ownedExpression_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3913:28: ( ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3914:1: ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3914:1: ( ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3914:2: ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3914:2: ( () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3914:3: () ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3914:3: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3915:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3923:2: ( (lv_ownedOperator_1_0= ruleUnaryOperatorCS ) )+
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
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3924:1: (lv_ownedOperator_1_0= ruleUnaryOperatorCS )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3924:1: (lv_ownedOperator_1_0= ruleUnaryOperatorCS )
                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3925:3: lv_ownedOperator_1_0= ruleUnaryOperatorCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorUnaryOperatorCSParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS9177);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3941:3: ( (lv_ownedExpression_2_0= rulePrimaryExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3942:1: (lv_ownedExpression_2_0= rulePrimaryExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3942:1: (lv_ownedExpression_2_0= rulePrimaryExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3943:3: lv_ownedExpression_2_0= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9199);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3961:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9231);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3980:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3981:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3982:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS9266);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS9276); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3989:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3992:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3993:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3993:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )
            int alt65=8;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:3994:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS9326);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4007:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS9356);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4020:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS9386);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4033:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS9416);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4046:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS9446);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4059:2: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS9476);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4072:2: this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS9506);
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
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4084:6: ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4084:6: ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4084:7: () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4084:7: ()
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4085:2: 
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4093:2: ( (lv_pathName_8_0= rulePathNameCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4094:1: (lv_pathName_8_0= rulePathNameCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4094:1: (lv_pathName_8_0= rulePathNameCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4095:3: lv_pathName_8_0= rulePathNameCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPathNamePathNameCSParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_rulePrimaryExpCS9545);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4111:2: ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) )
                    int alt64=3;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt64=1;
                        }
                        break;
                    case 16:
                        {
                        alt64=2;
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
                        alt64=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4111:3: ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4111:3: ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4111:4: () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )?
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4111:4: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4112:2: 
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

                            otherlv_10=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS9571); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_7_2_0_1());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4124:1: ( (lv_firstIndexes_11_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4125:1: (lv_firstIndexes_11_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4125:1: (lv_firstIndexes_11_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4126:3: lv_firstIndexes_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_7_2_0_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9592);
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

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4142:2: (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==23) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4142:4: otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) )
                            	    {
                            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9605); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_0_3_0());
                            	          
                            	    }
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4146:1: ( (lv_firstIndexes_13_0= ruleExpCS ) )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4147:1: (lv_firstIndexes_13_0= ruleExpCS )
                            	    {
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4147:1: (lv_firstIndexes_13_0= ruleExpCS )
                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4148:3: lv_firstIndexes_13_0= ruleExpCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesExpCSParserRuleCall_7_2_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9626);
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

                            otherlv_14=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePrimaryExpCS9640); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_7_2_0_4());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4168:1: (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==66) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4168:3: otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']'
                                    {
                                    otherlv_15=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulePrimaryExpCS9653); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpCSAccess().getLeftSquareBracketKeyword_7_2_0_5_0());
                                          
                                    }
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4172:1: ( (lv_secondIndexes_16_0= ruleExpCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4173:1: (lv_secondIndexes_16_0= ruleExpCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4173:1: (lv_secondIndexes_16_0= ruleExpCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4174:3: lv_secondIndexes_16_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_7_2_0_5_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9674);
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

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4190:2: (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )*
                                    loop51:
                                    do {
                                        int alt51=2;
                                        int LA51_0 = input.LA(1);

                                        if ( (LA51_0==23) ) {
                                            alt51=1;
                                        }


                                        switch (alt51) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4190:4: otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) )
                                    	    {
                                    	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9687); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_0_5_2_0());
                                    	          
                                    	    }
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4194:1: ( (lv_secondIndexes_18_0= ruleExpCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4195:1: (lv_secondIndexes_18_0= ruleExpCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4195:1: (lv_secondIndexes_18_0= ruleExpCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4196:3: lv_secondIndexes_18_0= ruleExpCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesExpCSParserRuleCall_7_2_0_5_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_rulePrimaryExpCS9708);
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

                                    otherlv_19=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePrimaryExpCS9722); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpCSAccess().getRightSquareBracketKeyword_7_2_0_5_3());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4216:3: ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==74) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4216:4: ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4216:4: ( (lv_atPre_20_0= '@' ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4217:1: (lv_atPre_20_0= '@' )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4217:1: (lv_atPre_20_0= '@' )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4218:3: lv_atPre_20_0= '@'
                                    {
                                    lv_atPre_20_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePrimaryExpCS9743); if (state.failed) return current;
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

                                    otherlv_21=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePrimaryExpCS9768); if (state.failed) return current;
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
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4236:6: ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4236:6: ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4236:7: () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}'
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4236:7: ()
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4237:2: 
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

                            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpCS9802); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpCSAccess().getLeftCurlyBracketKeyword_7_2_1_1());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4249:1: ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) )
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( ((LA55_0>=RULE_SIMPLE_ID && LA55_0<=RULE_ESCAPED_ID)) ) {
                                alt55=1;
                            }
                            else if ( (LA55_0==RULE_SINGLE_QUOTED_STRING) ) {
                                alt55=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 55, 0, input);

                                throw nvae;
                            }
                            switch (alt55) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4249:2: ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4249:2: ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4249:3: ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )*
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4249:3: ( (lv_ownedParts_24_0= ruleConstructorPartCS ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4250:1: (lv_ownedParts_24_0= ruleConstructorPartCS )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4250:1: (lv_ownedParts_24_0= ruleConstructorPartCS )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4251:3: lv_ownedParts_24_0= ruleConstructorPartCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_7_2_1_2_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9825);
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

                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4267:2: (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )*
                                    loop54:
                                    do {
                                        int alt54=2;
                                        int LA54_0 = input.LA(1);

                                        if ( (LA54_0==23) ) {
                                            alt54=1;
                                        }


                                        switch (alt54) {
                                    	case 1 :
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4267:4: otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) )
                                    	    {
                                    	    otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimaryExpCS9838); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpCSAccess().getCommaKeyword_7_2_1_2_0_1_0());
                                    	          
                                    	    }
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4271:1: ( (lv_ownedParts_26_0= ruleConstructorPartCS ) )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4272:1: (lv_ownedParts_26_0= ruleConstructorPartCS )
                                    	    {
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4272:1: (lv_ownedParts_26_0= ruleConstructorPartCS )
                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4273:3: lv_ownedParts_26_0= ruleConstructorPartCS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsConstructorPartCSParserRuleCall_7_2_1_2_0_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9859);
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


                                    }
                                    break;
                                case 2 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4290:6: ( (lv_value_27_0= ruleStringLiteral ) )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4290:6: ( (lv_value_27_0= ruleStringLiteral ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4291:1: (lv_value_27_0= ruleStringLiteral )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4291:1: (lv_value_27_0= ruleStringLiteral )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4292:3: lv_value_27_0= ruleStringLiteral
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getValueStringLiteralParserRuleCall_7_2_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rulePrimaryExpCS9889);
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

                            otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePrimaryExpCS9902); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_28, grammarAccess.getPrimaryExpCSAccess().getRightCurlyBracketKeyword_7_2_1_3());
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4313:6: ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4313:6: ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4313:7: ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )?
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4313:7: ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==74) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4313:8: ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4313:8: ( (lv_atPre_29_0= '@' ) )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4314:1: (lv_atPre_29_0= '@' )
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4314:1: (lv_atPre_29_0= '@' )
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4315:3: lv_atPre_29_0= '@'
                                    {
                                    lv_atPre_29_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePrimaryExpCS9929); if (state.failed) return current;
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

                                    otherlv_30=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulePrimaryExpCS9954); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpCSAccess().getPreKeyword_7_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4332:3: ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==30) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4332:4: () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')'
                                    {
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4332:4: ()
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4333:2: 
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

                                    otherlv_32=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaryExpCS9981); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpCSAccess().getLeftParenthesisKeyword_7_2_2_1_1());
                                          
                                    }
                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4345:1: ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )?
                                    int alt62=2;
                                    int LA62_0 = input.LA(1);

                                    if ( ((LA62_0>=RULE_SIMPLE_ID && LA62_0<=RULE_SINGLE_QUOTED_STRING)||LA62_0==30||(LA62_0>=34 && LA62_0<=36)||LA62_0==50||(LA62_0>=52 && LA62_0<=64)||(LA62_0>=70 && LA62_0<=73)||LA62_0==77||LA62_0==81||LA62_0==83) ) {
                                        alt62=1;
                                    }
                                    switch (alt62) {
                                        case 1 :
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4345:2: ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )?
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4345:2: ( (lv_argument_33_0= ruleNavigatingArgCS ) )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4346:1: (lv_argument_33_0= ruleNavigatingArgCS )
                                            {
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4346:1: (lv_argument_33_0= ruleNavigatingArgCS )
                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4347:3: lv_argument_33_0= ruleNavigatingArgCS
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingArgCSParserRuleCall_7_2_2_1_2_0_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS10003);
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

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4363:2: ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )*
                                            loop57:
                                            do {
                                                int alt57=2;
                                                int LA57_0 = input.LA(1);

                                                if ( (LA57_0==23) ) {
                                                    alt57=1;
                                                }


                                                switch (alt57) {
                                            	case 1 :
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4364:1: (lv_argument_34_0= ruleNavigatingCommaArgCS )
                                            	    {
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4364:1: (lv_argument_34_0= ruleNavigatingCommaArgCS )
                                            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4365:3: lv_argument_34_0= ruleNavigatingCommaArgCS
                                            	    {
                                            	    if ( state.backtracking==0 ) {
                                            	       
                                            	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_1_0()); 
                                            	      	    
                                            	    }
                                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10024);
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
                                            	    break loop57;
                                                }
                                            } while (true);

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4381:3: ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )?
                                            int alt59=2;
                                            int LA59_0 = input.LA(1);

                                            if ( (LA59_0==21) ) {
                                                alt59=1;
                                            }
                                            switch (alt59) {
                                                case 1 :
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4381:4: ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )*
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4381:4: ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4382:1: (lv_argument_35_0= ruleNavigatingSemiArgCS )
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4382:1: (lv_argument_35_0= ruleNavigatingSemiArgCS )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4383:3: lv_argument_35_0= ruleNavigatingSemiArgCS
                                                    {
                                                    if ( state.backtracking==0 ) {
                                                       
                                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingSemiArgCSParserRuleCall_7_2_2_1_2_2_0_0()); 
                                                      	    
                                                    }
                                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS10047);
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

                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4399:2: ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )*
                                                    loop58:
                                                    do {
                                                        int alt58=2;
                                                        int LA58_0 = input.LA(1);

                                                        if ( (LA58_0==23) ) {
                                                            alt58=1;
                                                        }


                                                        switch (alt58) {
                                                    	case 1 :
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4400:1: (lv_argument_36_0= ruleNavigatingCommaArgCS )
                                                    	    {
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4400:1: (lv_argument_36_0= ruleNavigatingCommaArgCS )
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4401:3: lv_argument_36_0= ruleNavigatingCommaArgCS
                                                    	    {
                                                    	    if ( state.backtracking==0 ) {
                                                    	       
                                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_2_1_0()); 
                                                    	      	    
                                                    	    }
                                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10068);
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
                                                    	    break loop58;
                                                        }
                                                    } while (true);


                                                    }
                                                    break;

                                            }

                                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4417:5: ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )?
                                            int alt61=2;
                                            int LA61_0 = input.LA(1);

                                            if ( (LA61_0==76) ) {
                                                alt61=1;
                                            }
                                            switch (alt61) {
                                                case 1 :
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4417:6: ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )*
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4417:6: ( (lv_argument_37_0= ruleNavigatingBarArgCS ) )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4418:1: (lv_argument_37_0= ruleNavigatingBarArgCS )
                                                    {
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4418:1: (lv_argument_37_0= ruleNavigatingBarArgCS )
                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4419:3: lv_argument_37_0= ruleNavigatingBarArgCS
                                                    {
                                                    if ( state.backtracking==0 ) {
                                                       
                                                      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingBarArgCSParserRuleCall_7_2_2_1_2_3_0_0()); 
                                                      	    
                                                    }
                                                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS10093);
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

                                                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4435:2: ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )*
                                                    loop60:
                                                    do {
                                                        int alt60=2;
                                                        int LA60_0 = input.LA(1);

                                                        if ( (LA60_0==23) ) {
                                                            alt60=1;
                                                        }


                                                        switch (alt60) {
                                                    	case 1 :
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4436:1: (lv_argument_38_0= ruleNavigatingCommaArgCS )
                                                    	    {
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4436:1: (lv_argument_38_0= ruleNavigatingCommaArgCS )
                                                    	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4437:3: lv_argument_38_0= ruleNavigatingCommaArgCS
                                                    	    {
                                                    	    if ( state.backtracking==0 ) {
                                                    	       
                                                    	      	        newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getArgumentNavigatingCommaArgCSParserRuleCall_7_2_2_1_2_3_1_0()); 
                                                    	      	    
                                                    	    }
                                                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10114);
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
                                                    	    break loop60;
                                                        }
                                                    } while (true);


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }

                                    otherlv_39=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrimaryExpCS10131); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4465:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4466:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4467:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS10172);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS10182); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4474:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4477:28: ( ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4478:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4478:1: ( ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4478:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4478:2: ( (lv_name_0_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4479:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4479:1: (lv_name_0_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4480:3: lv_name_0_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS10228);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4496:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==69) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4496:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingArgCS10241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4500:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4501:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4501:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4502:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS10262);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4518:2: (otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==42) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4518:4: otherlv_3= '=' ( (lv_init_4_0= ruleExpCS ) )
                            {
                            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingArgCS10275); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_1_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4522:1: ( (lv_init_4_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4523:1: (lv_init_4_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4523:1: (lv_init_4_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4524:3: lv_init_4_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getInitExpCSParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS10296);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4548:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4549:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4550:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS10336);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS10346); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4557:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4560:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4561:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4561:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4561:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4561:2: ( (lv_prefix_0_0= '|' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4562:1: (lv_prefix_0_0= '|' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4562:1: (lv_prefix_0_0= '|' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4563:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleNavigatingBarArgCS10389); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4576:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4577:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4577:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4578:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS10423);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4594:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==69) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4594:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingBarArgCS10436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4598:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4599:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4599:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4600:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS10457);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4616:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==42) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4616:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingBarArgCS10470); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4620:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4621:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4621:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4622:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS10491);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4646:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4647:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4648:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS10531);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS10541); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4655:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4658:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4659:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4659:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4659:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4659:2: ( (lv_prefix_0_0= ',' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4660:1: (lv_prefix_0_0= ',' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4660:1: (lv_prefix_0_0= ',' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4661:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNavigatingCommaArgCS10584); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4674:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4675:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4675:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4676:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS10618);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4692:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4692:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingCommaArgCS10631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4696:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4697:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4697:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4698:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS10652);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4714:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==42) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4714:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingCommaArgCS10665); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4718:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4719:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4719:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4720:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10686);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4744:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4745:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4746:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10726);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10736); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4753:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4756:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4757:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4757:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )? )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4757:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_name_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4757:2: ( (lv_prefix_0_0= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4758:1: (lv_prefix_0_0= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4758:1: (lv_prefix_0_0= ';' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4759:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNavigatingSemiArgCS10779); if (state.failed) return current;
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4772:2: ( (lv_name_1_0= ruleNavigatingArgExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4773:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4773:1: (lv_name_1_0= ruleNavigatingArgExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4774:3: lv_name_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getNameNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10813);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4790:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )? )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==69) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4790:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNavigatingSemiArgCS10826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4794:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4795:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4795:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4796:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10847);
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

                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4812:2: (otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==42) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4812:4: otherlv_4= '=' ( (lv_init_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNavigatingSemiArgCS10860); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4816:1: ( (lv_init_5_0= ruleExpCS ) )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4817:1: (lv_init_5_0= ruleExpCS )
                            {
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4817:1: (lv_init_5_0= ruleExpCS )
                            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4818:3: lv_init_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getInitExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10881);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4842:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4843:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4844:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10921);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10931); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4851:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4854:28: (this_ExpCS_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4856:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10980);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4875:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4876:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4877:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11014);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS11024); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4884:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4887:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4888:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4888:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4888:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpCS ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpCS ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleIfExpCS11061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4892:1: ( (lv_condition_1_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4893:1: (lv_condition_1_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4893:1: (lv_condition_1_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4894:3: lv_condition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11082);
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

            otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleIfExpCS11094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4914:1: ( (lv_thenExpression_3_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4915:1: (lv_thenExpression_3_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4915:1: (lv_thenExpression_3_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4916:3: lv_thenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11115);
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

            otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleIfExpCS11127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpCSAccess().getElseKeyword_4());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4936:1: ( (lv_elseExpression_5_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4937:1: (lv_elseExpression_5_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4937:1: (lv_elseExpression_5_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4938:3: lv_elseExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getElseExpressionExpCSParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS11148);
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

            otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleIfExpCS11160); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4966:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4967:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4968:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11196);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS11206); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4975:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4978:28: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4979:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4979:1: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4979:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleLetExpCS11243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4983:1: ( (lv_variable_1_0= ruleLetVariableCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4984:1: (lv_variable_1_0= ruleLetVariableCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4984:1: (lv_variable_1_0= ruleLetVariableCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4985:3: lv_variable_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11264);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5001:2: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==23) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5001:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLetExpCS11277); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5005:1: ( (lv_variable_3_0= ruleLetVariableCS ) )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5006:1: (lv_variable_3_0= ruleLetVariableCS )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5006:1: (lv_variable_3_0= ruleLetVariableCS )
            	    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5007:3: lv_variable_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getVariableLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11298);
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
            	    break loop74;
                }
            } while (true);

            otherlv_4=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleLetExpCS11312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5027:1: ( (lv_in_5_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5028:1: (lv_in_5_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5028:1: (lv_in_5_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5029:3: lv_in_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getInExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS11333);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5053:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5054:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5055:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11369);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS11379); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5062:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_initExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5065:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5066:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5066:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5066:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpCS ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5066:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5067:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5067:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5068:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS11425);
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

            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5084:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==69) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5084:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLetVariableCS11438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLetVariableCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5088:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5089:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5089:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5090:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11459);
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

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLetVariableCS11473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5110:1: ( (lv_initExpression_4_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5111:1: (lv_initExpression_4_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5111:1: (lv_initExpression_4_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5112:3: lv_initExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS11494);
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5136:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5137:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5138:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11530);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS11540); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5145:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_source_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5148:28: ( (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5149:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5149:1: (otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5149:3: otherlv_0= '(' ( (lv_source_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNestedExpCS11577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5153:1: ( (lv_source_1_0= ruleExpCS ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5154:1: (lv_source_1_0= ruleExpCS )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5154:1: (lv_source_1_0= ruleExpCS )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5155:3: lv_source_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getSourceExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS11598);
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

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNestedExpCS11610); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5183:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5184:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5185:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11646);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS11656); if (state.failed) return current;

            }

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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5192:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5195:28: ( ( () otherlv_1= 'self' ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5196:1: ( () otherlv_1= 'self' )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5196:1: ( () otherlv_1= 'self' )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5196:2: () otherlv_1= 'self'
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5196:2: ()
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5197:2: 
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

            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleSelfExpCS11705); if (state.failed) return current;
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
    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5217:1: ruleLocationConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) ) ;
    public final Enumerator ruleLocationConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5219:28: ( ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) ) )
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5220:1: ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5220:1: ( (enumLiteral_0= 'sameLocation' ) | (enumLiteral_1= 'differentLocation' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==84) ) {
                alt76=1;
            }
            else if ( (LA76_0==85) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5220:2: (enumLiteral_0= 'sameLocation' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5220:2: (enumLiteral_0= 'sameLocation' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5220:4: enumLiteral_0= 'sameLocation'
                    {
                    enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleLocationConstraintType11755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLocationConstraintTypeAccess().getSAME_LOCATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLocationConstraintTypeAccess().getSAME_LOCATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5226:6: (enumLiteral_1= 'differentLocation' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5226:6: (enumLiteral_1= 'differentLocation' )
                    // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:5226:8: enumLiteral_1= 'differentLocation'
                    {
                    enumLiteral_1=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleLocationConstraintType11772); if (state.failed) return current;
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

    // $ANTLR start synpred86_InternalAllocationSpecification
    public final void synpred86_InternalAllocationSpecification_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4046:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4046:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred86_InternalAllocationSpecification9446);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_InternalAllocationSpecification

    // $ANTLR start synpred87_InternalAllocationSpecification
    public final void synpred87_InternalAllocationSpecification_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_5 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4059:2: (this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4059:2: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred87_InternalAllocationSpecification9476);
        this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalAllocationSpecification

    // $ANTLR start synpred88_InternalAllocationSpecification
    public final void synpred88_InternalAllocationSpecification_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_6 = null;


        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4072:2: (this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS )
        // ../de.uni_paderborn.fujaba.muml.allocation.language.xtext/src-gen/de/uni_paderborn/fujaba/muml/allocation/language/parser/antlr/internal/InternalAllocationSpecification.g:4072:2: this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred88_InternalAllocationSpecification9506);
        this_TypeLiteralExpCS_6=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalAllocationSpecification

    // Delegated rules

    public final boolean synpred86_InternalAllocationSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalAllocationSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalAllocationSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalAllocationSpecification_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalAllocationSpecification() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalAllocationSpecification_fragment(); // can never throw exception
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
    protected DFA65 dfa65 = new DFA65(this);
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
            return "3686:1: ( (this_PrefixedExpCS_0= rulePrefixedExpCS ( () ( (lv_ownedOperator_2_0= ruleBinaryOperatorCS ) ) ( ( ( (lv_ownedExpression_3_0= rulePrefixedExpCS ) ) ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )* ( ( (lv_ownedOperator_6_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_7_0= ruleLetExpCS ) ) )? ) | ( (lv_ownedExpression_8_0= ruleLetExpCS ) ) ) )? ) | ( () ( (lv_ownedOperator_10_0= ruleUnaryOperatorCS ) )+ ( (lv_ownedExpression_11_0= ruleLetExpCS ) ) ) | this_LetExpCS_12= ruleLetExpCS )";
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
            return "()* loopback of 3743:2: ( ( (lv_ownedOperator_4_0= ruleBinaryOperatorCS ) ) ( (lv_ownedExpression_5_0= rulePrefixedExpCS ) ) )*";
        }
    }
    static final String DFA65_eotS =
        "\35\uffff";
    static final String DFA65_eofS =
        "\35\uffff";
    static final String DFA65_minS =
        "\1\4\12\uffff\6\0\14\uffff";
    static final String DFA65_maxS =
        "\1\123\12\uffff\6\0\14\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\14\uffff\1\7\7\uffff\1\10\1\uffff\1\5\1"+
        "\6";
    static final String DFA65_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\14\uffff}>";
    static final String[] DFA65_transitionS = {
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

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3993:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_TypeLiteralExpCS_6= ruleTypeLiteralExpCS | ( () ( (lv_pathName_8_0= rulePathNameCS ) ) ( ( () otherlv_10= '[' ( (lv_firstIndexes_11_0= ruleExpCS ) ) (otherlv_12= ',' ( (lv_firstIndexes_13_0= ruleExpCS ) ) )* otherlv_14= ']' (otherlv_15= '[' ( (lv_secondIndexes_16_0= ruleExpCS ) ) (otherlv_17= ',' ( (lv_secondIndexes_18_0= ruleExpCS ) ) )* otherlv_19= ']' )? ( ( (lv_atPre_20_0= '@' ) ) otherlv_21= 'pre' )? ) | ( () otherlv_23= '{' ( ( ( (lv_ownedParts_24_0= ruleConstructorPartCS ) ) (otherlv_25= ',' ( (lv_ownedParts_26_0= ruleConstructorPartCS ) ) )* ) | ( (lv_value_27_0= ruleStringLiteral ) ) ) otherlv_28= '}' ) | ( ( ( (lv_atPre_29_0= '@' ) ) otherlv_30= 'pre' )? ( () otherlv_32= '(' ( ( (lv_argument_33_0= ruleNavigatingArgCS ) ) ( (lv_argument_34_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_argument_35_0= ruleNavigatingSemiArgCS ) ) ( (lv_argument_36_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_argument_37_0= ruleNavigatingBarArgCS ) ) ( (lv_argument_38_0= ruleNavigatingCommaArgCS ) )* )? )? otherlv_39= ')' )? ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_11 = input.LA(1);

                         
                        int index65_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalAllocationSpecification()) ) {s = 27;}

                        else if ( (synpred88_InternalAllocationSpecification()) ) {s = 17;}

                         
                        input.seek(index65_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_12 = input.LA(1);

                         
                        int index65_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecification()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecification()) ) {s = 17;}

                         
                        input.seek(index65_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_13 = input.LA(1);

                         
                        int index65_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecification()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecification()) ) {s = 17;}

                         
                        input.seek(index65_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA65_14 = input.LA(1);

                         
                        int index65_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecification()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecification()) ) {s = 17;}

                         
                        input.seek(index65_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA65_15 = input.LA(1);

                         
                        int index65_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecification()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecification()) ) {s = 17;}

                         
                        input.seek(index65_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA65_16 = input.LA(1);

                         
                        int index65_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalAllocationSpecification()) ) {s = 28;}

                        else if ( (synpred88_InternalAllocationSpecification()) ) {s = 17;}

                         
                        input.seek(index65_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecification91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleSpecification149 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSpecification161 = new BitSet(new long[]{0x0000000102040000L});
        public static final BitSet FOLLOW_ruleService_in_ruleSpecification183 = new BitSet(new long[]{0x0000000102040000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleSpecification210 = new BitSet(new long[]{0x0000000102040000L});
        public static final BitSet FOLLOW_ruleMeasureFunction_in_ruleSpecification233 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSpecification245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleService328 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleService349 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleService361 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_ruleQosDimension_in_ruleService382 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleService395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQosDimension_in_entryRuleQosDimension431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQosDimension441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleQosDimension478 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleQosDimension499 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQosDimension511 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleQosDimension523 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleQosDimension544 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleQosDimension556 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleQosDimension568 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension589 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleQosDimension602 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleQosDimension623 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleQosDimension637 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleQosDimension649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleQosDimension670 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleQosDimension682 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQosDimension694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleConstraint777 = new BitSet(new long[]{0x0000000024000000L,0x0000000000300000L});
        public static final BitSet FOLLOW_ruleLocationConstraint_in_ruleConstraint803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceConstraint_in_ruleConstraint833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_ruleConstraint863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationConstraint_in_entryRuleLocationConstraint899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationConstraint909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationConstraintType_in_ruleLocationConstraint955 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationConstraint976 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLocationConstraint989 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLocationConstraint1001 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1022 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleLocationConstraint1035 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_ruleLocationConstraint1056 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleLocationConstraint1070 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocationConstraint1082 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleModel_in_ruleLocationConstraint1103 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLocationConstraint1115 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLocationConstraint1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceConstraint_in_entryRuleResourceConstraint1163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceConstraint1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleResourceConstraint1210 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleResourceConstraint1231 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleResourceConstraint1244 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleResourceConstraint1256 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1277 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1289 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleResourceConstraint1301 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_ruleResourceConstraint1322 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1334 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleResourceConstraint1346 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1367 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleResourceConstraint1380 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleResourceConstraint1401 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleResourceConstraint1415 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleResourceConstraint1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredHardwareResourceInstanceConstraint_in_entryRuleRequiredHardwareResourceInstanceConstraint1463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredHardwareResourceInstanceConstraint1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleRequiredHardwareResourceInstanceConstraint1510 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleID_in_ruleRequiredHardwareResourceInstanceConstraint1531 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRequiredHardwareResourceInstanceConstraint1544 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRequiredHardwareResourceInstanceConstraint1556 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1577 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleRequiredHardwareResourceInstanceConstraint1590 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_ruleRequiredHardwareResourceInstanceConstraint1611 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_21_in_ruleRequiredHardwareResourceInstanceConstraint1625 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRequiredHardwareResourceInstanceConstraint1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationTupleDescriptor_in_entryRuleLocationTupleDescriptor1673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationTupleDescriptor1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLocationTupleDescriptor1720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationTupleDescriptor1741 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLocationTupleDescriptor1753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleLocationTupleDescriptor1774 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLocationTupleDescriptor1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTupleDescriptor_in_entryRuleValueTupleDescriptor1822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueTupleDescriptor1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleValueTupleDescriptor1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentResourceTupleDescriptor_in_entryRuleComponentResourceTupleDescriptor1912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentResourceTupleDescriptor1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleComponentResourceTupleDescriptor1959 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor1980 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleComponentResourceTupleDescriptor1992 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleComponentResourceTupleDescriptor2013 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentResourceTupleDescriptor2025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeasureFunction_in_entryRuleMeasureFunction2061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeasureFunction2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMeasureFunction2108 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleMeasureFunction2135 = new BitSet(new long[]{0x0000000200200000L});
        public static final BitSet FOLLOW_33_in_ruleMeasureFunction2148 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleID_in_ruleMeasureFunction2175 = new BitSet(new long[]{0x0000000200200000L});
        public static final BitSet FOLLOW_21_in_ruleMeasureFunction2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel2225 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleModel2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID2316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER2439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER2534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUPPER2609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL2650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI2795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_entryRuleEssentialOCLUnaryOperatorCS2841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorCS2851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLUnaryOperatorCS2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLUnaryOperatorCS2924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorCS_in_entryRuleEssentialOCLInfixOperatorCS2975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorCS2985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorCS3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorCS3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEssentialOCLInfixOperatorCS3087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLInfixOperatorCS3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorCS3145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorCS3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorCS3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorCS3232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorCS3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorCS3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorCS3319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorCS3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorCS3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLInfixOperatorCS3406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_entryRuleEssentialOCLNavigationOperatorCS3457 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorCS3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorCS3511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorCS3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier3592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral3744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_entryRuleBinaryOperatorCS3788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorCS3798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_ruleBinaryOperatorCS3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_ruleBinaryOperatorCS3878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorCS_in_entryRuleInfixOperatorCS3913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorCS3923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorCS_in_ruleInfixOperatorCS3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorCS_in_entryRuleNavigationOperatorCS4006 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorCS4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorCS_in_ruleNavigationOperatorCS4065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_entryRuleUnaryOperatorCS4099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorCS4109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorCS_in_ruleUnaryOperatorCS4158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName4193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName4204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName4250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName4295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName4397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName4408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLUnreservedName4545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName4586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName4597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName4643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS4687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS4697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS4743 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_rulePathNameCS4756 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS4777 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS4815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS4876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS4911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS4921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS5009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS5019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS5071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS5117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier5155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier5166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulePrimitiveTypeIdentifier5204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulePrimitiveTypeIdentifier5223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier5242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier5261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier5299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier5318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier5337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS5377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS5387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS5432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier5468 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier5479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCollectionTypeIdentifier5517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCollectionTypeIdentifier5536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier5555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier5574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS5633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS5643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS5689 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleCollectionTypeCS5702 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS5723 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionTypeCS5735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS5773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS5829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMultiplicityBoundsCS5842 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS5863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS5901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMultiplicityCS5948 = new BitSet(new long[]{0x0000000600000040L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS5974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS6004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleMultiplicityCS6016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS6052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS6062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMultiplicityStringCS6106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleMultiplicityStringCS6135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleMultiplicityStringCS6164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS6215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS6225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTupleTypeCS6268 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTupleTypeCS6294 = new BitSet(new long[]{0xFFF4001CC00000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6316 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_23_in_ruleTupleTypeCS6329 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS6350 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_31_in_ruleTupleTypeCS6366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS6404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS6414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS6460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleTuplePartCS6472 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS6493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS6529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS6539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS6585 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCollectionLiteralExpCS6597 = new BitSet(new long[]{0xFFF4001C400200F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6619 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleCollectionLiteralExpCS6632 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS6653 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleCollectionLiteralExpCS6669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS6705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS6715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6761 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionLiteralPartCS6774 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS6795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_entryRuleConstructorPartCS6833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstructorPartCS6843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleConstructorPartCS6895 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleConstructorPartCS6907 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleConstructorPartCS6928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS6964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS6974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS7024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS7054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS7084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS7114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS7144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS7174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS7209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS7219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTupleLiteralExpCS7256 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTupleLiteralExpCS7268 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7289 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleTupleLiteralExpCS7302 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS7323 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleTupleLiteralExpCS7337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS7373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS7383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS7429 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleTupleLiteralPartCS7442 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS7463 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTupleLiteralPartCS7477 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS7498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS7534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS7544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS7589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS7624 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS7634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS7679 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS7715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS7725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleBooleanLiteralExpCS7768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleBooleanLiteralExpCS7805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS7854 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS7864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnlimitedNaturalLiteralExpCS7913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS7949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS7959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleInvalidLiteralExpCS8008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS8044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS8054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleNullLiteralExpCS8103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS8139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS8149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS8199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS8229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS8259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS8294 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS8304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS8354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS8374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS8411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS8421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS8466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS8501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS8511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS8556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS8591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS8601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS8652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS8682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS8703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS8740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS8750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8801 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8834 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8857 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8879 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_ruleExpCS8900 = new BitSet(new long[]{0x0003FFEE00000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorCS_in_ruleExpCS8924 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS8945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS8975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_ruleExpCS9019 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_ruleExpCS9073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedExpCS_in_entryRulePrefixedExpCS9108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedExpCS9118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorCS_in_rulePrefixedExpCS9177 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedExpCS9231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS9266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS9276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS9326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS9356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS9386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS9416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS9446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS9506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_rulePrimaryExpCS9545 = new BitSet(new long[]{0x0000000040010002L,0x0000000000000404L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS9571 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9592 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9605 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9626 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePrimaryExpCS9640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000404L});
        public static final BitSet FOLLOW_66_in_rulePrimaryExpCS9653 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9674 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9687 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_rulePrimaryExpCS9708 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePrimaryExpCS9722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulePrimaryExpCS9743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulePrimaryExpCS9768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpCS9802 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9825 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_rulePrimaryExpCS9838 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleConstructorPartCS_in_rulePrimaryExpCS9859 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rulePrimaryExpCS9889 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePrimaryExpCS9902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulePrimaryExpCS9929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulePrimaryExpCS9954 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_rulePrimaryExpCS9981 = new BitSet(new long[]{0xFFF4001CC00000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_rulePrimaryExpCS10003 = new BitSet(new long[]{0x0000000080A00000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10024 = new BitSet(new long[]{0x0000000080A00000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_rulePrimaryExpCS10047 = new BitSet(new long[]{0x0000000080800000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10068 = new BitSet(new long[]{0x0000000080800000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_rulePrimaryExpCS10093 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_rulePrimaryExpCS10114 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_31_in_rulePrimaryExpCS10131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS10172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS10182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS10228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingArgCS10241 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS10262 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingArgCS10275 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS10296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS10336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS10346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleNavigatingBarArgCS10389 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS10423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingBarArgCS10436 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS10457 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingBarArgCS10470 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS10491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS10531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS10541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNavigatingCommaArgCS10584 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS10618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingCommaArgCS10631 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS10652 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingCommaArgCS10665 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS10686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS10726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS10736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNavigatingSemiArgCS10779 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS10813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleNavigatingSemiArgCS10826 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS10847 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleNavigatingSemiArgCS10860 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS10881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS10921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS10931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS11014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS11024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleIfExpCS11061 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleIfExpCS11094 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleIfExpCS11127 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS11148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleIfExpCS11160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS11196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS11206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleLetExpCS11243 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11264 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L});
        public static final BitSet FOLLOW_23_in_ruleLetExpCS11277 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS11298 = new BitSet(new long[]{0x0000000000800000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleLetExpCS11312 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS11333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS11369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS11379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS11425 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleLetVariableCS11438 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000823C1L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS11459 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleLetVariableCS11473 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS11494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS11530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS11540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNestedExpCS11577 = new BitSet(new long[]{0xFFF4001C400000F0L,0x00000000000A23C1L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS11598 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleNestedExpCS11610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS11646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS11656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleSelfExpCS11705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleLocationConstraintType11755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleLocationConstraintType11772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred86_InternalAllocationSpecification9446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred87_InternalAllocationSpecification9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred88_InternalAllocationSpecification9506 = new BitSet(new long[]{0x0000000000000002L});
    }


}