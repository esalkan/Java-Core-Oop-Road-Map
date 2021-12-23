package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Signum {

	/**
	 * @param args
	 */
	public static void sign(int n) {
		
		// Solved and Test Cases Passed
		
		if (n > 0) {
			System.out.println("positive");
		} else if (n < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}

	}

	public static void main(String[] args) {

		// Solved and Test Cases Passed
		
		// Given a method sign write the code so that its takes a number arguement and
		// tells you if its positive, negative or zero.

		// for example :
		//
		// sign(5) => positive
		// sign(5) => positive
		// sign(-30) => negative
		// sign(-30) => negative
		// sign(0) => zero

		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();

		sign(n);

	}

}
