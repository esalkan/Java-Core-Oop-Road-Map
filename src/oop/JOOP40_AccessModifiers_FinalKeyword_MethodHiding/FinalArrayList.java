package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

import java.util.ArrayList;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class FinalArrayList {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * final arrayList
		 * 
		 * • Follows same rules of arrays
		 * 
		 * • We can remove or update any values
		 * 
		 * • We can not re-assign it to another object using new keyword
		 */

		// We Create an array list and colors reference is have place in memory now.
		final ArrayList<String> colors = new ArrayList<>(); // ArrayList object reference created in memory for colors.
		colors.add("Blue");
		colors.add("Orange");

		// When we create new ArrayList Object, it will give error. Because we can not
		// place new Object which is already created before. reference will not change.
		// colors = new ArrayList<String>(); // That will give error.
	}
}
