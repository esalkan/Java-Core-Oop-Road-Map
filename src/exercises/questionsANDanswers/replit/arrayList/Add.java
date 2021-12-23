package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * We will be manipulating elements of an ArrayList by using List methods.
		 * 
		 * The first List method we will learn is .add()
		 * 
		 * The following code will take an ArrayList of Strings called strs and add
		 * "Hello" to it.
		 * 
		 * strs.add("Hello");
		 * 
		 * The syntax is:
		 * 
		 * arraylistvariable.add(data_to_add);
		 * 
		 * In the test() method, add three names (any names) to the ArrayList called
		 * names.
		 */

		System.out.println(test().size());
	}

	public static ArrayList<String> test() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Eyüp");
		names.add("Sabri");
		names.add("Alkan");

		return names;
	}

}
