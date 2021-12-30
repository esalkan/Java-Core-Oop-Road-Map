package core.JC07_controlFlowStatements_if_ifElse_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_task_25_ifStatement2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Write Java program that will accept three numbers and return the
		// greatest number

		int num1 = 4;
		int num2 = 8;
		int num3 = 1;

		if (num1 > num2 && num1 > num3) {
			System.out.println("The Greatest number is : " + num1);
		}

		if (num2 > num3 && num2 > num1) {
			System.out.println("The Greatest number is : " + num2);
		}

		if (num3 > num2 && num3 > num1) {
			System.out.println("The Greatest number is : " + num3);
		}

	}

}
