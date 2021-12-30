package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class RemoveEveryOthers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method that:
		 * 
		 * is called removeEveryOther returns ArrayList of Strings takes in a single
		 * parameter - an ArrayList of Strings called words This method should take the
		 * ArrayList parameter and modify it by removing every other element in the
		 * list, starting with removing the 0th element.
		 * 
		 * For example, if the parameter is:
		 * 
		 * ("hi","yo","sup","yolo","book")
		 * 
		 * The modified ArrayList should be:
		 * 
		 * ("yo","yolo")
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.next());
		}

		System.out.println(removeEveryOther(list));

	}

	public static ArrayList<String> removeEveryOther(ArrayList<String> words) {
		words.remove(0);
		int count = words.size() / 2;

		boolean flag = true;
		for (int i = 0; i < count; i++) {
			if (flag) {
				words.remove(1);
				flag = !(flag);
			} else {
				words.remove(2);
			}
		}
		return words;
	}
}
