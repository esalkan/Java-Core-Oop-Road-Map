package exercises.questionsANDanswers.replit.variables;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// In this assignment, you will write code to put together time of day.

		// Like this: 12:24:33 PM
		// Declare variables: hour, minute, second that can hold int values.
		// Declare amOrPm variable that can hold a String ("AM" or "PM")
		// Instructor will set different values to your variables
		// Using the variables and concatenation, print values in the format mentioned
		// above.

		// 1. WRITE YOUR CODE HERE:
		int hour, minute, second;
		String amOrPm;

		// DO NOT TOUCH BELOW LINES.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hour : ");
		hour = sc.nextInt();
		System.out.println("Enter the minute : ");
		minute = sc.nextInt();
		System.out.println("Enter the second : ");
		second = sc.nextInt();
		System.out.println("Enter the amOrPm : ");
		amOrPm = sc.next();

		// #############################
		// 2. WRITE YOUR CODE HERE:
		System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

	}

}
