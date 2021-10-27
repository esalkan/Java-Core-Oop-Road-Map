/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author codesofmine
 *
 */
public class question_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method that accepts two strings, a and b, return the result of
		 * putting them together in the order abba, e.g. "Hi" and "Bye" returns
		 * "HiByeByeHi".
		 * 
		 * makeAbba("Hi", "Bye") → "HiByeByeHi" 
		 * makeAbba("Yo", "Alice") → "YoAliceAliceYo" 
		 * makeAbba("What", "Up") → "WhatUpUpWhat"
		 */

		makeAbba("Hi", "Bye");
		makeAbba("Yo", "Alice");
		makeAbba("What", "Up");
	}

	private static void makeAbba(String string, String string2) {
		String combine = string.concat(string2);
		String replacing = combine.replace(combine,string2.concat(string));
		System.out.println(combine+replacing);
	}

}
