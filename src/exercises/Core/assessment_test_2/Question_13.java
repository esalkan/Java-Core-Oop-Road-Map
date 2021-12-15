package exercises.Core.assessment_test_2;

/**
 * @author esalkan
 */
public class Question_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int x = 7;
		int m = 10;

		++m;

		x = x-- + m--;

		System.out.println(x + " " + m);
	}

}
