package oop.JOOP39_Inheritance_AccessModifiers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP01_Vehicle {
	/**
	 * - LOCAL VARIABLES: -> A variable defined within a block or method or
	 * constructor
	 * 
	 * -> Created when the block in entered or the method is called and destroyed
	 * after exiting from block, or when the call returns from method
	 * 
	 * -> Scope of these variables exists only within the block in which the
	 * variable is declared
	 * 
	 * -> Initializition is mandatory
	 */

	/**
	 * INSTANCE VARIABLES: -> Non-static variables and are declared in a class
	 * outside any method, constructor, or block
	 * 
	 * -> Created when an object of the class is created and destroyed when the
	 * object is destroyed
	 * 
	 * -> Unlike local variables, we may use access modifiers. If we do not specify
	 * any modifier then default access specifier will be used
	 * 
	 * -> Initialization is not mandatory.
	 * 
	 * -> Can be accessed only by creating objects
	 */

	/**
	 * STATIC VARIABLES: - > Also known as class variables.
	 * 
	 * -> Declared using the static keyword within a class outside any method,
	 * constructor or block.
	 * 
	 * -> We can ony have one copy of static variables per class
	 * 
	 * -> Created at the start of the program execution and destroyed automatically
	 * when execution ends
	 * 
	 * -> Initialization is not mandatory
	 * 
	 * -> We can access thru class name. className.staticVariable;
	 */

	// Encapsulation : Data Hiding, private variables, public getter and setter
	// methods.
	private String name; // these instance variables are private and need to create getter and setter
							// methods
	private int size;
	private int currentVelocity;
	private int currentDriection;

	/**
	 * CONSTRUCTOR:
	 * 
	 * -> Special method that initializes a created object.
	 * 
	 * -> neW keyword invoked the constructor.
	 * 
	 * -> Constructors does not have return type.
	 * 
	 * -> Constructors have the same name as the class.
	 * 
	 * -> If we do not define a constructor, compiler creates default
	 * constructor.(no argument)
	 * 
	 * -> We can overload constructors like methods (number of parameters,types of
	 * parameters,and order of parameters)
	 * 
	 * -> We can call one constructor from another constructor with this() keyword
	 */

	// Creating no parameter constructor
	public OOP01_Vehicle() {
		this("BMW", 3, 60, 50); // this() represents the calling the constructor
		// This is chaning. Chaning to 4 parameter constructor
	}

	// Creating 2 parameter constructor
	public OOP01_Vehicle(String name, int size) {
		this.name = name; // this. represents the current object
		this.size = size;
		this.currentVelocity = 0; // HardCoded assign value
		this.currentDriection = 0;
	}

	// 4 parameter constructor
	public OOP01_Vehicle(String name, int size, int currentVelocity, int currentDriection) {
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDriection = currentDriection;
	}

	// Creating a method accept 1 parameter
	public void steer(int direction) {
		this.currentDriection += direction;
		System.out.println("Vehicle.steer():Steering at " + currentDriection + " degrees.");
	}

	// Creating a method accept 2 parameter
	void move(int velocity, int direction) {
		this.currentDriection = direction;
		this.currentVelocity = velocity;
		System.out.println("Vehicle.moce():Moving at " + currentVelocity + " in direction " + currentDriection);
	}

	// Creating a Method without parameter
	public void stop() {
		this.currentVelocity = 0;
	}

	// Encapsulation getter
	public String getName() {
		return name;
	}

	// Encapsulation setter
	public void setName(String name) {
		this.name = name;
	}

	// Encapsulation getter
	public int getSize() {
		return size;
	}

	// Encapsulation setter
	public void setSize(int size) {
		this.size = size;
	}

	// Encapsulation getter
	public int getCurrentVelocity() {
		return currentVelocity;
	}

	// Encapsulation setter
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	// Encapsulation getter
	public int getCurrentDriection() {
		return currentDriection;
	}

	// Encapsulation setter
	public void setCurrentDriection(int currentDriection) {
		this.currentDriection = currentDriection;
	}
}
