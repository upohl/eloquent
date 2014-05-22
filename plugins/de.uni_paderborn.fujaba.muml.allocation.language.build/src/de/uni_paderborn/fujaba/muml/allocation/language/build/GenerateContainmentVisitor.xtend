package de.uni_paderborn.fujaba.muml.allocation.language.build

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.mwe.core.issues.Issues

// TODO: also set attributes (minor feature)
// code needs a bit more love and comments

class GenerateContainmentVisitor extends GenerateVisitor {
	
	/**
	 * The uri to the cs genmodel
	 */
	private String csGenModelURI
	
	/**
	 * The uri to the as genmodel
	 */
	private String asGenModelURI
	
	/**
	 * The resource set
	 */
	private ResourceSet resourceSet
	
	def public void setCsGenModelURI(String csGenModelURI) {
		this.csGenModelURI = csGenModelURI
	}
	
	def public void setAsGenModelURI(String asGenModelURI) {
		this.asGenModelURI = asGenModelURI
	}
	
	def public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	override checkConfiguration(Issues issues) {
		super.checkConfiguration(issues)
		if (csGenModelURI == null) {
			issues.addError("csGenModelURI must not be null")
		}
		if (asGenModelURI == null) {
			issues.addError("asGenModelURI must not be null")
		}
		if (resourceSet == null) {
			issues.addError("resourceSet must not be null")
		}
	}
	
	override String generateImports() {
		'''
		import org.eclipse.jdt.annotation.NonNull;
		import org.eclipse.jdt.annotation.Nullable;
		import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
		import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
		«super.generateImports»
		'''
	}
	
	def private GenModel loadGenModel(String genModelURI) {
		val Resource resource = resourceSet.getResource(URI.createURI(genModelURI),
			true)
		resource.contents.get(0) as GenModel
	}
	
	private GenModel csGenModel;
	private GenModel asGenModel;
	
	override protected String generateMethods() {
		csGenModel = loadGenModel(csGenModelURI)
		asGenModel = loadGenModel(asGenModelURI)
		'''
		«FOR genClass : csGenModel.genPackages.get(0).genClasses»
				«genClass.generateMethod»
				
		«ENDFOR»
		'''
	}
	
	def protected String generateMethod(GenClass genClass) {
		val EClass eClass = genClass.ecoreClass
		'''
		@Override
		public @Nullable Continuation<?> visit«eClass.getName»(@NonNull «genClass.qualifiedInterfaceName» csElement) {
			«genClass.generatePivot»
			«genClass.generateFeatures»
			«IF !eClass.ESuperTypes.empty && eClass.ESuperTypes.get(0).eResource == eClass.eResource /* only call super methods for "our" classes */»
			return visit«csGenModel.findGenClass(eClass.ESuperTypes.get(0).name).name»(csElement);
			«ELSE»
			return null;
			«ENDIF»
		}
		'''
	}
	
	def protected String generatePivot(GenClass genClass) {
		val EClass eClass = genClass.ecoreClass
		'''
		«IF eClass.abstract»
		«eClass.qualifiedPivotName» «getPivotName()» = PivotUtil.getPivot(«eClass.qualifiedPivotName».class, csElement);
		«ELSE»
		«eClass.qualifiedPivotName» «getPivotName()» = context.refreshModelElement(«eClass.qualifiedPivotName».class, «asGenModel.findGenClass(eClass.pivotName).qualifiedClassifierAccessor», csElement);
		«ENDIF»
		'''
	}
	
	def protected String generateFeatures(GenClass genClass) {
		'''
		«FOR genFeature : genClass.genFeatures»
		«genFeature.generateFeature»
		«ENDFOR»
		'''
	}
	
	def protected String generateFeature(GenFeature genFeature) {
		if (genFeature.isReferenceType) genFeature.generateReferenceFeature
	}
	
	def protected String generateReferenceFeature(GenFeature genFeature) {
		val EReference ref = genFeature.ecoreFeature as EReference 
		if (ref.isMany) genFeature.generateManyReference else genFeature.generateSingleReference
	}
	
	def protected String generateManyReference(GenFeature genFeature) {
		//for («eClass.getFullyQualifiedName()» it : csElement.get«ref.name.toFirstUpper»()) {
		val GenClass genClass = csGenModel.findGenClass(genFeature.ecoreFeature.EType.name)
		'''
		for («genClass.qualifiedInterfaceName» it : csElement.«genFeature.getGetAccessor»()) {
			«getPivotName()».«genFeature.getSetterName»(
				PivotUtil.getPivot(«genClass.ecoreClass.qualifiedPivotName».class, it)
			);
		}
		'''
	}
	
	def protected String generateSingleReference(GenFeature genFeature) {
		val EClass eClass = genFeature.ecoreFeature.EType as EClass
		'''
		«getPivotName()».«genFeature.getSetterName»(
			PivotUtil.getPivot(«eClass.qualifiedPivotName».class, csElement.«genFeature.getGetAccessor»())
		);
		'''
	}
	
	def protected String getSetterName(GenFeature genFeature) {
		// XXX: assumption genFeature's ecoreFeature is an EReference
		val EReference ref = genFeature.ecoreFeature as EReference
		if (ref.isMany) '''«genFeature.getGetAccessor»().add''' else '''set«genFeature.getAccessorName»'''
	}
	
	def protected String getPivotName() {
		'pivotElement'
	}
		
	def protected GenClass getGenClass(EClass eClass) {
		val GenPackage genPackage = csGenModel.findGenPackage(eClass.EPackage)
		for (GenClass genClass : genPackage.genClasses) {
			if (genClass.ecoreClass == eClass) {
				return genClass
			}
		}
		// raise error?
	}
	
	def protected GenClass findGenClass(GenModel genModel, String className) {
		for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
			for (GenClass genClass : genPackage.genClasses) {
				if (genClass.ecoreClass.name.equals(className)) {
					return genClass
				}
			}
		}
		println("EPROR: " + className)
		null
	}
	
	def protected String getPivotName(EClass eClass) {
		val Map<String, String> cs2pivot = new HashMap<String, String>()
		cs2pivot.put("ModelElementCS", "Element")
		cs2pivot.put("NamedElementCS", "NamedElement")
		cs2pivot.put("ContextCS", "ExpressionInOCL")
		cs2pivot.get(eClass.name) ?: eClass.name.replaceAll("CS$", "")
	}
	
	def protected String getQualifiedPivotName(EClass eClass) {
		//println("OK: " + eClass.name + ", " + eClass.name.replaceAll("CS$", ""))
		// TODO: handle null (even though null should not occur...)
		asGenModel.findGenClass(eClass.getPivotName).qualifiedInterfaceName
		//'''«eClass.getGenClass().genPackage.basePackage».'''
	}
	
}