package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithReturn_SimpleRoomBooking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * To book a room first it needs to be available for rent and make sure its
		 * available at the date selected:
		 * 
		 * the room is already booked between 7/1/2018 - 7/8/2018 and not available
		 * accepting bookings only for year of 2018 Example:
		 * 
		 * simpleRoomBook(false,2,1,2018)
		 * 
		 * return false simpleRoomBook(false,2,1,2018)
		 * 
		 * return false simpleRoomBook(true,2,1,2018) ` return true
		 * simpleRoomBook(true,2,1,2018) ` return true simpleRoomBook(true,7,2,2018)
		 * 
		 * return false
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

	}

	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		// your code here
		if (isAvailable & (month != 7 & day != 1 & year == 2018 || month != 7 & day != 8 & year == 2018)) {
			return true;
		} else {
			return false;
		}
	}
}
