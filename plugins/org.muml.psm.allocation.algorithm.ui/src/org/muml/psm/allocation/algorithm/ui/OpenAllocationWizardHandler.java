package org.muml.psm.allocation.algorithm.ui;

import org.muml.psm.allocation.algorithm.ui.wizard.PageContext;

public class OpenAllocationWizardHandler extends AbstractOpenWizardHandler {

	@Override
	protected PageContext getPageContext() {
		return PageContext.AllocationComputation;
	}

}
