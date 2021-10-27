package assignments.assignment_5_forLoop;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Question_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved
		
		//	Write a program to calculate the sum of the numbers from 1 till upper bound.
		//	If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
		//	If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
		//	If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
		//
		//	You should use a while loop.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter upper bound number : ");
		int num = input.nextInt();
		int counter = 0;
		int result = num * (num+1)/2;
		int resultForLoop = num * (num+1)/2;
		
		System.out.println();
		
		// while Loop Solution
		System.out.println("While Loop Solution : ");
		while(counter < num) {
			counter++;
			if (counter == num) {
			System.out.print(counter);
			} else {
				System.out.print(counter + " + ");
			}	
		}
		
		
		System.out.print(" = " + result);
		System.out.println();
		System.out.println("\n+------------------------------+\n");
		
		// FOR LOOP SOLUTION
		System.out.println("For Loop Solution");
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}	
		}
		
		
		System.out.print(" = " + resultForLoop);
		
	}

}
