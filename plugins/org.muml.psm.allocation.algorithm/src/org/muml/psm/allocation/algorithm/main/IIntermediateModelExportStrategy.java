package org.muml.psm.allocation.algorithm.main;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.psm.allocation.language.cs.SpecificationCS;

/**
 * A strategy that is used to export intermediate models. For instance,
 * if a class, which implements the <code>IAllocationComputationStrategy</code>
 * interface, utilizes intermediate models (e.g., it generates an ILP) it can
 * also implement this interface to offer its users the export of these
 * intermediate models. This strategy's configuration object can be used, for
 * instance, to specify which intermediate models should be exported and
 * where to store them. 
 */
public interface IIntermediateModelExportStrategy<T> extends IStrategy<T> {
	
	/**
	 * Export the intermediate models that are generated when applying
	 * our strategy to the allocationSpecification and oclContext.
	 * 
	 * @param allocationSpecification	the allocation specification
	 * @param oclContext				the ocl context object
	 * @param progressMonitor			the progress monitor or <code>null</null>
	 * @return							a diagnostic that indicates success or failure
	 */
	public Diagnostic exportIntermediateModels(
			@NonNull SpecificationCS allocationSpecification,
			@NonNull EObject oclContext,
			@Nullable IProgressMonitor progressMonitor);
	
}
