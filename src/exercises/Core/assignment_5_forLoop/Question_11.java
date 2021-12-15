package exercises.Core.assignment_5_forLoop;

/**
 * @author esalkan
 */
public class Question_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Print the following output using nested for loops.
		// 4 3 2 1
		// 3 2 1
		// 2 1
		// 1

		for (int i = 4; i >= 1; i--) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
