package core.day_29_Arrays_Part_6.Lab_4_Cont;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts a number and create and prints a new array of
		 * length number, containing the numbers 0,1,2,...number-1.
		 * 
		 * fizzArray(4) → [0, 1, 2, 3];
		 * 
		 * fizzArray(1) → [0]
		 * 
		 * fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		 */

		fizzyArray(4);
		fizzyArray(1);
		fizzyArray(10);

	}

	public static void fizzyArray(int len) {

		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		System.out.println(Arrays.toString(arr));

	}

}
