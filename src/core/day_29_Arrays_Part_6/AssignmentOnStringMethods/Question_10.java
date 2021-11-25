package core.day_29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @author esalkan
 *
 */
public class Question_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Question-10
		 * 
		 * Write a program that will print out information about the user based on
		 * email. Print first and last name from the upper case.
		 * 
		 * Sample Output:
		 * 
		 * Input:
		 * 
		 * craig_federighi@apple.com
		 * 
		 * Output:
		 * 
		 * First name: Craig
		 * 
		 * Last name: Federighi
		 * 
		 * Domain: apple
		 * 
		 * Top-Level Domain: com
		 */

		String[] emails = { "es_alkan@gmail.com", "craig_frederighi@gmail.com", "jhon_doe@apple.com" };

		for (String email : emails) {
			int us = email.indexOf("_");
			int at = email.indexOf("@");
			int comp = email.indexOf(".");

			String firstName = email.substring(0, us);
			String fn = firstName.substring(0, 1).toUpperCase();
			firstName = fn + firstName.substring(1);

			String lastName = email.substring(us + 1, at);
			String ln = lastName.substring(0, 1).toUpperCase();
			lastName = ln + lastName.substring(1);

			String domain = email.substring(at + 1, comp);

			System.out.println("Email is : " + email);
			System.out.println("First name: " + firstName);
			System.out.println("Last name: " + lastName);
			System.out.println("Domain: " + domain);
			System.out.println("Top-Level Domain: " + email.substring(comp + 1));
			System.out.println();
		}
	}

}
