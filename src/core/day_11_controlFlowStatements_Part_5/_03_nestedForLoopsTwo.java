package core.day_11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class _03_nestedForLoopsTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			System.out.println("Outter Loop at state : " + i);

			for (int p = 0; p <= 3; p++) {

				System.out.println("Inner loop at state : " + p);

				if (p == 3) {

					System.out.println();

				}
			}
		}
	}

}
