package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_contribution {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * This program calculates the amount of pay that will be contributed to a
		 * retirement plan if 5%, 8% or 10% of monthly pay is withheld
		 * Variables to hold the monthly pay and the amount of the contribution
		 *
		 * Bu program, aylık ücretin %5, %8 veya %10'unun kesintiye uğraması durumunda emeklilik planına yapılacak
		 * katkı payını hesaplar.
		 *
		 */
		int paymentAmount;
		double percentage5, percentage8, percentage10;

		paymentAmount = 6000;
		percentage5 = paymentAmount * 0.05;
		percentage8 = paymentAmount * 0.08;
		percentage10 = paymentAmount * 0.10;

		// Display Monthly Payment
		// Aylık Ödemeyi yazdır
		System.out.println("Monthly Pay : ₺" + paymentAmount);

		// Calculate and display 5% contribution
		// %5 katkıyı hesapla ve göster
		System.out.println("Retirement plan 5% : " + percentage5 + " per month.");

		// Calculate and display 8% contribution
		// %8 katkıyı hesapla ve göster.
		System.out.println("Retirement plan 8% : " + percentage8 + " per month.");

		// Calculate and display 10% contribution
		// %10 katkıyı hesapla ve göster.
		System.out.println("Retirement plan 10% :" + percentage10 + " per month.");
	}
}
