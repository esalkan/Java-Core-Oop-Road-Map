package assignments.lab_01;

/**
 * @author esalkan
 */
public class Question_02 {

	/**
	 * QUESTION 2: 
	 * 
	 * The number 6 is a truly great number. Write a method that accepts 
	 * num1 and num2, prints true if either one is 6. 
	 * Or if their sum or difference is 6.
	 * 
	 * love6(6, 4) → true
	 * love6(4, 5) → false
	 * love6(1, 5) → true
	 * love6(12, 6); ->true
	 * 
	 */
	
	public static void main(String[] args) {
		 love6(6, 14); 	// if either one is 6
		 love6(4, 25); 	// if conditions are not met
		 love6(2, 4); 	// if sum of the numbers 
		 love6(13, 7);	// if difference of the numbers 
	}
	
	public static void love6(int num1, int num2) {
		int greatNumber = 6;
		int sum = num1 + num2;
		int diff = num1 - num2;	
		// If either one is 6
		if (num1 == greatNumber || num2 == greatNumber) {
			System.out.println("love6(" + num1 + ", " + num2 + ") → true");
		} 
		// if sum or difference is 6
		else if (sum == greatNumber || diff == greatNumber) {
			System.out.println("love6(" + num1 + ", " + num2 + ") → true");
		} 
		// if conditions are not met
		else {
			System.out.println("love6(" + num1 + ", " + num2 + ") → false");
		}
	}
}