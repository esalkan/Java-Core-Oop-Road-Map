/**
 * 
 */
package core.JC27_Arrays_Part_4.Lab_4;

/**
 * @author esalkan
 *
 */
public class Question_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 
		 * QUESTION 2 :
		 * 
		 * Write a method that accepts an array and check the length of the array first.
		 * 
		 * If the length is more than one, check if the first element and last element
		 * are equal. if it is print true, if not print false.
		 * 
		 * int[] x = {1,2,3}; -> false
		 * 
		 * int[] y = {1,2,3,1}; -> false
		 * 
		 * int[] z = {1,2,1}; -> true
		 * 
		 * int[] k = {1} -> not a valid array
		 * 
		 */

		int[] x = { 1, 2, 3 };
		int[] y = { 1, 2, 3, 1 };
		int[] z = { 1, 2, 1 };
		int[] k = { 1 };

		System.out.println(checkArr(x));
		System.out.println(checkArr(y));
		System.out.println(checkArr(z));
		System.out.println(checkArr(k));

	}

	public static String checkArr(int[] arr) {

		if (!(arr.length > 1)) {
			return "not a valid array";
		}

		if (arr[0] == arr[arr.length - 1]) {
			return "true";
		} else {
			return "false";
		}

	}

}
