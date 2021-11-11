/**
 * 
 */
package day_27_Arrays_Part_4.Lab_4;

/**
 * @author esalkan
 *
 */
public class Question_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 
		 * QUESTION 1 :
		 * 
		 * Write a method that accepts an array and return true if 6 appears as either
		 * the first or last element in the array. The array will be length 1 or more.
		 * 
		 * E.x. ;
		 * 
		 * int[] x = {1,2,6}; -> true
		 * 
		 * int[] y = {6,1,2,3}; -> true
		 * 
		 * int[] z = {13,6,1,2,3}; -> false
		 * 
		 */

		int[] x = { 1, 2, 6 };
		int[] y = { 6, 1, 2, 3 };
		int[] z = { 13, 6, 1, 2, 3 };
		int[] k = { 13 };

		// Calling the method
		System.out.println(firstLast6(x));
		System.out.println(firstLast6(y));
		System.out.println(firstLast6(z));
		System.out.println(firstLast6(k));

	}

	public static boolean firstLast6(int[] arr) {
		if (arr.length < 1) {
			return false;
		}

		if (arr[0] == 6 || arr[arr.length - 1] == 6) {
			return true;
		} else {
			return false;
		}
	}
}
