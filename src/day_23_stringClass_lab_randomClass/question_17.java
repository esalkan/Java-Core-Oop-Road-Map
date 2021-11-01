/**
 * 
 */
package day_23_stringClass_lab_randomClass;

/**
 * @author esalkan
 *
 */
public class question_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a method that accepts a string and returns true if the string is
		 * palindrome.
		 */
		
		String str = "madem";
		String backward = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			backward = backward + str.charAt(i); 
		}
		
		if(str.equals(backward)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		// ekleme yapılacak unutma
		if (str.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
			
	}

}
