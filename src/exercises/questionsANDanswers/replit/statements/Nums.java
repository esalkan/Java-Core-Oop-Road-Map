package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Nums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// You have two numbers already declared and assigned values.

		// Check if num1 and num2 are equal, or not.
		// Please follow the below examples and print message accordingly:
		//
		// Enter 2 numbers:
		// 10
		// 10
		//
		// 10 and 10 are equal
		//
		// Enter 2 numbers:
		// 100
		// 55
		//
		// 100 is greater than 55
		//
		// Enter 2 numbers:
		// 33
		// 333
		//
		// 333 is greater than 33

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		// CODE HERE:
		if (num1 == num2) {
			System.out.println(num1 + " and " + num2 + " are equal");
		} else if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater than " + num1);
		} else {
			System.out.println(num1 + " is greater than " + num2);
		}
	}

}
