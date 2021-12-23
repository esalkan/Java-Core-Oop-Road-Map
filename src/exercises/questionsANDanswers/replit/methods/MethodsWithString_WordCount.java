package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

public class MethodsWithString_WordCount {

	public static void main(String[] args) {
		/**
		 * wordCount accepts String and returns how many words are in the given String
		 * 
		 * Example:
		 * 
		 * wordCount("foo bar")
		 * 
		 * returns 2
		 * 
		 * wordCount("one two three")
		 * 
		 * returns 3
		 * 
		 * wordCount("bla")
		 * 
		 * returns 1
		 * 
		 * Hint: look at spaces
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(wordCount(in.nextLine()));

	}

	public static int wordCount(String words) {
		return words.split(" ").length;
	}

}
