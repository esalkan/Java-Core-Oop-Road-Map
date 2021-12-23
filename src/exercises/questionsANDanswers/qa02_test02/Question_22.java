package exercises.questionsANDanswers.qa02_test02;

/**
 * @author esalkan
 */
public class Question_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Not Passed

		// What will be the output of this code?

		// Answers
		// - It will print hello 2 times
		// - It will print hello 4 times
		// - It will print hello 6 times
		// - It will print hello 3 times

		label1: for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				if (i + j - 1 > 10) {

					break label1;

				}

			}
			System.out.println("Hello");
		}
	}

}
