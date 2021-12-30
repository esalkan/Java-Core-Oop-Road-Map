package core.reviews.week_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _11_salaryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_10_salary shevki = new _10_salary();
		shevki.setInfo(70, 45, 0.19);

		System.out.println(shevki.salaryAfterTax());

		_10_salary hande = new _10_salary();
		hande.setInfo(100, 35, 0.15);
		System.out.println(hande.salaryAfterTax());
	}

}
