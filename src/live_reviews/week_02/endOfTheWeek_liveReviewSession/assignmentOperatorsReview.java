/**
 * 
 */
package live_reviews.week_02.endOfTheWeek_liveReviewSession;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class assignmentOperatorsReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create a scanner object and import
		Scanner input = new Scanner(System.in);
		// 2. Prompt user
		System.out.println(" Provide how much you make hourly: ");

		// 3. Pick the value from console

		int hourlyRate = input.nextInt(); // the part that you need to know right now

		int weeklyHours = 40;

		int monthlyTax = 200;

		int monthlyPayCheck = 0;
		// how much I make monthly after Tax, use shorthand operators
		// without Tax
		monthlyPayCheck += weeklyHours * hourlyRate;

		monthlyPayCheck *= 4;

		monthlyPayCheck -= monthlyTax;

		System.out.println("Your salary monthly after Tax " + monthlyPayCheck);
	}

}
