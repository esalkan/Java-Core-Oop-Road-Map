package core.JC23_stringClass_stringManipulation_randomClass;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JCquestion_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Return the number of times that the string "hi" appears anywhere in the given
		 * string.
		 * 
		 * countHi("abc hi ho") → 1
		 * 
		 * countHi("ABChi hi") → 2
		 * 
		 * countHi("hihi") → 2
		 */

		String str = "abc hi hohihi";

		int counter = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				counter++;
			}
		}

		System.out.println(counter);
	}

}
