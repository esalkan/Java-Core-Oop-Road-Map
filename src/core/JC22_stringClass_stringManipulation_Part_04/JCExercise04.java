package core.JC22_stringClass_stringManipulation_Part_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JCExercise04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Given a string, return the string made of its first two chars, so the String
		 * "Hello" yields "He". If the string is shorter than length 2, return whatever
		 * there is, so "X" yields "X", and the empty string "" yields the empty string
		 * "".
		 * 
		 * firstTwo("Hello") → "He" firstTwo("abcdefg") → "ab" firstTwo("ab") → "ab"
		 */

		firstTwo("Hello");
		System.out.println();
		firstTwo("abcdefg");
		System.out.println();
		firstTwo("ab");
		System.out.println();
		firstTwo("");
		System.out.println();
		firstTwo("Hop");
		System.out.println();
		firstTwo("Hey");
		System.out.println();
		firstTwo("What");
		System.out.println();
		firstTwo("0");
	}

	private static void firstTwo(String string) {
		for (int i = 0; i < 2; i++) {
			if (string.length() < 2) {
				System.out.print(string);
				break;
			} else {
				System.out.print(string.charAt(i));
			}
		}

//		if (string.length()<2) {
//			return string;
//		} else if (string.isEmpty()) {
//			return "";
//		} else {
//			return string.substring(0,2);
//		}
	}
}
