package core.JC29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In this task, you need to swap the first name with the last name in the
		 * email. If the email doesn't contain underscore - do not anything.
		 * 
		 * Sample Output:
		 * 
		 * input: mike_tyson@gmail.com
		 * 
		 * output: tyson_mike@gmail.com
		 * 
		 * input: barakobama@gmail.com
		 * 
		 * output: barakobama@gmail.com
		 */

		String[] email = { "mike_tyson@gmail.com", "barakobama@gmail.com" };

		for (String value : email) {
			int where = value.indexOf("_");
			int whereAt = value.indexOf("@");

			String provider = value.substring(whereAt);

			if (value.contains("_")) {
				System.out.println(value.substring(where + 1, whereAt) + "_" + value.substring(0, where) + provider);
			} else if (!value.contains("_")) {
				System.out.println(value);
			}
		}

	}

}
