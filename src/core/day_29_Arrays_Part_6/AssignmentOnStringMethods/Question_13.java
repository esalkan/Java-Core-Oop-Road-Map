package core.day_29_Arrays_Part_6.AssignmentOnStringMethods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Question_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Write a program that will print out route instructions. Your program should
		 * take 2 parameters: start point and endpoint. Use left, right, up and down for
		 * navigation. Insert ">" between commands. If start point equals to endpoint -
		 * display: "start/end(start or end variable!) found". Note: you may move only
		 * clockwise.
		 * 
		 * A -> B -> C -> D
		 * 
		 * Sample Output:
		 * 
		 * Input: A
		 * 
		 * Input: D
		 * 
		 * Output: right > down > left: D found
		 * 
		 * Input: C
		 * 
		 * Input: C
		 * 
		 * Output: C found
		 */
		Scanner input = new Scanner(System.in);
		String startPoint = input.nextLine();
		String endsPoint = input.nextLine();
		input.close();

		routeInstructions(startPoint, endsPoint);
	}

	public static void routeInstructions(String startPoint, String endsPoint) {

		String[] arr = { "A", "B", "C", "D", "A", "B", "C", "D" };
		String directions = "";
		String result = "";
		startPoint = startPoint.toUpperCase();
		endsPoint = endsPoint.toUpperCase();

		if (!startPoint.equals(endsPoint)) {

			for (int i = 0; i < 8; i++) {

				if (arr[i].equals(startPoint)) {
					switch (startPoint) {
					case "A":
						directions = " right >";
						break;
					case "B":
						directions = " down >";
						break;
					case "C":
						directions = " left >";
						break;
					case "D":
						directions = " up >";

					}
					result += directions;
					startPoint = arr[i + 1]; // A, +1 = B ---> D
					if (startPoint.equals(endsPoint)) {
						System.out.println(result.substring(1, result.length() - 2) + ": " + endsPoint + " found");
						break;
					}
				}

			}

		} else {
			System.out.println(startPoint + " found");
		}

	}

}