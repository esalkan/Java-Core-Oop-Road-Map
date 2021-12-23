package exercises.questionsANDanswers.replit.loops;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a program that will print out letters in the alphabetic order
		 * accordingly to the given range within 2 chars.
		 * 
		 * Example:
		 * 
		 * input: A
		 * 
		 * Z
		 * 
		 * output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 */

		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);

		// type casting and find the char value Ascii number
		int asciiStart = (int) start;
		
		// type casting and find the char value Ascii number
		int asciiEnd = (int) end;

		for (int i = asciiStart; i <= asciiEnd; i++) {
			// Type casting ascii number to char and print out the 
			System.out.print((char)i);
		}

	}

}
