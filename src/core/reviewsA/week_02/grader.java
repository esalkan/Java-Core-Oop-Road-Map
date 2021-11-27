/**
 * 
 */
package core.reviewsA.week_02;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class grader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. create Scanner object and import
		Scanner input = new Scanner(System.in);
		// 2. prompt the user

		System.out.println("Enter your grade");
		// 3. Get the result
		int grade = input.nextInt();

		System.out.println("Enter the student name");
		String name = input.next();

		// if it A, B 100-90:A, 80-89: B, 70-79:C, 60-69:D, rest F

		// do sanity check first

		if (grade >= 0 && grade <= 100) {
			System.out.println("Valid Entry");
			if (grade <= 100 && grade >= 90) {
				System.out.println(name + "'s grade is A");
			} else if (grade < 90 && grade >= 80) {
				System.out.println(name + "'s grade is B");
			} else if (grade < 80 && grade >= 70) {
				System.out.println(name + "'s grade is C");
			} else if (grade < 70 && grade >= 60) {
				System.out.println(name + "'s grade is D");
			} else {
				System.out.println(name + "'s grade is F");
			}
		} else {
			System.out.println("Your sanity check failed - Not a valid entry ");
		}

	}

}
