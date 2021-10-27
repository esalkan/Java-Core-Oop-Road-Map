package exercises.loops.nestedForLoop;


/**
 * @author esalkan
 */
public class exercise_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// We can use the nested loop to iterate through each day of a week for 3 weeks.

		// In this case, we can create a loop to iterate three times (3 weeks). And,
		// inside the loop, we can create another loop to iterate 7 times (7 days).

		// Outer Loop prints weeks

		int weeks = 3;
		int days = 7;

		for (int i = 1; i <= weeks; ++i) {

			System.out.println("Week : " + i);

			for (int j = 1; j <= days; j++) {
				System.out.println("\tDay : " + j);
			}
		}

		// In the above example, the outer loop iterates 3 times and prints 3 weeks.
		// And, the inner loop iterates 7 times and prints the 7 days.

	}

}
