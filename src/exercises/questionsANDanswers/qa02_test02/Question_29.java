package exercises.questionsANDanswers.qa02_test02;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int amount = 10;

		String result = amount <= 2 ? "Couple" : amount > 2 && amount < 5 ? "few" : amount <= 5 ? "several" : "many";
		System.out.println(result);
	}

}
