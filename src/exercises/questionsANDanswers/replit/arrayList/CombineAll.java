package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class CombineAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a static method that:
		 * 
		 * is called combineAL
		 * 
		 * returns an ArrayList<String>
		 * 
		 * takes two parameters: an ArrayList of Strings called wordList1, and an
		 * ArrayList of Strings called wordList2
		 * 
		 * 
		 * This method should create a new ArrayList of Strings, add all the words (in
		 * order) from wordList1, then add all the words (in order) from wordList2. In
		 * other words, it is combining all the elements from the two parameters.
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int size2 = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.nextInt());
		}
		for (int i = 0; i < size2; i++) {
			list2.add(in.nextInt());
		}

		System.out.println(combineAL(list, list2));

	}

	public static ArrayList<String> combineAL(ArrayList<Integer> wordList1, ArrayList<Integer> wordList2) {

		ArrayList<String> newArr = new ArrayList<String>();

		for (Integer value : wordList1) {
			newArr.add(value.toString());
		}

		for (Integer value : wordList2) {
			newArr.add(value.toString());
		}

		return newArr;

	}

}
