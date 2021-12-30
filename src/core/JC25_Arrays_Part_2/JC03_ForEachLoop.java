package core.JC25_Arrays_Part_2;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_ForEachLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * the for-each loop is used to access each successive value in a collection of
		 * values. The main usage of for-each is iterating over collection classes or
		 * arrays.
		 */

		/**
		 * Syntax
		 * 
		 * for (dataType elementVariable : array) { // Statement }
		 * 
		 */

		int[] numbers = { 3, 6, 9 };

		for (int i : numbers) {
			System.out.println(i);
		}
	}

}
