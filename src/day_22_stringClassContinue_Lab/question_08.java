/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Given a string, return a "rotated left 2" version where the first 2 chars are
		 * moved to the end. The string length will be at least 2. 
		 * 
		 * left2("Hello") → "lloHe" 
		 * left2("java") → "vaja" 
		 * left2("Hi") → "Hi"
		 */

		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("Hi"));
		System.out.println(left2("HelloJava"));
		System.out.println(left2("PythonHello"));
	}

	public static String left2(String string) {
		String result = string.substring(2).concat(string.substring(0,2));
		return result;
		
	}
}
