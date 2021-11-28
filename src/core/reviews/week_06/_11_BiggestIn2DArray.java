package core.reviews.week_06;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _11_BiggestIn2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 3, 12, 3, 34, 12 }, // 34
				{ 13, 7, 456, 34, 3 }, // 456
				{ -5, -24, -2, -10, -4 } // -2
		};

		// task return me an array contains max number of each array in the 2d array
		System.out.println(Arrays.deepToString(arr)); // this one we can use for printing 2D arrays
		System.out.println(Arrays.toString(biggestValues(arr)));
	}

	public static int[] biggestValues(int[][] arr) {

		// check point : first element of each array can assumed MAX

		int[] biggestArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0]; // first element of my each array inside 2D array

			for (int each : arr[i]) { // I am looping inside each array element
				if (each > max) {
					max = each;
				}
			}

			biggestArr[i] = max;
		}

		return biggestArr;
	}

	// implement same task with Arrays.sort method
}
