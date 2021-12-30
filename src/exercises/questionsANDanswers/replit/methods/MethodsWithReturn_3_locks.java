package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithReturn_3_locks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * threeLocks accepts 3 booleans and returns a boolean.
		 * 
		 * It returns true only if both a and b are true or c is true.
		 * 
		 * Hint: See truth table
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(), in.nextBoolean()));
	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		boolean result = true;
		if (a == true & b == true & c == false) {
			return result = true;
		} else if (a == true & b == true & c == true) {
			return result = true;
		} else if (a == true & b == false & c == true) {
			return result = true;
		} else if (a == false & b == true & c == true) {
			return result = true;
		} else if (a == true & b == false & c == false) {
			return result = false;
		} else if (a == false & b == true & c == false) {
			return result = false;
		}
		return result;

	}// end threeLocks

}
