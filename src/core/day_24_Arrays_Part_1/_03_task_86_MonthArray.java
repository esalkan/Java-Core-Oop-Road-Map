/**
 * 
 */
package core.day_24_Arrays_Part_1;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _03_task_86_MonthArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] myArray = new String[12];
		myArray[0] = "Jan";
		myArray[1] = "Feb";
		myArray[2] = "March";
		myArray[3] = "April";
		myArray[4] = "May";
		myArray[5] = "June";
		myArray[6] = "July";
		myArray[7] = "August";
		myArray[8] = "Sept";
		myArray[9] = "October";
		myArray[10] = "Nov";
		myArray[11] = "Dec";

		System.out.println("Enter your month index number : ");
		int index = sc.nextInt();

		System.out.println("The Month is : " + myArray[index]);

		System.out.println(myArray);

	}
}
