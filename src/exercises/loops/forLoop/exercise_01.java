package exercises.loops.forLoop;

/**
 * @author esalkan
 */
public class exercise_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int counter = 0;
		int constant = 10;
		
		for (int i = counter; i <= constant; i++) {
			System.out.print(i + ", ");
		}
		System.out.println("\n+----------------------------------+\n");
		
		for (int i = constant; i >= counter; i--) {
			if (i == counter) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		
		System.out.println("\n+----------------------------------+\n");
	}

}
