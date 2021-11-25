package assignments.Core.assignment_3_arithmeticOperators;

/**
 * @author esalkan
 */
public class Question_03 {

	/**
	 * @param args
	 */

	// Declare 2 variables (Num1, Num2)
	// Swap values between Num1 and Num2
	// Display new values of Num1 and Num2
	//
	// Sample output:
	// n1=10
	// n2=20
	// ----------
	// n1=20
	// n2=10

	public static void main(String[] args) {

		System.out.println("+-------------------------------------------+");
		System.out.println("+            Week 2 Assignment              +");
		System.out.println("+               Question 3                  +");
		System.out.println("+             Swap the numbers              +");
		System.out.println("+-------------------------------------------+");

		// variables declaration
		int num1 = 10, num2 = 20, helper;

		// Swapping the variable values
		helper = num1;
		num1 = num2;
		num2 = helper;

		// Printing new swapped numbers
		System.out.println("n1=" + num1 + "\nn2=" + num2);

	}

}
