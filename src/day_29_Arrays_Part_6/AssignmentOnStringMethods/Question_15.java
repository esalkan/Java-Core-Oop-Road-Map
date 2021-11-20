package day_29_Arrays_Part_6.AssignmentOnStringMethods;

/**
 * @author esalkan
 *
 */
public class Question_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Print true if the string "cat" and "dog" appear the same number of times in
		 * the given string word.
		 * 
		 * Sample Output:
		 * 
		 * input: catdog
		 * 
		 * output: true
		 * 
		 * input: catcat
		 * 
		 * output: false
		 * 
		 * input: cat-cheetah-dog-cat
		 * 
		 * output: false
		 */
		
		String str = "cat-cheetah-dog-cat";
		
		int catCounter = 0;
		int dogCounter = 0 ;
		
		for (int i = 0; i < str.length()-2 ; i++) {
			if (str.substring(i, i+3).equals("cat")) {
				catCounter++;
			} else if (str.substring(i, i+3).equals("dog")) {
				dogCounter++;
			}
			
		}
		
		if (catCounter == dogCounter) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		

	}

}
