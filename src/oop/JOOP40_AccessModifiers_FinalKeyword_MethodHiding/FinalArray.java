package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class FinalArray {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating a final int[] Array
		final int[] Teams = { 11, 11 };
		// Printing first index member
		System.out.println(Teams[0]);

		// Change the first index member
		Teams[0] = 15;
		// Print it again.
		System.out.println(Teams[0]);

		// Creating a new int[] Array and assign the members
		int[] nums = new int[] { 20, 20, 40 };

		// Creating a int[] array object, in memory reference is changing for nums
		// variable. This is totally fine.
		nums = new int[] { 11, 22, 33 };

		// Creating a final int[] Array Object and assign the members now. nums1 in the
		// memory creating an object array and reference point is snow to 1,3,5,7
		final int[] nums1 = new int[] { 1, 3, 5, 7 };
		// When we try to assign to any index new value for example index 0
		nums1[0] = 155; // This is totally fine

		// But when we try to create new Array Object which is access modifier is
		// assigned final we can not change reference. It will give error.
		// nums1 = new int[] { 1, 2, 3, 4 };
		// *** Arrays are objects and object variables are always references in Java.
		// When we declare an object variable as final, it means that the variable can
		// not be changed to refer to anything else.



	}
}
