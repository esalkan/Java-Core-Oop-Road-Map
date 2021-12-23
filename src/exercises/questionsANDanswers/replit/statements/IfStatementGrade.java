package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class IfStatementGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Write a program that takes the grade int and prints if it's a passing grade
		// or failure.

		// if grade is bigger than 90 output "excellent"
		// if the grade is bigger than 70 and smaller then 90 output "good"
		// if grade is bigger than 60 and smaller than 70 output "pass"
		// if grade is smaller than 60 output "fail"
		// Examples:
		//
		// 93
		//
		// excellent
		// copied!
		// 46

		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given
		Scanner s = new Scanner(System.in);

		int grade = s.nextInt();

		// Write your code here:

		if (grade > 90) {
			System.out.println("excellent");
		} else if (grade > 70 & grade < 90) {
			System.out.println("good");
		} else if (grade > 60 & grade < 70) {
			System.out.println("pass");
		} else if (grade < 60) {
			System.out.println("fail");
		}
	}

}
