/**
 * 
 */
package core.day_25_Arrays_Part_2;

/**
 * @author esalkan
 *
 */
public class _05_sameArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arry1 = { 1, 3, 5, 6, 7, 8, 9 };
		int[] arry2 = arry1;

		arry1[5] = 300;
		arry2[5] = 1453;

		System.out.println("The Content Of Array 1 : ");
		for (int i : arry1) {
			System.out.print(i + " ");
		}

		System.out.println("\nThe Content Of Array 2 : ");

		for (int i : arry2) {
			System.out.print(i + ",");
		}
	}
}
