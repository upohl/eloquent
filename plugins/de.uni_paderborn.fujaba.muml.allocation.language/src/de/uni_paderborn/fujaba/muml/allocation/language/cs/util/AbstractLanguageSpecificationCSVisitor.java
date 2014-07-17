/**
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: de.uni_paderborn.fujaba.muml.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	de.uni_paderborn.fujaba.muml.allocation.language.cs.util;

import org.eclipse.jdt.annotation.NonNull;

/*
 * An AbstractLanguageSpecificationCSVisitor provides a default implementation of the visitor framework
 * but n implementations of the visitXXX methods..
 */
public abstract class AbstractLanguageSpecificationCSVisitor<R, C>
	extends org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.util.AbstractCompleteOCLCSVisitor<R, C>
	implements LanguageSpecificationCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractLanguageSpecificationCSVisitor(@NonNull C context) {
		super(context);
	}
}
