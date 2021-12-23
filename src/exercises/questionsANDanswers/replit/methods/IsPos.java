package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class IsPos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		/**
		 * isPos is a method that checks if an int is positive or negative
		 * 
		 * If the int num is positive print positive, negative, or zero
		 * 
		 * Complete main method by calling isPos method for each element in the array
		 * arr.
		 */
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = inp.nextInt();
		}
		// #2 Your code here

		isPos(arr);

	}

	public static void isPos(int[] num) {
		// #1 your code here
		for (int item : num) {
			if (item < 0) {
				System.out.println("negative");
			} else if (item > 0) {
				System.out.println("positive");
			} else {
				System.out.println("zero");
			}
		}

	}

}
