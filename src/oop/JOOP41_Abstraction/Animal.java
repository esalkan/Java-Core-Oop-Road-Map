package oop.JOOP41_Abstraction;

/**
 * @author esalkan
 *
 */
// abstract keyword is assign to class this is abstract class
public abstract class Animal {

	/**
	 * NOTES : Abstract Class can have "abstract methods" and "instance methods"
	 * Regual Class can not have "abstract methods"
	 * 
	 */

	// Can you add instance or static variables into abstract class?
	// - Yes we can have instance variables in abstract class
	String name;
	static int id; // etc...
	// - Variables CAN'T be abstract
	// abstract int id; //Error

	public Animal() {

	}

	// Can we add constructor in abstract class?
	// - Yes we can.
	public Animal(String name) {

	}

	public abstract void eat(); // Abstract Method. (No Body Method because there is no {})

	// Creating an Abstract Method Here.
	public abstract void breathe();

	// Creating an instance method here.
	public void move() {
		System.out.println("Moving");
	}

	// Can you add instance or static init block?
	// - Yes we can
	{
		// init block
	}

	static {
		// static block
	}

	// Can an abstract class extend another abstract class?
	// - Yes it can
	//
	// public abstract class Animal{}
	// public abstract class Bird extends Animal{}

	// -----o-----o-----o-----o-----o-----o-----o-----o-----o-----

	// Can an abstract class extend another non-abstract class?
	// - Yes it can
	//
	// public class A{}
	// public abstract class B extends A{}

	// -----o-----o-----o-----o-----o-----o-----o-----o-----o-----

	// Can a class extends multiple abstract classes?
	// - No it can not (As a class can not extends multiple classes, same for
	// abstract classes too)
	//
	// public abstract class A{}
	// public abstract class B{}
	//
	// public class C extends A,B{} //Error

	// Can we add static method into abstract class?
	// - yes we can
	public static void methodX() {
		// This is a static method in ABSTRACT CLASS
	}

	// Can a method be abstract and final in abstract class?
	// - No it can not

	// public abstract final void navigate(String url); // Error
	// public abstract void displayWebpage();
	// public final void displayWebpage2() {
	// We can not override this method.
	// }

	// Can abstract method be protected, private, and default?
	// - private: no
	// - default: yes
	// - protected: yes

	// When an abstract class extends another abstract class, does it require to
	// override/implement abstract methods from parent?
	// - No it does not require
	// - First concrete sub class is required to implement all abstract methods

}
