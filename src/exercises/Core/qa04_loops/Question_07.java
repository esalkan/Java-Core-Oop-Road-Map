package exercises.Core.qa04_loops;

/**
 * @author esalkan
 */
public class Question_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved

		// Write a Java program to print all the numbers
		// between 1 and 100 (including 1 and 100) which are divisible by 5.

		// Formula if ones digit is 0 or 5 it will be divided to 5 without remainder
		// thats why we can take it modulus.
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
