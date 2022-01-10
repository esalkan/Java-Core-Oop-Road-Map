package reviews.review10;

public class SupportPersonel extends Employee{

	public SupportPersonel(String name, String jobTitle, char gender, int age, double salary) {
		
		super(name, jobTitle, gender, age, salary);
		
	}
	
	@Override
	public void work() {
		System.out.println(getName()+ " is supporting everbody with their HARD work");
	}

}
