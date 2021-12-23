package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Duplicated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * 
		 * You have 2 words
		 * 
		 * Print the first word, second word, second word, first word
		 * 
		 * Input:
		 * 
		 * one
		 * 
		 * two 
		 * 
		 * Input:
		 * 
		 * one
		 * 
		 * two Output:
		 * 
		 * onetwotwoone
		 */

		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    
	    String swap1 = word1.concat(word2);
	    String swap2 = word2.concat(word1);

	    System.out.println(swap1 + swap2);
	}

}
