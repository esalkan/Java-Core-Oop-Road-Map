package day_31_ArrayList;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _05_ArrayList_Example_Cities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating an ArrayList named with cities
		ArrayList<String> cities = new ArrayList<>();

		// Add values to the cities ArrayList
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("İzmir");
		cities.add("Baku");
		cities.add("Moscow");
		cities.add("New York");

		System.out.println("+----- ----- o ----- -----+");
		// Printing cities list with toString() Method
		System.out.println(cities.toString());

		// Printing each city by using for-each loop seperated by space
		for (String city : cities) {
			System.out.println(city + " ");
		}

		System.out.println("+----- ----- o ----- -----+");

		// Print each city by using for-iterator loop
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("+----- ----- o ----- -----+");
		// Remove a list member
		System.out.println("Removing Baku");
		cities.remove("Baku");
		// Remove another list member
		cities.remove("New York");
		// Printing the cities list
		System.out.println(cities.toString());

		System.out.println("+----- ----- o ----- -----+");
		// Add to specific index some cities
		cities.add(0, "Osaka");
		cities.add(1, "Kazan");

		System.out.println(cities.toString());

		// Add another citiy to index 2
		cities.add(2, "Trabzon");

		System.out.println(cities.toString());

		System.out.println("+----- ----- o ----- -----+");

		// Checking istanbul value index number
		int idx = cities.indexOf("Istanbul");
		// printing city index number // it is index number 3
		System.out.println(idx);

		// Bursa is not in cities list and indexOf() Method will return -1 because Bursa
		// is not memmber of cities ArrayList
		System.out.println(cities.indexOf("Bursa"));

		System.out.println("+----- ----- o ----- -----+");

		// Clear, delete, remove all of the cities members from the cities ArrayList
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);

	}

}
