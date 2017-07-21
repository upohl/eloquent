package org.muml.eloquent.example.drwahnsinn.provider

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.muml.eloquent.example.drwahnsinn.DrWahnsinnGame
import org.muml.eloquent.example.drwahnsinn.DrwahnsinnFactory
import org.muml.eloquent.example.drwahnsinn.Position
import org.muml.eloquent.example.drwahnsinn.RelationCollection
import org.muml.eloquent.example.drwahnsinn.Tile
import org.muml.eloquent.example.drwahnsinn.TileRelation
import org.muml.psm.allocation.language.^as.StorageProvider

class DrWahnsinnStorageProvider extends EObjectImpl implements StorageProvider {
	
	private final RelationCollection collection = DrwahnsinnFactory.eINSTANCE.createRelationCollection
	private final Resource resource = createResource
	
	def private static createResource() {
		val URI uri = URI.createURI("platform:/resource/drwahnsinn/game.drwahnsinn_solution")
		val ResourceSet resSet = new ResourceSetImpl()
		resSet.createResource(uri)
	}
	
	override initialize(Object context) {
		println("init")
		collection.game = context as DrWahnsinnGame
		resource.contents.add(collection)
	}
	
	override noRelationFound() {
		println("no relation found")
	}
	
	override store(Object source, Object target) {
		storeRelation(source, target)
		null
	}
	
	def dispatch storeRelation(Object source, Object target) {
		throw new IllegalArgumentException("expected Tile + Position")
	}
	
	def dispatch storeRelation(Tile tile, Position position) {
		println("store relation")
		val tileRelation = getOrCreateTileRelation(tile)
		tileRelation.tile = tile
		tileRelation.positions.add(position)
		// arghs... to many save operations => we should probably rework
		// the StorageProvider interface a bit
		resource.save(emptyMap)
	}
	
	def TileRelation getOrCreateTileRelation(Tile tile) {
		for (TileRelation tileRelation : collection.tileRelations) {
			if (tileRelation.tile == tile) {
				return tileRelation
			}
		}
		val tileRelation = DrwahnsinnFactory.eINSTANCE.createTileRelation
		collection.tileRelations.add(tileRelation)
		tileRelation
	}
	
}