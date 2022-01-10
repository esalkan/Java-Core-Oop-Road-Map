package reviews.review07;

import java.util.ArrayList;

public class R08_ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(100);  // Declare
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(250);
		nums.add(250);
		nums.add(400);
		
		System.out.println(nums);
		
		System.out.println(nums.size()); // the size of the arraylist as integer
		
		System.out.println(nums.get(2));
		
		nums.add(2, 250);            // to add at a certain index
		System.out.println(nums);
		
		nums.remove(nums.size()-1); // remove the last element from the list, with index
		nums.remove(nums.get(nums.size()-1)); // this is removing with value
		System.out.println(nums);
		nums.remove(Integer.valueOf(300)); // this one removes with the object value
		System.out.println(nums);
		
	
		boolean b1 = nums.contains(250);
		System.out.println(b1);
		
		
		
	}
}
