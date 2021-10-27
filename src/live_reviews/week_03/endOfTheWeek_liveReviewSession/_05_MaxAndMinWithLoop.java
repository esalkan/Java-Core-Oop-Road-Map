package live_reviews.week_03.endOfTheWeek_liveReviewSession;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class _05_MaxAndMinWithLoop {

	/**
	 * @param args
	 */
	// You will get n (5) numbers of input from user
		// you print out max and min numbers of those entries
		
		public static void main(String[] args) {
			
			// to get input from user we scanner class
			// create scanner object
			
			Scanner input = new Scanner (System.in);
			System.out.println("Enter a number");
			int first = input.nextInt();
			
			int max = first;
			int min = first;
		
			for(int i = 1 ; i<=4 ; i++) {
				System.out.println("Enter another number");
				int number = input.nextInt();
				if (number>max) {
					max=number;
				}
				if(number<min) {
					min=number;
				}
			}
			System.out.println("Max numer : " + max);
			System.out.println("Min numer : " + min);
		}

}
