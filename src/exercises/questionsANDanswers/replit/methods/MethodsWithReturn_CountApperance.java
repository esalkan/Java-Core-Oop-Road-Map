package exercises.questionsANDanswers.replit.methods;

/**
 * @author esalkan
 *
 */
public class MethodsWithReturn_CountApperance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Create a method that has two parameters of an array of strings and a string
		 * and should returns an int.
		 * 
		 * It counts how many times the given string appears in the array and returns
		 * the count.
		 * 
		 * for example (pseudo code):
		 * 
		 * array = ["a","foo","bar","foo","bla"] string = "foo"
		 * 
		 * countAppearance(array , string ) -> 2
		 */

		// Scanner in = new Scanner(System.in);
		// String[] strs = new String[in.nextInt()];
		// String word = in.next();
		// for (int i = 0; i < strs.length; i++) {
		//		strs[i] = in.next();
		// }

		// System.out.println(countAppearance(strs, word));

		String[] array = { "a", "foo", "bar", "foo", "bla" };

		countApperance(array, "foo");
		System.out.println(countApperance(array, "foo"));

	}

	public static int countApperance(String[] arr, String search) {
		int counter = 0;

		for (String string : arr) {
			if (string.contains(search)) {
				counter++;
			}
		}
		return counter;
	}

}
