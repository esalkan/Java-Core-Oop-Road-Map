package exercises.Core.assessment_test_3;

/**
 * @author esalkan
 */
public class Question_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Solved & Passed

		// What will be the output when running the following program?

		int sum = 0;
		for (int i = 0, j = 0; i > 20; ++i, --j) {
			sum = sum + i + j;
		}

		System.out.println("Sum = " + sum);
	}

}
