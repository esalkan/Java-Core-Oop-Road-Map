/**
 * 
 */
package core.day_27_Arrays_Part_4;

/**
 * @author esalkan
 *
 */
public class _04_loop2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };

		for (int rows = 0; rows < numbers.length; rows++) {
			for (int columns = 0; columns < numbers[rows].length; columns++) {
				System.out.print(numbers[rows][columns] + " ");
			}
			System.out.println();
		}

	}

}
