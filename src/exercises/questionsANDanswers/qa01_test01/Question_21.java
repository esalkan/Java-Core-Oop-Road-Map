package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// what will be the output of this code?

		char c = 'c';

		switch (c) {
		case 'a':
			System.out.println("Apple");
		case 'b':
			System.out.println("Bat");
			break;
		case 'c':
			System.out.println("Cat");
		default:
			System.out.println("None");
		}
	}

}
