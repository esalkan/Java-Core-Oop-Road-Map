package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintFirstCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * 
		 * Write a program that will print out the first character of the word.
		 * 
		 * Ex:
		 * Input: jump 
		 * Output: j
		 */

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    System.out.println(word.charAt(0));
	}

}
