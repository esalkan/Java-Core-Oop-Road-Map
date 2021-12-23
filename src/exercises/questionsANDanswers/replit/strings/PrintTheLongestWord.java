package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintTheLongestWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * Write a program that will print out the longest word. Note: Assume the length
		 * of the two given Strings will be different
		 */

		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		// WIRTE YOUR CODE HERE
		if (word1.length() > word2.length()) {
			System.out.println(word1);
		} else {
			System.out.println(word2);
		}
	}

}
