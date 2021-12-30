package core.JC20_stringClass_stringManipulation_Part_02;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_stringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * replace() Method
		 * 
		 * -> replace() method returns a string replacing all the old char or
		 * CharSequence to new char or CharSequence.
		 * 
		 * -> The original string will remain unchanged.
		 */

		String str = "Moscow is a capital of Russia";

		// str = str.replace("Moscow", "Baku");
		// System.out.println(str);
		// // Output : Baku is a capital of Russia

		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);

		String email = "firstName_LastName@gmail.com";
		String company = "capitalone";

		String newemail = email.replace("gmail", company);

		System.out.println(newemail);
		System.out.println(email);

	}

}
