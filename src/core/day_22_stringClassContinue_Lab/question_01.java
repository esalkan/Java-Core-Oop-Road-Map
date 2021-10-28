/**
 * 
 */
package core.day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Create a method that accepts 1 string, e.g. "Bob", return a greeting of the
		 * form "Hello Bob!".
		 * 
		 * helloName("Bob") → "Hello Bob!"
		 * 
		 * helloName("Alice") → "Hello Alice!"
		 * 
		 * helloName("X") → "Hello X!"
		 */

		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));

	}

	public static String helloName(String name) {
		String greeting = "Hello ";
		String result = greeting.concat(name).concat("!");
		return result;
	}

//	public static String helloName(String str) {
//		return "Hello ".concat(str).concat("!");
//	}

}
