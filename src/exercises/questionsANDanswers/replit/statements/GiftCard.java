package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 *//**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class GiftCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Similar to Vending Machine

		// Let's say I've got a 100$ gift card and you want to buy something in your
		// online store . Write a program that will help me to buy something and display
		// leftover balance after purchase.
		//
		// If item is not in the list, display message: "Invalid item!".
		// If price is more than 100$, display message: "Sorry, not enough funds on your
		// gift card!".
		// List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop -
		// 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$
		// Hint: if/ else if / else or switch statement
		//
		// Examples:
		//
		// input: Hat
		// output:
		// Thank you for your purchase!
		// Your current balance is: 75$
		// copied!

		// WRITE YOUR CODE HERE
		String item1 = "Blanket";
		int item1Price = 60;
		String item2 = "Charger";
		int item2Price = 25;
		String item3 = "Hat";
		int item3Price = 25;
		String item4 = "Headphones";
		int item4Price = 30;
		String item5 = "Laptop";
		int item5Price = 200;
		String item6 = "Pants";
		int item6Price = 50;
		String item7 = "Pillow";
		int item7Price = 40;
		String item8 = "Smartphone";
		int item8Price = 1000;
		String item9 = "Socks";
		int item9Price = 5;
		String item10 = "USB cable";
		int item10Price = 10;

		Scanner input = new Scanner(System.in);
		String product = input.nextLine();
		int price = input.nextInt();

		switch (product) {
		case "Blanket":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item1Price) + "$");
			break;

		case "Charger":
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: " + (100 - item2Price) + "$");
			break;

		case "Hat":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item3Price) + "$");
			break;

		case "Headphones":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item4Price) + "$");
			break;

		case "Laptop":
			System.out.println("Sorry, not enough funds on your gift card!");
			break;

		case "Pants":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item6Price) + "$");
			break;

		case "Pillow":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item7Price) + "$");
			break;

		case "Smartphone":
			System.out.println("Sorry, not enough funds on your gift card!");
			break;

		case "Socks":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item9Price) + "$");
			break;

		case "USB cable":
			System.out.println("Thank you for your purchase! ");
			System.out.println("Your current balance is: " + (100 - item10Price) + "$");
			break;

		default:
			System.out.println("Invalid item!");
			break;
		}
	}

}
