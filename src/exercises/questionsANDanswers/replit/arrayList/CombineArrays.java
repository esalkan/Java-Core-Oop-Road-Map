package exercises.questionsANDanswers.replit.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class CombineArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Finish the combineRs method to combine the two given String arrays into one
		 * arraylist and return the arraylist.
		 * 
		 * for example:
		 * 
		 * combineRs(["f","o","o"],[" b","a","r"])
		 * 
		 * returns [f, o, o, b, a, r]
		 * 
		 * combineRs(["f","o","o"],[" b","a","r"])
		 * 
		 * returns [f, o, o, b, a, r]
		 * 
		 * combineRs(["1","2","3"],["4"])
		 * 
		 * returns [1, 2, 3, 4]
		 */

		Scanner in = new Scanner(System.in);
		String[] strs = new String[in.nextInt()];
		String[] strs2 = new String[in.nextInt()];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = in.next();
		}
		for (int i = 0; i < strs2.length; i++) {
			strs2[i] = in.next();
		}

		System.out.println(combineRs(strs, strs2));
	}

	public static ArrayList<String> combineRs(String[] r1, String[] r2) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < r1.length; i++) {
			result.add(r1[i]);
		}
		
		for (int i = 0; i < r2.length; i++) {
			result.add(r2[i]);
		}
		
		return result;

	}

}
