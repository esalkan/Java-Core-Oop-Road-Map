package core.JC22_stringClass_stringManipulation_Part_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JCExercise09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Given a string, return a "rotated right 2" version where the last 2 chars are
		 * moved to the start. The string length will be at least 2.
		 * 
		 * right2("Hello") → "loHel" right2("java") → "vaja" right2("Hi") → "Hi"
		 */

		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));

	}

	public static String right2(String string) {
		String result = string.substring(string.length() - 2).concat(string.substring(0, string.length() - 2));
		return result;

	}

}
