package oop.day_36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class _17_Car {

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
		_17_Car c = new _17_Car();
		c.run();
		
		_17_Car.run();
	}
}