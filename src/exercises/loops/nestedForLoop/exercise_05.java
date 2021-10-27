package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int line = 1; line <= 5; line++) {
			for(int j = 1; j <= (-1 * line + 5); j++) {
				System.out.print(".");
			}
			for(int k = 1; k <= line; k++) {
				System.out.print(line);
			}
			System.out.println();
		}
	}

}
