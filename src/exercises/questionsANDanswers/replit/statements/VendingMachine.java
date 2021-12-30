package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class VendingMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write a program that will determine the change given from the vending
		// machine. The program will accept the cents amount and output the change in
		// quarters, dimes, nickels, and pennies.

		// The given cents value should be more than 0 and less than 100. If the given
		// cents is not in the range print "Invalid cents amount" and there should be no
		// other output after
		// In valid cases print the change in this format: Your change is x quarters, x
		// dimes, x nickels, and x pennies
		// ENTER CODE HERE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cents:");
		int cents = scan.nextInt();

		int quarter = cents / 25;
		int dime = cents % 25 / 10;
		int nickel = cents % 25 % 10 / 5;
		int pennies = cents % 25 % 10 % 5;

		if (cents >= 0 && cents <= 100) {
			System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, " + nickel
					+ " nickels, and " + pennies + " pennies");
		} else {
			System.out.println("Invalid cents amount");
		}

	}

}
