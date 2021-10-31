/**
 * 
 */
package live_reviews.week_06;

/**
 * @author esalkan
 *
 */
public class S03_StringMethodsPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String message = "Java is Awesome!";
		// 0123456789

		// length() : takes String as parameter and returns int
		int count = message.length();
		System.out.println("How many characters I have here : " + count);

		int sum = 4 + message.length();
		System.out.println("sum : " + sum);

		// for iterating through our string object

		// charAt(): takes an index as parameter and returns char

		System.out.println(message.charAt(0)); // J --> first index

		// what is the last index : length()-1
		System.out.println(message.charAt(message.length() - 1));

		// contains() : takes a string, if you want to use one char, you need to turn it
		// into a
		// string (""+char)
		boolean b = message.contains("Java"); // true
		System.out.println(b); // return true
		
		boolean b2 = message.contains("J");
		System.out.println(b2); // return true
		
		if(message.contains("Java")) {
			System.out.println("The message has JAVA");
		} else {
			System.out.println("The message does NOT have the word");
		}
		
		if(b) {
			System.out.println("The message has JAVA");
		} else {
			System.out.println("The message does NOT have the word");
		}
		
		if(b2) {
			System.out.println("The message has J");
		} else {
			System.out.println("The message does NOT have the J");
		}
	}

}
