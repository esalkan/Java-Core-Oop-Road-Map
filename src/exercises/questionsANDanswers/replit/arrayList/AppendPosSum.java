package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class AppendPosSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a static method that:
		 * 
		 * ** is called appendPosSum
		 * 
		 * ** returns an ArrayList of Integers
		 * 
		 * ** takes one parameter: an ArrayList of Integers
		 * 
		 * This method should:
		 * 
		 * ** Create a new ArrayList of Integers
		 * 
		 * ** Add only the positive Integers to the new ArrayList
		 * 
		 * ** Sum the positive Integers in the new ArrayList and add the Sum as the last
		 * element
		 * 
		 * For example, if the incoming ArrayList contains the Integers
		 * (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14),
		 * with 14 being the sum of (4,3,4,3). The original ArrayList should remain
		 * unchanged.
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ArrayList size : ");
		int size = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.nextInt());
		}

		System.out.println(appendPosSum(list));

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int sum = 0;
		for (Integer value : list) {
			if (value > 0) {
				result.add(value);
				sum += value;
			}
		}

		result.add(sum);
		return result;
	}

}
