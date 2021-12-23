package exercises.questionsANDanswers.replit.variables;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class PatientInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Declare 9 String variables firstName, lastName, fullName, email, street,
		// state, city, address, contacts.

		// Declare 2 int variables: age, zipcode Declare 2 double variables: height,
		// weight. Declare boolean variable: isMarried (for marriage status).
		// Declare 2 long variables: workPhoneNumber and personalPhoneNumber.
		//
		// Create a Scanner object named scan.

		// Execution flow with example:
		// Welcome to the patient portal!
		// Please enter your personal information
		// Enter your first name
		// James
		// Enter your last name
		// May
		// Enter your email
		// jamesmay@gmail.com
		// Enter your street
		// 7925 Jones

		// build contacts variable by concatenating work phone, personal phone and email

		// build fullName variable by concatenating first name and last name
		//
		// build address variable by concatenating street, city, state, zip code

		// Output in the console:

		// Patient personal information Full name: May, James
		// Address: 7925 Jones Branch Dr, McLean, VA 22102
		// Contacts: work phone number - 7896542314,
		// personal phone number - 2406542314,
		// email: jamesmay@gmail.com
		// Age: 35 Height: 5.1 Weight: 173.2 pounds Married?: true

		// Enter your code here
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;

		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		firstName = scan.next();

		System.out.println("Enter your last name");
		lastName = scan.next();

		// this part is already provided DO NOT CHANGE
		System.out.println("Enter your email");
		email = scan.next();
		scan.nextLine();// to capture Enter key press
		System.out.println("Enter your street");
		street = scan.nextLine();
		// continue for city

		System.out.println("Enter your city");
		city = scan.next();

		System.out.println("Enter your state");
		state = scan.next();

		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();

		System.out.println("Enter your work phone number");
		workPhoneNumber = scan.nextLong();

		System.out.println("Enter your personal phone number");
		personalPhoneNumber = scan.nextLong();

		System.out.println("Enter your age");
		age = scan.nextInt();

		System.out.println("Enter your height");
		height = scan.nextDouble();

		System.out.println("Enter your weight");
		weight = scan.nextDouble();

		System.out.println("Are you married?");
		isMarried = scan.nextBoolean();

		contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number - "
				+ personalPhoneNumber + ", " + "email: " + email;

		fullName = lastName + ", " + firstName;

		address = street + ", " + city + ", " + state + " " + zipcode;

		System.out.println("Patient personal information");
		System.out.println("Full name: " + fullName);
		System.out.println("Address: " + address);
		System.out.println(contacts);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight + " pounds");
		System.out.println("Married?: " + isMarried);
	}

}
