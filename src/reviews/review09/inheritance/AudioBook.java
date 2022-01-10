package reviews.review09.inheritance;

public class AudioBook extends Book {

	int lentgh;
	String narrator;
	
	public void listen() {
		System.out.println("Listening to AudioBook");
		System.out.println("title of the book : "+ title);
		System.out.println("author : "+author);
		System.out.println("price : "+ price);
		System.out.println("Narrator : "+narrator);
		System.out.println("Length of the book : "+ lentgh);
	}
}
