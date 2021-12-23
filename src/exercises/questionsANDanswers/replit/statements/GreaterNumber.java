package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class GreaterNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Use an if statement to determine if a or b is bigger. Then print:
		// $number is greater

		// Examples:
		// a=1
		// b=2
		// output:
		// 2 is greater
		// a=1
		// b=2
		// output:
		// 2 is greater
		// a=5
		// b=7
		// output:
		// 7 is greater

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		// WRITE YOUR CODE HERE:
		if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(b + " is greater");
		}
	}

}
