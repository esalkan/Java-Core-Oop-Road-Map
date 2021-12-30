package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class ReverseSentence2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a String variable sentence, write code to get each word and assign to
		 * String reversed in reverse order.
		 * 
		 * Example:
		 * 
		 * sentence -> Java is fun
		 * 
		 * reversed > fun is Java
		 */

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";

		String[] wordsArray = sentence.split(" ");
		for (int i = wordsArray.length - 1; i >= 0; i--) {
			if (i == 0) {
				reversed += wordsArray[i];
			} else {
				reversed += wordsArray[i] + " ";
			}
		}

		System.out.println(reversed);

	}

}
