package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (-1 * line + 5); j++) {
				System.out.print(".");
			}
			System.out.print(line);
			for (int j = 1; j <= (line - 1); j++) {
				System.out.print(".");
			}
			System.out.println();
		}
	}

}
