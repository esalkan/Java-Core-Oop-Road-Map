package core.JC28_Arrays_Part_5.Lab_4_Cont;

import java.util.Arrays;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array, and if there is a 2 in the array
		 * immediately followed by a 3, set the 3 element to 0. Print the changed Array
		 * 
		 * int[] x = {1,2,3} = > [1,2,0]
		 * 
		 * int[] x = {2,3,5} = > [2,0,5]
		 * 
		 * int[] x = {1,2,1} = > [1,2,1]
		 * 
		 * int[] x = {11,2,13,3,2} = > [11,2,13,3,2]
		 */

		int[] a = { 1, 2, 3 };
		int[] b = { 2, 3, 5 };
		int[] c = { 1, 2, 1 };
		int[] d = { 11, 2, 13, 3, 2 };
		System.out.println(Arrays.toString(changeNext(a)));
		System.out.println(Arrays.toString(changeNext(b)));
		System.out.println(Arrays.toString(changeNext(c)));
		System.out.println(Arrays.toString(changeNext(d)));

	}

	public static int[] changeNext(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 2 && array[i + 1] == 3) {
				array[i + 1] = 0;
			}
		}
		return array;
	}

}
