package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class ApartmentLeasing_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write program for Leasing office.

		// numberOfBedrooms variable already declared and assigned value using Scanner:
		//
		// startingPrice is set to 0.
		//
		// prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550
		// Example Flow:
		//
		// Welcome to Cybertek Apartments!
		// Number of bedrooms you are interested:
		// 1
		// One Bedroom Selected
		// Starting Price: 1100
		// copied!

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Apartments!");
		System.out.println("Number of bedrooms you are interested:");

		int numberOfBedrooms = scan.nextInt();
		int startingPrice = 0;
		int oneBedroom = 1100;
		int twoBedrooms = 1850;
		int threeBedrooms = 2550;
		/*
		 * //WRITE YOUR CODE HERE: if (numberOfBedrooms == 1) {
		 * System.out.println("One Bedroom Selected\nStarting Price: " + oneBedroom); }
		 * else if (numberOfBedrooms == 2) {
		 * System.out.println("Two Bedroom Selected\nStarting Price: " + twoBedrooms); }
		 * else if (numberOfBedrooms == 3) {
		 * System.out.println("Three Bedroom Selected\nStarting Price: " +
		 * threeBedrooms); } else { System.out.println("No such Bedrooms available"); }
		 */
		switch (numberOfBedrooms) {
		case (1):
			System.out.println("One Bedroom Selected\nStarting Price: " + oneBedroom);
			break;
		case (2):
			System.out.println("Two Bedroom Selected\nStarting Price: " + twoBedrooms);
			break;
		case (3):
			System.out.println("Three Bedroom Selected\nStarting Price: " + threeBedrooms);
			break;
		default:
			System.out.println("No such Bedrooms available");

		}

	}

}
