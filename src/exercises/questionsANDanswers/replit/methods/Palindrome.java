package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Palindrome is a word, phrase, or sequence that reads the same backward as
		 * forward.
		 * 
		 * Example: madam
		 * 
		 * So method isPalindrome checks the given String and returns true if check is
		 * palindrome and false if it is not.
		 * 
		 * make your conditions case insensitive. ex: Civic and civic are both
		 * palindromes make your conditions space insensitive. Race car is a palindrome
		 * even though there is space in between. Examples:
		 * 
		 * isPalindrome("Noon") ==> true
		 * 
		 * isPalindrome("I am not palindrome") ==> false
		 * 
		 * isPalindrome("wooden") ==> false
		 * 
		 * isPalindrome("Nurses Run") ==> true
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(isPalindrome(in.nextLine()));

	}

	private static boolean isPalindrome(String check) {

		String word = check.replace(" ", "");

		String reversedWord = "";
		int wordLen = word.length();

		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}

		if (word.equalsIgnoreCase(reversedWord)) {
			return true;
		} else {
			return false;
		}
	}

}
