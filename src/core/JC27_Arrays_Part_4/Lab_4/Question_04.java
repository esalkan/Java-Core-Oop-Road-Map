package core.JC27_Arrays_Part_4.Lab_4;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 
		 * Write a method that accepts an array and prints the sum of all elements in
		 * the array
		 * 
		 * int[] x = {1,2,3}; -> 6
		 * 
		 * int[] y = {5,11,2}; -> 18
		 * 
		 * int[] z = {7,0,0}; -> 7
		 * 
		 * int[] a = {3,-2,10,4}; -> 15
		 * 
		 */

		int[] a = { 1, 2, 3 };
		int[] b = { 5, 11, 2 };
		int[] c = { 7, 0, 0 };
		int[] d = { 3, -2, 10, 4 };

		System.out.println(sumOfArray(a));
		System.out.println(sumOfArray(b));
		System.out.println(sumOfArray(c));
		System.out.println(sumOfArray(d));

	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
