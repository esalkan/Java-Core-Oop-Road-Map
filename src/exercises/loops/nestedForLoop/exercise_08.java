package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Week : " + i);
			
			for (int j = 1; j <= 7; j++) {
				if (i == 2 ) {
					break;
				}
				System.out.println("    Day : "+ j);
			}
		}
	}

}
