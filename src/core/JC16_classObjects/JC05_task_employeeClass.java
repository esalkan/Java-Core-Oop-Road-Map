package core.JC16_classObjects;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_task_employeeClass {
	
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
