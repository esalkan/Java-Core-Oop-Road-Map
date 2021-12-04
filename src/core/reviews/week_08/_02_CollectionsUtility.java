package core.reviews.week_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author esalkan
 *
 */
public class _02_CollectionsUtility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();

		list.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));

		System.out.println(list.size());

		// we can reverse this arrayList
		Collections.reverse(list);
		System.out.println("Reversed List : " + list);

		int freqOfChar = Collections.frequency(list, 'a');
		System.out.println("Frequency is : " + freqOfChar);

	}

}
