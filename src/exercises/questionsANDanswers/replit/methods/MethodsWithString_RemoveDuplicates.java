package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithString_RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * uniqueChars is a method that will accept any String and return the String
		 * with out any dupclicate characters
		 * 
		 * Examples:
		 * 
		 * uniqueChars("java") ==> "jav"
		 * 
		 * uniqueChars("mama") ==> "ma"
		 * 
		 * uniqueChars("spoon") ==> "spon"
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(uniqueChars(in.next()));

	}

	public static String uniqueChars(String str) {

		int stringLength = str.length();
		for (int i = 0; i < stringLength; i++) {
			for (int j = i + 1; j < stringLength; j++) {
				if (Character.compare(str.charAt(i), str.charAt(j)) == 0
						&& Character.compare(str.charAt(j), ' ') != 0) {
					str = str.substring(0, j) + " " + str.substring(j + 1);
				}
			}
		}

		str = str.replace(" ", "");

		return str;
	}

}
