package core.JC15_methodOverloading;

/**
 * @author esalkan
 */
public class JC02_task_67_lastDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a method that accepts 2 numbers and return if they have the same last
		// digit.
		// Sample output
		// lastDigit(7,17) -> True
		// lastDigit(6,17) -> False
		// lastDigit(3,113) -> True

		if (lastDigit(7, 17)) { // if condition checking always boolean condition
			System.out.println("They have the same last digit");
		} else {
			System.out.println("They do not have the same last digit");
		}

	}

	public static boolean lastDigit(int num1, int num2) {
		if ((num1 % 10) == (num2 % 10)) {
			return true;
		} else {
			return false;
		}
	}

}
