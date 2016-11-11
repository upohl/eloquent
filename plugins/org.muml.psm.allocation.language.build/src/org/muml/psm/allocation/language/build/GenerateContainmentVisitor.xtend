package org.muml.psm.allocation.language.build

import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.mwe.core.issues.Issues

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
	
	/**
	 * If a class name appears in this list, the generated visitor
	 * calls the "primary" superclass' visitor and returns the value
	 * of this call. It is only necessary to add the names of classes
	 * that have an "external" primary super class (that is the super class
	 * is not contained in the csModel (for contained classes, the super call
	 * is always generated)).
	 */
	private List<String> primarySuperCallWhitelist = <String>newArrayList()
	
	/**
	 * Names of features for which no code should be generated.
	 * Note: a feature is simply specified by name (simple name, no fqn) (yes... ambiguous)
	 * Note2: this is a gross hack...
	 */
	private List<String> skipFeatures = <String>newArrayList()
	
	def public void setCsGenModelURI(String csGenModelURI) {
		this.csGenModelURI = csGenModelURI
	}
	
	def public void setAsGenModelURI(String asGenModelURI) {
		this.asGenModelURI = asGenModelURI
	}
	
	def public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet
	}
	
	def public void addgeneratePrimarySuperCallFor(String className) {
		primarySuperCallWhitelist.add(className)
	}
	
	def public void addskipFeatures(String featureName) {
		skipFeatures.add(featureName)
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
		import org.eclipse.ocl.xtext.base.cs2as.Continuation;
		import org.eclipse.ocl.pivot.utilities.PivotUtil;
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
			«IF genClass.ecoreClass.EAllSuperTypes.exists[superType | superType.name.equals("VisitableCS")]»
				«genClass.generateMethod»
			«ENDIF»
		«ENDFOR»
		'''
	}
	
	def protected String generateMethod(GenClass genClass) {
		val EClass eClass = genClass.ecoreClass
		'''
		@Override
		public @Nullable Continuation<?> visit«eClass.getName»(«genClass.genPackage.qualifiedPackageName».@NonNull «genClass.interfaceName» csElement) {
			«genClass.generatePivot»
			«genClass.generateFeatures»
			«eClass.generateSecondarySuperCalls»
			«IF eClass.primarySuperCallAllowed»
			return «eClass.primarySuperClass.name.generateVisitorCall»;
			«ELSE»
			return null;
			«ENDIF»
		}
		'''
	}
	
	def private String generateVisitorCall(String visitorClassName) {
		'''visit«csGenModel.findGenClass(visitorClassName).name»(csElement)'''
	}
	
	def private String generateSecondarySuperCalls(EClass eClass) {
		'''
		«FOR EClass cls : eClass.ESuperTypes.filter[superClass | eClass.secondarySuperCallAllowed(superClass)]»
		«cls.name.generateVisitorCall»;
		«ENDFOR»
		'''
	}
	
	def private boolean secondarySuperCallAllowed(EClass eClass, EClass superClass) {
		eClass.primarySuperClass != superClass && eClass.sameResource(superClass)
	} 
	
	def private boolean primarySuperCallAllowed(EClass eClass) {
		val EClass primarySuperClass = eClass.getPrimarySuperClass
		primarySuperClass != null
			&& (eClass.sameResource(primarySuperClass) || primarySuperCallWhitelist.contains(eClass.name))
	}
	
	def private boolean sameResource(EClass first, EClass second) {
		first.eResource == second.eResource
	} 
	
	def private EClass getPrimarySuperClass(EClass eClass) {
		eClass.ESuperTypes.head
	}
	
	def protected String generatePivot(GenClass genClass) {
		val EClass eClass = genClass.ecoreClass
		'''
		«eClass.qualifiedPivotName» «getPivotName()» = PivotUtil.getPivot(«eClass.qualifiedPivotName».class, csElement);
		«IF !eClass.abstract»
		if («getPivotName()» == null) {
			«IF eClass.EAllSuperTypes.exists[superClass | superClass.name.equals("NamedElementCS")]»
			«getPivotName()» = refreshNamedElement(«eClass.qualifiedPivotName».class, «asGenModel.findGenClass(eClass.pivotName).qualifiedClassifierAccessor», csElement);
			«ELSE»
			«getPivotName()» = context.refreshModelElement(«eClass.qualifiedPivotName».class, «asGenModel.findGenClass(eClass.pivotName).qualifiedClassifierAccessor», csElement);
			«ENDIF»
		}
		«ENDIF»
		'''
	}
	
	def protected String generateFeatures(GenClass genClass) {
		'''
		«FOR genFeature : genClass.genFeatures»
		«IF !skipFeatures.contains(genFeature.ecoreFeature.name)»
		«genFeature.generateFeature»
		«ENDIF»
		«ENDFOR»
		'''
	}
	
	def protected String generateFeature(GenFeature genFeature) {
		if (genFeature.isReferenceType) {
			genFeature.generateReferenceFeature
		} else {
			genFeature.generateDataTypeFeature
		}
	}
	
	def protected String generateReferenceFeature(GenFeature genFeature) {
		if (genFeature.ecoreFeature.isMany) {
			genFeature.generateManyReferenceFeature
		} else {
			genFeature.generateSingleReferenceFeature
		}
	}
	
	def protected String generateManyReferenceFeature(GenFeature genFeature) {
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
	
	def protected String generateSingleReferenceFeature(GenFeature genFeature) {
		val EClass eClass = genFeature.ecoreFeature.EType as EClass
		'''
		«getPivotName()».«genFeature.getSetterName»(
			PivotUtil.getPivot(«eClass.qualifiedPivotName».class, csElement.«genFeature.getGetAccessor»())
		);
		'''
	}
	
	def protected String generateDataTypeFeature(GenFeature genFeature) {
		if (genFeature.isEnumType) {
			genFeature.generateEnumFeature
		} else {
			genFeature.generateAttributeFeature
		}
	}
	
	def protected String generateEnumFeature(GenFeature genFeature) {
		if (genFeature.ecoreFeature.isMany) {
			genFeature.generateManyEnumFeature
		} else {
			genFeature.generateSingleEnumFeature
		}
	}
	
	// TODO: integrate generate*EnumFeature into generate*ReferenceFeature?
	//       (they could share some code...)
	def protected String generateManyEnumFeature(GenFeature genFeature) {
		val GenEnum genEnum = csGenModel.findGenEnum(genFeature.ecoreFeature.EType.name)
		'''
		for («genEnum.qualifiedName» it : csElement.«genFeature.getGetAccessor»()) {
			«getPivotName()».«genFeature.getSetterName»(
				«genEnum.ecoreEnum.qualifiedPivotName».get(it.getValue())
			);
		}
		'''
	}
	
	def protected String generateSingleEnumFeature(GenFeature genFeature) {
		// we can use the getValue() approach here, because the cs and as enum
		// literal values are the same
		val EEnum eEnum = genFeature.ecoreFeature.EType as EEnum
		'''
		«getPivotName()».«genFeature.getSetterName»(
			«eEnum.qualifiedPivotName».get(csElement.«genFeature.getGetAccessor»().getValue())
		);
		'''
	}
	
	def protected String generateAttributeFeature(GenFeature genFeature) {
		// we don't need to call PivotUtil.getPivot for attributes
		// (its type remains the same)
		val String allSuffix = if (genFeature.ecoreFeature.isMany) 'All' else ''
		'''
		«getPivotName()».«genFeature.getSetterName»«allSuffix»(
			csElement.«genFeature.getGetAccessor»()
		);
		'''
	}
	
	def protected String getSetterName(GenFeature genFeature) {
		if (genFeature.ecoreFeature.isMany)
			'''«genFeature.getGetAccessor»().add'''
		else
			'''set«genFeature.getAccessorName»'''
	}
	
	def protected String getPivotName() {
		'pivotElement'
	}

	def protected GenClass findGenClass(GenModel genModel, String className) {
		for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
			for (GenClass genClass : genPackage.genClasses) {
				if (genClass.ecoreClass.name.equals(className)) {
					return genClass
				}
			}
		}
		throw new IllegalArgumentException(className + ": no GenClass found")
	}
	
	def protected GenEnum findGenEnum(GenModel genModel, String enumName) {
		for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
			for (GenEnum genEnum : genPackage.genEnums) {
				if (genEnum.ecoreEnum.name.equals(enumName)) {
					return genEnum
				}
			}
		}
		throw new IllegalArgumentException(enumName + ": no GenEnum found")
	}
	
	def protected String getPivotName(EClassifier eClassifier) {
		val Map<String, String> cs2pivot = new HashMap<String, String>()
		cs2pivot.put("ModelElementCS", "Element")
		cs2pivot.put("NamedElementCS", "NamedElement")
		cs2pivot.put("ContextCS", "ExpressionInOCL")
		cs2pivot.get(eClassifier.name) ?: eClassifier.name.replaceAll("CS$", "")
	}
	
	def protected dispatch String getQualifiedPivotName(EClassifier eClassifier) {
		val msg = "getQualifiedName called with unexpected eClassifier: "
			+ eClassifier
		throw new IllegalArgumentException(msg)
	}
	
	def protected dispatch String getQualifiedPivotName(EClass eClass) {
		asGenModel.findGenClass(eClass.getPivotName).qualifiedInterfaceName
	}
	
	def protected dispatch String getQualifiedPivotName(EEnum eEnum) {
		asGenModel.findGenEnum(eEnum.getPivotName).qualifiedName
	}
	
}