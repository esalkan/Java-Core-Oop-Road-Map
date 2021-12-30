package core.reviews.week_03;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _01_ternaryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 10000;
		int biggerNumber;

		// if (num1>num2) {
		// biggerNumber = num1;
		// } else {
		// biggerNumber = num2;
		// }

		biggerNumber = (num1 > num2) ? num1 : num2;

		System.out.println(biggerNumber);
	}

}
