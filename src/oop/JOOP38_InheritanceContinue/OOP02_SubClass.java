package oop.JOOP38_InheritanceContinue;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */

// This is subclass is a relationship with _01_SuperClass
public class OOP02_SubClass extends OOP01_SuperClass {
	/**
	 * In an inheritance relationship, the superclass constructor always executes
	 * before the subclass constructor.
	 */
	
	// Creating a Constructor with no parameter
	public OOP02_SubClass() {
		System.out.println("This is the subclass constructor");
	}
}
