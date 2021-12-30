package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Email_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Write a program that will print out information about user based on email.
		 * Print first name, last name, and domain. First and Last name should be
		 * printed with proper format - uppercase first letter and remaining lowercase.
		 * 
		 * Example:
		 * 
		 * Input: craig_federighi@apple.com Input: craig_federighi@apple.com Output:
		 * First name: Craig Last name: Federighi Domain: apple
		 */

		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		int us = email.indexOf("_");
		int at = email.indexOf("@");
		int comp = email.indexOf(".");

		String firstName = email.substring(0, us);
		String fn = firstName.substring(0, 1).toUpperCase();
		firstName = fn + firstName.substring(1);

		String lastName = email.substring(us + 1, at);
		String ln = lastName.substring(0, 1).toUpperCase();
		lastName = ln + lastName.substring(1);

		String domain = email.substring(at + 1, comp);

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
	}

}
