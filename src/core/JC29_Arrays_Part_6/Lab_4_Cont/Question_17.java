package core.JC29_Arrays_Part_6.Lab_4_Cont;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and print the difference between the
		 * largest and smallest values in the array.
		 * 
		 * int[] x = {10,3,5,6} = > 7
		 * 
		 * int[] y = {7,2,10,9} = > 8
		 * 
		 * int[] z = {2,10,7,2} = > 8
		 */

		int[] x = { 10, 3, 5, 6 };
		System.out.println(difference(x));
	}

	public static int difference(int[] arr) {
		// First Solution
		int result = 0;
		Arrays.sort(arr);
		result = arr[arr.length - 1] - arr[0];
		return result;

		// Second Alternative Solution
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		
//		int min = max;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		
//		
//		return max-min;
	}

}
