package core.reviews.week_03;

/**
 * @author esalkan
 */
public class _06_whileLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// factorial question I.Q.
		// !5 = 5 * 4 * 3 * 2 * 1
		// factorial = 120

		int number = 5; // initialization--starting point for my loop

		int factorial = 1;

		while (number > 1) { // condition
			factorial *= number; // shorthand operator for multiplication
			System.out.print("number = " + number + " : ");
			System.out.println("factorial = " + factorial);
			number--; // iteration
		}
	}

}
