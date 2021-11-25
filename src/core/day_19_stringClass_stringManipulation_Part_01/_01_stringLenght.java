/**
 * 
 */
package core.day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class _01_stringLenght {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * length() --> length() method returns count of total number of characters in
		 * the string including spaces.
		 * 
		 * --> For an empty string, length is 0.
		 */
		String str = "Java";

		System.out.println(str.length());

		int x = str.length();

		System.out.println(x * 10);

		String str1 = new String("Java");

		System.out.println(str1.length());
	}

}
