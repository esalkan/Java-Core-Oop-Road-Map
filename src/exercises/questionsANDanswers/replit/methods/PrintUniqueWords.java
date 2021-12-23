package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintUniqueWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Complete the void method printUniqueWords() that will print only unique words
		 * from an array of strings. Every single unique word should be printed from the
		 * new line.
		 * 
		 * Example:
		 * 
		 * input:[java, code, python, code, rust, code, rust]
		 * 
		 * output: java python
		 */

//		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		String[] words = new String[size];
//		for (int i = 0; i < size; i++) {
//			words[i] = scan.next();
//		}

		String[] words = { "java", "code", "python", "code", "rust", "code", "rust" };

		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {
		String[] uniqueWords = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			int countWords = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					countWords++;
				}
			}

			if (countWords == 1) {
				uniqueWords[i] = words[i];
			}
		}
		for (String value : uniqueWords) {
			if (value != null) {
				System.out.println(value);
			}
		}
	}

}
