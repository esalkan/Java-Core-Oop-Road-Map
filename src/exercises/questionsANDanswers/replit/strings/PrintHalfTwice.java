package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintHalfTwice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		Scanner scan = new Scanner(System.in);
		String word = scan.next();


		for (int i = 0; i < 2; i++) {
			if ((word.length() / 2) % 2 == 1) {
				System.out.print(word.substring(0, word.length() / 2-1));
			} else {
				System.out.print(word.substring(0, word.length() / 2));
			}
		}


	}

}
