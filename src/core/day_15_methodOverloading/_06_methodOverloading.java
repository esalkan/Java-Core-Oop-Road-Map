package core.day_15_methodOverloading;

/**
 * @author esalkan
 */
public class _06_methodOverloading {

	/**
	 * @param args
	 */

	/**
	 * METHOD OVERLOADING
	 * 
	 * Method overloading is a feature that allows us to have more than one method
	 * with the same name, so long as we use different parameters.
	 * 
	 * It is the abilityto create multiple methods of the same name with different
	 * implementation
	 * 
	 * It improves the code eadability and re-usability
	 * 
	 * It is easy to remember one method name instead of remembering multiple names
	 * 
	 * Overloaded methods give programmers the flexibily to call similar method with
	 * different types of data.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(sum(5, 4));
		System.out.println(sum(5, 4, 9));
		System.out.println(sum(5, 4.4, 3.3, 2.2));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}

	public static double sum(double a, double b, double c, double d) {
		double result = a + b + c + d;
		return result;
	}

}

// 4 Rules Need To Remember About Method Overloading
// In which case we can method Overloading and tricks

// 1- Number of parameters
// methodName(int, int)
// methodName(int, int, int)

// 2- Data Type Of Parameters
// methodName(int, int)
// methodName(int, float)

// 3- Sequence of Data Type Parameters
// methodName(int, float)
// methodName(float, int)

// 4- Invalid Case - Not Method Overloading
// int methodName(int, int)
// float methodName(int, int)