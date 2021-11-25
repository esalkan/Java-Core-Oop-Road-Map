/**
 * 
 */
package core.day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class _09_stringContaions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * contains()
		 * 
		 * --> contains() method searches the sequence of characters in this string. It
		 * returns true if sequence of char values are found in this string otherwise
		 * returns false.
		 */

		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		System.out.println();

		String list = "Desktop PC, Note Book, Tablet, Raspberry PI, Ardunio";

		if (list.contains("Tablet")) {
			System.out.println("Tablet is in the list");
		} else {
			System.out.println("Tablet is not in the list");
		}

		System.out.println();

		boolean hasArdunio = list.contains("Ardunio");
		System.out.println("Contains Ardunio is : " + hasArdunio);

		System.out.println();

		boolean hasIpad = list.contains("Ipad");
		System.out.println("Contains Ipad is : " + hasIpad);

		System.out.println();

		if (email.contains("@gmail")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}

		System.out.println();

		String trendyolTitle = "Pc | Trendyol";
		if (trendyolTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		} else {
			System.out.println("Pipe is not detected");
		}
	}

}
