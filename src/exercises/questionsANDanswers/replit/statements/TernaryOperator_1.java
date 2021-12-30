package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TernaryOperator_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write an expression using the conditional operator (? :) that compares the
		// value of the variable x to 5 and results in:

		// Display x if x is greater than or equal to 5 Display -x if x is less than 5
		//
		// DO NOT USE IF STATEMENT or SWITCH CASE

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = scan.nextInt();
		// WRITE YOUT CODE HERE:

		System.out.println(x >= 5 ? x : -x);
	}

}
