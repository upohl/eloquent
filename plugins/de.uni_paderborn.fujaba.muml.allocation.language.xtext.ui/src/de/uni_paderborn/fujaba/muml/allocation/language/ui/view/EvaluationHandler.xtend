package de.uni_paderborn.fujaba.muml.allocation.language.ui.view

import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil

class EvaluationHandler extends BaseHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val view = HandlerUtil.getActiveWorkbenchWindow(event).activePage.showView(viewID)
			 as AllocationSpecificationLanguageEvaluationView
		view.evaluate
		null
	}
	
}