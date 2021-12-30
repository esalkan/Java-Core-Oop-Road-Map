package core.JC29_Arrays_Part_6.Lab_4_Cont;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts an array and prints true if the array contains 3
		 * even or 3 odd values all next to each other.
		 * 
		 * int x[] = {2,1,3,5}; -> true
		 * 
		 * int y[] = {2,1,2,5}; -> false
		 * 
		 * int z[] = {2,4,2,5}; -> true
		 */

		int x[] = { 2, 1, 3, 5 };
		int y[] = { 2, 1, 2, 5 };
		int z[] = { 2, 4, 2, 5 };

		System.out.println(isContainEvenOrOdd(x));
		System.out.println(isContainEvenOrOdd(y));
		System.out.println(isContainEvenOrOdd(z));

	}

	public static boolean isContainEvenOrOdd(int[] arr) {

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		if (countEven == 3 || countOdd == 3) {
			return true;
		}

		return false;
	}

}
