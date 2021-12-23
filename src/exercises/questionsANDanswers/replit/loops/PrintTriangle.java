package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class PrintTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// Write a program that will create a triangle of asterisks based on size n.

		// Example:
		// input: 5
		// output:
		// *
		// **
		// ***
		// ****
		// *****
		// Example:
		// input: 1
		// output:
		// *

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number and it will create asterisks based  triangle : ");
		int n = scan.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
