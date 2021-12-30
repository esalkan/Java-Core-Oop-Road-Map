package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class RepeatAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Create a static method that:
		 * 
		 * is called repeatAll returns nothing takes in a single parameter - an
		 * ArrayList of Booleans This method should modify its ArrayList parameter by
		 * repeating its ArrayList values.
		 * 
		 * This method should modify its ArrayList parameter by repeating its ArrayList
		 * values.
		 * 
		 * For example, if the parameter is
		 * 
		 * (true, false, false)
		 * 
		 * The modified ArrayList should be
		 * 
		 * (true, false, false, true, false, false)
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter ArrayList Size : ");
		int size = in.nextInt();
		System.out.println("Please Enter ArrayList Elements (Just Boolean Accepted )  : ");
		ArrayList<Boolean> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(in.nextBoolean());
		}

		repeatAll(list);

	}

	public static void repeatAll(ArrayList<Boolean> arrList) {
		
		ArrayList<Boolean> newArrList = new ArrayList<Boolean>();
		
		for (int i = 0; i < arrList.size(); i++) {
			newArrList.add(arrList.get(i));
		}
		newArrList.addAll(newArrList);
		System.out.println(newArrList);
	}

}
