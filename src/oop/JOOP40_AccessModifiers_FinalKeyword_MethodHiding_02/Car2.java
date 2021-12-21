package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding_02;

import oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding.Car;

public class Car2 extends Car {

	public Car2() {
		// Checking inherited Class variables access modifiers.

		// model = "M3"; // model have default access modifier. Can NOT Accessible to
		// subclass outside the same package. Because Inheritance used.
		year = 2021; // year have public access modifier. Accessable in anywhere.
		// door = 4; // door have private access modifier and NOT accessable outside of
		// the package and other class
		engine = 2.2; // engine have protected access modifier. In inheritance protected is accessable
						// to another packages and class
	}
}
