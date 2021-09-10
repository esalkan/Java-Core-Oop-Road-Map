package core.day_04_arithmethicOperators;

/**
 * @author esalkan
 *
 */
public class _05_contribution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * This program calculates the amount of pay that will be contributed to a
		 * retirement plan if 5%, 8% or 10% of monthly pay is withheld
		 * 
		 * Variables to hold the monthly pay and the amount of the contribution
		 * 
		 */
		int paymentAmount;
		double percentage5, percentage8, percentage10;

		paymentAmount = 6000;
		percentage5 = paymentAmount * 0.05;
		percentage8 = paymentAmount * 0.08;
		percentage10 = paymentAmount * 0.10;

		// Display Monthly Payment
		System.out.println("Monthly Pay : $" + paymentAmount);

		// Calculate and display 5% contribution
		System.out.println("Retirement plan 5% : " + percentage5 + " per month.");

		// Calculate and display 8% contribution
		System.out.println("Retirement plan 8% : " + percentage8 + " per month.");

		// Calculate and display 10% contribution
		System.out.println("Retirement plan 10% :" + percentage10 + " per month.");
	}

}
