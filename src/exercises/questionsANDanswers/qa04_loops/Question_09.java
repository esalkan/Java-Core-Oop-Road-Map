package exercises.questionsANDanswers.qa04_loops;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a program for the following logic:
		// Print all the odd numbers in comma-separated form from 1 till the end (you
		// may change it):
		// if end = 10, OUTPUT = 1, 3, 5, 7, 9
		// if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
		//
		// You should use while loop and if-else statements.
		// Note that, there should not be any comma after the last digit.

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = s.nextInt();

		int counter = 0;

		System.out.print("Output : ");

		while (counter < num) {
			counter++;

			if (counter % 2 != 0) {

				System.out.print(counter);

				if (counter < num - 1) {
					System.out.print(", ");
				}
			}

		}

	}

}
