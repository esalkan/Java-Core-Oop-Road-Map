/**
 * 
 */
package core.day_27_Arrays_Part_4.Lab_4;

/**
 * @author esalkan
 *
 */
public class Question_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Question-5
		 * 
		 * Write a method that accepts an array and prints an array with the elements
		 * "rotated left”
		 * 
		 * int[] x = {1,2,3}; -> [2,3,1]
		 * 
		 * int[] y = {17,12,10,8}; -> [12,10,8,17]
		 * 
		 * int[] a = {7,0,0}; -> [0,0,7]
		 * 
		 */

		int[] a = { 1, 2, 3 };
		int[] b = { 17, 12, 10, 8 };
		int[] c = { 7, 0, 0 };

		reverse(a);

	}

	public static void reverse(int[] arr) {

		int arrLen = arr.length;

		int[] newArr = new int[arrLen];

		int swap = arrLen;

		for (int i = 0; i < arrLen; i++) {
			newArr[swap - 1] = arr[i];
			swap = swap - 1;
		}

		System.out.println("Reversed Array is :");
		for (int i = 0; i < arrLen; i++) {
			System.out.print(newArr[i]);
		}
	}

}
