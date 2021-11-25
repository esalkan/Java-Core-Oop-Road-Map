package assignments.Core.assignment_5_forLoop;

/**
 * @author esalkan
 */
public class Question_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved

		// Write a program that displays all odd numbers between 3-130 in the same line

		for (int i = 3; i <= 130; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
