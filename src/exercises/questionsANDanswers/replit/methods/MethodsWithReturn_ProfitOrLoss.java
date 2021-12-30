package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithReturn_ProfitOrLoss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed

		/**
		 * Finish the profits method which accepts the buyPrice(int) and sellPrice(int)
		 * and determines if there was a profit or loss.
		 * 
		 * It returns a string value that can be "profit","loss","no loss"
		 * 
		 * Example
		 * 
		 * profits(100,1500)
		 * 
		 * returns: "profit"
		 * 
		 * profits(20,5)
		 * 
		 * returns: "loss"
		 * 
		 * profits(100,100)
		 * 
		 * returns: "no loss"
		 */

		Scanner in = new Scanner(System.in);
		System.out.println(profits(in.nextInt(), in.nextInt()));

		profits(in.nextInt(), in.nextInt());
	}

	public static String profits(int buyPrice, int sellPrice) {
		// your code here
		if (buyPrice < sellPrice) {
			return "profit";
		} else if (buyPrice > sellPrice) {
			return "loss";
		} else {
			return "no loss";
		}
	}

}
