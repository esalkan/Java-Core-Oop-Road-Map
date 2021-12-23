package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class TimesTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method that:
		 * 
		 * is called timesTwo returns an ArrayList of Integers takes in a single
		 * parameter - an ArrayList of Integers called nums This method should take the
		 * ArrayList parameter and multiply every value by two.
		 */

		Scanner in = new Scanner(System.in);
		// Belov code added extra
		System.out.println("Please Enter The ArrayList Size : ");
		int size = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		// Belov code added extra
		System.out.println("Please Enter The ArrayList Elements : ");
		for (int i = 0; i < size; i++) {
			list.add(in.nextInt());
		}

		System.out.println(timesTwo(list));

	}

	public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			result.add(nums.get(i) * 2);
		}
		return result;

	}

}
