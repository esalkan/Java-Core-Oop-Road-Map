package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class AverageTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given an array temps with temperature values find and print the average value
		 * 
		 * Example:
		 * 
		 * input: 80 88 88 84 82 78 60 68
		 * 
		 * output: 78.5
		 */

		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };

		for (; k < temps.length; k++) {
			total += temps[k];
		}

		avgTemp = total / temps.length;

		System.out.println(avgTemp);

	}

}
