package reviews.review05;

public class S02_StringPractice {

	public static void main(String[] args) {
		
		String str = "SDET";
		
		str.concat(" School");
		
		System.out.println(str);
		
		String strNew = str.concat(" School");
		System.out.println(str);     // SDET
		System.out.println("strNew : "+ strNew);  // SDET School
		
		str = strNew; // what happens to "SDET" object ? --> Garbage collector picks it up
		// str reference variable points to new object "SDET School"
		
		System.out.println("str : "+ str);
		
		
		System.out.println("----------------------");
		
		String str2 = "EU7 Batch Java Course"; // it is created in the string pool memory
		
		str2.toUpperCase();
		
		System.out.println("str2 : "+ str2);
		
		str2 = str2.toUpperCase();
		
		System.out.println("str2 after assigned : "+ str2);
		
		
		
		
		
	}
	
}
