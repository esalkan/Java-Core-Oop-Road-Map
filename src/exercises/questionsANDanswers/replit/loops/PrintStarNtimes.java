package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintStarNtimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// Given an int variable n print out n asterisks. So if n=5, five asterisks will
		// be printed.

		// Example:
		//
		// input: 1
		//
		// output: *
		// input: 1
		//
		// output: *
		// Example:
		//
		// input: 3
		//
		// output: ***

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// WRITE YOUR CODE HERE

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}

}
