package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TwoTimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method that:
		 * 
		 * ** is called twoTimes
		 * 
		 * ** returns a new ArrayList of Integers
		 * 
		 * ** takes in a single parameter - an ArrayList of Integers
		 * 
		 * This method should create a new ArrayList of Integers that contains every
		 * value of the ArrayList parameter repeated twice.
		 * 
		 * For example, if the parameter is
		 * 
		 * (1,5,3,7)
		 * 
		 * The method should return a new ArrayList of Integers with
		 * 
		 * (1,1,5,5,3,3,7,7)
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.nextInt());
		}
		System.out.println(twoTimes(list));

	}

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrList) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < arrList.size(); i++) {
			for (int j = 0; j < 2; j++) {
				result.add(arrList.get(i));
			}
		}

		return result;
	}

}
