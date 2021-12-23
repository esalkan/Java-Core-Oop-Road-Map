/**
 * 
 */
package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Words {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		/**
		 * 
		 * In this assignment you are given two string variables word1 and word2.
		 * 
		 * Check if they are equal
		 * 
		 * Comparison should be case sensitive. "java" and "JaVa" are not equal.
		 * 
		 * if they are equal output "word1 equals word2"
		 * 
		 * otherwise output "word1 does not equal word2"
		 * 
		 * Input: java java
		 * 
		 * output: word1 equals word2 
		 * 
		 * Input: foo bar output: word1 does not equal word2
		 * 
		 */
		
	    Scanner s = new Scanner(System.in);
	    String word1 = s.next();
	    String word2 = s.next();
	    
	    boolean isEqual = word1.equals(word2);
	    
	    if (isEqual) {
			System.out.println("word1 equals word2");
		} else {
			System.out.println("word1 does not equal word2");
		}

	}

}
