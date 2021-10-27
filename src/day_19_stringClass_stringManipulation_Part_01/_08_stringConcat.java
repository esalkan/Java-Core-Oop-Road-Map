/**
 * 
 */
package day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class _08_stringConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * concat()
		 * 
		 * --> concat() method combines specified string at the end of this
		 * string. It returns combined string. It is like appending another string.
		 * 
		 * String s1 = "Hello";
		 * String s2 = " World";
		 * String s3 = s1.concat(s2);
		 * 
		 * System.out.println(s3); // Hello World
		 * 
		 * 
		 * concat(String) : Combines specified string at the end of this strring.
		 * it returns combined strings.
		 */

		String word = "Java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in Eclipse"));
		
		System.out.println(word);
		
		word = word.concat("+Eclipse");
		System.out.println(word);
		
		word = word.concat(" Automation");
		System.out.println(word);
		
		// word = word.concat(123); 
		// this will not work concat() just accept string
		
		// This will work
		word = word + 123; 
		System.out.println(word);
		
		word = word + true;
		System.out.println(word);
		
		String word1 = "Hello";
		word1 = word1.concat("-hey").concat("-how are you?").concat("-good");
		System.out.println(word1);
		
	}

}
