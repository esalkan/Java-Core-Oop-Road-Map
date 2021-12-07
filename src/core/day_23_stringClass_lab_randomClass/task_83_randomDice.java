package core.day_23_stringClass_lab_randomClass;

import java.util.Random;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class task_83_randomDice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * write a program that he can use in class to simulate the rolling dice. The
		 * program should randomly generate two numbers in the range of 1 through 6 and
		 * display them. the program to simulate several rolls of the dice, one after
		 * the other.
		 */

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		String answer;

		do {
			System.out.println("Rolling the Dice...");
			int dice1 = rn.nextInt(6) + 1;
			int dice2 = rn.nextInt(6) + 1;
			System.out.println("Their values are : " + dice1 + " " + dice2);
			System.out.println("Roll them again? (y=yes) - (n=no)");
			answer = sc.nextLine();
		} while (answer.equalsIgnoreCase("y"));

		System.out.println("Bye!");
	}

}
