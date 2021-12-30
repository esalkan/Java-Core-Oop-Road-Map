package oop.JOOP36_StaticClassMembers;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP17_Car {

	int door;

	public static void run() {
		System.out.println("Car is running.");
	}

	public int getDoorNumber() {
		return door + 2;
	}


}

class _17_CarTest{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OOP17_Car c = new OOP17_Car();
		c.run();
		
		OOP17_Car.run();
	}
}