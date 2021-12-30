package exercises.questionsANDanswers.replit.arrays;

import java.util.Arrays;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TwoDArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Declare and create a two-dimensional array of ints called values, with 2
		 * rows, and initialize the first row to 8, 20, 50 and the second row to 12, 30,
		 * 75.`
		 */
		
		int[][] values = {{8,20,50},{12,30,75}};

	    System.out.println(Arrays.deepToString(values));

	}

}
