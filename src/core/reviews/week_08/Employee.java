package core.reviews.week_08;

public class Employee {

	String name;
	String jobTitle;
	int id;
	double salary;

	public Employee(String name, String jobTitle, int id, double salary) {
		this.name = name;
		this.id = id;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}

}
