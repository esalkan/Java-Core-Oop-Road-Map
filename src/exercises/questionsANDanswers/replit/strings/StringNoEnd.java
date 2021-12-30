/**
 * 
 */
package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class StringNoEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Given a String txt print the value without the last letter
		 */

		Scanner s = new Scanner(System.in);
		String txt = s.next();

		int last = txt.length() - 1;
		System.out.println(txt.substring(0, last));

	}

}
