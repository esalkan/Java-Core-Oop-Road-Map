package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * 
 * @author esalkan
 *
 */

public class Car {
	String model; // Default : Accessable in same package.
	public int year; // Public : Accessable from anywhere.
	private int door; // Private : Accessable inside the same class.
	protected double engine; // Protected : Acessable to all other classes in the same package.

}
