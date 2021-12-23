package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class SetAndGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * The next two methods are .size() and .get().
		 * 
		 * If we have an ArrayList called someList and an Array called arr, these two do
		 * the same thing:
		 * 
		 * someList.size()
		 * 
		 * arr.length
		 * 
		 * In other words, .size() returns the length (size) of the list.
		 * 
		 * The method .get(i) will return the element found at index i. The following
		 * two expressions also do the same thing:
		 * 
		 * someList.get(4)
		 * 
		 * arr[4]
		 * 
		 * Task: Given an ArrayList of Integers called nums, find and return the sum of
		 * all the numbers in the list
		 */

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {

			list.add(in.nextInt());

		}

		System.out.println(sum(list));

	}

	public static int sum(ArrayList<Integer> nums) {

		int sum = 0;

		for (Integer value : nums) {

			sum += value;

		}

		return sum;
	}

}
