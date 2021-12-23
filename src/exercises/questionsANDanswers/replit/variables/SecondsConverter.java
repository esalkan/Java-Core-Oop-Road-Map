package exercises.questionsANDanswers.replit.variables;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class SecondsConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write a program that outputs the number of hours, minutes,
		// and seconds that corresponds to input total seconds.

		// Create a Scanner object
		// Declare int variables inputSeconds, hours, minutes, seconds
		// Ask user enter seconds by printing:
		// "Enter seconds:"
		// Using %(remainder) and / operators, find out how many whole hours,
		// minutes and seconds are in inputSeconds.
		// Assign values to the hours, minutes, seconds variables
		// Display the result.

		// YOUR CODE HERE:
		int inputSeconds, hours, minutes, seconds;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds:");
		inputSeconds = scan.nextInt();

		hours = inputSeconds / 3600;
		minutes = inputSeconds / 60 % 60;
		seconds = inputSeconds % 60;

		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	}

}
