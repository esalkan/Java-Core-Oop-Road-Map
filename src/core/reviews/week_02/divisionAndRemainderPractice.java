/**
 * 
 */
package core.reviews.week_02;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class divisionAndRemainderPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner class intro: for output = System.out.println() for input from
		 * console: Scanner
		 */

		// 1. Create your scanner object, and import utility package
		// necessary for using that class
		String name; // declaring a variable
		name = "Oscar"; // initiliaze, creating "new Scanner(System.in)"
		String name2 = "Java";
		Scanner input = new Scanner(System.in);// new keyword for creating object

		// 2. prompt the user for the input
		System.out.println(" Please provide me the seconds that you want to convert");

		// 3. Get the input from console
		int inputSecondFromConsole = input.nextInt();
		// we use next/nextLine with String inputs

		int inputSeconds = inputSecondFromConsole; // manually or Hard coded way
		int minutes, hours;
		// converted to XX hours XX minutes XX seconds
		/*
		 * Algorithm 1. 1 minute is 60 seconds, 1 hour is 3600 seconds 2. calculate
		 * remaining seconds 3. find the minutes and with modules we calculate remainder
		 * 4. calculate hours directly by dividing to 3600
		 */
		int seconds = inputSeconds % 60; // calculate remaining seconds

		minutes = inputSeconds / 60 % 60; // find the minutes and with modules we calculate remainder

		hours = inputSeconds / 3600; // calculate hours directly by dividing to 3600

		System.out.println(hours + " hours/ " + minutes + " minutes/ " + seconds + " seconds");

	}

}
