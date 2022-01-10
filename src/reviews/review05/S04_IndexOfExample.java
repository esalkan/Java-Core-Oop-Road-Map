package reviews.review05;

public class S04_IndexOfExample {

	public static void main(String[] args) {
				
		String message = "Java is Awesome!  Akgkf !!  AA kgfkdls!";
		
		// this method takes a String and returns it's index
		
		int begining = message.indexOf("Awe");
		int ending = message.indexOf("me!")+2;
		
		String word = message.substring(begining,ending);
		
		System.out.println(word);
		
		
	}
}
