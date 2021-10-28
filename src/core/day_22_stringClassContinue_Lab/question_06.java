/**
 * 
 */
package core.day_22_stringClassContinue_Lab;

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
		 * withoutEnd("Hello") → "ell" withoutEnd("java") → "av" withoutEnd("coding") →
		 * "odin"
		 */
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("python"));
		System.out.println(withoutEnd("justTest"));
	}

	public static String withoutEnd(String string) {
		String result = string.substring(1, string.length() - 1);
		return result;
	}
}
