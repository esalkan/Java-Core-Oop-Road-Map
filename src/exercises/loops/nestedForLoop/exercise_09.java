package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Just write singular days of the week
		// continue; used...
		
		
		int week = 3;
		int days = 7;
		
		for (int i = 1; i <= week; i++) {
			System.out.println("Week : " + i);
			
			for (int j = 1; j <= days; j++) {
				if (j % 2 == 1) {
					continue;
				}
				System.out.println("\tDays : " + j);
			}
		}
	}

}
