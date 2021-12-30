package core.JC17_classObjects_Part_2;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_bmw {

	String make = "BMW"; // Default Value is = NULL
	String model; // Default Value is = NULL
	double price; // Default Value is = 0.0

	public void showPrice() {
		switch (model) {
		case "330i":
			price = 40250;
			break;

		case "740i":
			price = 85000;
			break;

		case "m3":
			price = 65000;
			break;

		default:
			System.out.println(model + " is not available");
			price = 0.0;
			break;
		}

		System.out.println("Price : " + price);
	}
}
