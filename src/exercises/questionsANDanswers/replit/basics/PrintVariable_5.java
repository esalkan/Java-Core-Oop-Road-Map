package exercises.questionsANDanswers.replit.basics;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintVariable_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Given two variables first and second with values, write a statement
		// that will print the values in a single line.

		// Ex:
		// Input: 55 123
		// Output: first is 55 and second is 123
		// Input: -124 -500
		// Output: first is -124 and second is -500

		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt(); // do not change
		int second = scan.nextInt(); // do not change

		// write your code here :
		System.out.println("first is " + first + " and second is " + second);

	}

}
