package org.muml.psm.allocation.ilp.lpsolve.xtext.resource;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * Abstract base class for xtext language resources.
 * It provides methods for parsing text and serializing
 * model objects.
 */
public abstract class AbstractLanguageResource implements ILanguageResource {
	
	protected static class LoadResult implements ILoadResult {
		
		private EObject object;
		private List<Diagnostic> errorList;
		
		public void setEObject(EObject object) {
			this.object = object;
		}
		
		public void setErrorList(List<Diagnostic> errorList) {
			this.errorList = errorList;
		}

		@Override
		public EObject getEObject() {
			return object;
		}

		@Override
		public boolean hasError() {
			return !getErrorList().isEmpty();
		}

		@Override
		public String getError() {
			return hasError() ? getErrorList().toString() : "";
		}
		
		protected List<Diagnostic> getErrorList() {
			if (errorList == null) {
				return Collections.emptyList();
			}
			return errorList;
		}
		
	}
	
	private static final String INVALID = "unable to serialize model "
			+ "because it does not conform to the grammar";
	protected abstract Injector getInjector();
	
	/**
	 * Can be used to initialize a the scope etc.
	 * @param context
	 */
	protected void init(EObject context) {
		// TODO: comment me (can be used for some initialization stuff)
	}

	/**
	 * Returns a Resource that can be used for parsing/"loading"
	 * a text (this method is usually not called directly).
	 * @param object the context object (can be used for setting up the scope)
	 * @return a resource
	 */
	public Resource getXtextResource(EObject object) {
		if (getInjector() == null) {
			throw new IllegalStateException("injector must not be null");
		}
		XtextResourceSet resSet = getInjector().getInstance(XtextResourceSet.class);
		String ext = getInjector().getInstance(Key.get(String.class, Names.named(Constants.FILE_EXTENSIONS)));
		// FIXME: use some unique filename?
		Resource resource = resSet.createResource(URI.createURI("dummy." + ext));
		init(object);
		return resource;
	}
	
	public ILoadResult loadFromString(String text, EObject object) {
		Resource resource = getXtextResource(object);
		LoadResult result = new LoadResult();
		try {
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XtextResource.OPTION_RESOLVE_ALL, true);
			resource.load(new StringInputStream(text), options);
			result.setErrorList(resource.getErrors());
			if (!result.hasError()) {
				result.setEObject(resource.getContents().get(0));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Checks if the passed object is serializable.
	 * @param object the object that should be serialized
	 * @return true if object can be serialized
	 */
	protected abstract boolean isSerializable(EObject object);

	public String serializeEObject(EObject object, EObject container) {
		if (!isSerializable(object)) {
			return null;
		}
		XtextResource resource = (XtextResource) getXtextResource(container);
		return resource.getSerializer().serialize(object);
	}
	
	/**
	 * Returns a text for an invalid expression.
	 * @return an invalid expression string
	 */
	protected String getInvalidExpression() {
		return INVALID;
	}
	
	/**
	 * @see serializeEObject (catches a XtextSerializationException).
	 */
	public String serializeEObjectSafe(EObject object, EObject container) {
		try {
			return serializeEObject(object, container);
		} catch (XtextSerializationException e) {
			return getInvalidExpression();
		}
	}
}
