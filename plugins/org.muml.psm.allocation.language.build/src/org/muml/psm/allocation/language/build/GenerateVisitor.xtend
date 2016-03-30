package org.muml.psm.allocation.language.build

import java.io.FileWriter
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import java.io.File

class GenerateVisitor extends AbstractWorkflowComponent {
	private Logger log = Logger.getLogger(getClass())
	
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
	
	override checkConfiguration(Issues issues) {
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
	}
	
	override protected invokeInternal(WorkflowContext arg0, ProgressMonitor arg1, Issues arg2) {
		writeClassFile
	}
	
	def writeClassFile() {
		val File file = new File(calculateFilename)
		val File directory = file.parentFile
		if (!directory.isDirectory) {
			directory.mkdirs
		}
		val FileWriter fileWriter = new FileWriter(file)
		log.info('''Generating visitor: «file.path»''')
		// this not really clever... in a perfect world we would
		// write after each template was called
		fileWriter.write(generateClass) // we do not care about IOExceptions...
		fileWriter.close
	}
		
	def protected String calculateFilename() {
		// this is ugly and insane...
		val URI filenameURI = URI.createURI(filename)
		val String projectName = filenameURI.segment(1)
		val URI projectURI = EcorePlugin.getPlatformResourceMap().get(projectName)
		val URI relativeURI = filenameURI.deresolve(URI.createURI("platform:/resource/" + projectName + "/", true))
		relativeURI.resolve(projectURI).toFileString
	}
	
	def protected String generateClass() {
		'''
		package «packageName»;
		«generateImports»
		
		// generated code: do NOT edit (file is overwritten on regeneration)
		
		public class «className»«IF fqBaseClassName != null» extends «fqBaseClassName»«ENDIF» {
			«generateConstructor»
			
			«generateMethods»
		}
		'''
	}
	
	def protected String generateImports() {
		'''
		import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
		'''
	}
	
	def protected String generateConstructor() {
		'''
		public «className»(CS2ASConversion context) {
			super(context);
		}
		'''
	}
	
	def protected String generateMethods() {
		'// no methods have been generated'
	}
	
}