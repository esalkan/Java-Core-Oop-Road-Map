package core.reviews.week_03;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _03_printAllLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// print all the letters from A to Z

		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();

		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}

		System.out.println();

		for (int i = 'z'; i >= 'a'; i--) { // this is an example of implicit casting--compiler
			System.out.print((char) i + " "); // this is an example of explicit casting we do it.
		}
	}

}
