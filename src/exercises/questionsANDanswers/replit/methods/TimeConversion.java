package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.
		 * 
		 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour
		 * clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour
		 * clock.
		 * 
		 * The timeConversion method should convert and print the given number (String
		 * argument)
		 * 
		 * Input: 07:05:45PM
		 * 
		 * Output: 19:05:45 Input:
		 * 
		 * Input: 07:15:55AM
		 * 
		 * Output: 07:15:55
		 */

		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {

		int h1 = (int) s.charAt(1) - '0';
		int h2 = (int) s.charAt(0) - '0';
		int hh = (h2 * 10 + h1 % 10);

		if (s.charAt(8) == 'A') {
			if (hh == 12) {
				System.out.print("00");
				for (int i = 2; i <= 7; i++)
					System.out.print(s.charAt(i));
			} else {
				for (int i = 0; i <= 7; i++)
					System.out.print(s.charAt(i));
			}
		} else {
			if (hh == 12) {
				System.out.print("12");
				for (int i = 2; i <= 7; i++)
					System.out.print(s.charAt(i));
			} else {
				hh = hh + 12;
				System.out.print(hh);
				for (int i = 2; i <= 7; i++)
					System.out.print(s.charAt(i));
			}
		}

	}
}
