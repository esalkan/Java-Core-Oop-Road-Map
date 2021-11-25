/**
 * 
 */
package core.reviews.week_02;

/**
 * @author esalkan
 *
 */
public class switchExampleOrLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 6;

		final int check = 6; // turned into constant

		switch (month) {

		case (4):
		case (check):
		case (9):
		case (11): // can NOT write variable in case statements
			System.out.println("30 Days");
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		case (2):
			System.out.println("28 Days");
			break;

		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			System.out.println("31 Days");
			break;

		}

	}

}
