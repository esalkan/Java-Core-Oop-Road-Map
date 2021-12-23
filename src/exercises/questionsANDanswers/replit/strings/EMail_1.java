package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class EMail_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		int where = email.indexOf("_");
		int whereAt = email.indexOf("@");

		String provider = email.substring(whereAt);

		if (email.contains("_")) {
			System.out.print(email.substring(where + 1, whereAt) + "_" + email.substring(0, where) + provider);
		} else if (!email.contains("_")) {
			System.out.println(email);
		}
	}

}
