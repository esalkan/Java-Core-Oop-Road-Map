package core.JC28_Arrays_Part_5.Lab_4_Cont;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class Question_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and swap the first and last element in
		 * the array. Print the modified array
		 * 
		 * int[] x = {1,2,3,4} = > [4,2,3,1]
		 * 
		 * int[] y = {1,2,3} = > [3,2,1]
		 * 
		 * int[] z = {8,6,7,9,5} = > [5,6,7,9,8]
		 */
		int[] x = { 1, 2, 3, 4 };
		int[] y = { 1, 2, 3 };
		System.out.println(Arrays.toString(swapArray(x)));
	}

	public static int[] swapArray(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		return arr;
	}

}
