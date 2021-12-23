/**
 * 
 */
package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Without_X_x {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * 
		 * Given a string word, if the first or last chars are 'x' or 'X', print the
		 * string without those 'x' or 'X' chars, otherwise print the string unchanged.
		 * 
		 * Example:
		 * 
		 * input: xHiX
		 * 
		 * output: Hi
		 * 
		 * input: apple
		 * 
		 * output: apple

		 * input: xUxL
		 * 
		 * output: UxL
		 * 
		 * input: JavaX
		 * 
		 * output: Java
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.startsWith("x") || word.startsWith("X")) {
			System.out.println(word.substring(1, word.length()));
		} else if (word.endsWith("x") || word.endsWith("X")) {
			System.out.println(word.substring(0, word.length() - 1));
		}
		{
			System.out.println(word);
		}
	}

}
