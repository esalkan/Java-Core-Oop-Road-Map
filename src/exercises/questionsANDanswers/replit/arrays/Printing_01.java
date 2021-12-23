/**
 * 
 */
package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Printing_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * The code provided in your main method will take in five Strings and save them
		 * into an array called arr. Print out the first three letter of each element on
		 * seperate lines. You can assume that every element of arr is at least 3
		 * letters long.
		 * 
		 * Example: arr -> ["hello", "how", "are", "you", "doing"]
		 * 
		 * Output: hel how are you doi
		 */

		Scanner input = new Scanner(System.in);
		
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}


		for (String item : arr) {
			System.out.print(item.substring(0, 3) + " ");
		}
	}

}
