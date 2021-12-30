package exercises.questionsANDanswers.replit.variables;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class ShoppingList_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// In this assignment you will write a program to create a shopping list and
		// prices.

		// You will use Scanner object and ask user to enter 3 items followed by its
		// price
		// and you will calculate total price and show as a report.
		// -Declare 4 String variables item1, item2, item3, report.
		// -Declare double variables price1, price2, price3, totalPrice
		// -Create a Scanner object named scan.

		// WRITE YOUR CODE HERE:
		String item1, item2, item3, report;
		double price1, price2, price3, totalPrice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Item1 and its price:");
		item1 = scan.next();
		price1 = scan.nextDouble();
		System.out.println("Enter Item2 and its price:");
		item2 = scan.next();
		price2 = scan.nextDouble();
		System.out.println("Enter Item3 and its price:");
		item3 = scan.next();
		price3 = scan.nextDouble();
		report = "Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: "
				+ item3 + " Price: " + price3;
		totalPrice = price1 + price2 + price3;
		System.out.println(report);
		System.out.println("Total price: " + totalPrice);
	}

}
