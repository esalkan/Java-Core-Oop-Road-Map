package assignments.Core.assessment_test_2;

/**
 * @author esalkan
 */
public class Question_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int i = 5;
		int f = 6;
		int d = 3;
		int c = 1;

		if (i != f) {
			c++;
		}

		if ((f + d) == (c += 2)) {
			c--;
		}

		System.out.println(c);
	}

}
