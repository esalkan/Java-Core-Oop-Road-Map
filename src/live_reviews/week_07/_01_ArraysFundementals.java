/**
 * 
 */
package live_reviews.week_07;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _01_ArraysFundementals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Until so far we were single data or variables	
		 */
				
		int count;


		String city = "New York";
		String city2 = 	"Ankara";
		String city3 = "London";
		
		//declare and specify the size, then assign values.
		// This way is good to use when we know the count of items, but we do not know the values yet.
		
		String [] cities = new String [3];
		cities[0]="New York";
		cities[1]="Ankara";
		cities[2]="London";

		// Declare and assign value in the same statement. This is good when we already have data to assign to 
		// our array.      first one: 0       1      2
		
		String[] citiesMore = { "Istanbul","Baku","Berlin"};
		
		// third way
		String[] citiesEvenMore = new String[] {"Izmir","Amsterdam","Venice"};

		
		// to find out how many elements in the array we length method
		System.out.println("The size of citiesMore : "+ citiesMore.length);

		System.out.println("If you want to reach first element of citiesMore : "+ citiesMore[0]);
																			// the index : 2 	
		System.out.println("if you want the last element : " + citiesMore[citiesMore.length-1]);
				
				count = citiesMore[0].length(); 
				System.out.println("The size of the first element of citiesMore : "+ count);

		// Default Values of array data types
				int [] arr1 = new int[3];
		// for int : 0
		// for double : 0.0, String : null		
		// if you want to print out an array we Arrays.toString from Arrays class		
				System.out.println(Arrays.toString(arr1)); // [0, 0, 0]
				
				
			}
			



}
