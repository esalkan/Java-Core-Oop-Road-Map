package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OddOrEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Using conditional statements, check if number is odd or even.
		// Please follow the below examples and print message accordingly:

		// Enter a number:
		// 10
		//
		// 10 is even
		//
		// Enter a number:
		// 33
		//
		// 33 is odd
		//
		// Enter a number:
		// 0
		//
		// 0 is even

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();

		// CODE HERE:
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

}
