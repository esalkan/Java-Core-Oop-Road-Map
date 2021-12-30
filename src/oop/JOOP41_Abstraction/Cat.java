package oop.JOOP41_Abstraction;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Cat extends Animal {

	// Can we add constructor in abstract class? (Ex. Animal) - Yes we can.
	// If we can not instantiate abstract class, how we can call the constructor?
	public Cat(String name) {
		super(name);
		/**
		 * The constructor of abstract class can be called from a subclass using super
		 * keyword.
		 */
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating cat food.");

	}

	@Override
	public void breathe() {
		System.out.println("Cat is breathing.");

	}

}
