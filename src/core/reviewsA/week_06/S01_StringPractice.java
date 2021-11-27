/**
 * 
 */
package core.reviewsA.week_06;

/**
 * @author esalkan
 *
 */
public class S01_StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Java"; // literal
		String str2 = "Java"; // literal
		
		// Java word is used for both str1 and str2
		
		String str3 = new String("Java"); // object creation with new keyword
		String str4 = new String("Java");
		// this way creates 2 objects in the memory
		
		System.out.println(str1==str2); // true
		// == this is checking whether s1 and s2 has same address to same object
		System.out.println(str3 == str4);
		
		System.out.println("--------------------------------------");
		
		// .equals checking whether str3 and str4 have the same content
		System.out.println(str1.equals(str2)); // true
		System.out.println(str3.equals(str4)); // true
		
		System.out.println("--------------------------------------");
		
		String str5 = "java";
		System.out.println(str1.equals(str5)); // false
		System.out.println(str3.equals(str5)); // false
		
		System.out.println("---Ignore Case ---");

		System.out.println(str1.equalsIgnoreCase(str5)); // false
		System.out.println(str3.equalsIgnoreCase(str5)); // false
		
		
	}

}
