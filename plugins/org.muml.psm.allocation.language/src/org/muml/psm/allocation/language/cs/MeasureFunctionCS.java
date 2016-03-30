/**
 */
package org.muml.psm.allocation.language.cs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Function CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the measure function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.MeasureFunctionCS#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getMeasureFunctionCS()
 * @model
 * @generated
 */
public interface MeasureFunctionCS extends ModelElementCS {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.muml.psm.allocation.language.cs.ServiceCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of services which are used as summands in the measure function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getMeasureFunctionCS_Services()
	 * @model
	 * @generated
	 */
	EList<ServiceCS> getServices();

} // MeasureFunctionCS
