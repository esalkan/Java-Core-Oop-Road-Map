package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintNext3Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed

		/**
		 * Create a method called next3 . This method has an int argument and prints the
		 * next 3 numbers after that number. Call the method from main method and pass
		 * num to it.
		 * 
		 * flow:
		 * 
		 * enter number 
		 * 1 
		 * next 3 are: 
		 * 2 3 4 
		 * 
		 * enter number 
		 * 1 
		 * next 3 are: 
		 * 2 3 4 
		 * (put a space between numbers)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		next3(num);
		
	}
	
	public static void next3(int num) {
		for (int i = 1; i <= 3; i++) {
			if (i!= 3) {
				System.out.print(++num + " ");
			} else {
				System.out.print(++num);
			}
		}
	}

}
