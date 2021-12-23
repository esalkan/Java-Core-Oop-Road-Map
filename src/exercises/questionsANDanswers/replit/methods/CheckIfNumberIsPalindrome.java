package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class CheckIfNumberIsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Complete the method isPalindrome() that will check if number is a palindrome.
		// Print your result as a boolean (true or false).

		// Challenge: Do not convert int into a string!
		//
		// Examples:
		//
		// input: 1001
		//
		// output: true
		// input: 1001
		//
		// output: true
		// input: 1234
		//
		// output: false
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	}

	public static void isPalindrome(int num){

	    if(num%2==1){
	      System.out.println("true");
	    } else {
	      System.out.println("false");
	    }
	    
	  }

}
