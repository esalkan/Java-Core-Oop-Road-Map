package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****
		
		// Outer Loop
		for (int i = 1; i <= 5; i++) {
			// Inner Loop
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
