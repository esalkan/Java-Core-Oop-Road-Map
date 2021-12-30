package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Remove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * The next ArrayList method we are going to learn is .remove()
		 * 
		 * The .remove(i) method will remove the element at index i. This means that all
		 * elements after index i will be shifted back to fill the hole left by the
		 * removal.
		 * 
		 * Task: Finish the test method that will remove the first two elements in the
		 * given ArrayList of doubles (be careful, this is a little tricky!)
		 * 
		 * Example: Say you had an ArrayList called nums with values (6,2,3,1,9,2,5).
		 * 
		 * nums.remove(1);
		 * 
		 * will result in (6,3,1,9,2,5).
		 * 
		 * nums.remove(3);
		 * 
		 * will result in (6,3,1,5),
		 * 
		 * because after the first remove(3) is run, the 2 and 5 get pushed up into the
		 * 3rd and 4th index, and then the second remove(3) will remove the 2, leaving
		 * the 5.
		 */

		Scanner in = new Scanner(System.in);

		int size = in.nextInt();

		ArrayList<Double> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {

			list.add(in.nextDouble());

		}

		System.out.println(test(list));

	}

	public static ArrayList<Double> test(ArrayList<Double> dubs) {

		for (int i = 0; i < 2; i++) {
			dubs.remove(0);
		}
		
		return dubs;

	}

}
