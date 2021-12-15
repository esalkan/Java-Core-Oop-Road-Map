/**
 * 
 */
package core.JC23_stringClass_stringManipulation_randomClass;

/**
 * @author esalkan
 *
 */
public class JCquestion_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Given a string, return a string length 2 made of its first 2 chars. If the
		 * string length is less than 2, use '@' for the missing chars.
		 * 
		 * atFirst("hello") → "he" atFirst("hi") → "hi" atFirst("h") → "h@"
		 */

		System.out.println(atFirst("Hi"));

	}

	public static String atFirst(String str) {

		String result = null;

		if (str.length() < 2) {
			str = str.concat("@");
			result = str;
		} else if (str.substring(0, 1).equals(str.substring(0, 1))) {
			result = str.substring(0, 2);
		}

		return result;
	}
}
