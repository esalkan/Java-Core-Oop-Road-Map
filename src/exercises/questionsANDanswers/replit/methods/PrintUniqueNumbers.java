package exercises.questionsANDanswers.replit.methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PrintUniqueNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Write a void method printUniqueNumbers that will print unique numbers from an
		 * array of ints.`
		 * 
		 * Example:
		 * 
		 * input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
		 * 
		 * output: 2 9 34
		 */

//		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		int[] nums = new int[size];
//		for (int i = 0; i < size; i++) {
//			nums[i] = scan.nextInt();
//		}

		int[] nums = { 2, 5, 5, 6, 3, 6, 9, 34, 3 };
		printUniqueNumbers(nums);


	}
	
	public static void printUniqueNumbers(int[] nums) {
		// Creating new array to store unique numbers
		int[] uniqueNums = new int[nums.length];
		
		// Enterin a loop to check each element
		for (int i = 0; i < nums.length; i++) {
			int countArrayMembers = 0;
			// comparing each member with others
			for (int j = 0; j < nums.length; j++) {
				// count the numbers of array members exist
				if (nums[i] == nums[j]) {
					countArrayMembers++;
				}
			}
			
			// If member is unique
			if (countArrayMembers == 1) {
				uniqueNums[i] = nums[i];
			}
		}
		
		// printing member value which is not 0
		for (int value : uniqueNums) {
			if (value != 0 ) {
				System.out.println(value);
			}
		}
		
	}

}
