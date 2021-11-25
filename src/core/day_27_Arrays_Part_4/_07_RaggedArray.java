/**
 * 
 */
package core.day_27_Arrays_Part_4;

import java.util.Random;

/**
 * @author esalkan
 *
 */
public class _07_RaggedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ragged Arrays | Düzensiz Diziler

		/**
		 * Because the rows in a 2D array are also arrays, each row can have its own
		 * length.
		 * 
		 * When the rows of 2D array are of different lengths, the array is known as a
		 * ragged array.
		 * 
		 * We can create a ragged array by first creating a two dimensional array with a
		 * specific number of rows, but no columns.
		 */

		// Creating an array
		int[][] array = new int[4][];

		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[2];
		array[3] = new int[9];

		// instantiate Way

		Random rn = new Random();

		int[][] arr1 = { { 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		int[][] arr2 = { { rn.nextInt(), rn.nextInt() }, { rn.nextInt(), rn.nextInt(), rn.nextInt(), rn.nextInt() },
				{ rn.nextInt() } };
	}

}
