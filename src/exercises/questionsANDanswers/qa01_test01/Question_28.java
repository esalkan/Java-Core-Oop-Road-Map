package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		char grade = 'A';

		boolean Passed = grade == 'A' || grade == 'B';
		boolean Passed2 = grade == 'C' || grade == 'D';

		if (Passed || Passed2) {
			System.out.println("You've passed the exam");
		} else {
			System.out.println("You failed...");
		}
	}

}
