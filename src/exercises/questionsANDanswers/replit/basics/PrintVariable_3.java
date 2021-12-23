package exercises.questionsANDanswers.replit.basics;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class PrintVariable_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Given two variables num and cost that have been declared and given values,
		// write a statement to print the values.

		// Ex:
		// Input: 2 5
		// Output: num= 2 cost= 5.0

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double cost = in.nextDouble();

		// write your code here:

		System.out.println("num= " + num + "\ncost= " + cost);

	}
}
