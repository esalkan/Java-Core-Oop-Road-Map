package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class EqualsJavaPython {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a string, print out true if the number of appearances of "java"
		 * anywhere in the string is equal to the number of appearances of "python"
		 * anywhere in the string (case sensitive).
		 * 
		 * Example:
		 * 
		 * input: We study java not python
		 * 
		 * output: true
		 * 
		 * Example:
		 * 
		 * input: What's the difference between java, javascript and python?
		 * 
		 * output: false
		 */
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int countOfJava = 0;
		int countOfPython = 0;
		int lastIndex;

		// for java
		lastIndex = 0;
		while (lastIndex != -1) {
			lastIndex = sentence.indexOf("java", lastIndex);

			if (lastIndex != -1) {
				countOfJava++;
				lastIndex += "java".length();
			}
		}

		// for python
		lastIndex = 0;
		while (lastIndex != -1) {
			lastIndex = sentence.indexOf("python", lastIndex);

			if (lastIndex != -1) {
				countOfPython++;
				lastIndex += "python".length();
			}
		}

		if (countOfJava == countOfPython) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
