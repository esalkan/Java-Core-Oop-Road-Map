package core.reviews.week_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _06_circle {

	/**
	 * @param args
	 */

	// attributes: radius
	// actions/methods: area():r*r*Pi , perimeter():2*r*Pi

	public double radius; // also variables can have accessModifier like methods

	double Pi = 3.14; // Math.PI comes from Java Language Library

	public double area() { // no static keyword, they are instance Methods
		return radius * radius * Pi;
	}

	public double perimeter() {
		return 2 * radius * Pi;
	}

	// toString() method

	public String toString() {
		return "Radius: " + radius + ", Area: " + area() + ", Perimeter: " + perimeter();
	}

}
