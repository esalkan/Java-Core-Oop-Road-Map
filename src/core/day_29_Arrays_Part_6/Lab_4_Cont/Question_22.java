package core.day_29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and prints true if the number 1's is
		 * greater than the number 4's
		 * 
		 * int[] x = { 1, 4, 1 }; -> true
		 * 
		 * int[] x = { 1, 4, 1, 4 } -> false
		 * 
		 * int[] x = { 1, 1 }; -> true
		 * 
		 */

		int[] z = { 1, 4, 1 };
		int[] y = { 1, 4, 1, 4 };
		int[] x = { 1, 1 };

		System.out.println(isGreater(x));
		System.out.println(isGreater(y));
		System.out.println(isGreater(z));

	}

	public static boolean isGreater(int[] arr) {
		int counterOne = 0;
		int counterFour = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				counterOne++;
			} else {
				counterFour++;
			}
		}

		if (counterOne > counterFour) {
			return true;
		} else {
			return false;
		}

	}

}
