package core.JC25_Arrays_Part_2;

import java.util.Random;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_task_91_RandomArrayNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create an array with 10 elements
		 * 
		 * Initialize each array element with random values between 0 and 100 but less
		 * than 100
		 * 
		 * Print each array element
		 */

		int[] nums = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
