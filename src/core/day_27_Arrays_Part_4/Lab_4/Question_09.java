/**
 * 
 */
package core.day_27_Arrays_Part_4.Lab_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Question-9
		 * 
		 * Write a method that accepts an array and prints a new array with double the
		 * length where its last element is the same as the original array,
		 * 
		 * int[] x = {4,5,6}; = > [0,0,0,0,0,6]
		 * 
		 */

		int[] x = { 4, 5, 6, 8 };
		System.out.println(Arrays.toString(doubleArray(x)));

	}

	public static int[] doubleArray(int[] arr) {
		int[] result = new int[arr.length * 2];
		int swap = 0;

		for (int i = 0; i < result.length; i++) {
			if (i < result.length) {
				result[i] = 0;
			}

			if (i == result.length - 1) {
				result[result.length - 1] = arr[arr.length - 1];
			}
		}
		return result;

	}

}
