package core.JC29_Arrays_Part_6.AssignmentOnStringMethods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Question_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a program that will reverse a string. Your program should reverse a
		 * string only 5 characters long. If the word is shorter, display message: "Too
		 * short!". If the word is longer, display the message: "Too long!". Otherwise,
		 * reverse this word and print out the result into the console.
		 * 
		 * Sample Output:
		 * 
		 * input: cat
		 * 
		 * output: Too short!
		 * 
		 * 
		 * input: singularity
		 * 
		 * output: Too long!
		 * 
		 * 
		 * input: apple
		 * 
		 * output: elppa
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text to be printed in reverse : ");
		String input = sc.nextLine();

		String reversed = "";

		if (input.length() < 5) {
			System.out.println("Too short!");
		} else if (input.length() > 5) {
			System.out.println("Too Long!");
		} else {
			for (int i = input.length() - 1; i >= 0; i--) {
				reversed += input.charAt(i);
			}
			System.out.println(reversed);
		}

	}

}
