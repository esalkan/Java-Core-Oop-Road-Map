package core.day_09_controlFlowStatements_Part_3;

/**
 * @author esalkan
 *
 */
public class _02_daySelector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int day = 1;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
		}

	}

}
