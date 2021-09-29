package core.day_12_branchingStatements;

/**
 * @author esalkan
 *
 */
public class _03_labeledStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;

		outer: do {

			i = 8;

			inner: while (true) {

				System.out.println(i--);

				if (i == 4) {

					break outer;

				}

			}
		} while (true);
	}

}
