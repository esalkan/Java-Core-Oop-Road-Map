/**
 * 
 */
package core.JC20_stringClass_stringManipulation_Part_02;

/**
 * @author esalkan
 *
 */
public class JC07_stringEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * equals()
		 * 
		 * -> equals() method compares the two given string based on the content of the
		 * string.
		 * 
		 * If any character is not matched, it returns false. If all characters are
		 * matched, it returns true.
		 */

		String s1 = "Welcome to java";
		String s2 = "Welcome to java";
		String s3 = "Welcome to C++";

		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);

		System.out.println(b1 + " | " + b2);

		boolean b3 = s1 == s2;
		boolean b4 = s1 == s3;

		System.out.println(b3 + " | " + b4);

		String s4 = new String("Wellcome to java");
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
	}

}
