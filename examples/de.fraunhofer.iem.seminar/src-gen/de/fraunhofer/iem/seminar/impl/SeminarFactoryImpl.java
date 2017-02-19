/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminar.impl;

import de.fraunhofer.iem.seminar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeminarFactoryImpl extends EFactoryImpl implements SeminarFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SeminarFactory init()
  {
		try {
			SeminarFactory theSeminarFactory = (SeminarFactory)EPackage.Registry.INSTANCE.getEFactory(SeminarPackage.eNS_URI);
			if (theSeminarFactory != null) {
				return theSeminarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SeminarFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeminarFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case SeminarPackage.SEMINAR: return createSeminar();
			case SeminarPackage.SUPERVISOR: return createSupervisor();
			case SeminarPackage.STUDENT: return createStudent();
			case SeminarPackage.TOPIC: return createTopic();
			case SeminarPackage.PREFERENCE: return createPreference();
			case SeminarPackage.SUPERVISE: return createSupervise();
			case SeminarPackage.ASSIGNMENT: return createAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Seminar createSeminar()
  {
		SeminarImpl seminar = new SeminarImpl();
		return seminar;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Supervisor createSupervisor()
  {
		SupervisorImpl supervisor = new SupervisorImpl();
		return supervisor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Student createStudent()
  {
		StudentImpl student = new StudentImpl();
		return student;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Topic createTopic()
  {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Preference createPreference()
  {
		PreferenceImpl preference = new PreferenceImpl();
		return preference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Supervise createSupervise()
  {
		SuperviseImpl supervise = new SuperviseImpl();
		return supervise;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Assignment createAssignment()
  {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SeminarPackage getSeminarPackage()
  {
		return (SeminarPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SeminarPackage getPackage()
  {
		return SeminarPackage.eINSTANCE;
	}

} //SeminarFactoryImpl
