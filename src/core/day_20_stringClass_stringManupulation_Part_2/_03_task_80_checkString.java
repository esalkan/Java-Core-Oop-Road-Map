/**
 * 
 */
package core.day_20_stringClass_stringManupulation_Part_2;

/**
 * @author esalkan
 *
 */
public class _03_task_80_checkString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts 2 strings(str1,str2) and prints the position
		 * index of the str2
		 * 
		 * if str2 is existing in str1.
		 * 
		 * If it doesn’t exist, print “not found”
		 * 
		 * checkedString(“Your order confirmation number is XYZ”, “confirmation”);
		 */

		checkString("Your order confirmation number is XYZ", "confirmation");

	}

	public static void checkString(String str1, String str2) {
		if (str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
		} else {
			System.out.println("No Found");
		}
	}

}
