package assignments.Core.assignment_5_forLoop;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Question_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved

		// Write a while loop that lets the user enter a number.
		// The number should be multiplied by 10, and the result stored in the variable
		// product.
		// The loop should iterate as long as product contains a value less than 100.

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int product = input.nextInt();

		while ((product * 10) <= 100) {
			System.out.println("Please re-enter a number :");
			product = input.nextInt();

		}

		System.out.println("Product value is : " + product * 10);
	}

}
