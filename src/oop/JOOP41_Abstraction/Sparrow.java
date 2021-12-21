package oop.JOOP41_Abstraction;

/**
 * @author esalkan
 *
 */
public abstract class Sparrow extends Bird {

	// Can we add constructor in abstract class? (Ex. Animal) - Yes we can.
	// If we can not instantiate abstract class, how we can call the constructor?
	public Sparrow(String name) {
		super(name);
		/**
		 * The constructor of abstract class can be called from a subclass using super
		 * keyword.
		 */
	}
	// RULE ...: If any abstract class "public abstract class Sparrow" extending
	// another abstrat class "extends Animal", this is optional implement(@Override)
	// abstract methods from extended class...

	/**
	 * Animal class is an ABSTRACT CLASS and Sparrow class is an ABSTRACT CLASS too.
	 */

}
