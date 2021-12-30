package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int temp = 65;
		int roomTemp = 72;
		int carTemp = 75;

		System.out.println(temp >= 65 && ((roomTemp == (temp += 2)) && (carTemp != temp)));
	}

}
