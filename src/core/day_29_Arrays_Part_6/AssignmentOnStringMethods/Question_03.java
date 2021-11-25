package core.day_29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @author esalkan
 *
 */
public class Question_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * You have a word, do the following:
		 * 
		 * 1. When word has odd number of characters and:
		 * 
		 * - 3 or more characters, print middle letter
		 * 
		 * oak ==> a
		 * 
		 * javav ==> v
		 * 
		 * - Single character, print that character 3 times
		 * 
		 * # ==> ###
		 * 
		 * q ==> qqq
		 * 
		 * 
		 * 2. When word has even number of characters and:
		 * 
		 * - 4 or more characters, print middle 2
		 * 
		 * java ==> av
		 * 
		 * apples ==> pl
		 * 
		 * #$%^&* ==> %^
		 *
		 * - 2 characters, print those 2 characters twice
		 * 
		 * @@ ==>@@@@
		 * 
		 * $ ==> $$
		 * 
		 * hi ==> hihi
		 */

		String[] words = { "oak", "javav", "#", "q", "java", "apples", "#$%^&*", "@@", "hi" };
		int wordsLen = words.length;

		for (int i = 0; i < words.length; i++) {
			String str = words[i];

			int strLen = words[i].length();

			// Find middle one in all conditions
			int remain = (strLen - 1);
			int from = remain / 2;
			int to = from + 1;

			// Find middle two in all conditions
			int remain2 = (strLen - 2);
			int from2 = remain2 / 2;
			int to2 = from2 + 2;

			if (str.length() % 2 == 1 && str.length() >= 3) {
				// Printing middle one
				System.out.println(str.substring(from, to));
			} else if (str.length() == 1) {
				// printing 3 times
				for (int j = 0; j < 3; j++) {
					System.out.print(str);
				}
				System.out.println();
			} else if (str.length() % 2 == 0 && str.length() >= 4) {
				// Printing middle two
				System.out.println(str.substring(from2, to2));
			} else if (str.length() == 2) {
				// Printing 2 times
				for (int k = 0; k < 2; k++) {
					System.out.print(str);
				}
				System.out.println();
			}
		}

	}

}
