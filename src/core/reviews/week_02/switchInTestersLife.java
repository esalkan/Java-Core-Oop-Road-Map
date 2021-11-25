/**
 * 
 */
package core.reviews.week_02;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class switchInTestersLife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Browser Type to Automate");

		String browser = input.next();

		switch (browser) {

		case ("chrome"):
			System.out.println("Doing chrome automation");
			break;

		case ("firefox"):
			System.out.println("Doing firefox automation");
			break;

		default:
			System.out.println("wrong entry");
		}

	}

}
