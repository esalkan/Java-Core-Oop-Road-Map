package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class EachLetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Given a String, use a loop to print every character from the String on a new
		 * line.
		 * 
		 * Examples:
		 * 
		 * Input: hello
		 * 
		 * h
		 * 
		 * e
		 * 
		 * l
		 * 
		 * l
		 * 
		 * o
		 */

		Scanner inp = new Scanner(System.in);
		String word = inp.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}

	}

}
