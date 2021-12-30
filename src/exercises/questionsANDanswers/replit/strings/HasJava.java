package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class HasJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in
		 * the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The
		 * string may be any length, including 0.
		 * 
		 * Example:
		 * 
		 * input: javapython
		 * 
		 * output: true
		 * 
		 * input: javapython
		 * 
		 * output: true
		 * 
		 * input: cjavac++
		 * 
		 * output: true
		 * 
		 * input: cjavac++
		 * 
		 * output: true
		 * 
		 * input: c#javaruby
		 * 
		 * output: false
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		for (int i = 0; i < 2; i++) {
			if (word.charAt(i) == 'j' && word.charAt(i + 1) == 'a') {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

	}

}
