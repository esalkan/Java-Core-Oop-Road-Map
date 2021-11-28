package core.reviews.week_06;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _12_MakeEnds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 14, 5, 60, 9 };
		System.out.println(Arrays.toString(takeEnds(x)));
		String[] arr = { "OK", "Not Found", "Forbidden", "Created" };
		System.out.println(Arrays.toString(takeEnds(arr)));// method overloading

	}

	public static int[] takeEnds(int[] arr) {
		int[] arr2 = new int[2];

		arr2[0] = arr[0];
		arr2[1] = arr[arr.length - 1];

		return arr2;
	}

	public static String[] takeEnds(String[] arr) {
		String[] arr2 = new String[2];

		arr2[0] = arr[0];
		arr2[1] = arr[arr.length - 1];

		return arr2;
	}

}
