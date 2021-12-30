package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TipCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method called tipCalculator which accepts parameters: boolean
		 * isSplit, int numberPeople, double checkAmount, String serviceQuality
		 * 
		 * Ask the user to enter each value.
		 * 
		 * User should select service quality that will correspond to tip percent.
		 * 
		 * Poor = 5%
		 * 
		 * Fair = 10%
		 * 
		 * Good = 15%
		 * 
		 * Great = 20%
		 * 
		 * Excellent = 25%
		 * 
		 * 
		 * The program should display the following information based on the user input:
		 * 
		 * Split or No split
		 * 
		 * Number of people entered: &&&&
		 * 
		 * Service Quality:
		 * 
		 * Total to pay:
		 * 
		 * Total tip:
		 * 
		 * Total per person:
		 * 
		 * Tip per person:
		 * 
		 * 
		 * Input:
		 * 
		 * Split:Yes
		 * 
		 * Number of people:4
		 * 
		 * Check amount:476.0
		 * 
		 * Service Quality:Excellent
		 * 
		 * 
		 * Output:
		 * 
		 * Number of people entered: &&&&
		 * 
		 * Total to pay: 595.0
		 * 
		 * Total tip: 119.0
		 * 
		 * Total per person: 148.75
		 * 
		 * Tip per person: 29.75
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Split:");
		String splitCheck = sc.next();

		System.out.println("Number of people:");
		int numberOfPeople = sc.nextInt();

		System.out.println("Check amount:");
		double checkAmount = sc.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = sc.next();

		double totalPay, totalTip = 0, totalPerPerson, tipPerPerson;

		switch (serviceQuality) {
		case "Poor":
			totalTip = checkAmount * 0.05;
			break;

		case "Fair":
			totalTip = checkAmount * 0.1;
			break;

		case "Good":
			totalTip = checkAmount * 0.15;
			break;

		case "Great":
			totalTip = checkAmount * 0.20;
			break;

		case "Excellent":
			totalTip = checkAmount * 0.25;
			break;
		}

		totalPay = checkAmount + totalTip;
		totalPerPerson = totalPay / numberOfPeople;
		tipPerPerson = totalTip / numberOfPeople;

		System.out.print("Number of people entered: ");

		while (numberOfPeople > 0) {
			numberOfPeople--;
			System.out.print("&");
		}

		System.out.println();

		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip);

		switch (splitCheck) {
		case "Yes":
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
			break;
		}

	}

}
