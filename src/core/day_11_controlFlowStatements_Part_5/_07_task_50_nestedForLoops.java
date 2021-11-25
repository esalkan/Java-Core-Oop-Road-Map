package core.day_11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class _07_task_50_nestedForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
