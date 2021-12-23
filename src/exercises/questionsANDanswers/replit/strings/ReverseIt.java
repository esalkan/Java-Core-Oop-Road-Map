package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class ReverseIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * Write a program that will reverse a string. Your program should reverse a
		 * string only 5 characters long. If word is shorter, display message: "Too
		 * short!". If word is longer, display message: "Too long!". Otherwise, reverse
		 * this word and print out result into the console.
		 * 
		 * Example:
		 * 
		 * input: cat
		 * 
		 * output: Too short!
		 * 
		 * input: singularity
		 * 
		 * output: Too long!
		 * 
		 * input: apple
		 * 
		 * output: elppa
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String reverse = "";
		if (word.length() < 5) {
			System.out.println("Too short!");
		} else if (word.length() > 5) {
			System.out.println("Too long!");
		} else {
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				reverse = ch + reverse;
			}
			System.out.print(reverse);
		}

	}

}
