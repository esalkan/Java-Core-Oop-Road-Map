package core.day_31_ArrayList;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class _04_ArrayList_Example_RemoveInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating a new Integer ArrayList and named it as nums
		ArrayList<Integer> nums = new ArrayList<>();

		// Check the nums ArrayList size (members of the ArrayList count)
		System.out.println(nums.size());

		// Checking is ArrayList have any member or not it returns boolean true or false
		System.out.println(nums.isEmpty());

		// checking is ArrayList have any member with some condition return type is
		// boolean true or false
		System.out.println(nums.size() == 0);

		// Add new values to the ArrayList
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);

		// Print the ArrayList as Array with toString() Method
		System.out.println(nums.toString());

		// Remove the spficied index number from the ArrayList
		nums.remove(5);

		// Print the ArrayList as Array with toString() Method
		System.out.println(nums.toString());

		// Converting primitive to object
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);

		// Remove the specified element from the list
		nums.remove(n1);

		System.out.println(nums.toString());

		// Remove the specified element from the list
		nums.remove(new Integer(4));

		// Print the ArrayList as Array with toString() Method
		System.out.println(nums.toString());

	}

}
