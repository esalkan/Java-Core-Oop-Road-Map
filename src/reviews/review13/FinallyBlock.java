package reviews.review13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int num = scan.nextInt();
			System.out.println("You entered : "+ num);
		}catch(InputMismatchException e) {
			System.out.println("Hey Buddy please read the message carefully");
		}finally {
			scan.close(); // close and clean up the scanner
			System.out.println("Finally block runs no matter what");
		}
		
		
		

	}

}
