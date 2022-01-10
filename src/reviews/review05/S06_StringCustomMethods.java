package reviews.review05;

public class S06_StringCustomMethods {
	
	String str;
	
	public void setStr(String s) {
		if (s.isEmpty()) {
			// isEmpty() returns boolean 
			return ;      // like break from the loop, same logic
		}
		str=s;
	}
	
	
	// takes the string which is assigned to our object and reverse it
	public String reverse() {      // I deleted static key word and turned it into instance method
		
		String reverseResult = "";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			reverseResult += str.charAt(i);
		}
		
		return  reverseResult;
	}
	
	// checks the string which is assigned to our object and returns true or false 
	public boolean isPalindrome() {
		boolean a;
		
		str = str.replace(" ", "");
		
	//	str = str.trim();
		
		String reversed = reverse();
		
		a = reversed.equalsIgnoreCase(str);
		
		return a;
		
	}
	
	
	
	
	
	
	

}
