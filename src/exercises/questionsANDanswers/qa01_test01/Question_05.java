package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int x = 4;
		int y = x * 4 - x++;

		if (y < 10) {
			System.out.println("Too Low");
		} else if (y > 10 && y <= 15) {
			System.out.println("Just Right");
		} else {
			System.out.println("Too High");
		}
	}

}
