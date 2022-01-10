
package reviews.review03;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		// factorial question I.Q.
		// !5 = 5 * 4 * 3 * 2 * 1 
		// factorial = 120 
		
		int number = 5 ;  // initialization--starting point for my loop
		
		int factorial = 1 ;
		
		while(number > 1) {    // condition 
			factorial *= number; // shorthand operator for multiplication
			System.out.print("number = " + number + " : " );
			System.out.println("factorial = " + factorial);
		    number--;  // iteration
		}
		
		
		
		System.out.println("------DO WHILE -------");
		
		int numberOne = 10 ;
		int numberTwo = 300;
		
		int total = 0;
		
		do {
			
			total += numberOne + numberTwo ; // += shorthand operator 
		
			// total = total + numberOne + numberTwo
			
		}while (total < 1000); // total is my condition variable
		
		System.out.println(total);
		
		
		
	}
	
	
}
