package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class HappyValleySchoolSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// In the Happy Valley School System, children are classified by age as follows:

		// Assume only positive numbers are given
		//
		// less than 2, ineligible
		// 2, toddler
		// 3-5, early childhood
		// 6-7, young reader
		// 8-10, elementary
		// 11 and 12, middle
		// 13, impossible
		// 14-16, high school
		// 17-18, scholar
		// greater than 18, ineligible
		//

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given

		Scanner input = new Scanner(System.in);

		System.out.println("Enter age:");
		int age = input.nextInt();

		// WRITE YOUR CODE HERE
		if (age == 2) {
			System.out.println("toddler");
		} else if (age >= 4 & age <= 5) {
			System.out.println("early childhood");
		} else if (age >= 8 & age <= 10) {
			System.out.println("elementary");
		} else if (age >= 14 & age <= 16) {
			System.out.println("high school");
		} else if (age >= 0 & age < 2) {
			System.out.println("ineligible");
		} else {
			System.out.println("ineligible");
		}
	}

}
