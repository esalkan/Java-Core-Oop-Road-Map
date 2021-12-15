package core.JC12_branchingStatements;

/**
 * @author esalkan
 *
 */
public class JC01_breakContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			if (i == 4) {

				break;
				// continue;

			}

			System.out.println(i);
		}
	}

}
