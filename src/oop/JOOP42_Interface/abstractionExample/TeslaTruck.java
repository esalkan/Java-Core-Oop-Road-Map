package oop.JOOP42_Interface.abstractionExample;

/**
 * @author esalkan
 *
 */
public class TeslaTruck extends TeslaSemi { // This is our second level concreate class, and we NOT need implement
											// abstract methods. First level concreate class did it. if this our class
											// is abstract too. Then we must to implement all abstract methods too..

	// PARENT TESLASEMI HAS A CONSTRUCTOR NOW JUST WE NEED CALL CONSTRUCTOR
	public TeslaTruck(String model, double price, String color, double engineSize) {
		super(model, price, color, engineSize);
	}

//	// OPTIONALLY WE CAN OVERRIDE THE METHODS TOO..
//	@Override // Overriding Super implemation from TeslaSemi Class
//	public void load(String item) {
//		super.load(item); 
//	}
//
//	@Override // Overriding Super implemation from TeslaSemi Class
//	public void start() {
//		super.start(); 
//	}
//
//	@Override // Overriding Super implemation from TeslaSemi Class
//	public void charge() {
//		super.charge();
//	}
//
//	@Override // Overriding Super implemation from TeslaSemi Class
//	public void drive() {
//		super.drive();
//	}
//
//	@Override // Overriding Super implemation from TeslaSemi Class
//	public double getEngineSize() {
//		return super.getEngineSize();
//	}
	

}
