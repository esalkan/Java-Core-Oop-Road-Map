package exercises.questionsANDanswers.qa01_test01;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int i = 0;
		int j = 0;

		boolean t = true;
		boolean r;

		r = (t && 0 < (i += 1));
		r = (t && 0 < (i += 2));
		r = (t || 0 < (j += 1));
		r = (t || 0 < (j += 2));

		System.out.println(i + " " + j);
	}

}
