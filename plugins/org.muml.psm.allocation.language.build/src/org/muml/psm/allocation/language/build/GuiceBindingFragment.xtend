package org.muml.psm.allocation.language.build

import java.util.Set
import org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.Binding
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.XtextEditor
import org.muml.psm.allocation.language.xtext.resource.SpecificationCSResource

import static extension org.muml.psm.allocation.language.build.XtextBindingExtensions.*

class GuiceBindingFragment extends EssentialOCLFragment {
	
	override public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		// use the SpecificationCS specific Resource
		super.getGuiceBindingsRt(grammar).removeBindingsFor(
			typeof(XtextResource)
		).addBindingFor(
			typeof(XtextResource),
			typeof(SpecificationCSResource)
		)
	}
	
	override public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		// we do not provide a custom XtextEditor... thus fallback to
		// the default one
		super.getGuiceBindingsUi(grammar).removeBindingsFor(
			typeof(XtextEditor)
		)
	}
}