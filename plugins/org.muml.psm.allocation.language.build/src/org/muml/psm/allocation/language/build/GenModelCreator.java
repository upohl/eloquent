package org.muml.psm.allocation.language.build;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class GenModelCreator extends AbstractWorkflowComponent {
	private Logger log = Logger.getLogger(getClass());
	
	/**
	 * Represents the genmodel's base package
	 */
	private String basePackage;
	
	/**
	 * The URI to the ecore file.
	 */
	private String modelURI;
	
	/**
	 * The URI of the to be generated genmodel file.
	 */
	private String genModelURI;
	
	/**
	 * List of used genmodel URIs
	 */
	private List<String> usedGenModelURIs = new ArrayList<String>();
	
	/**
	 * Path to the to be generated as model code
	 */
	private String modelDirectory;
	
	/**
	 * The resource set.
	 */
	private ResourceSet resourceSet;
	
	/**
	 * The plugin id of the generated model code
	 */
	private String pluginID;
	
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
	
	public void setModelURI(String modelURI) {
		this.modelURI = modelURI;
	}
	
	public void setGenModelURI(String genModelURI) {
		this.genModelURI = genModelURI;
	}
	
	public void addUsedGenModelURI(String usedGenModelURI) {
		usedGenModelURIs.add(usedGenModelURI);
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	public void setModelDirectory(String modelDirectory) {
		this.modelDirectory = modelDirectory;
	}
	
	public void setPluginID(String pluginID) {
		this.pluginID = pluginID;
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (basePackage == null) {
			issues.addError("basePackage must not be null");
		}
		if (modelURI == null) {
			issues.addError("modelURI must not be null");
		}
		if (genModelURI == null) {
			issues.addError("genModelURI must not be null");
		}
		if (pluginID == null) {
			issues.addError("pluginID must not be null");
		}
		if (modelDirectory == null) {
			issues.addError("modelDirectory must not be null");
		}
		if (resourceSet == null) {
			issues.addError("resourceSet must not be null");
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		log.info("Generating GenModel using '" + modelURI + "'");
		Resource genModelResource = resourceSet.createResource(
				URI.createURI(genModelURI));
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		initializeGenModel(genModel);
		configureGenModel(genModel);
		genModel.reconcile();
		calculateUsedGenPackages(genModel);
		genModelResource.getContents().add(genModel);
		try {
			genModelResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void initializeGenModel(GenModel genModel) {
		Resource modelResource = resourceSet.getResource(
				URI.createURI(modelURI), false);
		EPackage root = (EPackage) modelResource.getContents().get(0);
		List<EPackage> packageList = new ArrayList<EPackage>();
		packageList.add(root);
		genModel.initialize(packageList);
		for (GenPackage genPackage : genModel.getGenPackages()) {
			genPackage.setBasePackage(basePackage);
		}
	}
	
	protected void configureGenModel(GenModel genModel) {
		genModel.setModelName(getModelName());
		genModel.setModelPluginID(pluginID);
		genModel.setModelDirectory(modelDirectory);
		genModel.setCanGenerate(true);
		genModel.setValidateModel(true);
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
	}
	
	protected String getModelName() {
		int idx = genModelURI.lastIndexOf('/');
		String filename = genModelURI.substring(idx + 1);
		return filename.replaceFirst("\\.genmodel$", "");
	}
	
	private void calculateUsedGenPackages(GenModel genModel) {
		Map<GenPackage, GenPackage> extToLocalMap = new HashMap<GenPackage, GenPackage>();
		for (GenPackage genPackage : genModel.getGenPackages()) {
			GenPackage extGenPackage = lookupExternalGenPackage(genPackage);
			if (extGenPackage != null) {
				extToLocalMap.put(extGenPackage, genPackage);
			}
		}
		genModel.getGenPackages().removeAll(extToLocalMap.values());
		genModel.getUsedGenPackages().addAll(extToLocalMap.keySet());
	}
	
	// override if another tie-breaking strategy is needed
	protected GenPackage lookupExternalGenPackage(GenPackage genPackage) {
		if (genPackage.getNSURI() == null) {
			return null;
		}
		for (String extGenModelURI : usedGenModelURIs) {
			URI uri = URI.createURI(extGenModelURI);
			// should we cache this/is it cached by the resourceSet?
			Resource resource = resourceSet.getResource(uri, true);
			TreeIterator<EObject> tit = resource.getAllContents();
			while (tit.hasNext()) {
				EObject object = tit.next();
				if (object instanceof GenPackage) {
					GenPackage extGenPackage = (GenPackage) object;
					if (extGenPackage.getNSURI() != null
							&& extGenPackage.getNSURI().equals(genPackage.getNSURI())) {
						return extGenPackage;
					}
				}
			}
		}
		return null;
	}

}
