package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int i, c;
		double d, f;

		i = 4;
		f = 4.3;
		d = 1.8;
		c = 0;

		if (i != c) {
			c++;
			if ((f + d) == (c += 2)) {
				System.out.println(c);
			}
		}

		System.out.println(c);
	}

}
