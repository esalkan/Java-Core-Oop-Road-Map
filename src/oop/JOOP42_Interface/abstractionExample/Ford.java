package oop.JOOP42_Interface.abstractionExample;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Ford extends ElectricCar {

	private int year;

	public Ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;
	}

	// First Concreate Class Must implement all abstract methods.
	@Override
	public void start() {
		System.out.println("Ford - Push start button to start...");
	}

	@Override
	public void charge() {
		System.out.println("Ford - Plugin to electric outlet...");
	}

	@Override
	public void drive() {
		System.out.println("Ford - is driving...");

	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

}
