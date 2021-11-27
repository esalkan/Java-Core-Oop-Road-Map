package core.reviewsA.week_08;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _01_CharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] letters = { 'l', 'i', 's', 't', 'e', 'n' };

		for (char each : letters) {
			System.out.print(each + " ");
		}
		System.out.println();

		// what are Strings ? sequence of chars, collection of chars

		String word = new String(letters);// it will make more sense when you learn constructors
		System.out.println(word);

		String word2 = "silent";

		char[] letters2 = word2.toCharArray(); // String method, turns string into array of chars

		System.out.println(Arrays.toString(letters2));

		for (char each : word2.toCharArray()) {
			System.out.print(each + " ");
		}
	}

}
