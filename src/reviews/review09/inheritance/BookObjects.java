package reviews.review09.inheritance;

public class BookObjects {

	public static void main(String[] args) {
		
		
		AudioBook audioBook = new AudioBook();
		audioBook.author = "Michiel Obama";
		audioBook.title = "Becoming";
		audioBook.price = 11.75;
		audioBook.narrator = "Random House Audio";
		audioBook.lentgh = 15;
		audioBook.listen();
		
		Ebook ebook = new Ebook();
		ebook.author = "Yahya Kemal Beyatli";
		ebook.title = "Kendi Gokkubbemiz Altinda";
		ebook.readBook();

	}

}
