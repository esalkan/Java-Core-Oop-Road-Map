package core.day_09_controlFlowStatements_Part_3;

/**
 * @author esalkan
 *
 */
public class _04_task_39_switchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String color = "o";

		switch (color) {
		case "R":
		case "r":
			System.out.println("Red");
			break;
		case "O":
		case "o":
			System.out.println("Orange");
			break;
		case "G":
		case "g":
			System.out.println("Green");
			break;
		}
	}

}
