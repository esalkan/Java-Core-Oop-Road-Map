package day_29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a function that accepts an array and prints the sum of the numbers in
		 * the array. Except the number 13 is very unlucky, so it does not count and
		 * numbers that come immediately after a 13 also do not count.
		 * 
		 * int[] x = {1,2,2,1} = > 6
		 * 
		 * int[]y={1,1} =>2
		 * 
		 * int[] a = {1,2,2,1,13} = > 6
		 * 
		 * int[] b = {1,2,2,1,13,3} = > 9
		 */

		int[] x = { 1, 2, 2, 1 };
		int[] y = { 1, 1 };
		int[] a = { 1, 2, 2, 1, 13 };
		int[] b = { 1, 2, 2, 1, 13, 3 };

		System.out.println(sumOfArray(x));
		System.out.println(sumOfArray(y));
		System.out.println(sumOfArray(a));
		System.out.println(sumOfArray(b));
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 13) {
				sum += 0;
			} else {
				sum += arr[i];
			}
		}

		return sum;
	}

}
