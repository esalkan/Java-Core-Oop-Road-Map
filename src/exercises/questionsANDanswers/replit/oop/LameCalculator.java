package exercises.questionsANDanswers.replit.oop;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class LameCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		Scanner in = new Scanner(System.in);
		LameCalculatorClass lc = new LameCalculatorClass();
		System.out.println("Enter First Number"); //Extra Added
		int a = in.nextInt();
		System.out.println("Enter Second Number");//Extra Added
		int b = in.nextInt();
		System.out.println("Sum of the two number result is : " + lc.plus(a, b));
		System.out.println("Minus of the two number result is : " + lc.minus(a, b));
		System.out.println("Multiply of the two number result is : " + lc.multiply(a, b));
		System.out.println("Divide of the two number result is : " + lc.divide(a, b));
	}
}
