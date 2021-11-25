package core.day_04_arithmethicOperators;

/**
 * @author esalkan
 *
 */
public class _09_task_16_circleAreaPerimeter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double area, perimeter, radius;
		radius = 5.5;
		final double pi = 3.14;

		area = radius * radius * pi;
		perimeter = 2 * radius * pi;

		System.out.println("Radius 5.5 Circle Area is : " + area);
		System.out.println("Radius 5.5 Circle Perimeter is : " + perimeter);
	}

}
