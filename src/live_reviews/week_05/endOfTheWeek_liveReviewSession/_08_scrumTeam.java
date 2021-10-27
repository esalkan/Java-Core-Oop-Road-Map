package live_reviews.week_05.endOfTheWeek_liveReviewSession;

/**
 * @author esalkan
 */
public class _08_scrumTeam {
	String companyName;
	int developers;
	int testers;
	double developerSalary;
	double testerSalary;
	double companyRevenue;

	public double costOfTheTeam() {
		return developers * developerSalary + testers * testerSalary;
	}

	public double returnOfInvestment() {
		return companyRevenue / costOfTheTeam();
	}

	public void createCompany(String name, int devNums, int tesNums) { // setter method
		companyName = name;
		developers = devNums;
		testers = tesNums;
	}
}
