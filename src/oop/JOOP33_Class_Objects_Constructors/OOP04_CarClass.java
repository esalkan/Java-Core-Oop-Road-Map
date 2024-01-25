package oop.JOOP33_Class_Objects_Constructors;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP04_CarClass {

	// We define our variables which we will use for our program
	String model; // default value is null
	String make; // default value is null
	int year; // default value is 0
	double mile; // default value is 0.00
	String color; // default value is null

	// Creating a constructor non-parameter type and assign the values to the which
	// created above variables.
	// Note : Constructor name must be same name with the class name
	public OOP04_CarClass() {
		model = "M3";
		make = "BMW";
		year = 2019;
		mile = 23000;
	}

	// Creating another constructor with parameter type and assign the values to the which created above variables
	// Parametre tipinde başka bir yapılandırıcı oluşturuyoruz ve yukarıda oluşturulan değişkenlere değer atıyoruz
	public OOP04_CarClass(String carModel, String carMake, int carYear, double carMile, String carColor) {
		// this. : call our variable which is defined above and assign the values which
		// will come from our object what we will send to that constructor
		this.model = carModel;
		this.make = carMake;
		this.year = carYear;
		this.mile = carMile;
		this.color = carColor;
	}

	// Creating a method which is non-parameter type and print the values which is defined above
	// Parametre olmayan bir yöntem oluşturuyoruz ve yukarıda tanımlanan değerleri yazdırıyoruz
	public void getCarClassNonParameter() {
		System.out.println("Model : " + model);
		System.out.println("Make : " + make);
		System.out.println("Year : " + year);
		System.out.println("Mile : " + mile);
		System.out.println("Color : " + color);
	}

	@Override
	public String toString() {
		return "OOP04_CarClass [model=" + model + ", make=" + make + ", year=" + year + ", mile=" + mile + ", color="
				+ color + "]";
	}
}
