package oop.JOOP42_Interface.abstractionExample;

/**
 * @author esalkan
 *
 */
public class ElectricCarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ElectricCar ec = new ElectricCar(); // Abstract class can not be instantiated.
		
		Tesla modelS = new Tesla("Model S", 45000, "Gray");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		System.out.println(modelS.toString());
		
		System.out.println("=========================================");
		
		Ford fusion = new Ford("Fusion", 35000, "Black", 2017);
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		System.out.println(fusion.toString());
		
		System.out.println("=========================================");
		
		TeslaSemi semi = new TeslaSemi("Tesla Semi A", 125000, "Blue", 3.5);
		semi.charge();
		semi.start();
		semi.load("Orange");
		semi.drive();
		semi.stop();
		System.out.println(semi.toString());
		
		System.out.println("=========================================");

		TeslaTruck tT = new TeslaTruck("Tesla Truck A", 1250, "Brown", 3.3);
		tT.charge();
		tT.start();
		tT.load("PenPineAppleApplePen");
		tT.drive();
		tT.stop();
		System.out.println(tT.toString());
		
		
		
	}

}
