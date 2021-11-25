package core.day_29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @author esalkan
 *
 */
public class Question_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * You have 2 words, both of them have 3 characters. If either of them does not
		 * have exactly 3 characters, print "cannot merge" Merge their characters one by
		 * one and print together like below:
		 * 
		 * Sample Output:
		 * 
		 * aok, lol -> alookl
		 * 
		 * ear, pie -> epaire
		 * 
		 * java, wow -> cannot merge
		 * 
		 */

		String str1 = "java";
		String str2 = "wow";
		String merge = "";

		if (str1.length() < 3 || str1.length() > 3 || str2.length() < 3 || str2.length() > 3) {
			System.out.println("Can't merge!");
		} else {
			for (int i = 0; i < str1.length(); i++) {

				for (int j = i; j <= i; j++) {

					merge += str1.charAt(i) + "" + str2.charAt(j);

				}

			}

			System.out.println(merge);

		}

	}

}
