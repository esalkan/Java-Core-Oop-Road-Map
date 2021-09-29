package core.day_12_branchingStatements;

/**
 * @author esalkan
 *
 */
public class _02_branchingStatements {

	/**
	 * @param args
	 */

	/*
	 * BRANCHING STATEMENTS
	 *
	 * break : This keyword causes the termination of the loop and tells the
	 * interpreter to go onto the next statement of code outside of the loop.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int number = 0;

		while (number < 15) {

			number++;

			if (number <= 5) {

				System.out.println("Skipping number " + number);

				continue;
			}

			System.out.println("number = " + number);

			if (number >= 10) {

				System.out.println("Breaking at " + number);

				break;
			}
		}
	}

}
