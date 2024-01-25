package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC09_task_16_circleAreaPerimeter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a Java program to print the area and perimeter of a circle.
		// Java'da bir dairenin alanını ve çevresini yazdırmak için bir Java programı yazın.

		// Test Data:
		// Radius = 5.5
		// Expected Output
		// Perimeter is = 34.54
		// Area is = 94.985

		double area, perimeter, radius;
		radius = 5.5;
		final double pi = 3.14;

		area = radius * radius * pi;
		perimeter = 2 * radius * pi;

		System.out.println("Radius 5.5 Circle Area is : " + area);
		System.out.println("Radius 5.5 Circle Perimeter is : " + perimeter);
	}

}
