package core.JC12_branchingStatements;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
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
