package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TwoDArrays_DiagonalDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a square matrix, calculate the absolute difference between the sums of
		 * its diagonals.
		 * 
		 * For example, the square matrix is shown below:
		 * 
		 * 1 2 3
		 * 
		 * 4 5 6
		 * 
		 * 9 8 9
		 * 
		 * The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 =
		 * 17. Their absolute difference is |15-17| = 2
		 */

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int result = 0;

		for (int i = 0; i < matrix.length; i++) {
			result += matrix[i][i];
			result -= matrix[i][(matrix.length - 1) - i];

		}

		System.out.println(Math.abs(result));

	}

}
