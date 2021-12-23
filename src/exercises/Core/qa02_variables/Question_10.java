package exercises.Core.qa02_variables;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Question_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// In this assignment, you will write code to put together the time of day.
		// Like this: 12:24:33 PM
		//
		// 1. Declare variables: hour, minute, second that can hold int values.
		// Declare amOrPm variable that can hold a String ("AM" or "PM")
		// 2. An instructor will set different values to your variables
		// 3. Using the variables and concatenation, print values in the format
		// mentioned above

		// Hard Coded Way
		int hour, minute, second;
		String amOrPm;

		hour = 12;
		minute = 24;
		second = 33;
		amOrPm = "PM";

		System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

		System.out.println("\n+--------------------------------------+\n");

		// Taking Values From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Hour :\n");
		hour = sc.nextInt();

		System.out.println("Please Enter The Minute :\n");
		minute = sc.nextInt();

		System.out.println("Please Enter The Second :\n");
		second = sc.nextInt();

		System.out.println("Please Enter The Time Interval :AM or PM\n");
		amOrPm = sc.next();

		System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);
	}

}
