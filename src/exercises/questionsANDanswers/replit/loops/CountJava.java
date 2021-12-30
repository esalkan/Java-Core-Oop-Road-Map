package exercises.questionsANDanswers.replit.loops;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class CountJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Print the number of times that the string "java" appears anywhere in the
		 * given string word
		 * 
		 * Example:
		 * 
		 * input: javaxjava
		 * 
		 * output: 2
		 * 
		 * input: javaxjava
		 * 
		 * output: 2
		 * 
		 * Example:
		 * 
		 * input: javaxjavaapplepearjavaegg
		 * 
		 * output: 3
		 */

		String input = "javaxjava";

		int countOfJava = 0;
		int lastIndex = 0;

		while (lastIndex != -1) {
			lastIndex = input.indexOf("java", lastIndex);

			if (lastIndex != -1) {
				countOfJava++;
				lastIndex += "java".length();
			}
		}

		System.out.println(countOfJava);
	}

}
