package oop.JOOP41_Abstraction;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Dog extends Animal {
	/**
	 * Dog class extends Animal Class; Animal class have abstract method().
	 * 
	 * Rule is : Who ever is extending from Parent Class, has to put the
	 * implementation is mandatory. That's why Dog Class Complain. Child class have
	 * to put implementation, this is mandatory. - - - - - - - - - - - - - - - - - -
	 * - - - - - - - - - - - - - - - - - -
	 * 
	 * ...::: Creating Concrete Class :::...
	 * 
	 * • A sub class (Child) of abstract class (Parent) is called concrete
	 * class(Sub/Child Class)
	 * 
	 * • A first concrete class (Sub/Child Class) must implement all inherited
	 * abstract methods
	 * 
	 * What is mean implement : Overrided
	 * 
	 * Rule is : You must to implement(@Override) abstract methods, about instance
	 * methods it is depend of the needs.
	 */

	@Override
	public void eat() {
		System.out.println("Dog is eating dog food");

	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");

	}

	// Can we add constructor in abstract class? (Ex. Animal) - Yes we can.
	// If we can not instantiate abstract class, how we can call the constructor?
	public Dog(String name) {
		super(name);
		/**
		 * The constructor of abstract class can be called from a subclass using super
		 * keyword.
		 */
	}

}
