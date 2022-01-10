package reviews.review05;

public class S08_CustomStringMethodsStaticWay {

	public static void main(String[] args) {
	
		String s = "aabcccd";
		System.out.println("----frequency-----");
		System.out.println("Frequency of my character: " + frequency(s,'e'));
		System.out.println("-----unique------");
		System.out.println("Unique characters in my string is: "+ uniqueCharacters(s));
		
		System.out.println("----duplicate-----");
		System.out.println("Removing duplicate chars : "+ removeDuplicate(s));
		
		System.out.println("-----------frequency of chars-----");
		System.out.println("this is the list : "+ frequencyOfChars(s));
		
	}

	public static int frequency(String string, char c) {  // our base methods for coming tasks
		
		int count = 0;  // dummy variable that holds my counter
		// algorithm
		// first check if the string contains or not: return error
		// iterate throughout the whole string and check how many that char is in there
		// we get each char with charAt(i) method
//		if (!string.contains(""+c)) {
//			count = -1;
//			return count;
//		}

		for (int i =0; i<string.length(); i++) {
				
				if(string.charAt(i) == c) {
					count++;
				}
			}
		
		return count;
	}
	

	public static String uniqueCharacters(String str) {
		String result = ""; // creating a dummy result value to hold my result object
		
		for (int i = 0; i < str.length() ; i++ ) {
			
			// aabcccd
			
			char c = str.charAt(i); // a
			if(frequency(str, c)==1) {
				result += c;
			}
		}
		
		return result;
	}
	
	public static String removeDuplicate(String str) {
		String result = ""; // creating a dummy result value to hold my result object
		
		for (int i = 0; i< str.length(); i++) {
			String each = ""+ str.charAt(i);

	//			if (result.contains(each)) {
	//				continue;
	//			}
			
			if(!result.contains(each)) {
			result += each;
			}
		}
		return result;
	}
	
	
	public static String frequencyOfChars(String str) {
		// Task 4: FrequencyOfChar()  str = "aabcccd"; --- > a:2 | b:1 | c:3 | d:1
		
		// char 'a' ---65    b:66 
		
		// result += ch + " : "+ frequency();
		String result = "";
		for (int i = 0; i < str.length();i++ ) {
			
			char each = str.charAt(i);
		
			if (!result.contains(""+each)) {
				result+=each+" : "+frequency(str,each)+" | ";
			}
		}
		return result.substring(0,result.length()-3);
	}
	
	
	
	
	
	
	
	
}
