package reviews.review04;

public class CompanyComparions {

	public static void main(String[] args) {
		ScrumTeam company1 = new ScrumTeam();
		company1.companyName = "Apple";
		company1.developers = 1000;
		company1.testers = 100;
		company1.developerSalary = 200_000;
		company1.testerSalary = 120_000;
		company1.companyRevenue = 10_000_000_000d;
		
		System.out.println(company1.companyName+ " Company spent "
		+ company1.costOfTheTeam()+" dollars on the team this year. And their return of Investment is "
		+ company1.returnOfInvestment());
	
		
		ScrumTeam company2 = new ScrumTeam();
		
		company2.createCompany("IBM", 250, 50);
		
		System.out.println(company2.companyName);
		
		
	}
	
	
	
	
	
}
