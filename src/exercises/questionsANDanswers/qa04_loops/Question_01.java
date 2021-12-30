package exercises.questionsANDanswers.qa04_loops;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_01 {

	// Write a for loop that displays the following set of numbers:
	// 0,10,20,30,40,50,...1000
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved

		for (int i = 0; i <= 1000; i += 10) {
			System.out.println(i);
		}
	}

}
