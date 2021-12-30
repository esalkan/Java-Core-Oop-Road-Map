/**
 * 
 */
package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class PlusMinus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * Create a method called plus_minus that gets an array of ints (int[]), it
		 * outputs how many negative , positive and zero numbers are in the array.
		 * 
		 * Example:
		 * 
		 * plus_minus (new int[]{1,2,55,-9,-2,0});
		 * 
		 * output: positives:3, negatives:2, zeros:1
		 */
		
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++) {
	      arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);

	}

	public static void plus_minus(int[] arr) {
		int negative = 0;
		int positive = 0;
		int zero = 0;
		for (int i : arr) {
			if (i < 0) {
				negative++;
			} else if (i > 0) {
				positive++;
			} else {
				zero++;
			}
		}
		
		System.out.println("positives:" + positive + ", negatives:" + negative + ", zeros:" + zero);
		
	}

}
