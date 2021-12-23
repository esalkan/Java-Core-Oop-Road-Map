package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class FindCube {

	/**
	 * @param args
	 */
	
	public static void cube() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n*n*n);
		
	}
	// end cube

	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// Create a method called cube. It is a void method with no arguments. Write all
		// required code inside this method in order to asks the user for a number and
		// then prints the cubed value of that number:

		// Example:
		//
		// input: 5
		//
		// output: 125
		// hint: cube of a number n = n^3
		cube();

	}
	


}
