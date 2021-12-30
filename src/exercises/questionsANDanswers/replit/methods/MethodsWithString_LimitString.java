package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithString_LimitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * This method gets a string and an int, it returns a string.
		 * 
		 * The method will limit the given String by a certain amount of
		 * characters(given int)
		 * 
		 * Examples:
		 * 
		 * limit("abcd",2)
		 * 
		 * returns "ab"
		 * 
		 * limit("bla bla",3)
		 * 
		 * returns "bla"
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(limit(in.nextLine(), in.nextInt()));

	}

	public static String limit(String text, int maxLength) {

		String result = text.substring(0, maxLength);

		return result;
	}

}
