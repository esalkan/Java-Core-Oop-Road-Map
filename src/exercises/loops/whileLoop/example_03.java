package exercises.loops.whileLoop;

/**
 * @author esalkan
 */
public class example_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int week = 2;
		int day = 3;
		int counter = 1;
		
		while(counter <= week) {
			System.out.println("Week : " + counter);
			
			for(int i = 1; i <= day; i++) {
				System.out.println("    Day : " + i);
			}
			++counter;
		}
	}

}
