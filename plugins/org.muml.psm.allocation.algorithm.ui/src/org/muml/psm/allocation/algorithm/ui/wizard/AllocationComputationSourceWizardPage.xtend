package org.muml.psm.allocation.algorithm.ui.wizard

import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jface.dialogs.Dialog
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.ITreeContentProvider
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.TreeViewer
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.dialogs.ResourceListSelectionDialog
import org.eclipse.xtend.lib.annotations.Accessors
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationSourceWizardPage.FileExtensionBasedResourceListSelectionDialog
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationSourceWizardPage.ModelLoader
import org.muml.psm.allocation.language.cs.SpecificationCS

class AllocationComputationSourceWizardPage extends WizardPage {
	private static final String pageName = "Select Source Files"
	private static final String pageDescription = "Select an ASL File and an OCL Context"
	
	private PageContext pageContext
	
	@Accessors(PUBLIC_GETTER)
	private SpecificationCS specificationCS
	
	@Accessors(PUBLIC_GETTER)
	private EObject oclContext
	
	static class ModelContentProvider implements ITreeContentProvider {
		private static final String unexpectedArgument = "Expected an EObject (got: %s)"
		
		def protected EObject asEObject(Object object) {
			if (!(object instanceof EObject)) {
				throw new IllegalArgumentException(String.format(unexpectedArgument,
					object
				))
			}
			object as EObject
		}
		
		override getChildren(Object parentElement) {
			asEObject(parentElement).eContents
		}
		
		override getElements(Object inputElement) {
			if (inputElement instanceof List<?>) {
				// the list to array transformation is needed to fulfill the interface's
				// contract (inputElement should not be part of the returned array...)
				return inputElement.toArray
			}
			getChildren(inputElement)
		}
		
		override getParent(Object element) {
			asEObject(element).eContainer
		}
		
		override hasChildren(Object element) {
			getChildren(element).length > 0
		}
		
	}
	
	protected new(PageContext pageContext) {
		super(pageName)
		description = pageDescription
		pageComplete = false
		this.pageContext = pageContext
	}
	
	override createControl(Composite parent) {
		val Composite composite = new Composite(parent, SWT.NONE)
		setControl(composite)
		if (pageContext == PageContext.AllocationComputation) {
			createSelectASLFileButton(composite)
		}
		val Button oclContextFileButton = createSelectOCLContextFileButton(composite)
		val TreeViewer treeViewer = createTreeViewer(composite)
		configureForModelSelection(oclContextFileButton, null, [List<EObject> contents |
			treeViewer.input = contents
			oclContext = null
			updatePageCompletion
		])
		GridLayoutFactory.fillDefaults().generateLayout(composite);
	}
	
	def protected updatePageCompletion() {
		noError
		if (pageContext == PageContext.AllocationComputation) {
			pageComplete = oclContext != null && specificationCS != null
			return
		}
		pageComplete = oclContext != null
	}
	
	def protected error(String errorMessage) {
		setErrorMessage(errorMessage)
	}
	
	def protected noError() {
		setErrorMessage(null)
	}
	
	def protected createSelectASLFileButton(Composite parent) {
		val Button button = new Button(parent, SWT.PUSH)
		button.setText("Select ASL File")
		configureForModelSelection(button, ".allocation_specification",
			[List<EObject> contents |
				if (contents.empty || !(contents.get(0) instanceof SpecificationCS)) {
					throw new IllegalArgumentException("Expected a SpecificationCS")
				}
				specificationCS = contents.get(0) as SpecificationCS
				updatePageCompletion
			]
		)
		button
	}
	
	def protected createSelectOCLContextFileButton(Composite parent) {
		val Button button = new Button(parent, SWT.PUSH)
		button.setText("Select OCLContext File")
		button
	}
	
	def protected void configureForModelSelection(Button button, String fileExtension, (List<EObject>) => void callback) {
		button.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				// needed to avoid the following scenario: load ASL file,
				// load broken ASL file => we do not want to continue with the
				// previously loaded file
				pageComplete = false
				val FileExtensionBasedResourceListSelectionDialog dialog = new FileExtensionBasedResourceListSelectionDialog(
					getShell(), fileExtension
				)
				if (dialog.open == Dialog.OK) {
					val IFile file = dialog.result.get(0) as IFile
					try {
						callback.apply(ModelLoader.loadFile(file))
					} catch (RuntimeException exc) {
						error(exc.message)
					}
				}
			}
		})
	}
	
	def protected createTreeViewer(Composite parent) {
		val TreeViewer treeViewer = new TreeViewer(parent)
		treeViewer.labelProvider = new LabelProvider()
		val ModelContentProvider contentProvider = new ModelContentProvider()
		treeViewer.contentProvider = contentProvider
		treeViewer.addSelectionChangedListener([SelectionChangedEvent event |
			val ISelection sel = event.selection
			if (!(sel instanceof IStructuredSelection)) {
				throw new IllegalArgumentException("expected IStructuredSelection")
			}
			oclContext = (sel as IStructuredSelection).firstElement as EObject
			updatePageCompletion
		])
		treeViewer
	}
	
	static class FileExtensionBasedResourceListSelectionDialog extends ResourceListSelectionDialog {
		
		private String fileExtension
		
		new(Shell parentShell, String fileExtension) {
			super(parentShell, ResourcesPlugin.workspace.root, IResource.FILE)
			this.fileExtension = fileExtension ?: ""
		}
		
		override boolean select(IResource resource) {
			resource.name.endsWith(fileExtension)
		}
		
	}
	
	static class ModelLoader {
		private static final String RESOURCE_ERRORS = "%s: %s"
		
		def static List<EObject> loadFile(IFile file) {
			val ResourceSet resSet = new ResourceSetImpl()
			val URI uri = URI.createPlatformResourceURI(file.fullPath.toString, true)
			val resource = resSet.getResource(uri, true)
			if (!resource.errors.empty) {
				throw new IllegalStateException(String.format(RESOURCE_ERRORS,
					uri.toPlatformString(true), resource.errors
				))
			}
			resource.contents
		}
	}
	
}