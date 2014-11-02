package de.uni_paderborn.fujaba.muml.allocation.language.build;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.examples.build.utilities.GenerateModel;

/**
 * Its sole purpose is to accept an URI-like "genModel" variable.
 */
public class URIAwareGenerateModel extends GenerateModel {
	@Override
	public void setGenModel(String genModelURI) {
		URI uri = URI.createURI(genModelURI);
		super.setGenModel(uri.isPlatformResource() ? uri.toPlatformString(false)
				: genModelURI);
	}
}
