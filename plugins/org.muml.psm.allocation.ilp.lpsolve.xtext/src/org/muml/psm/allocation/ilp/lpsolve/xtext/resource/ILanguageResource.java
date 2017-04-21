package org.muml.psm.allocation.ilp.lpsolve.xtext.resource;

import org.eclipse.emf.ecore.EObject;

// XXX: it might make sense to make ILoadResult a generic interface
// so that it can return "concrete" type instead of EObject (this
// would make sense for our graphviz based language resources but not
// for the actionlanguage)

// TODO: write a sane documentation of this interface... (even though
// it is more or less obvious)

/**
 * Provides methods for parsing text and serializing objects
 */
public interface ILanguageResource {
	/**
	 * Parses a text
	 * @param text the text
	 * @param object the context object
	 * @return the parsed model
	 */
	public ILoadResult loadFromString(String text, EObject object);
	
	/**
	 * Serializes the passed object.
	 * @param object the object that should be serialized
	 * @param container the context (which usually contains the object)
	 * @return the serialized string
	 */
	public String serializeEObject(EObject object, EObject container);
}
