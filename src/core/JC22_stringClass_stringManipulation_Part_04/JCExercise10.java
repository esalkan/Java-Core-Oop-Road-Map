package core.JC22_stringClass_stringManipulation_Part_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JCExercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Given a string, return true if the first 2 chars in the string also appear at
		 * the end of the string, such as with "edited".
		 * 
		 * frontAgain("edited") → true frontAgain("edit") → false frontAgain("ed") →
		 * true
		 */

		System.out.println(frontAgain("ed"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("edited"));
	}

	private static boolean frontAgain(String string) {

		String first2 = string.substring(0, 2);
		String last2 = string.substring(string.length() - 2);
		boolean result = first2.equals(last2);
		return result;
	}

}
