package de.uni_paderborn.fujaba.muml.allocation.language.build

import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import java.util.Map
import java.util.HashMap
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature
import java.io.FileWriter
import java.io.File
import org.eclipse.emf.ecore.plugin.EcorePlugin

// TODO: also set attributes (minor feature)
// code needs a bit more love and comments

class GenerateContainmentVisitor extends AbstractWorkflowComponent {
	
	/**
	 * The uri to the cs genmodel
	 */
	private String csGenModelURI
	
	/**
	 * The uri to the as genmodel
	 */
	private String asGenModelURI
	
	/**
	 * The class name of the containment visitor
	 */
	 private String className
	 
	 /**
	  * The fully qualified name of the abstract containment visitor class
	  */
	 private String fqBaseClassName
	
	/**
	 * The qualified package name to which the generated visitor belongs to
	 */
	private String packageName
	
	/**
	 * The filename
	 */
	private String filename
	 
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
	
	def public void setClassName(String className) {
		this.className = className
	}
	
	def public void setFqBaseClassName(String fqBaseClassName) {
		this.fqBaseClassName = fqBaseClassName
	}
	
	def public void setPackageName(String packageName) {
		this.packageName = packageName
	}
	
	def public void setFilename(String filename) {
		this.filename = filename;
	}
	
	def public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	override checkConfiguration(Issues issues) {
		if (csGenModelURI == null) {
			issues.addError("csGenModelURI must not be null")
		}
		if (asGenModelURI == null) {
			issues.addError("asGenModelURI must not be null")
		}
		if (className == null) {
			issues.addError("className must not be null")
		}
		if (fqBaseClassName == null) {
			issues.addError("baseClassName must not be null")
		}
		if (packageName == null) {
			issues.addError("packageName must not be null")
		}
		if (filename == null) {
			issues.addError("filename must not be null")
		}
		if (resourceSet == null) {
			issues.addError("resourceSet must not be null")
		}
	}
	
	def private String calculateFilename() {
		// this is ugly and insane...
		val URI filenameURI = URI.createURI(filename)
		val String projectName = filenameURI.segment(1)
		val URI projectURI = EcorePlugin.getPlatformResourceMap().get(projectName)
		val URI relativeURI = filenameURI.deresolve(URI.createURI("platform:/resource/" + projectName + "/", true))
		relativeURI.resolve(projectURI).toFileString
	}
	
	override protected invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		val FileWriter fileWriter = new FileWriter(new File(calculateFilename))
		// this not really clever... in a perfect world we would
		// write after each template was called
		fileWriter.write(generateContainmentVisitor) // we do not care about IOExceptions...
		fileWriter.close()
	}
	
	def private GenModel loadGenModel(String genModelURI) {
		val Resource resource = resourceSet.getResource(URI.createURI(genModelURI),
			true)
		resource.contents.get(0) as GenModel
	}
	
	private GenModel csGenModel;
	private GenModel asGenModel;
	
	def protected String generateContainmentVisitor() {
		csGenModel = loadGenModel(csGenModelURI)
		asGenModel = loadGenModel(asGenModelURI)
		'''
		package «packageName»;
		«generateImports()»
		
		// generated code: do NOT edit (file is overwritten on regeneration)
		
		public class «className»«IF fqBaseClassName != null» extends «fqBaseClassName»«ENDIF» {
			«generateConstructor()»
			
			«FOR genClass : csGenModel.genPackages.get(0).genClasses»
				«genClass.generateMethod»
				
			«ENDFOR»
		}
		'''
	}
	
	def protected String generateImports() {
		'''
		import org.eclipse.jdt.annotation.NonNull;
		import org.eclipse.jdt.annotation.Nullable;
		import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
		import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
		import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
		'''
	}
	
	def protected String generateConstructor() {
		'''
		public «className»(CS2PivotConversion context) {
			super(context);
		}
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