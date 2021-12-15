/**
 * 
 */
package core.JC27_Arrays_Part_4.Lab_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Question-6
		 * 
		 * Write a method that accepts an array and figure out which is greatest element
		 * in the array, a and set all the other elements to be that value. Print the
		 * changed array.
		 * 
		 * int[] x = {1,2,3}; = > [3,3,3]
		 * 
		 * int[] y = {11,5,9}; = > [11,11,11]
		 * 
		 * int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]
		 * 
		 */

		int[] a = { 1, 2, 3 };
		int[] x = { 3, 2, 1, 9, 17, 81, 17, 99 };
		int[] y = { 11, 5, 9 };
		int[] z = { 110, 5, 98, 0, 1200, 11, -4 };

		System.out.println(Arrays.toString(greatest(a)));
		System.out.println(Arrays.toString(greatest(x)));
		System.out.println(Arrays.toString(greatest(y)));
		System.out.println(Arrays.toString(greatest(z)));

	}

	public static int[] greatest(int[] arr) {
		Arrays.sort(arr);
		int last = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = last;
		}

		// int max = arr[0];
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i+1] > max) {
		// max = arr[i+1];
		// }
		// }

		return arr;
	}

}
