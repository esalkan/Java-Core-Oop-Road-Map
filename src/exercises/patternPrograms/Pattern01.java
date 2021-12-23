package exercises.patternPrograms;

/**
 * @author esalkan
 *
 */
public class Pattern01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Printing Floyd’s triangle pattern
		 * 
		 * 1
		 * 
		 * 2 3
		 * 
		 * 4 5 6
		 * 
		 * 7 8 9 10
		 * 
		 * 11 12 13 14 15
		 */

		int i, j, k = 1;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j < i + 1; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}

	}

}
