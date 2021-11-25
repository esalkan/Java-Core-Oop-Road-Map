package core.day_30_wrapperClass.AssignmentOnArray;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class Question_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In mathematics, the Fibonacci series are the numbers in the following integer
		 * sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
		 * 
		 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
		 * and each subsequent number is the sum of the previous two.
		 * 
		 * Write a Java Program to generate above series till n number of times (For
		 * example you can try with n = 10 and n = 15) and store it in One-dimensional
		 * array.
		 * 
		 * For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		 * 
		 * For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
		 * 233, 377
		 * 
		 * Write a for loop to print all the elements of the array.
		 */

		int num = 10;

		ArrayList<Integer> fibArr = new ArrayList<>();

		int a = 0;
		int b = 1;
		int next;
		for (int i = 0; i <= num; ++i) {
			fibArr.add(a);
			System.out.print(a + " ");
			next = a + b;
			a = b;
			b = next;

		}

		System.out.println();
		System.out.println(fibArr);

	}

}
