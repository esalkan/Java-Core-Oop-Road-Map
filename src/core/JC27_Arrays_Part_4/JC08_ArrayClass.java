/**
 * 
 */
package core.JC27_Arrays_Part_4;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class JC08_ArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ARRAY CLASS
		 * 
		 * The Arrays class in java.util package is a part of the Java Collection
		 * Framework. This class provides static methods to dynamically create and
		 * access Java arrays. It consists of only static methods and the methods of
		 * Object class. The methods of this class can be used by the class name itself.
		 */

		int[] nums = { 4, 61, 54, 1981, 541, 1923, 571, 1453, 41 };
		int[] nums1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		int[] nums2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };

		System.out.println("+----- toString(originalArray) -----+");
		/**
		 * It returns a string representation of the contents of this array. The string
		 * representation consists of a list of the array’s elements, enclosed in square
		 * brackets (“[]”). Adjacent elements are separated by the characters a comma
		 * followed by a space. Elements are converted to strings as by String.valueOf()
		 * function.
		 */
		System.out.println(Arrays.toString(nums));

		System.out.println("\n+----- equals(array1, array2) -----+");
		/**
		 * Checks if both the arrays are equal or not.
		 */
		System.out.println(Arrays.equals(nums1, nums2));

		System.out.println("\n+----- sort(originalArray) -----+");
		/**
		 * Sorts the complete array in ascending order. Firts Numbers, Second Capital
		 * Letters, Thirt small letters...
		 * 
		 * sort(originalArray, fromIndex, endIndex) : Sorts the specified range of array
		 * in ascending order.
		 * 
		 * sort(T[] a, int fromIndex, int toIndex, Comparator< super T> c) : Sorts the
		 * specified range of the specified array of objects according to the order
		 * induced by the specified comparator.
		 * 
		 * sort(T[] a, Comparator< super T> c) : Sorts the specified array of objects
		 * according to the order induced by the specified comparator.
		 */
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		String[] lang = { "Turkish", "English", "arabic", "1Russian", "Zulu" };
		Arrays.sort(lang);
		System.out.println(Arrays.toString(lang));

		System.out.println("\n+----- binarySearch() -----+");
		/**
		 * Searches for the specified element in the array with the help of the Binary
		 * Search Algorithm
		 */
		int[] numsX = { 4, 61, 54, 1981, 541, 1923, 571, 1453, 41 };
		System.out.println(Arrays.binarySearch(numsX, 61));
		System.out.println(Arrays.binarySearch(numsX, 54)); // -2 (-(insertionPoint)-1)
		System.out.println(Arrays.binarySearch(numsX, 41));

		System.out.println("\n+----- copyOf(original, newLength) -----+");
		/**
		 * Copies the specified array, truncating or padding with the default value (if
		 * necessary) so the copy has the specified length.
		 */

		double[] d1 = { 2.3, 4.5, 12.4 };
		double[] d2 = d1;

		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

		// this way is not copy anything to another list
		d1[0] = 100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

		d2[1] = 400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

		double[] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));

		d2[0] = 5.2;
		System.out.println("d2" + Arrays.toString(d2));
		System.out.println("d3" + Arrays.toString(d3));

	}

}
