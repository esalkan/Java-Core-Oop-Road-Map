/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a string, return a version without the first and last char, so "Hello"
		 * yields "ell". The string length will be at least 2. 
		 * 
		 * withoutEnd("Hello") → "ell" 
		 * withoutEnd("java") → "av" 
		 * withoutEnd("coding") → "odin"
		 */

		withoutEnd("Hello");
		withoutEnd("java");
		withoutEnd("coding");
		withoutEnd("python");
		withoutEnd("justTest");
	}

	private static void withoutEnd(String string) {
		String result = string.substring(1, string.length()-1);
		System.out.println(result);
	}

}
