package exercises.questionsANDanswers.replit.methods;

/**
 * @author esalkan
 */
public class SimplePrintPattern {

	/**
	 * @param args
	 */
	
	
	  public static void printHollowRect(){
		   
		    for(int i = 1; i <= 5; i++){
		      for(int j = 1; j <= 5; j++){
		        if (i == 1 || i == 5 || j == 1 || j == 5) {
		          System.out.print("*");
		        } else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
		  }
		  
		  
		  
		  
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// Create a method printHollowRect that prints a 5 by 5 hollow rectangle:

		// *****
		// *   *
		// *   *
		// *   *
		// *****
		// hint: you will need to use two nested for loops, and check if its the last or
		// first iteration of the loop (so you will know whet to print "*" or " ")
		
		printHollowRect();
	}

}
