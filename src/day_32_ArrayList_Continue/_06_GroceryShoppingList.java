package day_32_ArrayList_Continue;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _06_GroceryShoppingList {

	ArrayList<String> groceryList = new ArrayList<>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
			// System.out.println();
		}
	}

	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position + 1) + " has been modified");
	}

	public void removeGroceryItem(int position) {
		groceryList.remove(position);
	}

	public String findItem(String searchItem) {
		int position = groceryList.indexOf(searchItem);
		if (position >= 0) {
			return groceryList.get(position);
		}
		return null;
	}

}
