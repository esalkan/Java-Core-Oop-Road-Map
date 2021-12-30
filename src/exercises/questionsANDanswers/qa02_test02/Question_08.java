package exercises.questionsANDanswers.qa02_test02;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Passed

		// What will be the output when running the following program?

		int sum = 0;

		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("Sum = " + sum);
	}

}
