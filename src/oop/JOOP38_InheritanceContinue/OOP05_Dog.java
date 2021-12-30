package oop.JOOP38_InheritanceContinue;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */

// _05_Dog is-a relationship with _04_Animal 
public class OOP05_Dog extends OOP04_Animal {

	// Instance Variables
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	// _05_Dog Constructor with parameter
	public OOP05_Dog(int eyes, int legs, int tail, int teeth, String coat) {
		// This is calling superclass _04_Animal and use constructor create an animal
		super("Arwen", 1, 1, 8, 20);
		// Theese are instance variables
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	// Just a method
	public void chew() {
		System.out.println("Dog.chew() is called");
	}

	@Override
	// Override the method from _04_Animal Class which is created before
	public void eat() {
		System.out.println("Dog.eat() called");
		// This call _05_Dog Class Method
		chew();
		// This call _04_Animal Class Method
		super.eat();
	}

	@Override
	// Override the method from _04_Animal Class which is created before
	public void move(int speed) {
		System.out.println("Dog.move() called");
		// This Call _04_Animal Class Method
		super.move(speed);
	}
	
	
}
