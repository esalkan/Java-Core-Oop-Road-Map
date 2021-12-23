package exercises.Core.qa02_test02;

/**
 * @author esalkan
 */
public class Question_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Not Solved & Passed

		// What will be the output of this code?

		int start = 1;
		int sum = 0;

		do {
			if (start % 2 == 0) {
				start++;
			}
			sum += start;
		} while (++start <= 10);

		System.out.println(sum);
	}

}
