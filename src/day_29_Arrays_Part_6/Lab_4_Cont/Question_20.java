package day_29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and prints true if the array contains a
		 * 2 next to a 2 somewhere.
		 * 
		 * int[] x = { 1, 2, 2 } -> true
		 * 
		 * int[] y = { 1, 2, 1, 2 } ->false
		 * 
		 * int[] a = { 2, 1, 2 } -> false
		 * 
		 * int[] b = { 2, 2, 1, 2 } -> true
		 */

		int[] x = { 1, 2, 2 };
		int[] y = { 1, 2, 1, 2 };
		int[] a = { 2, 1, 2 };
		int[] b = { 2, 2, 1, 2 };

		System.out.println(checkTwo(x));
		System.out.println(checkTwo(y));
		System.out.println(checkTwo(a));
		System.out.println(checkTwo(b));

	}

	public static boolean checkTwo(int[] arr) {

		boolean flag = false;

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 2 && arr[i + 1] == 2) {
				flag = true;
			}
		}
		return flag;

	}

}
