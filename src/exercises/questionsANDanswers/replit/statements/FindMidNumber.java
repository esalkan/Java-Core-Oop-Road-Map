package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class FindMidNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write a program that will return mid number out of three numbers. No need to
		// do any calculations.

		// Create an object of Scanner class.
		// Declare int 3 variables: num1, num2, num3.
		// Example:
		//
		// Enter first number:
		// 14
		// Enter second number:
		// 52
		// Enter third number:
		// 25
		//
		// Medium value is: 25
		// copied!
		// WRITE YOUR CODE HERE

		int num1, num2, num3;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = scan.nextInt();
		System.out.println("Enter second number:");
		num2 = scan.nextInt();
		System.out.println("Enter third number:");
		num3 = scan.nextInt();

		if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
			System.out.println("Medium value is: " + num2);
		} else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
			System.out.println("Medium value is: " + num1);
		} else {
			System.out.println("Medium value is: " + num3);
		}
	}

}
