package oop.JOOP33_Class_Objects_Constructors;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP03_CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating an object from _04_CarClass and named it car1
		OOP04_CarClass car1 = new OOP04_CarClass();

		// Creating an object from _04_CarClass and named it car2 and assign the values
		// to the defined variables
		OOP04_CarClass car2 = new OOP04_CarClass("AMG", "Mercedes", 2007, 65000, "White");

		// Creating an object from _04_CarClass and named it car3 and assign the values
		// to the defined variables
		OOP04_CarClass car3 = new OOP04_CarClass("Corolla", "Toyota", 2015, 32000, "Yellow");

		// Creating an object from _04_CarClass and named it car4 and assign the values
		// to the defined variables
		OOP04_CarClass car4 = new OOP04_CarClass("Altima", "Nisssan", 2014, 41000, "Black");

	}

}
