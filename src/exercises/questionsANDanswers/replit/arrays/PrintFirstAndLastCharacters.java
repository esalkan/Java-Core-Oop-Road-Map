package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintFirstAndLastCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a String array words, iterate through each word and print first and
		 * last letter of each element in separate lines.
		 * 
		 * Example:
		 * 
		 * words → ["hello", "why", "by", "apple" , "note"]
		 * 
		 * print: ho
		 * 
		 * wy
		 * 
		 * by
		 * 
		 * ae
		 * 
		 * ne
		 */

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		for (String word : words) {
			System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
		}

	}

}
