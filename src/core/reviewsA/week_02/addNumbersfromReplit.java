/**
 * 
 */
package core.reviewsA.week_02;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class addNumbersfromReplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WRITE YOUR CODE HERE:
		int num1, num2, num3; // declared the variable

		double num4, sum;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 4 numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextDouble();

		// not necessary but you can close that object
		scan.close();

		sum = num1 + num2 + num3 + num4;

		System.out.println("Sum of numbers: " + sum);
	}

}
