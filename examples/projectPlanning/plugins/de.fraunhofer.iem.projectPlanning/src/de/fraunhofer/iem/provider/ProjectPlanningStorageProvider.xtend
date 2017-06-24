package de.fraunhofer.iem.provider

import de.fraunhofer.iem.projectPlanning.Assignment
import de.fraunhofer.iem.projectPlanning.Employee
import de.fraunhofer.iem.projectPlanning.Project
import de.fraunhofer.iem.projectPlanning.ProjectPlan
import de.fraunhofer.iem.projectPlanning.ProjectPlanningFactory
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.command.DeleteCommand
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory
import org.muml.psm.allocation.language.^as.StorageProvider

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
class ProjectPlanningStorageProvider extends EObjectImpl implements StorageProvider {
	
	private static final String illegalContext = "Got an illegal context: %s"
	private static final String illegalPair = "Unable to store relation: %s to %s"
	
	protected ProjectPlan projectPlan
	protected EditingDomain editingDomain
		 
	override void initialize(Object context) {
		if (!(context instanceof ProjectPlan)) {
			throw new IllegalArgumentException(
				String.format(illegalContext, context)
			)
		}
		projectPlan = context as ProjectPlan
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(projectPlan)
			?: WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain
		val Command deleteCommand = DeleteCommand.create(editingDomain,projectPlan.assignments);
 		editingDomain.getCommandStack().execute(deleteCommand);
 		projectPlan  = projectPlan as ProjectPlan
  	}
	
	override store(Object source, Object target) {
		storePair(source, target)
	}
	
	def dispatch ProjectPlan storePair(Object source, Object target) {
		throw new IllegalArgumentException(
			String.format(illegalPair, source, target)
		)
	}
	
	def dispatch ProjectPlan storePair(Project source, Employee target) {
		println("storePair: " + source.name + " -> " + target.name)
		println("editingDomain: " + AdapterFactoryEditingDomain.getEditingDomainFor(projectPlan))
		val Assignment assignment = ProjectPlanningFactory.eINSTANCE.createAssignment()
		assignment.employee = target
		assignment.project = source
	//	val Command deleteCommand = DeleteCommand.create(editingDomain,seminar.assignments);
	//	editingDomain.getCommandStack().execute(deleteCommand);
		
		val Command addCommand = AddCommand.create(editingDomain, projectPlan, projectPlan.assignments ,assignment);
	//	seminar.assignments.add(assignment)
		editingDomain.getCommandStack().execute(addCommand);
	//	val serializer = Guice.createInjector(new SeminarRuntimeModule()).getInstance(Serializer);
	// val String dsl = serializer.serialize(seminar);
		projectPlan.eResource.save(newHashMap())
		println("after save")
		projectPlan
	}
	
	
	override noRelationFound() {
		// return empty systemAllocation instance (for now we just do
		// this in order to pass the algorithMain/nonexistentAllocation
		// testcase)
		projectPlan
	}
	
}