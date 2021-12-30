package oop.JOOP41_Abstraction;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
// RULE ...: If any abstract class "public abstract class Sparrow" extending
// another abstrat class "extends Animal", this is optional implement(@Override)
// abstract methods from extended class...
public class Parrot extends Bird {

	// Can we add constructor in abstract class? (Ex. Animal) - Yes we can.
	// If we can not instantiate abstract class, how we can call the constructor?
	public Parrot(String name) {
		super(name);
		/**
		 * The constructor of abstract class can be called from a subclass using super
		 * keyword.
		 */
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	// What method has an access?
	// All of them from Bird and Animal Class because (extends) there is inheritance

}
