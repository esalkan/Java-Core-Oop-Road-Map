package day_31_ArrayList;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _06_ArrayList_Example_ShoppingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating a shoppingList ArrayList
		ArrayList<String> shoppingList = new ArrayList<>();

		// Add the some items inside the shoppingList
		shoppingList.add("towel");
		shoppingList.add("soap");
		shoppingList.add("water");
		shoppingList.add("butter");
		shoppingList.add("cheese");
		shoppingList.add("milk");

		// print numbers of items
		int count = shoppingList.size();
		System.out.println(count);

		// print all items in single line
		System.out.println(shoppingList.toString());

		// Print first and last item in single line
		System.out.println(shoppingList.get(0) + "|" + shoppingList.get(count - 1));

		shoppingList.remove("towel");
		shoppingList.remove("cheese");

		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));

		shoppingList.remove(0);
		System.out.println(shoppingList.toString());

		// print each item
		for (String item : shoppingList) {
			System.out.println(item);
		}

		// remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());

	}

}
