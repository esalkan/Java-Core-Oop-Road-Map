package exercises.questionsANDanswers.qa02_test02;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Passed

		// What will be the output when running the following program?

		int k = 0;
		int m = 0;

		for (int i = 0; i <= 3; i++) {
			k++;
			if (i == 2) {
				i = 4;
			}
			m++;
		}

		System.out.println(k + " " + m);
	}

}
