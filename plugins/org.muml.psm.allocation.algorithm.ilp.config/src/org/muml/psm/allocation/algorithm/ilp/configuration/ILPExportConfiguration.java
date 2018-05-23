/**
 */
package org.muml.psm.allocation.algorithm.ilp.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILP Export Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getExportFilename <em>Export Filename</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getIlpConfiguration <em>Ilp Configuration</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage#getILPExportConfiguration()
 * @model
 * @generated
 */
public interface ILPExportConfiguration<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Export Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Filename</em>' attribute.
	 * @see #setExportFilename(String)
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage#getILPExportConfiguration_ExportFilename()
	 * @model required="true"
	 * @generated
	 */
	String getExportFilename();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getExportFilename <em>Export Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Filename</em>' attribute.
	 * @see #getExportFilename()
	 * @generated
	 */
	void setExportFilename(String value);

	/**
	 * Returns the value of the '<em><b>Ilp Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ilp Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ilp Configuration</em>' containment reference.
	 * @see #setIlpConfiguration(Object)
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage#getILPExportConfiguration_IlpConfiguration()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getIlpConfiguration();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration#getIlpConfiguration <em>Ilp Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ilp Configuration</em>' containment reference.
	 * @see #getIlpConfiguration()
	 * @generated
	 */
	void setIlpConfiguration(T value);

} // ILPExportConfiguration
