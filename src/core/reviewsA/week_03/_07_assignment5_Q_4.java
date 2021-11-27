package core.reviewsA.week_03;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class _07_assignment5_Q_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *   * Question-4:
        Write a while loop that 
         lets the user enter a number. 
         The number should be 
             multiplied by 10, 
             and the result stored in the variable product. 
             The loop should iterate as long as product contains a value less than 100.
		 */

		// lets the user enter a number
		Scanner object;  // Declaring a variable named object
		object = new Scanner(System.in); // initialization of object 
		
		int product;  // Declaring a variable
		product = 0; // initialization 
		
		
		
		while(product<100) {
			System.out.println("Enter a number : ");
			int number = object.nextInt();
			product+=number*10;
			System.out.println("Product value is "+ product);
		}
		
		System.out.println("The End");
	}

}
