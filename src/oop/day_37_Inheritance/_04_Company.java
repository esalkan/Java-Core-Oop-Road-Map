package oop.day_37_Inheritance;

/**
 * @author esalkan
 *
 */
public class _04_Company {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating an object named emp1
		_03_Employee emp1 = new _03_Employee();

		// name is coming from Parent Class Which is Person Class
		emp1.name = "Tom";

		// jobTitle Employee Class variable
		emp1.jobTitle = "SDET";

		// age coming from Person Class Which is the Parent Class
		emp1.age = 27;

		// gender coming from Person Class Which is the Parent Class
		emp1.gender = 'M';

	
		
		// Employee Class Methods
		emp1.work();
		emp1.toString();
		
		// Calling Parent Class Methods
		emp1.eat("Salad");
		emp1.sleep(8);
		emp1.walk();
		
		
	}

}
