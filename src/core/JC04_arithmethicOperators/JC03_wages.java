package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_wages {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Example Question and Anser - Örnek Soru ve Cevap

		double regularWage;			// To calculate regular wage 0,00
									// Normal ücret hesaplamak için 0,00
		double basePay = 25;		// The base Pay
									// Temel Ödeme
		double regularHours = 40; 	// The hours worked less overtime
									// Çalışma saatleri için, fazla mesai hariç
		double overTimeWages; 		// Overtime Wages
									// Fazla Mesai Ücretleri
		double overTimePay = 37.5; 	// Overtime Pay Rate
									// Fazla Mesai Ücreti
		double overTimeHours = 10;
		double totalWage; 			// Total Wage
									// Toplam Ücret

		regularWage = basePay * regularHours; // Calculate the regular wage
		  									  // Normal ücreti hesapla

		overTimeWages = overTimePay * overTimeHours; // Calculate overtime wages
											 		 // Fazla mesai ücretini hesapla

		totalWage = regularWage + overTimeWages; 	// Calculate total wage
													 // Toplam ücreti hesapla

		System.out.println("Wages for this week are $ " + totalWage); // Print the results
																	   // Sonuçları yazdır
	}
}
