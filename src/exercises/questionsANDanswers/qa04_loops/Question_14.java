package exercises.questionsANDanswers.qa04_loops;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
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
