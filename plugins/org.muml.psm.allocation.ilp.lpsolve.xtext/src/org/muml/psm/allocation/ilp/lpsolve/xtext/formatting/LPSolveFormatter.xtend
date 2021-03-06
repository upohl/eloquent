/*
 * generated by Xtext
 */
package org.muml.psm.allocation.ilp.lpsolve.xtext.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.muml.psm.allocation.ilp.lpsolve.xtext.services.LPSolveGrammarAccess

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class LPSolveFormatter extends AbstractDeclarativeFormatter {
	
	@Inject extension LPSolveGrammarAccess
	
	override protected configureFormatting(FormattingConfig c) {
		for(pair: findKeywordPairs('{', '}')) {
			c.setIndentation(pair.first, pair.second)
			c.setLinewrap(1).after(pair.first)
			c.setLinewrap(1).before(pair.second)
			c.setLinewrap(1).after(pair.second)
		}
		// added to ';' to the array
		for(kw : findKeywords(',', ';')) {
			c.setNoLinewrap().before(kw)
			c.setNoSpace().before(kw)
			c.setLinewrap().after(kw)
		}
		// no space before a colon
		for (colon : findKeywords(':')) {
			println(colon)
			c.setNoSpace().before(colon)
		}
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	}
}
