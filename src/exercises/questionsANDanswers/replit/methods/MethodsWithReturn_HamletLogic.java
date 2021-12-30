package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithReturn_HamletLogic {

	/**
	 * @param args
	 */
	public static boolean hamletQuote(boolean toBe, boolean notToBe) {
		// Solved and Test Cases Passed
		if (toBe == true & notToBe == true) {
			return true;
		} else if (toBe == true & notToBe == false) {
			return true;
		} else if (toBe == false & notToBe == true) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
	}

}
