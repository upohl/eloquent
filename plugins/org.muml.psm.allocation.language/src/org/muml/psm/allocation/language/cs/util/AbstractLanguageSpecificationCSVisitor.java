/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.muml.psm.allocation.language/model/LanguageSpecificationCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.muml.psm.allocation.language.cs.util;


/*
 * An AbstractLanguageSpecificationCSVisitor provides a default implementation of the visitor framework
 * but n implementations of the visitXXX methods..
 */
public abstract class AbstractLanguageSpecificationCSVisitor<R, C>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractCompleteOCLCSVisitor<R, C>
	implements LanguageSpecificationCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractLanguageSpecificationCSVisitor(C context) {
		super(context);
	}
}
