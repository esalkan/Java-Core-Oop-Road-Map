package oop.JOOP33_Class_Objects_Constructors;

/**
 * @author esalkan
 *
 */
public class OOP01_RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a Object from _02_RectangleClass
		OOP02_RectangleClass r1 = new OOP02_RectangleClass();

		// Inside the _02_RectangleClass Java file
		// There is two variable is not assigned any value.
		// Below we assign to this 2 variable some values.
		r1.length = 5.2;
		r1.width = 4.8;

		// Creating another object from same class named r2
		OOP02_RectangleClass r2 = new OOP02_RectangleClass();

		// Again assign values to the variables
		r2.length = 3.5;
		r2.width = 2.7;

		System.out.println("\n+----- print the values what we assign to length -----+");
		// Print the values what we assigned above
		System.out.println("r1.length : " + r1.length);
		System.out.println("r2.length : " + r2.length);

		// We call the method named getArea() that method calculate
		// Area of the rectangle

		System.out.println("\n+---- calling getArea() Method from _02_RectangleClass Class File -----+");
		r1.getArea();

	}

}
