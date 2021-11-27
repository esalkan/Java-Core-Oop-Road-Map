/**
 * 
 */
package core.reviewsA.week_02;

/**
 * @author esalkan
 *
 */
public class monthCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if I give you

		int month = 9; // how many days in that month

		boolean month28Days = month == 2; // false
		boolean month30Days = month == 4 || month == 6 || month == 9 || month == 11; // false

		// Always your code needs to do sanity check

		if (month >= 1 && month <= 12) {

			if (month28Days) {
				System.out.println("28 Days");
			} else if (month30Days) {
				System.out.println("30 Days");
			} else {
				System.out.println("31 Days");
			}

		} else {

			System.out.println("Invalid Entry");

		}

	}

}
