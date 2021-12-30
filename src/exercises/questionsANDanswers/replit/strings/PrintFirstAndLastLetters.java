package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintFirstAndLastLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed

		/**
		 * Write a program that will print out first and last letters together.
		 * 
		 * Input: adobe Output: ae
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		System.out.print(word.charAt(0));
		System.out.println(word.charAt(word.length() - 1));
	}

}
