package core.JC13_methods_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC13_task_59_payCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// payCalculator(double hours,double hourlyPay)
		payCalculator(80, 20);
		payCalculator(37, 62.50);
	}

	public static void payCalculator(double hours, double hourlyPay) {
		double pay = hours * hourlyPay;
		System.out.println(pay);

	}

}
