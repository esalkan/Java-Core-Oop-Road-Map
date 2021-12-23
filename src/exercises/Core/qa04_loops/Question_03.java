package exercises.Core.qa04_loops;

/**
 * @author esalkan
 */
public class Question_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved

		// Write a program that displays the number of even numbers between 5 and 50
		// (included)

		for (int i = 5; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
