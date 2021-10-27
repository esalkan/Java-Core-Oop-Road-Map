/**
 * 
 */
package day_22_stringClassContinue_Lab;

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

		helloName("Bob");
		helloName("Alice");
		helloName("X");
	}
	
	public static void helloName(String name) {
		String greeting = "Hello ";
		System.out.println(greeting.concat(name).concat("!")); 
	}

}
