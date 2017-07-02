/**
 */
package org.muml.eloquent.example.drwahnsinn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tile Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.muml.eloquent.example.drwahnsinn.DrwahnsinnPackage#getTileType()
 * @model
 * @generated
 */
public enum TileType implements Enumerator {
	/**
	 * The '<em><b>TYPE 3x2x2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_3X2X2_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_3X2X2(0, "TYPE_3x2x2", "TYPE_3x2x2"),

	/**
	 * The '<em><b>TYPE 4x2x1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_4X2X1_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_4X2X1(1, "TYPE_4x2x1", "TYPE_4x2x1"),

	/**
	 * The '<em><b>TYPE 1x1x1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_1X1X1_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_1X1X1(2, "TYPE_1x1x1", "TYPE_1x1x1");

	/**
	 * The '<em><b>TYPE 3x2x2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TYPE 3x2x2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_3X2X2
	 * @model name="TYPE_3x2x2"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_3X2X2_VALUE = 0;

	/**
	 * The '<em><b>TYPE 4x2x1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TYPE 4x2x1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_4X2X1
	 * @model name="TYPE_4x2x1"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_4X2X1_VALUE = 1;

	/**
	 * The '<em><b>TYPE 1x1x1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TYPE 1x1x1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_1X1X1
	 * @model name="TYPE_1x1x1"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_1X1X1_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TileType[] VALUES_ARRAY =
		new TileType[] {
			TYPE_3X2X2,
			TYPE_4X2X1,
			TYPE_1X1X1,
		};

	/**
	 * A public read-only list of all the '<em><b>Tile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TileType get(int value) {
		switch (value) {
			case TYPE_3X2X2_VALUE: return TYPE_3X2X2;
			case TYPE_4X2X1_VALUE: return TYPE_4X2X1;
			case TYPE_1X1X1_VALUE: return TYPE_1X1X1;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TileType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TileType
