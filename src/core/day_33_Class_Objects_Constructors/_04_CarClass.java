package core.day_33_Class_Objects_Constructors;

/**
 * @author esalkan
 *
 */
public class _04_CarClass {

	// We define our variables which we will use for our program
	String model;
	String make;
	int year;
	double mile;
	String color;

	// Creating a constructor non-parameter type and assign the values to the which
	// created above variables.
	// Note : Constructor name must be same name with the class name
	public _04_CarClass() {
		model = "M3";
		make = "BMW";
		year = 2019;
		mile = 23000;
	}

	// Creating another constructor with parameter type and assign the values to the
	// which created above variables
	public _04_CarClass(String carModel, String carMake, int carYear, double carMile, String carColor) {
		// this. : call our variable which is defined above and assign the values which
		// will come from our object what we will send to that constructor
		this.model = carModel;
		this.make = carMake;
		this.year = carYear;
		this.mile = carMile;
		this.color = carColor;
	}

	public void getCarClassNonParameter() {

	}

}
