/**
 * 
 */
package live_reviews.week_02.endOfTheWeek_liveReviewSession;

/**
 * @author esalkan
 *
 */
public class unaryReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * two types of increament/decreament operator pre: place it before the variable
		 * increases or decreases immediately
		 * 
		 * post: place after variable first passes current value, then inc/decr by 1
		 * 
		 */

		int a = 20;

		System.out.println(a++); // first prints a in the memory 20, then increase
		System.out.println(a); // 21

		int b = 20;
		System.out.println(++b); // in memory b becomes 21 in this line
		System.out.println(b); // 21

		// ! not operator is used with anything that produces boolean result
		boolean isMarried = true;

		System.out.println(!isMarried);

		System.out.println(!(10 > 5));

		// question from Discord
		int a1 = 12;

		if (++a1 > 12) { // a1 becomes 13 at this line, if - part
			System.out.println(" a in if part = " + a1);
		}

		else {
			System.out.println("a in else part = " + a1);

		}

		int a2 = 12;

		if (a2++ > 12) { // a2 first compares than increase next line, in memory a2 12
			System.out.println(" a in if part = " + a2);
		}

		else {
			System.out.println("a in else part = " + a2);

		}

	}

}
