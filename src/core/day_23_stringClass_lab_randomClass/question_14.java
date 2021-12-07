/**
 * 
 */
package core.day_23_stringClass_lab_randomClass;

/**
 * @author esalkan
 *
 */
public class question_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * 
		 * Given a string, return true if it ends in "ly".
		 * 
		 * endsLy("oddly"); -> true
		 * 
		 * endsLy("y") -> false
		 * 
		 */

		System.out.println("Me : " + endsLy("olleyyaaly"));

		String str = "oddly";

		if (str.length() < 2) {
			System.out.println(false);
			return;
		}

		if (str.substring(str.length() - 2).equals("ly")) {
			System.out.println("Ozzy : " + true);
		} else {
			System.out.println(false);
		}

	}

	public static String endsLy(String str) {

		int lastTwo = str.length() - 2; // find last two char index number

		if (str.length() < 2) {
			return "false"; // break program and return to the main method
		} else if (str.substring(lastTwo, str.length()).contains("ly")) { // check the condition
			return "true";
		} else {
			return "false";
		}
	}

}
