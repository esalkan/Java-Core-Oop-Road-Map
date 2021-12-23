package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class CatsDogs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Print true if the string "cat" and "dog" appear the same number of times in
		 * the given string word.
		 * 
		 * input: catdog
		 * 
		 * output: true
		 */

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;

		String word = scan.next();

		int lastIndex;
		// for cats
		lastIndex = 0;
		while (lastIndex != -1) {
			lastIndex = word.indexOf("cat", lastIndex);

			if (lastIndex != -1) {
				countOfCats++;
				lastIndex += "cat".length();
			}
		}

		// for dogs
		lastIndex = 0;
		while (lastIndex != -1) {
			lastIndex = word.indexOf("dog", lastIndex);

			if (lastIndex != -1) {
				countOfDogs++;
				lastIndex += "dog".length();
			}
		}

		if (countOfCats == countOfDogs) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
