package org.muml.psm.allocation.algorithm.ui

class GenericCreateASLFileHandler extends AbstractCreateASLFileHandler {
	
	override protected getTemplate(String name) {
		'''
		«name» {
			import 'http://www.eclipse.org/emf/2002/Ecore'
			
			nameProvider 'org.muml.psm.allocation.language.xtext.provider.EcoreNameProvider'
			storageProvider 'org.muml.psm.allocation.language.xtext.provider.StdoutStorageProvider' 
			
			oclContext ecore::EPackage
			
		}
		'''
	}
	
}