package reviews.review10;

public class Tester extends Employee {

	public Tester(String name, String jobTitle, char gender, int age, double salary) {
		super(name, jobTitle, gender, age, salary);
	}

	@Override
	public void work() {
		System.out.println(getName() + " is testing");
	}
	
	public void findBugs() {
		System.out.println(getName()+" found a bug");
	}
	
	

}
