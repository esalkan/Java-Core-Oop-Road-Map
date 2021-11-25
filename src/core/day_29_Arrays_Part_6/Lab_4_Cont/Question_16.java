package core.day_29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and prints the number of even numbers in
		 * the array.
		 * 
		 * int[] x = {2,1,2,3,4} = > 3
		 * 
		 * int[]y={2,2,0} =>3
		 * 
		 * int[] z = {1,3,5} = > 0
		 */

		int[] x = { 2, 1, 2, 3, 4 };
		int[] y = { 2, 2, 0 };
		int[] z = { 1, 3, 5 };
		System.out.println(isEven(z));

	}

	public static int isEven(int[] arr) {
		int result = 0;

		for (int i : arr) {
			if (i % 2 == 0) {
				result++;
			}
		}

		return result;
	}

}
