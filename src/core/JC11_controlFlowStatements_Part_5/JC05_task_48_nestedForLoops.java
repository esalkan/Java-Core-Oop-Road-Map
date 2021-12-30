package core.JC11_controlFlowStatements_Part_5;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_task_48_nestedForLoops {

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
