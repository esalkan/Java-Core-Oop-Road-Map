package core.day_29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @author esalkan
 *
 */
public class Question_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Write a program that will print out the first half of the word twice.
		 * 
		 * Sample Output:
		 * 
		 * input: java output: jaja
		 */

		String str = "java";

		int strHalf = str.length() / 2;

		String temp = "";

		for (int i = 0; i < strHalf; i++) {
			temp += str.charAt(i);
		}

		for (int i = 0; i < 2; i++) {
			System.out.print(temp);
		}

	}

}
