/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a string of even length, return the first half. So the string "WooHoo"
		 * yields "Woo". 
		 * 
		 * firstHalf("WooHoo") → "Woo" 
		 * firstHalf("HelloThere") → "Hello"
		 * firstHalf("abcdef") → "abc"
		 */
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		System.out.println(firstHalf("Java & Selenium"));
		System.out.println(firstHalf("Human it is, flows as it is water, curly"));
	}

	public static String firstHalf(String string) {
		int length = string.length()/2;

		// With 'public static void' solution without return
		//	for(int i = 0; i < length; i++) {
		//	System.out.print(string.charAt(i));
		//	}
		String result = string.substring(0,length);
		return result;
	}

}
