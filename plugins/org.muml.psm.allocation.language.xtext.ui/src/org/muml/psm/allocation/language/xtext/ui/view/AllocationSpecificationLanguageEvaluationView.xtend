package org.muml.psm.allocation.language.xtext.ui.view

import com.google.inject.Inject
import com.google.inject.name.Named
import java.io.PrintWriter
import java.io.StringWriter
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jface.resource.JFaceResources
import org.eclipse.jface.text.Document
import org.eclipse.jface.text.ITextSelection
import org.eclipse.jface.text.ITextViewer
import org.eclipse.jface.text.TextViewer
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ocl.pivot.ExpressionInOCL
import org.eclipse.ocl.pivot.ids.TuplePartId
import org.eclipse.ocl.pivot.utilities.ValueUtil
import org.eclipse.ocl.pivot.values.InvalidValueException
import org.eclipse.ocl.pivot.values.TupleValue
import org.eclipse.ocl.xtext.basecs.NamedElementCS
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.ISelectionListener
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.Constants
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.ui.editor.XtextEditor
import org.muml.pim.instance.ComponentInstanceConfiguration
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration
import org.muml.psm.allocation.algorithm.ocl.OCLEvaluator
import org.muml.psm.allocation.language.cs.EvaluatableElementCS
import org.muml.psm.allocation.language.oclcontext.OclcontextFactory
import org.muml.psm.allocation.language.xtext.typing.TypesUtil

class AllocationSpecificationLanguageEvaluationView extends ViewPart implements ISelectionListener {
	@Inject EObjectAtOffsetHelper eObjectAtOffsetHelper
	@Inject @Named(Constants.LANGUAGE_NAME) String languageName
	String evaluatableElementFragmentURI
	XtextEditor editor
	ComponentInstanceConfiguration cic
	HWPlatformInstanceConfiguration hpic
	
	public def getCic() { return cic; }
	public def setCic(ComponentInstanceConfiguration cic) { this.cic = cic; }
	public def getHpic() { return hpic; }
	public def setHpic(HWPlatformInstanceConfiguration hpic) { this.hpic = hpic; }
	
	
	ITextViewer resultTextViewer
	
	override createPartControl(Composite parent) {
		createResultTextViewer(parent)
		if (viewSite != null) {
			viewSite.page.addSelectionListener(this)
		}
	}
	
	private def createResultTextViewer(Composite parent) {
		resultTextViewer = new TextViewer(parent, SWT.BORDER.bitwiseOr(SWT.MULTI).bitwiseOr(SWT.V_SCROLL).bitwiseOr(SWT.H_SCROLL));
		resultTextViewer.getTextWidget().setLayoutData(new GridData(GridData.FILL_BOTH));
		resultTextViewer.getTextWidget().setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
		resultTextViewer.setEditable(false);
		resultTextViewer.setDocument(new Document())
	}
	
	override setFocus() {
		
	}
	
	override selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (part instanceof XtextEditor
			&& (part as XtextEditor).languageName.equals(languageName)
			&& selection instanceof ITextSelection
		) {
			val textSel = selection as ITextSelection
			editor = part as XtextEditor
			// see http://www.eclipse.org/community/eclipse_newsletter/2014/august/article4.php
			evaluatableElementFragmentURI = editor.document.readOnly [ resource |
				var model = eObjectAtOffsetHelper.resolveContainedElementAt(resource, textSel.offset)
				while (!(model instanceof EvaluatableElementCS) && model != null) {
					model = model.eContainer
				}
				if (model != null) {
					resource.getURIFragment(model)
				}
			]
			
		}
	}
	
	private def getEvaluatableElementCS(Resource resource) {
		if (evaluatableElementFragmentURI != null && editor != null) {
			resource.getEObject(evaluatableElementFragmentURI)
		} as EvaluatableElementCS
	}
	
	private def getContext() {
		val ctx = OclcontextFactory.eINSTANCE.createOCLContext
		ctx.componentInstanceConfiguration = cic
		ctx.hardwarePlatformInstanceConfiguration = hpic
		ctx
	}
	
	def evaluate() {
		val StringBuilder builder = new StringBuilder
		if (editor != null) {
			val result = editor.document.readOnly [ resource |
				val element = resource.getEvaluatableElementCS
				val ctx = getContext
				if (element != null && ctx.componentInstanceConfiguration != null && ctx.hardwarePlatformInstanceConfiguration != null) {
					builder.append("Evaluating: " + element.getName + "\n")
					builder.append("Expected type: " + TypesUtil.createType(element))
					builder.append("\n")
					builder.append("Actual type: " + (element.expression.pivot as ExpressionInOCL).type)
					builder.append("\nResult:\n\n")
					try {
						OCLEvaluator.evaluate(element.expression, ctx)
					} catch (InvalidValueException e) {
						val StringWriter writer = new StringWriter()
						e.printStackTrace(new PrintWriter(writer))
						builder.append(writer.toString)
						null
					}
				} else {
					builder.append("Select an evaluation context and/or a constraint")
					null
				}
			]
			if (result != null) {
				buildOutput(builder, result, "")
			}
		} else {
			builder.append("Open the ASL editor and select a constraint")
		}
		resultTextViewer.document.set(builder.toString)
	}
	
	private def getName(EvaluatableElementCS element) {
		if (element instanceof NamedElementCS) {
			(element as NamedElementCS).name
		} else {
			"<Unnamed>"
		}
	}
	
	private def dispatch void buildOutput(StringBuilder builder, Object value, String indent) {
		val collection = ValueUtil.isCollectionValue(value)
		if (collection != null) {
			builder.append(indent)
			builder.append(
				collection.class.name.replaceAll(".*\\.", "")
					.replaceAll("ValueImpl", "")
					.replaceAll("\\$.*$", "")
			)
			builder.append(" {\n")
			for (Object item : collection.iterable) {
				buildOutput(builder, item, indent + " ")
			}
			builder.append(indent + "}\n")
		} else {
			//builder.append(ValuesUtil.stringValueOf(value))
			builder.append(indent)
			ValueUtil.toString(value, builder, 4000)
			builder.append("\n")
		}
	}
	
	private def dispatch void buildOutput(StringBuilder builder, TupleValue value, String indent) {
		// cf. TupleValueImpl.toString
		builder.append(indent)
		builder.append("Tuple{"); //$NON-NLS-1$       
		val TuplePartId[] partIds = value.typeId.partIds
		for (var i = 0; i < partIds.length; i++) {
			val TuplePartId partId = partIds.get(i)
			if (i != 0) {
				builder.append(", "); //$NON-NLS-1$
			}
			builder.append(partId.getDisplayName().replaceAll("'.*'::", ""));
			builder.append(" = "); //$NON-NLS-1$a
			val StringBuilder tmp = new StringBuilder
			ValueUtil.toString(value.getValue(i), tmp, 4000);
			builder.append(tmp.toString.replaceAll(".*@[^\\s]*\\s+", ""))
		}       
		builder.append("}"); //$NON-NLS-1$
		builder.append("\n")
	}
	
}