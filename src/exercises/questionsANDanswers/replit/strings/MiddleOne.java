package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class MiddleOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * 
		 * You have a word, do the following:
		 * 
		 * When word has odd number of characters and: 3 or more characters, print
		 * middle letter
		 * 
		 * oak ==> a javav ==> v
		 * 
		 * Single character, print that character 3 times # ==> ### q ==> qqq
		 * 
		 * When word has even number of characters and: 4 or more characters, print the
		 * middle 2 characters
		 * 
		 * java ==> av apples ==> pl #$%^&* ==> %^
		 * 
		 * 2 characters, print those 2 characters twice
		 * 
		 * @@ ==>@@@@ $$ ==>$$$$ hi ==> hihi
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int middle = word.length() / 2;
		char middleChar = word.charAt(middle);

		if (word.length() % 2 == 1 & word.length() >= 3) {
			System.out.println(middleChar);
		} else if (word.length() == 1) {
			for (int i = 0; i < 3; i++) {
				System.out.print(word);
			}
		} else if (word.length() % 2 == 0) {
			if (word.length() >= 4) {
				System.out.print(word.charAt(word.length() / 2 - 1));
				System.out.println(word.charAt(word.length() / 2));
			} else if (word.length() == 2) {
				System.out.print(word.concat(word));
			}
		} 
	}

}
