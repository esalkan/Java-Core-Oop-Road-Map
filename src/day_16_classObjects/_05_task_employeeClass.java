package day_16_classObjects;

/**
 * @author esalkan
 */
public class _05_task_employeeClass {
	String name;
	String jobTitle;
	double salary;

	public void work() {
		System.out.println(name + " is working hard...");
	}

	public void attendMeeting() {
		System.out.println(name + " is attending a meeting...");
	}

	public void introduce() {
		System.out.println("Name:" + name + "Job title:" + jobTitle + "Salary:" + salary);
	}
}
