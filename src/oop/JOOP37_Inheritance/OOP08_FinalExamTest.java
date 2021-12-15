package oop.JOOP37_Inheritance;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class OOP08_FinalExamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ask user how many question in the exam
		// ask user how many question is missed
		// give user the final grade

		Scanner input = new Scanner(System.in);
		System.out.println("How many questions are on the final exam?");
		int questions = input.nextInt();

		System.out.println("How many questionns did student miss?");
		int missed = input.nextInt();

		OOP07_FinalExam exam = new OOP07_FinalExam(questions, missed);

		System.out.println("Exam Score is : " + exam.getScore());
		System.out.println("Exam Grade is : " + exam.getGrade());

	}

}
