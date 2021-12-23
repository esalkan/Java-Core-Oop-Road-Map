package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class SplitSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a String variable sentence, write code to type each word in separate
		 * lines.
		 * 
		 * Example:
		 * 
		 * sentence -> "Java is fun"
		 * 
		 * Print
		 * 
		 * Java
		 * 
		 * is
		 * 
		 * fun
		 */
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String[] words = sentence.split(" ");

		for (String wordsWord : words) {
			System.out.println(wordsWord.trim());
		}

	}

}
