/**
 * 
 */
package core.JC19_stringClass_stringManipulation_Part_01;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class JC02_task_75_totalCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a program that ask user to enter his/her firstname and lastname.
		// Display in the console total number of characters.

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your First Name");
		String firstName = sc.nextLine();

		System.out.println("Please Enter Your First Name");
		String lastName = sc.next();

		System.out.println("Character Length Of Your First Name : " + firstName.length());
		System.out.println("Character Length Of Your Last Name : " + lastName.length());

	}

}
