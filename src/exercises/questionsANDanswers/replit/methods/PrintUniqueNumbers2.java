package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class PrintUniqueNumbers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Complete a void method printUniqueNumbers() that will print all unique
		 * numbers from an array of ints. Every single unique int should be printed from
		 * the new line. `Example:`
		 * 
		 * `input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
		 * 
		 * `output:`
		 * 
		 * `2` `2` `9` `9` `34`
		 */

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);

	}

	public static void printUniqueNumbers(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}
		}

	}

}
