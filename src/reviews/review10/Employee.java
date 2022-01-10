package reviews.review10;

public class Employee {
	
	private String name, jobTitle; 
	private final char gender;  // can be set only once with the constructor
	private int age; 
	private double salary;
	
	public Employee(String name, String jobTitle, char gender, int age, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.gender = gender;
		setAge(age);
		setSalary(salary);
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public char getGender() {
		return gender;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<=0) {
			System.err.println("Age can not be negative number");
			return;
		}
		if(age<=18) {
			System.err.println("Employee must be over 18 years old");
			return;
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<=0) {
			return;
		}
		this.salary = salary;
	}
	
	
	public void work() {
		System.out.println(" is working");
	}
	
	
}
