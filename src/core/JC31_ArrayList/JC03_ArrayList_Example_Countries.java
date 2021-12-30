package core.JC31_ArrayList;

import java.util.ArrayList;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_ArrayList_Example_Countries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Countries
		// Print size arrayList
		// read couple of elements

		// Creating a String ArrayList
		ArrayList<String> countries = new ArrayList<>();

		// Add some members to the countries ArrayList
		countries.add("Turkey");
		countries.add("Azerbaijan");
		countries.add("Turkmenistan");
		countries.add("Turkestan");

		// Printing ArrayList Size
		System.out.println("Number of values: " + countries.size());

		System.out.println();

		// Printing countries ArrayList as an Array
		System.out.println(countries.toString());

		System.out.println();

		// Add a New Member to the countries ArrayList
		countries.add("Russian");

		// Printing countries ArrayList as an Array
		System.out.println(countries.toString());

		// Printing after add new member and show the current size of the countries
		// ArrayList
		System.out.println("Number of values After Add Russia : " + countries.size());

		System.out.println();

		// Remove index 2 'Turkmenistan' from ArrayList
		countries.remove(2);

		// After remove print the current ArrayList members as an Array
		System.out.println(countries.toString());
		System.out.println("Number of values After remove 'Turkmenistan' : " + countries.size());

	}

}
