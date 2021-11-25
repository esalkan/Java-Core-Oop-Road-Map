package core.day_11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class _05_task_48_nestedForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
