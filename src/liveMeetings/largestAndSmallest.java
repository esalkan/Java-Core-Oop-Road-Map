package liveMeetings;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class largestAndSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Write a program with a loop that lets the user enter a series of integer
		// numbers have been entered, the program should display the largest and
		// smallest numbers entered

		int currentNum;
		int smallestNum;
		int largestNum;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Your First Number: ");
		currentNum = input.nextInt();
		
		smallestNum = currentNum;
		
		System.out.print("Enter Your Next Number: ");
		currentNum = input.nextInt();
		largestNum = currentNum;
		
		System.out.print("Do You Want To Enter Another Number : 0-No, 1-Yes ");
		int choice = input.nextInt();

		while (choice == 1) {
			System.out.print("Enter Your Next Number: ");
			currentNum = input.nextInt();
			
				if (currentNum > smallestNum) {
					largestNum = currentNum;
				} else {
					smallestNum = currentNum;
				}
		
			System.out.print("Do You Want To Enter Another Number : 0-No, 1-Yes ");
			choice = input.nextInt();
		}

		System.out.println("Smallest Number is : " + smallestNum);
		System.out.println("Largest Number is : " + largestNum);

	}

}
