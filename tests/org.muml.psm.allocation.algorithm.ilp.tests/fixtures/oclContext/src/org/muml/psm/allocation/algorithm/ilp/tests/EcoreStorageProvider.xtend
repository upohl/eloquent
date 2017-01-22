package org.muml.psm.allocation.algorithm.ilp.tests

import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.psm.allocation.language.^as.StorageProvider
import org.eclipse.emf.ecore.EcoreFactory

class EcoreStorageProvider extends EObjectImpl implements StorageProvider {
	
	private static final String illegalPair = "Unable to store relation: %s to %s"
	
	private EPackage outputPackage
	
	new() {
		outputPackage = EcoreFactory.eINSTANCE.createEPackage()	
	}
	
	override initialize(Object context) {
		// do nothing for now
	}
	
	override noRelationFound() {
		// return nothing for now
		null
	}
	
	override store(Object source, Object target) {
		storePair(source, target)
	}
	
	def dispatch EPackage storePair(Object source, Object target) {
		throw new IllegalArgumentException(
			String.format(illegalPair, source, target)
		)
	}
	
	def dispatch EPackage storePair(EClassifier source, EPackage target) {
		// note that this manipulates "context" model (but we don't care,
		// since it is not saved)... arghs... implement me later
		throw new RuntimeException("implement me, NOW!")
		//outputPackage
	}
	
}