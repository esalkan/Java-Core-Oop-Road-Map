package oop.day_37_Inheritance;

/**
 * @author esalkan
 *
 */
public class _03_Employee extends _01_Person {
	
	String jobTitle;
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);
	}
	
	@Override
	public String toString() {
		return "Employee [jobTitle=" +  jobTitle + " , name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
