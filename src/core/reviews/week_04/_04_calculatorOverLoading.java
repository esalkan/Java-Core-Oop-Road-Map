package core.reviews.week_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _04_calculatorOverLoading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	public static double add(double num1, double num2, double num3) { // number of parameters
		double result = num1 + num2 + num3;
		return result;
	}

	public static int add(int num1, int num2) { // datatype of parameters
		int result = num1 + num2;
		return result;
	}

}
