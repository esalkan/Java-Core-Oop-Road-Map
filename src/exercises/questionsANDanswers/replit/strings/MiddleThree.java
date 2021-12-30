package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MiddleThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Given a String variable word print the middle three characters if the word is
		 * an odd number of characters and has more than 5 characters. If the word does
		 * not meet the requirements print invalid.
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE

		int halfWord = word.length() / 2;

		if (word.length() % 2 == 1 & word.length() > 5) {
			System.out.print(word.substring((halfWord - 1), (halfWord + 2)));
		} else if (word.length() % 2 == 0 || word.length() < 5) {
			System.out.println("invalid");
		}

	}

}
