package org.muml.eloquent.ocl.vql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.AnyType;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.internal.utilities.AbstractConversion;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;

/*
 *  Inspired by org.eclipse.ocl.pivot.internal.ecore.es2as.Ecore2AS
 *  However, we do not inherit from AbstractExternal2AS, because it
 *  adds to much "ecore conversion specific" noise to this class.
 *  The advantage would be that we could easily hook into the
 *  *external2as* code paths, which would probably lead to a cleaner
 *  dispose code... but well it is not worth the effort/noise and this
 *  implementation is not wrong at all.
 */
public class VQL2AS extends AbstractConversion {
	
	private List<@NonNull Diagnostic> errorList;
	// the vql "cs" resource
	private Resource resource;
	private Model model; // actually, we just need it for the dispose code

	public VQL2AS(@NonNull Resource resource,
			@NonNull EnvironmentFactoryInternal environmentFactory) {
		super(environmentFactory);
		this.resource = resource;
	}
	
	public @NonNull Model getASModel() {
		ASResource asResource = getASResource();
		if (!asResource.getContents().isEmpty()) {
			// note this is called during the conversion
			model = asResource.getModel();
			return model;
		}
		initModel(asResource);
		VQL2ASDeclarationSwitch declarationPass = new VQL2ASDeclarationSwitch(this);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof PatternModel) {
				declarationPass.doSwitch(eObject);
			}
		}
		if (errorList != null) {
			asResource.getErrors().addAll(errorList);
		}
		getMetamodelManager().installResource(asResource);
		return model;
	}
	
	protected @NonNull ASResource getASResource() {
		URI asURI = PivotUtilInternal.getASURI(getURI());
		String contentType = VQLASResourceFactory.getInstance()
				.getContentType();
		return getMetamodelManager().getResource(asURI, contentType);
	}
	
	protected void initModel(@NonNull ASResource asResource) {
		String externalURI = ClassUtil.nonNull(getURI().toString());
		Model model = PivotUtil.createModel(externalURI);
		PivotUtilInternal.refreshList(asResource.getContents(),
				Collections.singletonList(ClassUtil.nonNull(model)));
	}
	
	public @NonNull Type getType(@NonNull EObject eObject) {
		Type type;
		try {
			type = getMetamodelManager().getASOf(Type.class, eObject);
		} catch (ParserException e) {
			throw new IllegalArgumentException(e);
		}
		return ClassUtil.nonNull(type);
	}
	
	public @NonNull PrimitiveType getPrimitiveType(@NonNull Class<?> javaClass) {
		PrimitiveType type = getStandardLibrary().getBehavioralClass(javaClass);
		return ClassUtil.nonNull(type);
	}
	
	public @NonNull AnyType getAnyType() {
		return getStandardLibrary().getOclAnyType();
	}
	
	public @NonNull TupleType getTupleType(@NonNull String name,
			@NonNull List<@NonNull TypedElement> tupleParts) {
		return getEnvironmentFactory().getCompleteEnvironment().getTupleType(name,
				tupleParts, null);
	}
	
	public @NonNull TupleType getTupleType(@NonNull List<@NonNull TypedElement> tupleParts) {
		return getTupleType("Tuple", tupleParts);
	}
	
	public @NonNull CollectionType getSetType(@NonNull Type type) {
		return getEnvironmentFactory().getCompleteEnvironment().getSetType(type,
				false, null, null);
	}
	
	@NonNull URI getURI() {
		return ClassUtil.nonNull(resource.getURI());
	}

	public void error(@NonNull String message) {
		if (errorList == null) {
			errorList = new ArrayList<Diagnostic>();
		}
		errorList.add(new XMIException(message));
	}
	
	public void dispose() {
		/*
		 *  Hmm is this dispose really needed? We get called from
		 *  our adapter, which is called by
		 *  AbstractEnvironmentFactory.disposeInternal():
		 *  In this case, the following holds:
		 *  - "model" is not contained in a resource anymore
		 *  - the asResource does not exist anymore (calls to
		 *    getASResource() will fail)
		 *  - the partial model is still registered
		 *  => it is not clear if we really need this, but the
		 *  current code does not harm...
		 */
		if (model != null) {
			getEnvironmentFactory().getCompleteModel()
				.getPartialModels().remove(model);
			getMetamodelManager().getASResourceSet()
				.getResources().remove(model.eResource());
		}
	}

}
