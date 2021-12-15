/**
 * 
 */
package core.JC24_Arrays_Part_1;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class JC04_task_87_DayArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create an array that holds the days User should be able to enter the day
		 * index and output should be:
		 * 
		 * “Today is Monday”
		 */
		Scanner sc = new Scanner(System.in);

		String[] days = new String[7];

		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";

		System.out.println("Enter your day index : ");
		int index = sc.nextInt();

		System.out.println("The day is : " + days[index]);
	}

}
