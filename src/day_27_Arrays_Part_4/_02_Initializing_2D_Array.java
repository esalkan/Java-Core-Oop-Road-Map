/**
 * 
 */
package day_27_Arrays_Part_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _02_Initializing_2D_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * INITIALIZING A 2D ARRAY
		 * 
		 * When initializing a two-dimensional array, you enclose each row's
		 * initialization list in it's own set of branches
		 * 
		 * instantiate way
		 */

		int[][] numbers = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		String[][] students = { { "Ali", "Hamza", "Emre" }, { "Yusuf", "Ayşe", "Eyüp" } };

		System.out.println("Number of rows in numbers array: " + numbers.length);
		System.out.println("Number of rows in students array: " + students.length);

		System.out.println("# members in numbers array first column : " + numbers[0].length);
		System.out.println("# members in numbers array first column : " + numbers[1].length);
		System.out.println("# members in numbers array first column : " + numbers[2].length);

		System.out.println("# members in numbers element first column ");
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println("# members in numbers element first column ");
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println("# members in numbers element first column ");
		System.out.println(Arrays.toString(numbers[2]));

		System.out.println("# members in students array first column : " + students[0].length);
		System.out.println("# members in students array first column : " + students[1].length);

		System.out.println("# members in students element first column ");
		System.out.println(Arrays.toString(students[0]));
		System.out.println("# members in students element first column ");
		System.out.println(Arrays.toString(students[1]));

	}

}
