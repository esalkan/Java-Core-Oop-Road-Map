package exercises.Core.assessment_test_2;

/**
 * @author esalkan
 */
public class Question_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int x = (2 + 4 * 9 / 3) % 5;

		switch (x) {
		case 0:
			System.out.println("Hello");
		default:
			System.out.println("World");
		case 1:
			System.out.println("Good Bye");
			break;
		case 2:
			System.out.println("Bye");
		}
	}
}
