package core.day_33_Class_Objects_Constructors;

/**
 * @author esalkan
 *
 */
public class _03_CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating an object from _04_CarClass and named it car1
		_04_CarClass car1 = new _04_CarClass();

		// Creating an object from _04_CarClass and named it car2 and assign the values
		// to the defined variables
		_04_CarClass car2 = new _04_CarClass("AMG", "Mercedes", 2007, 65000, "White");

		// Creating an object from _04_CarClass and named it car3 and assign the values
		// to the defined variables
		_04_CarClass car3 = new _04_CarClass("Corolla", "Toyota", 2015, 32000, "Yellow");

		// Creating an object from _04_CarClass and named it car4 and assign the values
		// to the defined variables
		_04_CarClass car4 = new _04_CarClass("Altima", "Nisssan", 2014, 41000, "Black");

	}

}
