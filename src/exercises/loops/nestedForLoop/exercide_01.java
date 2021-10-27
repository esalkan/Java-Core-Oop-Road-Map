package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercide_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Nested loop : A loop placed inside another loop.
		
		// Outer Loop
		for (int i = 1; i <= 5; i++) {
			// Inner Loop
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();  // to end the line
		}
		
		
		/*
		 * The outer loop repeats 5 times; the inner one 10 times
		 * 	- "sets and reps" exercise analogy
		 */
					
	}

}
