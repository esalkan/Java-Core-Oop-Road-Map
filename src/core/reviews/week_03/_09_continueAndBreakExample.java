package core.reviews.week_03;

/**
 * @author esalkan
 */
public class _09_continueAndBreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 7) {
				continue; // don't go below this line.
			}

			if (i == 8) {
				break; // Stop the iteration here
			}
			System.out.println(i);
		}

		System.out.println("\n+---------------------------------------+\n");

		outter: for (int i = 0; i < 4; i++) {

			if (i == 2) {
				continue;
			}

			inner: for (int j = 0; j < 4; j++) {
				if (j == 2) {
					continue outter;

				}

				if (i == 1) {
					break outter;
				}

			}
		}
	}

}
