package oop.day_39_Inheritance_AccessModifiers;

/**
 * @author esalkan
 *
 */
public class _04_ToyotaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		_03_Toyota toyota = new _03_Toyota(36);
		
		toyota.steer(40);
		System.out.println();
		toyota.accelerate(30);
		System.out.println();
		toyota.accelerate(20);
		
	}

}
