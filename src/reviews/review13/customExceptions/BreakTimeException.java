package reviews.review13.customExceptions;

public class BreakTimeException extends RuntimeException{
// I am inheriting all the methods of RunTimeException
	
	public BreakTimeException() {
		
	}
	
	public BreakTimeException(String message) {
		super(message); // call super class constructor
	}
	

}
