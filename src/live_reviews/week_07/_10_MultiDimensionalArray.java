package live_reviews.week_07;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _10_MultiDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// single dimesional arrays: means that contain single elements.
		// 2D Arrays : means that contains arrays object : Array of Arrays
		// 3D Arrays : means , it holds multiple 2D arrays .............. Array of 2D
		// Arrays

		int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(array2D.length); // how many arrays inside array2D

		System.out.println(Arrays.toString(array2D[1]));
		System.out.println(array2D[1][2]);

		// 2D arrays [index of 1D Array][index of element]
		// 3D arrays [index of 2D Array][index of 1D Array][index of element]
		// 4D arrays [index of 3D Array][index of 2D Array][index of 1D Array][index of
		// element]

	}

}
