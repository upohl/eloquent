package org.muml.psm.allocation.language.xtext.provider

import de.fraunhofer.iem.seminar.Assignment
import de.fraunhofer.iem.seminar.Seminar
import de.fraunhofer.iem.seminar.SeminarFactory
import de.fraunhofer.iem.seminar.Student
import de.fraunhofer.iem.seminar.Topic
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.psm.allocation.language.^as.StorageProvider

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
class SeminarStorageProvider extends EObjectImpl implements StorageProvider {
	
	private static final String illegalContext = "Got an illegal context: %s"
	private static final String illegalPair = "Unable to store relation: %s to %s"
	
	protected Seminar seminar
		 
	override void initialize(Object context) {
		if (!(context instanceof Seminar)) {
			throw new IllegalArgumentException(
				String.format(illegalContext, context)
			)
		}
		seminar = context as Seminar
	}
	
	override store(Object source, Object target) {
		storePair(source, target)
	}
	
	def dispatch Seminar storePair(Object source, Object target) {
		throw new IllegalArgumentException(
			String.format(illegalPair, source, target)
		)
	}
	
	def dispatch Seminar storePair(Student source, Topic target) {
		val Assignment assignment = SeminarFactory.eINSTANCE.createAssignment()
		assignment.student = source
		assignment.topic = target
		seminar.assignments.add(assignment)
	//	seminar.eResource.save(newHashMap())
		seminar
	}
	
	
	override noRelationFound() {
		// return empty systemAllocation instance (for now we just do
		// this in order to pass the algorithMain/nonexistentAllocation
		// testcase)
		seminar
	}
	
}