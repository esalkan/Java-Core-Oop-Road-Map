package core.JC29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * A value is "everywhere" in an array if for every pair of adjacent elements in
		 * the array, at least one of the pair is that value. Write a method that
		 * accepts an array and a number, and prints true if the given number is
		 * everywhere in the array.
		 * 
		 * int[] x = {1, 2, 1, 3};
		 * 
		 * int a = 2;
		 * 
		 * Output: false
		 * 
		 * int[] x = {1, 2, 1, 3};
		 * 
		 * int a = 1;
		 * 
		 * Output: true
		 */

		int[] x = { 1, 2, 1, 3 };
		int a = 2;

		int[] y = { 1, 2, 1, 3 };
		int b = 1;

		System.out.println(isEverywhere(x, a));

		System.out.println(isEverywhere(y, b));

	}

	public static boolean isEverywhere(int[] arr, int check) {

		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] == check && (arr[i + 1] == check || arr[i + 2] == check)) {
				return true;
			}
		}

		return false;
	}

}
