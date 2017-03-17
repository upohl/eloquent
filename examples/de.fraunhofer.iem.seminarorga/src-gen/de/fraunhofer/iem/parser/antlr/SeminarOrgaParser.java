/*
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.iem.parser.antlr.internal.InternalSeminarOrgaParser;
import de.fraunhofer.iem.services.SeminarOrgaGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SeminarOrgaParser extends AbstractAntlrParser {

	@Inject
	private SeminarOrgaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSeminarOrgaParser createParser(XtextTokenStream stream) {
		return new InternalSeminarOrgaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Seminar";
	}

	public SeminarOrgaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeminarOrgaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}