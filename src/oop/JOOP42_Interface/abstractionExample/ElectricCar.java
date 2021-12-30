package oop.JOOP42_Interface.abstractionExample;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public abstract class ElectricCar {
	// Creating instance variables
	private String model;
	private double price;
	private String color;
	
	// Creating Constructor
	public ElectricCar(String model, double price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	// Creating abstract methods
	public abstract void start(); // What TODO, instead of HOW TODO
	public abstract void charge();
	public abstract void drive();
	
	// Creating a regular method()
	void stop() {
		System.out.println("Electric car stopping by pushing the break...");
	}

	// Creating just GETTERS we will set them in the constructor.
	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	// Creating toString method for print 
	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	
	
	
}
