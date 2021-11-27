package core.day_29_Arrays_Part_6A.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts two arrays of the same length. For every element
		 * in array1, consider the corresponding element in array2 (at the same index).
		 * Return the count of the number of times that two elements differ by 2 or
		 * less, but are not equal.
		 * 
		 * int[] x = {1,2,3};
		 * 
		 * int[] y = {2,3,10};
		 * 
		 * Output: 2
		 * 
		 * int[] x = {1,2,3};
		 * 
		 * int[] y = {2,3,5};
		 * 
		 * Output: 3
		 * 
		 */
		
		int[] x = { 1, 2, 5 };
		int[] y = { 2, 5, 10 };
		
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 3, 4 };
		
		System.out.println(sameValues(x, y));
		System.out.println(sameValues(a, b));

	}

	public static int sameValues(int[] arr1, int[] arr2) {
		int temp = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					temp = arr1[i];
				}
			}
		}

		return temp;
	}

}
