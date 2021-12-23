package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class MethodsWithReturn_Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		// Finish the method max which has two parameters, x and max.

		// if x is bigger than max return x
		// if max is bigger than x return max
		// all other cases return x
		// Example:
		//
		// max(1,10) -> 10
		// max(1,10) -> 10
		// max(11,5) -> 11
		Scanner in = new Scanner(System.in);
		System.out.println(max(in.nextInt(), in.nextInt()));
	}

	public static int max(int x, int max) {
		// Code here
	    if(x > max){
	        return x;
	      } else if(max > x) {
	        return max;
	      } else {
	        return x;
	      }
	}
}
