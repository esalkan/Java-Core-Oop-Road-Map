package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1
		// 22
		// 333
		// 4444
		// 55555
		
		// Outer Loop
		for (int i = 1; i <= 5; i++) {
			
			// Inner Loop
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
		System.out.println("\n+----------------------------------+\n");
		
		// Reverse it now

		
	}

}
