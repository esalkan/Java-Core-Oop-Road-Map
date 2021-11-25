package core.reviews.week_05;

/**
 * @author esalkan
 */
public class _03_calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 5.5;
		double b = 3.3;
		double result1;

		result1 = add(a, b);
		System.out.println(result1);
		System.out.println("---------");
		System.out.println(add(a, b));

		System.out.println(subtract(result1, b));

		System.out.println("--------------");

		int x = 5;
		int y = 3;

		System.out.println(add(x, y));
		// DataType parameter promotion (implicit casting)

		System.out.println("------------");
		long x1 = 100;
		long x2 = 150;
		System.out.println(addInt((int) x1, (int) x2));
	}

	public static double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	public static double subtract(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}

	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public static double divide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}

	public static int addInt(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
