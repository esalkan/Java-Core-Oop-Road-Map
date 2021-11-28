package core.reviews.week_08;

public class Employee {

	public String name, jobTitle;
	public int ID;
	public double salary; // instance

	public static String companyName = "Microsoft"; // static variable, same copy for all my objects

	public Employee(String name, String jobTitle, int iD, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		ID = iD;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + ID + ", salary=" + salary + "]";
	}

}
