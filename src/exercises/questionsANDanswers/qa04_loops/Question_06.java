package exercises.questionsANDanswers.qa04_loops;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Question_06 {

	/**
	 * @param args
	 */
	// Write a program to print Fibonacci series of n terms
	// where n is declared by user :
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

	public static void main(String[] args) {

		// Solved

		// Fibonacci Series Formula :
		// F(n) = F(n-1) + F(n-2)
		// F0 = 0, F1 = 1

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter and declare a number for fibonacci series :");
		int nTerm = input.nextInt();

		int a = 0;
		int b = 1;
		int next;

		System.out.println("Fibonacci series till " + nTerm + " terms:");

		for (int i = 1; i <= nTerm; ++i) {

			System.out.print(a + ", ");

			next = a + b;
			a = b;
			b = next;
		}
	}

}
