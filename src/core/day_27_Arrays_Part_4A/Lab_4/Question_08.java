/**
 * 
 */
package core.day_27_Arrays_Part_4A.Lab_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Question-8
		 * 
		 * Write a method that accepts an array and prints true if it contains a 2 or a
		 * 3
		 * 
		 * int[] x = {2,5}; -> true
		 * 
		 * int[] y = {4,3}; -> true
		 * 
		 * int[] z = {4,5}; -> false
		 * 
		 */

		int[] x = { 2, 5 };
		int[] y = { 4, 3 };
		int[] z = { 4, 5 };

		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));

	}

	public static boolean contains(int[] arr) {
		for(int val : arr) {
			if (val == 2 || val == 3) {
				return true;
			}
		}
		return false;
	}
}
