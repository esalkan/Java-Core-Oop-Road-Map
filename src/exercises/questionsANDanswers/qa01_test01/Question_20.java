package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int monthNumber = 11;

		switch (monthNumber) {
		case 12:
		case 1:
			case2: System.out.println("Snow in the winder");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Green grass in the spring");
			break;

		case 6:
		case 10:
		case 11:
			switch (monthNumber) {
			case 10:
				System.out.println("Hallooween");
				break;

			case 11:
				System.out.println("Thanksgiving");
				break;
			}
			System.out.println("Yellow leaves in the fall");
			break;

		default:
			System.out.println(monthNumber + "is not a valid month.");

		}
	}

}
