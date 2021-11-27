package core.day_07_controlFlowStatements_if_ifElse_Part_1;

/**
 * @author esalkan
 *
 */
public class _01_ifStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int score = 80;

		if (score != 70) {
			System.out.println("Excellent!");
			System.out.println("You passed with Grade : A");
		}

		System.out.println("\n+---------------------o---------------------+\n");

		int sales, bonus;
		double commisionRate, salary;

		sales = 6000;
		salary = 10000;

		// We set the limit here
		if (sales > 5000) {
			bonus = 500;
			commisionRate = 1.12;

			salary = salary * commisionRate * bonus;

		}

		System.out.println("Salary : " + salary);
	}

}
