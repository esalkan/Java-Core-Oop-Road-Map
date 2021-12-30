package core.JC28_Arrays_Part_5.Lab_4_Cont;

import java.util.Arrays;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts 2 arrays and prints a new array containing all
		 * their elements
		 * 
		 * int[] x = {1,2}
		 * 
		 * int[] y = {3,4} = > [1,2,3,4]
		 * 
		 * int[] x = {4,4}
		 * 
		 * int[] y = {2,2} = > [4,4,2,2]
		 * 
		 * int[] x = {9,2}
		 * 
		 * int[] y = {3,4} = > [9,2,3,4]
		 */

		int[] x = { 1, 2 };
		int[] y = { 3, 4, 1, 1, 1, 1, 1, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(arrayConcat(x, y)));

	}

	public static int[] arrayConcat(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}

		int a = 0;
		for (int j = arr1.length; j < result.length; j++) {

			result[j] = arr2[a];
			a++;
		}

		return result;
	}

}
