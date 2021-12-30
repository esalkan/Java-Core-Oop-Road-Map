package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Nanuk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In the Eskimo language nanuk means polar bear. When the tribe men goes
		 * hunting they need to select a leader, each men boasts on how many fish, elk
		 * or other animals he can hunt.
		 * 
		 * Then they vote who will lead them.
		 * 
		 * A successful hunt for the leader is when they managed to hunt as much as he
		 * boasted and the hunting party managed to avoid a polar bear (nanuk) which can
		 * ruin a whole hunt.
		 * 
		 * Experienced hunters know of ways in the terrain to avoid polar bears, they
		 * use way stones to mark these areas.
		 * 
		 * The method nanuk has an ArrayList r which represents what the hunters found
		 * during the hunt. Tt can be a number of successful catches or the word
		 * "nanuk".
		 * 
		 * The int way_stones is the amount of way stones the leader knows to help him
		 * avoid nanuks. Each way stone will help avoid one nanuk
		 * 
		 * The int boast is the number representing the party leaders boast, if he gets
		 * less then this the hunt is considered "doomed".
		 * 
		 * return true if hunters had enough way_stones to avoid all nanuks. And they
		 * returned with successful hunt catches which should be more or equal to how
		 * many leader boasted before the hunt. return false if hunters encountered
		 * nanuk but did not have a way_stone to avoid it, or catches were less than
		 * boast count.
		 * 
		 * Example:
		 * 
		 * nanuk(["1","2","3","5"],0,5)
		 * 
		 * returns true (no nanuks, and catches are 11 which is more than 5 that leader
		 * boasted)
		 * 
		 * ----------
		 * 
		 * nanuk(["1","nanuk","3","5"],0,5)
		 * 
		 * returns false (They encountered nanuk but had 0 waystones)
		 * 
		 * ----------
		 * 
		 * nanuk(["1","3"],0,5)
		 * 
		 * returns false
		 *
		 * ----------
		 * 
		 * nanuk(["1","10","3","nanuk"],2,7)
		 * 
		 * returns true
		 * 
		 * ----------
		 * 
		 * nanuk(["1","10","3","nanuk","nanuk"],2,7)
		 * 
		 * returns true
		 * 
		 * ----------
		 * 
		 * nanuk(["1","10","3","nanuk","nanuk","nanuk"],2,7)
		 * 
		 * returns false
		 * 
		 * ---------
		 * 
		 * hint: use Integer.parseInt() to convert string to int, if its not a nanuk add
		 * the number to a "points" int and compare it to the boast after the loop is
		 * over.
		 * 
		 * if it is a nanuk and waypoints is bigger then 0 ignore the nanuk and reduce
		 * the number of waypoints.
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int stones = in.nextInt();
		int boast = in.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.next());
		}

		System.out.println(nanuk(list, stones, boast));

	}

	public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
		int ttl = 0;
		for (String value : r) {
			if (value.equals("nanuk")) {
				way_stones--;
			} else if (Character.isDigit(value.charAt(0))) {
				ttl += Integer.parseInt(value);
			}
		}
		if (way_stones >= 0 && ttl >= boast) {
			return true;
		} else {
			return false;
		}

	}

}
