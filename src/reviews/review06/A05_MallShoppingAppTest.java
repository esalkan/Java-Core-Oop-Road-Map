package reviews.review06;

import java.util.Arrays;

public class A05_MallShoppingAppTest {

	public static void main(String[] args) {
		
	String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
	double [] prices={99.99,    150.0,     9.99,     179.99,   249.9,      39.99   } ;
	int[] itemIDs = { 12345,     12346,     12347,     12348,   12349,      12350   };
	
System.out.println("-----Find the index of 'Gloves' in the ietms------");	
	
//	System.out.println(Arrays.binarySearch(items, "Gloves"));
// for loop, for each loop
System.out.println("----for each loop------");
int j = 0;
for (String item: items) {
	if(item.equals("Gloves")) {
		System.out.println("index of the item : "+ j);
	}
	j++;
}
System.out.println("-----for loop example------");
for(int i=0; i<items.length; i++) {
	if(items[i].equals("Gloves")) {
		System.out.println("index of the item : "+ i);
	}
}

System.out.println("-----Set a boolean variable true if 'iPad' is found-----");
	boolean iPadexists=false;
	for (String item : items ) {
		if(item.equalsIgnoreCase("iPad")) {
			iPadexists = true;
			break;  // to get out of my loop when I find it
		}
	}
	System.out.println("Boolean variable : "+ iPadexists);
//	System.out.println(Arrays.toString(items).contains("iPad"));
//	System.out.println(Arrays.toString(items).toLowerCase().contains("IPAD".toLowerCase()));

System.out.println("---print a report of each shopping item ------");
// shoes  - 99.9 Euros  - #12345	
	for (int i=0; i<items.length;i++) {
		System.out.println(items[i]+" - "+ prices[i]+ " Euros - #" +itemIDs[i] );
	}

System.out.println("------Look for 'Jacket' in the items and print all details--------");	
for (int i=0; i<items.length;i++) {
	if(items[i].equals("Jacket")) {  // we are putting our condition
	System.out.println(items[i]+" - "+ prices[i]+ " Euros - #" +itemIDs[i] );
	}
}
	
	}
	
}
