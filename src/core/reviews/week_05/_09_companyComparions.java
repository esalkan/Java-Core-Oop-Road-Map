package core.reviews.week_05;

/**
 * @author esalkan
 */
public class _09_companyComparions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_08_scrumTeam company1 = new _08_scrumTeam();
		company1.companyName = "Apple";
		company1.developers = 1000;
		company1.testers = 100;
		company1.developerSalary = 200_000;
		company1.testerSalary = 120_000;
		company1.companyRevenue = 10_000_000_000d;

		System.out.println(company1.companyName + " Company spent " + company1.costOfTheTeam()
				+ " dollars on the team this year. And their return of Investment is " + company1.returnOfInvestment());

		_08_scrumTeam company2 = new _08_scrumTeam();

		company2.createCompany("IBM", 250, 50);

		System.out.println(company2.companyName);
	}

}
