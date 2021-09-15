package core.day_07_controlFlowStatements_if_ifElse_Part_1;

/**
 * @author esalkan
 *
 */
public class _10_task_27_ifStatement2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a Java Program to implement following logic using if statement
		// 1- If hour is less then 12 noon, greet with "Good Morning"
		// 2- If hour is greater than or equal 12 noon but less then 3 pm,
		// Greet with "Good Afternoon"
		// 3- If hour is greater than or equal 3pm, greet with "Good Evening"

		int time = 10;

		if (time < 12) {
			System.out.println("Good Morning!");
		}

		if (time >= 12 && time <= 15) {
			System.out.println("Good Afternoon!");
		}

		if (time > 15) {
			System.out.println("Good Evening!");
		}

	}

}
