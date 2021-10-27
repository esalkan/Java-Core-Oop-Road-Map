package exercises.loops.whileLoop;

/**
 * @author esalkan
 */
public class example_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int rows = 5;
		int counter = 1;
		while (counter <= rows ) {
			
			for (int i = 1; i < counter; ++i) {
				System.out.print(i + " ");
			}
			
			counter++;
			
			System.out.println("");
		}
	}

}
