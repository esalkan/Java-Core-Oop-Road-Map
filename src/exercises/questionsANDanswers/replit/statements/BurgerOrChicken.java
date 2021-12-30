package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class BurgerOrChicken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// A fast food company has two main order types, burger meal and chicken meal.

		// Both have the same prices, so if a cashier enters "burger" or "chicken " he
		// will get the same price of 10.0.
		//
		// If the order is burger price is 10.0
		// If the order is chicken price is 10.0
		// If the order is soda price is 2.0
		// If the order is fries price is 3.5
		// hint: or operator in java is ||
		//
		// Examples:
		//
		// burger
		//
		// 10.0
		//
		// chicken

		Scanner s = new Scanner(System.in);
		String in = s.next();

		double bCPrice = 10.0, sodaPrice = 2.0, friesPrice = 3.5;

		// your code here
		switch (in) {
		case "burger":
		case "chicken":
			System.out.println(bCPrice);
			break;
		case "soda":
			System.out.println(sodaPrice);
			break;
		case "fries":
			System.out.println(friesPrice);
		}
	}

}
