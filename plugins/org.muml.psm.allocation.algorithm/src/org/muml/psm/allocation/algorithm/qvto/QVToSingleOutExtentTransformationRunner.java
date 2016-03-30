package org.muml.psm.allocation.algorithm.qvto;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.m2m.qvt.oml.ModelExtent;

/**
 * Executes a QVTo transformation with arbitrary many input
 * model extents and exactly one output model extent. For
 * running a transformation, instantiate this class and call
 * one of its runTransformation methods. Afterwards the
 * transformation result can be accessed via the getOutExtent
 * method.
 *
 */
public class QVToSingleOutExtentTransformationRunner extends QVToTransformationRunner {
	private static final String INV_OUT = "expected exactly one out extent";
	
	public QVToSingleOutExtentTransformationRunner(String transformationURI,
			Map<String, Object> configurationPropertyMap,
			String...inputObjectURIs) {
		super(transformationURI, configurationPropertyMap,
				createInOrOutObjectURIs(inputObjectURIs));
	}
	
	private static String[] createInOrOutObjectURIs(String[] inputObjectURIs) {
		String[] inOrOutputObjectURIs = new String[inputObjectURIs.length + 1];
		for (int i = 0; i < inputObjectURIs.length; i++) {
			inOrOutputObjectURIs[i] = inputObjectURIs[i];
		}
		// set the out extent
		inOrOutputObjectURIs[inputObjectURIs.length] = null;
		return inOrOutputObjectURIs;
	}
	
	public QVToSingleOutExtentTransformationRunner(String transformationURI,
			String... inputObjectURIs) {
		this(transformationURI, Collections.<String, Object>emptyMap(), inputObjectURIs);
	}
	
	public ModelExtent getOutExtent() {
		List<ModelExtent> modelExtents = getOutExtents();
		if (modelExtents.size() != 1) {
			throw new IllegalStateException(INV_OUT);
		}
		return modelExtents.get(0);
	}

}
