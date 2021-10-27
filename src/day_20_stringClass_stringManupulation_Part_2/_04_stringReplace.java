/**
 * 
 */
package day_20_stringClass_stringManupulation_Part_2;

/**
 * @author esalkan
 *
 */
public class _04_stringReplace {

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
