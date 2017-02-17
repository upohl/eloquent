package de.fraunhofer.iem.provider;

import de.fraunhofer.iem.seminar.Assignment;
import de.fraunhofer.iem.seminar.Seminar;
import de.fraunhofer.iem.seminar.SeminarFactory;
import de.fraunhofer.iem.seminar.Student;
import de.fraunhofer.iem.seminar.Topic;
import java.util.Arrays;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.muml.psm.allocation.language.as.StorageProvider;

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
@SuppressWarnings("all")
public class SeminarStorageProvider extends EObjectImpl implements StorageProvider {
  private final static String illegalContext = "Got an illegal context: %s";
  
  private final static String illegalPair = "Unable to store relation: %s to %s";
  
  private Seminar seminar;
  
  @Override
  public void initialize(final Object context) {
    if ((!(context instanceof Seminar))) {
      String _format = String.format(SeminarStorageProvider.illegalContext, context);
      throw new IllegalArgumentException(_format);
    }
    this.seminar = ((Seminar) context);
  }
  
  @Override
  public Object store(final Object source, final Object target) {
    return this.storePair(source, target);
  }
  
  protected Seminar _storePair(final Object source, final Object target) {
    String _format = String.format(SeminarStorageProvider.illegalPair, source, target);
    throw new IllegalArgumentException(_format);
  }
  
  protected Seminar _storePair(final Student source, final Topic target) {
    try {
      Seminar _xblockexpression = null;
      {
        final Assignment assignment = SeminarFactory.eINSTANCE.createAssignment();
        assignment.setStudent(source);
        assignment.setTopic(target);
        this.seminar.getAssignments().add(assignment);
        this.seminar.eResource().save(CollectionLiterals.<Object, Object>newHashMap());
        _xblockexpression = this.seminar;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public Object noRelationFound() {
    return this.seminar;
  }
  
  public Seminar storePair(final Object source, final Object target) {
    if (source instanceof Student
         && target instanceof Topic) {
      return _storePair((Student)source, (Topic)target);
    } else if (source != null
         && target != null) {
      return _storePair(source, target);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(source, target).toString());
    }
  }
}
