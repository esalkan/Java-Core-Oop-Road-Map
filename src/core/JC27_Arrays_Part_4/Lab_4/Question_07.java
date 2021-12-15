/**
 * 
 */
package core.JC27_Arrays_Part_4.Lab_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Question-7
		 * 
		 * Write a method that accepts 2 arrays and prints the second array containing
		 * the first and last elements from the first array.
		 * 
		 * int[] x = {1,2,3};
		 * 
		 * int[] y = {}; -> [1,3]
		 * 
		 * int[] a = { 7, 4, 6, 2 };
		 * 
		 * int[] b = {}; -> [7,2]
		 */

		int[] x = { 1, 2, 3 };
		int[] y = {};

		int[] a = { 7, 4, 6, 2, 6 };
		int[] b = {};

		System.out.println(Arrays.toString(arrayContain(x, y)));
		System.out.println(Arrays.toString(arrayContain(a, b)));
	}

	public static int[] arrayContain(int[] arr1, int[] arr2) {

		int[] result = new int[2];

		int firstIndex = arr1[0];
		int lastIndex = arr1[arr1.length - 1];

		result[0] = firstIndex;
		result[1] = lastIndex;

		return result;
	}

}
