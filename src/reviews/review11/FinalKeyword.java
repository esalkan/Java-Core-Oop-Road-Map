package reviews.review11;

public class FinalKeyword {
	
	final String name;
	final int age;
	final static String color ; // can be initialized at the same line or inside Static block
	
	
	public FinalKeyword(String name) {
		this.name = name;
		// this.color = color; Not possible
 	}
	
	{
		this.age = 28;
	}
	
	static {
		color = "black";
	}
	
	public static void main(String[] args) {
		
		final int x; // declare
		x= 10;
		System.out.println(x);
		
	}

}
