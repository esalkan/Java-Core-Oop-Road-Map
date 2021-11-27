/**
 * 
 */
package core.day_25_Arrays_Part_2A;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _09_TaskRainFall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a RainFall class that stores the total rainfall for each of 12 months
		 * into an array of doubles. The program should have methods that return the
		 * following:
		 * 
		 * - total rainfall for the year
		 * 
		 * - the average monthly rainfall
		 * 
		 * - the month with the most rain
		 * 
		 * - the month with the least rain
		 * 
		 * 
		 * Input Validation: Do not accept negative numbers for the monthly rainfall
		 * figures.
		 */
		double total = 0;
		double average = 0;
		Scanner input = new Scanner(System.in);

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		double[] rainFall = new double[12];

		System.out
				.println("Please enter in the following rainfall for the months ahead : \nMonth Rainfall (In Inches)");

		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i] + " : ");
			rainFall[i] = input.nextDouble();
			if (rainFall[i] < 0) {
				System.out.println("You can not enter negative rain fall number!!!\nPlease enter again");
				break;
			}
			
			total += rainFall[i];
		}
		
		
		Arrays.sort(rainFall);
		double most = rainFall[rainFall.length-1];
		double least = rainFall[0];
		
		
		System.out.println("Total Yearly Rain : " + total + " inches");
		System.out.println("Average Yearly Rain : " + (total / 12) + " inches");
		System.out.println("The Max Rain Is : " + most  + " inches");
		System.out.println("The Least Rain Is : " + least  + " inches");

	}

}
