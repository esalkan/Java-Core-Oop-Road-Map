package day_28_Arrays_Part_5.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts two arrays and prints how many of the arrays have
		 * 1 as their first element
		 * 
		 * int[] x = {1,2,3}
		 * 
		 * Int[] y = {1,3}
		 * 
		 * Output = 2
		 * 
		 * int[] x = {7,2,3}
		 * 
		 * Int[] y = {1}
		 * 
		 * Output = 1
		 * 
		 * int[] x = {3,2,4}
		 * 
		 * Int[] y = {4,3,4}
		 * 
		 * Output = 0
		 */
		int[] x = { 1, 2, 3 };
		int[] y = { 1, 3 };

		System.out.println(countOne(x, y));

	}

	public static int countOne(int[] arr1, int[] arr2) {
		int result = 0;

		if (arr1[0] == 1) {
			result++;
		}

		if (arr2[0] == 1) {
			result++;
		}

		return result;
	}

}
