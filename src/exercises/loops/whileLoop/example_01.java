package exercises.loops.whileLoop;

/**
 * @author esalkan
 */
public class example_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int weeks = 3;
		int days = 7;
		int counter = 1;
		
		// Outer Loop
		while (counter <= weeks) {
			System.out.println("Week : " + counter);
				
			// inner Loop
			for(int i = 1; i <= days; ++i) {
				System.out.println("\tDay : " + i);
			}
			
			++counter;
			
		}
	}

}
