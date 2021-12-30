package core.JC27_Arrays_Part_4.Lab_4;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 
		 * Question-10
		 * 
		 * Write a method that accepts an array and prints true if the array contains 2
		 * twice or 3 twice.
		 * 
		 * int[] x = {2,2}; -> true
		 * 
		 * int[] y = {3,3}; -> true
		 * 
		 * int[] a = {2,3}; -> false
		 * 
		 * int[] b = {12,20,42}; -> false
		 * 
		 * int[] c = {2,2,2}; -> false
		 * 
		 */

		int[] a = { 2, 2 };
		int[] b = { 3, 3 };
		int[] c = { 2, 3 };
		int[] d = { 12, 20, 42 };
		int[] e = { 2, 2, 2 };

		System.out.println(contains(e));
	}

	public static boolean contains(int[] arr) {

		int counter = 0;

		for (int i : arr) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 2 || arr[j] == 3) {
					counter = counter + 1;
				}
			}

			if (counter > 2) {
				return false;
			} else {
				return true;
			}
		}

		return false;
	}

}
