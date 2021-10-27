/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Given 2 strings, a and b, return a string of the form short+long+short, with
		 * the shorter string on the outside and the longer string on the inside.
		 * 
		 * comboString("Hello", "hi") → "hiHellohi" 
		 * comboString("hi", "Hello") → "HellohiHello" 
		 * comboString("aaa", "b") → "baaab"
		 * 
		 */

		comboString("Hello", "hi");
		comboString("hi", "Hello");
		comboString("aaa", "b");
		comboString("Just", "Test");
		
	}
	
	public static void comboString(String str1, String str2) {
		String result = str2.concat(str1) + str2;
		System.out.println(result);
	}

}
