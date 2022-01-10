package reviews.review13;

public class TypesOfExceptions {

	public static void main(String[] args) throws InterruptedException {
		
	// compile time error
	// 	System.out.println()  no semi-column it does NOT even compile
	
		// runtime errors: only way handling runtime error is writing good code
//	int i=0;
//	while(true) {
//		System.out.println(i++);
//	}
		
		// Checked exception example
		System.out.println("About to sleep for 5 seconds");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("About to sleep more 5 seconds");
		
		Thread.sleep(5000);
		
		// unchecked exception
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(10/2);
		
	}

}
