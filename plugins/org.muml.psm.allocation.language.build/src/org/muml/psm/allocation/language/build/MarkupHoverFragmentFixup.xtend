package org.muml.psm.allocation.language.build

import java.util.Set
import org.eclipse.jface.text.ITextHover
import org.eclipse.ocl.examples.build.fragments.MarkupHoverFragment
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.Binding

import static extension org.muml.psm.allocation.language.build.XtextBindingExtensions.*

// get rid of this ASAP (hopefully this isn't needed anymore after the
// next ocl release)
class MarkupHoverFragmentFixup extends MarkupHoverFragment {
	
	override public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		super.getGuiceBindingsUi(grammar).removeBindingsFor(
			// XXX: the MarkupHoverFragment binds the ITextHover to
			// org.eclipse.ocl.xtext.markup.ui.hover.MarkupCompositeHover,
			// which is only available in the ocl git repo (since this is
			// just usability, it isn't worth to backport it...). For now,
			// we just stick to the default xtext binding
			// (DefaultCompositeHover).
			typeof(ITextHover)
		)
	}
	
}