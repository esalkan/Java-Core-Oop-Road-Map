package oop.JOOP39_Inheritance_AccessModifiers;

/**
 * @author esalkan
 *
 */
public class OOP02_Car extends OOP01_Vehicle {
	// Parent Constructor Always Run BEFORE Child Constructor there is a keyword it
	// name is super(); it is included to default constructor inside which is we not
	// see when we create a class

	// INHERITANCE:
	// -> One class inherits the features(fields and methods) of another class. -
	// (Bir sınıf, başka bir sınıfın özelliklerini (alanlarını ve yöntemlerini)
	// devralır.)

	// -> The Subclass can add its own fields and methods in addition to the
	// superclass fields and methods. - (Alt sınıf, üst sınıf alanlarına ve
	// yöntemlerine ek olarak kendi alanlarını ve yöntemlerini ekleyebilir.)

	// -> The keyword used for inheritance is extends - (Kalıtım için kullanılan
	// anahtar kelime, extension)

	// -> Constructors and private variables and private methods are can not
	// inherited - (Yapıcılar miras alınmaz) - Just getters and Setters can
	// accessable

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	// -> super() keyword is used to call parent class constructor.
	// -> If subclass does not call a superclass constructor, java will
	// automatically call the superclass's default constructor.
	// -> if parent class only has constructor with parameters, then child
	// constructor MUST make a matching super(params) calls
	// -> super() needs to be the first statement in the constructor.

	// public _02_Car() {
	// super();
	// }

	public OOP02_Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
		// This super(name, size) is coming from parent class. when we create an object
		// we need to assign the values. This is go from child class to parent class
		// constructor which is taken 2 parameters. it can be super() and it will go
		// directly default which is default not seen constructor. if we create it will
		// go to no parameter. It is automaticly added if we create the constructor with
		// short-cut
		super(name, size); // These values need to added and assigned in constuctor parameters
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	// Creating specific method belongs the this child class
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVeloctiy():Veloctiy " + speed + " direction " + direction);
		super.move(speed, direction);
	}

	// This is Annotation (Not, Dip Not)
	@Override 
	// Overriding: Declaring a method in subclass which is already present in the
	// parent class
	// -> There must be a IS-A relationship
	// -> Method must have same name and same parameters in parent class
	// -> Access modifiers should be same or more visible
	// -> Return type must be same or covariant type
	public void move(int velocity, int direction) {
		setCurrentVelocity(velocity + 10);
		setCurrentDriection(direction + 10);
		System.out.println(
				"Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDriection());
	}
}
