package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class SimpleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved & Test Cases Passed 
		
		// Implement the plus method. The return is void and has no arguments.

		// The method should ask the user to input two numbers, then it will add them
		// and print the result.
		//
		// Hint: Create a scanner within plus method.
		//
		// Example:
		//
		// enter first number:
		// 1
		// enter second number:
		// 2
		// result: 3
		plus();
	}

	public static void plus() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = input.nextInt();
		System.out.println("Enter second number : ");
		int num2 = input.nextInt();
		
		System.out.println("result : " + (num1 + num2));
		
	}
}
