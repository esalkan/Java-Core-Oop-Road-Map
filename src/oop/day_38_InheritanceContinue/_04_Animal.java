package oop.day_38_InheritanceContinue;

/**
 * @author esalkan
 *
 */

// Parent Class
public class _04_Animal {

	// Instance Variables
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;

	// Somewhere here there is default constructor with no parameter

	// Creating a Constructor with parameters
	public _04_Animal(String name, int brain, int body, int size, int weight) {

		// When create an object which parameters assigned, they will be assigned to
		// instance variables
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	// Just a Method - This can be Override from Sub Class (Child)
	public void eat() {
		System.out.println("Animal.eat() is called");
	}

	// Just a Method - This can be Override from Sub Class (Child)
	public void move(int speed) {
		System.out.println("Animal.move() called. Animal is moving at" + speed);
	}

	// Encapsulation - getName() - This is getting name from instance variables
	// when we create an object with parameter constructor, which is assigned to
	// name variable. it will return this value to us
	public String getName() {
		return name;
	}

	// Encapsulation - getBrain() - This is getting brain from instance variables
	// when we create an object with parameter constructor, which is assigned to
	// brain variable. it will return this value to us
	public int getBrain() {
		return brain;
	}

	// Encapsulation - getBody() - This is getting body from instance variables
	// when we create an object with parameter constructor, which is assigned to
	// body variable. it will return this value to us
	public int getBody() {
		return body;
	}

	// Encapsulation - getSize() - This is getting size from instance variables
	// when we create an object with parameter constructor, which is assigned to
	// size variable. it will return this value to us
	public int getSize() {
		return size;
	}

	// Encapsulation - getWeight() - This is getting weight from instance variables
	// when we create an object with parameter constructor, which is assigned to
	// weight variable. it will return this value to us
	public int getWeight() {
		return weight;
	}
}
