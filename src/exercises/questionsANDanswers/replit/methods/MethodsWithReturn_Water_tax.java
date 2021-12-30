package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class MethodsWithReturn_Water_tax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * The waterTax method calculates a water bill. The method takes a double and
		 * returns a double.
		 * 
		 * The more water you use the more it will cost you
		 * 
		 * Cost under 50: bill = units * 0.60; bill = units * 0.60;
		 * 
		 * Cost above 50: bill = units * 0.90; bill = units * 0.90;
		 * 
		 * Cost above 100 the calculation is same as above 50 but an additional 50 fine
		 * 
		 * Cost above 150 its the same as above 50 but an additional 100 fine
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		// System.out.println(waterTax(in.nextDouble()));
		
		System.out.println("Enter Used Water Units :");
		double units = in.nextDouble();
		System.out.println(waterTax(units));
	}

	public static double waterTax(double units) {
		double bill = 0.0;

		// your code here
		if(units <= 50){
		      bill = units * 0.60;
		      return bill;
		    } else if(units > 50 & units < 100 ){
		      bill = units * 0.90;
		      return bill;
		    } else if(units > 100 & units < 150) {
		      bill = (units * 0.90) + 50;
		      return bill;
		    } else if(units > 150){
		      bill = (units * 0.90) + 100;
				return bill;
			}
		// end your code here

		return bill;
	}// end waterTax

}
