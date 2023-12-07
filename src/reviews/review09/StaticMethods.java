package reviews.review09;

public class StaticMethods {

	int num = 10; // instance variable
	
	static int count = 5; // static variable
	
	public static void displayMessage(String message) {
		int num2 = 8;  // this is local variable
		System.out.println("message : "+message);
		// System.out.println(num); can not call instance variable
		System.out.println("Count : "+ count);
	}
	
	public static void anotherStaticMethod() {
		System.out.println("I created this method to call another static method");
		displayMessage("Java is hanging on, did not give up yet");
	}
	
	
	public void instanceMethod() {
		System.out.println("instanceMethod");
		System.out.println("num : "+ num);
	// 	System.out.println("num2 : "+ num2); num2 is local to another method
		System.out.println("count : "+ count );
		
	}
	

}
