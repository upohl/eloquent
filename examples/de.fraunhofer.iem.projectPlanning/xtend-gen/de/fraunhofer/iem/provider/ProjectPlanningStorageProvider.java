package de.fraunhofer.iem.provider;

import de.fraunhofer.iem.projectPlanning.Assignment;
import de.fraunhofer.iem.projectPlanning.Employee;
import de.fraunhofer.iem.projectPlanning.Project;
import de.fraunhofer.iem.projectPlanning.ProjectPlan;
import de.fraunhofer.iem.projectPlanning.ProjectPlanningFactory;
import java.util.Arrays;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.muml.psm.allocation.language.as.StorageProvider;

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
@SuppressWarnings("all")
public class ProjectPlanningStorageProvider extends EObjectImpl implements StorageProvider {
  private final static String illegalContext = "Got an illegal context: %s";
  
  private final static String illegalPair = "Unable to store relation: %s to %s";
  
  protected ProjectPlan projectPlan;
  
  @Override
  public void initialize(final Object context) {
    if ((!(context instanceof ProjectPlan))) {
      String _format = String.format(ProjectPlanningStorageProvider.illegalContext, context);
      throw new IllegalArgumentException(_format);
    }
    this.projectPlan = ((ProjectPlan) context);
    final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(this.projectPlan);
    final Command deleteCommand = DeleteCommand.create(editingDomain, this.projectPlan.getAssignments());
    editingDomain.getCommandStack().execute(deleteCommand);
    this.projectPlan = ((ProjectPlan) this.projectPlan);
  }
  
  @Override
  public Object store(final Object source, final Object target) {
    return this.storePair(source, target);
  }
  
  protected ProjectPlan _storePair(final Object source, final Object target) {
    String _format = String.format(ProjectPlanningStorageProvider.illegalPair, source, target);
    throw new IllegalArgumentException(_format);
  }
  
  protected ProjectPlan _storePair(final Project source, final Employee target) {
    try {
      ProjectPlan _xblockexpression = null;
      {
        final Assignment assignment = ProjectPlanningFactory.eINSTANCE.createAssignment();
        final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(this.projectPlan);
        assignment.setEmployee(target);
        assignment.setProject(source);
        final Command addCommand = AddCommand.create(editingDomain, this.projectPlan, this.projectPlan.getAssignments(), assignment);
        editingDomain.getCommandStack().execute(addCommand);
        this.projectPlan.eResource().save(CollectionLiterals.<Object, Object>newHashMap());
        _xblockexpression = this.projectPlan;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public Object noRelationFound() {
    return this.projectPlan;
  }
  
  public ProjectPlan storePair(final Object source, final Object target) {
    if (source instanceof Project
         && target instanceof Employee) {
      return _storePair((Project)source, (Employee)target);
    } else if (source != null
         && target != null) {
      return _storePair(source, target);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(source, target).toString());
    }
  }
}
