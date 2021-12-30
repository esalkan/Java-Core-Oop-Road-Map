package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class RepreatSeperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given two strings, word and a separator sep, return a big string made of
		 * count occurrences of the word, separated by the separator string.
		 * 
		 * Example:
		 * 
		 * input:
		 * 
		 * Word
		 * 
		 * X
		 * 
		 * 3
		 * 
		 * output: WordXWordXWord
		 * 
		 * input:
		 * 
		 * This
		 * 
		 * And
		 * 
		 * 2
		 * 
		 * output: ThisAndThis
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		for (int i = 0; i < count; i++) {
			if (i != count - 1) {
				System.out.print(word.concat(separator));
			} else {
				System.out.print(word);
			}
		}

	}

}
