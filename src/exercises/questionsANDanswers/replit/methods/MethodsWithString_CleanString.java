package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithString_CleanString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * This method accept two strings (text and badWord) and returns a string.
		 * 
		 * The method will take out all the occurrences of badWord in the text.
		 * 
		 * clean ("one two three","two")
		 * 
		 * returns "one three"
		 */
		Scanner in = new Scanner(System.in);
		System.out.println(clean(in.nextLine(), in.nextLine()));
	}

	public static String clean(String text, String badWord) {
		return text.replace(badWord + " ", "");
	}

}
