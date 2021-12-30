package core.JC11_controlFlowStatements_Part_5;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_task_49_nestedForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rows = 7;

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
	}

}
