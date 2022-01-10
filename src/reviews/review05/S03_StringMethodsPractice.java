package reviews.review05;

public class S03_StringMethodsPractice {
	public static void main(String[] args) {
		
		String message = "Java is Awesome!";
					//    0123
		
		// length() : takes String as parameter and returns int
		
		int count = message.length();  // count : 16 ---last char is 15 
		System.out.println("How many characters I have here: "+ count);
		
		int sum = 4 + message.length();
		System.out.println("sum : " + sum);
		
		// for iterating through our string object
		
		
		// charAt(): takes an index as parameter and returns me char
		
		System.out.println(message.charAt(0)); // J --> first index
		
		// what is the last index: length()-1
		System.out.println(message.charAt(message.length()-1));
		
		
		// contains(): takes a string , and return a boolean
		// if you want to use one char, you need to turn it into a 
		// string      (""+char)
		
		boolean b = message.contains("Java"); // true
		
		boolean b2 = message.contains("J"); // true
		
		if (message.contains("Java")) {
			System.out.println("The message has JAVA");
		}else {
			System.out.println("The message does NOT have the word");
		}
		
		if (b2) {
			System.out.println("The message has J");
		}else {
			System.out.println("The message does NOT have");
		}
		
		
		// substring method: this one takes index (begin,end)
		// overloaded substring method which just takes begining index
		System.out.println("-----substring method-----");
		String word = message.substring(0, 4);
		System.out.println(word);
		
	}

}
