package de.fraunhofer.iem.provider

import de.fraunhofer.iem.seminar.Assignment
import de.fraunhofer.iem.seminar.Seminar
import de.fraunhofer.iem.seminar.SeminarFactory
import de.fraunhofer.iem.seminar.Student
import de.fraunhofer.iem.seminar.Topic
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory
import org.muml.psm.allocation.language.^as.StorageProvider

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
class SeminarStorageProvider extends EObjectImpl implements StorageProvider {
	
	private static final String illegalContext = "Got an illegal context: %s"
	private static final String illegalPair = "Unable to store relation: %s to %s"
	
	protected Seminar seminar
	protected EditingDomain editingDomain
		 
	override void initialize(Object context) {
		if (!(context instanceof Seminar)) {
			throw new IllegalArgumentException(
				String.format(illegalContext, context)
			)
		}
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(seminar)
			?: WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain
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
	//	val Command deleteCommand = DeleteCommand.create(editingDomain,seminar.assignments);
	//	editingDomain.getCommandStack().execute(deleteCommand);
		
		val Command addCommand = AddCommand.create(editingDomain, seminar, seminar.assignments ,assignment);
	//	seminar.assignments.add(assignment)
		editingDomain.getCommandStack().execute(addCommand);
	//	val serializer = Guice.createInjector(new SeminarRuntimeModule()).getInstance(Serializer);
	// val String dsl = serializer.serialize(seminar);
		seminar.eResource.save(newHashMap())
		seminar
	}
	
	
	override noRelationFound() {
		// return empty systemAllocation instance (for now we just do
		// this in order to pass the algorithMain/nonexistentAllocation
		// testcase)
		seminar
	}
	
}
