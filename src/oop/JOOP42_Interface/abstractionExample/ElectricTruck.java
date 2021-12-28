package oop.JOOP42_Interface.abstractionExample;

/**
 * @author esalkan
 *
 */

// When an abstract class extends another abstract class not required to override/implement abstract methods from parent. 
// JUST; First concreate sub class is required to implement all abstract methods.
public abstract class ElectricTruck extends ElectricCar {

	// Implicit super constructor ElectricCar() is undefined for default
	// constructor. Must define an explicit constructo and we add the constructor.
	public ElectricTruck(String model, double price, String color) {
		super(model, price, color); // This is coming from ElectricCar Class.

	}
	
	// Creating an abstract method.
	public abstract void load(String item);

}
