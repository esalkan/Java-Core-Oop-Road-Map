package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a program that will take the given String In and print out all the
		 * vowels from the String.
		 * 
		 * Example:
		 * 
		 * Input: howdyho
		 * 
		 * Output: oo
		 * 
		 * Input: huehuehuehue
		 * 
		 * Output: ueueueue
		 */

		Scanner inp = new Scanner(System.in);
		String word = inp.nextLine();
		// write your code below
		char isVowel;

		for (int i = 0; i < word.length(); i++) {
			isVowel = word.charAt(i);
			if (isVowel == 'a' || isVowel == 'e' || isVowel == 'i' || isVowel == 'u' || isVowel == 'o') {
				System.out.print(isVowel);
			}
		}

	}

}
