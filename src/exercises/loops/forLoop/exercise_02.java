package exercises.loops.forLoop;

/**
 * @author esalkan
 */
public class exercise_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Find the sum of natural numbers from 1 to 1000
		
		int sum =0 ;
		
		for (int i = 1; i <= 1000; i++) {
			sum +=i;
		}
		
		System.out.println("Sum : " + sum);
	}

}
