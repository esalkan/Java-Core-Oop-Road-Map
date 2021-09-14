package core.day_06_logicalOperators;

/**
 * @author esalkan
 *
 */
public class _04_task_unNumbered_3_logicalOperators {

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
