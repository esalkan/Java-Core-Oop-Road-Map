package exercises.questionsANDanswers.replit.variables;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class PhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write a program that asks user to input int values: areaCode and localNumber.

		// Using concatenation put together in this format and assign to String
		// phoneNumber variable:
		// (222)-3334444
		//
		// Write a print statement that displays (use the phoneNumber variable ):
		// Calling number (222)-3334444

		// Variables are already declared and given
		Scanner scan = new Scanner(System.in);
		int areaCode = scan.nextInt();
		int localNumber = scan.nextInt();

		String phoneNumber;
		// WRITE YOUT CODE HERE:
		phoneNumber = "(" + areaCode + ")" + "-" + localNumber;
		System.out.println("Calling number " + phoneNumber);

	}

}
