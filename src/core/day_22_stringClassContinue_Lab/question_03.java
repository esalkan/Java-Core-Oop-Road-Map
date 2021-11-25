/**
 * 
 */
package core.day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create a method return a new string made of 3 copies of the last 2 chars of
		 * the original string. The string length will be at least 2.
		 * 
		 * → extraEnd("Hello") → "lololo" → extraEnd("ab") → "ababab" → extraEnd("Hi") →
		 * "HiHiHi"
		 */

		extraEnd("Hello");
		System.out.println();
		extraEnd("ab");
		System.out.println();
		extraEnd("Hi");
	}

	private static void extraEnd(String string) {
		for (int i = 0; i < 3; i++) {
			System.out.print(string.substring(string.length() - 2));
		}

//		if (string.length()<2) {
//			return "invalid String";
//		}
//		
//		String dummy = "";
//		dummy = string.substring(string.length()-2);
//		
//		return dummy + dummy + dummy;		
	}

}
