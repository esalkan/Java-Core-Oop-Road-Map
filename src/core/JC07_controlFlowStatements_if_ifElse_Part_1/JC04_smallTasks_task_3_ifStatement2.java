package core.JC07_controlFlowStatements_if_ifElse_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_smallTasks_task_3_ifStatement2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Write an if statement that sets the variable fees to 50 if the Boolean
	// variable max is true
		boolean max = false;
		int fee = 20;

		if (max) {
			fee = 50;
		}

		System.out.println("Fee is " + fee);

	}

}
