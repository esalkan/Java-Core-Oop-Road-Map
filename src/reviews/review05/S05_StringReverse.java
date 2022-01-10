package reviews.review05;

public class S05_StringReverse {

	public static void main(String[] args) {
		
		String name = "JAVA";
					 //0123
		
		// creating a dummy string is best practice
		System.out.println("-----simple reverse------");
		String reverse = "";
		
		reverse += name.charAt(3); // name.length()-1
		reverse += name.charAt(2);
		reverse += name.charAt(1); // += shorthand operator 
		reverse += name.charAt(0); // reverse = reverse + name.charAt(0);
		
		System.out.println(reverse);
		
		System.out.println("------with for loop reverse------");
		String str = "Java Programming Is Awesome Language";
		String reverseResult = "";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reverseResult += str.charAt(i);
		}
		
		System.out.println(reverseResult);
	
		
		System.out.println("-----reverse with method--------");
		
		String word = "Oscar";
		System.out.println(reverseOrg(word));
		
		System.out.println("---------reversed with custom class method-----");
	//	String reversedFromClassMethod = S06_StringCustomMethods.reverse(str);
	//	System.out.println(reversedFromClassMethod);
		
		
	}
	
	public static String reverseOrg(String str) {
		
		String reverseResult = "";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reverseResult += str.charAt(i);
		}
		
		return  reverseResult;
	}
	
}
