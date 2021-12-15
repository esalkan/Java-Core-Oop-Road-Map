package core.JC07_controlFlowStatements_if_ifElse_Part_1;

/**
 * @author esalkan
 *
 */
public class JC05_smallTasks_task_4_ifStatement2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Write an if statement that assigns 20 to the variable a if variable b is 50
	// and c is greater and equal to 100
		int a = 100;
		int b = 50;
		int c = 300;

		if (b == 50 || c > 100) {
			a = 20;
		}

		System.out.println("a = " + a);

	}

}
