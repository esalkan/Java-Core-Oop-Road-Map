package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		boolean X = true;
		boolean Y = !X == false;
		boolean Z = Y;

		if (X) {
			System.out.println("Hello Everyone");
		}
		if (Y) {
			System.out.println("Today is great day");
		}
		if (Z) {
			System.out.println("We have picnic on Saturday");
		}
	}

}
