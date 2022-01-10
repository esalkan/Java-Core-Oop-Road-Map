package reviews.review13.customExceptions;

public class CustomExceptionTest {

	public static void main(String[] args) {
		
	int minutes = 50;
	
	System.out.println("Class is going on for "+ minutes+" minutes");
	
	if(minutes > 45) {
		throw new BreakTimeException("It is break time Hocam");
	}
	
	System.out.println("Let's continue the class another "+(45-minutes)
			+" minutes");
	
	

	}

}
