package exercises.questionsANDanswers.replit.arrays;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class SplitEmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a String variable email, write code using split method to print email
		 * id and domain in separate lines.
		 * 
		 * Example:
		 * 
		 * email -> info@cybertekschool.com
		 * 
		 * Output:
		 * 
		 * Email id: info
		 * 
		 * Email domain: cybertekschool.com
		 * 
		 * If email contains no @ character or multiple @ characters then print invalid
		 * email:
		 * 
		 * email -> hello-gmail.com
		 * 
		 * Output:
		 * 
		 * invalid email
		 * 
		 * email -> my@fancy@email.com
		 * 
		 * Output:
		 * 
		 * invalid email
		 */

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		int count = 0;

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				count++;
			}
		}

		if (count == 1) {
			String[] words = email.split("@");
			System.out.println("Email id: " + words[0]);
			System.out.println("Email domain: " + words[1]);
		} else {
			System.out.println("invalid email");
		}

	}

}
