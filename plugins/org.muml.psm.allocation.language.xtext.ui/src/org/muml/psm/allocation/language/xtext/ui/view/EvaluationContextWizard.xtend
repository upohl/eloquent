package org.muml.psm.allocation.language.xtext.ui.view

import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.EObject
import org.muml.core.export.operation.IFujabaExportOperation
import org.muml.core.export.pages.AbstractFujabaExportSourcePage
import org.muml.core.export.pages.ElementSelectionMode
import org.muml.core.export.wizard.AbstractFujabaExportWizard
import org.muml.pim.instance.ComponentInstanceConfiguration
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration

class EvaluationContextWizard extends AbstractFujabaExportWizard {
	AbstractFujabaExportSourcePage cicSourcePage
	AbstractFujabaExportSourcePage hpicSourcePage
	ComponentInstanceConfiguration cic
	HWPlatformInstanceConfiguration hpic
	
	override wizardCreateExportOperation() {
		cic = cicSourcePage.sourceElements.get(0) as ComponentInstanceConfiguration
		hpic = hpicSourcePage.sourceElements.get(0) as HWPlatformInstanceConfiguration
		new IFujabaExportOperation() {
			
			override getStatus() {
				Status.OK_STATUS
			}
			
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
			}
			
		}
	}
	
	override addPages() {
		// cic and hpic selection source page
		cicSourcePage = new AbstractFujabaExportSourcePage("CicSP", toolkit,
				getResourceSet(), initialSelection) {
					
			/*{
				setTitle("Select Component Instance Configuration");
				setDescription("Select Component Instance Configuration, whose component instances should be allocated");
			}*/

			override wizardPageGetSourceFileExtension() {
				return "muml";
			}

			override wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			override wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof ComponentInstanceConfiguration;
			}
			
		}
		addPage(cicSourcePage)
		// hpic source page
		hpicSourcePage = new AbstractFujabaExportSourcePage("HpicSP", toolkit,
				getResourceSet(), initialSelection) {
			
			/*{
				setTitle("Select HW Platform Instance Configuration");
				setDescription("The HW Platform Instance Configuration provides the ECUs");
			}*/

			override wizardPageGetSourceFileExtension() {
				"muml"
			}

			override wizardPageGetSupportedSelectionMode() {
				ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE
			}

			override wizardPageSupportsSourceModelElement(EObject element) {
				element instanceof HWPlatformInstanceConfiguration
			}
			
		}
		addPage(hpicSourcePage)
	}
	
	override wizardGetId() {
		"org.muml.psm.allocation.language.ui.view.EvaluationContextWizard"
	}
	
	def getComponentInstanceConfiguration() {
		cic
	}
	
	def getHWPlatformInstanceConfiguration() {
		hpic
	}
	
}