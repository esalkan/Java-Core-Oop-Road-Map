package core.JC06_logicalOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_task_unNumbered_3_logicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int b = 2;

		// False || True && False
		// False || False
		// Result is False
		boolean result = ++b == 2 || --b == 2 && --b == 2;

		System.out.println("int b = 2;\nboolean result = ++b == 2 || --b ==2 && --b == 2;\nResult is : " + result);

	}

}
