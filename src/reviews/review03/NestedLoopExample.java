package reviews.review03;



public class NestedLoopExample {

	public static void main(String[] args) {
		
		

		
		for ( int row = 1   ; row <= 3 ; row++ ) {
		
			for ( int column = 1 ; column<=5 ; column++) { // for nested loop
				
				 System.out.print(column+" "); // initialization should be inside the loop
			}
			
			System.out.println("");
			
		}
		
System.out.println("-----------multiplication table-------------");		
		
	  for (int i = 1 ; i<=10 ; i++) {
		  
		  for (int j = 1; j <= 10 ; j++) {
			  
			  System.out.print(i + " X " + j + " = " + (i*j) + "\t|" );
			  
		 }
		  System.out.println("");
		  System.out.println("---------------------------------------------------");
		  
	}


		
	}
	
	
}
