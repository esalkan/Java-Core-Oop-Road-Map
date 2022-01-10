package reviews.review09.inheritance;

public class Ebook extends Book {
	
	int size; // MB 
	int pages;
	String format; // mobi, epub
	
	public void readBook() {
		System.out.println("Reading book: ");
		System.out.println("Title : "+title);
		System.out.println("Author : "+ author);
		System.out.println("Size : "+size);
		System.out.println("Pages : "+pages);
		
		
	}
	
	
}
