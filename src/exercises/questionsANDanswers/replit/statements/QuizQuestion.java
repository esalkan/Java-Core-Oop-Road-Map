package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class QuizQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// In the given program you have a quiz question and a scanner to get the user
		// input which will be stored on string a.

		// after the user inputs an answer (a, b or c) we need to check if its the
		// correct, wrong, or invalid answer.
		//
		// what is the farthest planet in the solar system:
		// a)venus
		// b)pluto
		// c)neptune

		Scanner s = new Scanner(System.in);

		System.out.println("what is the farthest planet in the solar system:");
		System.out.println("a)venus");
		System.out.println("b)pluto");
		System.out.println("c)neptune");

		String a = s.nextLine();

		// your code here
		switch (a) {
		case "a":
			System.out.println("a is wrong");
			break;
		case "b":
			System.out.println("b is correct");
			break;
		case "c":
			System.out.println("c is wrong");
			break;
		case "z":
			System.out.println("z is not a valid answer");
		case "j":
			System.out.println("j is not a valid answer");
			break;
		}

	}

}
