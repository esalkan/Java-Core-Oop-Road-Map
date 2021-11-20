package day_30_wrapperClass.AssignmentOnArray;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class Question_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a Java program to store numbers 1 to 10 in an array using data
		 * instantiation. Then write a for loop to multiply each member of above array
		 * by 19, this way you will get table of 19 stored in the above array. Finally
		 * write another for loop to print all the array elements.
		 * 
		 * You should get following output:
		 * 
		 * 19
		 * 
		 * 38
		 * 
		 * 57
		 * 
		 * 76
		 * 
		 * 95
		 * 
		 * 114
		 * 
		 * 133
		 * 
		 * 152
		 * 
		 * 171
		 * 
		 * 190
		 */
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			nums.add(i);
		}
		
		
		for (int i = 1; i <= nums.size(); i++) {
			System.out.println(i*19);
		}

	}

}
