package core.JC08_controlFlowStatements_elseIf_switchCase_Part_2;

/**
 * @author esalkan
 *
 */
public class JC12_task_36_switchCase_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		String operator = "/";
		int result = 0;

		switch (operator) {

		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "*":
			result = num1 * num2;
			break;

		case "/":
			result = num1 / num2;
			break;

		default:
			System.out.println("Invalid Operator");

		}

		System.out.println("Result is " + result);
	}

}
