package reviews.review04;

public class SalaryTest {

	public static void main(String[] args) {
		
		
		Salary shevki = new Salary();
		shevki.setInfo(70, 45, 0.19);
		
		System.out.println(shevki.salaryAfterTax());
		
		Salary hande = new Salary();
		hande.setInfo(100, 35, 0.15);
		System.out.println(hande.salaryAfterTax());
		
		
	}

}
