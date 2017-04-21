package org.muml.psm.allocation.ilp.lpsolve.xtext.resource;

import org.eclipse.emf.ecore.EObject;

public interface ILoadResult {
	/**
	 * Returns the parsed object (or null in case of an error).
	 * @return the parsed object
	 */
	public EObject getEObject();
	
	/**
	 * Checks if the parsing was successful.
	 * @return true if it was successful
	 */
	public boolean hasError();
	
	// TODO: is this useful? should we return the diagnostician?
	/**
	 * Returns an error string if parsing failed
	 * @return an error string
	 */
	public String getError();

}
