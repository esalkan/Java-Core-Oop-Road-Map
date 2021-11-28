package core.reviews.week_07;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _02_CharArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] alphabet = new int[26];
		// 97 is the value of 'a' in ASCII Table

		// alphabet['l'-97] = alphabet['l'-97]+1;
		// alphabet['i'-97] = alphabet['i'-97]+1;
		// alphabet['s'-97] = alphabet['s'-97]+1;

		String word = "listen";
		for (char each : word.toCharArray()) {
			alphabet[each - 97] = alphabet[each - 97] + 1; // for letter 'c': 99
			// alphabet[2]=alphabet[2]+1
		}
		System.out.println(Arrays.toString(alphabet));

		String word2 = "filent";
		for (char each : word2.toCharArray()) {
			alphabet[each - 97] = alphabet[each - 97] - 1;
		}
		System.out.println(Arrays.toString(alphabet));

		int[] check = new int[26];

		System.out.println("Are my words angaram : " + Arrays.equals(alphabet, check));

	}

}
