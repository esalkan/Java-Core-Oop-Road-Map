package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TernaryOperator2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write an expression using the conditional operator (? :) that compares the
		// values of the variables num1 and num2. The result (that is the value) of this
		// expression should be the value of the larger of the two variables. The larger
		// value should be printed out.

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1 = scan.nextInt();
		System.out.println("Enter number2:");
		int num2 = scan.nextInt();

		// WRITE YOUR CODE HERE:

		System.out.println(num1 > num2 ? num1 : num2);
	}

}
