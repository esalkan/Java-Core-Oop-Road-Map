package oop.JOOP41_Abstraction;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
// RULE ...: If any abstract class "public abstract class Sparrow" extending
// another abstrat class "extends Animal", this is optional implement(@Override)
// abstract methods from extended class...
public abstract class Bird extends Animal {

	// This bird class extends Animal class and it is first child class, and need to
	// implement all abstract methods from Animal Class
	// But :::... Parrot is extends Bird Class and, parrot class not need to
	// implement anything from Parent class.

	/*
	 * @Override
	 * 
	 * public void eat() { System.out.println("Bird eating bird food");}
	 */

	// Can we add constructor in abstract class? (Ex. Animal) - Yes we can.
	// If we can not instantiate abstract class, how we can call the constructor?
	public Bird(String name) {
		super(name);
		/**
		 * The constructor of abstract class can be called from a subclass using super
		 * keyword.
		 */
	}

	@Override
	public void breathe() {
		System.out.println("Bird breathing");

	}

	public abstract void fly();

}
