/**
 * 
 */
package day_27_Arrays_Part_4;

/**
 * @author esalkan
 *
 */
public class _07_task_95_scoreCalculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 1. Calculate the avg score of student-1 
		 * 
		 * 2. Calculate the total math scores
		 */

		String[] classes = { "Math", "Chemistry", "History", "Sport" };

		int[][] scores = { { 68, 75, 54, 80 }, { 100, 64, 20, 50 }, { 10, 35, 40, 90 } };

		for (String is : classes) {
			System.out.print(is + "|");
		}

		System.out.println();

		double avg = 0;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				avg = avg + scores[i][j];
				sum = sum + scores[i][j];
			}
			System.out.print(
					": Student " + (i + 1) + " average : " + (avg / scores[i].length) + " Total Score is : " + sum);
			avg = 0;
			sum = 0;
			System.out.println();
		}
	}
}
