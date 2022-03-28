package exercises.questionsANDanswers.replit.basics;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintVariable_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// 2 String variables are already declared and assigned values.

		// They will hold different topics we will learn.
		// Using those variables print the message exactly like below.

		// Ex:
		// Assume topic1 = "Java" and topic2 = "SQL"
		// You need to print exactly:
		// I will learn "Java" and "SQL" at SCHOOL.

		Scanner scan = new Scanner(System.in);
		String topic1 = scan.nextLine();
		String topic2 = scan.nextLine();

		// WRITE YOUR CODE BELOW THIS LINE:
		System.out.println(
				"I will learn " + "\"" + topic1 + "\"" + " and " + "\"" + topic2 + "\"" + " at SCHOOL.");
	}

}
