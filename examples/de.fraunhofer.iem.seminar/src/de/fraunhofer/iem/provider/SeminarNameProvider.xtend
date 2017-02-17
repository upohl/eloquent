package de.fraunhofer.iem.provider

import de.fraunhofer.iem.seminar.Student
import de.fraunhofer.iem.seminar.Topic
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.muml.psm.allocation.language.^as.NameProvider

/**
 * MUML-specific NameProvider. Currently, it only ComponentInstances
 * and ResourceInstances are supported.
 */
class SeminarNameProvider extends EObjectImpl implements NameProvider {
	
	private static final String unexpectedElement = "Unable to provide name for %s"
	
	override getName(Object element) {
		EcoreUtil.resolveAll((element as EObject).eResource)
		getNameFor(element)
	}
	
	def dispatch String getNameFor(Object element) {
		throw new IllegalArgumentException(
			String.format(unexpectedElement, element)
		)
	}
	
	def dispatch String getNameFor(Topic topic) {
		topic.name
	}
	
	
	def dispatch String getNameFor(Student student) {
		student.name
	}
	
	
	
	
}