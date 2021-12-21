package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @author esalkan
 *
 */
public class CarTest {
	public static void main(String[] args) {

		Car c = new Car();
		c.model = "M3"; // model have default access modifier.
		c.year = 2021; // year have public access modifier.
		// c.door = 4; // door have private access modifier and accessable inside the same class
		c.engine = 2.2; // engine have protected access modifier.
	}
}
