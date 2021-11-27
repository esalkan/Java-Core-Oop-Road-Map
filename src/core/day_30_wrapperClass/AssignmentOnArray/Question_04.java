package core.day_30_wrapperClass.AssignmentOnArray;

/**
 * @author esalkan
 *
 */
public class Question_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		 * 
		 * Above array stores the scores of a batsman in his last 10 innings in the game
		 * of cricket.
		 * 
		 * To know more about cricket, you can visit Wikipedia link:
		 * https://en.wikipedia.org/wiki/Cricket
		 * 
		 * If score is greater than or equal to 50 but less than 100, it is regarded as
		 * half-century.
		 * 
		 * If score is greater than or equal to 100 but less than 200, it is regarded as
		 * a century.
		 * 
		 * If score is greater than or equal to 200, it is regarded as a double-century.
		 * 
		 * 
		 * NOTE: No scenario of triple-century in this case.
		 * 
		 * Write the code to print the number of half-centuries, centuries and
		 * double-centuries scored by the batsman.
		 */

		short[] scores = { 51, 85, 32, 0, 98, 157, 82, 101, 64, 249 };

		int halfCentury = 0;
		int century = 0;
		int doubleCentury = 0;

		for (int i = 0; i < scores.length; i++) {

			if (scores[i] >= 50 && scores[i] < 100) {

				halfCentury++;

			} else if (scores[i] >= 100 && scores[i] < 200) {

				century++;

			} else if (scores[i] >= 200) {

				doubleCentury++;

			}
		}

		System.out.println("Half-Century : " + halfCentury);
		System.out.println("Century : " + century);
		System.out.println("Double-Century : " + doubleCentury);

	}

}
