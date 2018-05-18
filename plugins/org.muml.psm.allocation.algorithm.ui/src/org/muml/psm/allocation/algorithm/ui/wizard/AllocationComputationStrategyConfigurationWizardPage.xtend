package org.muml.psm.allocation.algorithm.ui.wizard

import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.jface.dialogs.Dialog
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.jface.wizard.IWizardPage
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.SaveAsDialog

class AllocationComputationStrategyConfigurationWizardPage extends WizardPage {
	private static final String pageName = "Strategy Configuration"
	private static final String pageDescription = "Configure the Selected Strategy"
	
	private static final String unsupportedEAttributeType = "Add support for %s"
	
	private static final String fileChooserRegex = ".*Filename$";
	private static final String fileChooserButtonName = "Choose a file"
	private static final String currentFileChosen = "(current value: %s)"
	private static final String noFileChosen = "None"
	
	private EObject configuration
	private IWizardPage nextPage
	
	/*
	 * terminology: an AllocationComputationStrategyConfigurationWizardPage is called
	 * "contained" iff it is in some containmentConfigPageList
	 */
	private List<AllocationComputationStrategyConfigurationWizardPage> containmentConfigPageList
	
	/*
	 * This constructor is (usually) used to create a non contained page.
	 * Also, it is crucial that a _non_ contained page is added to the wizard's
	 * page list (e.g., via wizard.addPage etc.)
	 */
	new() {
		// hmm we could improve the description for the non contained page,
		// but well...
		this(pageDescription)
	}
	
	new(String pageDescription) {
		super(pageName)
		description = pageDescription
		containmentConfigPageList = newArrayList
	}
	
	protected new(EObject configuration, IWizardPage nextPage) {
		this(String.format("%s: %s", pageDescription, configuration.eClass.name))
		this.configuration = configuration
		this.nextPage = nextPage
	}
	
	override createControl(Composite parent) {
		val Composite composite = new Composite(parent, SWT.NONE)
		setControl(composite)
		if (configuration !== null) {
			/*
			 * configuration !== null implies that this page contained.
			 * Hence, we have to (and can) create all controls now
			 * (since setConfiguration is never called for a contained
			 * page).
			 */
			createControls
		}
	}
	
	override getNextPage() {
		if (nextPage !== null) {
			return nextPage
		}
		super.nextPage
	}
	
	def setConfiguration(EObject configuration) {
		if (this.configuration === configuration) {
			return
		}
		this.configuration = configuration
		disposeContainmentConfigPages
		disposeChildren
		createControls
	}
	
	def protected createControls() {
		createContainmentPages
		createAttributeControls
	}
	
	override dispose() {
		disposeContainmentConfigPages
		disposeChildren
		super.dispose
	}
	
	def protected void disposeChildren() {
		/*
		 * If this page is contained, it is possible that createControls
		 * was never called (hence, check for null)
		 */
		if (control === null) {
			return
		}
		for (Control child : (control as Composite).children) {
			// this also causes the child to be removed from the control
			// (see org.eclipse.swt.widgets.Control.releaseParent())
			child.dispose
		}			
	}
	
	def protected void disposeContainmentConfigPages() {
		nextPage = null
		for (IWizardPage page : containmentConfigPageList) {
			page.dispose
		}
		containmentConfigPageList.clear
	}
	
	def protected createContainmentPages() {
		// each containment will be displayed in a separate page
		var AllocationComputationStrategyConfigurationWizardPage current = this
		val Iterable<EReference> features = configuration.eClass
			.EAllContainments.reject[feature |
				feature.many
			]
		for (EStructuralFeature feature : features) {
			feature.isMany
			val Object containment = configuration.eGet(feature)
			if (containment !== null && containment instanceof EObject) {
				val configPage = new AllocationComputationStrategyConfigurationWizardPage(
					containment as EObject,
					current.getNextPage
				)
				// setting the wizard is crucial for WizardDialog.updateForPage
				configPage.wizard = current.wizard
				current.nextPage = configPage
				containmentConfigPageList += configPage
				current = configPage
			}
		}
	}
	
	def protected createAttributeControls() {
		val Composite composite = control as Composite
		for (EAttribute attribute : configuration.eClass.EAllAttributes.filter[attr | !attr.derived]) {
			createAttributeControls(attribute, composite)
		}
		GridLayoutFactory.fillDefaults.generateLayout(composite)
		// all children changed => "ask" to lay them out
		for (Control child : composite.children) {
			child.requestLayout
		}
	}
	
	def protected createAttributeControls(EAttribute attribute, Composite parent) {
		val Composite composite = new Composite(parent, SWT.NONE)
		val GridLayout layout = new GridLayout(2, true)
		composite.layout = layout
		val Label label = new Label(composite, SWT.LEFT)
		label.text = attribute.name
		switch (attribute.EAttributeType) {
			case EcorePackage.eINSTANCE.EInt: createEIntControl(attribute, composite)
			case EcorePackage.eINSTANCE.EBoolean: createEBooleanControl(attribute, composite)
			case EcorePackage.eINSTANCE.EString: createEStringControl(attribute, composite)
			default: throw new IllegalArgumentException(String.format(unsupportedEAttributeType, attribute))
		}
	}
	
	def protected createEIntControl(EAttribute attribute, Composite parent) {
		val Spinner spinner = new Spinner(parent, SWT.BORDER)
		spinner.minimum = Integer.MIN_VALUE
		spinner.maximum = Integer.MAX_VALUE
		spinner.selection = configuration.eGet(attribute) as Integer
		spinner.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				configuration.eSet(attribute, spinner.selection)
			}
		})
	}
	
	def protected createEBooleanControl(EAttribute attribute, Composite parent) {
		val Button button = new Button(parent, SWT.CHECK)
		button.selection = configuration.eGet(attribute) as Boolean
		button.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				configuration.eSet(attribute, button.selection)
			}
		})
	}
	
	def protected createEStringControl(EAttribute attribute, Composite parent) {
		if (attribute.name.matches(fileChooserRegex)) {
			// offer a file chooser dialog instead of a text field
			createFileChooserDialogButton(attribute, parent)
			return
		}
		val Text text = new Text(parent, SWT.SINGLE)
		text.text = (configuration.eGet(attribute) ?: "") as String
		text.addModifyListener(new ModifyListener() {
			override modifyText(ModifyEvent e) {
				configuration.eSet(attribute, text.text)
			}
		})
	}
	
	def protected createFileChooserDialogButton(EAttribute attribute, Composite parent) {
		val Composite composite = new Composite(parent, SWT.NONE)
		val GridLayout layout = new GridLayout(2, true)
		composite.layout = layout
		val Button button = new Button(composite, SWT.PUSH)
		button.text = fileChooserButtonName
		val Label label = new Label(composite, SWT.RIGHT)
		val updateLabelText = [|
			label.text = String.format(
				currentFileChosen,
				configuration.eGet(attribute) ?: noFileChosen as String
			)
		]
		updateLabelText.apply()
		 
		button.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				val SaveAsDialog dialog = new SaveAsDialog(shell)
				var String filename
				if (dialog.open === Dialog.OK) {
					 filename = dialog.result.toPortableString
				}
				// we also allow null here (e.g., to "undo" a previous choice)
				configuration.eSet(attribute, filename)
				updateLabelText.apply()
			}
		})
	}
	
}
