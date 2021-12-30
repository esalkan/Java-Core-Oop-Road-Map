package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class VehicleRecall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// SDET Motors Inc. is recalling all vehicles from model years 1995-1998,
		// 2001-2002, 2004-2006 and 2015-2017.

		// In this assignment you will write a program that will find vehicle for
		// recall.
		//
		// If the year is in the provided range print: Your vehicle needs to be
		// recalled!
		//
		// If the year is fine print: Your vehicle is fine, enjoy!
		//
		// Example:
		//
		// Enter vehicle's year:
		// 1996
		//
		// Your vehicle needs to be recalled!
		//
		// Enter vehicle's year:
		// 2018
		//
		// Your vehicle is fine, enjoy!

		// DO NOT CHANGE:
		Scanner input = new Scanner(System.in);
		System.out.println("Enter vehicle's year:");
		int vehicleYear = input.nextInt();

		// WRITE YOUR CODE HERE:

		switch (vehicleYear) {
		case (1995):
		case (1996):
		case (1998):
		case (2001):
		case (2002):
		case (2004):
		case (2005):
		case (2006):
		case (2015):
		case (2016):
		case (2017):
			System.out.println("Your vehicle needs to be recalled!");
			break;
		default:
			System.out.println("Your vehicle is fine, enjoy!");
		}
	}

}
