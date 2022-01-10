package reviews.review10;

public class Developer extends Employee {

	public Developer(String name, String jobTitle, char gender, int age, double salary) {
		super(name, jobTitle, gender, age, salary);
		
	}
	
	@Override
	public void work() {
		System.out.println(getName()+ " is coding");
	}
	
	public void fixBugs() {
		System.out.println(getName()+" is fixing the bug like men");
	}

	

}
