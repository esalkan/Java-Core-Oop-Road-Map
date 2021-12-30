package core.JC28_Arrays_Part_5.Lab_4_Cont;

import java.util.Arrays;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Write a method that accepts 2 arrays and consider the sum of the values in
		 * each array. Print the array which has the largest sum. In event of a tie,
		 * print "equal"
		 * 
		 * int[] x = {1,2} int[] y = {3,4} = > [3,4]
		 * 
		 * int[] x = {5,6} int[] y = {3,8} = > equal
		 * 
		 * int[] x = {1,1} int[] y = {1,0} = > [1,1]
		 * 
		 */

		int[] x = { 1, 2 };
		int[] y = { 3, 4 };

		int[] a = { 5, 6 };
		int[] b = { 3, 8 };

		int[] c = { 1, 1 };
		int[] d = { 1, 0 };

		biggerTwo(x, y);
		biggerTwo(a, b);
		biggerTwo(c, d);

	}

	public static void biggerTwo(int[] arr1, int[] arr2) {

		int sumArr1 = 0;
		int sumArr2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			sumArr1 = sumArr1 + arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			sumArr2 = sumArr2 + arr2[i];
		}

		if (sumArr1 > sumArr2) {
			System.out.println(Arrays.toString(arr1));
		} else if (sumArr1 < sumArr2) {
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println("equal");
		}

	}

}
