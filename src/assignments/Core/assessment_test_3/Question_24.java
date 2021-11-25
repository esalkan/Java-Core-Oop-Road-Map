package assignments.Core.assessment_test_3;

/**
 * @author esalkan
 */
public class Question_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Not Passed
		// What will be the output of this code?

		int counter = 4;
		outer: for (int i = 0; i < 4; i++) {
			middle: for (int j = 0; j < 4; j++) {
				inner: for (int k = 0; k < 4; k++) {
					if (k - j > 0) {
						break middle;
					}
					counter++;
				}
			}
		}

		System.out.println(counter);
	}

}
