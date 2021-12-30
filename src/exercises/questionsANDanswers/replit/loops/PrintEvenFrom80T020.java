package exercises.questionsANDanswers.replit.loops;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintEvenFrom80T020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// Write a for loop that prints all even integers from 80 through and including
		// 20. Seperate each number with a space

		for (int i = 80; i >= 20; i -= 2) {
			for (int j = 1; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print(i);
		}
	}

}
