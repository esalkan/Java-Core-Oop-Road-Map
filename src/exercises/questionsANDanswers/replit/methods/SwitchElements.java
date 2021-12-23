/**
 * 
 */
package exercises.questionsANDanswers.replit.methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class SwitchElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Implement the do_switch method Switch the last element in an array with the
		 * first and return the array.
		 * 
		 * Examples:
		 * 
		 * do_switch([1,2,3,4])
		 * 
		 * returns:[4,2,3,1]
		 * 
		 * do_switch([7,2,3,5])
		 * 
		 * returns:[5,2,3,7]
		 */

		Scanner in = new Scanner(System.in);
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt() };
		Arrays.toString(do_switch(arr));
		System.out.println(Arrays.toString(do_switch(arr)).replace(" ", ""));

	}

	public static int[] do_switch(int[] i) {
		int[] arr = new int[i.length];
		int first = i[0];
		int last = i[i.length - 1];

		for (int j = 0; j < i.length; j++) {
			if (j == 0) {
				arr[0] = last;
			} else if (j == i.length-1) {
				arr[i.length-1] = first;
			} else {
				arr[j] = i[j];
			}
		}
		// This code just for replit task
	    // System.out.println(Arrays.toString(arry).replace(" ", ""));

		return arr;
	}
}
