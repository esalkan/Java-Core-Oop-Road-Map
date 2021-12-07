package oop.day_38_InheritanceContinue;

/**
 * @author esalkan
 *
 */

// This is subclass is a relationship with _01_SuperClass
public class _02_SubClass extends _01_SuperClass {
	/**
	 * In an inheritance relationship, the superclass constructor always executes
	 * before the subclass constructor.
	 */
	
	// Creating a Constructor with no parameter
	public _02_SubClass() {
		System.out.println("This is the subclass constructor");
	}
}
