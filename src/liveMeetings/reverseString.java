/**
 * 
 */
package liveMeetings;

/**
 * @author esalkan
 *
 */
public class reverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "I like coding";
		
		int wLen = word.length()-1;
		
		for (int i = wLen; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}          
	}

}
