package day_32_ArrayList_Continue;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _03_EqualMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating 2 ArrayList Object
		ArrayList<String> friends1 = new ArrayList<>();
		ArrayList<String> friends2 = new ArrayList<>();

		friends1.add("Mike");
		friends1.add("Smith");
		friends1.add("Jhon");
		friends1.add("Tommy");

		friends2.add("Mike");
		friends2.add("Smith");
		friends2.add("John");
		friends2.add("Tommy");

		System.out.println("Friends1 ArrayList : " + friends1);
		System.out.println("Friends2 ArrayList : " + friends2);

		if (friends1.equals(friends2)) {
			System.out.println("Same Friends");
		} else {
			System.out.println("Different Friends.");
		}

		// Here we are checking references point elements can be same but references are
		// different thats why it is false
		System.out.println(friends1 == friends2);
		
		

	}

}
