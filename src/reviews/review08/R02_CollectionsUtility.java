package reviews.review08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class R02_CollectionsUtility {

	public static void main(String[] args) {
	
		ArrayList<Character> list = new ArrayList<>();
		
		list.addAll(Arrays.asList('j','a','v','a','&', 'i','s','$','f','u','n'));
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		// we can reverse this arraylist
		Collections.reverse(list);
		System.out.println("Reversed list : "+list);
		
		// frequency method that helps to look for an element
		int freOfChar = Collections.frequency(list, 'a');
		System.out.println(freOfChar);
		
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.addAll(Arrays.asList(10,35,100,-23,1000,564));
		
		System.out.println("Max Number : "+ Collections.max(nums));
		System.out.println("Min number : "+ Collections.min(nums));
		

		// max and min for characters
		System.out.println("Max Char : "+ Collections.max(list));
		System.out.println("Min Char : "+ Collections.min(list));
		
	}

}
