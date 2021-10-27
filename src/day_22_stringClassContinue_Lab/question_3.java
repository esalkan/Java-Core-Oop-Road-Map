/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author codesofmine
 *
 */
public class question_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method return a new string made of 3 copies of the last 2 chars of
		 * the original string. The string length will be at least 2. 
		 * 
		 * → extraEnd("Hello") → "lololo" 
		 * → extraEnd("ab") → "ababab" 
		 * → extraEnd("Hi") → "HiHiHi"
		 */

		extraEnd("Hello");
		System.out.println();
		extraEnd("ab");
		System.out.println();
		extraEnd("Hi");
	}

	private static void extraEnd(String string) {
		for(int i = 0; i < 3; i++) {
			System.out.print(string.substring(string.length()-2));
		}
		
	}

}
