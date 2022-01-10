package reviews.review05;

public class S01_StringPractice {
public static void main(String[] args) {
	
	String str1 = "Java"; // literal
	String str2 = "Java"; // literal
	// Java word is used for both str1 and str2
	
	String str3 = new String("Java"); // object creation with new keyword
	String str4 = new String("Java");
	// this way creates 2 objects in the memory
	
	
	System.out.println(str1 == str2); // true
	//  == this checking whether str1 and str2 has same address to same object
	System.out.println(str3 == str4); // false
	
	System.out.println("----------------------------");

	System.out.println(str1.equals(str2)); // true
	System.out.println(str3.equals(str4)); // true
	// .equals checking whether str3 and str4 have the same content
 	
	System.out.println("-------------------------");
	String str5 = "java";
	
	System.out.println(str1.equals(str5)); // false
	System.out.println(str3.equals(str5)); // false
	
	System.out.println("----ignore case------");
	System.out.println(str1.equalsIgnoreCase(str5)); // true
	System.out.println(str3.equalsIgnoreCase(str5)); // true
	
}
}
