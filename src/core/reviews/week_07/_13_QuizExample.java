package core.reviews.week_07;

/**
 * @author esalkan
 *
 */
public class _13_QuizExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int wd = 0; // -1, 0, 2, 4, 3
		String[] days = { "sun", "mon", "wed", "sat" };

		for (int i = 0; i < days.length; i++) {
			switch (days[i]) {
			case "sat":
			case "sun":
				wd -= 1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd += 2;

			}
		}

		System.out.println(wd);

	}

}
