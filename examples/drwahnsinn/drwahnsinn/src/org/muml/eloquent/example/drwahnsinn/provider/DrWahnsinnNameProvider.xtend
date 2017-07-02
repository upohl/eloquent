package org.muml.eloquent.example.drwahnsinn.provider

import java.util.Map
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.eloquent.example.drwahnsinn.Position
import org.muml.eloquent.example.drwahnsinn.Tile
import org.muml.psm.allocation.language.^as.NameProvider

class DrWahnsinnNameProvider extends EObjectImpl implements NameProvider {
	
	private final Map<Tile, String> tile2NameMap = <Tile, String>newHashMap()
	private int tieBreaker = 0;
	
	override getName(Object element) {
		getNameFor(element)
	}
	
	def dispatch String getNameFor(Object object) {
		throw new IllegalArgumentException("unexpected object: " + object)
	}
	
	def dispatch String getNameFor(Position position) {
		'''pos_«position.x»_«position.y»_«position.z»'''
	}
	
	def dispatch String getNameFor(Tile tile) {
		var name = tile2NameMap.get(tile)
		if (name == null) {
			name = '''tile«tieBreaker»_«tile.type»'''
			tile2NameMap.put(tile, name)
			tieBreaker++;
		}
		name
	}
	
}