package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int rows  = 5;
		int cols = 5;
		
		System.out.println("\n");

		for(int i = 1; i <= rows; i++) {
			System.out.print(i);
		}
		
		System.out.print("\n\n+- - - - - - - - - - o - - - - - - - - - -+\n\n");

		for (int i = 1; i <= rows; i++) {
			System.out.println(i);
		}
		
		System.out.print("\n\n+- - - - - - - - - - o - - - - - - - - - -+\n\n");
		
		for(int i = rows; i >= 1; i-- ) {
			System.out.print(i);
		}
		
		System.out.print("\n\n+- - - - - - - - - - o - - - - - - - - - -+\n\n");
		
		for (int i = rows; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.print("\n\n+- - - - - - - - - - o - - - - - - - - - -+\n\n");

		for (int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		System.out.print("\n\n+- - - - - - - - - - o - - - - - - - - - -+\n\n");

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= cols; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.print("\n\n+- - - - - - - - - - o - - - - - - - - - -+\n\n");

		for (int i = 1; i <= rows; i++) {
			
			for (int j = cols; j >= i; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}

}
