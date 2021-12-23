package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class CountHi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Print out the number of times that the string "hi" appears anywhere in the
		 * given string. Only lowercase "hi" should be counted.
		 * 
		 * input: abc hi how hi
		 * 
		 * output: 2
		 * 
		 * input: hi code java please
		 * 
		 * output: 1
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int countOfHi = 0;
		int lastIndex = 0;

		while (lastIndex != -1) {
			lastIndex = str.indexOf("hi", lastIndex);

			if (lastIndex != -1) {
				countOfHi++;
				lastIndex += "hi".length();
			}
		}

		System.out.println(countOfHi);

	}

}
