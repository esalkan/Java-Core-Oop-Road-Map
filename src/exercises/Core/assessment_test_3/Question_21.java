package exercises.Core.assessment_test_3;

/**
 * @author esalkan
 */
public class Question_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Passed

		// What will be the output of this code?

		int c = 0;
		boolean flag = true;

		for (int i = 0; i < 8; i++) {
			while (flag) {
				c++;
				if (i > c || c > 3) {
					flag = false;
				}
			}
		}

		System.err.println(c);
	}

}
