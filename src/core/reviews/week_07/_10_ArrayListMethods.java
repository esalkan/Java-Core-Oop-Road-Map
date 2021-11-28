package core.reviews.week_07;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _10_ArrayListMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> codes = new ArrayList<>(
				Arrays.asList("OK", "Created", "Forbidden", "OK", "Unauthorized", "Created"));

		System.out.println(removeDuplicate(codes));

	}

	public static ArrayList<String> removeDuplicate(ArrayList<String> list) {
		ArrayList<String> nonDuplicate = new ArrayList<>(); // create an empty ArrayList to hold my nonduplicate values
		/*
		 * for(String each : list) { if(!nonDuplicate.contains(each)) { // if it does
		 * not contain it will go inside the IF STATEMENT nonDuplicate.add(each); } }
		 */
		for (String each : list) {
			if (nonDuplicate.contains(each)) { // if it does not contain it will go inside the IF STATEMENT
				continue;
			}
			nonDuplicate.add(each);
		}
		return nonDuplicate;
	}
}
