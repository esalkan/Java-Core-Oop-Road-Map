package assignments.assignment_3_arithmeticOperators;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Question_04 {

	/**
	 * @param args
	 */
	
	//	Write a program that determines the change to be dispensed from a vending machine. 
	//	An item in the machine can cost between 25 cents and 1 dollar, 
	//	in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
	//	and the machine accepts only a single dollar bill to pay for the item.
	//
	//    Sample output
	//    Price in cents : 95
	//    Your change is 0 quarters, 0 dimes, and 1 nickels
		
	public static void main(String[] args) {
		
		System.out.println("+-------------------------------------------+");
		System.out.println("+            Week 2 Assignment              +");
		System.out.println("+               Question 4                  +");
		System.out.println("+              Vending Machine             +");
		System.out.println("+                                           +");
		System.out.println("+-------------------------------------------+");

		Scanner io = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int unitPrice = io.nextInt();
		int fixed = 100;
		int max = 100;
		int min=25;
		
		System.out.println("Price in cents : " + unitPrice);
		int qtr = (fixed-unitPrice)/25;
		int dms = (fixed-unitPrice)%25/10;
		int nkl = (fixed-unitPrice)%25%10/5;
		
		if (unitPrice<=max && unitPrice>=min) {
			System.out.println("Your change is " + qtr + " quarters " + dms + " dimes " + nkl + " nickels ");
		} else {
			System.out.println("Sorry, invalid entry");
		}

	}

}
