package core.day_31_ArrayList;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _07_ArrayList_Example_AddAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating an ArrayList named pList1
		ArrayList<String> pList1 = new ArrayList<>();

		// Add somme values
		pList1.add("Java");
		pList1.add("Python");

		// Creating another ArrayList named pList2
		ArrayList<String> pList2 = new ArrayList<String>();

		// Add some values to pList2
		pList2.add("C");
		pList2.add("C#");
		pList2.add("C++");

		// Printing each pLists with toString() Method
		System.out.println(pList1.toString());
		System.out.println(pList2.toString());

		// Inside the pList2 add all of the pList1 values
		pList2.addAll(pList1);
		// Printing current pList2 after add pList1 to pList2
		System.out.println(pList2.toString());

		// Inside the pList1 add all of the pList2 values
		pList1.addAll(pList2);
		// Printing current pList1 after add pList2 to pList1
		System.out.println(pList1.toString());

	}

}
