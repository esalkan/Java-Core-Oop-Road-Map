package exercises.questionsANDanswers.replit.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TwoDArrays_LargestNumber2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a 2d array of ints, find the biggest number(integer) and replace all
		 * array values on biggest number in the array then print an array.
		 * 
		 * Example:
		 * 
		 * Given values: [[1, 2, 3], [5, 33, 9]]
		 * 
		 * output: [[33, 33, 33], [33, 33, 33]]
		 */

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt(), cols = scan.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int max = arr[0][0];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		// System.out.println("max = " + max);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = max;
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
