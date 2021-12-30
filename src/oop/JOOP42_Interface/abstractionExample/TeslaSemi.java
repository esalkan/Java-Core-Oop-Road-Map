package oop.JOOP42_Interface.abstractionExample;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TeslaSemi extends ElectricTruck { // This is our first level concreate class.

	private double engineSize;

	// We must create our constructor.
	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color); // This line coming from ElectricTruck Class.
		this.engineSize = engineSize;
	}

	// Now we must to implement JUST ALL ABSTRACT methods. not others. 
	@Override // Super implemation from ElectricTruck Class
	public void load(String item) {
		System.out.println("TeslaSemi - Load " + item + " by lowering the truck and opening door...");
	}

	@Override // Super implemation from ElectricCar Class
	public void start() {
		System.out.println("TeslaSemi - Start truck by pressing a button...");
	}

	@Override // Super implemation from ElectricCar Class
	public void charge() {
		System.out.println("TeslaSemi - Pugin charge for 30 mins...");
	}

	@Override // Super implemation from ElectricCar Class
	public void drive() {
		System.out.println("TeslaSemi -  Truck is driving with load...");
	}

	/**
	 * @return the engineSize
	 * We have and private instance variable and we create a getter.
	 */
	public double getEngineSize() {
		return engineSize;
	}

}
