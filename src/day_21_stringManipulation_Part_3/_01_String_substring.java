/**
 * 
 */
package day_21_stringManipulation_Part_3;

/**
 * @author esalkan
 *
 */
public class _01_String_substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * substring(beginIndex) Method
		 * 
		 * substring() method returns string’s substring that begins with the character
		 * at the specified beginIndex and extends to the end of the string.
		 * 
		 */
		
		String str = "Java String Manipulation is Fun!";
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(5, 11));
		System.out.println(str.length());
		System.out.println(str.substring(5, str.length()-5));
		
		System.out.println();
		
		String chars = "{{}}";
		String word = "Automation";
		
		String result = chars.substring(0,2) + word + chars.substring(2);
		System.out.println(result);
		
		System.out.println("\ntoLowerCase() ");
		System.out.println(word.toLowerCase());
	}

}
