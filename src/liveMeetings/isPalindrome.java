/**
 * 
 */
package liveMeetings;

/**
 * @author esalkan
 *
 */
public class isPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "radr";

		String revRes = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revRes += str.charAt(i);
		}

		if (revRes.equalsIgnoreCase(str)) {
			System.out.println("Yes word is palindrome");
		} else {
			System.out.println("No word is not palindrome");
		}
	}

}
