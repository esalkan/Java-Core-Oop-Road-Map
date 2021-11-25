/**
 * 
 */
package core.day_27_Arrays_Part_4;

/**
 * @author esalkan
 *
 */
public class _03_LengthFieldIn2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * The Length Field in a 2-Dimensional Array
		 * 
		 * A one dimensional array has a length field that holds the number of elements
		 * in the array.
		 * 
		 * A two dimensional array, however, has multiple length field. It has a length
		 * field that holds the number of rows, and then each row has a length field
		 * that holds the number of columns.
		 */

		int[][] numbers = { { 1, 2, 3 }, // row 1
				{ 41, 54, 61, 34, 55 }, // row 2
				{ 7, 8, 9, 10 }, // row 3
		};

		// Display the numbers array rows.
		System.out.println("Array rows : " + numbers.length);

		System.out.println("Number of columns in each row : " + numbers[0].length);
		System.out.println("Number of columns in each row : " + numbers[1].length);
		System.out.println("Number of columns in each row : " + numbers[2].length);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Row " + i + " members are : ");
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
