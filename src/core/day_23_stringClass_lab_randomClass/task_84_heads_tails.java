/**
 * 
 */
package core.day_23_stringClass_lab_randomClass;

import java.util.Random;

/**
 * @author esalkan
 *
 */
public class task_84_heads_tails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ten coin tosses, one after the after. Each time the program simulates a coin
		 * toss, it should randomly display either “Heads” or “Tails”
		 */

		Random rndm = new Random();

		for (int i = 0; i < 10; i++) {
			int num = rndm.nextInt(2);
			if (num == 0) {
				System.out.println((i + 1) + ". try is : Heads");
			} else {
				System.out.println((i + 1) + ". try is : Tails");
			}
		}

	}

}
