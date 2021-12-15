package core.JC29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and prints true if the sum of all 2's in
		 * the array is exactly 8
		 * 
		 * int[] x = {2, 3, 2, 2, 4, 2} = > true
		 * 
		 * int[] x = {2, 3, 2, 2, 4, 2, 2} = > false
		 * 
		 * int[] x = {1, 2, 3, 4} = > false
		 */

		int[] x = { 2, 3, 2, 2, 4, 2 };
		int[] y = { 2, 3, 2, 2, 4, 2, 2 };
		int[] z = { 1, 2, 3, 4 };

		System.out.println(exactlyEight(x));
		System.out.println(exactlyEight(y));
		System.out.println(exactlyEight(z));
	}

	public static boolean exactlyEight(int[] arr) {

		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				sum += arr[i];
			}
		}

		if (sum == 8) {
			return true;
		}

		return false;
	}

}
