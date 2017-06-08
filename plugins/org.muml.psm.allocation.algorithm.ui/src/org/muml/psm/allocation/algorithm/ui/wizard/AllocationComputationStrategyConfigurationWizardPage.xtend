package org.muml.psm.allocation.algorithm.ui.wizard

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Spinner

class AllocationComputationStrategyConfigurationWizardPage extends WizardPage {
	private static final String pageName = "Strategy Configuration"
	private static final String pageDescription = "Configure the Selected Strategy"
	
	private static final String unsupportedEAttributeType = "Add support for %s"
	private EObject configuration
	
	new() {
		super(pageName)
		description = pageDescription
	}
	
	override createControl(Composite parent) {
		val Composite composite = new Composite(parent, SWT.NONE)
		setControl(composite)
	}
	
	def setConfiguration(EObject configuration) {
		if (this.configuration == configuration) {
			return
		}
		this.configuration = configuration
		disposeChildren
		createAttributeControls
	}
	
	def protected disposeChildren() {
		for (Control child : (control as Composite).children) {
			child.dispose
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
	
}