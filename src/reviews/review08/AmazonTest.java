package reviews.review08;

import java.util.ArrayList;
import java.util.Collections;

public class AmazonTest {

	public static void main(String[] args) {
		
		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Item("Sony Vaio i7",950.0,10));
		items.add(new Item("Lenove", 800.0, 20));
		items.add(new Item("LG Ultrawide monitor", 450.0, 13));
		items.add(new Item("HP Laptop",750.0 , 24));
		
		// the value of my inventory 
		double valueOfInventory = 0;
		// largest quantity of product 
		int largestQuantity = 0;
		String nameOfLargest = "";
		
		ArrayList<Integer> quantities = new ArrayList<>();
		for(Item each: items) {
			valueOfInventory += each.calCost();
			if(each.quantity>largestQuantity) {
				largestQuantity=each.quantity;
				nameOfLargest = each.name;
			}
			quantities.add(each.quantity);
		}
		
		System.out.println("Value of inventory :"+valueOfInventory);
		System.out.println("Item with largest amount : "+nameOfLargest+" and quatity : "+largestQuantity);

	System.out.println(Collections.max(quantities));	
		
	}

}
