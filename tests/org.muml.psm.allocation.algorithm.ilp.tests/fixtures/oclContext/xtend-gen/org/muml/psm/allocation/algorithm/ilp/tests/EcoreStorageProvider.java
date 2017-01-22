package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Arrays;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.psm.allocation.language.as.StorageProvider;

@SuppressWarnings("all")
public class EcoreStorageProvider extends EObjectImpl implements StorageProvider {
  private final static String illegalPair = "Unable to store relation: %s to %s";
  
  private EPackage outputPackage;
  
  public EcoreStorageProvider() {
    EPackage _createEPackage = EcoreFactory.eINSTANCE.createEPackage();
    this.outputPackage = _createEPackage;
  }
  
  @Override
  public void initialize(final Object context) {
  }
  
  @Override
  public Object noRelationFound() {
    return null;
  }
  
  @Override
  public Object store(final Object source, final Object target) {
    return this.storePair(source, target);
  }
  
  protected EPackage _storePair(final Object source, final Object target) {
    String _format = String.format(EcoreStorageProvider.illegalPair, source, target);
    throw new IllegalArgumentException(_format);
  }
  
  protected EPackage _storePair(final EClassifier source, final EPackage target) {
    throw new RuntimeException("implement me, NOW!");
  }
  
  public EPackage storePair(final Object source, final Object target) {
    if (source instanceof EClassifier
         && target instanceof EPackage) {
      return _storePair((EClassifier)source, (EPackage)target);
    } else if (source != null
         && target != null) {
      return _storePair(source, target);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(source, target).toString());
    }
  }
}
