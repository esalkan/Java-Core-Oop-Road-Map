package core.JC29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a string word, if the first or last chars are 'x' or 'X', print the
		 * string without those 'x' or 'X' chars, otherwise print the string unchanged.
		 * 
		 * Sample output:
		 * 
		 * input: xHiX
		 * 
		 * output: Hi
		 * 
		 * input: apple
		 * 
		 * output: apple
		 * 
		 * input: xUxL
		 * 
		 * output: UxL
		 * 
		 * input: JavaX
		 * 
		 * output: Java
		 */

		String[] words = { "xHiX", "apple", "xUxL", "JavaX" };

		for (String word : words) {
			if (word.startsWith("x") && word.endsWith("X")) {
				System.out.println(word.substring(1, word.length() - 1));
			} else if (word.startsWith("x") || word.startsWith("X")) {
				System.out.println(word.substring(1, word.length()));
			} else if (word.endsWith("x") || word.endsWith("X")) {
				System.out.println(word.substring(0, word.length() - 1));
			} else {
				System.out.println(word);
			}

		}
	}

}
