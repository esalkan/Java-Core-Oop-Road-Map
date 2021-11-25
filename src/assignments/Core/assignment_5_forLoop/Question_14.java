package assignments.Core.assignment_5_forLoop;

/**
 * @author esalkan
 */
public class Question_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write nested loop to draw this pattern
		//
		// # #
		// # #
		// # #
		// # #
		// # #
		// # #
		// # #

		for (int i = 1; i <= 7; i++) {
			System.out.print("#");
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}

	}

}
