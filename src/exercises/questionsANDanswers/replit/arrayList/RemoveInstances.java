package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class RemoveInstances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * This method gets an Arraylist of Integers and a number(Integer). It returns
		 * an Arraylist.
		 * 
		 * It removes any instance of the given number from the Arraylist.
		 * 
		 * Example:
		 * 
		 * romoveInst([1,1,2,3,1,4],1)
		 * 
		 * returns: [2,3,4]
		 * 
		 * romoveInst([3,4,3,3],4)
		 * 
		 * returns: [3,3,3]
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.nextInt());
		}

		System.out.println(removeInst(list, n));

	}

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (Integer value : r) {
			if (!value.equals(n)) {
				result.add(value);
			}
		}
		return result;
	}

}
