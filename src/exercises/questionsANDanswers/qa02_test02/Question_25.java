package exercises.questionsANDanswers.qa02_test02;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Passed

		// What will be the output of this code?

		boolean b = false;
		int i = 1;
		do {
			i++;
		} while (b = !b);

		System.out.println(i);
	}

}
