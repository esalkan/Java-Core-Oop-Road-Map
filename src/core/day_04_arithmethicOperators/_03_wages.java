package core.day_04_arithmethicOperators;

/**
 * @author esalkan
 *
 */
public class _03_wages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double regularWage; // The calculate regular wage 0,00
		double basePay = 25; // The base Pay
		double regularHours = 40; // The hours worked less overtime
		double overTimeWages; // Overtime Wages
		double overTimePay = 37.5; // Overtime Pay Rate
		double overTimeHours = 10;
		double totalWage; // Total Wage

		regularWage = basePay * regularHours;
		overTimeWages = overTimePay * overTimeHours;

		totalWage = regularWage + overTimeWages;
		System.out.println("Wages for this week are $ " + totalWage);
	}

}
