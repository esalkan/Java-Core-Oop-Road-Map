package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding_02;

import oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding.Car;

/**
 * @author esalkan
 *
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car c = new Car();
		// Model's access modifier is "default" and it is accessable just in same
		// package.
		// c.model = "BMW";

		// Year's access modifier is "public" and it is accessable in anywhere, in same
		// package or different packages
		c.year = 2022;

		// Door's access modifier is "private" it is accessable just inside the sae
		// class
		// c.door = 4;

		// Engine's access modifier is "protected", it is not accessable to another
		// packages. it is accessable to all other classes just in the same package.
		// c.engine = 2.2;

	}

}
